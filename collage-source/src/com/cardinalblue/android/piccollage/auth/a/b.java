// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.auth.a;

import android.content.Context;
import android.support.v4.app.Fragment;
import java.util.List;

public abstract class b
{

    private final String a;

    public b(String s)
    {
        a = s;
    }

    public abstract void a();

    public abstract void a(Fragment fragment, int i, String s);

    public abstract boolean a(Context context);

    public abstract List b();

    public String c()
    {
        return a;
    }
}
