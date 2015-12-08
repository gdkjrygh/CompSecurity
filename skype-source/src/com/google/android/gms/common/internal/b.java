// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.b.d;
import com.google.android.gms.b.f;

// Referenced classes of package com.google.android.gms.common.internal:
//            w

public final class b extends f
{

    private static final b a = new b();

    private b()
    {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View a(Context context, int i, int j)
        throws com.google.android.gms.b.f.a
    {
        return a.b(context, i, j);
    }

    private View b(Context context, int i, int j)
        throws com.google.android.gms.b.f.a
    {
        try
        {
            com.google.android.gms.b.c c = d.a(context);
            context = (View)d.a(((w)a(context)).a(c, i, j));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new com.google.android.gms.b.f.a((new StringBuilder("Could not get button with size ")).append(i).append(" and color ").append(j).toString(), context);
        }
        return context;
    }

    public final Object a(IBinder ibinder)
    {
        return w.a.a(ibinder);
    }

}
