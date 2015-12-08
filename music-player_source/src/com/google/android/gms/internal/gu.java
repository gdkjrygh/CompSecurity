// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.a.f;
import com.google.android.gms.a.h;
import com.google.android.gms.a.i;

// Referenced classes of package com.google.android.gms.internal:
//            gn, go

public final class gu extends h
{

    private static final gu a = new gu();

    private gu()
    {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View a(Context context, int j, int k)
    {
        return a.b(context, j, k);
    }

    private View b(Context context, int j, int k)
    {
        try
        {
            com.google.android.gms.a.c c = f.a(context);
            context = (View)f.a(((gn)a(context)).a(c, j, k));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new i((new StringBuilder("Could not get button with size ")).append(j).append(" and color ").append(k).toString(), context);
        }
        return context;
    }

    public final Object a(IBinder ibinder)
    {
        return go.a(ibinder);
    }

}
