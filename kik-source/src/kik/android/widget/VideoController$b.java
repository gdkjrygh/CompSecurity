// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package kik.android.widget:
//            VideoController

private static final class a extends Handler
{

    private final WeakReference a;

    public final void handleMessage(Message message)
    {
        VideoController videocontroller = (VideoController)a.get();
        if (videocontroller != null && VideoController.c(videocontroller) != null)
        {
            int i;
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                videocontroller.c();
                return;

            case 2: // '\002'
                i = videocontroller.d();
                break;
            }
            if (!VideoController.e(videocontroller) && VideoController.f(videocontroller) && VideoController.c(videocontroller).e())
            {
                sendMessageDelayed(obtainMessage(2), 1000 - i % 1000);
                return;
            }
        }
    }

    (VideoController videocontroller)
    {
        a = new WeakReference(videocontroller);
    }
}
