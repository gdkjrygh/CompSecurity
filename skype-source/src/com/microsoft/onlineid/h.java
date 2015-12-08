// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid;

import android.os.Bundle;
import com.microsoft.onlineid.internal.k;

public final class h
{

    private final Bundle a;

    public h()
    {
        a = new Bundle();
    }

    public h(Bundle bundle)
    {
        k.a(bundle, "bundle");
        a = bundle;
    }

    public final Bundle a()
    {
        return a;
    }

    public final h a(String s)
    {
        a.putString("com.microsoft.onlineid.prefill_username", s);
        return this;
    }

    public final String b()
    {
        return a.getString("com.microsoft.onlineid.prefill_username");
    }
}
