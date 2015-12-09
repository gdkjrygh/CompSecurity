// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.HashMap;

public final class fyq extends fyu
{

    public HashMap a;
    private gdf e;
    private Enum f;

    public fyq(Class class1, Enum enum, String s, fzi fzi)
    {
        super(class1, s, fzi);
        cvp.a(enum);
        cvp.a(ggi.a(enum.getClass(), class1), "Type and Value must be of the same class");
        f = enum;
        e = new gdf(class1, true);
        a = Maps.a(((Enum[])class1.getEnumConstants()).length);
    }

    public final Serializable a()
    {
        return f;
    }

    public final Serializable b_(String s)
    {
        Optional optional = e.b(s);
        if (optional.b())
        {
            a.put(optional.c(), s);
        }
        return (Serializable)optional.a(f);
    }
}
