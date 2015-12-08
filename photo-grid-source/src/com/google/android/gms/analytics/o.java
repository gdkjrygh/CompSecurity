// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.aa;
import com.google.android.gms.analytics.internal.al;
import com.google.android.gms.analytics.internal.as;
import com.google.android.gms.analytics.internal.b;
import com.google.android.gms.analytics.internal.bd;
import com.google.android.gms.c.c;
import com.google.android.gms.c.e;
import com.google.android.gms.c.l;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.sz;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.android.gms.analytics:
//            p

public class o extends e
{

    private final aa b;
    private boolean c;

    public o(aa aa1)
    {
        super(aa1.g(), aa1.c());
        b = aa1;
    }

    protected final void a(c c1)
    {
        c1 = (sz)c1.b(com/google/android/gms/internal/sz);
        if (TextUtils.isEmpty(c1.b()))
        {
            c1.b(b.o().b());
        }
        if (c && TextUtils.isEmpty(c1.d()))
        {
            b b1 = b.n();
            c1.d(b1.c());
            c1.a(b1.b());
        }
    }

    public final void a(boolean flag)
    {
        c = flag;
    }

    public final void b(String s)
    {
        bl.a(s);
        Uri uri = p.a(s);
        ListIterator listiterator = i().listIterator();
        do
        {
            if (!listiterator.hasNext())
            {
                break;
            }
            if (uri.equals(((l)listiterator.next()).a()))
            {
                listiterator.remove();
            }
        } while (true);
        i().add(new p(b, s));
    }

    final aa f()
    {
        return b;
    }

    public final c g()
    {
        c c1 = h().a();
        c1.a(b.p().b());
        c1.a(b.q().b());
        j();
        return c1;
    }
}
