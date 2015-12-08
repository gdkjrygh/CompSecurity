// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class IndependentPressImageView extends ImageView
{

    public IndependentPressImageView(Context context)
    {
        this(context, null);
    }

    public IndependentPressImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public IndependentPressImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void setPressed(boolean flag)
    {
        android.view.ViewParent viewparent = getParent();
        if (flag && viewparent != null && (viewparent instanceof View) && ((View)viewparent).isPressed())
        {
            return;
        } else
        {
            super.setPressed(flag);
            return;
        }
    }
}
