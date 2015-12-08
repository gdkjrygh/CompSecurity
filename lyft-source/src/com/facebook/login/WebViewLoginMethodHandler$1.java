// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Bundle;
import com.facebook.FacebookException;

// Referenced classes of package com.facebook.login:
//            WebViewLoginMethodHandler

class val.request
    implements com.facebook.internal.
{

    final WebViewLoginMethodHandler this$0;
    final val.request val$request;

    public void onComplete(Bundle bundle, FacebookException facebookexception)
    {
        onWebDialogComplete(val$request, bundle, facebookexception);
    }

    ner()
    {
        this$0 = final_webviewloginmethodhandler;
        val$request = val.request.this;
        super();
    }
}
