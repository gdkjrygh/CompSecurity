// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.wakeup;

import android.content.Intent;

public class OnWakeupEvent
{

    private Intent a;

    public OnWakeupEvent(Intent intent)
    {
        if (intent == null)
        {
            throw new IllegalArgumentException("intent can't be null");
        } else
        {
            a = intent;
            return;
        }
    }

    public final Intent a()
    {
        return a;
    }
}
