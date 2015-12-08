// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;

import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package dagger.a:
//            b

public abstract class d
{

    final Map b = new LinkedHashMap();

    public d()
    {
    }

    public final b a(String s, b b1)
    {
        b b2 = (b)b.put(s, b1);
        if (b2 != null)
        {
            b.put(s, b2);
            throw new IllegalArgumentException((new StringBuilder("Duplicate:\n    ")).append(b2).append("\n    ").append(b1).toString());
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(b.toString()).toString();
    }
}
