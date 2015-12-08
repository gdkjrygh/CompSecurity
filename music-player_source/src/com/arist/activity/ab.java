// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.content.Intent;
import android.view.View;
import com.arist.a.a;
import com.arist.b.c;
import java.util.ArrayList;

// Referenced classes of package com.arist.activity:
//            AddToListActivity, MyApplication, MainActivity

final class ab
    implements android.view.View.OnClickListener
{

    final MainActivity a;

    ab(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public final void onClick(View view)
    {
        view = new Intent(a, com/arist/activity/AddToListActivity);
        c c1 = (c)MyApplication.l.get(MainActivity.e(a).b());
        view.putExtra("playlist_id", c1.d());
        view.putExtra("playlist_name", c1.b());
        a.startActivityForResult(view, 10);
    }
}
