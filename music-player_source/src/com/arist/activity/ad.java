// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import com.arist.a.e;
import com.arist.b.c;
import com.arist.c.a;
import com.arist.model.skin.ColorProgressBar;
import java.util.ArrayList;

// Referenced classes of package com.arist.activity:
//            MyApplication, MainActivity

final class ad extends BroadcastReceiver
{

    final MainActivity a;
    private int b;

    private ad(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
        b = ((c)MyApplication.p.get(1)).f().size();
    }

    ad(MainActivity mainactivity, byte byte0)
    {
        this(mainactivity);
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (!a.r.equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        int i = intent.getIntExtra("musicProgress", 0);
        if (!MainActivity.f(a))
        {
            com.arist.activity.MainActivity.c(a).a(((float)i * 1.0F) / (float)MyApplication.b());
        }
_L4:
        return;
_L2:
        if (!a.j.equals(intent.getAction()))
        {
            break; /* Loop/switch isn't completed */
        }
        MainActivity.g(a);
        a.e();
        int j = ((c)MyApplication.p.get(1)).f().size();
        if (b != j)
        {
            MainActivity.h(a).a();
            if (com.arist.activity.MainActivity.a(a).a() == 0)
            {
                com.arist.activity.MainActivity.a(a).notifyDataSetChanged();
            }
        }
        if (com.arist.activity.MainActivity.e(a).a() == 0 && com.arist.activity.MainActivity.e(a).b() == 1)
        {
            com.arist.activity.MainActivity.e(a).notifyDataSetChanged();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (a.l.equals(intent.getAction()))
        {
            MainActivity.i(a).setSelected(MyApplication.d());
            return;
        }
        if (!a.z.equals(intent.getAction()))
        {
            continue; /* Loop/switch isn't completed */
        }
        MainActivity.h(a).c();
        if (com.arist.activity.MainActivity.e(a) != null)
        {
            com.arist.activity.MainActivity.e(a).notifyDataSetChanged();
        }
        if (com.arist.activity.MainActivity.a(a) != null)
        {
            com.arist.activity.MainActivity.a(a).notifyDataSetChanged();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!a.c.equals(intent.getAction())) goto _L4; else goto _L5
_L5:
        MainActivity.h(a).b();
        if (com.arist.activity.MainActivity.a(a).a() == 3)
        {
            com.arist.activity.MainActivity.a(a).notifyDataSetChanged();
        }
        if (com.arist.activity.MainActivity.e(a).a() == 3 && com.arist.activity.MainActivity.e(a).b() == 0)
        {
            com.arist.activity.MainActivity.e(a).notifyDataSetChanged();
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }
}
