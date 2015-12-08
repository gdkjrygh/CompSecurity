// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aax;
import adg;
import aft;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.inputmethod.InputMethodManager;
import b;

public final class SearchView extends adg
    implements aax
{

    static final aft a = new aft();
    private static final boolean b;
    private boolean c;
    private boolean d;
    private CharSequence e;
    private boolean f;
    private int j;

    static void a(SearchView searchview, boolean flag)
    {
        searchview.b(false);
    }

    private void a(boolean flag)
    {
        c = flag;
        byte byte0;
        if (flag)
        {
            byte0 = 0;
        } else
        {
            byte0 = 8;
        }
        throw new NullPointerException();
    }

    static boolean a(Context context)
    {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            post(null);
        } else
        {
            removeCallbacks(null);
            InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
            if (inputmethodmanager != null)
            {
                inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
                return;
            }
        }
    }

    private int e()
    {
        return getContext().getResources().getDimensionPixelSize(b.ad);
    }

    public final void a()
    {
        if (f)
        {
            return;
        } else
        {
            f = true;
            throw new NullPointerException();
        }
    }

    public final void b()
    {
        throw new NullPointerException();
    }

    final void c()
    {
        a(c);
        post(null);
        throw new NullPointerException();
    }

    public final void clearFocus()
    {
        d = true;
        b(false);
        super.clearFocus();
        throw new NullPointerException();
    }

    protected final void onDetachedFromWindow()
    {
        removeCallbacks(null);
        post(null);
        super.onDetachedFromWindow();
    }

    protected final void onMeasure(int i, int k)
    {
        int l;
        int i1;
        if (c)
        {
            super.onMeasure(i, k);
            return;
        }
        i1 = android.view.View.MeasureSpec.getMode(i);
        l = android.view.View.MeasureSpec.getSize(i);
        i = l;
        i1;
        JVM INSTR lookupswitch 3: default 64
    //                   -2147483648: 78
    //                   0: 90
    //                   1073741824: 66;
           goto _L1 _L2 _L3 _L4
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        i = l;
_L6:
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), k);
        return;
_L2:
        i = Math.min(e(), l);
        continue; /* Loop/switch isn't completed */
_L3:
        i = e();
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        post(null);
    }

    public final boolean requestFocus(int i, Rect rect)
    {
        while (d || !isFocusable()) 
        {
            return false;
        }
        if (!c)
        {
            throw new NullPointerException();
        } else
        {
            return super.requestFocus(i, rect);
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
