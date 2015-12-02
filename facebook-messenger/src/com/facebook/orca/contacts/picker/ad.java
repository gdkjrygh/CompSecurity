// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import com.facebook.orca.threads.ThreadSummary;

public class ad
    implements com.facebook.contacts.picker.ad
{

    private final ThreadSummary a;

    public ad(ThreadSummary threadsummary)
    {
        a = threadsummary;
    }

    public ThreadSummary a()
    {
        return a;
    }
}
