// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar
{

    private final Runnable a;
    private final Runnable b;

    public ContentLoadingProgressBar(Context context)
    {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0);
        a = new Runnable() {

            private ContentLoadingProgressBar a;

            public final void run()
            {
                a.setVisibility(8);
            }

            
            {
                a = ContentLoadingProgressBar.this;
                super();
            }
        };
        b = new Runnable() {

            private ContentLoadingProgressBar a;

            public final void run()
            {
                System.currentTimeMillis();
                a.setVisibility(0);
            }

            
            {
                a = ContentLoadingProgressBar.this;
                super();
            }
        };
    }

    private void a()
    {
        removeCallbacks(a);
        removeCallbacks(b);
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        a();
    }
}
