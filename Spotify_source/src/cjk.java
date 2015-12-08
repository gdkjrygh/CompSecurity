// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class cjk extends BroadcastReceiver
{

    private cjj a;

    private cjk(cjj cjj1)
    {
        a = cjj1;
        super();
    }

    public cjk(cjj cjj1, byte byte0)
    {
        this(cjj1);
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction()))
        {
            cjj.a(a, true);
        } else
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
        {
            cjj.a(a, false);
            return;
        }
    }
}
