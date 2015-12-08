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
        this((String)ay.b.b(), -1);
    }

    public ar(String s)
    {
        this(s, -1);
    }

    public ar(String s, int i)
    {
        b = -1;
        if (TextUtils.isEmpty(s))
        {
            s = (String)ay.b.b();
        }
        a = s;
        b = i;
    }

    public String a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }
}
