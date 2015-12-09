// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.ab;
import com.google.android.gms.analytics.internal.am;
import com.google.android.gms.analytics.internal.au;
import com.google.android.gms.analytics.internal.b;
import com.google.android.gms.analytics.internal.bf;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.d.ac;
import com.google.android.gms.d.ak;
import com.google.android.gms.d.g;
import com.google.android.gms.d.z;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.android.gms.analytics:
//            p

public class o extends ac
{

    private final ab b;
    private boolean c;

    public o(ab ab1)
    {
        super(ab1.h(), ab1.d());
        b = ab1;
    }

    protected void a(z z1)
    {
        z1 = (g)z1.b(com/google/android/gms/d/g);
        if (TextUtils.isEmpty(z1.b()))
        {
            z1.b(b.p().b());
        }
        if (c && TextUtils.isEmpty(z1.d()))
        {
            b b1 = b.o();
            z1.d(b1.c());
            z1.a(b1.b());
        }
    }

    public void b(String s)
    {
        u.a(s);
        c(s);
        l().add(new p(b, s));
    }

    public void b(boolean flag)
    {
        c = flag;
    }

    public void c(String s)
    {
        s = p.a(s);
        ListIterator listiterator = l().listIterator();
        do
        {
            if (!listiterator.hasNext())
            {
                break;
            }
            if (s.equals(((ak)listiterator.next()).a()))
            {
                listiterator.remove();
            }
        } while (true);
    }

    ab i()
    {
        return b;
    }

    public z j()
    {
        z z1 = k().a();
        z1.a(b.q().c());
        z1.a(b.r().b());
        b(z1);
        return z1;
    }
}
