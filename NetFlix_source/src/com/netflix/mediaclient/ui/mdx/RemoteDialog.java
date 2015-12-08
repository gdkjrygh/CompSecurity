// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.util.Pair;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.JsonUtils;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RemoteDialog
{

    private final String TAG;
    private String mMessage;
    private String mTitle;
    private Pair options[];

    public RemoteDialog(String s)
        throws JSONException
    {
        this(new JSONObject(s));
    }

    public RemoteDialog(JSONObject jsonobject)
        throws JSONException
    {
        TAG = "mdxui";
        mTitle = JsonUtils.getString(jsonobject, "title", null);
        mMessage = JsonUtils.getString(jsonobject, "message", null);
        jsonobject = JsonUtils.getJSONArray(jsonobject, "options");
        if (jsonobject == null)
        {
            Log.e("mdxui", "Invalid data, no options found!");
            options = new Pair[0];
        } else
        {
            options = new Pair[jsonobject.length()];
            int i = 0;
            while (i < jsonobject.length()) 
            {
                JSONObject jsonobject1 = jsonobject.getJSONObject(i);
                options[i] = Pair.create(JsonUtils.getString(jsonobject1, "name", null), JsonUtils.getString(jsonobject1, "data", null));
                i++;
            }
        }
    }

    public String getMessage()
    {
        return mMessage;
    }

    public Pair[] getOptions()
    {
        return options;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public boolean isValid()
    {
        return options != null && options.length > 0;
    }

    public void setTitle(String s)
    {
        mTitle = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("RemoteDialog [ mTitle=").append(mTitle).append(", mMessage=").append(mMessage).append(", options=").append(Arrays.toString(options)).append("]").toString();
    }
}
