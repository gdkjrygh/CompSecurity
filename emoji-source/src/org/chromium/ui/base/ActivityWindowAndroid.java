// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.base;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;

// Referenced classes of package org.chromium.ui.base:
//            WindowAndroid

public class ActivityWindowAndroid extends WindowAndroid
{

    private static final int REQUEST_CODE_PREFIX = 1000;
    private static final int REQUEST_CODE_RANGE_SIZE = 100;
    private static final String TAG = "ActivityWindowAndroid";
    private final WeakReference mActivityRef;
    private int mNextRequestCode;

    public ActivityWindowAndroid(Activity activity)
    {
        super(activity.getApplicationContext());
        mNextRequestCode = 0;
        mActivityRef = new WeakReference(activity);
    }

    private int generateNextRequestCode()
    {
        int i = mNextRequestCode;
        mNextRequestCode = (mNextRequestCode + 1) % 100;
        return i + 1000;
    }

    private void storeCallbackData(int i, WindowAndroid.IntentCallback intentcallback, int j)
    {
        mOutstandingIntents.put(i, intentcallback);
        mIntentErrors.put(Integer.valueOf(i), mApplicationContext.getString(j));
    }

    public void cancelIntent(int i)
    {
        Activity activity = (Activity)mActivityRef.get();
        if (activity == null)
        {
            return;
        } else
        {
            activity.finishActivity(i);
            return;
        }
    }

    public WeakReference getActivity()
    {
        return new WeakReference(mActivityRef.get());
    }

    public boolean onActivityResult(int i, int j, Intent intent)
    {
        WindowAndroid.IntentCallback intentcallback = (WindowAndroid.IntentCallback)mOutstandingIntents.get(i);
        mOutstandingIntents.delete(i);
        String s = (String)mIntentErrors.remove(Integer.valueOf(i));
        if (intentcallback != null)
        {
            intentcallback.onIntentCompleted(this, j, mApplicationContext.getContentResolver(), intent);
            return true;
        }
        if (s != null)
        {
            showCallbackNonExistentError(s);
            return true;
        } else
        {
            return false;
        }
    }

    public int showCancelableIntent(PendingIntent pendingintent, WindowAndroid.IntentCallback intentcallback, int i)
    {
        Activity activity = (Activity)mActivityRef.get();
        if (activity == null)
        {
            return -1;
        }
        int j = generateNextRequestCode();
        try
        {
            activity.startIntentSenderForResult(pendingintent.getIntentSender(), j, new Intent(), 0, 0, 0);
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            return -1;
        }
        storeCallbackData(j, intentcallback, i);
        return j;
    }

    public int showCancelableIntent(Intent intent, WindowAndroid.IntentCallback intentcallback, int i)
    {
        Activity activity = (Activity)mActivityRef.get();
        if (activity == null)
        {
            return -1;
        }
        int j = generateNextRequestCode();
        try
        {
            activity.startActivityForResult(intent, j);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return -1;
        }
        storeCallbackData(j, intentcallback, i);
        return j;
    }
}
