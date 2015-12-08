// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.u;

public abstract class zzg
{
    public static class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }

        public zza(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }


    private final String a;
    private Object b;

    public zzg(String s)
    {
        a = s;
    }

    public final Object a(Context context)
        throws zza
    {
        if (b == null)
        {
            u.a(context);
            context = GooglePlayServicesUtil.getRemoteContext(context);
            if (context == null)
            {
                throw new zza("Could not get remote context.");
            }
            context = context.getClassLoader();
            try
            {
                b = a((IBinder)context.loadClass(a).newInstance());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new zza("Could not load creator class.", context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new zza("Could not instantiate creator.", context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new zza("Could not access creator.", context);
            }
        }
        return b;
    }

    public abstract Object a(IBinder ibinder);
}
