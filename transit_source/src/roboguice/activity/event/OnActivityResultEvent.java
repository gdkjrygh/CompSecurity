// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.activity.event;

import android.content.Intent;

public class OnActivityResultEvent
{

    protected Intent data;
    protected int requestCode;
    protected int resultCode;

    public OnActivityResultEvent(int i, int j, Intent intent)
    {
        requestCode = i;
        resultCode = j;
        data = intent;
    }

    public Intent getData()
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
