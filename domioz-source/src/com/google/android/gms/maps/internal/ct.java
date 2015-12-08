// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.b.m;
import com.google.android.gms.common.c;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.ap;

// Referenced classes of package com.google.android.gms.maps.internal:
//            al, ak

public class ct
{

    private static Context a;
    private static ak b;

    public ct()
    {
    }

    public static ak a(Context context)
    {
        ap.a(context);
        if (b != null)
        {
            return b;
        }
        int i = e.a(context);
        switch (i)
        {
        default:
            throw new c(i);

        case 0: // '\0'
            Log.i(com/google/android/gms/maps/internal/ct.getSimpleName(), "Making Creator dynamically");
            break;
        }
        b = al.a((IBinder)a(b(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
        try
        {
            b.a(m.a(b(context).getResources()), 0x6c42d8);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new com.google.android.gms.maps.model.e(context);
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
            throw new IllegalStateException((new StringBuilder("Unable to instantiate the dynamic class ")).append(class1.getName()).toString());
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new IllegalStateException((new StringBuilder("Unable to call the default constructor of ")).append(class1.getName()).toString());
        }
        return obj;
    }

    private static Object a(ClassLoader classloader, String s)
    {
        try
        {
            classloader = ((ClassLoader) (a(((ClassLoader)ap.a(classloader)).loadClass(s))));
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            throw new IllegalStateException((new StringBuilder("Unable to find dynamic class ")).append(s).toString());
        }
        return classloader;
    }

    private static Context b(Context context)
    {
        if (a == null)
        {
            a = e.e(context);
        }
        return a;
    }
}
