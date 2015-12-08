// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.content.DialogInterface;
import android.content.Intent;
import com.arist.a.a;
import com.arist.a.e;
import com.arist.model.a.b;
import com.arist.service.MusicPlayService;
import java.util.ArrayList;

// Referenced classes of package com.arist.activity:
//            MyApplication, MainActivity

final class r
    implements android.content.DialogInterface.OnClickListener
{

    final MainActivity a;

    r(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        dialoginterface = MyApplication.g();
        MainActivity.n(a).a(a.e);
        com.arist.activity.MainActivity.e(a).a(a.e);
        if (com.arist.activity.MainActivity.e(a).getCount() != 0) goto _L2; else goto _L1
_L1:
        a.b = 0;
        MyApplication.f = 0;
        a.c = 0;
        MyApplication.g = 0;
        MyApplication.h = 0;
        a.sendBroadcast(new Intent(com.arist.c.a.h));
        a.sendBroadcast(new Intent(com.arist.c.a.j));
        MainActivity.d(a);
        com.arist.activity.MainActivity.a(a, false);
_L4:
        MainActivity.h(a).c();
        return;
_L2:
        com.arist.activity.MainActivity.a(a).notifyDataSetChanged();
        if (a.e.equals(dialoginterface))
        {
            MusicPlayService.a.remove(dialoginterface);
            a.sendBroadcast(new Intent(com.arist.c.a.b));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
