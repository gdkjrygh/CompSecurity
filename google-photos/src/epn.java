// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public final class epn
    implements mti, omb, opt, opv
{

    private static final EnumSet a;
    private final epp b;
    private final mwx c;
    private int d;
    private epq e;
    private mtj f;
    private noe g;
    private boolean h;
    private ifj i;
    private final Runnable j = new epo(this);
    private mwz k;

    public epn(opd opd1, epp epp1)
    {
        opd1.a(this);
        b = epp1;
        c = new mwx(opd1);
    }

    static void a(epn epn1, List list)
    {
        epn1.a(list);
    }

    private void a(List list)
    {
        if (h)
        {
            h = false;
            b.a(list);
        }
    }

    private boolean a()
    {
        return i != null && i.a(d);
    }

    static boolean a(epn epn1)
    {
        return epn1.c();
    }

    static boolean b(epn epn1)
    {
        return epn1.a();
    }

    static epq c(epn epn1)
    {
        return epn1.e;
    }

    private boolean c()
    {
        return g.b() && g.a();
    }

    public final void X_()
    {
label0:
        {
            if (!h)
            {
                if (!e.a)
                {
                    break label0;
                }
                b.a(e.a(c(), a()));
            }
            return;
        }
        h = true;
        eqf eqf1 = new eqf(d, a);
        f.a(eqf1);
        k = c.a(j, 1000L);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = ((mmr)olm1.a(mmr)).d();
        e = (epq)olm1.a(epq);
        f = ((mtj)olm1.a(mtj)).a(this);
        g = (noe)olm1.a(noe);
        i = (ifj)olm1.a(ifj);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (s.equals("ReadPhotosFeaturesTask") && mue1 != null && !mue1.c())
        {
            if (k != null)
            {
                c.a(k);
                k = null;
            }
            s = mue1.a().getParcelableArrayList("manual_awesome_types");
            mue1 = e;
            mue1.a = true;
            mue1 = Arrays.asList(new epf[] {
                ((epq) (mue1)).b, ((epq) (mue1)).c, ((epq) (mue1)).d, ((epq) (mue1)).e, ((epq) (mue1)).g, ((epq) (mue1)).f
            }).iterator();
            do
            {
                if (!mue1.hasNext())
                {
                    break;
                }
                mua = (epf)mue1.next();
                if (((epf) (mua)).c > 0)
                {
                    epf epf1 = epq.a(((epf) (mua)).c, s);
                    if (epf1 != null && epf1.e != null)
                    {
                        mua.e = epf1.e;
                    }
                } else
                if (((epf) (mua)).d > 0)
                {
                    epf epf2 = epq.b(((epf) (mua)).d, s);
                    if (epf2 != null && epf2.e != null)
                    {
                        mua.e = epf2.e;
                    }
                }
            } while (true);
            a(e.a(c(), a()));
        }
    }

    static 
    {
        a = EnumSet.of(eqd.b);
    }
}
