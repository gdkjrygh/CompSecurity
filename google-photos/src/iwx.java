// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class iwx
    implements mti, omb, opv
{

    private final ar a;
    private final Set b = new HashSet();
    private mtj c;
    private elh d;
    private mmr e;
    private dgk f;

    iwx(ar ar1, opd opd1)
    {
        a = ar1;
        opd1.a(this);
    }

    private void a(hyw hyw1, iww iww1)
    {
        int i = hyw1.a.size();
        dgg dgg1;
        if (iww1 == iww.a)
        {
            iww1 = a.getResources().getQuantityString(b.Bj, i, new Object[] {
                Integer.valueOf(i)
            });
        } else
        if (iww1 == iww.b)
        {
            iww1 = a.getResources().getQuantityString(b.Bm, i, new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            throw new IllegalArgumentException("Illegal messageType.");
        }
        dgg1 = f.a().a((int)dgh.b.c);
        dgg1.d = iww1;
        f.a(dgg1.a());
        for (iww1 = b.iterator(); iww1.hasNext(); ((iwy)iww1.next()).a(hyw1)) { }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (mtj)olm1.a(mtj);
        c.a(this);
        d = (elh)olm1.a(elh);
        e = (mmr)olm1.a(mmr);
        f = (dgk)olm1.a(dgk);
    }

    public final void a(hyw hyw1)
    {
        hyw1 = new ArrayList(hyw1.a);
        Object obj = (iyi)b.a(a, iyi, hyw1);
        obj = (eka)d.a(obj.getClass());
        p.b(obj, "ActionConfirmation cannot be null.");
        ((eka) (obj)).a(a, hyw1);
    }

    public final void a(hyw hyw1, iww iww1, gaw gaw)
    {
        String s;
        if (iww1 == iww.a)
        {
            s = a.getResources().getQuantityString(b.Bi, hyw1.a.size());
        } else
        if (iww1 == iww.b)
        {
            s = a.getResources().getQuantityString(b.Bl, hyw1.a.size());
        } else
        {
            throw new IllegalArgumentException("Illegal messageType.");
        }
        hyw1 = new hyw(new ArrayList(hyw1.a));
        hyw1 = new iwv(e.d(), hyw1, iww1, gaw);
        c.b.a(s, ((mtf) (hyw1)).d);
        c.a(hyw1);
        for (hyw1 = b.iterator(); hyw1.hasNext(); hyw1.next()) { }
    }

    public final void a(iwy iwy1)
    {
        b.add(iwy1);
    }

    public final void a(String s, mue mue1, mua mua1)
    {
        while (mue1 == null || s == null || a.isFinishing() || !TextUtils.equals(s, "com.google.android.apps.photos.trash.delete-action-tag")) 
        {
            return;
        }
        s = (hyw)mue1.a().getParcelable("acted_media");
        mua1 = (iww)mue1.a().getSerializable("message_type");
        if (mue1.c())
        {
            mue1 = mue1.c;
            if (mue1 instanceof fap)
            {
                ixa.a(s, ((fap)mue1).a, iyi).a(a.c(), "com.google.android.apps.photos.trash.FileNotDeletableDialog");
                return;
            }
            int i = ((hyw) (s)).a.size();
            if (mua1 == iww.a)
            {
                s = a.getResources().getQuantityString(b.Bh, i, new Object[] {
                    Integer.valueOf(i)
                });
            } else
            if (mua1 == iww.b)
            {
                s = a.getResources().getQuantityString(b.Bk, i, new Object[] {
                    Integer.valueOf(i)
                });
            } else
            {
                throw new IllegalArgumentException("Illegal messageType.");
            }
            mue1 = f.a().a((int)dgh.b.c);
            mue1.d = s;
            f.a(mue1.a());
            return;
        } else
        {
            a(((hyw) (s)), ((iww) (mua1)));
            return;
        }
    }

    public final void b(iwy iwy1)
    {
        b.remove(iwy1);
    }
}
