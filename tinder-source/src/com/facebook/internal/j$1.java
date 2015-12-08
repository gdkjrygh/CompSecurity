// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.facebook.internal:
//            j

final class a extends Handler
{

    final j a;

    public final void handleMessage(Message message)
    {
        j j1 = a;
        if (message.what == j1.d)
        {
            message = message.getData();
            if (message.getString("com.facebook.platform.status.ERROR_TYPE") != null)
            {
                j1.a(null);
            } else
            {
                j1.a(message);
            }
            j1.a.unbindService(j1);
        }
    }

    (j j1)
    {
        a = j1;
        super();
    }
}
