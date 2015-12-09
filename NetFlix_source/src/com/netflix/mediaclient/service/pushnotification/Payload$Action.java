// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.pushnotification;

import android.net.Uri;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.pushnotification:
//            Payload

public static class guid
{

    public static final String ADD2QUEUE = "ADD2QUEUE";
    public static final String CUSTOM = "CUSTOM";
    public static final String MDP = "MDP";
    public static final String PLAY = "PLAY";
    public String guid;
    public String icon;
    public String key;
    public String payload;
    public String text;

    public static boolean isSupportedActionKey(String s)
    {
        while (s == null || !"MDP".equals(s) && !"PLAY".equals(s) && !"ADD2QUEUE".equals(s) && !"CUSTOM".equals(s)) 
        {
            return false;
        }
        return true;
    }

    public int getIcon()
    {
        return 0x7f0200de;
    }

    public Uri getPayload()
    {
        Uri uri;
        try
        {
            uri = Payload.access$000(payload, key);
        }
        catch (Throwable throwable)
        {
            Log.e("nf_push", (new StringBuilder()).append("Action.Payload URI is wrong: ").append(payload).toString(), throwable);
            return null;
        }
        return uri;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Action [key=").append(key).append(", text=").append(text).append(", payload=").append(payload).append(", icon=").append(icon).append("]").toString();
    }

    public (String s)
    {
        guid = s;
    }
}
