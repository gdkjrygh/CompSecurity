// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;

public final class hsm
{

    private static EnumMap a;

    static List a(hsw hsw1)
    {
        switch (hsn.a[hsw1.ordinal()])
        {
        default:
            hsw1 = String.valueOf(hsw1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(hsw1).length() + 28)).append("Illegal search category : [").append(hsw1).append("]").toString());

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return Arrays.asList(new Integer[] {
                (Integer)a.get(hsw1)
            });

        case 4: // '\004'
            hsw1 = new ArrayList(3);
            break;
        }
        hsw1.add(Integer.valueOf(1));
        hsw1.add(Integer.valueOf(2));
        hsw1.add(Integer.valueOf(3));
        return hsw1;
    }

    static 
    {
        EnumMap enummap = new EnumMap(hsw);
        a = enummap;
        enummap.put(hsw.a, Integer.valueOf(1));
        a.put(hsw.b, Integer.valueOf(2));
        a.put(hsw.c, Integer.valueOf(3));
    }
}
