// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.common.t.a.a;
import com.facebook.i;
import com.facebook.widget.f.d;

public class ComposeEditContainerView extends LinearLayout
{

    private View a;
    private View b;

    public ComposeEditContainerView(Context context)
    {
        super(context);
    }

    public ComposeEditContainerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void a(int j, int k)
    {
        setTouchDelegate(new a(this, new TouchDelegate[] {
            d.a(a, 10), d.a(b, j, k)
        }));
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = findViewById(i.compose_button_location);
        b = findViewById(i.compose_edit_container);
        setAddStatesFromChildren(true);
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        super.onLayout(flag, j, k, l, i1);
        if (flag)
        {
            a(k, i1);
        }
    }
}
