// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import afM;
import afT;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package net.hockeyapp.android:
//            FeedbackActivity

final class a extends Handler
{

    final FeedbackActivity a;

    public final void handleMessage(Message message)
    {
        boolean flag = false;
        FeedbackActivity.a(a, new afT());
        if (message != null && message.getData() != null)
        {
            Object obj = message.getData();
            message = ((Bundle) (obj)).getString("feedback_response");
            String s = ((Bundle) (obj)).getString("feedback_status");
            obj = ((Bundle) (obj)).getString("request_type");
            if (((String) (obj)).equals("send") && (message == null || Integer.parseInt(s) != 201))
            {
                FeedbackActivity.a(a).a = afM.a(1036);
            } else
            if (((String) (obj)).equals("fetch") && s != null && (Integer.parseInt(s) == 404 || Integer.parseInt(s) == 422))
            {
                FeedbackActivity.b(a);
                flag = true;
            } else
            if (message != null)
            {
                FeedbackActivity.a(a, message, ((String) (obj)));
                flag = true;
            } else
            {
                FeedbackActivity.a(a).a = afM.a(1037);
            }
        } else
        {
            FeedbackActivity.a(a).a = afM.a(1036);
        }
        if (!flag)
        {
            a.runOnUiThread(new Runnable() {

                private FeedbackActivity._cls2 a;

                public final void run()
                {
                    a.a.a(true);
                    a.a.showDialog(0);
                }

            
            {
                a = FeedbackActivity._cls2.this;
                super();
            }
            });
        }
    }

    _cls1.a(FeedbackActivity feedbackactivity)
    {
        a = feedbackactivity;
        super();
    }
}
