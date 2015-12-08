// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import N;
import com.facebook.buck.android.support.exopackage.ExopackageApplication;

public class AppShell extends ExopackageApplication
{

    public AppShell()
    {
        super("com.snapchat.android.SnapchatApplication", 0);
    }

    protected AppShell(String s, int i)
    {
        super(s, i);
    }

    protected final void a()
    {
        super.a();
        N.a(this);
    }
}
