// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.AudioSubtitleDefaultOrderInfo;
import com.netflix.mediaclient.media.Subtitle;
import com.netflix.mediaclient.util.LanguageChoice;
import java.util.Arrays;

public class LocalizationManager
{

    private static final String TAG = "nf-l10n";
    private AudioSource audioSources[];
    private AudioSubtitleDefaultOrderInfo mDefaults[];
    private Subtitle subtitles[];
    private AudioSource userChoiceAudio;
    private Subtitle userChoiceSubtitle;

    public LocalizationManager(Subtitle asubtitle[], AudioSource aaudiosource[], AudioSubtitleDefaultOrderInfo aaudiosubtitledefaultorderinfo[], LanguageChoice languagechoice)
    {
        AudioSource.dumpLog(aaudiosource, "nf-l10n");
        Subtitle.dumpLog(asubtitle, "nf-l10n");
        AudioSubtitleDefaultOrderInfo.dumpLog(aaudiosubtitledefaultorderinfo, "nf-l10n");
        if (asubtitle == null)
        {
            subtitles = new Subtitle[0];
        } else
        {
            Arrays.sort(asubtitle);
            Subtitle.dumpLog(asubtitle, "nf-l10n");
            subtitles = asubtitle;
        }
        if (aaudiosource == null)
        {
            audioSources = new AudioSource[0];
        } else
        {
            Arrays.sort(aaudiosource);
            AudioSource.dumpLog(aaudiosource, "nf-l10n");
            audioSources = aaudiosource;
        }
        if (aaudiosubtitledefaultorderinfo == null)
        {
            mDefaults = new AudioSubtitleDefaultOrderInfo[0];
        } else
        {
            Arrays.sort(aaudiosubtitledefaultorderinfo);
            AudioSubtitleDefaultOrderInfo.dumpLog(aaudiosubtitledefaultorderinfo, "nf-l10n");
            mDefaults = aaudiosubtitledefaultorderinfo;
        }
        if (Log.isLoggable("nf-l10n", 3))
        {
            Log.d("nf-l10n", (new StringBuilder()).append("User choice for language was ").append(languagechoice).toString());
        }
        if (languagechoice != null)
        {
            if (languagechoice.getSubtitle() != null)
            {
                userChoiceSubtitle = getSubtitleById(languagechoice.getSubtitle().getId());
                if (Log.isLoggable("nf-l10n", 3))
                {
                    Log.d("nf-l10n", (new StringBuilder()).append("User choice for subtitle was ").append(languagechoice.getSubtitle().getId()).append(". In movie medatadata we found match: ").append(userChoiceSubtitle).toString());
                }
            } else
            {
                Log.d("nf-l10n", "User choice for subtitle did not existed!");
            }
            if (languagechoice.getAudio() != null)
            {
                userChoiceAudio = getAudioSourceById(languagechoice.getAudio().getId());
                if (Log.isLoggable("nf-l10n", 3))
                {
                    Log.d("nf-l10n", (new StringBuilder()).append("User choice for audio was ").append(languagechoice.getAudio().getId()).append(". In movie medatadata we found match: ").append(userChoiceAudio).toString());
                }
                return;
            } else
            {
                Log.d("nf-l10n", "User choice for audio did not existed!");
                return;
            }
        } else
        {
            Log.d("nf-l10n", "User choice for audio AND subtitle did not existed!");
            return;
        }
    }

    private AudioSource findInitialAudio()
    {
        Object obj = null;
        if (audioSources.length < 1)
        {
            Log.w("nf-l10n", "No audio source found!");
        } else
        {
            if (mDefaults.length < 1)
            {
                Log.d("nf-l10n", "No defaults found. Return null to keep initial audio source.");
                return null;
            }
            obj = mDefaults[0].getAudioTrackId();
            if (obj == null)
            {
                Log.e("nf-l10n", (new StringBuilder()).append("Audio source track id is NULL for default: ").append(mDefaults[0]).toString());
                return null;
            }
            AudioSource audiosource = getAudioSourceById(((String) (obj)));
            if (audiosource == null)
            {
                Log.e("nf-l10n", (new StringBuilder()).append("Default exist: ").append(((String) (obj))).append(", but source with it not found!").toString());
                return audiosource;
            }
            obj = audiosource;
            if (Log.isLoggable("nf-l10n", 3))
            {
                Log.d("nf-l10n", (new StringBuilder()).append("Initial audio source defined by defauls: ").append(audiosource).toString());
                return audiosource;
            }
        }
        return ((AudioSource) (obj));
    }

    private Subtitle findInitialSubtitle()
    {
        Subtitle subtitle = null;
        if (subtitles.length >= 1) goto _L2; else goto _L1
_L1:
        return subtitle;
_L2:
        String s;
        if (mDefaults.length < 1)
        {
            Log.w("nf-l10n", "No defaults found. No subtitles.");
            return null;
        }
        s = mDefaults[0].getSubtitleTrackId();
        if (s != null && !"none".equalsIgnoreCase(s) && !"".equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("nf-l10n", 3))
        {
            Log.d("nf-l10n", (new StringBuilder()).append("Subtitle track id is NULL for default, no subtitles: ").append(mDefaults[0]).toString());
            return null;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Subtitle subtitle1 = getSubtitleById(s);
        if (subtitle1 == null)
        {
            Log.e("nf-l10n", (new StringBuilder()).append("Default exist: ").append(s).append(", but soubtitle with it not found!").toString());
            return subtitle1;
        }
        subtitle = subtitle1;
        if (Log.isLoggable("nf-l10n", 3))
        {
            Log.d("nf-l10n", (new StringBuilder()).append("Initial subtitle defined by defauls: ").append(subtitle1).toString());
            return subtitle1;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private AudioSource getAudioSourceById(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Audio track id can NOT be null!");
        }
        for (int i = 0; i < audioSources.length; i++)
        {
            if (s.equals(audioSources[i].getId()))
            {
                return audioSources[i];
            }
        }

        return null;
    }

    private Subtitle getSubtitleById(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Subtitle id can NOT be null!");
        }
        for (int i = 0; i < subtitles.length; i++)
        {
            if (s.equals(subtitles[i].getId()))
            {
                return subtitles[i];
            }
        }

        return null;
    }

    public LanguageChoice findInitialLanguage()
    {
        if (userChoiceSubtitle != null)
        {
            Log.d("nf-l10n", "We found user preference for subtitle!");
        }
        if (userChoiceAudio != null)
        {
            if (Log.isLoggable("nf-l10n", 3))
            {
                Log.d("nf-l10n", (new StringBuilder()).append("We found user preference for audio: ").append(userChoiceAudio).toString());
            }
            if (userChoiceSubtitle != null)
            {
                if (Log.isLoggable("nf-l10n", 3))
                {
                    Log.d("nf-l10n", (new StringBuilder()).append("We found user preference for subtitle: ").append(userChoiceSubtitle).toString());
                }
            } else
            {
                Log.d("nf-l10n", "No user preferences for subtitle.");
            }
            if (userChoiceAudio.isAllowedSubtitle(userChoiceSubtitle))
            {
                Log.d("nf-l10n", "Using user preference for language");
                return new LanguageChoice(userChoiceSubtitle, userChoiceAudio);
            } else
            {
                Log.d("nf-l10n", "Using user preference is not allowed, go for NCCP default");
                return new LanguageChoice(findInitialSubtitle(), findInitialAudio());
            }
        }
        Log.d("nf-l10n", "No user preference for audio!");
        AudioSource audiosource = findInitialAudio();
        if (audiosource == null)
        {
            Log.e("nf-l10n", "Initial audio not found!");
            return new LanguageChoice(null, null);
        }
        if (userChoiceSubtitle != null)
        {
            if (Log.isLoggable("nf-l10n", 3))
            {
                Log.d("nf-l10n", (new StringBuilder()).append("We found user preference for subtitle: ").append(userChoiceSubtitle).toString());
            }
            if (audiosource.isAllowedSubtitle(userChoiceSubtitle))
            {
                Log.d("nf-l10n", "Using user preference for language");
                return new LanguageChoice(userChoiceSubtitle, audiosource);
            } else
            {
                Log.d("nf-l10n", "Using user preference is not allowed, go for NCCP default");
                return new LanguageChoice(findInitialSubtitle(), audiosource);
            }
        } else
        {
            Log.d("nf-l10n", "No user preferences for audio and subtitle. Use NCCP defaults.");
            return new LanguageChoice(findInitialSubtitle(), audiosource);
        }
    }

    public AudioSource[] getAudioSources()
    {
        return audioSources;
    }

    public Subtitle[] getSubtitles()
    {
        return subtitles;
    }
}
