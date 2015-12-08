// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
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

// Referenced classes of package com.QRBS.activity:
//            CalendarList

public class CalendarListSel extends SherlockActivity
{
    public class DummyAsyncTask extends AsyncTask
    {

        final CalendarListSel this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            return null;
        }

        public DummyAsyncTask()
        {
            this$0 = CalendarListSel.this;
            super();
        }
    }

    private class MyTask extends AsyncTask
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
            prog.dismiss();
            return "OK";
_L3:
            as = new HashMap();
            as.put("text", ((com.scannerfire.utils.EncodeUtils.CalSel)list.get(i)).getName());
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

        private MyTask()
        {
            this$0 = CalendarListSel.this;
            super();
            fillMaps = new ArrayList();
        }

        MyTask(MyTask mytask)
        {
            this();
        }
    }


    Activity a;
    List list;
    ListView lv;
    private ProgressDialog prog;
    Utils utils;

    public CalendarListSel()
    {
        utils = new Utils();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030020);
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800c9);
        bundle.setHomeButtonEnabled(true);
        a = this;
        lv = (ListView)findViewById(0x7f0d0076);
        lv.setSelector(0x7f0200e7);
        lv.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final CalendarListSel this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = new Intent(CalendarListSel.this, com/QRBS/activity/CalendarList);
                adapterview.putExtra("CalendarID", ((com.scannerfire.utils.EncodeUtils.CalSel)list.get(i)).getId());
                startActivity(adapterview);
            }

            
            {
                this$0 = CalendarListSel.this;
                super();
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        finish();
        return true;
    }

    protected void onStart()
    {
        super.onStart();
        prog = utils.showProgress(this, getString(0x7f0800f8), getString(0x7f0800f9));
        (new MyTask(null)).execute(new String[0]);
    }

}
