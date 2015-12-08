// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import com.arist.a.e;
import com.arist.b.b;
import com.arist.b.c;
import com.arist.model.b.d;
import com.arist.view.a;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.arist.activity:
//            MyApplication, MainActivity

final class y
    implements android.widget.AdapterView.OnItemClickListener
{

    final MainActivity a;
    private final AlertDialog b;
    private final int c;
    private final int d;

    y(MainActivity mainactivity, AlertDialog alertdialog, int i, int j)
    {
        a = mainactivity;
        b = alertdialog;
        c = i;
        d = j;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        b.dismiss();
        if (c != 0)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        view = ((c)MyApplication.l.get(i)).f();
        adapterview = a.e.e();
        view = view.iterator();
_L2:
        boolean flag;
        if (view.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = false;
_L3:
        if (flag)
        {
            a.a(0x7f0900c5);
            return;
        } else
        {
            ((c)MyApplication.l.get(i)).a(a.e);
            (new d()).a(a.e, (c)MyApplication.l.get(i));
            com.arist.activity.MainActivity.a(a).notifyDataSetChanged();
            MainActivity.h(a).b();
            a.a(0x7f09005d);
            return;
        }
        if (!adapterview.equals(((b)view.next()).e())) goto _L2; else goto _L1
_L1:
        flag = true;
          goto _L3
        com.arist.activity.MainActivity.a(a, d, i);
        return;
    }
}
