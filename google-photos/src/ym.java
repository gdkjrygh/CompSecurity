// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.Toolbar;
import android.view.View;

final class ym extends op
{

    private boolean a;
    private yk b;

    ym(yk yk1)
    {
        b = yk1;
        super();
        a = false;
    }

    public final void b(View view)
    {
        if (!a)
        {
            b.a.setVisibility(8);
        }
    }

    public final void c(View view)
    {
        a = true;
    }
}
