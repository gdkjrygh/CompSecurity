// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class hzd
    implements mti, omb, opv
{

    public static final String a;
    public static final String b;
    public static final String c;
    private static final Set i;
    public final Set d = Collections.newSetFromMap(new jk());
    public final Set e = new HashSet();
    public final jp f = new hze(this, 25);
    public mtj g;
    public hzh h;
    private hyp j;

    hzd(opd opd1)
    {
        opd1.a(this);
    }

    static Set a(hzd hzd1)
    {
        return hzd1.e;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        g = ((mtj)olm1.a(mtj)).a(this);
        h = (hzh)olm1.a(hzh);
        j = (hyp)olm1.a(hyp);
    }

    public void a(ehr ehr1)
    {
        if (!d.contains(ehr1))
        {
            d.add(ehr1);
            g.a(new ele(ehr1.a, ehr1.b, ekk.a, c));
        }
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (mue1 != null && i.contains(s) && !mue1.c())
        {
            mua = mue1.a().getParcelableArrayList("com.google.android.apps.photos.core.media_list");
            mue1 = new ehr((ekq)mue1.a().getParcelable("com.google.android.apps.photos.core.media_collection"), (ekw)mue1.a().getParcelable("com.google.android.apps.photos.core.query_options"));
            e.remove(mue1);
            f.a(mue1, mua);
            if (a.equals(s))
            {
                s = h;
                ekp ekp1;
                for (mue1 = mua.iterator(); mue1.hasNext(); ((hzh) (s)).b.a(ekp1))
                {
                    ekp1 = (ekp)mue1.next();
                }

                s.b(mua);
                s.d();
                j.a();
                return;
            }
            if (b.equals(s))
            {
                s = h;
                ekp ekp2;
                for (mue1 = mua.iterator(); mue1.hasNext(); ((hzh) (s)).b.b(ekp2))
                {
                    ekp2 = (ekp)mue1.next();
                }

                s.a(mua);
                s.d();
                j.a();
                return;
            }
            if (c.equals(s))
            {
                d.remove(mue1);
                if (h.b.a.size() > 0)
                {
                    h.a.b();
                    return;
                }
            } else
            {
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = "Unknown task tag? ".concat(s);
                } else
                {
                    s = new String("Unknown task tag? ");
                }
                throw new IllegalArgumentException(s);
            }
        }
    }

    static 
    {
        a = ele.a(b.yo);
        b = ele.a(b.yn);
        c = ele.a(b.ym);
        i = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
            a, b, c
        })));
    }
}
