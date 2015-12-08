// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.b.d;
import com.google.android.gms.plus.c;

// Referenced classes of package com.google.android.gms.plus.internal:
//            a, b

public final class e extends com.google.android.gms.b.e
{

    private static final e a = new e();

    private e()
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
                return new c(context, i);
            }
        }
        s = (View)d.a(((a)a.a(context)).a(d.a(context), i, j, s, k));
        return s;
    }

    protected final Object a(IBinder ibinder)
    {
        return b.a(ibinder);
    }

}
