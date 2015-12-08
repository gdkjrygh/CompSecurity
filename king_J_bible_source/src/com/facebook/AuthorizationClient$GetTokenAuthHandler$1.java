// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Bundle;

// Referenced classes of package com.facebook:
//            AuthorizationClient

class val.request
    implements com.facebook.internal.st
{

    final val.request this$1;
    private final val.request val$request;

    public void completed(Bundle bundle)
    {
        tTokenCompleted(val$request, bundle);
    }

    stener()
    {
        this$1 = final_stener;
        val$request = val.request.this;
        super();
    }
}
