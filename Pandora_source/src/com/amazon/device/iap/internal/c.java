// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.Set;

public interface c
{

    public abstract void a(Context context, Intent intent);

    public abstract void a(RequestId requestid);

    public abstract void a(RequestId requestid, String s);

    public abstract void a(RequestId requestid, String s, FulfillmentResult fulfillmentresult);

    public abstract void a(RequestId requestid, Set set);

    public abstract void a(RequestId requestid, boolean flag);
}
