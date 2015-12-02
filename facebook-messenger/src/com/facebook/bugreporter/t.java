// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.content.res.Resources;
import android.net.ConnectivityManager;
import com.facebook.common.e.h;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.common.executors.ForUiThread;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.ui.i.g;
import com.google.common.d.a.u;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.bugreporter:
//            g, m, l, c, 
//            z, o, p

class t extends d
{

    final o a;

    private t(o o)
    {
        a = o;
        super();
    }

    t(o o, p p)
    {
        this(o);
    }

    public com.facebook.bugreporter.g a()
    {
        return new com.facebook.bugreporter.g((Resources)a(android/content/res/Resources), (u)a(com/google/common/d/a/u, com/facebook/common/executors/DefaultExecutorService), (Executor)a(java/util/concurrent/Executor, com/facebook/common/executors/ForUiThread), (m)a(com/facebook/bugreporter/m), (h)a(com/facebook/common/e/h), (l)a(com/facebook/bugreporter/l), c(com/facebook/bugreporter/c), (z)a(com/facebook/bugreporter/z), (g)a(com/facebook/ui/i/g), (ConnectivityManager)e().a(android/net/ConnectivityManager));
    }

    public Object b()
    {
        return a();
    }
}
