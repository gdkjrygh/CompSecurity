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
import com.google.android.gms.dynamic.c;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//            c

public class q
{

    private static Context pW;
    private static com.google.android.gms.maps.internal.c pX;

    public q()
    {
    }

    private static Object a(ClassLoader classloader, String s)
    {
        try
        {
            classloader = ((ClassLoader) (c(((ClassLoader)dm.e(classloader)).loadClass(s))));
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

    private static boolean cI()
    {
        return cJ() != null;
    }

    private static Class cJ()
    {
        Class class1;
        try
        {
            class1 = Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return null;
        }
        return class1;
    }

    private static Context getRemoteContext(Context context)
    {
        if (pW == null)
        {
            if (cI())
            {
                pW = context;
            } else
            {
                pW = GooglePlayServicesUtil.getRemoteContext(context);
            }
        }
        return pW;
    }

    public static com.google.android.gms.maps.internal.c u(Context context)
        throws GooglePlayServicesNotAvailableException
    {
        dm.e(context);
        if (pX != null)
        {
            return pX;
        }
        v(context);
        pX = w(context);
        try
        {
            pX.a(com.google.android.gms.dynamic.c.g(getRemoteContext(context).getResources()), 0x3d8024);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeRemoteException(context);
        }
        return pX;
    }

    private static void v(Context context)
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

    private static com.google.android.gms.maps.internal.c w(Context context)
    {
        if (cI())
        {
            Log.i(com/google/android/gms/maps/internal/q.getSimpleName(), "Making Creator statically");
            return (com.google.android.gms.maps.internal.c)c(cJ());
        } else
        {
            return com.google.android.gms.maps.internal.c.a.J((IBinder)a(getRemoteContext(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
        }
    }
}
