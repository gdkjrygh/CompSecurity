// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.m4b.maps.df.o;
import com.google.android.m4b.maps.df.q;
import com.google.android.m4b.maps.df.s;
import com.google.android.m4b.maps.g.f;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.model.b;
import com.google.android.m4b.maps.model.internal.d;

// Referenced classes of package com.google.android.m4b.maps:
//            b

public final class e
{

    private static boolean a = false;

    public static int a(Context context)
    {
        int i = 0;
        com/google/android/m4b/maps/e;
        JVM INSTR monitorenter ;
        boolean flag;
        x.a(context, "Context is null");
        flag = a;
        if (!flag) goto _L2; else goto _L1
_L1:
        com/google/android/m4b/maps/e;
        JVM INSTR monitorexit ;
        return i;
_L2:
        context = o.a(context);
        a(((s) (context)));
        a = true;
          goto _L1
        context;
        throw context;
        context;
        i = ((f) (context)).a;
          goto _L1
    }

    public static void a(s s1)
    {
        try
        {
            b.a = (q)x.a(s1.a());
            s1 = s1.b();
            if (b.a == null)
            {
                b.a = (d)x.a(s1);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (s s1)
        {
            throw new RuntimeRemoteException(s1);
        }
    }

}
