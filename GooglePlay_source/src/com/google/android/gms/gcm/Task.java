// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.gcm:
//            RetryStrategy

public abstract class Task
    implements Parcelable
{
    public static abstract class Builder
    {

        protected Bundle extras;
        protected String gcmTaskService;
        protected boolean isPersisted;
        protected boolean requiresCharging;
        protected RetryStrategy retryStrategy;
        protected String tag;
        protected boolean updateCurrent;

        protected void checkConditions()
        {
            String s;
            boolean flag;
            if (gcmTaskService != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Must provide an endpoint for this task by calling setService(ComponentName).");
            s = tag;
            if (TextUtils.isEmpty(s))
            {
                throw new IllegalArgumentException("Must provide a valid tag.");
            }
            if (100 < s.length())
            {
                throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
            }
            Task.validateRetryStrategy(retryStrategy);
            if (isPersisted)
            {
                Task.validateExtras(extras);
            }
        }

        public Builder()
        {
            retryStrategy = RetryStrategy.PRESET_EXPONENTIAL;
        }
    }


    private final Bundle mExtras;
    final String mGcmTaskService;
    private final boolean mIsPersisted;
    private final int mRequiredNetworkState;
    private final boolean mRequiresCharging;
    private final RetryStrategy mRetryStrategy;
    private final String mTag;
    private final boolean mUpdateCurrent;

    Task(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        Log.e("Task", "Constructing a Task object using a parcel.");
        mGcmTaskService = parcel.readString();
        mTag = parcel.readString();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mUpdateCurrent = flag;
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        mIsPersisted = flag;
        mRequiredNetworkState = 2;
        mRequiresCharging = false;
        mRetryStrategy = RetryStrategy.PRESET_EXPONENTIAL;
        mExtras = null;
    }

    Task(Builder builder)
    {
        mGcmTaskService = builder.gcmTaskService;
        mTag = builder.tag;
        mUpdateCurrent = builder.updateCurrent;
        mIsPersisted = builder.isPersisted;
        mRequiredNetworkState = 0;
        mRequiresCharging = builder.requiresCharging;
        mRetryStrategy = builder.retryStrategy;
        mExtras = builder.extras;
    }

    public static void validateExtras(Bundle bundle)
    {
label0:
        {
            if (bundle == null)
            {
                break label0;
            }
            Object obj = Parcel.obtain();
            bundle.writeToParcel(((Parcel) (obj)), 0);
            int i = ((Parcel) (obj)).dataSize();
            if (i > 10240)
            {
                ((Parcel) (obj)).recycle();
                throw new IllegalArgumentException((new StringBuilder("Extras exceeding maximum size(10240 bytes): ")).append(i).toString());
            }
            ((Parcel) (obj)).recycle();
            obj = bundle.keySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                Object obj1 = bundle.get((String)((Iterator) (obj)).next());
                boolean flag;
                if ((obj1 instanceof Integer) || (obj1 instanceof Long) || (obj1 instanceof Double) || (obj1 instanceof String) || (obj1 instanceof Boolean))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } while (flag);
            throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, and Boolean. ");
        }
    }

    public static void validateRetryStrategy(RetryStrategy retrystrategy)
    {
        if (retrystrategy != null)
        {
            int i = retrystrategy.retryPolicy;
            if (i != 1 && i != 0)
            {
                throw new IllegalArgumentException((new StringBuilder("Must provide a valid RetryPolicy: ")).append(i).toString());
            }
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void toBundle(Bundle bundle)
    {
        bundle.putString("tag", mTag);
        bundle.putBoolean("update_current", mUpdateCurrent);
        bundle.putBoolean("persisted", mIsPersisted);
        bundle.putString("service", mGcmTaskService);
        bundle.putInt("requiredNetwork", mRequiredNetworkState);
        bundle.putBoolean("requiresCharging", mRequiresCharging);
        RetryStrategy retrystrategy = mRetryStrategy;
        Bundle bundle1 = new Bundle();
        bundle1.putInt("retry_policy", retrystrategy.retryPolicy);
        bundle1.putInt("initial_backoff_seconds", 30);
        bundle1.putInt("maximum_backoff_seconds", 3600);
        bundle.putBundle("retryStrategy", bundle1);
        bundle.putBundle("extras", mExtras);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(mGcmTaskService);
        parcel.writeString(mTag);
        if (mUpdateCurrent)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (mIsPersisted)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }
}
