// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util.debug;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.support.v4.content.FileProvider;
import com.google.android.apps.gsa.shared.util.debug.b.b;

public class DebugFileProvider extends FileProvider
{

    public DebugFileProvider()
    {
    }

    public void attachInfo(Context context, ProviderInfo providerinfo)
    {
        b.b();
        super.attachInfo(context, providerinfo);
        b.c();
        return;
        context;
        b.c();
        throw context;
    }
}
