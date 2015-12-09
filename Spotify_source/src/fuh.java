// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class fuh
    implements android.view.View.OnClickListener
{

    private final fxp a;
    private fug b;

    private fuh(fug fug1, fxp fxp1)
    {
        b = fug1;
        super();
        a = fxp1;
    }

    fuh(fug fug1, fxp fxp1, byte byte0)
    {
        this(fug1, fxp1);
    }

    public final void onClick(View view)
    {
        view = a;
        if (((fxp) (view)).d != null)
        {
            ((fxp) (view)).d.a(view);
        }
        fug.a(b).dismiss();
    }
}
