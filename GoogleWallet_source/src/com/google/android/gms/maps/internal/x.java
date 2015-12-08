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
import com.google.android.gms.internal.kn;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//            c

public class x
{

    private static Context TE;
    private static c azO;

    public x()
    {
    }

    public static c V(Context context)
        throws GooglePlayServicesNotAvailableException
    {
        kn.k(context);
        if (azO != null)
        {
            return azO;
        }
        W(context);
        azO = X(context);
        try
        {
            azO.a(e.q(getRemoteContext(context).getResources()), 0x648278);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeRemoteException(context);
        }
        return azO;
    }

    private static void W(Context context)
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

    private static c X(Context context)
    {
        if (qm())
        {
            Log.i(com/google/android/gms/maps/internal/x.getSimpleName(), "Making Creator statically");
            return (c)b(qn());
        } else
        {
            Log.i(com/google/android/gms/maps/internal/x.getSimpleName(), "Making Creator dynamically");
            return c.a.cy((IBinder)b(getRemoteContext(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
        }
    }

    private static Object b(Class class1)
    {
        Object obj;
        try
        {
            obj = class1.newInstance();
        }
        catch (InstantiationException instantiationexception)
        {
            throw new IllegalStateException((new StringBuilder("Unable to instantiate the dynamic class ")).append(class1.getName()).toString());
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new IllegalStateException((new StringBuilder("Unable to call the default constructor of ")).append(class1.getName()).toString());
        }
        return obj;
    }

    private static Object b(ClassLoader classloader, String s)
    {
        try
        {
            classloader = ((ClassLoader) (b(((ClassLoader)kn.k(classloader)).loadClass(s))));
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            throw new IllegalStateException((new StringBuilder("Unable to find dynamic class ")).append(s).toString());
        }
        return classloader;
    }

    private static Context getRemoteContext(Context context)
    {
        if (TE == null)
        {
            if (qm())
            {
                TE = context.getApplicationContext();
            } else
            {
                TE = GooglePlayServicesUtil.getRemoteContext(context);
            }
        }
        return TE;
    }

    private static boolean qm()
    {
        return false;
    }

    private static Class qn()
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
