// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.Intent;
import aof;

// Referenced classes of package com.facebook:
//            AuthorizationClient

final class a
    implements aof
{

    private AuthorizationClient a;

    public final Activity a()
    {
        return a.pendingRequest.a.a();
    }

    public final void a(Intent intent, int i)
    {
        a.pendingRequest.a.a(intent, i);
    }

    thorizationRequest(AuthorizationClient authorizationclient)
    {
        a = authorizationclient;
        super();
    }
}
