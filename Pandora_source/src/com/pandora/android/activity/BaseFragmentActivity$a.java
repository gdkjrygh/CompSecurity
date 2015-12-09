// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import com.pandora.android.eureka.dialog.PandoraMediaRouteActionProvider;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity

protected class a
    implements android.support.v4.view.ty.a
{

    protected boolean a;
    final BaseFragmentActivity b;
    private PandoraMediaRouteActionProvider c;
    private String d;

    private void c()
    {
        boolean flag;
        if (c != null && c.d())
        {
            flag = false;
        } else
        {
            flag = a;
        }
        if (flag)
        {
            d();
            return;
        } else
        {
            b.V();
            return;
        }
    }

    private void d()
    {
        if (d == null)
        {
            b.T();
            return;
        } else
        {
            b.e(d);
            return;
        }
    }

    public void a()
    {
        a(((String) (null)));
    }

    public void a(String s)
    {
        d = s;
        a = true;
        c();
    }

    public void a(boolean flag)
    {
        c();
    }

    public void b()
    {
        a = false;
        c();
    }

    protected ctionProvider(BaseFragmentActivity basefragmentactivity)
    {
        b = basefragmentactivity;
        super();
        a = false;
    }
}
