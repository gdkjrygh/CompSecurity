// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.velour;

import android.content.Context;
import android.content.ContextWrapper;

public final class a extends ContextWrapper
{

    ClassLoader a;

    public a(Context context)
    {
        super(context);
    }

    public final ClassLoader getClassLoader()
    {
        if (a == null)
        {
            return super.getClassLoader();
        } else
        {
            return a;
        }
    }
}
