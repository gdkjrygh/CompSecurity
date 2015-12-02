// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.Context;
import android.view.View;
import com.actionbarsherlock.internal.view.menu.b;
import com.actionbarsherlock.internal.view.menu.d;
import com.actionbarsherlock.internal.view.menu.i;

// Referenced classes of package com.actionbarsherlock.widget:
//            b, c

public class a
    implements b, i
{

    private Context a;
    private com.actionbarsherlock.internal.view.menu.a b;
    private View c;
    private d d;
    private c e;
    private com.actionbarsherlock.widget.b f;

    public a(Context context, View view)
    {
        a = context;
        b = new com.actionbarsherlock.internal.view.menu.a(context);
        b.a(this);
        c = view;
        d = new d(context, b, view);
        d.a(this);
    }

    public com.actionbarsherlock.a.a a()
    {
        return b;
    }

    public void a(com.actionbarsherlock.internal.view.menu.a a1, boolean flag)
    {
        if (f != null)
        {
            f.a(this);
        }
    }

    public void a(com.actionbarsherlock.widget.b b1)
    {
        f = b1;
    }

    public void a(c c1)
    {
        e = c1;
    }

    public boolean a(com.actionbarsherlock.internal.view.menu.a a1)
    {
        boolean flag = true;
        if (a1 == null)
        {
            flag = false;
        } else
        if (a1.b())
        {
            (new d(a, a1, c)).a();
            return true;
        }
        return flag;
    }

    public boolean a(com.actionbarsherlock.internal.view.menu.a a1, com.actionbarsherlock.a.b b1)
    {
        if (e != null)
        {
            return e.a(b1);
        } else
        {
            return false;
        }
    }

    public void b()
    {
        d.a();
    }

    public void c()
    {
        d.c();
    }
}
