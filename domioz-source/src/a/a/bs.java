// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.d.c;
import java.util.UUID;

public final class bs
    implements c
{

    final UUID a;

    private bs(UUID uuid)
    {
        a = uuid;
    }

    public static bs a(String s)
    {
        return new bs(UUID.fromString(s));
    }

    public static bs b()
    {
        return new bs(UUID.randomUUID());
    }

    public final Object a()
    {
        return a.toString();
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (bs)obj;
            return a.equals(((bs) (obj)).a);
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return a.toString();
    }
}
