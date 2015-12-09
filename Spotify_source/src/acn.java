// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class acn extends BroadcastReceiver
{

    public acn()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        context = intent.getStringExtra("referrer");
        if (context == null)
        {
            return;
        }
        long l;
        try
        {
            context = URLDecoder.decode(context, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = "malformed";
        }
        intent = aci.a();
        l = System.currentTimeMillis();
        if (((acm) (intent)).c == null)
        {
            intent.a = context;
            intent.b = l;
            return;
        } else
        {
            ((acm) (intent)).c.a(context, l);
            return;
        }
    }
}
