// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import android.graphics.Bitmap;
import com.android.volley.VolleyError;

public class ImageApiResponseHandler
    implements com.android.volley.Response.ErrorListener, com.android.volley.Response.Listener
{

    protected String a;
    protected String b;

    public ImageApiResponseHandler()
    {
        b = "GET";
    }

    public void a(Bitmap bitmap)
    {
    }

    public final void a(String s)
    {
        a = s;
    }

    public final void b(String s)
    {
        b = s;
    }

    public void onErrorResponse(VolleyError volleyerror)
    {
    }

    public void onResponse(Object obj)
    {
        a((Bitmap)obj);
    }
}
