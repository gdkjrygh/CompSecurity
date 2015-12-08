// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.installtracker;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;
import android.webkit.WebView;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.admarvel.android.installtracker:
//            Utils

public class AdMarvelInstallTrackerAsyncTask extends AsyncTask
{

    private final WeakReference contextReference;
    private final StringBuilder trackerHtml = new StringBuilder();

    public AdMarvelInstallTrackerAsyncTask(Context context)
    {
        contextReference = new WeakReference(context);
    }

    private boolean fireTrackerUrls(Context context, ArrayList arraylist)
    {
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        arraylist = arraylist.iterator();
_L3:
        if (arraylist.hasNext())
        {
            break MISSING_BLOCK_LABEL_106;
        }
_L2:
        if (trackerHtml == null || trackerHtml.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        if (Thread.currentThread().getName().equalsIgnoreCase("main"))
        {
            context = new WebView(context.getApplicationContext());
            Logging.log((new StringBuilder("Firing Install Tracking Pixels: ")).append(trackerHtml.toString()).toString());
            context.loadDataWithBaseURL(null, trackerHtml.toString(), "text/html", "utf-8", null);
            break MISSING_BLOCK_LABEL_175;
        }
        break MISSING_BLOCK_LABEL_151;
        try
        {
            String s = (String)arraylist.next();
            trackerHtml.append("<img src=\"").append(s).append("\" />");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("admarvel", Log.getStackTraceString(context));
            return false;
        }
          goto _L3
        arraylist = new Thread() {

            final AdMarvelInstallTrackerAsyncTask this$0;

            public void run()
            {
                if (contextReference != null)
                {
                    Object obj = (Context)contextReference.get();
                    if (obj != null)
                    {
                        obj = new WebView(((Context) (obj)).getApplicationContext());
                        Logging.log((new StringBuilder("Firing Install Tracking Pixels: ")).append(trackerHtml.toString()).toString());
                        ((WebView) (obj)).loadDataWithBaseURL(null, trackerHtml.toString(), "text/html", "utf-8", null);
                    }
                }
            }

            
            {
                this$0 = AdMarvelInstallTrackerAsyncTask.this;
                super();
            }
        };
        if (context instanceof Activity)
        {
            ((Activity)context).runOnUiThread(arraylist);
        }
        return true;
    }

    protected transient Object doInBackground(Object aobj[])
    {
        int i = 0;
        if (contextReference == null)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        aobj = (Context)contextReference.get();
        if (aobj == null)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        File afile[];
        Object obj = ((Context) (aobj)).getSharedPreferences(Utils.encodeString("admarvel"), 0);
        if (!((SharedPreferences) (obj)).getBoolean(Utils.encodeString("registered_tracking_event"), false))
        {
            Object obj1 = ((Context) (aobj)).getPackageName();
            if ("mounted".equals(Environment.getExternalStorageState()))
            {
                obj1 = new File(Environment.getExternalStorageDirectory(), (new StringBuilder("/")).append(Utils.encodeString("adm_tracker_dir")).append("/").append(Utils.encodeString(((String) (obj1)))).toString());
                if (((File) (obj1)).exists())
                {
                    Object obj2 = (new ObjectInputStream(new FileInputStream(((File) (obj1))))).readObject();
                    if ((obj2 instanceof ArrayList) && fireTrackerUrls(((Context) (aobj)), (ArrayList)obj2))
                    {
                        obj = ((SharedPreferences) (obj)).edit();
                        ((android.content.SharedPreferences.Editor) (obj)).putBoolean(Utils.encodeString("registered_tracking_event"), true);
                        ((android.content.SharedPreferences.Editor) (obj)).commit();
                        ((File) (obj1)).delete();
                    }
                }
            }
        }
        obj = new File(Environment.getExternalStorageDirectory(), (new StringBuilder("/")).append(Utils.encodeString("adm_tracker_dir")).toString());
        if (!((File) (obj)).exists() || !((File) (obj)).isDirectory())
        {
            break MISSING_BLOCK_LABEL_336;
        }
        afile = ((File) (obj)).listFiles();
_L2:
        File file;
        if (i >= afile.length)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        file = afile[i];
        if (file.isFile() && Utils.isAppInstalled(((Context) (aobj)), Utils.decodeString(file.getName())))
        {
            Object obj3 = (new ObjectInputStream(new FileInputStream(file))).readObject();
            if ((obj3 instanceof ArrayList) && fireTrackerUrls(((Context) (aobj)), (ArrayList)obj3))
            {
                file.delete();
            }
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        aobj;
        ((Exception) (aobj)).printStackTrace();
        return null;
    }


}
