// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemBuffer;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            a, au

class t> extends a
{

    final au ame;
    final com.google.android.gms.common.api..au amf;

    public void Z(DataHolder dataholder)
    {
        amf.amf(new DataItemBuffer(dataholder));
    }

    (au au1, com.google.android.gms.common.api..au au2)
    {
        ame = au1;
        amf = au2;
        super();
    }
}
