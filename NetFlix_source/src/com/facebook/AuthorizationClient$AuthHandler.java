// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import java.io.Serializable;

// Referenced classes of package com.facebook:
//            AuthorizationClient

abstract class this._cls0
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    final AuthorizationClient this$0;

    void cancel()
    {
    }

    boolean needsInternetPermission()
    {
        return false;
    }

    boolean needsRestart()
    {
        return false;
    }

    boolean onActivityResult(int i, int j, Intent intent)
    {
        return false;
    }

    abstract boolean tryAuthorize(nRequest nrequest);

    nRequest()
    {
        this$0 = AuthorizationClient.this;
        super();
    }
}
