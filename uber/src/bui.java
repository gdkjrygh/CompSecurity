// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public abstract class bui extends buj
{

    public bui(buh buh, buk buk, bus bus1, String s)
    {
        this(buh, buk, bus1, s, null);
    }

    public bui(buh buh, buk buk, bus bus1, String s, String s1)
    {
        super(buh, buk, bus1, s1);
        if (!TextUtils.isEmpty(s))
        {
            a("Authorization", s);
        }
        a("User-Agent", f().b());
    }

    static 
    {
        bui.getSimpleName();
    }
}
