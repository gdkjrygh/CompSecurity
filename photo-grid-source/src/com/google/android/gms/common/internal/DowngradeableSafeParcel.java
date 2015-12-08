// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public abstract class DowngradeableSafeParcel
    implements SafeParcelable
{

    private static final Object a = new Object();
    private static ClassLoader b = null;
    private static Integer c = null;
    private boolean d;

    public DowngradeableSafeParcel()
    {
        d = false;
    }

}
