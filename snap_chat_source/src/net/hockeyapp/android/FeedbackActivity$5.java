// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import agl;
import android.content.SharedPreferences;

// Referenced classes of package net.hockeyapp.android:
//            FeedbackActivity

final class a
    implements Runnable
{

    private FeedbackActivity a;

    public final void run()
    {
        or.a(a, null);
        agl.a(a.getSharedPreferences("net.hockeyapp.android.feedback", 0).edit().remove("idLastMessageSend").remove("idLastMessageProcessed"));
        a.b(false);
    }

    (FeedbackActivity feedbackactivity)
    {
        a = feedbackactivity;
        super();
    }
}
