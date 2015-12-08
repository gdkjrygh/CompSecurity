// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class ebx
    implements elf
{

    private static final ekz a = (new ela()).a();
    private final ebr b;
    private final elp c;
    private final Context d;
    private final noz e;

    ebx(Context context, ebr ebr1)
    {
        d = context;
        b = ebr1;
        c = new elp(context, ebn);
        e = noz.a(context, 4, "NotificationHandler", new String[0]);
    }

    private List a(ebv ebv1, ekw ekw, ekk ekk)
    {
        Object obj;
        ArrayList arraylist;
        nsx nsx1;
        nsx1 = b.a(ebv1.a, ebv1.c);
        arraylist = null;
        obj = arraylist;
        if (ebv1.b == 11)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        obj = arraylist;
        if (ebv1.b != 12)
        {
            obj = b(ebv1.d, ekw, ekk);
        }
        arraylist = new ArrayList();
        if (nsx1.moveToFirst() && (nsx1.f() != 3 && nsx1.f() != 5)) goto _L2; else goto _L1
_L1:
        ebv1 = arraylist;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        int i;
        int k;
        i = ((List) (obj)).size();
        k = ebv1.size();
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        obj = ebv1;
        Object obj1;
        nsx1.close();
        return ((List) (obj));
_L2:
        if ((obj1 = ebr.a(nsx1)) == null) goto _L1; else goto _L3
_L3:
        if (((ozs) (obj1)).b != null && ((ozs) (obj1)).b.a != null) goto _L4; else goto _L1
_L4:
        pzx apzx[];
        apzx = ((ozs) (obj1)).b.d;
        k = apzx.length;
        HashSet hashset;
        elm elm;
        for (int j = 0; j >= k; j++)
        {
            break MISSING_BLOCK_LABEL_471;
        }

        ekw = apzx[j];
        if (((pzx) (ekw)).a != ebv1.b)
        {
            break MISSING_BLOCK_LABEL_482;
        }
_L13:
        hashset = new HashSet();
        if (ekw == null) goto _L6; else goto _L5
_L5:
        if (((pzx) (ekw)).b != null && ((pzx) (ekw)).b.c != null) goto _L7; else goto _L6
_L6:
        ekw = ((ozs) (obj1)).b.a;
        k = ekw.length;
        j = 0;
_L9:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(((qgg) (ekw[j])).b.a);
        j++;
        if (true) goto _L9; else goto _L8
_L7:
        ekw = ((pzx) (ekw)).b.c;
        k = ekw.length;
        j = 0;
_L10:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(((qev) (ekw[j])).a);
        j++;
        if (true) goto _L10; else goto _L8
_L8:
        ekw = ((ozs) (obj1)).b.a;
        k = ekw.length;
        j = 0;
_L12:
        if (j >= k) goto _L1; else goto _L11
_L11:
        obj1 = ekw[j];
        if (hashset.contains(((qgg) (obj1)).b.a))
        {
            elm = c.a(ebv1.a, obj1, ekk);
            arraylist.add(new ebt(ebv1.a, ((qgg) (obj1)).b.a, ebv1.c, elm, b.a(((qgg) (obj1))), ebv1, nsx1.h().longValue()));
        }
        j++;
          goto _L12
          goto _L1
        ebv1;
        nsx1.close();
        throw ebv1;
        ekw = null;
          goto _L13
    }

    private List b(ekq ekq, ekw ekw, ekk ekk)
    {
        if (ekq == null)
        {
            return null;
        }
        ekv ekv1 = b.a(d, ekq);
        try
        {
            ekq = (List)ekv1.a(ekq, ekw, ekk).a();
        }
        // Misplaced declaration of an exception variable
        catch (ekq ekq)
        {
            return null;
        }
        return ekq;
    }

    public final long a(ekq ekq, ekw ekw)
    {
        throw new UnsupportedOperationException();
    }

    public final Class a()
    {
        return ebv;
    }

    public final volatile List a(ekq ekq, ekw ekw, ekk ekk)
    {
        return a((ebv)ekq, ekw, ekk);
    }

    public final ekz b()
    {
        return a;
    }

    public final ekz c()
    {
        throw new UnsupportedOperationException();
    }

}
