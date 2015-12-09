// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.am;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//            p

public class al
{

    private static Context a;
    private static p b;

    public al()
    {
    }

    public static p a(Context context)
        throws GooglePlayServicesNotAvailableException
    {
        am.a(context);
        if (b != null)
        {
            return b;
        }
        b(context);
        b = c(context);
        try
        {
            b.a(f.a(d(context).getResources()), 0x648278);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeRemoteException(context);
        }
        return b;
    }

    private static Object a(Class class1)
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

    private static Object a(ClassLoader classloader, String s)
    {
        try
        {
            classloader = ((ClassLoader) (a(((ClassLoader)am.a(classloader)).loadClass(s))));
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to find dynamic class ").append(s).toString());
        }
        return classloader;
    }

    public static boolean a()
    {
        return false;
    }

    private static Class b()
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

    private static void b(Context context)
        throws GooglePlayServicesNotAvailableException
    {
        int i = e.a(context);
        switch (i)
        {
        default:
            throw new GooglePlayServicesNotAvailableException(i);

        case 0: // '\0'
            return;
        }
    }

    private static p c(Context context)
    {
        if (a())
        {
            Log.i(com/google/android/gms/maps/internal/al.getSimpleName(), "Making Creator statically");
            return (p)a(b());
        } else
        {
            Log.i(com/google/android/gms/maps/internal/al.getSimpleName(), "Making Creator dynamically");
            return p.a.a((IBinder)a(d(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
        }
    }

    private static Context d(Context context)
    {
        if (a == null)
        {
            if (a())
            {
                a = context.getApplicationContext();
            } else
            {
                a = e.e(context);
            }
        }
        return a;
    }
}
