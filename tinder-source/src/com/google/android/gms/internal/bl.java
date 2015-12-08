// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            bq, cw, br

public final class bl extends bq
{

    static final Set a = new HashSet(Arrays.asList(new String[] {
        "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"
    }));
    String b;
    boolean c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    final Object j = new Object();
    final cw k;
    final Activity l;
    AdSizeParcel m;
    ImageView n;
    LinearLayout o;
    PopupWindow p;
    RelativeLayout q;
    ViewGroup r;
    private br t;

    public bl(cw cw1)
    {
        super(cw1, "resize");
        b = "top-right";
        c = true;
        d = 0;
        e = 0;
        f = -1;
        g = 0;
        h = 0;
        i = -1;
        k = cw1;
        l = cw1.c();
        t = null;
    }

    public final void a(boolean flag)
    {
        Object obj = j;
        obj;
        JVM INSTR monitorenter ;
        if (p == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        p.dismiss();
        q.removeView(k.getView());
        if (r != null)
        {
            r.removeView(n);
            r.addView(k.getView());
            k.a(m);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        b("default");
        p = null;
        q = null;
        r = null;
        o = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a()
    {
        Object obj = j;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (p != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }


    // Unreferenced inner class com/google/android/gms/internal/bl$1

/* anonymous class */
    final class _cls1
        implements android.view.View.OnClickListener
    {

        final bl a;

        public final void onClick(View view)
        {
            a.a(true);
        }

            
            {
                a = bl.this;
                super();
            }
    }

}
