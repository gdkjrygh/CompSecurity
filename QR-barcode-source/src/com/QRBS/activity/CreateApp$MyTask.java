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
import android.widget.ListView;
import com.scannerfire.model.MyAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.QRBS.activity:
//            CreateApp

private class <init> extends AsyncTask
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
                CreateApp.access$3(CreateApp.this).dismiss();
                return "OK";
            }
            ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
            CreateApp.access$0(CreateApp.this).add(resolveinfo.activityInfo.applicationInfo.loadIcon(as));
            CreateApp.access$1(CreateApp.this).add(resolveinfo.activityInfo.applicationInfo.loadLabel(as).toString());
            CreateApp.access$2(CreateApp.this).add(resolveinfo.activityInfo.packageName);
        } while (true);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
        s = new MyAdapter(activity, 0x7f030032, CreateApp.access$0(CreateApp.this), CreateApp.access$1(CreateApp.this), CreateApp.access$2(CreateApp.this));
        CreateApp.access$4().setAdapter(s);
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
        this$0 = CreateApp.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
