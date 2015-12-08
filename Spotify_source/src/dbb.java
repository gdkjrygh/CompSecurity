// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public abstract class dbb extends BroadcastReceiver
{

    private final String a;

    public dbb(String s)
    {
        a = (new StringBuilder("package:")).append(s).toString();
    }

    public abstract void a();

    public void onReceive(Context context, Intent intent)
    {
        if (a.equals(intent.getDataString()))
        {
            a();
        }
    }
}
