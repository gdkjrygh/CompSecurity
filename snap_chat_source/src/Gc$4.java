// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.view.View;

final class lang.Object
    implements android.view.OnClickListener
{

    private Dialog a;
    private Gc b;

    public final void onClick(View view)
    {
        a.cancel();
        if (b.f != null)
        {
            b.f.a(b);
        }
    }

    >(Gc gc, Dialog dialog)
    {
        b = gc;
        a = dialog;
        super();
    }
}
