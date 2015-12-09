// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import de.hdodenhof.circleimageview.CircleImageView;

public class CheckableCircleView extends CircleImageView
    implements Checkable
{

    private int a;
    private int b;
    private boolean c;

    public CheckableCircleView(Context context)
    {
        super(context);
    }

    public CheckableCircleView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CheckableCircleView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void a(int i, int j)
    {
        a = j;
        b = i;
        if (c)
        {
            i = a;
        } else
        {
            i = b;
        }
        super.setBorderColor(i);
    }

    public boolean isChecked()
    {
        return c;
    }

    public void setChecked(boolean flag)
    {
        c = flag;
        int i;
        if (c)
        {
            i = a;
        } else
        {
            i = b;
        }
        super.setBorderColor(i);
    }

    public void toggle()
    {
        boolean flag;
        if (!isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChecked(flag);
    }
}
