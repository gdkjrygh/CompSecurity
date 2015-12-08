// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.handwriting.base.HandwritingRecognizer;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.Stroke;
import com.google.android.libraries.handwriting.base.StrokeList;
import com.google.android.libraries.handwriting.base.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            m, GestureRecognizer, n, l, 
//            k, aa, s

public final class i
{

    public HandwritingRecognizer a;
    final Handler b = new Handler();
    final m c = new m(this, Looper.getMainLooper());
    final Set d = new HashSet();
    StrokeList e;
    int f;
    int g;
    public Stroke h;
    public aa i;
    int j;
    public int k;
    final GestureRecognizer l = new GestureRecognizer();
    public final ExecutorService m = Executors.newFixedThreadPool(1);
    ExecutorService n;
    public final s o;
    boolean p;
    boolean q;
    private int r;
    private int s;
    private boolean t;

    public i(aa aa1, s s1)
    {
        e = new StrokeList();
        f = 0;
        g = 0;
        r = 0;
        h = new Stroke();
        j = 0;
        k = -1;
        n = Executors.newFixedThreadPool(1);
        s = 10;
        t = false;
        i = aa1;
        o = s1;
    }

    final void a()
    {
        com.google.android.libraries.handwriting.gui.m.a(c);
        Set set = d;
        set;
        JVM INSTR monitorenter ;
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            ((n)iterator.next()).c = true;
        }

        break MISSING_BLOCK_LABEL_54;
        Exception exception;
        exception;
        set;
        JVM INSTR monitorexit ;
        throw exception;
        d.clear();
        set;
        JVM INSTR monitorexit ;
    }

    public final void a(int i1, StrokeList strokelist, boolean flag)
    {
        n n1 = new n(i1, a, strokelist, new l(this, flag), b);
        synchronized (d)
        {
            d.add(n1);
        }
        n.submit(n1);
        return;
        exception;
        strokelist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(HandwritingRecognizer handwritingrecognizer)
    {
        a = handwritingrecognizer;
        if (a == null)
        {
            return;
        } else
        {
            n = Executors.newFixedThreadPool(Math.max(1, handwritingrecognizer.a().h));
            return;
        }
    }

    public final void a(String s1, String s2, RecognitionResult recognitionresult, String s3)
    {
        if (a == null || !a.b() && Math.random() * 100D > (double)s)
        {
            return;
        } else
        {
            m.submit(new k(this, s1, s2, recognitionresult, s3));
            return;
        }
    }

    final void a(boolean flag)
    {
        int i1 = j;
        int j1 = k;
        int k1 = j;
        int l1 = k;
        (new StringBuilder(114)).append("recognition_request_id: ").append(i1).append(" latestReceivedResponse: ").append(j1).append(" pending: ").append(k1 - l1).append(" withAutoSelect: ").append(flag);
        if (a == null)
        {
            i.a(j, "No recognizer configured. Please go to the settings.");
            return;
        }
        Object obj = e;
        String s1;
        boolean flag1;
        if ((o.h || q) && !t)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((StrokeList) (obj)).setEnablePreSpace(flag1);
        flag1 = e.getEnablePreSpace();
        obj = String.valueOf(e.getPreContext());
        s1 = String.valueOf(e.getPostContext());
        (new StringBuilder(String.valueOf(obj).length() + 42 + String.valueOf(s1).length())).append("prespace: ").append(flag1).append(" precontext: ").append(((String) (obj))).append(" postcontext: ").append(s1);
        i1 = j;
        j1 = k;
        k1 = a.a().h;
        l1 = d.size();
        (new StringBuilder(142)).append("currentStrokeId: ").append(i1).append(" latestReceivedResponse: ").append(j1).append(" maxRequestsInParallel:").append(k1).append(" runningRecognitionTasks.size(): ").append(l1);
        i1 = a.a().h;
        j1 = d.size();
        (new StringBuilder(60)).append("maxRequestsInParallel: ").append(i1).append(" runningTasks: ").append(j1);
        if (a.a().h > d.size())
        {
            a(j, e, flag);
            return;
        } else
        {
            com.google.android.libraries.handwriting.gui.m.a(c, flag);
            return;
        }
    }

    public final void b()
    {
        j = j + 1;
        k = j;
        e = new StrokeList();
        e.setInputType(r);
        e.setWritingGuide(f, g);
        e.setPreContext(i.i());
        e.setPostContext(i.j());
        e.setFirstStrokeId(j);
        e.setLastStrokeId(j);
        h = new Stroke();
        a();
    }

    public final String c()
    {
        if (a != null)
        {
            return a.a().a;
        } else
        {
            return "not set";
        }
    }

    public final void d()
    {
        if (e.isEmpty())
        {
            return;
        } else
        {
            e.remove(e.size() - 1);
            h = new Stroke();
            i.d();
            j = j + 1;
            return;
        }
    }

    public final boolean e()
    {
        return !d.isEmpty() || !h.a.isEmpty();
    }
}
