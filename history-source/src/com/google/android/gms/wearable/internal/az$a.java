// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;


// Referenced classes of package com.google.android.gms.wearable.internal:
//            a, az

static abstract class DA extends a
{

    private com.google.android.gms.common.api.mplementation.b DA;

    public void A(Object obj)
    {
        com.google.android.gms.common.api.mplementation.b b = DA;
        if (b != null)
        {
            b.b(obj);
            DA = null;
        }
    }

    public n.b(com.google.android.gms.common.api.mplementation.b b)
    {
        DA = b;
    }
}
