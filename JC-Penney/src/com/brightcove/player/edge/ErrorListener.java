// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.edge;

import android.util.Log;

public abstract class ErrorListener
{

    private final String a = getClass().getSimpleName();

    public ErrorListener()
    {
    }

    public void onError(String s)
    {
        Log.e(a, s);
    }
}
