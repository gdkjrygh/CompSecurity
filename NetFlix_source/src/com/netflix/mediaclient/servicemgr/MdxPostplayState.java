// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import com.netflix.mediaclient.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class MdxPostplayState
{
    public class PostplayTitle
    {

        private int mTitleId;
        private String mTitleType;
        final MdxPostplayState this$0;

        public int getId()
        {
            return mTitleId;
        }

        public boolean isEpisode()
        {
            if (mTitleType != null)
            {
                return mTitleType.contains("episode");
            } else
            {
                return false;
            }
        }

        PostplayTitle(int i, String s)
        {
            this$0 = MdxPostplayState.this;
            super();
            mTitleId = -1;
            mTitleId = i;
            mTitleType = s;
        }
    }


    private static final String KEY_POSTPLATSTATE_STATE = "state";
    private static final String KEY_POSTPLATSTATE_TITLE = "title";
    private static final String KEY_POSTPLATSTATE_TITLE_ID = "id";
    private static final String KEY_POSTPLATSTATE_TITLE_TYPE = "type";
    private static final String POSTPLAYSTATE_COUNTDOWN = "POST_PLAY_COUNTDOWN";
    private static final String POSTPLAYSTATE_PROMPT = "POST_PLAY_PROMPT";
    private static final String TITLE_TYPE_EPISODE = "episode";
    private PostplayTitle mPostplatTitleArray[];
    private String mState;

    public MdxPostplayState(String s)
    {
        Log.i(com/netflix/mediaclient/servicemgr/MdxPostplayState.getSimpleName(), s);
        try
        {
            Object obj = new JSONObject(s);
            mState = ((JSONObject) (obj)).optString("state");
            obj = ((JSONObject) (obj)).getJSONObject("title");
            int i = ((JSONObject) (obj)).optInt("id", -1);
            obj = ((JSONObject) (obj)).optString("type");
            mPostplatTitleArray = new PostplayTitle[1];
            mPostplatTitleArray[0] = new PostplayTitle(i, ((String) (obj)));
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e(com/netflix/mediaclient/servicemgr/MdxPostplayState.getSimpleName(), (new StringBuilder()).append("JSON error ").append(s).toString());
        }
    }

    public PostplayTitle[] getPostplayTitle()
    {
        return mPostplatTitleArray;
    }

    public boolean isInCountdown()
    {
        return "POST_PLAY_COUNTDOWN".equals(mState);
    }

    public boolean isInPrompt()
    {
        return "POST_PLAY_PROMPT".equals(mState);
    }
}
