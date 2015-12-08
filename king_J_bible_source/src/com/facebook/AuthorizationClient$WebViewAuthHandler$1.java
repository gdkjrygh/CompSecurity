// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Bundle;

// Referenced classes of package com.facebook:
//            AuthorizationClient, FacebookException

class val.request
    implements com.facebook.widget.uest
{

    final val.request this$1;
    private final val.request val$request;

    public void onComplete(Bundle bundle, FacebookException facebookexception)
    {
        WebDialogComplete(val$request, bundle, facebookexception);
    }

    ()
    {
        this$1 = final_;
        val$request = val.request.this;
        super();
    }
}
