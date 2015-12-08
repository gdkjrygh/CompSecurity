// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.cast:
//            m, n

public static final class nit>
{

    public final m a;

    public final nit> a(int i)
        throws IllegalArgumentException
    {
        m m1 = a;
        if (i < -1 || i > 2)
        {
            throw new IllegalArgumentException("invalid stream type");
        } else
        {
            m1.b = i;
            return this;
        }
    }

    public final on a(n n)
    {
        a.d = n;
        return this;
    }

    public final a a(String s)
        throws IllegalArgumentException
    {
        m m1 = a;
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("content type cannot be null or empty");
        } else
        {
            m1.c = s;
            return this;
        }
    }

    public final m a()
        throws IllegalArgumentException
    {
        m m1 = a;
        if (TextUtils.isEmpty(m1.a))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
        if (TextUtils.isEmpty(m1.c))
        {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        if (m1.b == -1)
        {
            throw new IllegalArgumentException("a valid stream type must be specified");
        } else
        {
            return a;
        }
    }

    public on(String s)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Content ID cannot be empty");
        } else
        {
            a = new m(s);
            return;
        }
    }
}
