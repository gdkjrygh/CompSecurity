// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            q, r

public final class p
{

    private Context a;
    private PopupWindow b;
    private boolean c;
    private int d;
    private int e;
    private TextView f;

    public p(Context context)
    {
        a = context;
        c = false;
    }

    static Context a(p p1)
    {
        return p1.a;
    }

    static PopupWindow b(p p1)
    {
        return p1.b;
    }

    public final void a()
    {
        if (b != null)
        {
            b.dismiss();
        }
    }

    public final void a(View view, int i)
    {
        int l = 0;
        if (a == null || ((Activity)a).isFinishing()) goto _L2; else goto _L1
_L1:
        if (b == null)
        {
            View view1 = LayoutInflater.from(a).inflate(as.N, null);
            f = (TextView)view1.findViewById(ar.bF);
            b = new PopupWindow(view1, -2, -2, true);
            n.a(b);
            b.setTouchInterceptor(new q(this));
            b.setOutsideTouchable(true);
            b.setTouchable(false);
            b.setFocusable(false);
            b.setClippingEnabled(false);
            d = (int)(a.getResources().getDisplayMetrics().density * 46F);
            e = (int)(a.getResources().getDisplayMetrics().density * 22F);
            b = b;
        }
        if (view == null) goto _L2; else goto _L3
_L3:
        Rect rect1;
        int j;
        int k;
        int i1;
        boolean flag;
        Rect rect;
        int j1;
        int k1;
        if (i > 1)
        {
            f.setText((new StringBuilder()).append(i).append(" ").append(a.getResources().getString(at.aj)).toString());
        } else
        {
            f.setText((new StringBuilder()).append(i).append(" ").append(a.getResources().getString(at.ai)).toString());
        }
        j1 = view.getWidth();
        i1 = view.getHeight();
        rect = new Rect();
        rect1 = new Rect();
        view.getGlobalVisibleRect(rect);
        view.getWindowVisibleDisplayFrame(rect1);
        i = rect.bottom;
        k1 = rect.left;
        k = rect.bottom - rect.top;
        flag = c;
        j = i;
        if (!flag)
        {
            j = i;
            if (k < i1)
            {
                j = i + (i1 - k);
            }
        }
        for (k = (j1 / 2 - d / 2) + 0; k1 + k + d > rect1.right; k -= j1 / 4) { }
        i = l;
        if (!flag) goto _L5; else goto _L4
_L4:
        l = 0 - (e + i1);
_L7:
        b.showAsDropDown(view, k, l);
        (new Handler()).postDelayed(new r(this), 5000L);
_L2:
        return;
_L5:
        do
        {
            l = i;
            if (j + i + e <= rect1.bottom)
            {
                continue;
            }
            i -= i1 / 4;
        } while (true);
        if (true) goto _L7; else goto _L6
_L6:
    }
}
