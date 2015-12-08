// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.jx;

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


    private final String TI;
    private Object TJ;

    protected g(String s)
    {
        TI = s;
    }

    protected final Object L(Context context)
        throws a
    {
        if (TJ == null)
        {
            jx.i(context);
            context = GooglePlayServicesUtil.getRemoteContext(context);
            if (context == null)
            {
                throw new a("Could not get remote context.");
            }
            context = context.getClassLoader();
            try
            {
                TJ = d((IBinder)context.loadClass(TI).newInstance());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new a("Could not load creator class.", context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new a("Could not instantiate creator.", context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new a("Could not access creator.", context);
            }
        }
        return TJ;
    }

    protected abstract Object d(IBinder ibinder);
}
