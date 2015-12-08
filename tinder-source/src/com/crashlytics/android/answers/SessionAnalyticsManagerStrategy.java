// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.b.h;
import io.fabric.sdk.android.services.settings.b;

interface SessionAnalyticsManagerStrategy
    extends h
{

    public abstract void a(SessionEvent.Builder builder);

    public abstract void a(b b, String s);
}
