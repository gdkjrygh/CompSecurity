// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.mdx.session;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.TransactionId;
import org.json.JSONException;
import org.json.JSONObject;

public class SendMessage extends BaseInvoke
{

    public static final String METHOD = "sendMessage";
    public static final String PROPERTY_messageName = "messageName";
    public static final String PROPERTY_messageObject = "messageObject";
    public static final String PROPERTY_sessionId = "sessionId";
    public static final String PROPERTY_xid = "xid";
    private static final String TARGET = "mdx";
    private long xid;

    public SendMessage(int i, String s, JSONObject jsonobject)
    {
        super("mdx", "sendMessage");
        xid = TransactionId.nextTransactionId();
        setArguments(i, s, jsonobject);
    }

    private void setArguments(int i, String s, JSONObject jsonobject)
    {
        JSONObject jsonobject1 = new JSONObject();
        try
        {
            jsonobject1.put("sessionId", i);
            jsonobject1.put("messageName", s);
            jsonobject1.put("messageObject", jsonobject);
            jsonobject1.put("xid", xid);
            arguments = jsonobject1.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        break MISSING_BLOCK_LABEL_59;
        s;
        Log.e("nf_invoke", "Failed to create JSON object", s);
        return;
    }

    public long getXid()
    {
        return xid;
    }
}
