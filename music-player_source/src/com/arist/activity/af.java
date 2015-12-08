// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import com.arist.a.a;
import com.arist.b.c;
import java.util.ArrayList;

// Referenced classes of package com.arist.activity:
//            MainActivity, MyApplication

final class af
    implements android.widget.AdapterView.OnItemClickListener
{

    final MainActivity a;

    af(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = MainActivity.e(a).c(i);
        MyApplication.f = MainActivity.e(a).a();
        MyApplication.g = MainActivity.e(a).b();
        MyApplication.h = MyApplication.f().f().indexOf(adapterview);
        com.arist.activity.MainActivity.a(a, false);
        Log.i("MainActivity", (new StringBuilder(String.valueOf(MyApplication.f))).append("-----").append(MyApplication.g).append("---").append(MyApplication.h).toString());
        a.sendBroadcast(new Intent(com.arist.c.a.b));
    }
}
