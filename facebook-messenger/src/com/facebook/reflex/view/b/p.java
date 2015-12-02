// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.b;

import android.os.Looper;
import android.view.ViewGroup;
import com.facebook.reflex.j;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.LinkedHashSet;

// Referenced classes of package com.facebook.reflex.view.b:
//            q, s, r

public class p
{

    private LinkedHashSet a;
    private LinkedHashSet b;
    private LinkedHashSet c;
    private LinkedHashSet d;
    private ViewGroup e;

    public p(j j1)
    {
        boolean flag;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        a = new LinkedHashSet();
        b = new LinkedHashSet();
        c = new LinkedHashSet();
        d = new LinkedHashSet();
        e = new q(this, j1);
        e.setVisibility(8);
        j1.a(e, new android.view.ViewGroup.LayoutParams(0, 0));
    }

    public void a()
    {
        LinkedHashSet linkedhashset = a;
        a = c;
        s s1;
        for (Iterator iterator = linkedhashset.iterator(); iterator.hasNext(); b.remove(s1))
        {
            s1 = (s)iterator.next();
            s1.a();
        }

        linkedhashset.clear();
        c = linkedhashset;
    }

    public void a(r r1)
    {
        b.add(r1);
    }

    public void a(s s1)
    {
        e.requestLayout();
        a.add(s1);
    }

    public void b()
    {
        LinkedHashSet linkedhashset = b;
        b = d;
        for (Iterator iterator = linkedhashset.iterator(); iterator.hasNext(); ((r)iterator.next()).e()) { }
        linkedhashset.clear();
        d = linkedhashset;
    }
}
