// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class abf
{

    private String a;
    private int b;

    public abf()
    {
        this((String)abn.b.b(), (byte)0);
    }

    public abf(String s)
    {
        this(s, (byte)0);
    }

    private abf(String s, byte byte0)
    {
        b = -1;
        if (TextUtils.isEmpty(s))
        {
            s = (String)abn.b.b();
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
