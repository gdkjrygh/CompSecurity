// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.text.method.DigitsKeyListener;

public class a extends DigitsKeyListener
{

    public a()
    {
        super(false, false);
    }

    public a(boolean flag, boolean flag1)
    {
        super(flag, flag1);
    }

    public int getInputType()
    {
        return 3;
    }
}
