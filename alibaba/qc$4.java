// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import java.util.ArrayList;
import java.util.List;

class lang.Object
    implements android.widget.erView.OnItemClickListener
{

    final qc a;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (Cursor)qc.c(a).getItem(i);
        if (view == null || !qc.b(a).booleanValue())
        {
            break MISSING_BLOCK_LABEL_173;
        }
        view = (CheckBox)view.findViewById(0x7f0d04bb);
        boolean flag;
        if (!view.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setChecked(flag);
        adapterview = adapterview.getString(adapterview.getColumnIndex("_id"));
        if (qc.d(a) == null)
        {
            qc.a(a, new ArrayList());
        }
        if (!view.isChecked()) goto _L2; else goto _L1
_L1:
        if (!qc.d(a).contains(adapterview))
        {
            qc.d(a).add(adapterview);
        }
_L4:
        return;
_L2:
        if (!qc.d(a).contains(adapterview)) goto _L4; else goto _L3
_L3:
        qc.d(a).remove(adapterview);
        return;
        if (qc.f(a) == null)
        {
            qc.a(a, new com.alibaba.aliexpresshd.module.notification.icationListActivity.a());
        }
        view = adapterview.getString(adapterview.getColumnIndex("_id"));
        String s = adapterview.getString(adapterview.getColumnIndex("args"));
        String s1 = adapterview.getString(adapterview.getColumnIndex("detail"));
        String s2 = adapterview.getString(adapterview.getColumnIndex("format_date"));
        String s3 = adapterview.getString(adapterview.getColumnIndex("promotion_id"));
        String s4 = adapterview.getString(adapterview.getColumnIndex("status"));
        String s5 = adapterview.getString(adapterview.getColumnIndex("subject"));
        String s6 = adapterview.getString(adapterview.getColumnIndex("type"));
        adapterview = adapterview.getString(adapterview.getColumnIndex("url"));
        qc.f(a).a = view;
        qc.f(a).i = s;
        qc.f(a).f = s1;
        qc.f(a).b = s2;
        qc.f(a).g = s3;
        qc.f(a).d = s4;
        qc.f(a).e = s5;
        qc.f(a).c = s6;
        qc.f(a).h = adapterview;
        qc.g(a).b(qc.f(a));
        return;
    }

    >(qc qc1)
    {
        a = qc1;
        super();
    }
}
