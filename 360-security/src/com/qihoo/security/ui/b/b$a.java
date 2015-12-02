// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.b;

import android.os.Looper;
import android.util.Printer;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.b:
//            b

static final class a
    implements Printer, android.view.TreeObserver.OnPreDrawListener
{
    static class a
    {

        long a;
        long b;
        long c;
        String d;

        a()
        {
        }
    }


    final int a;
    long b;
    long c;
    int d;
    WeakReference e;
    final boolean f = com.qihoo.security.ui.b.b.c().b();
    List g;
    boolean h;
    a i;

    public int a()
    {
        long l = c - b;
        if (l <= 0L)
        {
            return -1;
        }
        if (d <= 0)
        {
            return 0;
        } else
        {
            return (int)(((float)d * 1E+09F) / (float)l);
        }
    }

    final void a(ViewTreeObserver viewtreeobserver)
    {
        e = new WeakReference(viewtreeobserver);
        viewtreeobserver.addOnPreDrawListener(this);
        if (f)
        {
            g = new ArrayList();
            Looper.getMainLooper().setMessageLogging(this);
        }
        b = System.nanoTime();
    }

    final void b()
    {
        c = System.nanoTime();
        h = true;
        ViewTreeObserver viewtreeobserver = (ViewTreeObserver)e.get();
        if (viewtreeobserver != null)
        {
            viewtreeobserver.removeOnPreDrawListener(this);
        }
        if (f)
        {
            Looper.getMainLooper().setMessageLogging(null);
        }
    }

    public boolean onPreDraw()
    {
        d = d + 1;
        if (i != null)
        {
            i.c = System.nanoTime();
        }
        return true;
    }

    public void println(String s)
    {
        if (!h)
        {
            if (s.startsWith(">>>>> Dispatching to Handler "))
            {
                i = new a();
                i.d = s;
                i.a = System.nanoTime();
                g.add(i);
                return;
            }
            if (s.startsWith("<<<<< Finished to ") && i != null)
            {
                i.b = System.nanoTime();
                return;
            }
        }
    }

    a(int j)
    {
        a = j;
    }
}
