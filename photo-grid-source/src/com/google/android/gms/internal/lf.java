// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IInterface;

public interface lf
    extends IInterface
{

    public abstract String getProductId();

    public abstract void recordPlayBillingResolution(int i);

    public abstract void recordResolution(int i);
}
