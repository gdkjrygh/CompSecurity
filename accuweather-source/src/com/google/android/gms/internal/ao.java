// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.AppEventListener;

public final class ao extends at.a
{

    private final AppEventListener mf;

    public ao(AppEventListener appeventlistener)
    {
        mf = appeventlistener;
    }

    public void onAppEvent(String s, String s1)
    {
        mf.onAppEvent(s, s1);
    }
}
