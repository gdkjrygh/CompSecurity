// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.broadcast;

import android.content.Context;
import android.content.Intent;
import android.support.v4.a.e;

public class a
{

    protected final Context a;

    public a(Context context)
    {
        a = context;
    }

    public void a(Intent intent)
    {
        e.a(a).a(intent);
    }

    public void a(String s)
    {
        Intent intent = new Intent();
        intent.setAction(s);
        a(intent);
    }
}
