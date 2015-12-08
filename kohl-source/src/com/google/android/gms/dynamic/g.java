// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.hn;

public abstract class g
{
    public static class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }

        public a(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }


    private final String Mi;
    private Object Mj;

    protected g(String s)
    {
        Mi = s;
    }

    protected final Object D(Context context)
        throws a
    {
        if (Mj == null)
        {
            hn.f(context);
            context = GooglePlayServicesUtil.getRemoteContext(context);
            if (context == null)
            {
                throw new a("Could not get remote context.");
            }
            context = context.getClassLoader();
            try
            {
                Mj = d((IBinder)context.loadClass(Mi).newInstance());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new a("Could not load creator class.");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new a("Could not instantiate creator.");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new a("Could not access creator.");
            }
        }
        return Mj;
    }

    protected abstract Object d(IBinder ibinder);
}
