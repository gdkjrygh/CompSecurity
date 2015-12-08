// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.snapchat.android.Timber;

public final class id.os.Looper extends Handler
{

    private vJ a;

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        Timber.c("DiscoverRepository", "Handling message %d", new Object[] {
            Integer.valueOf(message.what)
        });
        if (message.what == 1)
        {
            vJ.a(a);
        }
    }

    public >(vJ vj, Looper looper)
    {
        a = vj;
        super(looper);
    }
}
