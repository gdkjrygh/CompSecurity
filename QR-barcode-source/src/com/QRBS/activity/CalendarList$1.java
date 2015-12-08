// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.scannerfire.utils.EncodeUtils;
import java.util.List;

// Referenced classes of package com.QRBS.activity:
//            CalendarList

class this._cls0
    implements android.widget.temClickListener
{

    final CalendarList this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        EncodeUtils encodeutils = new EncodeUtils(CalendarList.this);
        com.scannerfire.utils.l l1 = (com.scannerfire.utils.l)list.get(i);
        view = "";
        if (!TextUtils.isEmpty(l1.getWhat()))
        {
            view = (new StringBuilder(String.valueOf(""))).append(l1.getWhat()).append("\n").toString();
        }
        adapterview = view;
        if (!TextUtils.isEmpty(l1.getStart()))
        {
            adapterview = (new StringBuilder(String.valueOf(view))).append(l1.getStart()).append("\n").toString();
        }
        view = adapterview;
        if (!TextUtils.isEmpty(l1.getEnd()))
        {
            view = (new StringBuilder(String.valueOf(adapterview))).append(l1.getEnd()).append("\n").toString();
        }
        adapterview = view;
        if (!TextUtils.isEmpty(l1.getWhere()))
        {
            adapterview = (new StringBuilder(String.valueOf(view))).append(l1.getWhere()).append("\n").toString();
        }
        view = adapterview;
        if (!TextUtils.isEmpty(l1.getDes()))
        {
            view = (new StringBuilder(String.valueOf(adapterview))).append(l1.getDes()).append("\n").toString();
        }
        encodeutils.start(EncodeUtils.ICalToString(l1), view);
    }

    .ICal()
    {
        this$0 = CalendarList.this;
        super();
    }
}
