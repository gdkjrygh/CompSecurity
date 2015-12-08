// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class gzt
    implements iwj
{

    private final int a;

    public gzt(int i)
    {
        a = i;
    }

    public final Object a(Object obj)
    {
        obj = (gai)obj;
        int j = ((gai) (obj)).a();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new frj(((gai) (obj)).a(i), i % a));
        }

        return arraylist;
    }
}
