// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public abstract class fyu
{

    private static Map a = new HashMap();
    public final String b;
    public final fzi c;
    public final Class d;

    public fyu(Class class1, String s, fzi fzi)
    {
        if (a.containsKey(s))
        {
            throw new AssertionError((new StringBuilder("There can be only one feature flag instance with identifier ")).append(s).toString());
        } else
        {
            a.put(s, this);
            ctz.a(class1);
            d = class1;
            c = fzi;
            b = s;
            return;
        }
    }

    public abstract Serializable a();

    public abstract Serializable b_(String s);

}
