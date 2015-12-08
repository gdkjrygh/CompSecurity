// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class AdSettingsOp
    implements JacksonModel
{

    public String mOp;
    public String mPath;
    public String mValue;

    public AdSettingsOp(String s, String s1, String s2)
    {
        mOp = s;
        mPath = s1;
        mValue = s2;
    }
}
