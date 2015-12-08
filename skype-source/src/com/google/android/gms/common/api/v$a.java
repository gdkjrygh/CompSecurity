// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.c;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.common.api:
//            v, c

static final class j extends c
    implements j, j
{

    public final com.google.android.gms.common.api.c j;
    private boolean k;
    private ConnectionResult l;

    private void a(ConnectionResult connectionresult)
    {
        l = connectionresult;
        if (b() && !c())
        {
            a(connectionresult);
        }
    }

    public final void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.a(s, filedescriptor, printwriter, as);
        j.a(s, printwriter);
    }

    protected final void e()
    {
        super.e();
        j.a(this);
        j.a(this);
        if (l != null)
        {
            a(l);
        }
        if (!j.d() && !j.e() && !k)
        {
            j.b();
        }
    }

    protected final void g()
    {
        j.c();
    }

    protected final void j()
    {
        l = null;
        k = false;
        j.b(this);
        j.b(this);
        j.c();
    }

    public final boolean k()
    {
        return k;
    }

    public final void onConnected(Bundle bundle)
    {
        k = false;
        a(ConnectionResult.a);
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        k = true;
        a(connectionresult);
    }

    public final void onConnectionSuspended(int i)
    {
    }

    public onResult(Context context, com.google.android.gms.common.api.c c1)
    {
        super(context);
        j = c1;
    }
}
