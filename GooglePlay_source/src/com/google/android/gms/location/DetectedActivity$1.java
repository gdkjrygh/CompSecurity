// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.location:
//            DetectedActivity

static final class 
    implements Comparator
{

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (DetectedActivity)obj;
        obj1 = (DetectedActivity)obj1;
        int j = Integer.valueOf(((DetectedActivity) (obj1)).confidence).compareTo(Integer.valueOf(((DetectedActivity) (obj)).confidence));
        int i = j;
        if (j == 0)
        {
            i = Integer.valueOf(((DetectedActivity) (obj)).getType()).compareTo(Integer.valueOf(((DetectedActivity) (obj1)).getType()));
        }
        return i;
    }

    ()
    {
    }
}
