// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, shelduck, hi, bd, 
//            b, cd, gs, bg

final class cg extends AsyncTask
{

    final cd a;

    private cg(cd cd1)
    {
        a = cd1;
        super();
    }

    cg(cd cd1, byte byte0)
    {
        this(cd1);
    }

    protected final transient Void a(List alist[])
    {
        Object obj;
        JSONArray jsonarray;
        if (alist == null || alist.length != 1)
        {
            return null;
        }
        jsonarray = (JSONArray)alist[0].get(0);
        obj = ci.b().u;
        if (jsonarray == null || ((Context) (obj)).getPackageManager().checkPermission("android.permission.ACCESS_FINE_LOCATION", ((Context) (obj)).getPackageName()) != 0 || hi.a(shelduck.t)) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        int j;
        arraylist = new ArrayList();
        j = jsonarray.length();
        JSONArray jsonarray1;
        jsonarray1 = ci.b().t.n;
        alist = new ArrayList();
        if (jsonarray1 == null) goto _L4; else goto _L3
_L3:
        int i = 0;
_L5:
        if (i >= jsonarray1.length())
        {
            break; /* Loop/switch isn't completed */
        }
        alist.add(jsonarray1.getJSONObject(i).optString("_id"));
        i++;
        if (true) goto _L5; else goto _L4
_L8:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_450;
        }
        JSONObject jsonobject = jsonarray.optJSONObject(i);
        b b2 = new b("com.google.android.gms.location.Geofence$Builder");
        Object obj2 = Double.TYPE;
        Object obj3 = Double.TYPE;
        Class class2 = Float.TYPE;
        double d = jsonobject.optDouble("latitude");
        double d1 = jsonobject.optDouble("longitude");
        float f = (float)jsonobject.optDouble("radius");
        b2.a("setCircularRegion", new Class[] {
            obj2, obj3, class2
        }, new Object[] {
            Double.valueOf(d), Double.valueOf(d1), Float.valueOf(f)
        });
        obj2 = jsonobject.optString("_id");
        b2.a("setRequestId", new Class[] {
            java/lang/String
        }, new Object[] {
            obj2
        });
        obj2 = Long.TYPE;
        obj3 = b.a("com.google.android.gms.location.Geofence", "NEVER_EXPIRE");
        b2.a("setExpirationDuration", new Class[] {
            obj2
        }, new Object[] {
            obj3
        });
        obj2 = Integer.TYPE;
        int k = ((Integer)b.a("com.google.android.gms.location.Geofence", "GEOFENCE_TRANSITION_ENTER")).intValue();
        int l = ((Integer)b.a("com.google.android.gms.location.Geofence", "GEOFENCE_TRANSITION_EXIT")).intValue();
        b2.a("setTransitionTypes", new Class[] {
            obj2
        }, new Object[] {
            Integer.valueOf(l | k)
        });
        arraylist.add(b2.a("build"));
        alist.remove(jsonobject.optString("_id"));
        i++;
        continue; /* Loop/switch isn't completed */
        b b1 = new b("com.google.android.gms.location.GeofencingRequest$Builder");
        Class class1 = Integer.TYPE;
        Object obj1 = b.a("com.google.android.gms.location.GeofencingRequest", "INITIAL_TRIGGER_ENTER");
        b1.a("setInitialTrigger", new Class[] {
            class1
        }, new Object[] {
            obj1
        });
        b1.a("addGeofences", new Class[] {
            java/util/List
        }, new Object[] {
            arraylist
        });
        obj = a.a(((Context) (obj)));
        a.b = b1.a("build");
        a.c = alist;
        ((b) (obj)).a("connect");
        return null;
        alist;
        gs.c((new StringBuilder("Exception ")).append(alist.getMessage()).append("while adding geofences").toString());
        a.d.b();
_L6:
        try
        {
            a.d.b();
        }
        // Misplaced declaration of an exception variable
        catch (List alist[])
        {
            gs.c((new StringBuilder("Exception: ")).append(alist.getMessage()).append("while fulfilling geofence promise").toString());
        }
        return null;
        alist;
        gs.c((new StringBuilder("Error ")).append(alist.getMessage()).append(" while adding geofences").toString());
        a.d.b();
          goto _L6
_L2:
        gs.b("The ACCESS_FINE_LOCATION permission is not granted, locations cannot be set or Google play services location is not provided");
          goto _L6
_L4:
        i = 0;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((List[])aobj);
    }
}
