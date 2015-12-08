// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class eee extends mtf
{

    private final int a;

    public eee(int i)
    {
        super("EnablePhotosNotificationsSwitchTask");
        a = i;
    }

    protected final mue a(Context context)
    {
        context = nwf.a(context, a);
        context.d();
        if (context.l())
        {
            return new mue(0, ((nxx) (context)).n, null);
        } else
        {
            context = new mue(true);
            context.a().putInt("account_id", a);
            return context;
        }
    }
}
