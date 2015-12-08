// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.zzg;

public final class brr extends zzg
{

    private static final brr a = new brr();

    private brr()
    {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View a(Context context)
    {
        return a.c(context);
    }

    private View c(Context context)
    {
        try
        {
            byb byb = bye.a(context);
            context = (View)bye.a(((btg)b(context)).a(byb, 0, 0));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new com.google.android.gms.dynamic.zzg.zza((new StringBuilder("Could not get button with size 0 and color 0")).toString(), context);
        }
        return context;
    }

    public final Object a(IBinder ibinder)
    {
        return bth.a(ibinder);
    }

}
