// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;

public final class w extends ContextWrapper
{

    public w(Context context)
    {
        super(context.getApplicationContext());
    }

    private static void a(Intent intent)
    {
        if (intent != null && (intent.getFlags() & 0x10000000) == 0)
        {
            intent.addFlags(0x10000000);
        }
    }

    private static void a(Intent aintent[])
    {
        if (aintent != null)
        {
            int j = aintent.length;
            for (int i = 0; i < j; i++)
            {
                a(aintent[i]);
            }

        }
    }

    public final void startActivities(Intent aintent[])
    {
        a(aintent);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            super.startActivities(aintent);
        }
    }

    public final void startActivities(Intent aintent[], Bundle bundle)
    {
        a(aintent);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            super.startActivities(aintent, bundle);
        }
    }

    public final void startActivity(Intent intent)
    {
        a(intent);
        super.startActivity(intent);
    }

    public final void startActivity(Intent intent, Bundle bundle)
    {
        a(intent);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            super.startActivity(intent, bundle);
        }
    }
}
