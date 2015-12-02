// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.material;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;

// Referenced classes of package com.qihoo.security.widget.material:
//            a

private class <init>
    implements Runnable
{

    final a a;

    private void a(AdapterView adapterview)
    {
        int i = adapterview.getPositionForView(com.qihoo.security.widget.material.a.a(a));
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
            adapterview.performItemClick(com.qihoo.security.widget.material.a.a(a), i, l);
        }
    }

    public void run()
    {
        if (com.qihoo.security.widget.material.a.a(a).getParent() instanceof AdapterView)
        {
            a((AdapterView)com.qihoo.security.widget.material.a.a(a).getParent());
        }
        if (com.qihoo.security.widget.material.a.h(a) != null)
        {
            com.qihoo.security.widget.material.a.h(a).onClick(com.qihoo.security.widget.material.a.a(a));
        }
    }

    private (a a1)
    {
        a = a1;
        super();
    }

    a(a a1, a a2)
    {
        this(a1);
    }
}
