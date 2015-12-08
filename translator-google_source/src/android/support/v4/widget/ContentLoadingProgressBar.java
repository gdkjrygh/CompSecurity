// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

// Referenced classes of package android.support.v4.widget:
//            k, l

public class ContentLoadingProgressBar extends ProgressBar
{

    private long a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final Runnable e = new k(this);
    private final Runnable f = new l(this);

    public ContentLoadingProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0);
        a = -1L;
        b = false;
        c = false;
        d = false;
    }

    static long a(ContentLoadingProgressBar contentloadingprogressbar, long l1)
    {
        contentloadingprogressbar.a = l1;
        return l1;
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
