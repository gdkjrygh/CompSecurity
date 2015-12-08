// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.drive.internal.DriveClientImpl;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.drive:
//            Drive

public final class ExecutionOptions
{
    public static final class Builder
    {

        private int mConflictStrategy;
        public boolean mNotifyOnCompletion;
        private String mTrackingTag;

        public final ExecutionOptions build()
        {
            if (mConflictStrategy == 1 && !mNotifyOnCompletion)
            {
                throw new IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
            } else
            {
                return new ExecutionOptions(mTrackingTag, mNotifyOnCompletion, mConflictStrategy);
            }
        }

        public final Builder setConflictStrategy$4bdbcb8d()
        {
            if (!ExecutionOptions.isValidConflictStrategy(1))
            {
                throw new IllegalArgumentException((new StringBuilder("Unrecognized value for conflict strategy: 1")).toString());
            } else
            {
                mConflictStrategy = 1;
                return this;
            }
        }

        public final Builder setTrackingTag(String s)
        {
            if (!ExecutionOptions.isValidTrackingTag(s))
            {
                throw new IllegalArgumentException(String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", new Object[] {
                    Integer.valueOf(0x10000)
                }));
            } else
            {
                mTrackingTag = s;
                return this;
            }
        }

        public Builder()
        {
            mConflictStrategy = 0;
        }
    }


    public final int mConflictStrategy;
    public final boolean mNotifyOnCompletion;
    public final String mTrackingTag;

    public ExecutionOptions(String s, boolean flag, int i)
    {
        mTrackingTag = s;
        mNotifyOnCompletion = flag;
        mConflictStrategy = i;
    }

    public static void checkValidCompletionEventRequest(GoogleApiClient googleapiclient, ExecutionOptions executionoptions)
    {
        googleapiclient = (DriveClientImpl)googleapiclient.getClient(Drive.CLIENT_KEY);
        if (executionoptions.mNotifyOnCompletion && !((DriveClientImpl) (googleapiclient)).mHasEventService)
        {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
        } else
        {
            return;
        }
    }

    public static boolean isValidConflictStrategy(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
            return true;
        }
    }

    public static boolean isValidTrackingTag(String s)
    {
        return s != null && !s.isEmpty() && s.length() <= 0x10000;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == this) goto _L4; else goto _L3
_L3:
        obj = (ExecutionOptions)obj;
        if (!Objects.equal(mTrackingTag, ((ExecutionOptions) (obj)).mTrackingTag) || mConflictStrategy != ((ExecutionOptions) (obj)).mConflictStrategy)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (mNotifyOnCompletion == ((ExecutionOptions) (obj)).mNotifyOnCompletion) goto _L4; else goto _L5
_L5:
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mTrackingTag, Integer.valueOf(mConflictStrategy), Boolean.valueOf(mNotifyOnCompletion)
        });
    }
}
