// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class buo
    implements buh
{

    private bup a;

    public buo(bup bup1)
    {
        a = bup1;
    }

    public static List d()
    {
        ArrayList arraylist = new ArrayList();
        bup abup[] = bup.values();
        int j = abup.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new buo(abup[i]));
        }

        return arraylist;
    }

    public final String a()
    {
        return a.name();
    }

    public final bri b()
    {
        return a.a();
    }

    public final String c()
    {
        return a.b();
    }
}
