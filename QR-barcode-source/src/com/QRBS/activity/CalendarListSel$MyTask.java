// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import com.scannerfire.utils.EncodeUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.QRBS.activity:
//            CalendarListSel

private class <init> extends AsyncTask
{

    List fillMaps;
    String from[] = {
        "text"
    };
    final CalendarListSel this$0;
    int to[] = {
        0x7f0d0075
    };

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient String doInBackground(String as[])
    {
        as = new EncodeUtils(CalendarListSel.this);
        list = as.getCalendarsSel(getApplication());
        if (list == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < list.size()) goto _L3; else goto _L2
_L2:
        CalendarListSel.access$0(CalendarListSel.this).dismiss();
        return "OK";
_L3:
        as = new HashMap();
        as.put("text", ((com.scannerfire.utils.._cls0)list.get(i)).ame());
        fillMaps.add(as);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
        s = new SimpleAdapter(a, fillMaps, 0x7f03001e, from, to);
        lv.setAdapter(s);
    }

    protected void onPreExecute()
    {
    }

    protected volatile transient void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Void[])aobj);
    }

    protected transient void onProgressUpdate(Void avoid[])
    {
    }

    private ()
    {
        this$0 = CalendarListSel.this;
        super();
        fillMaps = new ArrayList();
    }

    fillMaps(fillMaps fillmaps)
    {
        this();
    }
}
