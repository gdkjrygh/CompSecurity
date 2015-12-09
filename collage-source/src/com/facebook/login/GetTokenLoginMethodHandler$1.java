// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Bundle;

// Referenced classes of package com.facebook.login:
//            GetTokenLoginMethodHandler

class val.request
    implements com.facebook.internal.edListener
{

    final GetTokenLoginMethodHandler this$0;
    final val.request val$request;

    public void completed(Bundle bundle)
    {
        getTokenCompleted(val$request, bundle);
    }

    letedListener()
    {
        this$0 = final_gettokenloginmethodhandler;
        val$request = val.request.this;
        super();
    }
}
