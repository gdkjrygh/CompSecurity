// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.notifications.impl.gcm.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ez;
import java.util.Iterator;
import java.util.Set;
import mbr;
import nsn;
import ntn;
import olm;

public final class GcmReceiver extends ez
{

    private static final String a = ntn.a(com/google/android/libraries/social/notifications/impl/gcm/receiver/GcmReceiver);

    public GcmReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()))
        {
            String s = a;
            String s1 = String.valueOf(intent);
            Object obj;
            StringBuilder stringbuilder;
            if (intent == null)
            {
                obj = null;
            } else
            {
                obj = intent.getExtras();
            }
            stringbuilder = new StringBuilder();
            stringbuilder.append("Extras: [\n");
            if (obj != null)
            {
                for (Iterator iterator = ((Bundle) (obj)).keySet().iterator(); iterator.hasNext(); stringbuilder.append("\n"))
                {
                    String s2 = (String)iterator.next();
                    stringbuilder.append(s2);
                    stringbuilder.append(" : ");
                    stringbuilder.append(((Bundle) (obj)).get(s2));
                }

            }
            stringbuilder.append("]");
            obj = String.valueOf(stringbuilder.toString());
            ntn.b(s, (new StringBuilder(String.valueOf(s1).length() + 12 + String.valueOf(obj).length())).append("onReceive: ").append(s1).append("\n").append(((String) (obj))).toString());
            obj = (mbr)olm.a(context, mbr);
            if (((mbr) (obj)).d(intent) || ((mbr) (obj)).a(intent))
            {
                ((nsn)olm.a(context, nsn)).a(context, intent);
                ntn.b(a, "Received a GCM message.");
            } else
            {
                if (((mbr) (obj)).b(intent))
                {
                    ntn.b(a, "GCM Send error message.");
                    return;
                }
                if (((mbr) (obj)).c(intent))
                {
                    ntn.b(a, "Deleted messages on server.");
                    return;
                }
            }
        }
    }

}
