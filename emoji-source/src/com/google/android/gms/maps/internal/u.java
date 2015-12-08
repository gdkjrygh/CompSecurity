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
import com.google.android.gms.dynamic.e;
import com.google.android.gms.internal.hm;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//            c

public class u
{

    private static Context aaj;
    private static c aak;

    public u()
    {
    }

    public static c H(Context context)
        throws GooglePlayServicesNotAvailableException
    {
        hm.f(context);
        if (aak != null)
        {
            return aak;
        }
        I(context);
        aak = J(context);
        try
        {
            aak.a(e.h(getRemoteContext(context).getResources()), 0x4da6e8);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeRemoteException(context);
        }
        return aak;
    }

    private static void I(Context context)
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

    private static c J(Context context)
    {
        if (jJ())
        {
            Log.i(com/google/android/gms/maps/internal/u.getSimpleName(), "Making Creator statically");
            return (c)c(jK());
        } else
        {
            Log.i(com/google/android/gms/maps/internal/u.getSimpleName(), "Making Creator dynamically");
            return com.google.android.gms.maps.internal.c.a.ax((IBinder)a(getRemoteContext(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
        }
    }

    private static Object a(ClassLoader classloader, String s)
    {
        try
        {
            classloader = ((ClassLoader) (c(((ClassLoader)hm.f(classloader)).loadClass(s))));
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
        if (aaj == null)
        {
            if (jJ())
            {
                aaj = context.getApplicationContext();
            } else
            {
                aaj = GooglePlayServicesUtil.getRemoteContext(context);
            }
        }
        return aaj;
    }

    private static boolean jJ()
    {
        return false;
    }

    private static Class jK()
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
