// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.progress;

import android.widget.FrameLayout;
import android.widget.ImageView;

// Referenced classes of package com.pinterest.ui.progress:
//            LoadingView

public class _cls9
{

    public static void inject(butterknife..ViewInjector viewinjector, LoadingView loadingview, Object obj)
    {
        loadingview._refreshIc = (ImageView)viewinjector._refreshIc(obj, 0x7f0f04a8, "field '_refreshIc'");
        loadingview._refreshContainer = (FrameLayout)viewinjector._refreshContainer(obj, 0x7f0f04a7, "field '_refreshContainer'");
    }

    public static void reset(LoadingView loadingview)
    {
        loadingview._refreshIc = null;
        loadingview._refreshContainer = null;
    }

    public _cls9()
    {
    }
}
