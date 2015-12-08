// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzx;

public abstract class c
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


    private final String zzana;
    private Object zzanb;

    public c(String s)
    {
        zzana = s;
    }

    public final Object zzar(Context context)
        throws a
    {
        if (zzanb == null)
        {
            zzx.zzv(context);
            context = GooglePlayServicesUtil.getRemoteContext(context);
            if (context == null)
            {
                throw new a("Could not get remote context.");
            }
            context = context.getClassLoader();
            try
            {
                zzanb = zzd((IBinder)context.loadClass(zzana).newInstance());
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
        return zzanb;
    }

    public abstract Object zzd(IBinder ibinder);
}
