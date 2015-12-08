// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hm;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            ActivityRecognitionResultCreator, DetectedActivity

public class ActivityRecognitionResult
    implements SafeParcelable
{

    public static final ActivityRecognitionResultCreator CREATOR = new ActivityRecognitionResultCreator();
    public static final String EXTRA_ACTIVITY_RESULT = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT";
    List UV;
    long UW;
    long UX;
    private final int xM;

    public ActivityRecognitionResult(int i, List list, long l, long l1)
    {
        xM = 1;
        UV = list;
        UW = l;
        UX = l1;
    }

    public ActivityRecognitionResult(DetectedActivity detectedactivity, long l, long l1)
    {
        this(Collections.singletonList(detectedactivity), l, l1);
    }

    public ActivityRecognitionResult(List list, long l, long l1)
    {
        boolean flag1 = false;
        super();
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.b(flag, "Must have at least 1 detected activity");
        flag = flag1;
        if (l > 0L)
        {
            flag = flag1;
            if (l1 > 0L)
            {
                flag = true;
            }
        }
        hm.b(flag, "Must set times");
        xM = 1;
        UV = list;
        UW = l;
        UX = l1;
    }

    public static ActivityRecognitionResult extractResult(Intent intent)
    {
        if (!hasResult(intent))
        {
            return null;
        } else
        {
            return (ActivityRecognitionResult)intent.getExtras().get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
        }
    }

    public static boolean hasResult(Intent intent)
    {
        if (intent == null)
        {
            return false;
        } else
        {
            return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public int getActivityConfidence(int i)
    {
        for (Iterator iterator = UV.iterator(); iterator.hasNext();)
        {
            DetectedActivity detectedactivity = (DetectedActivity)iterator.next();
            if (detectedactivity.getType() == i)
            {
                return detectedactivity.getConfidence();
            }
        }

        return 0;
    }

    public long getElapsedRealtimeMillis()
    {
        return UX;
    }

    public DetectedActivity getMostProbableActivity()
    {
        return (DetectedActivity)UV.get(0);
    }

    public List getProbableActivities()
    {
        return UV;
    }

    public long getTime()
    {
        return UW;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ActivityRecognitionResult [probableActivities=").append(UV).append(", timeMillis=").append(UW).append(", elapsedRealtimeMillis=").append(UX).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ActivityRecognitionResultCreator.a(this, parcel, i);
    }

}
