// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.crash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ClientFeedbackAreas
{

    private final Map a = new HashMap();

    public ClientFeedbackAreas()
    {
        a.put("Client/other", "SCONSUMER/C.ANDROID");
        a.put("Calling", "SCONSUMER/F.CALLEXP");
        a.put("Signin/signout", "SCONSUMER/F.ONB");
        a.put("Emoticons and mojis", "SCONSUMER/F.PRSEXP");
        a.put("Calling effects", "SCONSUMER/F.CallFX");
        a.put("Messaging and chat", "SCONSUMER/F.MSGEXP");
        a.put("Payment", "SCONSUMER/F.PMTCKT");
        a.put("Advertising", "SCONSUMER/F.ADVERT");
        a.put("Notifications", "SCONSUMER/F.NOTIF");
        a.put("Translator", "SCONSUMER/F.TRANSLATOR");
        a.put("Video messages", "SCONSUMER/F.AVTMX");
        a.put("Accessibility", "SCONSUMER/C.ANDROID");
    }

    public final String a(String s)
    {
        return (String)a.get(s);
    }

    public final String[] a()
    {
        return (String[])a.keySet().toArray(new String[a.size()]);
    }
}
