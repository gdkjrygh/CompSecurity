// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.scanner;

import com.dominos.beacon.model.Beacon;

public interface 
{

    public abstract void onBeaconFound(Beacon beacon);

    public abstract void onScanFinished();
}
