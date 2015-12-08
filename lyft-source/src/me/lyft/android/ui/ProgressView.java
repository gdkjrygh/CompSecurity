// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import me.lyft.android.common.Strings;

public class ProgressView extends FrameLayout
{

    TextView progressMessageTextView;

    public ProgressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return true;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    public void setMessage(String s)
    {
        if (Strings.isNullOrEmpty(s))
        {
            progressMessageTextView.setVisibility(8);
            return;
        } else
        {
            progressMessageTextView.setVisibility(0);
            progressMessageTextView.setText(s);
            return;
        }
    }
}
