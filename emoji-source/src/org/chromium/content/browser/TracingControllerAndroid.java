// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TracingControllerAndroid
{
    class TracingBroadcastReceiver extends BroadcastReceiver
    {

        final TracingControllerAndroid this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().endsWith("GPU_PROFILER_START"))
            {
                context = intent.getStringExtra("categories");
                String s;
                if (TextUtils.isEmpty(context))
                {
                    context = nativeGetDefaultCategories();
                } else
                {
                    context = context.replaceFirst("_DEFAULT_CHROME_CATEGORIES", nativeGetDefaultCategories());
                }
                if (intent.getStringExtra("continuous") == null)
                {
                    s = "record-until-full";
                } else
                {
                    s = "record-continuously";
                }
                intent = intent.getStringExtra("file");
                if (intent != null)
                {
                    startTracing(intent, true, context, s);
                    return;
                } else
                {
                    startTracing(true, context, s);
                    return;
                }
            }
            if (intent.getAction().endsWith("GPU_PROFILER_STOP"))
            {
                stopTracing();
                return;
            }
            if (intent.getAction().endsWith("GPU_PROFILER_LIST_CATEGORIES"))
            {
                getCategoryGroups();
                return;
            } else
            {
                Log.e("TracingControllerAndroid", (new StringBuilder()).append("Unexpected intent: ").append(intent).toString());
                return;
            }
        }

        TracingBroadcastReceiver()
        {
            this$0 = TracingControllerAndroid.this;
            super();
        }
    }

    private static class TracingIntentFilter extends IntentFilter
    {

        TracingIntentFilter(Context context)
        {
            addAction((new StringBuilder()).append(context.getPackageName()).append(".").append("GPU_PROFILER_START").toString());
            addAction((new StringBuilder()).append(context.getPackageName()).append(".").append("GPU_PROFILER_STOP").toString());
            addAction((new StringBuilder()).append(context.getPackageName()).append(".").append("GPU_PROFILER_LIST_CATEGORIES").toString());
        }
    }


    static final boolean $assertionsDisabled;
    private static final String ACTION_LIST_CATEGORIES = "GPU_PROFILER_LIST_CATEGORIES";
    private static final String ACTION_START = "GPU_PROFILER_START";
    private static final String ACTION_STOP = "GPU_PROFILER_STOP";
    private static final String CATEGORIES_EXTRA = "categories";
    private static final String DEFAULT_CHROME_CATEGORIES_PLACE_HOLDER = "_DEFAULT_CHROME_CATEGORIES";
    private static final String FILE_EXTRA = "file";
    private static final String PROFILER_FINISHED_FMT = "Profiler finished. Results are in %s.";
    private static final String PROFILER_STARTED_FMT = "Profiler started: %s";
    private static final String RECORD_CONTINUOUSLY_EXTRA = "continuous";
    private static final String TAG = "TracingControllerAndroid";
    private final TracingBroadcastReceiver mBroadcastReceiver = new TracingBroadcastReceiver();
    private final Context mContext;
    private String mFilename;
    private final TracingIntentFilter mIntentFilter;
    private boolean mIsTracing;
    private long mNativeTracingControllerAndroid;
    private boolean mShowToasts;

    public TracingControllerAndroid(Context context)
    {
        mShowToasts = true;
        mContext = context;
        mIntentFilter = new TracingIntentFilter(context);
    }

    private static String generateTracingFilePath()
    {
        if (!"mounted".equals(Environment.getExternalStorageState()))
        {
            return null;
        } else
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd-HHmmss", Locale.US);
            simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return (new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), (new StringBuilder()).append("chrome-profile-results-").append(simpledateformat.format(new Date())).toString())).getPath();
        }
    }

    private void initializeNativeControllerIfNeeded()
    {
        if (mNativeTracingControllerAndroid == 0L)
        {
            mNativeTracingControllerAndroid = nativeInit();
        }
    }

    private void logAndToastError(String s)
    {
        Log.e("TracingControllerAndroid", s);
        if (mShowToasts)
        {
            Toast.makeText(mContext, s, 0).show();
        }
    }

    private void logForProfiler(String s)
    {
        Log.i("TracingControllerAndroid", s);
    }

    private native void nativeDestroy(long l);

    private native String nativeGetDefaultCategories();

    private native boolean nativeGetKnownCategoryGroupsAsync(long l);

    private native long nativeInit();

    private native boolean nativeStartTracing(long l, String s, String s1);

    private native void nativeStopTracing(long l, String s);

    private void showToast(String s)
    {
        if (mShowToasts)
        {
            Toast.makeText(mContext, s, 0).show();
        }
    }

    public void destroy()
    {
        if (mNativeTracingControllerAndroid != 0L)
        {
            nativeDestroy(mNativeTracingControllerAndroid);
            mNativeTracingControllerAndroid = 0L;
        }
    }

    protected void finalize()
    {
        if (!$assertionsDisabled && mNativeTracingControllerAndroid != 0L)
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    public BroadcastReceiver getBroadcastReceiver()
    {
        return mBroadcastReceiver;
    }

    public void getCategoryGroups()
    {
        initializeNativeControllerIfNeeded();
        if (!nativeGetKnownCategoryGroupsAsync(mNativeTracingControllerAndroid))
        {
            Log.e("TracingControllerAndroid", "Unable to fetch tracing record groups list.");
        }
    }

    public IntentFilter getIntentFilter()
    {
        return mIntentFilter;
    }

    public String getOutputPath()
    {
        return mFilename;
    }

    public boolean isTracing()
    {
        return mIsTracing;
    }

    protected void onTracingStopped()
    {
        if (!isTracing())
        {
            Log.e("TracingControllerAndroid", "Received onTracingStopped, but we aren't tracing");
            return;
        } else
        {
            logForProfiler(String.format("Profiler finished. Results are in %s.", new Object[] {
                mFilename
            }));
            showToast(mContext.getString(org.chromium.content.R.string.profiler_stopped_toast, new Object[] {
                mFilename
            }));
            mIsTracing = false;
            mFilename = null;
            return;
        }
    }

    public void registerReceiver(Context context)
    {
        context.registerReceiver(getBroadcastReceiver(), getIntentFilter());
    }

    public boolean startTracing(String s, boolean flag, String s1, String s2)
    {
        mShowToasts = flag;
        if (isTracing())
        {
            Log.e("TracingControllerAndroid", "Received startTracing, but we're already tracing");
            return false;
        }
        initializeNativeControllerIfNeeded();
        if (!nativeStartTracing(mNativeTracingControllerAndroid, s1, s2.toString()))
        {
            logAndToastError(mContext.getString(org.chromium.content.R.string.profiler_error_toast));
            return false;
        } else
        {
            logForProfiler(String.format("Profiler started: %s", new Object[] {
                s1
            }));
            showToast((new StringBuilder()).append(mContext.getString(org.chromium.content.R.string.profiler_started_toast)).append(": ").append(s1).toString());
            mFilename = s;
            mIsTracing = true;
            return true;
        }
    }

    public boolean startTracing(boolean flag, String s, String s1)
    {
        mShowToasts = flag;
        String s2 = generateTracingFilePath();
        if (s2 == null)
        {
            logAndToastError(mContext.getString(org.chromium.content.R.string.profiler_no_storage_toast));
        }
        return startTracing(s2, flag, s, s1);
    }

    public void stopTracing()
    {
        if (isTracing())
        {
            nativeStopTracing(mNativeTracingControllerAndroid, mFilename);
        }
    }

    public void unregisterReceiver(Context context)
    {
        context.unregisterReceiver(getBroadcastReceiver());
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/TracingControllerAndroid.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

}
