// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.view.View;
import com.netflix.mediaclient.util.gfx.AnimationUtils;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            ErrorWrapper

public class LoadingAndErrorWrapper extends ErrorWrapper
{

    private final View loading;

    public LoadingAndErrorWrapper(View view, ErrorWrapper.Callback callback)
    {
        super(view, callback);
        loading = view.findViewById(0x7f0700ee);
        showLoadingView(false);
    }

    public void hide(boolean flag)
    {
        super.hide(flag);
        AnimationUtils.hideView(loading, flag);
    }

    public void showErrorView(int i, boolean flag, boolean flag1)
    {
        super.showErrorView(i, flag, flag1);
        AnimationUtils.hideView(loading, flag1);
    }

    public void showErrorView(boolean flag)
    {
        super.showErrorView(flag);
        AnimationUtils.hideView(loading, flag);
    }

    public void showLoadingView(boolean flag)
    {
        super.hide(flag);
        AnimationUtils.showView(loading, flag);
    }
}
