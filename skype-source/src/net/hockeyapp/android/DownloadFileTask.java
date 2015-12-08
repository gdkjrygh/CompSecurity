// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;

// Referenced classes of package net.hockeyapp.android:
//            DownloadFileListener

public class DownloadFileTask extends AsyncTask
{

    private Context context;
    private String filePath;
    private String filename;
    private DownloadFileListener notifier;
    private ProgressDialog progressDialog;
    private String urlString;

    public DownloadFileTask(Context context1, String s, DownloadFileListener downloadfilelistener)
    {
        context = context1;
        urlString = s;
        filename = (new StringBuilder()).append(UUID.randomUUID()).append(".apk").toString();
        filePath = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/Download").toString();
        notifier = downloadfilelistener;
    }

    private String getURLString()
    {
        return (new StringBuilder()).append(urlString).append("&type=apk").toString();
    }

    public void attach(Context context1)
    {
        context = context1;
    }

    public void detach()
    {
        context = null;
        progressDialog = null;
    }

    protected transient Boolean doInBackground(String as[])
    {
        Object obj;
        long l;
        byte abyte0[];
        int i;
        int j;
        try
        {
            as = (new URL(getURLString())).openConnection();
            as.setRequestProperty("connection", "close");
            as.connect();
            i = as.getContentLength();
            obj = new File(filePath);
            ((File) (obj)).mkdirs();
            obj = new File(((File) (obj)), filename);
            as = new BufferedInputStream(as.getInputStream());
            obj = new FileOutputStream(((File) (obj)));
            abyte0 = new byte[1024];
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            as.printStackTrace();
            return Boolean.valueOf(false);
        }
        l = 0L;
        j = as.read(abyte0);
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        l += j;
        publishProgress(new Integer[] {
            Integer.valueOf((int)((100L * l) / (long)i))
        });
        ((OutputStream) (obj)).write(abyte0, 0, j);
        break MISSING_BLOCK_LABEL_93;
        ((OutputStream) (obj)).flush();
        ((OutputStream) (obj)).close();
        as.close();
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(Boolean boolean1)
    {
        if (progressDialog != null)
        {
            progressDialog.dismiss();
        }
        if (boolean1.booleanValue())
        {
            notifier.downloadSuccessful(this);
            boolean1 = new Intent("android.intent.action.VIEW");
            boolean1.setDataAndType(Uri.fromFile(new File(filePath, filename)), "application/vnd.android.package-archive");
            boolean1.setFlags(0x10000000);
            context.startActivity(boolean1);
            return;
        }
        try
        {
            boolean1 = new android.app.AlertDialog.Builder(context);
            boolean1.setTitle(R.string.download_failed_dialog_title);
            boolean1.setMessage(R.string.download_failed_dialog_message);
            boolean1.setNegativeButton(R.string.download_failed_dialog_negative_button, new android.content.DialogInterface.OnClickListener() {

                final DownloadFileTask this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    notifier.downloadFailed(DownloadFileTask.this, Boolean.valueOf(false));
                }

            
            {
                this$0 = DownloadFileTask.this;
                super();
            }
            });
            boolean1.setPositiveButton(R.string.download_failed_dialog_positive_button, new android.content.DialogInterface.OnClickListener() {

                final DownloadFileTask this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    notifier.downloadFailed(DownloadFileTask.this, Boolean.valueOf(true));
                }

            
            {
                this$0 = DownloadFileTask.this;
                super();
            }
            });
            boolean1.create().show();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Boolean boolean1)
        {
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Boolean)obj);
    }

    protected transient void onProgressUpdate(Integer ainteger[])
    {
        if (progressDialog == null)
        {
            progressDialog = new ProgressDialog(context);
            progressDialog.setProgressStyle(1);
            progressDialog.setMessage("Loading...");
            progressDialog.setCancelable(false);
            progressDialog.show();
        }
        progressDialog.setProgress(ainteger[0].intValue());
    }

    protected volatile void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Integer[])aobj);
    }

}
