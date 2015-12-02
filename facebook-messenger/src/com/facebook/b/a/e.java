// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.d.a.ab;

// Referenced classes of package com.facebook.b.a:
//            b

class e extends BroadcastReceiver
{

    final ab a;
    final b b;

    e(b b1, ab ab1)
    {
        b = b1;
        a = ab1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = a;
        boolean flag;
        if (getResultCode() == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context.a_(Boolean.valueOf(flag));
    }
}
