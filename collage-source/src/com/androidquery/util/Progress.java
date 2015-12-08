// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.androidquery.util;

import android.app.Activity;
import android.app.ProgressDialog;
import android.view.View;
import android.widget.ProgressBar;
import com.androidquery.a;

public class Progress
    implements Runnable
{

    private ProgressBar a;
    private ProgressDialog b;
    private Activity c;
    private View d;
    private boolean e;
    private int f;
    private int g;
    private String h;

    public Progress(Object obj)
    {
        if (obj instanceof ProgressBar)
        {
            a = (ProgressBar)obj;
        } else
        {
            if (obj instanceof ProgressDialog)
            {
                b = (ProgressDialog)obj;
                return;
            }
            if (obj instanceof Activity)
            {
                c = (Activity)obj;
                return;
            }
            if (obj instanceof View)
            {
                d = (View)obj;
                return;
            }
        }
    }

    private void a(String s)
    {
        if (b != null)
        {
            (new a(b.getContext())).b(b);
        }
        if (c != null)
        {
            c.setProgressBarIndeterminateVisibility(false);
            c.setProgressBarVisibility(false);
        }
        if (a != null)
        {
            a.setTag(0x40ff0001, s);
            a.setVisibility(0);
        }
        ProgressBar progressbar = a;
        Object obj = progressbar;
        if (progressbar == null)
        {
            obj = d;
        }
        if (obj != null)
        {
            Object obj1 = ((View) (obj)).getTag(0x40ff0001);
            if (obj1 == null || obj1.equals(s))
            {
                ((View) (obj)).setTag(0x40ff0001, null);
                if (a != null && a.isIndeterminate())
                {
                    ((View) (obj)).setVisibility(8);
                }
            }
        }
    }

    public void a()
    {
        if (a != null)
        {
            a.setProgress(0);
            a.setMax(10000);
        }
        if (b != null)
        {
            b.setProgress(0);
            b.setMax(10000);
        }
        if (c != null)
        {
            c.setProgress(0);
        }
        e = false;
        g = 0;
        f = 10000;
    }

    public void a(int i)
    {
        int j = i;
        if (i <= 0)
        {
            e = true;
            j = 10000;
        }
        f = j;
        if (a != null)
        {
            a.setProgress(0);
            a.setMax(j);
        }
        if (b != null)
        {
            b.setProgress(0);
            b.setMax(j);
        }
    }

    public void b()
    {
        if (a != null)
        {
            a.setProgress(a.getMax());
        }
        if (b != null)
        {
            b.setProgress(b.getMax());
        }
        if (c != null)
        {
            c.setProgress(9999);
        }
    }

    public void b(int i)
    {
        boolean flag = true;
        int j;
        if (a != null)
        {
            Object obj = a;
            if (e)
            {
                j = 1;
            } else
            {
                j = i;
            }
            ((ProgressBar) (obj)).incrementProgressBy(j);
        }
        if (b != null)
        {
            obj = b;
            if (e)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = i;
            }
            ((ProgressDialog) (obj)).incrementProgressBy(j);
        }
        if (c != null)
        {
            if (e)
            {
                i = g;
                g = i + 1;
            } else
            {
                g = g + i;
                i = (g * 10000) / f;
            }
            j = i;
            if (i > 9999)
            {
                j = 9999;
            }
            c.setProgress(j);
        }
    }

    public void run()
    {
        a(h);
    }
}
