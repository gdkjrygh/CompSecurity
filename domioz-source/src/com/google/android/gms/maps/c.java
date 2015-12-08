// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.maps.internal.d;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.e;

// Referenced classes of package com.google.android.gms.maps:
//            a, j

public final class c
{

    private final d a;
    private j b;

    protected c(d d1)
    {
        a = (d)ap.a(d1);
    }

    final d a()
    {
        return a;
    }

    public final com.google.android.gms.maps.model.d a(MarkerOptions markeroptions)
    {
        try
        {
            markeroptions = a.a(markeroptions);
        }
        // Misplaced declaration of an exception variable
        catch (MarkerOptions markeroptions)
        {
            throw new e(markeroptions);
        }
        if (markeroptions == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        markeroptions = new com.google.android.gms.maps.model.d(markeroptions);
        return markeroptions;
        return null;
    }

    public final void a(int i)
    {
        try
        {
            a.a(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new e(remoteexception);
        }
    }

    public final void a(a a1)
    {
        try
        {
            a.a(a1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new e(a1);
        }
    }

    public final void b()
    {
        try
        {
            a.c(true);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new e(remoteexception);
        }
    }

    public final j c()
    {
        j j1;
        try
        {
            if (b == null)
            {
                b = new j(a.k());
            }
            j1 = b;
        }
        catch (RemoteException remoteexception)
        {
            throw new e(remoteexception);
        }
        return j1;
    }
}
