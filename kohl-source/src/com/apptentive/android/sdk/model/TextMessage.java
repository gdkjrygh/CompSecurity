// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.model:
//            Message

public class TextMessage extends Message
{

    private static final String KEY_BODY = "body";

    public TextMessage()
    {
    }

    public TextMessage(String s)
        throws JSONException
    {
        super(s);
    }

    public String getBody()
    {
        String s;
        if (isNull("body"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("body");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    protected void initType()
    {
        setType(Message.Type.TextMessage);
    }

    public void setBody(String s)
    {
        try
        {
            put("body", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Unable to set message body.", new Object[0]);
        }
    }
}
