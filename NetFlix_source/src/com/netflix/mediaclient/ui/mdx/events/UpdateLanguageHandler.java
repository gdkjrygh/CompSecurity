// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx.events;

import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.ui.mdx.MdxAudioSource;
import com.netflix.mediaclient.ui.mdx.MdxSubtitle;
import com.netflix.mediaclient.ui.mdx.RemotePlaybackListener;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.ui.mdx.events:
//            EventHandler

public class UpdateLanguageHandler extends EventHandler
{

    UpdateLanguageHandler()
    {
        super("com.netflix.mediaclient.intent.action.MDXUPDATE_AUDIOSUB");
    }

    private MdxAudioSource[] getAudioSources(JSONArray jsonarray)
        throws JSONException
    {
        if (jsonarray != null && jsonarray.length() >= 1) goto _L2; else goto _L1
_L1:
        MdxAudioSource amdxaudiosource[];
        Log.w("mdxui", "Empty audio list");
        amdxaudiosource = new MdxAudioSource[0];
_L4:
        return amdxaudiosource;
_L2:
        MdxAudioSource amdxaudiosource1[] = new MdxAudioSource[jsonarray.length()];
        int i = 0;
        do
        {
            amdxaudiosource = amdxaudiosource1;
            if (i >= amdxaudiosource1.length)
            {
                continue;
            }
            amdxaudiosource1[i] = MdxAudioSource.newInstance(jsonarray.getJSONObject(i), i);
            if (Log.isLoggable("mdxui", 3))
            {
                Log.d("mdxui", (new StringBuilder()).append("").append(i).append(": ").append(amdxaudiosource1[i]).toString());
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int getCurrentAudioIndex(MdxAudioSource amdxaudiosource[])
    {
        for (int i = 0; i < amdxaudiosource.length; i++)
        {
            if (amdxaudiosource[i].isSelected())
            {
                return i;
            }
        }

        Log.d("mdxui", "None is selected, default to 0");
        return 0;
    }

    private int getCurrentSubtitleIndex(MdxSubtitle amdxsubtitle[])
    {
        for (int i = 0; i < amdxsubtitle.length; i++)
        {
            if (amdxsubtitle[i].isSelected())
            {
                return i;
            }
        }

        Log.d("mdxui", "None is selected, default to 0");
        return 0;
    }

    private MdxSubtitle[] getSubtitles(JSONArray jsonarray)
        throws JSONException
    {
        if (jsonarray != null && jsonarray.length() >= 1) goto _L2; else goto _L1
_L1:
        MdxSubtitle amdxsubtitle[];
        Log.w("mdxui", "Empty subtitle list");
        amdxsubtitle = new MdxSubtitle[0];
_L4:
        return amdxsubtitle;
_L2:
        MdxSubtitle amdxsubtitle1[] = new MdxSubtitle[jsonarray.length()];
        int i = 0;
        do
        {
            amdxsubtitle = amdxsubtitle1;
            if (i >= amdxsubtitle1.length)
            {
                continue;
            }
            amdxsubtitle1[i] = MdxSubtitle.newInstance(jsonarray.getJSONObject(i), i);
            if (Log.isLoggable("mdxui", 3))
            {
                Log.d("mdxui", (new StringBuilder()).append("").append(i).append(": ").append(amdxsubtitle1[i]).toString());
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void handle(RemotePlaybackListener remoteplaybacklistener, Intent intent)
    {
        MdxAudioSource amdxaudiosource[];
        Log.d("mdxui", "Update audio/subtitles...");
        intent = intent.getStringExtra("stringBlob");
        if (Log.isLoggable("mdxui", 3))
        {
            Log.d("mdxui", (new StringBuilder()).append("Blob: ").append(intent).toString());
        }
        JSONArray jsonarray;
        JSONArray jsonarray1;
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject(intent);
            jsonarray = JsonUtils.getJSONArray(jsonobject, "timed_text_tracks");
        }
        // Misplaced declaration of an exception variable
        catch (RemotePlaybackListener remoteplaybacklistener)
        {
            Log.e("mdxui", "Failed to extract capability data ", remoteplaybacklistener);
            return;
        }
        intent = jsonarray;
        if (jsonarray != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        intent = JsonUtils.getJSONArray(jsonobject, "timed_text_track");
        jsonarray1 = JsonUtils.getJSONArray(jsonobject, "audio_tracks");
        amdxaudiosource = jsonarray1;
        if (jsonarray1 != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        amdxaudiosource = JsonUtils.getJSONArray(jsonobject, "audio_track");
        if (!Log.isLoggable("mdxui", 3)) goto _L2; else goto _L1
_L1:
        if (intent != null) goto _L4; else goto _L3
_L3:
        Log.d("mdxui", "subtitleTrackListJsonArray is null");
_L5:
        if (amdxaudiosource != null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        Log.d("mdxui", "audioTrackListJsonArray is null");
_L2:
        intent = getSubtitles(intent);
        amdxaudiosource = getAudioSources(amdxaudiosource);
        remoteplaybacklistener.updateLanguage(new Language(amdxaudiosource, getCurrentAudioIndex(amdxaudiosource), intent, getCurrentSubtitleIndex(intent), true));
        return;
_L4:
        Log.d("mdxui", (new StringBuilder()).append("subtitleTrackListJsonArray.lenght: ").append(intent.length()).toString());
          goto _L5
        Log.d("mdxui", (new StringBuilder()).append("audioTrackListJsonArray.lenght: ").append(amdxaudiosource.length()).toString());
          goto _L2
    }
}
