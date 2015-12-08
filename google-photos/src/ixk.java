// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ixk
    implements mti, omb, opv
{

    public final ar a;
    public final Set b = new HashSet();
    public mtj c;
    public mmr d;
    private dgk e;

    ixk(ar ar1, opd opd1)
    {
        a = ar1;
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (mtj)olm1.a(mtj);
        c.a(this);
        d = (mmr)olm1.a(mmr);
        e = (dgk)olm1.a(dgk);
    }

    public final void a(ixl ixl1)
    {
        b.add(ixl1);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (mue1 != null && s != null && !a.isFinishing() && TextUtils.equals(s, "com.google.android.apps.photos.trash.restore-action-tag"))
        {
            s = (hyw)mue1.a().getParcelable("acted_media");
            if (mue1.c())
            {
                int i = ((hyw) (s)).a.size();
                s = a.getResources().getQuantityString(b.Br, i, new Object[] {
                    Integer.valueOf(i)
                });
                mue1 = e.a().a((int)dgh.b.c);
                mue1.d = s;
                e.a(mue1.a());
                return;
            }
            int j = ((hyw) (s)).a.size();
            mue1 = a.getResources().getQuantityString(b.Bs, j, new Object[] {
                Integer.valueOf(j)
            });
            mua = e.a().a((int)dgh.b.c);
            mua.d = mue1;
            e.a(mua.a());
            mue1 = b.iterator();
            while (mue1.hasNext()) 
            {
                ((ixl)mue1.next()).b(s);
            }
        }
    }

    public final void b(ixl ixl1)
    {
        b.remove(ixl1);
    }
}
