// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.d;

import android.content.Context;
import android.os.Handler;
import kik.android.util.ar;

// Referenced classes of package kik.android.d:
//            b, d, j

final class i extends b
{

    final d a;

    i(d d1, Context context, String s, Boolean boolean1, Boolean aboolean[], ar ar)
    {
        a = d1;
        super(context, s, boolean1, aboolean, null, ar);
    }

    public final int a()
    {
        return b.a.b;
    }

    protected final void a(ar ar)
    {
    }

    public final boolean a(Object obj)
    {
        (new Handler(d.b(a).getMainLooper())).post(new j(this));
        return true;
    }

    public final Object b()
    {
        return Boolean.valueOf(false);
    }

    protected final Object b(ar ar)
    {
        return Boolean.valueOf(false);
    }
}
