// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import afT;
import afX;
import agl;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package net.hockeyapp.android:
//            FeedbackActivity

final class a
    implements Runnable
{

    private Dialog a;

    public final void run()
    {
        a.a.showDialog(0);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class net/hockeyapp/android/FeedbackActivity$3

/* anonymous class */
    final class FeedbackActivity._cls3 extends Handler
    {

        final FeedbackActivity a;

        public final void handleMessage(Message message)
        {
            FeedbackActivity.a(a, new afT());
            if (message == null || message.getData() == null) goto _L2; else goto _L1
_L1:
            message = (afX)message.getData().getSerializable("parse_feedback_response");
            if (message == null) goto _L2; else goto _L3
_L3:
            boolean flag;
            if (((afX) (message)).a.equalsIgnoreCase("success"))
            {
                if (((afX) (message)).c != null)
                {
                    agl.a.a.a(FeedbackActivity.c(a), ((afX) (message)).c);
                    FeedbackActivity.a(a, message);
                    FeedbackActivity.d(a);
                    flag = true;
                } else
                {
                    flag = true;
                }
            } else
            {
                flag = false;
            }
_L5:
            if (!flag)
            {
                a.runOnUiThread(new FeedbackActivity._cls3._cls1(this));
            }
            a.a(true);
            return;
_L2:
            flag = false;
            if (true) goto _L5; else goto _L4
_L4:
        }

            
            {
                a = feedbackactivity;
                super();
            }
    }

}
