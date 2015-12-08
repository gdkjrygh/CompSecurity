// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class er extends eu
    implements Serializable
{

    private eu a;

    er(eu eu1)
    {
        a = eu1;
    }

    public final eu a()
    {
        return a.a().c();
    }

    public final eu b()
    {
        return this;
    }

    public final eu c()
    {
        return a.c();
    }

    public final int compare(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return 0;
        }
        if (obj == null)
        {
            return -1;
        }
        if (obj1 == null)
        {
            return 1;
        } else
        {
            return a.compare(obj, obj1);
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof er)
        {
            obj = (er)obj;
            return a.equals(((er) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode() ^ 0x39153a74;
    }

    public final String toString()
    {
        String s = String.valueOf(String.valueOf(a));
        return (new StringBuilder(s.length() + 13)).append(s).append(".nullsFirst()").toString();
    }
}
