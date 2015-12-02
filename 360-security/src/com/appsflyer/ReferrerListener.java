// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import java.util.Map;

public interface ReferrerListener
{

    public abstract void onReferrerNotFound();

    public abstract void onReferrerReceived(Map map);
}
