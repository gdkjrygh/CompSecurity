// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.PopupWindow;

final class aby extends adu
{

    private aca a;
    private abx b;

    aby(abx abx1, View view, aca aca1)
    {
        b = abx1;
        a = aca1;
        super(view);
    }

    public final adq a()
    {
        return a;
    }

    public final boolean b()
    {
        if (!((adq) (abx.a(b))).c.isShowing())
        {
            abx.a(b).b();
        }
        return true;
    }
}
