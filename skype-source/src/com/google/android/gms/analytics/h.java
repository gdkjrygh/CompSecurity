// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.a;
import com.google.android.gms.analytics.internal.aa;
import com.google.android.gms.analytics.internal.ah;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.analytics.internal.x;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.hu;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.jd;
import com.google.android.gms.internal.jf;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.android.gms.analytics:
//            i

public class h extends jd
{

    private final s b;
    private boolean c;

    public h(s s1)
    {
        super(s1.g(), s1.c());
        b = s1;
    }

    protected final void a(jb jb1)
    {
        jb1 = (hu)jb1.b(com/google/android/gms/internal/hu);
        if (TextUtils.isEmpty(jb1.b()))
        {
            jb1.b(b.o().b());
        }
        if (c && TextUtils.isEmpty(jb1.d()))
        {
            a a1 = b.n();
            jb1.d(a1.c());
            jb1.a(a1.b());
        }
    }

    public final void a(boolean flag)
    {
        c = flag;
    }

    public final void b(String s1)
    {
        y.a(s1);
        Uri uri = com.google.android.gms.analytics.i.a(s1);
        ListIterator listiterator = l().listIterator();
        do
        {
            if (!listiterator.hasNext())
            {
                break;
            }
            if (uri.equals(((jf)listiterator.next()).a()))
            {
                listiterator.remove();
            }
        } while (true);
        l().add(new i(b, s1));
    }

    final s i()
    {
        return b;
    }

    public final jb j()
    {
        jb jb1 = k().a();
        jb1.a(b.p().b());
        jb1.a(b.q().b());
        m();
        return jb1;
    }
}
