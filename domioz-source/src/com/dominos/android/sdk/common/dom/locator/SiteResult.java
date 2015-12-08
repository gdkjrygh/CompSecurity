// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.locator;

import java.util.ArrayList;

public class SiteResult
{

    private ArrayList sites;
    private int status;

    public SiteResult(int i)
    {
        sites = new ArrayList();
        status = i;
    }

    public ArrayList getSites()
    {
        return sites;
    }

    public int getStatus()
    {
        return status;
    }
}
