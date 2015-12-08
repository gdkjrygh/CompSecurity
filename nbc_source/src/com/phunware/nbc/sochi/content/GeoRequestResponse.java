// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.content;

import android.text.TextUtils;

public class GeoRequestResponse
{

    public String NielsonDMA;
    public String RawJSON;
    public String ZipCode;
    public boolean isError;

    public GeoRequestResponse(String s)
    {
        isError = false;
        if (s == null || TextUtils.isEmpty(s))
        {
            isError = true;
            return;
        } else
        {
            RawJSON = s;
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("GeoRequestResponse(RawJSON=").append(RawJSON).append(")").toString();
    }
}
