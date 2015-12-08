// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package org.xwalk.core.internal:
//            DownloadListener, AndroidProtocolHandler

class XWalkDownloadListenerImpl
    implements DownloadListener
{
    private class FileTransfer extends AsyncTask
    {

        String fileName;
        final XWalkDownloadListenerImpl this$0;
        String url;

        private void streamTransfer(InputStream inputstream, OutputStream outputstream)
            throws IOException
        {
            byte abyte0[] = new byte[1024];
            do
            {
                int i = inputstream.read(abyte0);
                if (i > 0)
                {
                    outputstream.write(abyte0, 0, i);
                } else
                {
                    return;
                }
            } while (true);
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient String doInBackground(Void avoid[])
        {
            Object obj;
            Object obj1;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            avoid = null;
            obj4 = null;
            obj = null;
            obj5 = null;
            obj3 = null;
            obj2 = null;
            obj1 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), fileName);
            if (((File) (obj1)).exists())
            {
                return "Existed";
            }
            obj1 = new FileOutputStream(((File) (obj1)));
            avoid = obj5;
            obj = obj3;
            obj2 = AndroidProtocolHandler.open(mContext, url);
            if (obj1 == null || obj2 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            avoid = ((Void []) (obj2));
            obj = obj2;
            streamTransfer(((InputStream) (obj2)), ((OutputStream) (obj1)));
            if (obj2 != null)
            {
                try
                {
                    ((InputStream) (obj2)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    avoid.printStackTrace();
                    return "Failed";
                }
            }
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_115;
            }
            ((OutputStream) (obj1)).close();
_L2:
            return "Finished";
            IOException ioexception;
            ioexception;
            obj1 = obj4;
_L5:
            avoid = ((Void []) (obj1));
            obj = obj2;
            ioexception.printStackTrace();
            if (obj2 != null)
            {
                try
                {
                    ((InputStream) (obj2)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    avoid.printStackTrace();
                    return "Failed";
                }
            }
            if (obj1 == null) goto _L2; else goto _L1
_L1:
            ((OutputStream) (obj1)).close();
              goto _L2
            Exception exception;
            exception;
            obj1 = obj;
            obj = avoid;
_L4:
            if (obj1 != null)
            {
                try
                {
                    ((InputStream) (obj1)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    avoid.printStackTrace();
                    return "Failed";
                }
            }
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_192;
            }
            ((OutputStream) (obj)).close();
            throw exception;
            exception;
            obj = obj1;
            obj1 = avoid;
            if (true) goto _L4; else goto _L3
_L3:
            ioexception;
            exception = ((Exception) (obj));
              goto _L5
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            if (s.equals("Failed"))
            {
                popupMessages(XWalkDownloadListenerImpl.DOWNLOAD_FAILED_TOAST);
            } else
            {
                if (s.equals("Existed"))
                {
                    popupMessages(XWalkDownloadListenerImpl.DOWNLOAD_ALREADY_EXISTS_TOAST);
                    return;
                }
                if (s.equals("Finished"))
                {
                    popupMessages(XWalkDownloadListenerImpl.DOWNLOAD_FINISHED_TOAST);
                    return;
                }
            }
        }

        public FileTransfer(String s, String s1)
        {
            this$0 = XWalkDownloadListenerImpl.this;
            super();
            url = s;
            fileName = s1;
        }
    }


    private static String DOWNLOAD_ALREADY_EXISTS_TOAST;
    private static String DOWNLOAD_FAILED_TOAST;
    private static String DOWNLOAD_FINISHED_TOAST;
    private static String DOWNLOAD_NO_PERMISSION_TOAST;
    private static String DOWNLOAD_START_TOAST;
    private Context mContext;

    public XWalkDownloadListenerImpl(Context context)
    {
        mContext = context;
        DOWNLOAD_START_TOAST = mContext.getString(R.string.download_start_toast);
        DOWNLOAD_NO_PERMISSION_TOAST = mContext.getString(R.string.download_no_permission_toast);
        DOWNLOAD_ALREADY_EXISTS_TOAST = mContext.getString(R.string.download_already_exists_toast);
        DOWNLOAD_FAILED_TOAST = mContext.getString(R.string.download_failed_toast);
        DOWNLOAD_FINISHED_TOAST = mContext.getString(R.string.download_finished_toast);
    }

    private boolean checkWriteExternalPermission()
    {
        if (mContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0)
        {
            return true;
        } else
        {
            popupMessages(DOWNLOAD_NO_PERMISSION_TOAST);
            return false;
        }
    }

    private DownloadManager getDownloadManager()
    {
        return (DownloadManager)mContext.getSystemService("download");
    }

    private String getFileName(String s, String s1, String s2)
    {
        String s3 = URLUtil.guessFileName(s, s1, s2);
        int i = s3.lastIndexOf(".");
        s1 = null;
        s = s1;
        if (i > 1)
        {
            s = s1;
            if (i < s3.length())
            {
                s = s3.substring(i + 1);
            }
        }
        s1 = s3;
        if (s == null)
        {
            s = MimeTypeMap.getSingleton().getExtensionFromMimeType(s2);
            s1 = s3;
            if (s != null)
            {
                s1 = (new StringBuilder()).append(s3).append(".").append(s).toString();
            }
        }
        return s1;
    }

    private void popupMessages(String s)
    {
        Toast.makeText(mContext, s, 0).show();
    }

    public void onDownloadStart(String s, String s1, String s2, String s3, long l)
    {
        s1 = getFileName(s, s2, s3);
        if (!checkWriteExternalPermission())
        {
            return;
        }
        s2 = Uri.parse(s);
        if (s2.getScheme().equals("http") || s2.getScheme().equals("https"))
        {
            s = new android.app.DownloadManager.Request(Uri.parse(s));
            s.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, s1);
            getDownloadManager().enqueue(s);
            popupMessages((new StringBuilder()).append(DOWNLOAD_START_TOAST).append(s1).toString());
            return;
        } else
        {
            (new FileTransfer(s, s1)).execute(new Void[0]);
            return;
        }
    }





}
