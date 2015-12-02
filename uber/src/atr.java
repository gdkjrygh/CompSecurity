// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.RemoteException;

public final class atr
{

    public static int a(Context context)
    {
        wn.a(context);
        try
        {
            context = axu.a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return ((rx) (context)).a;
        }
        a(((avj) (context)));
        return 0;
    }

    private static void a(avj avj1)
    {
        try
        {
            atg.a(avj1.a());
            axx.a(avj1.b());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (avj avj1)
        {
            throw new ayb(avj1);
        }
    }
}
