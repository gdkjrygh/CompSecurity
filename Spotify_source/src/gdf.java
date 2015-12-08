// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public final class gdf
{

    private final Map a;
    private final boolean b;

    private gdf(Class class1)
    {
        this(class1, false);
    }

    public gdf(Class class1, boolean flag)
    {
        ctz.a(class1);
        class1 = (Enum[])class1.getEnumConstants();
        a = Maps.a(class1.length);
        int j = class1.length;
        for (int i = 0; i < j; i++)
        {
            Enum enum = class1[i];
            a.put(enum.name().toUpperCase(Locale.US), Optional.b(enum));
        }

        b = flag;
    }

    public static gdf a(Class class1)
    {
        return new gdf(class1);
    }

    public final Optional a(String s)
    {
        if (s != null)
        {
            return b(s);
        } else
        {
            return Optional.e();
        }
    }

    public final Optional b(String s)
    {
        String s1 = s;
        if (b)
        {
            s1 = s.replace('-', '_');
        }
        s = (Optional)a.get(((String)ctz.a(s1)).toUpperCase(Locale.US));
        if (s != null)
        {
            return s;
        } else
        {
            return Optional.e();
        }
    }
}
