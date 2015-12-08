// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.scannerfire.model.MyAdapter;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateApp extends SherlockActivity
{
    private class MyTask extends AsyncTask
    {

        final CreateApp this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient String doInBackground(String as[])
        {
            as = activity.getPackageManager();
            Object obj = new Intent("android.intent.action.MAIN", null);
            ((Intent) (obj)).addCategory("android.intent.category.LAUNCHER");
            obj = as.queryIntentActivities(((Intent) (obj)), 0).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    prog.dismiss();
                    return "OK";
                }
                ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
                icons.add(resolveinfo.activityInfo.applicationInfo.loadIcon(as));
                appnames.add(resolveinfo.activityInfo.applicationInfo.loadLabel(as).toString());
                packNames.add(resolveinfo.activityInfo.packageName);
            } while (true);
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            s = new MyAdapter(activity, 0x7f030032, icons, appnames, packNames);
            CreateApp.lv.setAdapter(s);
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
            this$0 = CreateApp.this;
            super();
        }

        MyTask(MyTask mytask)
        {
            this();
        }
    }


    private static ListView lv;
    protected Activity activity;
    private ArrayList appnames;
    private ArrayList icons;
    private ArrayList packNames;
    private ProgressDialog prog;
    private Utils utils;

    public CreateApp()
    {
        utils = new Utils();
        appnames = new ArrayList();
        icons = new ArrayList();
        packNames = new ArrayList();
        activity = this;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030020);
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800ca);
        bundle.setHomeButtonEnabled(true);
        lv = (ListView)findViewById(0x7f0d0076);
        lv.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final CreateApp this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (new StringBuilder("market://details?id=")).append((String)packNames.get(i)).toString();
                (new EncodeUtils(CreateApp.this)).start(adapterview, (String)packNames.get(i));
            }

            
            {
                this$0 = CreateApp.this;
                super();
            }
        });
        prog = utils.showProgress(this, getString(0x7f0800f8), getString(0x7f0800f9));
        (new MyTask(null)).execute(new String[0]);
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        finish();
        return true;
    }





}
