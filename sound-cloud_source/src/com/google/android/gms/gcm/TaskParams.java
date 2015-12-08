// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Bundle;

public class TaskParams
{

    private final Bundle extras;
    private final String tag;

    public TaskParams(String s)
    {
        this(s, null);
    }

    public TaskParams(String s, Bundle bundle)
    {
        tag = s;
        extras = bundle;
    }

    public Bundle getExtras()
    {
        return extras;
    }

    public String getTag()
    {
        return tag;
    }
}
