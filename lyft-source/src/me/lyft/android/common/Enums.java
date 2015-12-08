// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package me.lyft.android.common:
//            Objects

public class Enums
{

    public Enums()
    {
    }

    public static Enum valueOf(Class class1, String s, Enum enum)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return enum;
_L2:
        Enum enum1;
        class1 = EnumSet.allOf(class1).iterator();
        do
        {
            if (!class1.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            enum1 = (Enum)class1.next();
        } while (!Objects.equals(enum1.name().toLowerCase(), s.toLowerCase()));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return enum1;
    }
}
