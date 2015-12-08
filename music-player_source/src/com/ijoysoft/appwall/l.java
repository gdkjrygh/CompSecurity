// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import com.b.a.b;
import java.util.HashMap;

// Referenced classes of package com.ijoysoft.appwall:
//            GiftActivity, p, o

final class l
    implements android.widget.AdapterView.OnItemClickListener
{

    final GiftActivity a;

    l(GiftActivity giftactivity)
    {
        a = giftactivity;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l1)
    {
        GiftActivity.a(a.getSharedPreferences("settings", 0));
        adapterview = GiftActivity.a().edit();
        adapterview.putBoolean(((o)com.ijoysoft.appwall.GiftActivity.b(a).getItem(i)).b(), true);
        Log.i("changle-list", ((o)com.ijoysoft.appwall.GiftActivity.b(a).getItem(i)).b());
        adapterview.commit();
        if (a.a(((o)com.ijoysoft.appwall.GiftActivity.b(a).getItem(i)).b()))
        {
            Toast.makeText(a, "APP already installed", 0).show();
            return;
        } else
        {
            adapterview = ((o)com.ijoysoft.appwall.GiftActivity.b(a).getItem(i)).b();
            view = ((o)com.ijoysoft.appwall.GiftActivity.b(a).getItem(i)).f();
            a.a(adapterview, view);
            com.ijoysoft.appwall.GiftActivity.b(a).notifyDataSetChanged();
            adapterview = new HashMap();
            adapterview.put("AppName", ((o)com.ijoysoft.appwall.GiftActivity.b(a).getItem(i)).c());
            adapterview.put("ListArray", String.valueOf(i));
            b.a(a, "which_app_clicked", adapterview);
            return;
        }
    }
}
