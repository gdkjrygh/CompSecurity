// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import rx.Y;

// Referenced classes of package com.soundcloud.android.ads:
//            AdsController

private class <init>
{

    private final long createdAtMillis;
    private final Y subscription;
    final AdsController this$0;

    public boolean hasExpired()
    {
        return System.currentTimeMillis() - createdAtMillis > AdsController.access$1700(AdsController.this);
    }


    private (Y y)
    {
        this$0 = AdsController.this;
        super();
        subscription = y;
        createdAtMillis = System.currentTimeMillis();
    }

    createdAtMillis(Y y, createdAtMillis createdatmillis)
    {
        this(y);
    }
}
