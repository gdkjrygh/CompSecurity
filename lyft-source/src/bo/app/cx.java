// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.models.IPutIntoJson;
import java.util.UUID;

public final class cx
    implements IPutIntoJson
{

    final UUID a;

    private cx(UUID uuid)
    {
        a = uuid;
    }

    public static cx a()
    {
        return new cx(UUID.randomUUID());
    }

    public static cx a(String s)
    {
        return new cx(UUID.fromString(s));
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
            obj = (cx)obj;
            return a.equals(((cx) (obj)).a);
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
