// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.b.d;
import com.google.android.gms.common.c;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.y;

// Referenced classes of package com.google.android.gms.maps.a:
//            o

public class ak
{

    private static Context a;
    private static o b;

    public ak()
    {
    }

    public static o a(Context context)
        throws c
    {
        y.a(context);
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
            Log.i(com/google/android/gms/maps/a/ak.getSimpleName(), "Making Creator dynamically");
            break;
        }
        b = o.a.a((IBinder)a(b(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
        try
        {
            b.a(d.a(b(context).getResources()), e.a);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new com.google.android.gms.maps.model.c(context);
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
            classloader = ((ClassLoader) (a(((ClassLoader)y.a(classloader)).loadClass(s))));
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
            a = e.f(context);
        }
        return a;
    }
}
