// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

final class eqg
    implements nul
{

    private final Collection a;
    private final String b;

    public eqg(String s, Collection collection)
    {
        a = collection;
        b = s;
    }

    public final Collection a()
    {
        ArrayList arraylist = new ArrayList();
        hpk hpk;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(hpk))
        {
            hpk = ((hpg)((ekp)iterator.next()).a(hpg)).a(b);
            p.a(hpk);
        }

        return arraylist;
    }

    public final String toString()
    {
        String s = String.valueOf("CollectionMediaProvider {mediaList: ");
        String s1 = String.valueOf(a);
        String s2 = b;
        return (new StringBuilder(String.valueOf(s).length() + 22 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(",collectionMediaKey: ").append(s2).append("}").toString();
    }
}
