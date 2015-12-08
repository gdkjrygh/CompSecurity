// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.a;

// Referenced classes of package com.google.android.gms.internal:
//            ft, fr, gd, ga

public final class fz extends ft
{

    public final int b;
    public final Bundle c;
    public final IBinder d;
    final fr e;

    public fz(fr fr1, int i, IBinder ibinder, Bundle bundle)
    {
        e = fr1;
        super(fr1, Boolean.valueOf(true));
        b = i;
        d = ibinder;
        c = bundle;
    }

    protected final void a(Object obj)
    {
        if ((Boolean)obj == null)
        {
            com.google.android.gms.internal.fr.a(e, 1);
            return;
        }
        switch (b)
        {
        default:
            if (c != null)
            {
                obj = (PendingIntent)c.getParcelable("pendingIntent");
            } else
            {
                obj = null;
            }
            if (fr.d(e) != null)
            {
                com.google.android.gms.internal.gd.a(fr.e(e)).b(e.a(), fr.d(e));
                fr.f(e);
            }
            com.google.android.gms.internal.fr.a(e, 1);
            com.google.android.gms.internal.fr.a(e, null);
            com.google.android.gms.internal.fr.a(e).a(new a(b, ((PendingIntent) (obj))));
            return;

        case 0: // '\0'
            try
            {
                obj = d.getInterfaceDescriptor();
                if (e.b().equals(obj))
                {
                    com.google.android.gms.internal.fr.a(e, e.a(d));
                    if (fr.c(e) != null)
                    {
                        com.google.android.gms.internal.fr.a(e, 3);
                        com.google.android.gms.internal.fr.a(e).a();
                        return;
                    }
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            com.google.android.gms.internal.gd.a(fr.e(e)).b(e.a(), fr.d(e));
            fr.f(e);
            com.google.android.gms.internal.fr.a(e, 1);
            com.google.android.gms.internal.fr.a(e, null);
            com.google.android.gms.internal.fr.a(e).a(new a(8, null));
            return;

        case 10: // '\n'
            com.google.android.gms.internal.fr.a(e, 1);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
    }
}
