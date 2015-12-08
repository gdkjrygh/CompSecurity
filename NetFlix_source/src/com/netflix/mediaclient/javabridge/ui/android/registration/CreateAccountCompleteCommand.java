// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android.registration;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.ui.BaseCommandCompletedEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class CreateAccountCompleteCommand extends BaseCommandCompletedEvent
{

    private static final String KEY = "key";
    public static final String NAME = "createdAccount";
    public static final String OBJECT = "nrdp.registration";
    private static final String RESULT = "result";
    private static final String TAG = "nf_reg";
    private boolean created;
    private int key;

    public CreateAccountCompleteCommand(JSONObject jsonobject)
        throws JSONException
    {
        super("createdAccount", jsonobject);
        created = false;
        key = -1;
        Log.d("nf_reg", "CreateAccountCompleteCommand constructor");
        localPopulate(jsonobject);
    }

    public int getKey()
    {
        return key;
    }

    public String getObject()
    {
        return "nrdp.registration";
    }

    public boolean isCreatedSuccess()
    {
        Log.d("nf_reg", (new StringBuilder()).append("populated: ").append(result).append(" created:").append(created).append(" key").append(key).toString());
        return created;
    }

    protected void localPopulate(JSONObject jsonobject)
        throws JSONException
    {
        String s = getString(jsonobject, "result", "ERROR");
        created = s.equals("COMPLETE");
        if (created)
        {
            key = getInt(jsonobject, "key", -1);
        }
        Log.d("nf_reg", (new StringBuilder()).append("populated: ").append(s).append(" created:").append(created).append(" key").append(key).toString());
    }
}
