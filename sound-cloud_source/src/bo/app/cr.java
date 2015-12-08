// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.d.e;
import java.util.UUID;

public final class cr
    implements e
{

    final UUID a;

    private cr(UUID uuid)
    {
        a = uuid;
    }

    public static cr a()
    {
        return new cr(UUID.randomUUID());
    }

    public static cr a(String s)
    {
        return new cr(UUID.fromString(s));
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
            obj = (cr)obj;
            return a.equals(((cr) (obj)).a);
        }
    }

    public final Object forJsonPut()
    {
        return a.toString();
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
