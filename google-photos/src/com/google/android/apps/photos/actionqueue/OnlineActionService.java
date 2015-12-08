// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.actionqueue;

import dio;
import jhk;
import jhl;
import olm;
import olq;

public final class OnlineActionService extends jhk
{

    public OnlineActionService()
    {
        super("OnlineActionService");
    }

    public final void onCreate()
    {
        super.onCreate();
        a.a.a(jhl, new dio(a));
    }
}
