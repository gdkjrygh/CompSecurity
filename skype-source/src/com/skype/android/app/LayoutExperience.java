// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.content.Context;
import android.content.res.Resources;

public class LayoutExperience
{

    final boolean multipane;

    public LayoutExperience(Context context)
    {
        this(context.getResources().getBoolean(0x7f0d0003));
    }

    LayoutExperience(boolean flag)
    {
        multipane = flag;
    }

    public boolean isMultipane()
    {
        return multipane;
    }
}
