// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.e;

// Referenced classes of package com.google.android.gms.internal:
//            dk

public final class dn extends e
{

    private static final dn ll = new dn();

    private dn()
    {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View d(Context context, int i, int j)
        throws com.google.android.gms.dynamic.e.a
    {
        return ll.e(context, i, j);
    }

    private View e(Context context, int i, int j)
        throws com.google.android.gms.dynamic.e.a
    {
        try
        {
            com.google.android.gms.dynamic.b b = c.g(context);
            context = (View)c.b(((dk)t(context)).a(b, i, j));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new com.google.android.gms.dynamic.e.a((new StringBuilder()).append("Could not get button with size ").append(i).append(" and color ").append(j).toString(), context);
        }
        return context;
    }

    public Object d(IBinder ibinder)
    {
        return y(ibinder);
    }

    public dk y(IBinder ibinder)
    {
        return dk.a.x(ibinder);
    }

}
