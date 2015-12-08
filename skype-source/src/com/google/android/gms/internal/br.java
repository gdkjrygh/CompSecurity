// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.d;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.b.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            bq, bl

public final class br extends d
{

    private final bq a;
    private final List b;
    private final bl c;

    public br(bq bq1)
    {
        b = new ArrayList();
        a = bq1;
        Iterator iterator = a.b().iterator();
_L6:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        bq1 = ((bq) (iterator.next()));
        if (!(bq1 instanceof IBinder)) goto _L4; else goto _L3
_L3:
        bq1 = bk.a.a((IBinder)bq1);
_L7:
        if (bq1 == null) goto _L6; else goto _L5
_L5:
        b.add(new bl(bq1));
          goto _L6
        bq1;
        com.google.android.gms.ads.internal.util.client.b.a("Failed to get image.", bq1);
_L2:
        bq1 = a.d();
        if (bq1 == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        bq1 = new bl(bq1);
_L8:
        c = bq1;
        return;
_L4:
        bq1 = null;
          goto _L7
        bq1;
        com.google.android.gms.ads.internal.util.client.b.a("Failed to get icon.", bq1);
        bq1 = null;
          goto _L8
    }

    private c h()
    {
        c c1;
        try
        {
            c1 = a.g();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Failed to retrieve native ad engine.", remoteexception);
            return null;
        }
        return c1;
    }

    protected final Object a()
    {
        return h();
    }

    public final CharSequence b()
    {
        String s;
        try
        {
            s = a.a();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Failed to get headline.", remoteexception);
            return null;
        }
        return s;
    }

    public final List c()
    {
        return b;
    }

    public final CharSequence d()
    {
        String s;
        try
        {
            s = a.c();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Failed to get body.", remoteexception);
            return null;
        }
        return s;
    }

    public final com.google.android.gms.ads.formats.a.a e()
    {
        return c;
    }

    public final CharSequence f()
    {
        String s;
        try
        {
            s = a.e();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Failed to get call to action.", remoteexception);
            return null;
        }
        return s;
    }

    public final CharSequence g()
    {
        String s;
        try
        {
            s = a.f();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Failed to get attribution.", remoteexception);
            return null;
        }
        return s;
    }
}
