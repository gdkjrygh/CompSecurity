// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.ListActivity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

// Referenced classes of package net.hockeyapp.android:
//            UpdateActivityInterface, UpdateInfoListener, DownloadFileTask, UpdateInfoAdapter, 
//            DownloadFileListener

public class UpdateActivity extends ListActivity
    implements UpdateActivityInterface, UpdateInfoListener
{

    private UpdateInfoAdapter adapter;
    private DownloadFileTask downloadTask;

    public UpdateActivity()
    {
    }

    private void startDownloadTask()
    {
        downloadTask = new DownloadFileTask(this, getIntent().getStringExtra("url"), new DownloadFileListener() {

            final UpdateActivity this$0;

            public final void downloadFailed(DownloadFileTask downloadfiletask, Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    startDownloadTask();
                    return;
                } else
                {
                    enableUpdateButton();
                    return;
                }
            }

            public final void downloadSuccessful(DownloadFileTask downloadfiletask)
            {
                enableUpdateButton();
            }

            
            {
                this$0 = UpdateActivity.this;
                super();
            }
        });
        downloadTask.execute(new String[0]);
    }

    protected void configureView()
    {
        ((TextView)findViewById(R.id.version_label)).setText((new StringBuilder("Version ")).append(adapter.getVersionString()).append("\n").append(adapter.getFileInfoString()).toString());
    }

    public void enableUpdateButton()
    {
        findViewById(R.id.update_button).setEnabled(true);
    }

    public int getCurrentVersionCode()
    {
        int i;
        try
        {
            i = getPackageManager().getPackageInfo(getPackageName(), 128).versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return -1;
        }
        return i;
    }

    public int getLayout()
    {
        return R.layout.update_view;
    }

    public void onClickUpdate(View view)
    {
        startDownloadTask();
        view.setEnabled(false);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle("App Update");
        setContentView(getLayout());
        adapter = new UpdateInfoAdapter(this, getIntent().getStringExtra("json"), this);
        getListView().setDivider(null);
        setListAdapter(adapter);
        configureView();
        downloadTask = (DownloadFileTask)getLastNonConfigurationInstance();
        if (downloadTask != null)
        {
            downloadTask.attach(this);
        }
    }

    public Object onRetainNonConfigurationInstance()
    {
        if (downloadTask != null)
        {
            downloadTask.detach();
        }
        return downloadTask;
    }

}
