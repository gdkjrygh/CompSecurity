// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class bos
{

    private final bor a;

    public bos(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Content ID cannot be empty");
        } else
        {
            a = new bor(s);
            return;
        }
    }

    public final bos a()
    {
        a.b = 1;
        return this;
    }

    public final bos a(bot bot)
    {
        a.d = bot;
        return this;
    }

    public final bos a(String s)
    {
        bor bor1 = a;
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("content type cannot be null or empty");
        } else
        {
            bor1.c = s;
            return this;
        }
    }

    public final bor b()
    {
        bor bor1 = a;
        if (TextUtils.isEmpty(bor1.a))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
        if (TextUtils.isEmpty(bor1.c))
        {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        if (bor1.b == -1)
        {
            throw new IllegalArgumentException("a valid stream type must be specified");
        } else
        {
            return a;
        }
    }
}
