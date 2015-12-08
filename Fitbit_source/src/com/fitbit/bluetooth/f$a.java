// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.ParcelUuid;
import android.text.TextUtils;
import com.fitbit.util.z;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

// Referenced classes of package com.fitbit.bluetooth:
//            f

private static final class <init> extends BroadcastReceiver
{

    private Reference a;

    public void a(Receiver receiver)
    {
        a = new SoftReference(receiver);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (a == null)
        {
            z.a(this);
        } else
        {
            context = (Receiver)a.get();
            if (context == null)
            {
                z.a(this);
                return;
            }
            int i = intent.getIntExtra("bytes", 0);
            int j = intent.getIntExtra("pending_bytes", 0x7fffffff);
            ParcelUuid parceluuid = (ParcelUuid)intent.getParcelableExtra("transfer_source");
            long l = intent.getLongExtra("time_of_transfer", 0L);
            intent = intent.getAction();
            if (TextUtils.equals(f.a, intent))
            {
                context.b(parceluuid.getUuid(), i, j, l);
                return;
            }
            if (TextUtils.equals(f.b, intent))
            {
                context.a(parceluuid.getUuid(), i, j, l);
                return;
            }
        }
    }

    private ce()
    {
    }

    ce(ce ce)
    {
        this();
    }
}
