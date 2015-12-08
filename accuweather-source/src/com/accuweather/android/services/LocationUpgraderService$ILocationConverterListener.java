// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import java.util.List;

// Referenced classes of package com.accuweather.android.services:
//            LocationUpgraderService

public static interface Y
{

    public abstract void onConversionCompleted(List list);

    public abstract void onConversionError(Exception exception);
}
