// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;

// Referenced classes of package com.fitbit.ui:
//            FitbitActivity, q

public class ProgressFragmentActivity extends FitbitActivity
    implements q
{

    private ProgressBar a;
    private boolean b;
    private Animation c;
    private boolean d;

    public ProgressFragmentActivity()
    {
        d = false;
    }

    private void i()
    {
        byte byte0 = 8;
        if (a != null)
        {
            if (b)
            {
                a.setVisibility(8);
            } else
            {
                boolean flag = d;
                if (a.getVisibility() != 0 || !flag)
                {
                    ProgressBar progressbar = a;
                    if (flag)
                    {
                        byte0 = 0;
                    }
                    progressbar.setVisibility(byte0);
                    if (flag)
                    {
                        a.startAnimation(c);
                        return;
                    } else
                    {
                        a.clearAnimation();
                        return;
                    }
                }
            }
        }
    }

    public void a(String s)
    {
        g();
    }

    public void f()
    {
        d = true;
        i();
    }

    public void g()
    {
        d = false;
        i();
    }

    public void h()
    {
    }

    public void setContentView(int j)
    {
        super.setContentView(j);
        getWindow().setFeatureInt(7, 0x7f040142);
        a = (ProgressBar)findViewById(0x7f1103cf);
        c = AnimationUtils.loadAnimation(this, 0x7f05000c);
        c.setRepeatCount(-1);
        setTitle(getTitle());
    }
}
