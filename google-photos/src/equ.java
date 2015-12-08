// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class equ
    implements nul
{

    private final Collection a;

    public equ(Collection collection)
    {
        a = collection;
    }

    public final Collection a()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(((hpg)((ekp)iterator.next()).a(hpg)).b())) { }
        return arraylist;
    }

    public final String toString()
    {
        String s = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 33)).append("SimpleMediaProvider {mediaList: ").append(s).append("}").toString();
    }
}
