// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.os.Bundle;
import com.urbanairship.Logger;
import com.urbanairship.util.UAStringUtil;

public class PushMessage
{

    public static final String EXTRA_ACTIONS_PAYLOAD = "com.urbanairship.actions";
    public static final String EXTRA_ALERT = "com.urbanairship.push.ALERT";
    public static final String EXTRA_EXPIRATION = "com.urbanairship.push.EXPIRATION";
    public static final String EXTRA_INTERACTIVE_ACTIONS_PAYLOAD = "com.urbanairship.interactive_actions";
    public static final String EXTRA_INTERACTIVE_TYPE = "com.urbanairship.interactive_type";
    static final String EXTRA_PING = "com.urbanairship.push.PING";
    public static final String EXTRA_PUSH_ID = "com.urbanairship.push.CANONICAL_PUSH_ID";
    public static final String EXTRA_SEND_ID = "com.urbanairship.push.PUSH_ID";
    public static final String EXTRA_STRING_EXTRA = "com.urbanairship.push.STRING_EXTRA";
    private Bundle pushBundle;

    public PushMessage(Bundle bundle)
    {
        pushBundle = bundle;
    }

    public String getActionsPayload()
    {
        return pushBundle.getString("com.urbanairship.actions");
    }

    public String getAlert()
    {
        return pushBundle.getString("com.urbanairship.push.ALERT");
    }

    public String getCanonicalPushId()
    {
        return pushBundle.getString("com.urbanairship.push.CANONICAL_PUSH_ID");
    }

    public String getInteractiveActionsPayload()
    {
        return pushBundle.getString("com.urbanairship.interactive_actions");
    }

    public String getInteractiveNotificationType()
    {
        return pushBundle.getString("com.urbanairship.interactive_type");
    }

    public Bundle getPushBundle()
    {
        return new Bundle(pushBundle);
    }

    public String getRichPushMessageId()
    {
        return pushBundle.getString("_uamid");
    }

    public String getSendId()
    {
        return pushBundle.getString("com.urbanairship.push.PUSH_ID");
    }

    boolean isExpired()
    {
        String s;
        s = pushBundle.getString("com.urbanairship.push.EXPIRATION");
        if (UAStringUtil.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_93;
        }
        Logger.debug((new StringBuilder()).append("Notification expiration time is \"").append(s).append("\"").toString());
        long l;
        long l1;
        l = Long.parseLong(s);
        l1 = System.currentTimeMillis();
        if (l * 1000L < l1)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_93;
        NumberFormatException numberformatexception;
        numberformatexception;
        Logger.debug((new StringBuilder()).append("Ignoring malformed expiration time: ").append(numberformatexception.getMessage()).toString());
        return false;
    }

    boolean isPing()
    {
        return pushBundle.get("com.urbanairship.push.PING") != null;
    }

    public String toString()
    {
        return pushBundle.toString();
    }
}
