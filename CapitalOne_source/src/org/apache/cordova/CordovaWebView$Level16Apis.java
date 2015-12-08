// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.webkit.WebSettings;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView

private static class 
{

    static void enableUniversalAccess(WebSettings websettings)
    {
        websettings.setAllowUniversalAccessFromFileURLs(true);
    }

    private ()
    {
    }
}
