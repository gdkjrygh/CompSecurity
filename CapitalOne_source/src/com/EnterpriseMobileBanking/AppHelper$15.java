// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.view.View;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHelper, EnterpriseMobileBanking

static final class val.url
    implements Runnable
{

    final boolean val$loadAsNewUrl;
    final boolean val$showBack;
    final String val$url;
    final View val$v;

    public void run()
    {
        AppHelper.access$000().switchATM(val$v, val$showBack, val$loadAsNewUrl, val$url);
    }

    ileBanking(View view, boolean flag, boolean flag1, String s)
    {
        val$v = view;
        val$showBack = flag;
        val$loadAsNewUrl = flag1;
        val$url = s;
        super();
    }
}
