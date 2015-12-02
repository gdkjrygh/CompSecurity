// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vk.sdk;

import android.content.Context;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

// Referenced classes of package com.vk.sdk:
//            VKOpenAuthActivity

static class lity extends RelativeLayout
{

    public ams(Context context)
    {
        super(context);
        ProgressBar progressbar = new ProgressBar(context);
        android.widget.Params params = new android.widget.Params(-2, -2);
        params.addRule(13, 1);
        progressbar.setLayoutParams(params);
        addView(progressbar);
        context = new WebView(context);
        context.setLayoutParams(new android.widget.Params(-1, -1));
        addView(context);
        context.setId(0x1020023);
        context.setVisibility(4);
    }
}
