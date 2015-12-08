// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.ads;

import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.p;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.cloudlib.ads:
//            k

public final class j
{

    private Object a;
    private String b;
    private WeakReference c;

    public j()
    {
    }

    public final View a(View view, ViewGroup viewgroup, p p)
    {
        k k1;
        if (c != null)
        {
            k1 = (k)c.get();
        } else
        {
            k1 = null;
        }
        if (k1 != null)
        {
            return k1.a(this, view, viewgroup, p);
        } else
        {
            return null;
        }
    }

    public final Object a()
    {
        return a;
    }

    public final void a(k k1)
    {
        c = new WeakReference(k1);
    }

    public final void a(Object obj)
    {
        a = obj;
    }

    public final void a(String s)
    {
        b = s;
    }

    public final String b()
    {
        return b;
    }
}
