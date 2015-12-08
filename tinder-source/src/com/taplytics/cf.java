// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.taplytics.a.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

// Referenced classes of package com.taplytics:
//            gs, cd, b, bg

final class cf
    implements InvocationHandler
{

    final Context a;
    final cd b;

    cf(cd cd1, Context context)
    {
        b = cd1;
        a = context;
        super();
    }

    public final Object invoke(Object obj, Method method, Object aobj[])
        throws Throwable
    {
        byte byte0;
        obj = method.getName();
        byte0 = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 3: default 48
    //                   -609996822: 78
    //                   147696667: 108
    //                   1158766654: 93;
           goto _L1 _L2 _L3 _L4
_L1:
        byte0;
        JVM INSTR tableswitch 0 2: default 76
    //                   0 123
    //                   1 424
    //                   2 479;
           goto _L5 _L6 _L7 _L8
_L5:
        return null;
_L2:
        if (((String) (obj)).equals("onConnected"))
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (((String) (obj)).equals("onConnectionSuspended"))
        {
            byte0 = 1;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (((String) (obj)).equals("hashCode"))
        {
            byte0 = 2;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        boolean flag;
        if (gs.b())
        {
            com.taplytics.gs.a("Connection to Google Play Servces established");
        }
        if (b.c == null)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        flag = b.c.isEmpty();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        try
        {
            obj = b.a.b;
            method = b.c;
            (new b(com.taplytics.b.a("com.google.android.gms.location.LocationServices", "GeofencingApi"))).a("removeGeofences", new Class[] {
                Class.forName("com.google.android.gms.common.api.c"), method.getClass()
            }, new Object[] {
                obj, method
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                ((Exception) (obj)).printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                gs.c((new StringBuilder("Reflection failed for GoogleApiClient: ")).append(((Exception) (obj)).getMessage()).toString());
                return null;
            }
        }
        if (gs.b())
        {
            com.taplytics.gs.a((new StringBuilder()).append(b.c.size()).append(" geofences removed").toString());
        }
        b.c = null;
        obj = b.b;
        if (obj == null) goto _L10; else goto _L9
_L9:
        try
        {
            com.taplytics.cd.a(b.a.b, b.b, PendingIntent.getService(a, 0, new Intent(a, com/taplytics/a/a), 0x8000000));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (gs.b())
        {
            com.taplytics.gs.a("geofences added");
        }
        b.b = null;
_L10:
        b.a.a("disconnect");
        if (b.d == null) goto _L5; else goto _L11
_L11:
        b.d.a();
        return null;
_L7:
        if (gs.b())
        {
            com.taplytics.gs.a((new StringBuilder("Connection to Google Play Services suspended: ")).append(((Integer)aobj[0]).intValue()).toString());
        }
        if (b.d != null)
        {
            b.d.a();
        }
_L8:
        return Integer.valueOf(hashCode());
        if (true) goto _L1; else goto _L12
_L12:
    }
}
