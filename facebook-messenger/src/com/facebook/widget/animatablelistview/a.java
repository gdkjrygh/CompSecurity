// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.animatablelistview;

import com.google.common.a.ik;
import com.google.common.a.kl;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.widget.animatablelistview:
//            b

public class a
{

    private final Set a = kl.a();
    private float b;
    private float c;
    private float d;
    private float e;
    private int f;
    private Map g;

    public a()
    {
        b = 1.0F;
        c = 1.0F;
        d = 1.0F;
        e = 1.0F;
        f = 0;
    }

    private void g()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((b)iterator.next()).a()) { }
    }

    public float a()
    {
        return b;
    }

    public a a(int i)
    {
        if (g == null)
        {
            g = ik.a(2);
        }
        a a2 = (a)g.get(Integer.valueOf(i));
        a a1 = a2;
        if (a2 == null)
        {
            a1 = new a();
            g.put(Integer.valueOf(i), a1);
        }
        return a1;
    }

    public void a(b b1)
    {
        a.add(b1);
    }

    public float b()
    {
        return c;
    }

    public void b(b b1)
    {
        a.remove(b1);
    }

    public float c()
    {
        return d;
    }

    public float d()
    {
        return e;
    }

    public int e()
    {
        return f;
    }

    public Map f()
    {
        if (g != null)
        {
            return Collections.unmodifiableMap(g);
        } else
        {
            return Collections.emptyMap();
        }
    }

    public void setAlpha(float f1)
    {
        e = f1;
        g();
    }

    public void setAnimationOffset(float f1)
    {
        boolean flag;
        if (f1 >= -1F && f1 <= 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        b = f1;
        g();
    }

    public void setScaleX(float f1)
    {
        c = f1;
        g();
    }

    public void setScaleY(float f1)
    {
        d = f1;
        g();
    }

    public void setVisibility(int i)
    {
        f = i;
        g();
    }
}
