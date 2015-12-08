// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.roidapp.baselib.c.n;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid:
//            bg, bb, bc, bd, 
//            be, bh

public final class ba
{

    PopupWindow a;
    private Context b;
    private View c;
    private bh d;
    private boolean e;
    private boolean f;
    private String g[];
    private boolean h;
    private int i;
    private int j;
    private int k;
    private boolean l;

    public ba(Context context, boolean flag, View view, bh bh, boolean flag1, boolean flag2, int i1, 
            int j1)
    {
        f = true;
        l = true;
        b = context;
        c = view;
        d = bh;
        e = flag1;
        h = flag;
        j = i1;
        k = j1;
        if (!flag2 || android.os.Build.VERSION.SDK_INT <= 8 || az.B)
        {
            l = false;
        }
        g = new String[10];
        g[0] = b.getString(0x7f070244);
        g[1] = b.getString(0x7f070246);
        g[2] = b.getString(0x7f07023f);
        g[3] = b.getString(0x7f070243);
        g[4] = b.getString(0x7f070245);
        g[5] = b.getString(0x7f07023b);
        g[6] = b.getString(0x7f07023c);
        if (!l)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        if (j == 1 || k == 1) goto _L2; else goto _L1
_L1:
        g[7] = b.getString(0x7f070242);
        g[8] = b.getString(0x7f07023e);
        i = 0;
_L4:
        return;
_L2:
        if (j != 1 && k == 1)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        if (j != 1 || k == 1) goto _L4; else goto _L3
_L3:
        g[7] = b.getString(0x7f070240);
        g[8] = b.getString(0x7f070241);
        g[9] = b.getString(0x7f07023e);
        i = 1;
        return;
        g[7] = b.getString(0x7f07023e);
        return;
    }

    static boolean a(ba ba1)
    {
        return ba1.l;
    }

    static bh b(ba ba1)
    {
        return ba1.d;
    }

    static boolean c(ba ba1)
    {
        ba1.h = false;
        return false;
    }

    static int d(ba ba1)
    {
        return ba1.j;
    }

    static int e(ba ba1)
    {
        return ba1.k;
    }

    static int f(ba ba1)
    {
        return ba1.i;
    }

    static boolean g(ba ba1)
    {
        return ba1.f;
    }

    static String[] h(ba ba1)
    {
        return ba1.g;
    }

    static boolean i(ba ba1)
    {
        return ba1.h;
    }

    public final void a()
    {
        if (a == null)
        {
            View view = LayoutInflater.from(b).inflate(0x7f0300fb, null);
            ListView listview = (ListView)view.findViewById(0x7f0d03f6);
            listview.setAdapter(new bg(this, b));
            listview.setOnItemClickListener(new bb(this));
            listview.setOnKeyListener(new bc(this));
            view.setFocusableInTouchMode(true);
            view.setOnKeyListener(new bd(this));
            a = new PopupWindow(view, -2, -2, true);
            n.a(a);
            a.setInputMethodMode(1);
            a.setTouchable(true);
            a.setOutsideTouchable(true);
            a.setFocusable(true);
            a.getContentView().setOnTouchListener(new be(this));
            a.update();
        }
        if (a.isShowing())
        {
            a.dismiss();
            return;
        } else
        {
            a.showAsDropDown(c, 0, 0);
            return;
        }
    }
}
