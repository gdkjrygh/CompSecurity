// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.Intent;

public class g extends Exception
{

    private final Intent a;

    public g(String s, Intent intent)
    {
        super(s);
        a = intent;
    }

    public Intent b()
    {
        return new Intent(a);
    }
}
