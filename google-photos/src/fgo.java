// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class fgo
    implements mxe
{

    private View a;

    public fgo(View view)
    {
        a = view;
    }

    public final void v()
    {
        if (a == null)
        {
            return;
        } else
        {
            a.setVisibility(0);
            return;
        }
    }

    public final void w()
    {
        if (a == null)
        {
            return;
        } else
        {
            a.setVisibility(8);
            return;
        }
    }

    public final void x()
    {
        if (a == null)
        {
            return;
        } else
        {
            a.setVisibility(8);
            return;
        }
    }
}
