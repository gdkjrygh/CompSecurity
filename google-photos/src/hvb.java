// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class hvb
    implements mxe
{

    private final fgo a;
    private final Context b;
    private boolean c;

    hvb(Context context, View view, boolean flag)
    {
        b = context;
        c = flag;
        a = new fgo(view);
    }

    private void a()
    {
        if (!c)
        {
            return;
        } else
        {
            c = false;
            (new oce(152)).b(b);
            return;
        }
    }

    public final void v()
    {
        a();
        a.v();
    }

    public final void w()
    {
        a.w();
    }

    public final void x()
    {
        a();
        a.x();
    }
}
