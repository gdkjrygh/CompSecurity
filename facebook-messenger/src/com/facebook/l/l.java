// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.l;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.broadcast.q;
import com.facebook.contacts.upload.ContactsUploadState;
import com.facebook.contacts.upload.k;
import com.facebook.push.mqtt.cj;

// Referenced classes of package com.facebook.l:
//            t, k

class l extends q
{

    final com.facebook.l.k a;

    l(com.facebook.l.k k1, Context context, IntentFilter intentfilter)
    {
        a = k1;
        super(context, intentfilter);
    }

    public void a(Context context, Intent intent)
    {
        if (!"com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        context = cj.fromValue(intent.getIntExtra("event", -1));
        t.a[context.ordinal()];
        JVM INSTR tableswitch 1 1: default 48
    //                   1 49;
           goto _L3 _L4
_L3:
        return;
_L4:
        a.e();
        return;
_L2:
        if ("com.facebook.orca.ACTION_FRIEND_SYNC_PROGRESS".equals(intent.getAction()))
        {
            k.a(a);
            return;
        }
        if ("com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED".equals(intent.getAction()) && ((ContactsUploadState)intent.getParcelableExtra("state")).a() == k.RUNNING)
        {
            k.a(a);
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }
}
