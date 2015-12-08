// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.Toolbar;
import android.view.View;

final class yl
    implements android.view.View.OnClickListener
{

    private vm a;
    private yk b;

    yl(yk yk1)
    {
        b = yk1;
        super();
        a = new vm(b.a.getContext(), 0, 0x102002c, 0, 0, b.b);
    }

    public final void onClick(View view)
    {
        if (b.c != null && b.d)
        {
            b.c.onMenuItemSelected(0, a);
        }
    }
}
