// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.share;

import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.zxing.client.android.common.executor.AsyncTaskExecInterface;
import com.google.zxing.client.android.common.executor.AsyncTaskExecManager;

// Referenced classes of package com.google.zxing.client.android.share:
//            AppInfo, LoadPackagesAsyncTask

public final class AppPickerActivity extends ListActivity
{

    private LoadPackagesAsyncTask backgroundTask;
    private final AsyncTaskExecInterface taskExec = (AsyncTaskExecInterface)(new AsyncTaskExecManager()).build();

    public AppPickerActivity()
    {
    }

    protected void onListItemClick(ListView listview, View view, int i, long l)
    {
        listview = getListAdapter();
        if (i >= 0 && i < listview.getCount())
        {
            listview = ((AppInfo)listview.getItem(i)).getPackageName();
            view = new Intent();
            view.addFlags(0x80000);
            view.putExtra("url", (new StringBuilder("market://details?id=")).append(listview).toString());
            setResult(-1, view);
        } else
        {
            setResult(0);
        }
        finish();
    }

    protected void onPause()
    {
        LoadPackagesAsyncTask loadpackagesasynctask = backgroundTask;
        if (loadpackagesasynctask != null)
        {
            loadpackagesasynctask.cancel(true);
            backgroundTask = null;
        }
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        backgroundTask = new LoadPackagesAsyncTask(this);
        taskExec.execute(backgroundTask, new Void[0]);
    }
}
