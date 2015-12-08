// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.data.Freezable;

// Referenced classes of package com.google.android.gms.wearable:
//            DataItem

public interface DataEvent
    extends Freezable
{

    public static final int TYPE_CHANGED = 1;
    public static final int TYPE_DELETED = 2;

    public abstract DataItem getDataItem();

    public abstract int getType();
}
