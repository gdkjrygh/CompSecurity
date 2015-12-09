// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.a.c;

// Referenced classes of package com.google.android.gms.common.internal:
//            w

public final class b extends c
{

    private static final b a = new b();

    private b()
    {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View a(Context context, int i, int j)
        throws com.google.android.gms.a.c.a
    {
        return a.b(context, i, j);
    }

    private View b(Context context, int i, int j)
        throws com.google.android.gms.a.c.a
    {
        try
        {
            com.google.android.gms.a.a a1 = com.google.android.gms.a.b.a(context);
            context = (View)com.google.android.gms.a.b.a(((w)zzar(context)).a(a1, i, j));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new com.google.android.gms.a.c.a((new StringBuilder()).append("Could not get button with size ").append(i).append(" and color ").append(j).toString(), context);
        }
        return context;
    }

    public w a(IBinder ibinder)
    {
        return w.a.a(ibinder);
    }

    public Object zzd(IBinder ibinder)
    {
        return a(ibinder);
    }

}
