// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.y;

public abstract class f
{
    public static final class a extends Exception
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


    private final String a;
    private Object b;

    protected f(String s)
    {
        a = s;
    }

    protected final Object a(Context context)
        throws a
    {
        if (b == null)
        {
            y.a(context);
            context = e.f(context);
            if (context == null)
            {
                throw new a("Could not get remote context.");
            }
            context = context.getClassLoader();
            try
            {
                b = a((IBinder)context.loadClass(a).newInstance());
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
        return b;
    }

    protected abstract Object a(IBinder ibinder);
}
