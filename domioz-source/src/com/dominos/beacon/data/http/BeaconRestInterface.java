// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.data.http;

import com.dominos.beacon.model.CarryoutOrder;
import com.dominos.beacon.model.CheckInResponse;
import org.androidannotations.api.b.a;
import org.androidannotations.api.b.b;
import org.androidannotations.api.b.c;

public interface BeaconRestInterface
    extends a, b, c
{

    public abstract CheckInResponse checkIn(String s);

    public abstract CarryoutOrder getOrders(String s);
}
