// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.mdx.session;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.TransactionId;
import org.json.JSONException;
import org.json.JSONObject;

public class StartSession extends BaseInvoke
{

    public static final String METHOD = "startSession";
    public static final String PROPERTY_pairingContext = "pairingContext";
    public static final String PROPERTY_xid = "xid";
    private static final String TARGET = "mdx";

    public StartSession(String s)
    {
        super("mdx", "startSession");
        setArguments(s, TransactionId.nextTransactionId());
    }

    private void setArguments(String s, long l)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("pairingContext", s);
            jsonobject.put("xid", l);
            arguments = jsonobject.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        break MISSING_BLOCK_LABEL_38;
        s;
        Log.e("nf_invoke", "Failed to create JSON object", s);
        return;
    }
}
