// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.activity;

import android.content.Intent;

public final class ActivityResult
{

    private Intent data;
    private int requestCode;
    private int resultCode;

    private ActivityResult(int i, int j, Intent intent)
    {
        requestCode = i;
        resultCode = j;
        data = intent;
    }

    public static ActivityResult create(int i, int j, Intent intent)
    {
        return new ActivityResult(i, j, intent);
    }

    public Intent getIntent()
    {
        return data;
    }

    public int getRequestCode()
    {
        return requestCode;
    }

    public int getResultCode()
    {
        return resultCode;
    }
}
