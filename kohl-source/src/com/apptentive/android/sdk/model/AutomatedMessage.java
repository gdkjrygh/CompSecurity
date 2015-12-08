// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import android.content.Context;
import android.content.res.Resources;
import com.apptentive.android.sdk.Log;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.model:
//            TextMessage

public class AutomatedMessage extends TextMessage
{

    private static final String KEY_TITLE = "title";

    public AutomatedMessage()
    {
    }

    public AutomatedMessage(String s)
        throws JSONException
    {
        super(s);
    }

    public static AutomatedMessage createAutoMessage(String s, String s1)
    {
        AutomatedMessage automatedmessage = new AutomatedMessage();
        automatedmessage.setTitle(s);
        automatedmessage.setBody(s1);
        return automatedmessage;
    }

    public static AutomatedMessage createNoLoveMessage(Context context)
    {
        context = context.getResources();
        return createAutoMessage(context.getString(com.apptentive.android.sdk.R.string.apptentive_were_sorry), context.getString(com.apptentive.android.sdk.R.string.apptentive_message_auto_body_no_love));
    }

    public static AutomatedMessage createWelcomeMessage(Context context)
    {
        context = context.getResources();
        return createAutoMessage(context.getString(com.apptentive.android.sdk.R.string.apptentive_give_feedback), context.getString(com.apptentive.android.sdk.R.string.apptentive_message_auto_body_manual));
    }

    public String getTitle()
    {
        String s;
        try
        {
            s = getString("title");
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return s;
    }

    protected void initType()
    {
        setType(Message.Type.AutomatedMessage);
    }

    public void setTitle(String s)
    {
        try
        {
            put("title", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Unable to set title.", new Object[0]);
        }
    }
}
