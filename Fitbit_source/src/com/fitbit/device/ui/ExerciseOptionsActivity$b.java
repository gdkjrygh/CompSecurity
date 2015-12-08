// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.fitbit.device.ui:
//            ExerciseOptionsActivity

static class a
{

    View a;
    TextView b;
    ImageView c;

    public void a(String s)
    {
        b.setText(s);
    }

    public void a(boolean flag)
    {
        a.setPressed(flag);
    }

    public void b(boolean flag)
    {
        boolean flag2 = true;
        int i = 0;
        Object obj = (RelativeLayout)a.findViewById(0x7f1100f6);
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((RelativeLayout) (obj)).setEnabled(flag1);
        obj = a;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((View) (obj)).setEnabled(flag1);
        obj = b;
        if (!flag)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        ((TextView) (obj)).setEnabled(flag1);
        obj = c;
        if (!flag)
        {
            i = 4;
        }
        ((ImageView) (obj)).setVisibility(i);
    }

    public (View view)
    {
        a = view;
        b = (TextView)a.findViewById(0x1020014);
        c = (ImageView)a.findViewById(0x7f1100f7);
    }
}
