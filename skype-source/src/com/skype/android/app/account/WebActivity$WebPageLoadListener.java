// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.graphics.Bitmap;
import android.webkit.WebView;

// Referenced classes of package com.skype.android.app.account:
//            WebActivity

public static interface 
{

    public abstract void onPageFinished(WebView webview, String s);

    public abstract void onPageStarted(WebView webview, String s, Bitmap bitmap);
}
