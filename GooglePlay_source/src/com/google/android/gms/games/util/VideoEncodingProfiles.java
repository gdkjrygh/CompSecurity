// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.util;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Range;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.games.internal.GamesLog;
import java.util.ArrayList;

public final class VideoEncodingProfiles
{
    private static final class AudioParameters
    {

        int bitRate;
        int channelCount;
        boolean isSupported;
        int sampleRate;
        boolean specifyProfile;

        public final String toString()
        {
            return (new StringBuilder("[ specifyProfile=")).append(specifyProfile).append(", sampleRate=").append(sampleRate).append(", channelCount=").append(channelCount).append(", bitrate=").append(bitRate).append(", isSupported=").append(isSupported).append(" ]").toString();
        }

        private AudioParameters()
        {
        }

        AudioParameters(byte byte0)
        {
            this();
        }
    }

    private static final class VideoParameters
    {

        int bitRate;
        int height;
        boolean isSupported;
        boolean specifyProfile;
        int width;

        public final String toString()
        {
            return (new StringBuilder("[ specifyProfile=")).append(specifyProfile).append(", width=").append(width).append(", height=").append(height).append(", bitrate=").append(bitRate).append(", isSupported=").append(isSupported).append(" ]").toString();
        }

        private VideoParameters()
        {
        }

        VideoParameters(byte byte0)
        {
            this();
        }
    }


    private static VideoEncodingProfiles sSingleton;
    public AudioParameters mAudioParams;
    public SparseArray mVideoParams;

    private VideoEncodingProfiles(Context context)
    {
        int i;
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        Object obj = new DisplayMetrics();
        context.getRealMetrics(((DisplayMetrics) (obj)));
        i = Math.max(((DisplayMetrics) (obj)).widthPixels, ((DisplayMetrics) (obj)).heightPixels);
        int j = Math.min(((DisplayMetrics) (obj)).widthPixels, ((DisplayMetrics) (obj)).heightPixels);
        context = new ArrayList[4];
        context[3] = null;
        context[2] = null;
        obj = new ArrayList();
        if (i >= 1280 && j >= 720)
        {
            ((ArrayList) (obj)).add(getBaseHdParams());
            VideoParameters videoparameters = getBaseHdParams();
            videoparameters.specifyProfile = false;
            ((ArrayList) (obj)).add(videoparameters);
            videoparameters = getBaseHdParams();
            videoparameters.specifyProfile = false;
            videoparameters.bitRate = 0x1e8480;
            ((ArrayList) (obj)).add(videoparameters);
            videoparameters = getBaseHdParams();
            videoparameters.specifyProfile = false;
            videoparameters.bitRate = 0x16e360;
            ((ArrayList) (obj)).add(videoparameters);
        }
        context[1] = obj;
        obj = new ArrayList();
        if (i >= 854 && j >= 480)
        {
            ((ArrayList) (obj)).add(getBaseSdParams());
            VideoParameters videoparameters1 = getBaseSdParams();
            videoparameters1.specifyProfile = false;
            ((ArrayList) (obj)).add(videoparameters1);
            videoparameters1 = getBaseSdParams();
            videoparameters1.specifyProfile = false;
            videoparameters1.bitRate = 0x7a120;
            ((ArrayList) (obj)).add(videoparameters1);
        }
        context[0] = obj;
        obj = new ArrayList();
        ((ArrayList) (obj)).add(getBaseAudioParams());
        AudioParameters audioparameters = getBaseAudioParams();
        audioparameters.specifyProfile = false;
        ((ArrayList) (obj)).add(audioparameters);
        audioparameters = getBaseAudioParams();
        audioparameters.bitRate = 64000;
        ((ArrayList) (obj)).add(audioparameters);
        audioparameters = getBaseAudioParams();
        audioparameters.specifyProfile = false;
        audioparameters.bitRate = 64000;
        ((ArrayList) (obj)).add(audioparameters);
        audioparameters = getBaseAudioParams();
        audioparameters.specifyProfile = false;
        audioparameters.bitRate = 64000;
        audioparameters.channelCount = 1;
        ((ArrayList) (obj)).add(audioparameters);
        checkCodecSupport(((ArrayList) (obj)), context);
        i = 0;
        for (int k = ((ArrayList) (obj)).size(); i < k; i++)
        {
            AudioParameters audioparameters1 = (AudioParameters)((ArrayList) (obj)).get(i);
            if (audioparameters1.isSupported)
            {
                mAudioParams = audioparameters1;
            }
        }

        mVideoParams = new SparseArray(4);
        i = 0;
_L2:
        ArrayList arraylist;
        if (i >= 4)
        {
            break MISSING_BLOCK_LABEL_499;
        }
        arraylist = context[i];
        if (arraylist != null)
        {
            break; /* Loop/switch isn't completed */
        }
        GamesLog.v("VideoEncodingProfiles", String.format("No video formats supported for quality %d.", new Object[] {
            Integer.valueOf(i)
        }));
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        int l;
        int i1;
        l = 0;
        i1 = arraylist.size();
_L4:
        if (l < i1)
        {
label0:
            {
                VideoParameters videoparameters2 = (VideoParameters)arraylist.get(l);
                if (!videoparameters2.isSupported)
                {
                    break label0;
                }
                mVideoParams.put(i, videoparameters2);
            }
        }
          goto _L3
        l++;
          goto _L4
          goto _L3
    }

    private void checkCodecSupport(ArrayList arraylist, ArrayList aarraylist[])
    {
        MediaCodecList mediacodeclist = new MediaCodecList(0);
        MediaFormat mediaformat2 = newVideoFormat(true, false);
        MediaFormat mediaformat3 = newVideoFormat(false, false);
        MediaFormat mediaformat4 = newAudioFormat(true);
        MediaFormat mediaformat5 = newAudioFormat(false);
        MediaCodecInfo amediacodecinfo[] = mediacodeclist.getCodecInfos();
        int j1 = amediacodecinfo.length;
label0:
        for (int i = 0; i < j1; i++)
        {
            Object obj = amediacodecinfo[i];
            if (!((MediaCodecInfo) (obj)).isEncoder())
            {
                continue;
            }
            String as[] = ((MediaCodecInfo) (obj)).getSupportedTypes();
            if (hasMimeType(as, "video/avc"))
            {
                android.media.MediaCodecInfo.CodecCapabilities codeccapabilities = ((MediaCodecInfo) (obj)).getCapabilitiesForType("video/avc");
label1:
                for (int j = 0; j < 4; j++)
                {
                    ArrayList arraylist1 = aarraylist[j];
                    if (arraylist1 == null)
                    {
                        continue;
                    }
                    int l = 0;
                    int k1 = arraylist1.size();
                    do
                    {
                        if (l >= k1)
                        {
                            continue label1;
                        }
                        VideoParameters videoparameters = (VideoParameters)arraylist1.get(l);
                        MediaFormat mediaformat;
                        boolean flag;
                        if (videoparameters.specifyProfile)
                        {
                            mediaformat = mediaformat2;
                        } else
                        {
                            mediaformat = mediaformat3;
                        }
                        fillVideoFormat(mediaformat, videoparameters);
                        if (videoparameters.isSupported || checkOrientationsSupported(codeccapabilities, mediaformat, videoparameters))
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        videoparameters.isSupported = flag;
                        if (!videoparameters.isSupported && android.os.Build.VERSION.RELEASE.startsWith("5."))
                        {
                            int l1 = videoparameters.width;
                            int i2 = videoparameters.height;
                            android.media.MediaCodecInfo.VideoCapabilities videocapabilities = codeccapabilities.getVideoCapabilities();
                            videoparameters.width = ((Integer)videocapabilities.getSupportedWidths().getLower()).intValue();
                            videoparameters.height = ((Integer)videocapabilities.getSupportedHeightsFor(videoparameters.width).getLower()).intValue();
                            mediaformat.setInteger("width", videoparameters.width);
                            mediaformat.setInteger("height", videoparameters.height);
                            videoparameters.isSupported = checkOrientationsSupported(codeccapabilities, mediaformat, videoparameters);
                            videoparameters.width = l1;
                            videoparameters.height = i2;
                        }
                        l++;
                    } while (true);
                }

            }
            if (!hasMimeType(as, "audio/mp4a-latm"))
            {
                continue;
            }
            obj = ((MediaCodecInfo) (obj)).getCapabilitiesForType("audio/mp4a-latm");
            int k = 0;
            int i1 = arraylist.size();
            do
            {
                if (k >= i1)
                {
                    continue label0;
                }
                AudioParameters audioparameters = (AudioParameters)arraylist.get(k);
                MediaFormat mediaformat1;
                if (audioparameters.specifyProfile)
                {
                    mediaformat1 = mediaformat4;
                } else
                {
                    mediaformat1 = mediaformat5;
                }
                fillAudioFormat(mediaformat1, audioparameters);
                if (((android.media.MediaCodecInfo.CodecCapabilities) (obj)).isFormatSupported(mediaformat1))
                {
                    audioparameters.isSupported = true;
                }
                k++;
            } while (true);
        }

    }

    private static boolean checkOrientationsSupported(android.media.MediaCodecInfo.CodecCapabilities codeccapabilities, MediaFormat mediaformat, VideoParameters videoparameters)
    {
        boolean flag = codeccapabilities.isFormatSupported(mediaformat);
        mediaformat.setInteger("width", videoparameters.height);
        mediaformat.setInteger("height", videoparameters.width);
        boolean flag1 = codeccapabilities.isFormatSupported(mediaformat);
        return flag && flag1;
    }

    private static void fillAudioFormat(MediaFormat mediaformat, AudioParameters audioparameters)
    {
        mediaformat.setInteger("bitrate", audioparameters.bitRate);
        mediaformat.setInteger("channel-count", audioparameters.channelCount);
        byte byte0;
        if (audioparameters.channelCount == 1)
        {
            byte0 = 16;
        } else
        {
            byte0 = 12;
        }
        mediaformat.setInteger("channel-mask", byte0);
        mediaformat.setInteger("sample-rate", audioparameters.sampleRate);
    }

    private static void fillVideoFormat(MediaFormat mediaformat, VideoParameters videoparameters)
    {
        mediaformat.setInteger("bitrate", videoparameters.bitRate);
        mediaformat.setInteger("width", videoparameters.width);
        mediaformat.setInteger("height", videoparameters.height);
    }

    private static AudioParameters getBaseAudioParams()
    {
        AudioParameters audioparameters = new AudioParameters((byte)0);
        audioparameters.specifyProfile = true;
        audioparameters.sampleRate = 44100;
        audioparameters.channelCount = 2;
        audioparameters.bitRate = 0x1f400;
        audioparameters.isSupported = false;
        return audioparameters;
    }

    private static VideoParameters getBaseHdParams()
    {
        VideoParameters videoparameters = new VideoParameters((byte)0);
        videoparameters.specifyProfile = true;
        videoparameters.width = 1280;
        videoparameters.height = 720;
        videoparameters.bitRate = 0x2625a0;
        videoparameters.isSupported = false;
        return videoparameters;
    }

    private static VideoParameters getBaseSdParams()
    {
        VideoParameters videoparameters = new VideoParameters((byte)0);
        videoparameters.specifyProfile = true;
        videoparameters.width = 854;
        videoparameters.height = 480;
        videoparameters.bitRate = 0xf4240;
        videoparameters.isSupported = false;
        return videoparameters;
    }

    public static VideoEncodingProfiles getInstance(Context context)
    {
        if (sSingleton == null)
        {
            sSingleton = new VideoEncodingProfiles(context.getApplicationContext());
        }
        return sSingleton;
    }

    private static boolean hasMimeType(String as[], String s)
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (TextUtils.equals(as[i], s))
            {
                return true;
            }
        }

        return false;
    }

    private static MediaFormat newAudioFormat(boolean flag)
    {
        MediaFormat mediaformat = MediaFormat.createAudioFormat("audio/mp4a-latm", 0, 0);
        if (flag)
        {
            mediaformat.setInteger("aac-profile", 2);
        }
        return mediaformat;
    }

    private static MediaFormat newVideoFormat(boolean flag, boolean flag1)
    {
        MediaFormat mediaformat = MediaFormat.createVideoFormat("video/avc", 0, 0);
        mediaformat.setInteger("color-format", 0x7f000789);
        mediaformat.setInteger("channel-count", 1);
        mediaformat.setInteger("i-frame-interval", 2);
        if (flag1)
        {
            mediaformat.setInteger("frame-rate", 30);
        }
        if (flag)
        {
            mediaformat.setInteger("bitrate-mode", 1);
            mediaformat.setInteger("profile", 32);
        }
        return mediaformat;
    }

    public final MediaFormat getAudioFormat$11e6a031()
    {
        if (mAudioParams == null)
        {
            return null;
        } else
        {
            MediaFormat mediaformat = newAudioFormat(mAudioParams.specifyProfile);
            fillAudioFormat(mediaformat, mAudioParams);
            return mediaformat;
        }
    }

    public final MediaFormat getVideoFormat(int i, boolean flag)
    {
        VideoParameters videoparameters;
        boolean flag1;
        flag1 = true;
        videoparameters = (VideoParameters)mVideoParams.get(i);
        if (videoparameters != null) goto _L2; else goto _L1
_L1:
        MediaFormat mediaformat = null;
_L4:
        return mediaformat;
_L2:
        MediaFormat mediaformat1 = newVideoFormat(videoparameters.specifyProfile, true);
        fillVideoFormat(mediaformat1, videoparameters);
        if (videoparameters.width > videoparameters.height)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (flag && i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        mediaformat = mediaformat1;
        if (flag) goto _L4; else goto _L3
_L3:
        mediaformat = mediaformat1;
        if (i != 0) goto _L4; else goto _L5
_L5:
        mediaformat1.setInteger("width", videoparameters.height);
        mediaformat1.setInteger("height", videoparameters.width);
        return mediaformat1;
    }
}
