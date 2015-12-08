// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class fgp
    implements mxe
{

    public boolean a;
    private final View b;
    private final View c;

    public fgp(View view, View view1)
    {
        b = view;
        c = view1;
    }

    public void a()
    {
        if (b != null)
        {
            b.setVisibility(8);
        }
        if (c != null)
        {
            c.setVisibility(8);
        }
    }

    public final void v()
    {
        if (a)
        {
            if (b != null)
            {
                b.setVisibility(8);
            }
            if (c != null)
            {
                c.setVisibility(0);
            }
        } else
        {
            if (b != null)
            {
                b.setVisibility(0);
            }
            if (c != null)
            {
                c.setVisibility(8);
                return;
            }
        }
    }

    public final void w()
    {
        a();
    }

    public final void x()
    {
        a();
    }
}
