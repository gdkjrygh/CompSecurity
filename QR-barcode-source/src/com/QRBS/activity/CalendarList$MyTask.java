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
//            CalendarList

private class <init> extends AsyncTask
{

    List fillMaps;
    String from[] = {
        "text"
    };
    int initPos;
    final CalendarList this$0;
    int to[] = {
        0x7f0d0075
    };

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient String doInBackground(String as[])
    {
        as = new EncodeUtils(CalendarList.this);
        list = as.getCalendars(getApplication(), CalID);
        if (list == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        if (i < list.size()) goto _L3; else goto _L2
_L2:
        long l = System.currentTimeMillis();
        if (list == null) goto _L5; else goto _L4
_L4:
        initPos = list.size() - 1;
        i = 0;
_L7:
        if (i < list.size())
        {
label0:
            {
                if (l >= ((com.scannerfire.utils.Pos)list.get(i)).StartMill())
                {
                    break label0;
                }
                initPos = i;
            }
        }
_L5:
        CalendarList.access$0(CalendarList.this).dismiss();
        return "OK";
_L3:
        as = new HashMap();
        com.scannerfire.utils.Background background = (com.scannerfire.utils.._cls0)list.get(i);
        as.put("text", (new StringBuilder("WHAT: \n")).append(background.What()).append("\nWHERE: \n").append(background.Where()).append("\nSTART: \n").append(background.Start()).append("\nEND: \n").append(background.End()).append("\nDESCRIPTION: \n").append(background.Des()).toString());
        fillMaps.add(as);
        i++;
          goto _L6
        i++;
          goto _L7
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
        s = new SimpleAdapter(a, fillMaps, 0x7f03001e, from, to);
        lv.setAdapter(s);
        lv.setSelection(initPos);
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
        this$0 = CalendarList.this;
        super();
        fillMaps = new ArrayList();
        initPos = 0;
    }

    initPos(initPos initpos)
    {
        this();
    }
}
