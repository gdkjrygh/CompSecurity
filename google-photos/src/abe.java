// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class abe extends wh
{

    private aay g;

    public abe(aay aay1, Context context, vu vu1, View view, boolean flag)
    {
        g = aay1;
        super(context, vu1, view, true, b.t);
        super.f = 0x800005;
        super.d = aay1.l;
    }

    public final void onDismiss()
    {
        super.onDismiss();
        g.c.close();
        g.i = null;
    }
}
