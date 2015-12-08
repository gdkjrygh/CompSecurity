// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.Arrays;
import java.util.HashSet;

public final class kvl extends kvu
{

    String a;
    boolean b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    final Object i = new Object();
    final kxu j;
    final Activity k;
    AdSizeParcel l;
    ImageView m;
    LinearLayout n;
    PopupWindow o;
    RelativeLayout p;
    ViewGroup q;
    private k s;

    public kvl(kxu kxu1, k k1)
    {
        super(kxu1, "resize");
        a = "top-right";
        b = true;
        c = 0;
        d = 0;
        e = -1;
        f = 0;
        g = 0;
        h = -1;
        j = kxu1;
        k = kxu1.d();
        s = k1;
    }

    public final void a(boolean flag)
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (o == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        o.dismiss();
        p.removeView(j.a());
        if (q != null)
        {
            q.removeView(m);
            q.addView(j.a());
            j.a(l);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        c("default");
        o = null;
        p = null;
        q = null;
        n = null;
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
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (o != null)
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

    static 
    {
        new HashSet(Arrays.asList(new String[] {
            "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"
        }));
    }
}
