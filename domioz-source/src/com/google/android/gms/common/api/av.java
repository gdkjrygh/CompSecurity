// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.i;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.common.api:
//            n, o, l

final class av extends i
    implements n, o
{

    public final l i;
    private boolean j;
    private ConnectionResult k;

    public av(Context context, l l1)
    {
        super(context);
        i = l1;
    }

    private void a(ConnectionResult connectionresult)
    {
        k = connectionresult;
        if (b() && !c())
        {
            a(connectionresult);
        }
    }

    public final void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.a(s, filedescriptor, printwriter, as);
        i.a(s, printwriter);
    }

    protected final void e()
    {
        super.e();
        i.a(this);
        i.a(this);
        if (k != null)
        {
            a(k);
        }
        if (!i.f() && !i.g() && !j)
        {
            i.c();
        }
    }

    protected final void g()
    {
        i.e();
    }

    protected final void j()
    {
        k = null;
        j = false;
        i.b(this);
        i.b(this);
        i.e();
    }

    public final boolean k()
    {
        return j;
    }

    public final void onConnected(Bundle bundle)
    {
        j = false;
        a(ConnectionResult.a);
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        j = true;
        a(connectionresult);
    }

    public final void onConnectionSuspended(int i1)
    {
    }
}
