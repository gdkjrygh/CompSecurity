// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.os.Bundle;

public final class TabSpec
{

    public Bundle args;
    public Class fragmentClass;
    public int titleResId;

    public TabSpec(Class class1, int i, Bundle bundle)
    {
        fragmentClass = class1;
        titleResId = i;
        args = bundle;
    }
}
