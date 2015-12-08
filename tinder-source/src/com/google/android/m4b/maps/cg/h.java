// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.widget.Toast;
import com.google.android.m4b.maps.ai.c;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.ag;
import com.google.android.m4b.maps.ay.l;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.ay.s;
import com.google.android.m4b.maps.bs.a;
import com.google.android.m4b.maps.bs.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bj, bg, bt

public final class h
{

    private static boolean a = false;

    public static void a(bj bj1)
    {
        boolean flag1 = false;
        com/google/android/m4b/maps/cg/h;
        JVM INSTR monitorenter ;
        boolean flag2 = a;
        if (!flag2) goto _L2; else goto _L1
_L1:
        com/google/android/m4b/maps/cg/h;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        Object obj1;
        PackageManager packagemanager;
        String as[];
        a = true;
        obj = bj1.a;
        if (bj1.e.c < 0x3d0900)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        obj1 = new ArrayList();
        packagemanager = ((Context) (obj)).getPackageManager();
        as = bg.b;
        int i = 0;
_L4:
        String s1;
        if (i >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = as[i];
        packagemanager.getPermissionInfo(s1, 128);
        if (((Context) (obj)).checkCallingOrSelfPermission(s1) != 0)
        {
            ((List) (obj1)).add(s1);
        }
_L6:
        i++;
        if (true) goto _L4; else goto _L3
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        if (!ab.a(com.google.android.m4b.maps.cg.bg.a, 6)) goto _L6; else goto _L5
_L5:
        Log.e(com.google.android.m4b.maps.cg.bg.a, (new StringBuilder(String.valueOf(s1).length() + 114)).append("Permission \"").append(s1).append("\" has not been found on the system. If this occurs on an emulator, you can probably ignore this error.").toString());
          goto _L6
        bj1;
        throw bj1;
_L3:
        if (((List) (obj1)).size() == 0)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        bj1 = new StringBuilder("The Maps API requires the additional following permissions to be set in the AndroidManifest.xml to ensure a correct behavior:");
        for (obj = ((List) (obj1)).iterator(); ((Iterator) (obj)).hasNext(); bj1.append((new StringBuilder(String.valueOf(obj1).length() + 35)).append("\n<uses-permission android:name=\"").append(((String) (obj1))).append("\"/>").toString()))
        {
            obj1 = (String)((Iterator) (obj)).next();
        }

        throw new SecurityException(bj1.toString());
        obj1 = bj1.d.a();
        if (ag.a() || ag.a(((Context) (obj)))) goto _L8; else goto _L7
_L7:
        ab.a("Google Maps Android API v2 only supports devices with OpenGL ES 2.0 and above");
_L11:
        for (boolean flag = flag1; !flag; flag = true)
        {
            break MISSING_BLOCK_LABEL_326;
        }

        bj1.j.a(new com.google.android.m4b.maps.ay.l.a(((m) (obj1))) {

            private m a;

            public final void a(l l)
            {
                a.g();
            }

            
            {
                a = m1;
                super();
            }
        });
        s.a(((Context) (obj)), bj1.c);
        obj1 = bj1.i.d;
        bj1 = bj1.b;
        if (obj1 == null) goto _L1; else goto _L9
_L9:
        if (!((a) (obj1)).a) goto _L1; else goto _L10
_L10:
        Toast.makeText(((Context) (obj)), bj1.getString(com.google.android.m4b.maps.h.maps_API_OUTDATED_WARNING), 1).show();
          goto _L1
_L8:
        if (a(((Context) (obj))))
        {
            break MISSING_BLOCK_LABEL_396;
        }
        ab.a("Google Play services is not present on this device.");
        flag = flag1;
          goto _L11
    }

    private static boolean a(Context context)
    {
        context = context.getPackageManager();
        try
        {
            context.getPackageInfo("com.google.android.gms", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

}
