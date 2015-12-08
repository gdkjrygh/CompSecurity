// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.content.Intent;
import android.view.View;
import com.arist.a.a;
import com.arist.c.f;

// Referenced classes of package com.arist.activity:
//            MyApplication, MainActivity

final class ag
    implements android.view.View.OnClickListener
{

    final MainActivity a;

    ag(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public final void onClick(View view)
    {
        if (MyApplication.i != 4)
        {
            MyApplication.i = 4;
            MyApplication.e.c(4);
        }
        com.arist.activity.MyApplication.f = MainActivity.e(a).a();
        MyApplication.g = MainActivity.e(a).b();
        a.sendBroadcast(new Intent(com.arist.c.a.g));
    }
}
