// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public final class epl
    implements epn
{

    static final String a[] = {
        "logged_in", "product_type", "country_code", "current_user", "connected"
    };
    final Context b;
    private final an d = new an() {

        private epl a;

        public final da a(Bundle bundle)
        {
            return new cu(a.b, dtw.a, epl.a, null, null);
        }

        public final void a()
        {
            a.a(epn.c);
        }

        public final void a(Object obj)
        {
            obj = (Cursor)obj;
            if (obj != null && ((Cursor) (obj)).moveToFirst())
            {
                epl epl1 = a;
                boolean flag = gcw.a(((Cursor) (obj)), "logged_in");
                String s = gcw.a(((Cursor) (obj)), "current_user", null);
                String s1 = gcw.a(((Cursor) (obj)), "product_type", null);
                String s2 = gcw.a(((Cursor) (obj)), "country_code", null);
                gcw.a(((Cursor) (obj)), "connected");
                epl1.a(new epm(flag, s, s1, s2));
            }
        }

            
            {
                a = epl.this;
                super();
            }
    };
    private final am e;
    private int f;
    private final Set g = new HashSet();
    private epo h;

    public epl(Context context, am am1)
    {
        h = c;
        b = (Context)ctz.a(context);
        e = (am)ctz.a(am1);
        f = 0x7f1100a0;
    }

    public final void a()
    {
        e.a(f, null, d);
    }

    final void a(epo epo)
    {
        h = epo;
        cuv.a(g, new cua(epo) {

            private epo a;

            public final volatile boolean a(Object obj)
            {
                obj = (epp)obj;
                return obj != null && ((epp) (obj)).a(a);
            }

            
            {
                a = epo;
                super();
            }
        });
    }

    public final void a(epp epp1)
    {
        ctz.a(epp1);
        if (!epp1.a(h))
        {
            g.add(epp1);
        }
    }

    public final void b()
    {
        e.a(f);
    }

    public final void c()
    {
        e.a(f);
        g.clear();
    }

}
