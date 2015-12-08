// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class eam
    implements dup
{

    private final Context a;
    private final iiv b;
    private final dzi c = new dzi();

    eam(Context context)
    {
        a = context;
        b = (iiv)olm.a(context, iiv);
    }

    private dvx a(dum dum1, dzl dzl1, qdp aqdp[])
    {
        dvz dvz1;
        int i;
        int k;
        int l;
        dum1 = c.a(dum1, dzl1);
        dum1.k = new eap(a);
        dvz1 = new dvz(dum1.a(), dzl1.h);
        k = dzl1.a;
        l = aqdp.length;
        i = 0;
_L2:
        ArrayList arraylist;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        qdp qdp1 = aqdp[i];
        arraylist = new ArrayList();
        dum1 = qdp1.b;
        int i1 = dum1.length;
        for (int j = 0; j < i1; j++)
        {
            dzl1 = dum1[j];
            dzl1 = b.a(k, ((pzd) (dzl1)).a);
            if (dzl1 != null)
            {
                arraylist.add(dzl1);
            }
        }

        dum1 = null;
        dzl1 = null;
        if (qdp1.c != null)
        {
            dum1 = qdp1.c.a;
            dzl1 = qdp1.c.b;
        }
        switch (qdp1.a)
        {
        case 2: // '\002'
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
            break;
        }
        break MISSING_BLOCK_LABEL_238;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        dum1 = new dvy(1, arraylist, dum1, dzl1, (byte)0);
        dvz1.c.add(dum1);
          goto _L3
        dum1 = new dvy(3, arraylist, dum1, dzl1, (byte)0);
        dvz1.c.add(dum1);
          goto _L3
        return new dvx(dvz1.a, dvz1.b, Collections.unmodifiableList(dvz1.c));
    }

    public final hgo a(dum dum1)
    {
        dzl dzl1 = (dzl)dum1.a(dzl);
        if (dzl1.i.b.i == null)
        {
            return null;
        } else
        {
            return new dzg(dum1, a(dum1, dzl1, dzl1.i.b.i.a));
        }
    }

    public final void a(olm olm1)
    {
    }

    public final hhg b()
    {
        return new dwm();
    }
}
