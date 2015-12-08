// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class hsa
{

    public static final hsc a;
    private static hsc b;
    private static hsc c;

    public static List a(boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(a);
        arraylist.add(b);
        if (flag)
        {
            arraylist.add(c);
        }
        return Collections.unmodifiableList(arraylist);
    }

    static 
    {
        a = new hsc(hsb.a);
        b = new hsc(hsb.b);
        c = new hsc(hsb.c);
    }
}
