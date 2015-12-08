// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer.drm.KeysExpiredException;

final class bbr extends Handler
{

    private bbo a;

    public bbr(bbo bbo1, Looper looper)
    {
        a = bbo1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        if (bbo.b(a) == 0 || bbo.c(a) != 3 && bbo.c(a) != 4)
        {
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            bbo.e(a);
            bbo.f(a);
            return;

        case 2: // '\002'
            bbo.d(a);
            return;

        case 3: // '\003'
            bbo.e(a);
            break;
        }
        bbo.a(a, new KeysExpiredException());
    }
}
