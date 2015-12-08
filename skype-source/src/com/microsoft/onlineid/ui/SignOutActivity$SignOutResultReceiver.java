// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.ui;

import android.app.PendingIntent;
import android.os.Handler;
import com.microsoft.onlineid.internal.ApiRequestResultReceiver;
import com.microsoft.onlineid.internal.a;
import com.microsoft.onlineid.internal.c;

// Referenced classes of package com.microsoft.onlineid.ui:
//            SignOutActivity

private class a extends ApiRequestResultReceiver
{

    final SignOutActivity a;

    protected final void a()
    {
        a.finish();
    }

    protected final void a(PendingIntent pendingintent)
    {
        a(((Exception) (new UnsupportedOperationException("onUINeeded not expected for sign out request."))));
    }

    protected final void a(c c)
    {
        com.microsoft.onlineid.ui.SignOutActivity.c(a).a(com.microsoft.onlineid.ui.SignOutActivity.a(a), SignOutActivity.b(a)).a();
        a.finish();
    }

    protected final void a(Exception exception)
    {
        com.microsoft.onlineid.ui.SignOutActivity.c(a).a(exception).a();
        a.finish();
    }

    public (SignOutActivity signoutactivity)
    {
        a = signoutactivity;
        super(new Handler());
    }
}
