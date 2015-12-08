// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.b.d;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;

// Referenced classes of package com.google.android.gms.common.internal:
//            bf, bg

public final class c extends e
{

    private static final c a = new c();

    private c()
    {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View a(Context context, int i, int j)
    {
        return a.b(context, i, j);
    }

    private View b(Context context, int i, int j)
    {
        try
        {
            com.google.android.gms.b.a a1 = d.a(context);
            context = (View)d.a(((bf)a(context)).a(a1, i, j));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new f((new StringBuilder("Could not get button with size ")).append(i).append(" and color ").append(j).toString(), context);
        }
        return context;
    }

    public final Object a(IBinder ibinder)
    {
        return bg.a(ibinder);
    }

}
