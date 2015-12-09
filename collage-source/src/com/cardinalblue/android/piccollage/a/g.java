// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.a;

import android.content.Intent;
import android.os.Bundle;

public class g
{

    public g()
    {
    }

    public static void a(Intent intent, Bundle bundle)
    {
        if (bundle != null && bundle.containsKey("key_notification_id"))
        {
            intent.putExtra("key_notification_id", bundle.getInt("key_notification_id", -1));
            if (bundle.containsKey("key_notification_target_activity"))
            {
                intent.putExtra("key_notification_target_activity", bundle.getString("key_notification_target_activity"));
            }
            if (bundle.containsKey("flurry_event"))
            {
                intent.putExtra("flurry_event", bundle.getString("flurry_event"));
            }
            if (bundle.containsKey("key_notification_payload"))
            {
                intent.putExtra("key_notification_payload", bundle.getString("key_notification_payload"));
            }
        }
    }
}
