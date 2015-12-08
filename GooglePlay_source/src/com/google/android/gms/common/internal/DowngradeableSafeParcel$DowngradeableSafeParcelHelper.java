// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            DowngradeableSafeParcel

public static final class 
{

    public static Bundle getExtras(Intent intent, Context context, Integer integer)
    {
        synchronized (DowngradeableSafeParcel.access$000())
        {
            intent = DowngradeableSafeParcel.getExtras(intent, context, integer);
        }
        return intent;
        intent;
        obj;
        JVM INSTR monitorexit ;
        throw intent;
    }

    public static Parcelable getParcelable(Intent intent, String s, Context context, Integer integer)
    {
        synchronized (DowngradeableSafeParcel.access$000())
        {
            intent = DowngradeableSafeParcel.getParcelable(intent, s, context, integer);
        }
        return intent;
        intent;
        obj;
        JVM INSTR monitorexit ;
        throw intent;
    }

    public static boolean putParcelable(Bundle bundle, String s, DowngradeableSafeParcel downgradeablesafeparcel, Context context, Integer integer)
    {
        return DowngradeableSafeParcel.putParcelable(bundle, s, downgradeablesafeparcel, context, integer);
    }
}
