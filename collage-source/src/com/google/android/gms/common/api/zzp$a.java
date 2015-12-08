// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.common.api:
//            zzp, c

private class c
    implements c
{

    public final int a;
    public final c b;
    public final Result c;
    final zzp d;

    public void a()
    {
        b.b(this);
        b.c();
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s).append("GoogleApiClient #").print(a);
        printwriter.println(":");
        b.a((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        zzp.d(d).post(new b(d, a, connectionresult));
    }

    public Result(zzp zzp1, int i, c c1, Result result)
    {
        d = zzp1;
        super();
        a = i;
        b = c1;
        c = result;
        c1.a(this);
    }
}
