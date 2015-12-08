// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar
{

    private long a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final Runnable e;
    private final Runnable f;

    public ContentLoadingProgressBar(Context context)
    {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0);
        a = -1L;
        b = false;
        c = false;
        d = false;
        e = new Runnable() {

            final ContentLoadingProgressBar a;

            public final void run()
            {
                ContentLoadingProgressBar.a(a);
                ContentLoadingProgressBar.a(a, -1L);
                a.setVisibility(8);
            }

            
            {
                a = ContentLoadingProgressBar.this;
                super();
            }
        };
        f = new Runnable() {

            final ContentLoadingProgressBar a;

            public final void run()
            {
                ContentLoadingProgressBar.b(a);
                if (!ContentLoadingProgressBar.c(a))
                {
                    ContentLoadingProgressBar.a(a, System.currentTimeMillis());
                    a.setVisibility(0);
                }
            }

            
            {
                a = ContentLoadingProgressBar.this;
                super();
            }
        };
    }

    static long a(ContentLoadingProgressBar contentloadingprogressbar, long l)
    {
        contentloadingprogressbar.a = l;
        return l;
    }

    private void a()
    {
        removeCallbacks(e);
        removeCallbacks(f);
    }

    static boolean a(ContentLoadingProgressBar contentloadingprogressbar)
    {
        contentloadingprogressbar.b = false;
        return false;
    }

    static boolean b(ContentLoadingProgressBar contentloadingprogressbar)
    {
        contentloadingprogressbar.c = false;
        return false;
    }

    static boolean c(ContentLoadingProgressBar contentloadingprogressbar)
    {
        return contentloadingprogressbar.d;
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
