// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.games:
//            Notifications

public static interface A
    extends Result
{

    public abstract int getActivityCount(String s);

    public abstract int getTotalCount();

    public abstract boolean hasNewActivity();
}
