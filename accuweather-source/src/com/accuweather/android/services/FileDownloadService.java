// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.IBinder;
import android.widget.RemoteViews;
import com.accuweather.android.utilities.Logger;
import com.squareup.okhttp.OkHttpClient;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public abstract class FileDownloadService extends Service
{
    private class AsyncDownloadTask extends AsyncTask
    {

        private HashMap failedFiles;
        private int numTotalFiles;
        private int successCount;
        private HashMap successfulFiles;
        private HashMap targetFiles;
        final FileDownloadService this$0;

        private int calculateProgress(double d, long l)
        {
            long l1 = 0L;
            if (l > 0L)
            {
                l1 = (long)((d / (double)l) * 100D);
            }
            return (int)l1;
        }

        private File createFullPath(String s)
        {
            s = new File(s);
            File file = s.getParentFile();
            if (file != null)
            {
                file.mkdirs();
            }
            return s;
        }

        private HttpURLConnection getConnection(String s)
            throws MalformedURLException
        {
            return (new OkHttpClient()).open(new URL(s));
        }

        private int getNumberOfLoopCountsBeforeBroadcast()
        {
            return 30;
        }

        private int getNumberOfLoopCountsBeforeNotificationRefresh()
        {
            return 100;
        }

        private void updateNotification(int i, int j)
        {
            RemoteViews remoteviews = getProgressView(successCount + 1, numTotalFiles, j, i);
            if (remoteviews == null)
            {
                if (!isCancelled())
                {
                    showNotification(buildDownloadingFilesMessage(), buildDownloadProgressMessage(successCount + 1, numTotalFiles), buildKbytesDownloadedMessage(i, j));
                }
            } else
            if (!isCancelled())
            {
                showNotification(remoteviews, buildDownloadingFilesMessage());
                return;
            }
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            Iterator iterator = targetFiles.entrySet().iterator();
_L16:
            if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
            Object obj;
            Object obj1;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            Object obj7;
            String s;
            String s1;
            avoid = (java.util.Map.Entry)iterator.next();
            s = (String)avoid.getKey();
            s1 = (String)avoid.getValue();
            obj4 = null;
            obj7 = null;
            obj6 = null;
            obj3 = null;
            avoid = null;
            obj2 = null;
            obj5 = null;
            obj = obj7;
            obj1 = avoid;
            boolean flag = isCancelled();
            int i;
            int j;
            int k;
            int i1;
label0:
            {
                {
                    if (!flag)
                    {
                        break label0;
                    }
                    HttpURLConnection httpurlconnection;
                    int l;
                    int j1;
                    int k1;
                    if (false)
                    {
                        try
                        {
                            throw new NullPointerException();
                        }
                        // Misplaced declaration of an exception variable
                        catch (Void avoid[]) { }
                    }
                    if (false)
                    {
                        try
                        {
                            throw new NullPointerException();
                        }
                        // Misplaced declaration of an exception variable
                        catch (Void avoid[])
                        {
                            return null;
                        }
                    }
                }
                return null;
            }
            obj = obj7;
            obj1 = avoid;
            httpurlconnection = getConnection(s);
            obj = obj7;
            obj1 = avoid;
            j1 = httpurlconnection.getContentLength();
            if ((long)j1 < 0x7a120L) goto _L4; else goto _L3
_L3:
            obj = obj7;
            obj1 = avoid;
            httpurlconnection.setConnectTimeout(getConnectTimeout());
            obj = obj7;
            obj1 = avoid;
            httpurlconnection.setReadTimeout(getReadTimeout());
            obj = obj7;
            obj1 = avoid;
            avoid = new BufferedInputStream(httpurlconnection.getInputStream(), 32768);
            obj = new BufferedOutputStream(new FileOutputStream(createFullPath(s1), false), 32768);
            j = 0;
            obj1 = new byte[32768];
            i = 0;
            k = 0;
_L22:
            if (isCancelled()) goto _L6; else goto _L5
_L5:
            l = avoid.read(((byte []) (obj1)));
            if (l == -1) goto _L6; else goto _L7
_L7:
            i1 = j + l;
            ((OutputStream) (obj)).write(((byte []) (obj1)), 0, l);
            k1 = calculateProgress(i1, j1);
            if (isCancelled()) goto _L9; else goto _L8
_L8:
            if (k1 == 100) goto _L11; else goto _L10
_L10:
            l = i + 1;
            j = l;
            if (i % getNumberOfLoopCountsBeforeBroadcast() != 0) goto _L13; else goto _L12
_L12:
            j = l;
_L21:
            sendBroadcast((new Intent(getDownloadUpdateIntentAction())).putExtra("progress", k1));
_L13:
            if (isCancelled()) goto _L15; else goto _L14
_L14:
            l = k + 1;
            i = l;
            if (k % getNumberOfLoopCountsBeforeNotificationRefresh() != 0)
            {
                break MISSING_BLOCK_LABEL_692;
            }
            updateNotification(j1, i1);
            i = l;
            break MISSING_BLOCK_LABEL_692;
_L6:
            flag = isCancelled();
label1:
            {
                if (!flag)
                {
                    break label1;
                }
                if (obj != null)
                {
                    try
                    {
                        ((OutputStream) (obj)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj) { }
                }
                if (avoid != null)
                {
                    try
                    {
                        avoid.close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Void avoid[])
                    {
                        return null;
                    }
                    return null;
                } else
                {
                    break MISSING_BLOCK_LABEL_117;
                }
            }
            successCount = successCount + 1;
            successfulFiles.put(s, s1);
_L17:
            if (obj != null)
            {
                try
                {
                    ((OutputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            if (avoid != null)
            {
                try
                {
                    avoid.close();
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[]) { }
            }
              goto _L16
_L4:
            obj = obj7;
            obj1 = avoid;
            failedFiles.put(s, s1);
            avoid = obj6;
            obj = obj5;
              goto _L17
            obj2;
            avoid = obj4;
_L20:
            obj = avoid;
            obj1 = obj3;
            Logger.e(getClass().getName(), "Error in doInBackground(): ", ((Throwable) (obj2)));
            obj = avoid;
            obj1 = obj3;
            failedFiles.put(s, s1);
            if (obj3 != null)
            {
                try
                {
                    ((OutputStream) (obj3)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            if (avoid != null)
            {
                try
                {
                    avoid.close();
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[]) { }
            }
              goto _L16
            avoid;
_L19:
            if (obj1 != null)
            {
                try
                {
                    ((OutputStream) (obj1)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1) { }
            }
            if (obj != null)
            {
                try
                {
                    ((InputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            throw avoid;
_L2:
            onFinishDownload_Background(successfulFiles, failedFiles);
            return null;
            Exception exception;
            exception;
            obj = avoid;
            obj1 = obj2;
            avoid = exception;
            continue; /* Loop/switch isn't completed */
            obj2;
            obj1 = obj;
            obj = avoid;
            avoid = ((Void []) (obj2));
            if (true) goto _L19; else goto _L18
_L18:
            obj2;
              goto _L20
            obj2;
            exception = ((Exception) (obj));
              goto _L20
_L15:
            i = k;
            break MISSING_BLOCK_LABEL_692;
_L11:
            j = i;
              goto _L21
_L9:
            j = i;
              goto _L13
            k = i;
            i = j;
            j = i1;
              goto _L22
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            super.onPostExecute(void1);
            onFinishDownload_UI(successfulFiles, failedFiles);
            if (successCount != numTotalFiles)
            {
                showDownloadFailedNotification();
                sendBroadcast((new Intent(getDownloadUpdateIntentAction())).putExtra("download_failed", true));
                task = null;
                return;
            } else
            {
                showDownloadSucceededNotification();
                return;
            }
        }

        protected void onPreExecute()
        {
            super.onPreExecute();
            successCount = 0;
            targetFiles = getTargetFiles();
            numTotalFiles = targetFiles.size();
            successfulFiles = new HashMap();
            failedFiles = new HashMap();
        }

        private AsyncDownloadTask()
        {
            this$0 = FileDownloadService.this;
            super();
            targetFiles = null;
            successfulFiles = null;
            failedFiles = null;
        }

    }

    public class FileDownloadBinder extends Binder
    {

        final FileDownloadService this$0;

        FileDownloadService getService()
        {
            return FileDownloadService.this;
        }

        public FileDownloadBinder()
        {
            this$0 = FileDownloadService.this;
            super();
        }
    }


    public static final int BYTES_BUFFER_SIZE = 32768;
    public static final String DOWNLOAD_FAILED_INTENT_KEY = "download_failed";
    private static final long MIN_EXPECTED_REMOTE_FILE_SIZE_BYTES = 0x7a120L;
    public static final String PROGRESS_COMPLETE_INTENT_KEY = "complete";
    public static final String PROGRESS_UPDATE_INTENT_KEY = "progress";
    public static final int SERVICE_ID = 0x101104;
    protected static boolean isRunning = false;
    private final IBinder binder = new FileDownloadBinder();
    private NotificationManager notificationManager;
    private AsyncDownloadTask task;

    public FileDownloadService()
    {
        task = null;
    }

    private String buildDownloadProgressMessage(int i, int j)
    {
        return String.format((new StringBuilder()).append(getString(com.accuweather.android.R.string.Downloading)).append(" (%d / %d)").toString(), new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
    }

    private String buildDownloadingFilesMessage()
    {
        return getString(com.accuweather.android.R.string.Downloading);
    }

    private String buildKbytesDownloadedMessage(int i, int j)
    {
        return String.format("%s / %s", new Object[] {
            getStringByteSize(j), getStringByteSize(i)
        });
    }

    public static boolean isRunning()
    {
        return isRunning;
    }

    private void showDownloadFailedNotification()
    {
        showNotification(getString(com.accuweather.android.R.string.Error_Word), getString(com.accuweather.android.R.string.Downloading), getString(com.accuweather.android.R.string.Error_Word));
    }

    private void showDownloadSucceededNotification()
    {
        showNotification(getString(com.accuweather.android.R.string.Done), getString(com.accuweather.android.R.string.Downloading), getString(com.accuweather.android.R.string.Done));
    }

    protected int getConnectTimeout()
    {
        return 5000;
    }

    public abstract String getDownloadUpdateIntentAction();

    protected abstract Class getIntentForLatestInfo();

    protected abstract int getNotificationFlag();

    protected abstract int getNotificationIcon();

    protected RemoteViews getProgressView(int i, int j, int k, int l)
    {
        return null;
    }

    protected int getReadTimeout()
    {
        return 5000;
    }

    protected String getStringByteSize(int i)
    {
        if (i > 0x100000)
        {
            return String.format("%.1f MB", new Object[] {
                Float.valueOf((float)i / 1048576F)
            });
        }
        if (i > 1024)
        {
            return String.format("%.1f KB", new Object[] {
                Float.valueOf((float)i / 1024F)
            });
        } else
        {
            return String.format("%d B", new Object[] {
                Integer.valueOf(i)
            });
        }
    }

    protected abstract HashMap getTargetFiles();

    public IBinder onBind(Intent intent)
    {
        return binder;
    }

    public void onCreate()
    {
        if (isRunning)
        {
            return;
        } else
        {
            isRunning = true;
            notificationManager = (NotificationManager)getSystemService("notification");
            return;
        }
    }

    public void onDestroy()
    {
        if (task != null && !task.isCancelled())
        {
            task.cancel(true);
        }
        isRunning = false;
        notificationManager.cancel(0x101104);
    }

    protected abstract void onFinishDownload_Background(HashMap hashmap, HashMap hashmap1);

    protected abstract void onFinishDownload_UI(HashMap hashmap, HashMap hashmap1);

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (task == null || task.getStatus().equals(android.os.AsyncTask.Status.FINISHED))
        {
            task = new AsyncDownloadTask();
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                task.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else
            {
                task.execute(new Void[0]);
            }
        }
        return 1;
    }

    protected void showNotification(RemoteViews remoteviews, String s)
    {
        s = new Notification(getNotificationIcon(), s, System.currentTimeMillis());
        s.contentView = remoteviews;
        s.contentIntent = PendingIntent.getActivity(this, 0, (new Intent(this, getIntentForLatestInfo())).addFlags(0x4000000), 0x4000000);
        s.flags = getNotificationFlag();
        notificationManager.notify(0x101104, s);
    }

    protected void showNotification(String s, String s1, String s2)
    {
        s = new Notification(getNotificationIcon(), s, System.currentTimeMillis());
        PendingIntent pendingintent = PendingIntent.getActivity(this, 0, (new Intent(this, getIntentForLatestInfo())).addFlags(0x4000000), 0x4000000);
        s.setLatestEventInfo(getApplicationContext(), s1, s2, pendingintent);
        s.flags = getNotificationFlag();
        notificationManager.notify(0x101104, s);
    }







/*
    static AsyncDownloadTask access$502(FileDownloadService filedownloadservice, AsyncDownloadTask asyncdownloadtask)
    {
        filedownloadservice.task = asyncdownloadtask;
        return asyncdownloadtask;
    }

*/

}
