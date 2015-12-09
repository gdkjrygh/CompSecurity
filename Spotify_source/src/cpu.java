// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.zzg;

public final class cpu extends zzg
{

    private cpu()
    {
        super("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl");
    }

    public static View a(Context context, int i)
    {
        try
        {
            throw new NullPointerException();
        }
        catch (Exception exception)
        {
            return new cpm(context, i);
        }
    }

    protected final Object a(IBinder ibinder)
    {
        return cps.a(ibinder);
    }

    static 
    {
        new cpu();
    }
}
