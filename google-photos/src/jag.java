// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

public final class jag
{

    private final EnumMap a;

    jag(EnumMap enummap)
    {
        a = new EnumMap(enummap);
    }

    public final List a(jai jai)
    {
        jai = (List)a.get(jai);
        if (jai != null)
        {
            return jai;
        } else
        {
            return Collections.emptyList();
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof jag)
        {
            obj = (jag)obj;
            return a.equals(((jag) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 14)).append("TrashResult{ ").append(s).append("}").toString();
    }
}
