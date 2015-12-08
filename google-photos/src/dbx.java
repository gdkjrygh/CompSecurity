// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.moviemaker.ui.VideoTrimView;

public final class dbx extends Handler
{

    private float a;
    private VideoTrimView b;

    public dbx(VideoTrimView videotrimview)
    {
        b = videotrimview;
        super();
        a = (0.0F / 0.0F);
    }

    public final void a()
    {
        removeMessages(0);
        a = (0.0F / 0.0F);
    }

    public final void a(long l, float f)
    {
        boolean flag1 = Float.isNaN(a);
        boolean flag;
        if (Math.abs(f - a) > (float)(VideoTrimView.g(b) / 2))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1 || flag)
        {
            removeMessages(0);
            sendEmptyMessageDelayed(0, l);
            a = f;
        }
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (VideoTrimView.b(b) && !VideoTrimView.c(b))
        {
            if (!VideoTrimView.d(b))
            {
                VideoTrimView.e(b);
            }
            VideoTrimView.f(b);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
