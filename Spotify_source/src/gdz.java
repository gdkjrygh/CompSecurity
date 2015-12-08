// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.Assertion;

public abstract class gdz
{

    private Object a;

    public gdz()
    {
    }

    public abstract Object a();

    public final Object b()
    {
        if (a == null)
        {
            Object obj = a();
            Assertion.a(obj);
            a = obj;
        }
        return a;
    }

    public boolean equals(Object obj)
    {
        return b().equals(obj);
    }

    public int hashCode()
    {
        return b().hashCode();
    }

    public String toString()
    {
        return b().toString();
    }
}
