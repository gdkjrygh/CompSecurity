// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.Loader;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

class j extends Loader
    implements iClient.ConnectionCallbacks, iClient.OnConnectionFailedListener
{

    public final GoogleApiClient j;
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

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.a(s, filedescriptor, printwriter, as);
        j.a(s, filedescriptor, printwriter, as);
    }

    protected void e()
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

    protected void i()
    {
        j.c();
    }

    protected void m()
    {
        l = null;
        k = false;
        j.b(this);
        j.b(this);
        j.c();
    }

    public boolean n()
    {
        return k;
    }

    public void onConnected(Bundle bundle)
    {
        k = false;
        a(ConnectionResult.a);
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        k = true;
        a(connectionresult);
    }

    public void onConnectionSuspended(int i1)
    {
    }

    public iClient(Context context, GoogleApiClient googleapiclient)
    {
        super(context);
        j = googleapiclient;
    }
}
