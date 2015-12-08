// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.b;
import com.google.android.gms.wearable.d;

// Referenced classes of package com.google.android.gms.internal:
//            kd

public class ke extends b
    implements d
{

    public ke(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public Object freeze()
    {
        return mf();
    }

    public String getId()
    {
        return getString("asset_id");
    }

    public String mc()
    {
        return getString("asset_key");
    }

    public d mf()
    {
        return new kd(this);
    }
}
