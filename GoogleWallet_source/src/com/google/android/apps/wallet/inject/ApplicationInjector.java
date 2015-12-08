// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.inject;

import android.content.Context;
import com.google.android.apps.common.inject.InjectedApplication;

public final class ApplicationInjector
{

    public static void inject(Object obj, Context context)
    {
        ((InjectedApplication)context.getApplicationContext()).inject(obj);
    }
}
