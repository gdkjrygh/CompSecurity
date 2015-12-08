// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class axp extends BroadcastReceiver
{

    private axo a;

    axp(axo axo1)
    {
        a = axo1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        boolean flag = a.b;
        intent = a;
        axo axo1 = a;
        intent.b = axo.a(context);
        if (flag != a.b)
        {
            a.a.a(a.b);
        }
    }
}
