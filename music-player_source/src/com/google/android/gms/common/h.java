// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.Intent;

public class h extends Exception
{

    private final Intent a;

    public h(String s, Intent intent)
    {
        super(s);
        a = intent;
    }
}
