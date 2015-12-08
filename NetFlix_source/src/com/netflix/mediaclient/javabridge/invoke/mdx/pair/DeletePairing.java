// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.mdx.pair;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import org.json.JSONException;
import org.json.JSONObject;

public class DeletePairing extends BaseInvoke
{

    private static final String METHOD = "dePair";
    private static final String PROPERTY_pairingContext = "pairingContext";
    private static final String TARGET = "mdx";

    public DeletePairing(String s)
    {
        super("mdx", "dePair");
        setArguments(s);
    }

    private void setArguments(String s)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("pairingContext", s);
            arguments = jsonobject.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        break MISSING_BLOCK_LABEL_26;
        s;
        Log.e("nf_invoke", "Failed to create JSON object", s);
        return;
    }
}
