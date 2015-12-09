// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.util.Iterator;
import java.util.List;

public final class afk
    implements adx
{

    private static final ahn b = ahn.a("InternalInstrumentCluster");
    private final agm a;

    public afk(String s)
    {
        a = (agm)aia.a(s).a(agj);
    }

    public final void a(List list)
    {
        b.b("setPlaylist - items.size() = %s , selectedIndex = %s", new Object[] {
            Integer.valueOf(list.size()), Integer.valueOf(0)
        });
        int i = list.size();
        String as[] = new String[i];
        String as1[] = new String[i];
        String as2[] = new String[i];
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            adz adz1 = (adz)iterator.next();
            int j = list.indexOf(adz1);
            as[j] = adz1.a();
            as1[j] = adz1.b();
            as2[j] = adz1.c();
        }

        list = a;
        list = new Intent((new StringBuilder()).append(((agm) (list)).a).append("#setPlaylist(java.lang.String[] arg0, java.lang.String[] arg1, java.lang.String[] arg2, int arg3)").toString());
        list.putExtra("arg0", as);
        list.putExtra("arg1", as1);
        list.putExtra("arg2", as2);
        list.putExtra("arg3", 0);
        agm.a(list);
    }

}
