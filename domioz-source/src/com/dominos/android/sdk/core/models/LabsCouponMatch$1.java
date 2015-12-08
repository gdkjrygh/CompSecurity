// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import java.util.Comparator;
import org.a.a.a.a.a;

// Referenced classes of package com.dominos.android.sdk.core.models:
//            LabsCouponMatch

final class 
    implements Comparator
{

    public final int compare(LabsCouponMatch labscouponmatch, LabsCouponMatch labscouponmatch1)
    {
        return (new a()).a(labscouponmatch.getSeq(), labscouponmatch1.getSeq()).a();
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((LabsCouponMatch)obj, (LabsCouponMatch)obj1);
    }

    ()
    {
    }
}
