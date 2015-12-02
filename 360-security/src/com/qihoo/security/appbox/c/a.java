// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.c;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.i;
import com.android.volley.toolbox.e;
import com.android.volley.toolbox.h;

public class a extends com.android.volley.toolbox.a
{

    public a(e e)
    {
        super(e);
    }

    private i a(h h1)
        throws VolleyError
    {
        String s = h1.d();
        if (s.startsWith("Package://") || s.startsWith("ApkPath://"))
        {
            return new i(null);
        } else
        {
            return super.a(h1);
        }
    }

    public i a(Request request)
        throws VolleyError
    {
        if (request instanceof h)
        {
            return a((h)request);
        } else
        {
            return super.a(request);
        }
    }
}
