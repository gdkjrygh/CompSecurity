// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class cau
{

    String a;
    int b;

    public cau()
    {
        this((String)cbb.a.b, (byte)0);
    }

    public cau(String s)
    {
        this(s, (byte)0);
    }

    private cau(String s, byte byte0)
    {
        b = -1;
        if (TextUtils.isEmpty(s))
        {
            s = (String)cbb.a.b;
        }
        a = s;
        b = -1;
    }
}
