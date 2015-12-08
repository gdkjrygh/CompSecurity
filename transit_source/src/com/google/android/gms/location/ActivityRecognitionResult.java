// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dm;
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
    private final int iM;
    List ov;
    long ow;
    long ox;

    public ActivityRecognitionResult(int i, List list, long l, long l1)
    {
        iM = 1;
        ov = list;
        ow = l;
        ox = l1;
    }

    public ActivityRecognitionResult(DetectedActivity detectedactivity, long l, long l1)
    {
        this(Collections.singletonList(detectedactivity), l, l1);
    }

    public ActivityRecognitionResult(List list, long l, long l1)
    {
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.b(flag, "Must have at least 1 detected activity");
        iM = 1;
        ov = list;
        ow = l;
        ox = l1;
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
        for (Iterator iterator = ov.iterator(); iterator.hasNext();)
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
        return ox;
    }

    public DetectedActivity getMostProbableActivity()
    {
        return (DetectedActivity)ov.get(0);
    }

    public List getProbableActivities()
    {
        return ov;
    }

    public long getTime()
    {
        return ow;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ActivityRecognitionResult [probableActivities=").append(ov).append(", timeMillis=").append(ow).append(", elapsedRealtimeMillis=").append(ox).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ActivityRecognitionResultCreator.a(this, parcel, i);
    }

}
