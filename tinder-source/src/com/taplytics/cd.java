// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.PendingIntent;
import android.content.Context;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

// Referenced classes of package com.taplytics:
//            b, ce, cf, gs, 
//            bg, cg

public final class cd
{

    private static cd e;
    b a;
    Object b;
    List c;
    bg d;

    public cd()
    {
        a = null;
        b = null;
        c = null;
        d = null;
    }

    public static cd a()
    {
        if (e == null)
        {
            e = new cd();
        }
        return e;
    }

    static void a(Object obj, Object obj1, PendingIntent pendingintent)
        throws Exception
    {
        (new b(com.taplytics.b.a("com.google.android.gms.location.LocationServices", "GeofencingApi"))).a("addGeofences", new Class[] {
            Class.forName("com.google.android.gms.common.api.c"), Class.forName("com.google.android.gms.location.GeofencingRequest"), android/app/PendingIntent
        }, new Object[] {
            obj, obj1, pendingintent
        });
    }

    final b a(Context context)
    {
        try
        {
            if (a == null)
            {
                b b1 = new b("com.google.android.gms.common.api.GoogleApiClient$Builder", new Class[] {
                    android/content/Context
                }, new Object[] {
                    context
                });
                Class class1 = com.taplytics.b.a("com.google.android.gms.location.LocationServices", "API").getClass();
                Object obj = com.taplytics.b.a("com.google.android.gms.location.LocationServices", "API");
                b1.a("addApi", new Class[] {
                    class1
                }, new Object[] {
                    obj
                });
                class1 = Class.forName("com.google.android.gms.common.api.c$c");
                obj = Class.forName("com.google.android.gms.common.api.c$c");
                ClassLoader classloader = ((Class) (obj)).getClassLoader();
                ce ce1 = new ce(this);
                obj = Proxy.newProxyInstance(classloader, new Class[] {
                    obj
                }, ce1);
                b1.a("addOnConnectionFailedListener", new Class[] {
                    class1
                }, new Object[] {
                    obj
                });
                a = new b(b1.a("build"));
                b1 = a;
                class1 = Class.forName("com.google.android.gms.common.api.c$b");
                obj = Class.forName("com.google.android.gms.common.api.c$b");
                classloader = ((Class) (obj)).getClassLoader();
                context = new cf(this, context);
                context = ((Context) (Proxy.newProxyInstance(classloader, new Class[] {
                    obj
                }, context)));
                b1.a("registerConnectionCallbacks", new Class[] {
                    class1
                }, new Object[] {
                    context
                });
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gs.c((new StringBuilder("Exception ")).append(context.getMessage()).append("while adding geofences").toString());
            d.b();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gs.c((new StringBuilder("Error ")).append(context.getMessage()).append(" while adding geofences").toString());
            d.b();
        }
        return a;
    }

    public final void a(JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(jsonarray);
        (new cg(this, (byte)0)).a(new List[] {
            arraylist
        });
    }
}
