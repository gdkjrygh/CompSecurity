// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.location.LocationSettingsResult;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.gms.location.internal:
//            a, j, o, h, 
//            LocationRequestUpdateData

public final class k extends com.google.android.gms.location.internal.a
{
    private static final class a extends i.a
    {

        private com.google.android.gms.internal.dg.b a;

        public final void a(LocationSettingsResult locationsettingsresult)
            throws RemoteException
        {
            a.a(locationsettingsresult);
            a = null;
        }

        public a(com.google.android.gms.internal.dg.b b)
        {
            boolean flag;
            if (b != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            u.b(flag, "listener can't be null.");
            a = b;
        }
    }


    final j f;

    public k(Context context, Looper looper, com.google.android.gms.common.api.c.b b, com.google.android.gms.common.api.c.c c, String s, g g)
    {
        super(context, looper, b, c, s, g);
        f = new j(context, e);
    }

    public final void a()
    {
        j j1 = f;
        j1;
        JVM INSTR monitorenter ;
        boolean flag = b();
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj2 = f;
        Object obj = ((j) (obj2)).d;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = ((j) (obj2)).d.values().iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj3 = (j.c)iterator.next();
        if (obj3 == null) goto _L6; else goto _L5
_L5:
        ((h)((j) (obj2)).a.b()).a(LocationRequestUpdateData.a(((com.google.android.gms.location.n) (obj3)), null));
          goto _L6
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        obj;
        Object obj1;
        try
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
        Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", ((Throwable) (obj)));
_L2:
        super.a();
        j1;
        JVM INSTR monitorexit ;
        return;
_L4:
        ((j) (obj2)).d.clear();
        iterator = ((j) (obj2)).e.values().iterator();
_L7:
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_208;
            }
            obj3 = (j.a)iterator.next();
        } while (obj3 == null);
        ((h)((j) (obj2)).a.b()).a(LocationRequestUpdateData.a(((com.google.android.gms.location.m) (obj3))));
          goto _L7
        ((j) (obj2)).e.clear();
        obj;
        JVM INSTR monitorexit ;
        obj = f;
        flag = ((j) (obj)).c;
        if (!flag) goto _L2; else goto _L8
_L8:
        ((j) (obj)).a.a();
        ((h)((j) (obj)).a.b()).a(false);
        obj.c = false;
          goto _L2
        obj1;
        throw new IllegalStateException(((Throwable) (obj1)));
        j1;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public final boolean n()
    {
        return true;
    }
}
