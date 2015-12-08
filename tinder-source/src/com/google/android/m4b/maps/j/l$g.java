// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.m4b.maps.g.a;
import com.google.android.m4b.maps.g.g;

// Referenced classes of package com.google.android.m4b.maps.j:
//            l

public final class a extends a
{

    private IBinder a;
    private l b;

    protected final void a(a a1)
    {
        if (l.e(b) != null)
        {
            l.e(b).a(a1);
        }
        l.h();
    }

    protected final boolean a()
    {
        String s;
        try
        {
            s = a.getInterfaceDescriptor();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("GmsClient", "service probably died");
            return false;
        }
        if (!b.b().equals(s))
        {
            String s1 = b.b();
            Log.e("GmsClient", (new StringBuilder(String.valueOf(s1).length() + 34 + String.valueOf(s).length())).append("service descriptor mismatch: ").append(s1).append(" vs. ").append(s).toString());
        } else
        {
            android.os.IInterface iinterface = b.a(a);
            if (iinterface != null && com.google.android.m4b.maps.j.l.a(b, 2, 3, iinterface))
            {
                if (l.b(b) != null)
                {
                    l.b(b).a(null);
                }
                com.google.android.m4b.maps.g.g.b(l.f(b));
                return true;
            }
        }
        return false;
    }

    public (l l1, int i, IBinder ibinder, Bundle bundle)
    {
        b = l1;
        super(l1, i, bundle);
        a = ibinder;
    }
}
