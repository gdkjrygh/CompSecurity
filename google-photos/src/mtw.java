// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Message;

final class mtw
    implements Runnable
{

    private mtf a;
    private mue b;
    private mts c;

    mtw(mts mts1, mtf mtf, mue mue1)
    {
        c = mts1;
        a = mtf;
        b = mue1;
        super();
    }

    public final void run()
    {
        Object obj;
label0:
        {
            obj = mts.a(c);
            mtf mtf = a;
            mue mue1 = b;
            pux.a(mue1.g, new mtz(((mty) (obj)), mtf, mue1)).run();
            if (!mts.a(c).a())
            {
                obj = mts.a(c).e;
                ((Handler) (obj)).removeMessages(510);
                if (a != mts.b(c))
                {
                    break label0;
                }
                mts.c(c).stopService(mts.d(c));
            }
            return;
        }
        Message message = Message.obtain(((Handler) (obj)), puv.a(mts.e(c)));
        message.what = 510;
        ((Handler) (obj)).sendMessageDelayed(message, 5000L);
    }
}
