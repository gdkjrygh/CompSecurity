// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.internal.hn;
import com.google.android.gms.plus.PlusOneDummyView;

// Referenced classes of package com.google.android.gms.plus.internal:
//            c

public final class g
{
    public static class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }


    private static Context aag;
    private static c abP;

    private static c H(Context context)
        throws a
    {
        hn.f(context);
        if (abP == null)
        {
            if (aag == null)
            {
                aag = GooglePlayServicesUtil.getRemoteContext(context);
                if (aag == null)
                {
                    throw new a("Could not get remote context.");
                }
            }
            context = aag.getClassLoader();
            try
            {
                abP = c.a.bl((IBinder)context.loadClass("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl").newInstance());
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
        return abP;
    }

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
                return new PlusOneDummyView(context, i);
            }
        }
        s = (View)e.e(H(context).a(e.h(context), i, j, s, k));
        return s;
    }
}
