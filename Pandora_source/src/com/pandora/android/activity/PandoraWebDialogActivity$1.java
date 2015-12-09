// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.webkit.WebView;
import p.cp.d;

// Referenced classes of package com.pandora.android.activity:
//            PandoraWebDialogActivity

class a extends d
{

    final PandoraWebDialogActivity a;

    public void b()
    {
        a.onBackPressed();
    }

    protected void c()
    {
        a.onBackPressed();
    }

    (PandoraWebDialogActivity pandorawebdialogactivity, Activity activity, WebView webview)
    {
        a = pandorawebdialogactivity;
        super(activity, webview);
    }
}
