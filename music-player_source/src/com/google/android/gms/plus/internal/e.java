// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.a.f;
import com.google.android.gms.common.g;
import com.google.android.gms.internal.gt;
import com.google.android.gms.plus.c;

// Referenced classes of package com.google.android.gms.plus.internal:
//            a, f, b

public final class e
{

    private static Context a;
    private static a b;

    public static View a(Context context, int i, int j, String s, int k)
    {
        if (s == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return new c(context, i);
            }
        }
        s = (View)f.a(a(context).a(f.a(context), i, j, s, k));
        return s;
    }

    private static a a(Context context)
    {
        gt.a(context);
        if (b == null)
        {
            if (a == null)
            {
                context = g.c(context);
                a = context;
                if (context == null)
                {
                    throw new com.google.android.gms.plus.internal.f("Could not get remote context.");
                }
            }
            context = a.getClassLoader();
            try
            {
                b = com.google.android.gms.plus.internal.b.a((IBinder)context.loadClass("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl").newInstance());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new com.google.android.gms.plus.internal.f("Could not load creator class.");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new com.google.android.gms.plus.internal.f("Could not instantiate creator.");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new com.google.android.gms.plus.internal.f("Could not access creator.");
            }
        }
        return b;
    }
}
