// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;

public final class eej
    implements omb, omz, oos, oov, ops, opv
{

    RecyclerView a;
    boolean b;
    final aep c = new eek(this);
    private final HashSet d = new HashSet();
    private final int e;
    private int f;
    private int g;

    public eej(opd opd1, int i)
    {
        f = -1;
        g = -1;
        b = false;
        opd1.a(this);
        e = i;
    }

    public final void a()
    {
        if (!b)
        {
            return;
        } else
        {
            aen aen1 = a.d;
            p.b(aen1, "RecyclerView should have an adapter");
            aen1.b(c);
            b = false;
            return;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        if (bundle != null && bundle.getLongArray("impression_logged") != null)
        {
            context = bundle.getLongArray("impression_logged");
            int j = context.length;
            for (int i = 0; i < j; i++)
            {
                long l = context[i];
                d.add(Long.valueOf(l));
            }

        }
        ((omx)olm1.a(omx)).a(this);
    }

    public final void a(View view, Bundle bundle)
    {
        a = (RecyclerView)view.findViewById(e);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            b(false);
            return;
        } else
        {
            d.clear();
            return;
        }
    }

    void b(boolean flag)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int k;
        adi adi1 = (adi)a.e;
        k = adi1.c();
        i = adi1.d();
        if (k == -1 || i == -1 || flag && k == f && i == g) goto _L1; else goto _L3
_L3:
        int l;
        l = Math.min(i, a.d.a() - 1);
        i = k;
_L9:
        long l1;
        if (i > l)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        l1 = a.d.b(i);
        if (d.contains(Long.valueOf(l1))) goto _L5; else goto _L4
_L4:
        RecyclerView recyclerview;
        int j;
        int i1;
        d.add(Long.valueOf(l1));
        recyclerview = a;
        i1 = recyclerview.c.b();
        j = 0;
_L10:
        afn afn1;
        if (j >= i1)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        afn1 = RecyclerView.b(recyclerview.c.d(j));
        if (afn1 == null || afn1.d != l1) goto _L7; else goto _L6
_L6:
        if (afn1 == null) goto _L1; else goto _L8
_L8:
        mry.a(afn1.a, -1);
_L5:
        i++;
          goto _L9
_L7:
        j++;
          goto _L10
        afn1 = null;
          goto _L6
        f = k;
        g = l;
        return;
          goto _L9
    }

    public final void e(Bundle bundle)
    {
        long al[] = new long[d.size()];
        Iterator iterator = d.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            al[i] = ((Long)iterator.next()).longValue();
        }

        bundle.putLongArray("impression_logged", al);
    }
}
