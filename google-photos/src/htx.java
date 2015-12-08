// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class htx
    implements hgo
{

    final htz a;

    public htx(Context context)
    {
        a = (htz)olm.a(context, htz);
    }

    public final int a()
    {
        return au.B;
    }

    public final int a(int i)
    {
        return i;
    }

    public final void a(afn afn)
    {
        afn = (hua)afn;
        ((hua) (afn)).a.setOnClickListener(new msj(new hty(this)));
        b.a(((hua) (afn)).a, new msm(pwy.t));
    }

    public final int b(int i)
    {
        return 0;
    }

    public final long b()
    {
        return -1L;
    }
}
