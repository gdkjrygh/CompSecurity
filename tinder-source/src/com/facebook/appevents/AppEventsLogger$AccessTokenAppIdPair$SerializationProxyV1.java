// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import java.io.Serializable;

// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

private static class <init>
    implements Serializable
{

    private static final long serialVersionUID = 0xdd772aee317ab613L;
    private final String a;
    private final String b;

    private Object readResolve()
    {
        return new <init>(a, b);
    }

    private (String s, String s1)
    {
        a = s;
        b = s1;
    }

    b(String s, String s1, byte byte0)
    {
        this(s, s1);
    }
}
