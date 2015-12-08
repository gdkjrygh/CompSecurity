// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.sso.bakery;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class Cookie
    implements JacksonModel
{

    public String domain;
    public int maxAge;
    public String name;
    public String path;
    public boolean secure;
    public String value;

    public Cookie()
    {
    }
}
