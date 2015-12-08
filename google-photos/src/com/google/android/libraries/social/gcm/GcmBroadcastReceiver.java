// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import ez;
import java.util.Iterator;
import java.util.List;
import mbr;
import nae;
import olm;

public final class GcmBroadcastReceiver extends ez
{

    public GcmBroadcastReceiver()
    {
    }

    private static String b(Intent intent)
    {
        if (intent == null)
        {
            intent = null;
        } else
        {
            intent = intent.getExtras();
        }
        if (intent == null)
        {
            return null;
        } else
        {
            return intent.toString();
        }
    }

    private static boolean b(Context context, Intent intent)
    {
        String s = intent.getExtras().getString("type");
        boolean flag1;
        if (!TextUtils.isEmpty(s))
        {
            Iterator iterator = olm.c(context, nae).iterator();
            boolean flag = false;
            do
            {
                flag1 = flag;
                if (!iterator.hasNext())
                {
                    break;
                }
                nae nae1 = (nae)iterator.next();
                if (TextUtils.equals(s, nae1.a()))
                {
                    nae1.a(context, intent);
                    flag = true;
                }
            } while (true);
        } else
        {
            flag1 = false;
        }
        return flag1;
    }

    public final void onReceive(Context context, Intent intent)
    {
        mbr mbr1;
        if (Log.isLoggable("GcmBroadcastReceiver", 3))
        {
            String s = String.valueOf(intent);
            String s1 = String.valueOf(b(intent));
            (new StringBuilder(String.valueOf(s).length() + 20 + String.valueOf(s1).length())).append("onReceive: ").append(s).append(" extras: ").append(s1);
        }
        mbr1 = (mbr)olm.a(context.getApplicationContext(), mbr);
        if (!mbr1.d(intent) && !mbr1.a(intent)) goto _L2; else goto _L1
_L1:
        b(context, intent);
        if (!Log.isLoggable("GcmBroadcastReceiver", 3)) goto _L4; else goto _L3
_L3:
        context = String.valueOf(b(intent));
        if (context.length() == 0) goto _L6; else goto _L5
_L5:
        "GCM message: ".concat(context);
_L4:
        return;
_L6:
        new String("GCM message: ");
        return;
_L2:
        if (!mbr1.b(intent))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!Log.isLoggable("GcmBroadcastReceiver", 3)) goto _L4; else goto _L7
_L7:
        context = String.valueOf(b(intent));
        if (context.length() != 0)
        {
            "Send error: ".concat(context);
            return;
        } else
        {
            new String("Send error: ");
            return;
        }
        if (!mbr1.c(intent) || !Log.isLoggable("GcmBroadcastReceiver", 3)) goto _L4; else goto _L8
_L8:
        context = String.valueOf(b(intent));
        if (context.length() != 0)
        {
            "Deleted messages on server: ".concat(context);
            return;
        } else
        {
            new String("Deleted messages on server: ");
            return;
        }
    }
}
