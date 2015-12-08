// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import com.android.volley.VolleyError;

public final class VolleyInterruptedError extends VolleyError
{

    public VolleyInterruptedError()
    {
        super("Thread interrupted");
    }
}
