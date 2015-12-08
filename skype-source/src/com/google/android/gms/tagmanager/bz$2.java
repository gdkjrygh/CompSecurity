// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bz

final class a
    implements android.os.er.Callback
{

    final bz a;

    public final boolean handleMessage(Message message)
    {
        if (1 == message.what && bz.e().equals(message.obj))
        {
            a.a();
            if (bz.b(a) > 0 && !bz.c(a))
            {
                bz.d(a).sendMessageDelayed(bz.d(a).obtainMessage(1, bz.e()), bz.b(a));
            }
        }
        return true;
    }

    (bz bz1)
    {
        a = bz1;
        super();
    }
}
