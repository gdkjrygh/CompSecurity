// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push.sms;

import android.content.Context;
import android.content.Intent;
import com.facebook.base.a.g;
import com.facebook.c.b;
import com.facebook.inject.t;
import com.facebook.orca.annotations.IsMmsReceivePermitted;
import com.facebook.orca.annotations.IsSmsNotifyEnabled;
import com.facebook.orca.nux.h;

// Referenced classes of package com.facebook.orca.push.sms:
//            MmsReceiver

class c
    implements b
{

    c()
    {
    }

    public final void a(Context context, Intent intent, com.facebook.c.c c1)
    {
        g.a(context);
        Object obj = t.a(context);
        boolean flag = ((Boolean)((t) (obj)).a(java/lang/Boolean, com/facebook/orca/annotations/IsSmsNotifyEnabled)).booleanValue();
        boolean flag1 = ((Boolean)((t) (obj)).a(java/lang/Boolean, com/facebook/orca/annotations/IsMmsReceivePermitted)).booleanValue();
        obj = (h)((t) (obj)).a(com/facebook/orca/nux/h);
        if (flag && flag1 && ((h) (obj)).h())
        {
            MmsReceiver.a(context, intent);
            c1.setResult(-1, null, null);
            c1.abortBroadcast();
        }
    }
}
