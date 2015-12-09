// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.event.nrdp.media.AudioTrackChanged;
import com.netflix.mediaclient.event.nrdp.media.BufferRange;
import com.netflix.mediaclient.event.nrdp.media.Buffering;
import com.netflix.mediaclient.event.nrdp.media.Error;
import com.netflix.mediaclient.event.nrdp.media.Exception;
import com.netflix.mediaclient.event.nrdp.media.GenericMediaEvent;
import com.netflix.mediaclient.event.nrdp.media.MediaEvent;
import com.netflix.mediaclient.event.nrdp.media.NccpError;
import com.netflix.mediaclient.event.nrdp.media.NewStream;
import com.netflix.mediaclient.event.nrdp.media.RemoveSubtitle;
import com.netflix.mediaclient.event.nrdp.media.ShowSubtitle;
import com.netflix.mediaclient.event.nrdp.media.Statechanged;
import com.netflix.mediaclient.event.nrdp.media.StreamSelected;
import com.netflix.mediaclient.event.nrdp.media.SubtitleData;
import com.netflix.mediaclient.event.nrdp.media.UpdatePts;
import com.netflix.mediaclient.event.nrdp.media.UpdateVideoBitrate;
import com.netflix.mediaclient.event.nrdp.media.Warning;
import com.netflix.mediaclient.javabridge.Bridge;
import com.netflix.mediaclient.javabridge.NrdProxy;
import com.netflix.mediaclient.javabridge.invoke.SetConfigData;
import com.netflix.mediaclient.javabridge.invoke.android.ChangePlayer;
import com.netflix.mediaclient.javabridge.invoke.android.InitVisualOn;
import com.netflix.mediaclient.javabridge.invoke.android.SetBytesReport;
import com.netflix.mediaclient.javabridge.invoke.android.SetVideoSurface;
import com.netflix.mediaclient.javabridge.invoke.android.SetWifiApsInfo;
import com.netflix.mediaclient.javabridge.invoke.android.SetWifiLinkSpeed;
import com.netflix.mediaclient.javabridge.invoke.media.Close;
import com.netflix.mediaclient.javabridge.invoke.media.Open;
import com.netflix.mediaclient.javabridge.invoke.media.Pause;
import com.netflix.mediaclient.javabridge.invoke.media.Play;
import com.netflix.mediaclient.javabridge.invoke.media.SelectTracks;
import com.netflix.mediaclient.javabridge.invoke.media.SetStreamingBuffer;
import com.netflix.mediaclient.javabridge.invoke.media.SetVideoBitrateRanges;
import com.netflix.mediaclient.javabridge.invoke.media.Stop;
import com.netflix.mediaclient.javabridge.invoke.media.Swim;
import com.netflix.mediaclient.javabridge.invoke.media.Unpause;
import com.netflix.mediaclient.javabridge.ui.IMedia;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.AudioSubtitleDefaultOrderInfo;
import com.netflix.mediaclient.media.PlayerType;
import com.netflix.mediaclient.media.PlayoutMetadata;
import com.netflix.mediaclient.media.Subtitle;
import com.netflix.mediaclient.media.TrickplayUrl;
import com.netflix.mediaclient.media.bitrate.AudioBitrateRange;
import com.netflix.mediaclient.media.bitrate.VideoBitrateRange;
import com.netflix.mediaclient.proxy.nrdp.media.StreamInfo;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.player.NccpAudioSource;
import com.netflix.mediaclient.ui.player.NccpSubtitle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui.android:
//            NativeNrdObject

public class NativeMedia extends NativeNrdObject
    implements IMedia
{

    private static final String NAME_STREAMING = "streaming";
    private static final String TAG = "nf-bridge";
    private static final String TAG1 = "nf-media";
    private AudioSource mAudioTrackList[];
    private AudioSource mCurrentAudioTrack;
    private int mCurrentAudioTrackIndex;
    private Subtitle mCurrentSubtitleTrack;
    private int mCurrentSubtitleTrackIndex;
    private int mCurrentVideoBitrate;
    private StreamInfo mCurrentVideoStream;
    private AudioSubtitleDefaultOrderInfo mDefaultOrderInfo[];
    private int mDisplayAspectRatioX;
    private int mDisplayAspectRatioY;
    private int mDuration;
    private int mFrameX;
    private int mFrameY;
    private int mPosition;
    private int mState;
    private com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleOutputMode mSubtitleOutputMode;
    private com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleProfile mSubtitleProfile;
    private Subtitle mSubtitleTrackList[];
    private StreamInfo mTargetVideoStream;
    private TrickplayUrl mTrickplayUrlList[];

    public NativeMedia(Bridge bridge)
    {
        super(bridge);
    }

    private void calculateVideoSize()
    {
        if (Log.isLoggable("nf-media", 3))
        {
            Log.d("nf-media", (new StringBuilder()).append("handlePropertyUpdate:: displayAspectRatio x: ").append(mDisplayAspectRatioX).append(", y: ").append(mDisplayAspectRatioY).toString());
        }
        Display display = getDisplaySize();
        if (display == null)
        {
            Log.w("nf-media", "Screen size null, use default calculation");
            if (mDisplayAspectRatioY == 0)
            {
                mFrameY = 0;
                mFrameX = 0;
            } else
            {
                mFrameY = 1080;
                mFrameX = (mFrameY * mDisplayAspectRatioX) / mDisplayAspectRatioY;
            }
        } else
        {
            if (Log.isLoggable("nf-media", 3))
            {
                Log.d("nf-media", (new StringBuilder()).append("handlePropertyUpdate:: screen size x: ").append(display.getWidth()).append(", y: ").append(display.getHeight()).toString());
            }
            if (mDisplayAspectRatioY == 0)
            {
                mFrameY = 0;
                mFrameX = 0;
            } else
            {
                mFrameY = display.getHeight();
                mFrameX = (mFrameY * mDisplayAspectRatioX) / mDisplayAspectRatioY;
            }
        }
        if (Log.isLoggable("nf-media", 3))
        {
            Log.d("nf-media", (new StringBuilder()).append("handlePropertyUpdate:: frame x: ").append(mFrameX).append(", y: ").append(mFrameY).toString());
        }
    }

    private AudioSource[] getAudioSources(JSONArray jsonarray)
        throws JSONException
    {
        if (jsonarray != null && jsonarray.length() >= 1) goto _L2; else goto _L1
_L1:
        AudioSource aaudiosource[];
        Log.w("nf-bridge", "Empty audio source list");
        aaudiosource = new AudioSource[0];
_L4:
        return aaudiosource;
_L2:
        AudioSource aaudiosource1[] = new AudioSource[jsonarray.length()];
        int i = 0;
        do
        {
            aaudiosource = aaudiosource1;
            if (i >= aaudiosource1.length)
            {
                continue;
            }
            aaudiosource1[i] = NccpAudioSource.newInstance(jsonarray.getJSONObject(i), i);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private AudioSubtitleDefaultOrderInfo[] getDefaultOrderInfo(JSONArray jsonarray)
    {
        ArrayList arraylist;
        int i;
        if (mAudioTrackList == null || mAudioTrackList.length < 1)
        {
            Log.d("nf-bridge", "Restrictions not found! Audio track list is empty!");
            return new AudioSubtitleDefaultOrderInfo[0];
        }
        if (jsonarray == null || jsonarray.length() < 1)
        {
            Log.d("nf-bridge", "No defaults found!");
            return new AudioSubtitleDefaultOrderInfo[0];
        }
        arraylist = new ArrayList(jsonarray.length());
        i = 0;
_L2:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        AudioSubtitleDefaultOrderInfo audiosubtitledefaultorderinfo = new AudioSubtitleDefaultOrderInfo(jsonarray.getJSONObject(i));
        if (Log.isLoggable("nf-bridge", 3))
        {
            Log.d("nf-bridge", (new StringBuilder()).append("Default found ").append(audiosubtitledefaultorderinfo).toString());
        }
        if (isValid(audiosubtitledefaultorderinfo))
        {
            arraylist.add(audiosubtitledefaultorderinfo);
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
        JSONException jsonexception;
        jsonexception;
        Log.e("nf-bridge", "Failed to parse default ", jsonexception);
          goto _L3
_L1:
        jsonarray = (AudioSubtitleDefaultOrderInfo[])arraylist.toArray(new AudioSubtitleDefaultOrderInfo[arraylist.size()]);
        Arrays.sort(jsonarray);
        return jsonarray;
    }

    private Display getDisplaySize()
    {
        return bridge.getDisplaySize();
    }

    private Subtitle getSubtitle(String s)
    {
        if (mSubtitleTrackList != null) goto _L2; else goto _L1
_L1:
        Subtitle subtitle = null;
_L4:
        return subtitle;
_L2:
        int i = 0;
        do
        {
            if (i >= mSubtitleTrackList.length)
            {
                break;
            }
            Subtitle subtitle1 = mSubtitleTrackList[i];
            if (subtitle1.getId() != null && subtitle1.getId().equals(s))
            {
                subtitle = subtitle1;
                if (Log.isLoggable("nf-bridge", 3))
                {
                    Log.d("nf-bridge", (new StringBuilder()).append("Subtitle found ").append(subtitle1).append(" for id ").append(s).toString());
                    return subtitle1;
                }
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
        Log.e("nf-bridge", (new StringBuilder()).append("Subtitle not found for id ").append(s).toString());
        return null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Subtitle[] getSubtitle(JSONArray jsonarray)
        throws JSONException
    {
        if (jsonarray != null && jsonarray.length() >= 1) goto _L2; else goto _L1
_L1:
        Subtitle asubtitle[];
        Log.w("nf-bridge", "Empty subtitle list");
        asubtitle = new Subtitle[0];
_L4:
        return asubtitle;
_L2:
        Subtitle asubtitle1[] = new Subtitle[jsonarray.length()];
        int i = 0;
        do
        {
            asubtitle = asubtitle1;
            if (i >= asubtitle1.length)
            {
                continue;
            }
            asubtitle1[i] = NccpSubtitle.newInstance(jsonarray.getJSONObject(i), i);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int handleEvent(JSONObject jsonobject)
        throws Exception
    {
        jsonobject = getJSONObject(jsonobject, "data", null);
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        Log.e("nf-bridge", "Media::processUpdate: Data not found!");
_L8:
        return 0;
_L2:
        Object obj = getString(jsonobject, "type", null);
        if (!"Nccp".equalsIgnoreCase(((String) (obj)))) goto _L4; else goto _L3
_L3:
        Log.d("nf-bridge", "Media::processUpdate: NCCP Type!!!");
        jsonobject = NccpError.toNccpError(jsonobject);
        if (jsonobject == null)
        {
            Log.w("nf-bridge", "Uknown event for NCCP type!");
            return 0;
        }
        Log.d("nf-bridge", "Media::processUpdate: Event found NccpError");
_L6:
        if (Log.isLoggable("nf-bridge", 3))
        {
            Log.d("nf-bridge", (new StringBuilder()).append("Passing event to MP ").append(jsonobject).toString());
        }
        if (jsonobject != null && (jsonobject instanceof MediaEvent))
        {
            handleListener(jsonobject.getName(), jsonobject);
        }
        return -1;
_L4:
        if ("background".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: background NCCP error");
            jsonobject = NccpError.toNccpError(jsonobject);
            if (jsonobject == null)
            {
                Log.w("nf-bridge", "Uknown event for background type!");
                return 0;
            }
            Log.d("nf-bridge", "Media::processUpdate: Event found NccpError");
            continue; /* Loop/switch isn't completed */
        }
        if ("audioTrackChanged".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found AudioTrackChanged");
            jsonobject = new AudioTrackChanged(jsonobject);
            mCurrentAudioTrackIndex = ((AudioTrackChanged)jsonobject).getTrackIndex();
            continue; /* Loop/switch isn't completed */
        }
        if ("buffering".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found Buffering");
            jsonobject = new Buffering(jsonobject);
            continue; /* Loop/switch isn't completed */
        }
        if ("bufferrange".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found BufferRange");
            jsonobject = new BufferRange(jsonobject);
            continue; /* Loop/switch isn't completed */
        }
        if ("error".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found Error");
            jsonobject = new Error(jsonobject);
            continue; /* Loop/switch isn't completed */
        }
        if ("exception".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found Exception");
            jsonobject = new Exception(jsonobject);
            continue; /* Loop/switch isn't completed */
        }
        if ("nccperror".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found NccpError");
            jsonobject = NccpError.toNccpError(jsonobject);
            continue; /* Loop/switch isn't completed */
        }
        if ("newStream".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found NewStream, process");
            jsonobject = new NewStream(jsonobject);
            obj = jsonobject.getStreamInfo();
            if (obj == null)
            {
                Log.e("nf-bridge", "Stream is null!");
                return 0;
            }
            if (((StreamInfo) (obj)).getStreamType() == 1)
            {
                Log.d("nf-bridge", "Video stream");
                mCurrentVideoStream = ((StreamInfo) (obj));
            } else
            {
                Log.d("nf-bridge", "Not vdeo stream, ignore");
                return 0;
            }
            continue; /* Loop/switch isn't completed */
        }
        if ("removeSubtitle".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found RemoveSubtitle");
            jsonobject = new RemoveSubtitle(jsonobject);
            continue; /* Loop/switch isn't completed */
        }
        if ("setvideobitraterange".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found SetVideoBitrateRange");
            return -1;
        }
        if ("setvideoresolutionrange".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found SetVideoResolutionRange");
            return -1;
        }
        if ("showSubtitle".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found ShowSubtitle");
            jsonobject = new ShowSubtitle(jsonobject);
            continue; /* Loop/switch isn't completed */
        }
        if ("skip".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found Skip. NOOP");
            return -1;
        }
        if ("statechanged".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found Statechanged");
            jsonobject = new Statechanged(jsonobject);
            continue; /* Loop/switch isn't completed */
        }
        if ("streamSelected".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found StreamSelected");
            jsonobject = new StreamSelected(jsonobject);
            obj = jsonobject.getStreamInfo();
            if (obj == null)
            {
                Log.e("nf-bridge", "Stream is null!");
                return 0;
            }
            if (((StreamInfo) (obj)).getStreamType() == 1)
            {
                Log.d("nf-bridge", "Video stream");
                mTargetVideoStream = ((StreamInfo) (obj));
            } else
            {
                Log.d("nf-bridge", "Not vdeo stream, ignore");
                return 0;
            }
            continue; /* Loop/switch isn't completed */
        }
        if ("subtitledata".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found SubtitleData");
            jsonobject = new SubtitleData(jsonobject);
            continue; /* Loop/switch isn't completed */
        }
        if ("subtitleTrackChanged".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found SubtitleTrackChanged");
            return -1;
        }
        if ("updatePts".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found UpdatePts. Consuming.");
            jsonobject = new UpdatePts(jsonobject);
            mPosition = jsonobject.getPts();
            continue; /* Loop/switch isn't completed */
        }
        if ("updateVideoBitrate".equalsIgnoreCase(((String) (obj))))
        {
            jsonobject = new UpdateVideoBitrate(jsonobject);
            mCurrentVideoBitrate = jsonobject.getBitsPerSecond();
            if (Log.isLoggable("nf-bridge", 3))
            {
                Log.d("nf-bridge", (new StringBuilder()).append("Media::processUpdate: Event found UpdateVideoBitrate ").append(jsonobject.getBitsPerSecond()).toString());
            }
            return -1;
        }
        if ("videoWindowChanged".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found VideoWindowChanged");
            return -1;
        }
        if ("warning".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found Warning");
            jsonobject = new Warning(jsonobject);
            continue; /* Loop/switch isn't completed */
        }
        if ("bufferingComplete".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found bufferingComplete");
            jsonobject = new GenericMediaEvent("bufferingComplete");
            continue; /* Loop/switch isn't completed */
        }
        if ("openComplete".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found openComplete");
            jsonobject = new GenericMediaEvent("openComplete");
            continue; /* Loop/switch isn't completed */
        }
        if ("endOfStream".equalsIgnoreCase(((String) (obj))))
        {
            Log.d("nf-bridge", "Media::processUpdate: Event found endOfStream");
            jsonobject = new GenericMediaEvent("endOfStream");
            continue; /* Loop/switch isn't completed */
        }
        if (!"underflow".equalsIgnoreCase(((String) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
        Log.d("nf-bridge", "Media::processUpdate: Event found underflow");
        jsonobject = new GenericMediaEvent("underflow");
        if (true) goto _L6; else goto _L5
_L5:
        if (!Log.isLoggable("nf-bridge", 3)) goto _L8; else goto _L7
_L7:
        Log.d("nf-bridge", (new StringBuilder()).append("Media::processUpdate: uknown type ").append(((String) (obj))).toString());
        return 0;
    }

    private int handlePropertyUpdate(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = getJSONObject(jsonobject, "properties", null);
        if (jsonobject == null)
        {
            Log.w("nf-bridge", "handlePropertyUpdate:: properties does not exist");
            return 0;
        }
        if (jsonobject.has("currentAudioTrack"))
        {
            mCurrentAudioTrackIndex = getInt(jsonobject, "currentAudioTrack", -1);
            JSONObject jsonobject1;
            if (mAudioTrackList != null && mAudioTrackList.length > mCurrentAudioTrackIndex && mCurrentAudioTrackIndex > -1)
            {
                mCurrentAudioTrack = mAudioTrackList[mCurrentAudioTrackIndex];
            } else
            {
                mCurrentAudioTrack = null;
            }
        }
        if (jsonobject.has("currentSubtitleTrack"))
        {
            mCurrentSubtitleTrackIndex = getInt(jsonobject, "currentSubtitleTrack", -1);
            if (mSubtitleTrackList != null && mSubtitleTrackList.length > mCurrentSubtitleTrackIndex && mCurrentSubtitleTrackIndex > -1)
            {
                mCurrentSubtitleTrack = mSubtitleTrackList[mCurrentSubtitleTrackIndex];
            } else
            {
                mCurrentSubtitleTrack = null;
            }
        }
        if (jsonobject.has("state"))
        {
            mState = getInt(jsonobject, "state", -1);
        }
        if (jsonobject.has("duration"))
        {
            mDuration = getInt(jsonobject, "duration", 0x80000000);
        }
        if (jsonobject.has("subtitleTrackList"))
        {
            mSubtitleTrackList = getSubtitle(getJSONArray(jsonobject, "subtitleTrackList"));
        }
        if (jsonobject.has("displayAspectRatio"))
        {
            jsonobject1 = getJSONObject(jsonobject, "displayAspectRatio", null);
            if (jsonobject1 != null)
            {
                Log.d("nf-media", "handlePropertyUpdate:: displayAspectRatio found");
                if (jsonobject1.has("x"))
                {
                    mDisplayAspectRatioX = getInt(jsonobject1, "x", 0);
                }
                if (jsonobject1.has("y"))
                {
                    mDisplayAspectRatioY = getInt(jsonobject1, "y", 0);
                }
                calculateVideoSize();
            } else
            {
                Log.w("nf-media", "handlePropertyUpdate:: displayAspectRatio found, but it is null!!!");
            }
        } else
        {
            Log.w("nf-media", "handlePropertyUpdate:: displayAspectRatio does not exist");
        }
        if (jsonobject.has("audioTrackList"))
        {
            mAudioTrackList = getAudioSources(getJSONArray(jsonobject, "audioTrackList"));
        }
        if (jsonobject.has("defaultTrackOrderList"))
        {
            mDefaultOrderInfo = getDefaultOrderInfo(getJSONArray(jsonobject, "defaultTrackOrderList"));
        }
        if (jsonobject.has("trickplayList"))
        {
            mTrickplayUrlList = toTrickplayUrlList(getJSONArray(jsonobject, "trickplayList"));
        }
        return -1;
    }

    private boolean isValid(AudioSubtitleDefaultOrderInfo audiosubtitledefaultorderinfo)
    {
        if (mAudioTrackList != null && mAudioTrackList.length >= 1) goto _L2; else goto _L1
_L1:
        Log.e("nf-bridge", "Audio track list is empty!");
_L4:
        return false;
_L2:
        int i = 0;
_L6:
        if (i >= mAudioTrackList.length) goto _L4; else goto _L3
_L3:
        String as[];
        AudioSource audiosource = mAudioTrackList[i];
        if (audiosource.getId() == null || !audiosource.getId().equals(audiosubtitledefaultorderinfo.getAudioTrackId()))
        {
            break MISSING_BLOCK_LABEL_327;
        }
        if (Log.isLoggable("nf-bridge", 3))
        {
            Log.d("nf-bridge", (new StringBuilder()).append("Audio track found ").append(audiosource).append(" for default audio track id ").append(audiosubtitledefaultorderinfo.getAudioTrackId()).toString());
        }
        as = mAudioTrackList[i].getDisallowedSubtitles();
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        i = 0;
_L5:
label0:
        {
            if (i >= as.length)
            {
                break MISSING_BLOCK_LABEL_209;
            }
            if (as[i] == null || !as[i].equals(audiosubtitledefaultorderinfo.getSubtitleTrackId()))
            {
                break label0;
            }
            if (Log.isLoggable("nf-bridge", 6))
            {
                Log.e("nf-bridge", (new StringBuilder()).append("Default subtitle track id ").append(audiosubtitledefaultorderinfo.getSubtitleTrackId()).append(" is not allowed! Error on NCCP side!").toString());
                return false;
            }
        }
          goto _L4
        i++;
          goto _L5
        if (audiosubtitledefaultorderinfo.getSubtitleTrackId() == null || "none".equalsIgnoreCase(audiosubtitledefaultorderinfo.getSubtitleTrackId()) || "".equals(audiosubtitledefaultorderinfo.getSubtitleTrackId()))
        {
            if (Log.isLoggable("nf-bridge", 3))
            {
                Log.d("nf-bridge", (new StringBuilder()).append("Subtitle track id is NULL for default, no subtitles: ").append(audiosubtitledefaultorderinfo).toString());
            }
            return true;
        }
        if (getSubtitle(audiosubtitledefaultorderinfo.getSubtitleTrackId()) != null)
        {
            if (Log.isLoggable("nf-bridge", 3))
            {
                Log.d("nf-bridge", (new StringBuilder()).append("Default is valid, no restrictions  ").append(audiosubtitledefaultorderinfo).toString());
            }
            return true;
        }
          goto _L4
        i++;
          goto _L6
    }

    private TrickplayUrl[] toTrickplayUrlList(JSONArray jsonarray)
        throws JSONException
    {
        if (jsonarray != null && jsonarray.length() >= 1) goto _L2; else goto _L1
_L1:
        TrickplayUrl atrickplayurl[];
        Log.w("nf-bridge", "Empty trickplayUrlList");
        atrickplayurl = new TrickplayUrl[0];
_L4:
        return atrickplayurl;
_L2:
        TrickplayUrl atrickplayurl1[] = new TrickplayUrl[jsonarray.length()];
        int i = 0;
        do
        {
            atrickplayurl = atrickplayurl1;
            if (i >= atrickplayurl1.length)
            {
                continue;
            }
            atrickplayurl1[i] = new TrickplayUrl(jsonarray.getJSONObject(i));
            Log.d("nf-bridge", atrickplayurl1[i].toString());
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void changePlayer(PlayerType playertype, int i)
    {
        playertype = new ChangePlayer(playertype, i);
        bridge.getNrdProxy().invokeMethod(playertype);
    }

    public void close()
    {
        bridge.getNrdProxy().invokeMethod(new Close());
    }

    public AudioSubtitleDefaultOrderInfo[] getAudioSubtitleDefaultOrderInfo()
    {
        return mDefaultOrderInfo;
    }

    public AudioSource[] getAudioTrackList()
    {
        return mAudioTrackList;
    }

    public AudioSource getCurrentAudioTrack()
    {
        return mCurrentAudioTrack;
    }

    public int getCurrentPosition()
    {
        return mPosition;
    }

    public Subtitle getCurrentSubtitleTrack()
    {
        return mCurrentSubtitleTrack;
    }

    public int getCurrentVideoBitrate()
    {
        return mCurrentVideoBitrate;
    }

    public StreamInfo getCurrentVideoStream()
    {
        return mCurrentVideoStream;
    }

    public float getDisplayAspectRatio()
    {
        if (mDisplayAspectRatioY == 0)
        {
            return 0.0F;
        } else
        {
            return ((float)mDisplayAspectRatioX * 1.0F) / (float)mDisplayAspectRatioY;
        }
    }

    public int getDuration()
    {
        return mDuration;
    }

    public int getMediaPosition()
    {
        return mPosition;
    }

    public String getName()
    {
        return "media";
    }

    public String getPath()
    {
        return "nrdp.media";
    }

    public PlayoutMetadata getPlayoutMetadata()
    {
        Log.d("nf-bridge", "Media:: METADATA");
        boolean flag = false;
        boolean flag1 = false;
        int j = 0;
        int i = 0;
        Object obj;
        int k;
        int l;
        if (mCurrentVideoStream == null)
        {
            Log.w("nf-bridge", "Media:: Current video stream info uknown");
        } else
        {
            i = mCurrentVideoStream.getBitsPerSecond() / 1024;
            flag = mCurrentVideoStream.isHighDefinition();
            flag1 = mCurrentVideoStream.isSuperHighDefinition();
        }
        if (mTargetVideoStream != null)
        {
            j = mTargetVideoStream.getBitsPerSecond() / 1024;
        } else
        {
            Log.w("nf-bridge", "Media:: Target video stream info uknown");
        }
        k = 0;
        l = 0;
        obj = "";
        if (mAudioTrackList != null && mAudioTrackList.length > mCurrentAudioTrackIndex && mCurrentAudioTrackIndex > -1)
        {
            AudioSource audiosource = mAudioTrackList[mCurrentAudioTrackIndex];
            if (audiosource != null)
            {
                k = audiosource.getNumChannels();
                l = audiosource.getTrackType();
                obj = audiosource.getLanguageDescription();
            } else
            {
                Log.e("nf-bridge", (new StringBuilder()).append("Audio source is null for  ").append(mCurrentAudioTrackIndex).toString());
            }
        } else
        if (mAudioTrackList == null)
        {
            Log.e("nf-bridge", "audio list is null ");
        } else
        {
            Log.e("nf-bridge", (new StringBuilder()).append("audio list has less elements ").append(mAudioTrackList.length).append(" than current index ").append(mCurrentAudioTrackIndex).toString());
        }
        obj = new PlayoutMetadata(mPosition, mDuration, i, j, flag, flag1, ((String) (obj)), k, l);
        if (Log.isLoggable("nf-bridge", 3))
        {
            Log.d("nf-bridge", (new StringBuilder()).append("Media:: getPlayoutMetadata:: ").append(obj).toString());
        }
        return ((PlayoutMetadata) (obj));
    }

    public int getState()
    {
        return mState;
    }

    public com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleOutputMode getSubtitleOutputMode()
    {
        return mSubtitleOutputMode;
    }

    public com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleProfile getSubtitleProfile()
    {
        return mSubtitleProfile;
    }

    public Subtitle[] getSubtitleTrackList()
    {
        return mSubtitleTrackList;
    }

    public TrickplayUrl[] getTrickplayUrlList()
    {
        return mTrickplayUrlList;
    }

    public int getVideoHeight()
    {
        if (mCurrentVideoStream == null)
        {
            if (Log.isLoggable("nf-bridge", 3))
            {
                Log.d("nf-media", (new StringBuilder()).append("getVideoHeight:: Current video stream info unknown, use display aspect ratio ").append(mDisplayAspectRatioY).append(" and height ").append(mFrameY).toString());
            }
            return mFrameY;
        }
        if (Log.isLoggable("nf-bridge", 3))
        {
            Log.d("nf-media", (new StringBuilder()).append("Current video stream ").append(mCurrentVideoStream).toString());
        }
        return mCurrentVideoStream.getFrameHeight();
    }

    public int getVideoWidth()
    {
        if (mCurrentVideoStream == null)
        {
            if (Log.isLoggable("nf-bridge", 3))
            {
                Log.d("nf-media", (new StringBuilder()).append("getVideoHeight:: Current video stream info unknown, use display aspect ratio ").append(mDisplayAspectRatioX).append(" and width ").append(mFrameX).toString());
            }
            return mFrameX;
        }
        if (Log.isLoggable("nf-bridge", 3))
        {
            Log.d("nf-media", (new StringBuilder()).append("Current video stream ").append(mCurrentVideoStream).toString());
        }
        return mCurrentVideoStream.getFrameWidth();
    }

    public void open(long l, PlayContext playcontext, com.netflix.mediaclient.javabridge.invoke.media.Open.NetType nettype)
    {
        bridge.getNrdProxy().invokeMethod(new Open(l, playcontext, nettype));
        Log.d("nf-bridge", "invokeMethod just called...");
    }

    public void pause()
    {
        bridge.getNrdProxy().invokeMethod(new Pause());
    }

    public void play(long l)
    {
        bridge.getNrdProxy().invokeMethod(new Play(l));
    }

    public int processUpdate(JSONObject jsonobject)
    {
        int i;
        try
        {
            String s = getString(jsonobject, "type", null);
            if (Log.isLoggable("nf-bridge", 3))
            {
                Log.d("nf-bridge", (new StringBuilder()).append("processUpdate: handle type ").append(s).toString());
            }
            if (!"PropertyUpdate".equalsIgnoreCase(s))
            {
                break MISSING_BLOCK_LABEL_102;
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("nf-bridge", "Failed with JSON", jsonobject);
            return 0;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        if (Log.isLoggable("nf-bridge", 3))
        {
            Log.d("nf-bridge", (new StringBuilder()).append("processUpdate: handle prop update ").append(jsonobject.toString()).toString());
        }
        return handlePropertyUpdate(jsonobject);
        Log.d("nf-bridge", "processUpdate: handle event");
        i = handleEvent(jsonobject);
        return i;
    }

    public void reset()
    {
        mAudioTrackList = null;
        mSubtitleTrackList = null;
        mDefaultOrderInfo = null;
        mCurrentSubtitleTrackIndex = 0;
        mCurrentAudioTrackIndex = 0;
        mCurrentSubtitleTrack = null;
        mCurrentAudioTrack = null;
        mDuration = 0;
        mPosition = 0;
        mState = 0;
        mCurrentVideoBitrate = 0;
        mCurrentVideoStream = null;
        mDisplayAspectRatioX = 0;
        mDisplayAspectRatioX = 0;
        mFrameX = 0;
        mFrameY = 0;
    }

    public void seekTo(int i, boolean flag)
    {
        bridge.getNrdProxy().invokeMethod(new Swim(i, flag));
    }

    public boolean selectTracks(AudioSource audiosource, Subtitle subtitle)
    {
        audiosource = new SelectTracks(audiosource, subtitle);
        bridge.getNrdProxy().invokeMethod(audiosource);
        return true;
    }

    public void setAudioBitrateRange(AudioBitrateRange audiobitraterange)
    {
    }

    public void setBytesReport(int i, int j)
    {
        bridge.getNrdProxy().invokeMethod(new SetBytesReport(i, j));
        Log.d("nf-bridge", "invokeMethod setBytesReport just called...");
    }

    public void setMaxVideoBufferSize(int i)
    {
        SetStreamingBuffer setstreamingbuffer = new SetStreamingBuffer(false, i, 0);
        bridge.getNrdProxy().invokeMethod(setstreamingbuffer);
    }

    public void setNetworkProfile(int i)
    {
        bridge.getNrdProxy().setProperty("nrdp.media", "networkProfile", String.valueOf(i));
    }

    public boolean setProperty(String s, String s1)
    {
        if (Log.isLoggable("nf-bridge", 3))
        {
            Log.d("nf-bridge", (new StringBuilder()).append("Sets property ").append(s).append(" to ").append(s1).toString());
        }
        return false;
    }

    public void setStreamingQoe(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        s = new JSONObject(s);
        bridge.getNrdProxy().invokeMethod(new SetConfigData(s, "streaming"));
        return;
        s;
        Log.e("nf-bridge", "Failed to create JSON object, unable to setConfigData", s);
        return;
    }

    public void setSubtitleOutputMode(com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleOutputMode subtitleoutputmode)
    {
        if (subtitleoutputmode == null)
        {
            throw new IllegalArgumentException("Output mode can not be null!");
        } else
        {
            bridge.getNrdProxy().setProperty("media", "subtitleOutputMode", String.valueOf(subtitleoutputmode.getValue()));
            mSubtitleOutputMode = subtitleoutputmode;
            return;
        }
    }

    public void setSubtitleProfile(com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleProfile subtitleprofile)
    {
        if (subtitleprofile == null)
        {
            throw new IllegalArgumentException("Subtitle profile can not be null!");
        } else
        {
            bridge.getNrdProxy().setProperty("media", "subtitleProfile", String.valueOf(subtitleprofile.getValue()));
            mSubtitleProfile = subtitleprofile;
            return;
        }
    }

    public void setSurface(Surface surface)
    {
        bridge.getNrdProxy().invokeMethod(new SetVideoSurface(surface));
        Log.d("nf-bridge", "invokeMethod just called setSurface...");
    }

    public void setThrotteled(boolean flag)
    {
        bridge.getNrdProxy().setProperty("nrdp.media", "throttled", "false");
    }

    public void setVOapi(long l, long l1)
    {
        bridge.getNrdProxy().invokeMethod(new InitVisualOn(l, l1));
    }

    public void setVideoBitrateRange(int i, int j)
    {
        bridge.getNrdProxy().invokeMethod(new SetVideoBitrateRanges(i, j));
    }

    public void setVideoBitrateRanges(VideoBitrateRange avideobitraterange[])
    {
        bridge.getNrdProxy().invokeMethod(new SetVideoBitrateRanges(avideobitraterange));
    }

    public void setWifiApsInfo(Context context, String s, boolean flag)
    {
        bridge.getNrdProxy().invokeMethod(new SetWifiApsInfo(context, s, flag));
        Log.d("nf-bridge", "invokeMethod setWifiApsInfo just called...");
    }

    public void setWifiLinkSpeed(Context context)
    {
        bridge.getNrdProxy().invokeMethod(new SetWifiLinkSpeed(context));
        Log.d("nf-bridge", "invokeMethod setWifiLinkSpeed just called...");
    }

    public void stop()
    {
        bridge.getNrdProxy().invokeMethod(new Stop());
    }

    public void unpause()
    {
        bridge.getNrdProxy().invokeMethod(new Unpause());
    }
}
