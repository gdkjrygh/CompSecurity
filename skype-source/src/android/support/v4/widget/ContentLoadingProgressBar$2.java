// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//            ContentLoadingProgressBar

final class a
    implements Runnable
{

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

    (ContentLoadingProgressBar contentloadingprogressbar)
    {
        a = contentloadingprogressbar;
        super();
    }
}
