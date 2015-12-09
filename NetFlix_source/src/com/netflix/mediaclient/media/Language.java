// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media;

import com.netflix.mediaclient.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.media:
//            AudioSource, Subtitle

public class Language
{

    private static final String JSON_AUDIO_ARRAY = "audio_array";
    private static final String JSON_CURRENT_NCCP_AUDIO_INDEX = "CurrentNccpAudioIndex";
    private static final String JSON_CURRENT_NCCP_SUBTITLE_INDEX = "CurrentNccpSubtitleIndex";
    private static final String JSON_PREVIOUS_NCCP_AUDIO_INDEX = "PreviousNccpAudioIndex";
    private static final String JSON_PREVIOUS_NCCP_SUBTITLE_INDEX = "PreviousNccpSubtitleIndex";
    private static final String JSON_SUBTITLE_ARRAY = "subtitle_array";
    private static final String JSON_SUBTITLE_VISIBLE = "subtitle_visible";
    private static final String TAG = "nf_language";
    private AudioSource mAltAudios[];
    private int mCurrentNccpAudioIndex;
    private int mCurrentNccpSubtitleIndex;
    private int mPreviousNccpAudioIndex;
    private int mPreviousNccpSubtitleIndex;
    private AudioSource mSelectedAudio;
    private Subtitle mSelectedSubtitle;
    private boolean mSubtitleVisible;
    private Subtitle mSubtitles[];
    private final List mUsedSubtitles = new ArrayList();

    public Language(AudioSource aaudiosource[], int i, Subtitle asubtitle[], int j, boolean flag)
    {
        mPreviousNccpSubtitleIndex = -1;
        mPreviousNccpAudioIndex = 0;
        if (aaudiosource != null)
        {
            mAltAudios = aaudiosource;
        } else
        {
            mAltAudios = new AudioSource[0];
        }
        if (asubtitle != null)
        {
            mSubtitles = asubtitle;
        } else
        {
            mSubtitles = new Subtitle[0];
        }
        mSubtitleVisible = flag;
        mCurrentNccpSubtitleIndex = j;
        mCurrentNccpAudioIndex = i;
    }

    private static int countAllowedSubtitles(Subtitle asubtitle[], AudioSource audiosource)
    {
        int i = 0;
        if (audiosource != null) goto _L2; else goto _L1
_L1:
        int k = i;
_L4:
        return k;
_L2:
        k = i;
        if (asubtitle == null)
        {
            continue;
        }
        k = i;
        if (asubtitle.length < 1)
        {
            continue;
        }
        i = 0;
        int l = asubtitle.length;
        int j = 0;
        do
        {
            k = i;
            if (j >= l)
            {
                continue;
            }
            k = i;
            if (audiosource.isAllowedSubtitle(asubtitle[j]))
            {
                k = i + 1;
            }
            j++;
            i = k;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static AudioSource getAudioSource(AudioSource aaudiosource[], int i)
    {
        if (aaudiosource == null)
        {
            Log.e("nf_language", "Audios are null!");
            return null;
        }
        int k = aaudiosource.length;
        for (int j = 0; j < k; j++)
        {
            AudioSource audiosource = aaudiosource[j];
            if (Log.isLoggable("nf_language", 3))
            {
                Log.d("nf_language", (new StringBuilder()).append("Testing ").append(audiosource).append(" for NCCP order number ").append(i).toString());
            }
            if (audiosource.getNccpOrderNumber() == i)
            {
                Log.d("nf_language", "Found!");
                return audiosource;
            }
        }

        if (Log.isLoggable("nf_language", 5))
        {
            Log.w("nf_language", (new StringBuilder()).append("SHould NOT happen! Audio source NOT found for NCCP order number ").append(i).toString());
        }
        return null;
    }

    private AudioSource getAudioSourceByPosition(int i)
    {
        if (i < 0 || i >= mAltAudios.length)
        {
            Log.e("nf_language", (new StringBuilder()).append("getAudioSourceByIndex: position invalid: ").append(i).toString());
            return null;
        } else
        {
            return mAltAudios[i];
        }
    }

    private static Subtitle getSubtitle(Subtitle asubtitle[], int i)
    {
        if (asubtitle == null)
        {
            Log.e("nf_language", "Subtitles are null!");
            return null;
        }
        int k = asubtitle.length;
        for (int j = 0; j < k; j++)
        {
            Subtitle subtitle = asubtitle[j];
            if (Log.isLoggable("nf_language", 3))
            {
                Log.d("nf_language", (new StringBuilder()).append("Testing ").append(subtitle).append(" for NCCP order number ").append(i).toString());
            }
            if (subtitle.getNccpOrderNumber() == i)
            {
                Log.d("nf_language", "Found!");
                return subtitle;
            }
        }

        if (Log.isLoggable("nf_language", 5))
        {
            Log.w("nf_language", (new StringBuilder()).append("Should NOT happen! Subtitle NOT found for NCCP order number ").append(i).toString());
        }
        return null;
    }

    public static Language restoreLanguage(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        int k = s.getInt("CurrentNccpSubtitleIndex");
        int l = s.getInt("CurrentNccpAudioIndex");
        int i1 = s.getInt("CurrentNccpSubtitleIndex");
        int j1 = s.getInt("CurrentNccpAudioIndex");
        boolean flag = s.getBoolean("subtitle_visible");
        JSONArray jsonarray = s.optJSONArray("audio_array");
        JSONArray jsonarray1 = s.optJSONArray("subtitle_array");
        s = null;
        AudioSource aaudiosource[] = null;
        if (jsonarray1 != null)
        {
            Subtitle asubtitle[] = new Subtitle[jsonarray1.length()];
            int i = 0;
            do
            {
                s = asubtitle;
                if (i >= asubtitle.length)
                {
                    break;
                }
                asubtitle[i] = Subtitle.restore(jsonarray1.getJSONObject(i));
                i++;
            } while (true);
        }
        if (jsonarray != null)
        {
            AudioSource aaudiosource1[] = new AudioSource[jsonarray.length()];
            int j = 0;
            do
            {
                aaudiosource = aaudiosource1;
                if (j >= aaudiosource1.length)
                {
                    break;
                }
                aaudiosource1[j] = AudioSource.restore(jsonarray.getJSONObject(j));
                j++;
            } while (true);
        }
        s = new Language(aaudiosource, l, s, k, flag);
        s.mPreviousNccpAudioIndex = j1;
        s.mPreviousNccpSubtitleIndex = i1;
        return s;
    }

    private void updateUsedSubtitles(AudioSource audiosource)
    {
        mUsedSubtitles.clear();
        Subtitle asubtitle[];
        int i;
        int j;
        if (audiosource == null || audiosource.isAllowedSubtitle(null))
        {
            if (Log.isLoggable("nf_language", 3))
            {
                Log.d("nf_language", (new StringBuilder()).append("Subtitle off is allowed for audio ").append(audiosource).append(". Add to list of used subtitles.").toString());
            }
            mUsedSubtitles.add(null);
            break MISSING_BLOCK_LABEL_71;
        } else
        {
            if (mSubtitles == null || countAllowedSubtitles(mSubtitles, audiosource) < 1)
            {
                if (Log.isLoggable("nf_language", 3))
                {
                    Log.d("nf_language", (new StringBuilder()).append("Subtitle off is NOT allowed for audio ").append(audiosource).append(", but there are no other ALLOWED subtitles. NCCP error. Add to subtitle spinner.").toString());
                }
                mUsedSubtitles.add(null);
            } else
            if (Log.isLoggable("nf_language", 3))
            {
                Log.d("nf_language", (new StringBuilder()).append("Subtitle off is NOT allowed for audio ").append(audiosource).append(".").toString());
            }
            continue;
        }
        do
        {
            if (mSubtitles != null)
            {
                asubtitle = mSubtitles;
                j = asubtitle.length;
                i = 0;
                do
                {
                    if (i >= j)
                    {
                        break;
                    }
                    Subtitle subtitle = asubtitle[i];
                    if (audiosource == null || audiosource.isAllowedSubtitle(subtitle))
                    {
                        if (Log.isLoggable("nf_language", 3))
                        {
                            Log.d("nf_language", (new StringBuilder()).append(subtitle).append(" is allowed for audio ").append(audiosource).append(". Add to subtitle spinner.").toString());
                        }
                        mUsedSubtitles.add(subtitle);
                    } else
                    if (Log.isLoggable("nf_language", 3))
                    {
                        Log.d("nf_language", (new StringBuilder()).append(subtitle).append(" is not allowed for audio ").append(audiosource).append(". Skip.").toString());
                    }
                    i++;
                } while (true);
            }
            return;
        } while (true);
    }

    public void commit()
    {
        mPreviousNccpAudioIndex = mCurrentNccpAudioIndex;
        if (mSelectedAudio != null)
        {
            mCurrentNccpAudioIndex = mSelectedAudio.getNccpOrderNumber();
        }
        mPreviousNccpSubtitleIndex = mCurrentNccpSubtitleIndex;
        if (mSelectedSubtitle != null)
        {
            mCurrentNccpSubtitleIndex = mSelectedSubtitle.getNccpOrderNumber();
            mSubtitleVisible = true;
            return;
        } else
        {
            mCurrentNccpSubtitleIndex = -1;
            mSubtitleVisible = false;
            return;
        }
    }

    public AudioSource[] getAltAudios()
    {
        return mAltAudios;
    }

    public AudioSource getCurrentAudioSource()
    {
        return getAudioSource(mAltAudios, mCurrentNccpAudioIndex);
    }

    public int getCurrentNccpAudioIndex()
    {
        return mCurrentNccpAudioIndex;
    }

    public int getCurrentNccpSubtitleIndex()
    {
        return mCurrentNccpSubtitleIndex;
    }

    public Subtitle getCurrentSubtitle()
    {
        if (!mSubtitleVisible)
        {
            return null;
        } else
        {
            return getSubtitle(mSubtitles, mCurrentNccpSubtitleIndex);
        }
    }

    public AudioSource getSelectedAudio()
    {
        if (Log.isLoggable("nf_language", 3))
        {
            Log.d("nf_language", (new StringBuilder()).append("Get selected audio: ").append(mSelectedAudio).toString());
        }
        return mSelectedAudio;
    }

    public Subtitle getSelectedSubtitle()
    {
        return mSelectedSubtitle;
    }

    public Subtitle[] getSubtitles()
    {
        return mSubtitles;
    }

    public List getUsedSubtitles()
    {
        return mUsedSubtitles;
    }

    public boolean isLanguageSwitchEnabled()
    {
        if (Log.isLoggable("nf_language", 2))
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("isLanguageSwitchEnabled mSubtitles count: ");
            Object obj;
            if (mSubtitles == null)
            {
                obj = "null";
            } else
            {
                obj = Integer.valueOf(mSubtitles.length);
            }
            Log.v("nf_language", stringbuilder.append(obj).toString());
        }
        if (mSubtitles != null && mSubtitles.length > 0)
        {
            return true;
        }
        if (Log.isLoggable("nf_language", 2))
        {
            StringBuilder stringbuilder1 = (new StringBuilder()).append("isLanguageSwitchEnabled mAltAudios count: ");
            Object obj1;
            if (mAltAudios == null)
            {
                obj1 = "null";
            } else
            {
                obj1 = Integer.valueOf(mAltAudios.length);
            }
            Log.v("nf_language", stringbuilder1.append(obj1).toString());
        }
        return mAltAudios != null && mAltAudios.length > 1;
    }

    public boolean isSubtitleVisible()
    {
        return mSubtitleVisible;
    }

    public void restorePreviousAudio()
    {
        if (mPreviousNccpAudioIndex < 0)
        {
            Log.e("nf_language", "This should not happen!");
            return;
        }
        AudioSource audiosource = getAudioSource(getAltAudios(), mPreviousNccpAudioIndex);
        if (Log.isLoggable("nf_language", 3))
        {
            Log.d("nf_language", (new StringBuilder()).append("Restore to previous audio in UI: ").append(audiosource).toString());
        }
        if (setSelectedAudio(audiosource) == null)
        {
            Log.w("nf_language", "Unable to restore to previous audio. Not allowed!");
            return;
        } else
        {
            mPreviousNccpAudioIndex = 0;
            return;
        }
    }

    public void restorePreviousSubtitle()
    {
        Subtitle subtitle = null;
        if (mPreviousNccpSubtitleIndex > -1)
        {
            subtitle = getSubtitle(getSubtitles(), mPreviousNccpSubtitleIndex);
        }
        if (Log.isLoggable("nf_language", 3))
        {
            Log.d("nf_language", (new StringBuilder()).append("Restore to previous subtitle in UI: ").append(subtitle).toString());
        }
        mSelectedSubtitle = subtitle;
        mPreviousNccpSubtitleIndex = -1;
    }

    public AudioSource setSelectedAudio(AudioSource audiosource)
    {
        if (Log.isLoggable("nf_language", 3))
        {
            Log.d("nf_language", (new StringBuilder()).append("Set selected audio: ").append(audiosource).toString());
        }
        mSelectedAudio = audiosource;
        updateUsedSubtitles(mSelectedAudio);
        return mSelectedAudio;
    }

    public Subtitle setSelectedSubtitle(Subtitle subtitle)
    {
        if (Log.isLoggable("nf_language", 3))
        {
            Log.d("nf_language", (new StringBuilder()).append("Sets selected subtitle ").append(subtitle).toString());
        }
        for (int i = 0; i < mUsedSubtitles.size(); i++)
        {
            if (mUsedSubtitles.get(i) == null && subtitle == null)
            {
                mSelectedSubtitle = null;
                return null;
            }
            if (mUsedSubtitles.get(i) == subtitle)
            {
                mSelectedSubtitle = subtitle;
                return mSelectedSubtitle;
            }
        }

        Log.w("nf_language", "We tried to select subtitle that is NOT in list of used subtitles!");
        return null;
    }

    public String toJsonString()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("CurrentNccpAudioIndex", mCurrentNccpAudioIndex);
        jsonobject.put("CurrentNccpSubtitleIndex", mCurrentNccpSubtitleIndex);
        jsonobject.put("PreviousNccpAudioIndex", mPreviousNccpAudioIndex);
        jsonobject.put("PreviousNccpSubtitleIndex", mPreviousNccpSubtitleIndex);
        jsonobject.put("subtitle_visible", mSubtitleVisible);
        if (mSubtitles != null && mSubtitles.length > 0)
        {
            JSONArray jsonarray = new JSONArray();
            for (int i = 0; i < mSubtitles.length; i++)
            {
                jsonarray.put(mSubtitles[i].toJson());
            }

            jsonobject.put("subtitle_array", jsonarray);
        }
        if (mAltAudios != null && mAltAudios.length > 0)
        {
            JSONArray jsonarray1 = new JSONArray();
            for (int j = 0; j < mAltAudios.length; j++)
            {
                jsonarray1.put(mAltAudios[j].toJson());
            }

            jsonobject.put("audio_array", jsonarray1);
        }
        return jsonobject.toString();
    }

    public String toString()
    {
        return (new StringBuilder()).append("Language [mSubtitles=").append(Arrays.toString(mSubtitles)).append(", mAltAudios=").append(Arrays.toString(mAltAudios)).append(", mSubtitleVisible=").append(mSubtitleVisible).append(", mCurrentNccpSubtitleIndex=").append(mCurrentNccpSubtitleIndex).append(", mCurrentNccpAudioIndex=").append(mCurrentNccpAudioIndex).append(", mPreviousNccpSubtitleIndex=").append(mPreviousNccpSubtitleIndex).append(", mPreviousNccpAudioIndex=").append(mPreviousNccpAudioIndex).append(", mUsedSubtitles=").append(mUsedSubtitles).append(", mSelectedAudio=").append(mSelectedAudio).append(", mSelectedSubtitle=").append(mSelectedSubtitle).append("]").toString();
    }
}
