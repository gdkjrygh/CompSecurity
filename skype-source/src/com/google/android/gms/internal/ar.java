// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            ay, au

public final class ar
{

    private String a;
    private int b;

    public ar()
    {
        this((String)ay.b.b(), (byte)0);
    }

    public ar(String s)
    {
        this(s, (byte)0);
    }

    private ar(String s, byte byte0)
    {
        b = -1;
        if (TextUtils.isEmpty(s))
        {
            s = (String)ay.b.b();
        }
        a = s;
        b = -1;
    }

    public final String a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }
}
