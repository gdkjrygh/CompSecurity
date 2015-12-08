// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android.registration;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.ui.BaseCommandCompletedEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class SelectedAccountCompleteCommand extends BaseCommandCompletedEvent
{

    public static final String NAME = "selectedAccount";
    public static final String OBJECT = "nrdp.registration";
    private static final String RESULT = "result";
    private static final String TAG = "nf_reg";
    private boolean selected;

    public SelectedAccountCompleteCommand(JSONObject jsonobject)
        throws JSONException
    {
        super("selectedAccount", jsonobject);
        selected = false;
        localPopulate(jsonobject);
    }

    public String getObject()
    {
        return "nrdp.registration";
    }

    public boolean isSelectedSuccess()
    {
        return selected;
    }

    protected void localPopulate(JSONObject jsonobject)
        throws JSONException
    {
        selected = getString(jsonobject, "result", "ERROR").equals("COMPLETE");
        Log.d("nf_reg", (new StringBuilder()).append("populated: selected").append(selected).toString());
    }
}
