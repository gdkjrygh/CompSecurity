// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.a;
import com.google.android.gms.analytics.internal.ab;
import com.google.android.gms.analytics.internal.ai;
import com.google.android.gms.analytics.internal.t;
import com.google.android.gms.analytics.internal.y;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.ie;
import com.google.android.gms.internal.jk;
import com.google.android.gms.internal.jn;
import com.google.android.gms.internal.jp;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.android.gms.analytics:
//            i

public class h extends jn
{

    private final t b;
    private boolean c;

    public h(t t1)
    {
        super(t1.h(), t1.d());
        b = t1;
    }

    protected void a(jk jk1)
    {
        jk1 = (ie)jk1.b(com/google/android/gms/internal/ie);
        if (TextUtils.isEmpty(jk1.b()))
        {
            jk1.b(b.p().b());
        }
        if (c && TextUtils.isEmpty(jk1.d()))
        {
            a a1 = b.o();
            jk1.d(a1.c());
            jk1.a(a1.b());
        }
    }

    public void b(String s)
    {
        z.a(s);
        c(s);
        n().add(new i(b, s));
    }

    public void b(boolean flag)
    {
        c = flag;
    }

    public void c(String s)
    {
        s = com.google.android.gms.analytics.i.a(s);
        ListIterator listiterator = n().listIterator();
        do
        {
            if (!listiterator.hasNext())
            {
                break;
            }
            if (s.equals(((jp)listiterator.next()).a()))
            {
                listiterator.remove();
            }
        } while (true);
    }

    t k()
    {
        return b;
    }

    public jk l()
    {
        jk jk1 = m().a();
        jk1.a(b.q().c());
        jk1.a(b.r().b());
        b(jk1);
        return jk1;
    }
}
