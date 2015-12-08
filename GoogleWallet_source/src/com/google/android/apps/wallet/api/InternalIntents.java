// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.api;

import android.content.Context;
import android.content.Intent;

public final class InternalIntents
{

    public static Intent forAction(Context context, String s)
    {
        return (new Intent(s)).setPackage(context.getPackageName());
    }

    public static Intent forClass(Context context, Class class1)
    {
        return new Intent(context, class1);
    }

    public static Intent forClass(Context context, String s)
    {
        return (new Intent()).setClassName(context, s);
    }
}
