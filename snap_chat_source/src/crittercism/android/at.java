// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import ZQ;
import ZZ;
import aau;
import abv;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class at extends BroadcastReceiver
{

    private ZQ a;
    private String b;
    private ZZ c;

    public at(Context context, ZQ zq)
    {
        a = zq;
        context = new abv(context);
        b = context.b();
        c = context.a();
    }

    public final void onReceive(Context context, Intent intent)
    {
        (new StringBuilder("CrittercismReceiver: INTENT ACTION = ")).append(intent.getAction());
        context = new abv(context);
        intent = context.a();
        if (c != intent && intent != ZZ.b)
        {
            if (intent == ZZ.c)
            {
                a.a(new aau(2));
            } else
            if (c == ZZ.c || c == ZZ.b)
            {
                a.a(new aau(1));
            }
            c = intent;
        }
        context = context.b();
        if (!context.equals(b))
        {
            if (b.equals("unknown") || b.equals("disconnected"))
            {
                if (!context.equals("unknown") && !context.equals("disconnected"))
                {
                    a.a(new aau(3, context));
                }
            } else
            if (context.equals("disconnected"))
            {
                a.a(new aau(4, b));
            } else
            if (!context.equals("unknown"))
            {
                a.a(new aau(b, context));
            }
            b = context;
        }
    }
}
