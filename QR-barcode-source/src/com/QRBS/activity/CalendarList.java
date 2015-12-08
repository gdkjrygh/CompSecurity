// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CalendarList extends SherlockActivity
{
    private class MyTask extends AsyncTask
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
                    if (l >= ((com.scannerfire.utils.EncodeUtils.ICal)list.get(i)).getStartMill())
                    {
                        break label0;
                    }
                    initPos = i;
                }
            }
_L5:
            prog.dismiss();
            return "OK";
_L3:
            as = new HashMap();
            com.scannerfire.utils.EncodeUtils.ICal ical = (com.scannerfire.utils.EncodeUtils.ICal)list.get(i);
            as.put("text", (new StringBuilder("WHAT: \n")).append(ical.getWhat()).append("\nWHERE: \n").append(ical.getWhere()).append("\nSTART: \n").append(ical.getStart()).append("\nEND: \n").append(ical.getEnd()).append("\nDESCRIPTION: \n").append(ical.getDes()).toString());
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

        private MyTask()
        {
            this$0 = CalendarList.this;
            super();
            fillMaps = new ArrayList();
            initPos = 0;
        }

        MyTask(MyTask mytask)
        {
            this();
        }
    }


    long CalID;
    Activity a;
    List list;
    ListView lv;
    private ProgressDialog prog;
    Utils utils;

    public CalendarList()
    {
        utils = new Utils();
        CalID = 0L;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030020);
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800c8);
        bundle.setHomeButtonEnabled(true);
        a = this;
        CalID = getIntent().getLongExtra("CalendarID", 0L);
        lv = (ListView)findViewById(0x7f0d0076);
        lv.setSelector(0x7f0200e7);
        lv.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final CalendarList this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                EncodeUtils encodeutils = new EncodeUtils(CalendarList.this);
                com.scannerfire.utils.EncodeUtils.ICal ical = (com.scannerfire.utils.EncodeUtils.ICal)list.get(i);
                view = "";
                if (!TextUtils.isEmpty(ical.getWhat()))
                {
                    view = (new StringBuilder(String.valueOf(""))).append(ical.getWhat()).append("\n").toString();
                }
                adapterview = view;
                if (!TextUtils.isEmpty(ical.getStart()))
                {
                    adapterview = (new StringBuilder(String.valueOf(view))).append(ical.getStart()).append("\n").toString();
                }
                view = adapterview;
                if (!TextUtils.isEmpty(ical.getEnd()))
                {
                    view = (new StringBuilder(String.valueOf(adapterview))).append(ical.getEnd()).append("\n").toString();
                }
                adapterview = view;
                if (!TextUtils.isEmpty(ical.getWhere()))
                {
                    adapterview = (new StringBuilder(String.valueOf(view))).append(ical.getWhere()).append("\n").toString();
                }
                view = adapterview;
                if (!TextUtils.isEmpty(ical.getDes()))
                {
                    view = (new StringBuilder(String.valueOf(adapterview))).append(ical.getDes()).append("\n").toString();
                }
                encodeutils.start(EncodeUtils.ICalToString(ical), view);
            }

            
            {
                this$0 = CalendarList.this;
                super();
            }
        });
        prog = utils.showProgress(this, getString(0x7f0800f8), getString(0x7f0800f9));
        (new MyTask(null)).execute(new String[0]);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        finish();
        return true;
    }

}
