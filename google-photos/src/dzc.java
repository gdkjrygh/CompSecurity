// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class dzc
    implements nrf
{

    private final Context a;
    private final dze b;
    private final icp c;
    private final eci d;

    public dzc(Context context)
    {
        a = context;
        b = (dze)olm.a(context, dze);
        c = (icp)olm.a(context, icp);
        d = (eci)olm.a(context, eci);
    }

    private static Collection a(nqs anqs[])
    {
        HashSet hashset = new HashSet(anqs.length);
        int j = anqs.length;
        for (int i = 0; i < j; i++)
        {
            hashset.add(anqs[i].a);
        }

        return hashset;
    }

    public final void a(int i, nqs anqs[])
    {
        int j;
        int k;
        k = anqs.length;
        j = 0;
_L3:
        if (j >= k) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = b.a(anqs[j].b);
        Object obj1 = d.a(((pzt) (obj)));
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = (dzd)b.a(dzv.a(((pzx) (obj1)).a));
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((dzd) (obj1)).a(i, ((pzt) (obj)));
_L4:
        ArrayList arraylist;
        ((Intent) (obj)).setFlags(0x10000000);
        arraylist = new ArrayList(anqs.length);
        int l = anqs.length;
        for (i = 0; i < l; i++)
        {
            nqs nqs1 = anqs[i];
            oyb oyb1 = nqs1.c;
            if (oyb1 == null || oyb1.a == null)
            {
                continue;
            }
            String as[] = nqs1.c.a;
            int i1 = as.length;
            for (j = 0; j < i1; j++)
            {
                arraylist.add(as[j]);
            }

        }

        break MISSING_BLOCK_LABEL_226;
        j++;
          goto _L3
_L2:
        obj = b.a.a.a(i, faz.a);
        ((Intent) (obj)).putExtra("account_id", i);
          goto _L4
        anqs = a(anqs);
        c.a(((Intent) (obj)), arraylist, anqs);
        a.startActivity(((Intent) (obj)));
        return;
    }
}
