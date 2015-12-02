// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;

public class ay
{

    public static final ae a;
    public static final ae b;
    public static final ae c;

    public ay()
    {
    }

    static 
    {
        a = (ae)aj.c.c("webrtc/");
        b = (ae)a.c("last_call_volume");
        c = (ae)a.c("free_call_acceptance");
    }
}
