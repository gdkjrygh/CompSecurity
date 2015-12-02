// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class axu
{

    private static Context a;
    private static avj b;

    public axu()
    {
    }

    public static avj a(Context context)
    {
        wn.a(context);
        if (b != null)
        {
            return b;
        }
        b(context);
        b = c(context);
        try
        {
            b.a(aai.a(d(context).getResources()), 0x6fcd18);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new ayb(context);
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
            classloader = ((ClassLoader) (a(((ClassLoader)wn.a(classloader)).loadClass(s))));
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            throw new IllegalStateException((new StringBuilder("Unable to find dynamic class ")).append(s).toString());
        }
        return classloader;
    }

    private static void b(Context context)
    {
        int i = rz.a(context);
        switch (i)
        {
        default:
            throw new rx(i);

        case 0: // '\0'
            return;
        }
    }

    private static avj c(Context context)
    {
        Log.i(axu.getSimpleName(), "Making Creator dynamically");
        return avk.a((IBinder)a(d(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
    }

    private static Context d(Context context)
    {
        if (a == null)
        {
            a = rz.e(context);
        }
        return a;
    }
}
