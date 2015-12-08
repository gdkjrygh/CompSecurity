// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class jbh
    implements jbg, mti, omb, opn, opv
{

    boolean a;
    private final am b;
    private olm c;
    private mmr d;
    private mtj e;
    private dgk f;

    public jbh(am am1, opd opd1)
    {
        b = am1;
        opd1.a(this);
    }

    public final jbh a(olm olm1)
    {
        c = olm1;
        olm1.a(jbh, this);
        olm1.a(jbg, this);
        return this;
    }

    public final void a(int i)
    {
        jbf.b(i).a(b.h(), "empty_trash");
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = (mmr)olm1.a(mmr);
        e = (mtj)olm1.a(mtj);
        e.a(this);
        f = (dgk)olm1.a(dgk);
    }

    public final void a(String s, mue mue1, mua mua1)
    {
        while (mue1 == null || s == null || !s.equals("com.google.android.apps.photos.trash.EMPTY_TRASH_TASK") || mue1.c()) 
        {
            return;
        }
        s = (jbj)c.b(jbj);
        if (s != null)
        {
            s.a(mue1.a().getInt("extra_account_id"));
        }
        s = f.a().a((int)dgh.b.c).a(b.BM, new Object[0]);
        f.a(s.a());
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            jbi jbi1 = new jbi(d.d());
            if (a)
            {
                e.b.a(b.a(b.BN), ((mtf) (jbi1)).d);
            }
            e.a(jbi1);
        }
    }

    public final void c()
    {
        e.b(this);
    }
}
