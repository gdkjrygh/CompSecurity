// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.view.View;

final class lang.Object
    implements android.view.OnClickListener
{

    private Dialog a;
    private int b;
    private Gc c;

    public final void onClick(View view)
    {
        a.cancel();
        if (c.d != null)
        {
            c.d.a(b);
        }
    }

    >(Gc gc, Dialog dialog, int i)
    {
        c = gc;
        a = dialog;
        b = i;
        super();
    }
}
