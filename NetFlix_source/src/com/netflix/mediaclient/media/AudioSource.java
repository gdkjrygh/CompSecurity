// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.mdx.MdxAudioSource;
import com.netflix.mediaclient.ui.player.NccpAudioSource;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.media:
//            Subtitle

public abstract class AudioSource
    implements Comparable
{

    public static final int ASSISTIVE_AUDIO = 2;
    protected static final String ATTR_DISSALOWED_TIMED_TEXT_TRACK = "disallowedSubtitleTracks";
    protected static final String ATTR_ID = "id";
    protected static final String ATTR_IS_NATIVE = "isNative";
    protected static final String ATTR_LANGUAGE = "language";
    protected static final String ATTR_LANGUAGE_DESCRIPTION = "languageDescription";
    protected static final String ATTR_NUM_CHANNELS = "channels";
    protected static final String ATTR_ORDER = "order";
    protected static final String ATTR_SELECTED = "selected";
    protected static final String ATTR_TRACK_TYPE = "trackType";
    public static final int COMMENTARY_AUDIO = 1;
    public static final int DDPLUS_AUDIO = 4;
    public static final int DOLBY_AC3_AUDIO = 1;
    public static final int HEAAC_AUDIO = 3;
    protected static final String IMPL = "impl";
    protected static final String NONE = "none";
    public static final int OGG_VORBIS_AUDIO = 2;
    public static final int PRIMARY_AUDIO = 0;
    protected static final String TAG = "nf_audio_source";
    public static final int UNKNOWN_AUDIO = 3;
    public static final int UNKNOWN_AUDIO_CODEC = -1;
    public static final int WMA_AUDIO = 0;
    protected int codecType;
    protected String disallowedSubtitles[];
    protected String id;
    protected boolean isNative;
    protected String languageCodeIso639_1;
    protected String languageCodeIso639_2;
    protected String languageDescription;
    protected int nccpOrderNumber;
    protected int numChannels;
    protected int trackType;

    public AudioSource()
    {
    }

    public static void dumpLog(AudioSource aaudiosource[], String s)
    {
        if (aaudiosource != null)
        {
            if (Log.isLoggable(s, 3))
            {
                Log.d(s, (new StringBuilder()).append("Audios: ").append(aaudiosource.length).toString());
                for (int i = 0; i < aaudiosource.length; i++)
                {
                    Log.d(s, (new StringBuilder()).append(i).append(" ").append(aaudiosource[i]).toString());
                }

            }
        } else
        {
            Log.e(s, "Audios are null!");
        }
    }

    public static AudioSource restore(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            return null;
        }
        int i = jsonobject.optInt("impl", -1);
        if (i == 2)
        {
            return MdxAudioSource.newInstance(jsonobject, jsonobject.getInt("order"));
        }
        if (i == 1)
        {
            return NccpAudioSource.newInstance(jsonobject, jsonobject.getInt("order"));
        } else
        {
            throw new JSONException((new StringBuilder()).append("Implementation does not support restore ").append(i).toString());
        }
    }

    public int compareTo(AudioSource audiosource)
    {
        if (audiosource != null)
        {
            if (nccpOrderNumber == audiosource.nccpOrderNumber)
            {
                return 0;
            }
            if (nccpOrderNumber > audiosource.nccpOrderNumber)
            {
                return 1;
            }
        }
        return -1;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((AudioSource)obj);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof AudioSource))
            {
                return false;
            }
            obj = (AudioSource)obj;
            if (nccpOrderNumber != ((AudioSource) (obj)).nccpOrderNumber)
            {
                return false;
            }
        }
        return true;
    }

    public int getCodecType()
    {
        return codecType;
    }

    public String[] getDisallowedSubtitles()
    {
        return disallowedSubtitles;
    }

    public String getId()
    {
        return id;
    }

    public String getLanguageCodeIso639_1()
    {
        return languageCodeIso639_1;
    }

    public String getLanguageCodeIso639_2()
    {
        return languageCodeIso639_2;
    }

    public String getLanguageDescription()
    {
        return languageDescription;
    }

    public int getNccpOrderNumber()
    {
        return nccpOrderNumber;
    }

    public int getNumChannels()
    {
        return numChannels;
    }

    public int getTrackType()
    {
        return trackType;
    }

    public int hashCode()
    {
        return nccpOrderNumber + 31;
    }

    public boolean isAllowedSubtitle(Subtitle subtitle)
    {
        if (disallowedSubtitles.length >= 1)
        {
            String s = "none";
            int i;
            if (subtitle == null)
            {
                Log.d("nf_audio_source", "Checking if subtitle off is allowed");
                subtitle = s;
            } else
            {
                Log.d("nf_audio_source", "Checking if subtitle is allowed");
                subtitle = subtitle.getId();
            }
            i = 0;
            while (i < disallowedSubtitles.length) 
            {
                if (disallowedSubtitles[i] != null && disallowedSubtitles[i].equalsIgnoreCase(subtitle))
                {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public boolean isNative()
    {
        return isNative;
    }

    public abstract JSONObject toJson()
        throws JSONException;

    public String toString()
    {
        return (new StringBuilder()).append("AudioSource [id=").append(id).append(", languageCodeIso639_1=").append(languageCodeIso639_1).append(", languageCodeIso639_2=").append(languageCodeIso639_2).append(", languageDescription=").append(languageDescription).append(", trackType=").append(trackType).append(", codecType=").append(codecType).append(", isNative=").append(isNative).append(", numChannels=").append(numChannels).append(", dissalowed subtitles # ").append(disallowedSubtitles.length).append(", nccpOrderNumber=").append(nccpOrderNumber).append("]").toString();
    }
}
