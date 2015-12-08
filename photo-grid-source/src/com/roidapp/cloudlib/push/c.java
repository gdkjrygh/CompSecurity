// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.push;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.gcm.a;
import java.io.IOException;

// Referenced classes of package com.roidapp.cloudlib.push:
//            a

final class c
    implements Runnable
{

    final Context a;

    c(Context context)
    {
        a = context;
        super();
    }

    public final void run()
    {
        String s = null;
        String s1 = com.google.android.gms.gcm.a.a(a).a(new String[] {
            "140769328112"
        });
        s = s1;
_L2:
        if (!TextUtils.isEmpty(s))
        {
            com.roidapp.cloudlib.push.a.c(a, s);
            com.roidapp.cloudlib.push.a.d(a, s);
        }
        return;
        Object obj;
        obj;
        ((IOException) (obj)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj;
        ((SecurityException) (obj)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }
}
