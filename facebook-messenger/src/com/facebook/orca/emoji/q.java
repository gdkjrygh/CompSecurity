// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;

public class q
{

    public static final ae a;
    public static final ae b;

    public q()
    {
    }

    public static ae a(String s)
    {
        return (ae)b.c(s);
    }

    static 
    {
        a = (ae)aj.a.c("emoji_attachment/");
        b = (ae)a.c("front_state/");
    }
}
