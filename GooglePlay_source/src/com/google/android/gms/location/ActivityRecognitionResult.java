// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location:
//            ActivityRecognitionResultCreator

public class ActivityRecognitionResult
    implements SafeParcelable
{

    public static final ActivityRecognitionResultCreator CREATOR = new ActivityRecognitionResultCreator();
    int detectorInfoId;
    long elapsedRealtimeMillis;
    Bundle extras;
    final int mVersionCode;
    List probableActivities;
    long timeMillis;

    public ActivityRecognitionResult(int i, List list, long l, long l1, int j, 
            Bundle bundle)
    {
        mVersionCode = i;
        probableActivities = list;
        timeMillis = l;
        elapsedRealtimeMillis = l1;
        detectorInfoId = j;
        extras = bundle;
    }

    private static boolean bundleEquals(Bundle bundle, Bundle bundle1)
    {
        if (bundle != null || bundle1 != null) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        Iterator iterator;
        if (bundle == null && bundle1 != null || bundle != null && bundle1 == null)
        {
            return false;
        }
        if (bundle.size() != bundle1.size())
        {
            return false;
        }
        iterator = bundle.keySet().iterator();
_L5:
        String s;
        while (iterator.hasNext()) 
        {
label0:
            {
                s = (String)iterator.next();
                if (!bundle1.containsKey(s))
                {
                    return false;
                }
                if (bundle.get(s) != null)
                {
                    break label0;
                }
                if (bundle1.get(s) != null)
                {
                    return false;
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!(bundle.get(s) instanceof Bundle))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (bundleEquals(bundle.getBundle(s), bundle1.getBundle(s))) goto _L5; else goto _L4
_L4:
        return false;
        if (bundle.get(s).equals(bundle1.get(s))) goto _L5; else goto _L6
_L6:
        return false;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ActivityRecognitionResult)obj;
            if (timeMillis != ((ActivityRecognitionResult) (obj)).timeMillis || elapsedRealtimeMillis != ((ActivityRecognitionResult) (obj)).elapsedRealtimeMillis || detectorInfoId != ((ActivityRecognitionResult) (obj)).detectorInfoId || !Objects.equal(probableActivities, ((ActivityRecognitionResult) (obj)).probableActivities) || !bundleEquals(extras, ((ActivityRecognitionResult) (obj)).extras))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Long.valueOf(timeMillis), Long.valueOf(elapsedRealtimeMillis), Integer.valueOf(detectorInfoId), probableActivities, extras
        });
    }

    public String toString()
    {
        return (new StringBuilder("ActivityRecognitionResult [probableActivities=")).append(probableActivities).append(", timeMillis=").append(timeMillis).append(", elapsedRealtimeMillis=").append(elapsedRealtimeMillis).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ActivityRecognitionResultCreator.writeToParcel$193b9a6d(this, parcel);
    }

}
