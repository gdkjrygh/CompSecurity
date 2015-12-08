// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.copydrop.views;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.translate.m;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.j;

public class DismissalView extends FrameLayout
    implements android.view.View.OnClickListener, j
{

    private View a;

    public DismissalView(Context context)
    {
        super(context);
    }

    public DismissalView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public DismissalView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void a(int i, Bundle bundle)
    {
        switch (i)
        {
        default:
            return;

        case 251: 
            setVisibility(8);
            break;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        h.a(this, new int[] {
            251
        });
    }

    public void onClick(View view)
    {
        h.a(251);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        h.a(this);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = findViewById(m.dismissal_view);
        a.setOnClickListener(this);
    }
}
