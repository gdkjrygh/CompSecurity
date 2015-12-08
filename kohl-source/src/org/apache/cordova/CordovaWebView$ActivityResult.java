// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.Intent;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView

class incoming
{

    Intent incoming;
    int request;
    int result;
    final CordovaWebView this$0;

    public (int i, int j, Intent intent)
    {
        this$0 = CordovaWebView.this;
        super();
        request = i;
        result = j;
        incoming = intent;
    }
}
