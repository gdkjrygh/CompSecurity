// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import java.io.Serializable;
import org.json.JSONException;

// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

private static class <init>
    implements Serializable
{

    private static final long serialVersionUID = 0xdd772aee317ab613L;
    private final String a;
    private final boolean b;

    private Object readResolve()
        throws JSONException
    {
        return new <init>(a, b, (byte)0);
    }

    private (String s, boolean flag)
    {
        a = s;
        b = flag;
    }

    b(String s, boolean flag, byte byte0)
    {
        this(s, flag);
    }
}
