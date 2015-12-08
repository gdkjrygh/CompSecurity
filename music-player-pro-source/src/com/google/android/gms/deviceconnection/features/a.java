// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.deviceconnection.features;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.deviceconnection.features:
//            DeviceFeature

public final class a extends d
    implements DeviceFeature
{

    public a(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public String getFeatureName()
    {
        return getString("feature_name");
    }

    public long getLastConnectionTimestampMillis()
    {
        return getLong("last_connection_timestamp");
    }

    public String toString()
    {
        return jv.h(this).a("FeatureName", getFeatureName()).a("Timestamp", Long.valueOf(getLastConnectionTimestampMillis())).toString();
    }
}
