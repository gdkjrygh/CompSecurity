// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;


// Referenced classes of package com.spotify.mobile.android.ui.view:
//            LoadingView

final class a
    implements Runnable
{

    private LoadingView a;

    public final void run()
    {
        if (LoadingView.a(a) == ate.c || LoadingView.a(a) == ate.d)
        {
            LoadingView.e(a);
        }
    }

    ate(LoadingView loadingview)
    {
        a = loadingview;
        super();
    }
}
