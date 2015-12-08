// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;

// Referenced classes of package com.google.android.gms.internal:
//            fr, ft, ga

final class fs extends Handler
{

    final fr a;

    public fs(fr fr1, Looper looper)
    {
        a = fr1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 1 && !a.f())
        {
            ((ft)message.obj).b();
            return;
        }
        if (message.what == 3)
        {
            com.google.android.gms.internal.fr.a(a).a(new a(((Integer)message.obj).intValue(), null));
            return;
        }
        if (message.what == 4)
        {
            com.google.android.gms.internal.fr.a(a, 1);
            com.google.android.gms.internal.fr.a(a, null);
            ga ga1 = com.google.android.gms.internal.fr.a(a);
            ((Integer)message.obj).intValue();
            ga1.b();
            return;
        }
        if (message.what == 2 && !a.e())
        {
            ((ft)message.obj).b();
            return;
        }
        if (message.what == 2 || message.what == 1)
        {
            ((ft)message.obj).a();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }
}
