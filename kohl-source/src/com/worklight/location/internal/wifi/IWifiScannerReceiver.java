// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi;

import java.util.Collection;

public interface IWifiScannerReceiver
{

    public abstract void onScanResults(Collection collection, long l);
}
