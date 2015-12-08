// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import android.content.Context;
import android.os.Handler;
import kik.android.d.b;
import kik.android.util.ar;

// Referenced classes of package kik.android.chat:
//            u, KikApplication

final class t extends b
{

    final Context a;
    final KikApplication b;

    t(KikApplication kikapplication, Context context, String s, Boolean boolean1, Boolean aboolean[], ar ar, Context context1)
    {
        b = kikapplication;
        a = context1;
        super(context, s, boolean1, aboolean, null, ar);
    }

    public final int a()
    {
        return kik.android.d.b.a.b;
    }

    protected final void a(ar ar)
    {
    }

    public final boolean a(Object obj)
    {
        (new Handler(a.getMainLooper())).post(new u(this));
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
