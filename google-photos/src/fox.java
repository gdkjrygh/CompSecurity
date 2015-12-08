// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class fox
{

    private static final List a;
    private static final List b;
    private static final List c;

    public static int a(faz faz1)
    {
        switch (foy.a[faz1.ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return b.pV;

        case 2: // '\002'
            return b.pU;

        case 3: // '\003'
            return b.pZ;
        }
    }

    public static List a(boolean flag, boolean flag1)
    {
        if (flag)
        {
            if (flag1)
            {
                return c;
            } else
            {
                return b;
            }
        } else
        {
            return a;
        }
    }

    public static List a(boolean flag, boolean flag1, faz faz1)
    {
        ArrayList arraylist = new ArrayList(a(flag, flag1));
        arraylist.remove(faz1);
        return arraylist;
    }

    static 
    {
        a = Collections.singletonList(faz.b);
        Object obj = Collections.unmodifiableList(Arrays.asList(new faz[] {
            faz.a, faz.b, faz.c
        }));
        b = ((List) (obj));
        obj = new ArrayList(((java.util.Collection) (obj)));
        Collections.reverse(((List) (obj)));
        c = Collections.unmodifiableList(((List) (obj)));
    }
}
