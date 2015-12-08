// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.soundcloud.android.crop:
//            MonitoredActivity

class CropUtil
{
    private static class BackgroundJob extends MonitoredActivity.LifeCycleAdapter
        implements Runnable
    {

        private final MonitoredActivity activity;
        private final Runnable cleanupRunner = new _cls1();
        private final ProgressDialog dialog;
        private final Handler handler;
        private final Runnable job;

        public void onActivityDestroyed(MonitoredActivity monitoredactivity)
        {
            cleanupRunner.run();
            handler.removeCallbacks(cleanupRunner);
        }

        public void onActivityStarted(MonitoredActivity monitoredactivity)
        {
            dialog.show();
        }

        public void onActivityStopped(MonitoredActivity monitoredactivity)
        {
            dialog.hide();
        }

        public void run()
        {
            job.run();
            handler.post(cleanupRunner);
            return;
            Exception exception;
            exception;
            handler.post(cleanupRunner);
            throw exception;
        }



        public BackgroundJob(MonitoredActivity monitoredactivity, Runnable runnable, ProgressDialog progressdialog, Handler handler1)
        {
            class _cls1
                implements Runnable
            {

                final BackgroundJob this$0;

                public void run()
                {
                    activity.removeLifeCycleListener(BackgroundJob.this);
                    if (dialog.getWindow() != null)
                    {
                        dialog.dismiss();
                    }
                }

                _cls1()
                {
                    this$0 = BackgroundJob.this;
                    super();
                }
            }

            activity = monitoredactivity;
            dialog = progressdialog;
            job = runnable;
            activity.addLifeCycleListener(this);
            handler = handler1;
        }
    }


    private static final String SCHEME_CONTENT = "content";
    private static final String SCHEME_FILE = "file";

    CropUtil()
    {
    }

    public static void closeSilently(Closeable closeable)
    {
        if (closeable == null)
        {
            return;
        }
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            return;
        }
    }

    public static boolean copyExifRotation(File file, File file1)
    {
        if (file == null || file1 == null)
        {
            return false;
        }
        try
        {
            file = new ExifInterface(file.getAbsolutePath());
            file1 = new ExifInterface(file1.getAbsolutePath());
            file1.setAttribute("Orientation", file.getAttribute("Orientation"));
            file1.saveAttributes();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return false;
        }
        return true;
    }

    public static int getExifRotation(File file)
    {
        if (file == null)
        {
            return 0;
        }
        int i;
        try
        {
            i = (new ExifInterface(file.getAbsolutePath())).getAttributeInt("Orientation", 0);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return 0;
        }
        switch (i)
        {
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        default:
            return 0;

        case 3: // '\003'
            return 180;

        case 6: // '\006'
            return 90;

        case 8: // '\b'
            return 270;
        }
    }

    public static File getFromMediaUri(Context context, ContentResolver contentresolver, Uri uri)
    {
        Cursor cursor = null;
        if (uri != null) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        return context;
_L2:
        if ("file".equals(uri.getScheme()))
        {
            return new File(uri.getPath());
        }
        if (!"content".equals(uri.getScheme()))
        {
            break MISSING_BLOCK_LABEL_182;
        }
        Object obj = contentresolver.query(uri, new String[] {
            "_data", "_display_name"
        }, null, null, null);
        cursor = ((Cursor) (obj));
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        int i;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_172;
        }
        if (!uri.toString().startsWith("content://com.google.android.gallery3d"))
        {
            break MISSING_BLOCK_LABEL_159;
        }
        i = cursor.getColumnIndex("_display_name");
_L5:
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        obj = cursor.getString(i);
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_172;
        }
        obj = new File(((String) (obj)));
        context = ((Context) (obj));
        if (cursor == null) goto _L4; else goto _L3
_L3:
        cursor.close();
        return ((File) (obj));
        i = cursor.getColumnIndex("_data");
          goto _L5
        if (cursor != null)
        {
            cursor.close();
        }
_L6:
        return null;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
_L10:
        contentresolver = getFromMediaUriPfd(context, contentresolver, uri);
        context = contentresolver;
        if (cursor != null)
        {
            cursor.close();
            return contentresolver;
        }
          goto _L4
        context;
        cursor = null;
_L9:
        if (cursor != null)
        {
            cursor.close();
        }
          goto _L6
        context;
        cursor = null;
_L8:
        if (cursor != null)
        {
            cursor.close();
        }
        throw context;
        context;
        continue; /* Loop/switch isn't completed */
        context;
        if (true) goto _L8; else goto _L7
_L7:
        context;
          goto _L9
        illegalargumentexception;
          goto _L10
    }

    private static File getFromMediaUriPfd(Context context, ContentResolver contentresolver, Uri uri)
    {
        if (uri == null)
        {
            return null;
        }
        byte abyte0[];
        int i;
        try
        {
            contentresolver = new FileInputStream(contentresolver.openFileDescriptor(uri, "r").getFileDescriptor());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
            contentresolver = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            uri = null;
            contentresolver = null;
        }
        context = getTempFilename(context);
        uri = new FileOutputStream(context);
        abyte0 = new byte[4096];
_L3:
        i = contentresolver.read(abyte0);
        if (i == -1) goto _L2; else goto _L1
_L1:
        uri.write(abyte0, 0, i);
          goto _L3
        context;
        context = uri;
_L7:
        closeSilently(contentresolver);
        closeSilently(context);
        return null;
_L2:
        context = new File(context);
        closeSilently(contentresolver);
        closeSilently(uri);
        return context;
_L5:
        closeSilently(contentresolver);
        closeSilently(uri);
        throw context;
        context;
        uri = null;
        continue; /* Loop/switch isn't completed */
        context;
        if (true) goto _L5; else goto _L4
_L4:
        context;
        context = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static String getTempFilename(Context context)
        throws IOException
    {
        return File.createTempFile("image", "tmp", context.getCacheDir()).getAbsolutePath();
    }

    public static void startBackgroundJob(MonitoredActivity monitoredactivity, String s, String s1, Runnable runnable, Handler handler)
    {
        (new Thread(new BackgroundJob(monitoredactivity, runnable, ProgressDialog.show(monitoredactivity, s, s1, true, false), handler))).start();
    }
}
