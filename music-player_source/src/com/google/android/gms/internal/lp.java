// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.f;
import com.google.android.gms.a.h;
import com.google.android.gms.a.i;
import com.google.android.gms.common.g;

// Referenced classes of package com.google.android.gms.internal:
//            ek, lk, db, j, 
//            h, k, ab, az, 
//            g

public final class lp extends h
{

    private static final lp a = new lp();

    private lp()
    {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public static com.google.android.gms.internal.g a(Context context, ab ab, String s, az az)
    {
        Object obj;
label0:
        {
            if (g.a(context) == 0)
            {
                com.google.android.gms.internal.g g1 = a.b(context, ab, s, az);
                obj = g1;
                if (g1 != null)
                {
                    break label0;
                }
            }
            ek.a("Using AdManager from the client jar.");
            obj = new lk(context, ab, s, az, new db());
        }
        return ((com.google.android.gms.internal.g) (obj));
    }

    private com.google.android.gms.internal.g b(Context context, ab ab, String s, az az)
    {
        try
        {
            com.google.android.gms.a.c c = f.a(context);
            context = h.a(((j)a(context)).a(c, ab, s, az, 0x41f6b8));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ek.a("Could not create remote AdManager.", context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ek.a("Could not create remote AdManager.", context);
            return null;
        }
        return context;
    }

    protected final Object a(IBinder ibinder)
    {
        return k.a(ibinder);
    }

}
