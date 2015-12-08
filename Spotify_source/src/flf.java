// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.spotify.mobile.android.util.Assertion;
import java.lang.ref.WeakReference;

final class flf extends Handler
{

    private final WeakReference a;

    flf(fld fld1)
    {
        a = new WeakReference(fld1);
    }

    public final void handleMessage(Message message)
    {
        fld fld1 = (fld)a.get();
        if (fld1 != null && fld.c(fld1) != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (message.what)
        {
        default:
            Assertion.a((new StringBuilder("Unexpected message ")).append(message.what).toString());
            return;

        case 1: // '\001'
            if (fld.c(fld1).h())
            {
                fld1.b();
                return;
            }
            break;

        case 2: // '\002'
            long l = fld.d(fld1);
            sendMessageDelayed(obtainMessage(2), 1000L - l % 1000L);
            return;

        case 3: // '\003'
            fld.e(fld1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
