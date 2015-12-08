// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.g.f;
import com.google.android.m4b.maps.g.g;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.m4b.maps.df:
//            s

public class o
{

    private static Context a;
    private static s b;

    public o()
    {
    }

    public static s a(Context context)
    {
        x.a(context);
        if (b != null)
        {
            return b;
        }
        int i = g.a(context);
        switch (i)
        {
        default:
            throw new f(i);

        case 0: // '\0'
            Log.i(com/google/android/m4b/maps/df/o.getSimpleName(), "Making Creator statically");
            break;
        }
        b = (s)a(a());
        try
        {
            s s1 = b;
            if (a == null)
            {
                a = context.getApplicationContext();
            }
            s1.a(d.a(a.getResources()), g.a);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeRemoteException(context);
        }
        return b;
    }

    private static Class a()
    {
        Class class1;
        try
        {
            class1 = Class.forName("com.google.android.m4b.maps.df.p");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new RuntimeException(classnotfoundexception);
        }
        return class1;
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
            class1 = String.valueOf(class1.getName());
            if (class1.length() != 0)
            {
                class1 = "Unable to instantiate the dynamic class ".concat(class1);
            } else
            {
                class1 = new String("Unable to instantiate the dynamic class ");
            }
            throw new IllegalStateException(class1);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            class1 = String.valueOf(class1.getName());
            if (class1.length() != 0)
            {
                class1 = "Unable to call the default constructor of ".concat(class1);
            } else
            {
                class1 = new String("Unable to call the default constructor of ");
            }
            throw new IllegalStateException(class1);
        }
        return obj;
    }
}
