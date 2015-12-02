// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;

// Referenced classes of package com.qihoo.security.widget:
//            MaterialRippleLayout

private class <init>
    implements Runnable
{

    final MaterialRippleLayout a;

    private void a(AdapterView adapterview)
    {
        int i = adapterview.getPositionForView(a);
        long l;
        if (adapterview.getAdapter() != null)
        {
            l = adapterview.getAdapter().getItemId(i);
        } else
        {
            l = 0L;
        }
        if (i != -1)
        {
            adapterview.performItemClick(a, i, l);
        }
    }

    public void run()
    {
        if (a.getParent() instanceof AdapterView)
        {
            a((AdapterView)a.getParent());
        } else
        {
            if (MaterialRippleLayout.f(a))
            {
                a(MaterialRippleLayout.g(a));
                return;
            }
            if (!MaterialRippleLayout.h(a))
            {
                MaterialRippleLayout.a(a).performClick();
                return;
            }
        }
    }

    private (MaterialRippleLayout materialripplelayout)
    {
        a = materialripplelayout;
        super();
    }

    a(MaterialRippleLayout materialripplelayout, a a1)
    {
        this(materialripplelayout);
    }
}
