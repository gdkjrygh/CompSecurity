// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class fhy
{

    public String a;
    public String b;

    public fhy(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final boolean a()
    {
        return !TextUtils.isEmpty(a) && !TextUtils.isEmpty(b);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof fhy))
            {
                return false;
            }
            obj = (fhy)obj;
            if (!a.equals(((fhy) (obj)).a))
            {
                return false;
            }
            if (!b.equals(((fhy) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return a.hashCode() * 31 + b.hashCode();
    }
}
