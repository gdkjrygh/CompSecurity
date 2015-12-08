// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.adjust.sdk:
//            Adjust, AdjustInstance

public class AdjustReferrerReceiver extends BroadcastReceiver
{

    public AdjustReferrerReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getStringExtra("referrer");
        if (context == null)
        {
            return;
        }
        try
        {
            context = URLDecoder.decode(context, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = "malformed";
        }
        Adjust.getDefaultInstance().sendReferrer(context);
    }
}
