// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//            c

public class u
{

    private static Context ajx;
    private static c ajy;

    public u()
    {
    }

    public static c S(Context context)
        throws GooglePlayServicesNotAvailableException
    {
        o.i(context);
        if (ajy != null)
        {
            return ajy;
        }
        T(context);
        ajy = U(context);
        try
        {
            ajy.a(e.k(getRemoteContext(context).getResources()), 0x5e2978);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeRemoteException(context);
        }
        return ajy;
    }

    private static void T(Context context)
        throws GooglePlayServicesNotAvailableException
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        switch (i)
        {
        default:
            throw new GooglePlayServicesNotAvailableException(i);

        case 0: // '\0'
            return;
        }
    }

    private static c U(Context context)
    {
        if (mK())
        {
            Log.i(com/google/android/gms/maps/internal/u.getSimpleName(), "Making Creator statically");
            return (c)c(mL());
        } else
        {
            Log.i(com/google/android/gms/maps/internal/u.getSimpleName(), "Making Creator dynamically");
            return com.google.android.gms.maps.internal.c.a.aP((IBinder)a(getRemoteContext(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
        }
    }

    private static Object a(ClassLoader classloader, String s)
    {
        try
        {
            classloader = ((ClassLoader) (c(((ClassLoader)o.i(classloader)).loadClass(s))));
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to find dynamic class ").append(s).toString());
        }
        return classloader;
    }

    private static Object c(Class class1)
    {
        Object obj;
        try
        {
            obj = class1.newInstance();
        }
        catch (InstantiationException instantiationexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to instantiate the dynamic class ").append(class1.getName()).toString());
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to call the default constructor of ").append(class1.getName()).toString());
        }
        return obj;
    }

    private static Context getRemoteContext(Context context)
    {
        if (ajx == null)
        {
            if (mK())
            {
                ajx = context.getApplicationContext();
            } else
            {
                ajx = GooglePlayServicesUtil.getRemoteContext(context);
            }
        }
        return ajx;
    }

    private static boolean mK()
    {
        return false;
    }

    private static Class mL()
    {
        Class class1;
        try
        {
            if (android.os.Build.VERSION.SDK_INT < 15)
            {
                return Class.forName("com.google.android.gms.maps.internal.CreatorImplGmm6");
            }
            class1 = Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new RuntimeException(classnotfoundexception);
        }
        return class1;
    }
}
