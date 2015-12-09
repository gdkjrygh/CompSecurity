// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import gax;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            LoadingView

final class a
    implements Runnable
{

    private LoadingView a;

    public final void run()
    {
        switch (a[LoadingView.a(a).ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            if (LoadingView.a(a) == ate.c)
            {
                LoadingView.f(a);
            }
            a.removeCallbacks(LoadingView.c(a));
            LoadingView.a(a, ate.e);
            LoadingView.g(a);
            LoadingView.d(a).a();
            return;

        case 3: // '\003'
        case 4: // '\004'
            break;
        }
        if (LoadingView.a(a) == ate.b)
        {
            a.removeCallbacks(LoadingView.h(a));
        }
        LoadingView.a(a, ate.f);
        LoadingView.f(a);
        LoadingView.d(a).a();
        LoadingView.i(a);
    }

    ate(LoadingView loadingview)
    {
        a = loadingview;
        super();
    }
}
