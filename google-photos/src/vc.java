// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.LayoutInflater;

public final class vc extends ContextWrapper
{

    public int a;
    private android.content.res.Resources.Theme b;
    private LayoutInflater c;

    public vc(Context context, int i)
    {
        super(context);
        a = i;
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
        b.applyStyle(a, true);
    }

    public final Object getSystemService(String s)
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

    public final android.content.res.Resources.Theme getTheme()
    {
        if (b != null)
        {
            return b;
        }
        if (a == 0)
        {
            a = b.bO;
        }
        a();
        return b;
    }

    public final void setTheme(int i)
    {
        if (a != i)
        {
            a = i;
            a();
        }
    }
}
