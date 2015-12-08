// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.support.v7.b.j;
import android.view.LayoutInflater;

public class b extends ContextWrapper
{

    private int a;
    private android.content.res.Resources.Theme b;
    private LayoutInflater c;

    public b(Context context, int i)
    {
        super(context);
        a = i;
    }

    public b(Context context, android.content.res.Resources.Theme theme)
    {
        super(context);
        b = theme;
    }

    private void a()
    {
        boolean flag;
        if (b == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            b = getResources().newTheme();
            android.content.res.Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null)
            {
                b.setTo(theme);
            }
        }
        a(b, a, flag);
    }

    protected void a(android.content.res.Resources.Theme theme, int i, boolean flag)
    {
        theme.applyStyle(i, true);
    }

    public Object getSystemService(String s)
    {
        if ("layout_inflater".equals(s))
        {
            if (c == null)
            {
                c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return c;
        } else
        {
            return getBaseContext().getSystemService(s);
        }
    }

    public android.content.res.Resources.Theme getTheme()
    {
        if (b != null)
        {
            return b;
        }
        if (a == 0)
        {
            a = j.Theme_AppCompat_Light;
        }
        a();
        return b;
    }

    public void setTheme(int i)
    {
        if (a != i)
        {
            a = i;
            a();
        }
    }
}
