// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.volley;

import com.android.volley.VolleyError;

public abstract class DisplayMessageError extends VolleyError
{

    String mDisplayErrorHtml;

    public DisplayMessageError(String s)
    {
        mDisplayErrorHtml = s;
    }

    public String toString()
    {
        return (new StringBuilder("DisplayErrorMessage[")).append(mDisplayErrorHtml).append("]").toString();
    }
}
