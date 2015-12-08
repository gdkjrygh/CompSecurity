// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.app.ProgressDialog;
import com.kik.g.f;
import com.kik.g.i;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package kik.android.chat.activity:
//            IntroActivity, i

final class h extends i
{

    final IntroActivity a;

    h(IntroActivity introactivity)
    {
        a = introactivity;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        IntroActivity.a(a).a();
        IntroActivity.b(a).cancel();
        IntroActivity.c(a).purge();
        if (IntroActivity.d(a).isShowing())
        {
            IntroActivity.d(a).dismiss();
        }
        a.runOnUiThread(new kik.android.chat.activity.i(this));
    }
}
