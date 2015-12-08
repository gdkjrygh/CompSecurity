// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import java.util.ArrayList;
import java.util.List;

public class FbFriendRequest
{
    public static class Paging
    {

        public String nextUrl;

        public Paging()
        {
        }
    }


    private List frineds;
    private Paging paging;

    public FbFriendRequest()
    {
        frineds = new ArrayList();
    }

    public List getFrineds()
    {
        return frineds;
    }

    public String getNextUrl()
    {
        if (paging == null)
        {
            return null;
        } else
        {
            return paging.nextUrl;
        }
    }
}
