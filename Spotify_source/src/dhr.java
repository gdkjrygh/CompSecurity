// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;

public final class dhr
{

    public View a;
    private ViewGroup b;

    public dhr(ViewGroup viewgroup)
    {
        b = viewgroup;
    }

    public final void a()
    {
        int i;
        if (a != null)
        {
            i = a.getVisibility();
        } else
        {
            i = 8;
        }
        b.setVisibility(i);
    }

    public final void a(View view)
    {
        if (a == view)
        {
            return;
        }
        if (a != null)
        {
            b.removeView(a);
        }
        a = view;
        if (view == null)
        {
            b.setVisibility(8);
            return;
        } else
        {
            b.addView(view);
            b.setVisibility(0);
            return;
        }
    }
}
