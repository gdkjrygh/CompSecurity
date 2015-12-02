// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.facebook.messages.model.threads.Message;

// Referenced classes of package com.facebook.orca.chatheads:
//            dv, af, v, ac

public class ae extends dv
{

    private final android.view.ViewTreeObserver.OnGlobalLayoutListener b = new af(this);
    private int c;

    public ae(WindowManager windowmanager)
    {
        super(windowmanager, d());
    }

    static void a(ae ae1)
    {
        ae1.c();
    }

    private void c()
    {
        setY(c - ((v)h()).getMeasuredHeight() / 2);
    }

    private static final android.view.WindowManager.LayoutParams d()
    {
        android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams(-2, -2, a, 0x1000308, -3);
        layoutparams.gravity = 51;
        return layoutparams;
    }

    public void a()
    {
        if (!i())
        {
            ((v)h()).getViewTreeObserver().addOnGlobalLayoutListener(b);
        }
        super.a();
    }

    public void a(int i)
    {
        setX(i);
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        ((v)h()).setOnClickListener(onclicklistener);
    }

    public void a(Message message)
    {
        ((v)h()).setMessage(message);
    }

    public void a(ac ac1, int i, int j)
    {
        Object obj;
        obj = (v)h();
        if (ac1 == ((v) (obj)).getOrigin() && getX() == i && c == j)
        {
            return;
        }
        ((v) (obj)).setOrigin(ac1);
        a(i);
        b(j);
        obj = k();
        if (ac1 != ac.LEFT) goto _L2; else goto _L1
_L1:
        obj.gravity = 51;
_L4:
        a(((android.view.WindowManager.LayoutParams) (obj)));
        return;
_L2:
        if (ac1 == ac.RIGHT)
        {
            obj.gravity = 53;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b()
    {
        if (i())
        {
            ((v)h()).getViewTreeObserver().removeGlobalOnLayoutListener(b);
        }
        super.b();
    }

    public void b(int i)
    {
        c = i;
        setY(c - ((v)h()).getMeasuredHeight() / 2);
    }
}
