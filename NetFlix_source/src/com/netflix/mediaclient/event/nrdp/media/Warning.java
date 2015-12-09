// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import com.netflix.mediaclient.util.JsonUtils;
import com.netflix.mediaclient.util.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class Warning extends BaseMediaEvent
{

    public static final String ATTR_ERROR = "error";
    public static final String ATTR_ERRORCODE = "errorcode";
    public static final String ATTR_STACK = "stack";
    public static final String TYPE = "warning";
    public static final String WARNING_SUBTITLE_FAILURE = "NFErr_MC_SubtitleFailure";
    private int error;
    private JSONArray stack;

    public Warning(JSONObject jsonobject)
        throws JSONException
    {
        super("warning", jsonobject);
    }

    public boolean containsInStack(String s)
    {
        int i;
        if (StringUtils.isEmpty(s) || stack == null || stack.length() < 1)
        {
            return false;
        }
        i = 0;
_L2:
        JSONObject jsonobject;
        if (i >= stack.length())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        jsonobject = stack.getJSONObject(i);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        boolean flag = s.equals(getString(jsonobject, "errorcode", null));
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_79;
        s;
        return false;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int getError()
    {
        return error;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        error = getInt(jsonobject, "error", 0);
        stack = JsonUtils.getJSONArray(jsonobject, "stack");
    }
}
