// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.plus.PlusOneDummyView;

// Referenced classes of package com.google.android.gms.plus.internal:
//            c

public final class g extends com.google.android.gms.dynamic.g
{

    private static final g anP = new g();

    private g()
    {
        super("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl");
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
        s = (View)e.f(((c)anP.L(context)).a(e.k(context), i, j, s, k));
        return s;
    }

    protected c bO(IBinder ibinder)
    {
        return c.a.bL(ibinder);
    }

    protected Object d(IBinder ibinder)
    {
        return bO(ibinder);
    }

}
