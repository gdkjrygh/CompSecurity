// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.tags;

import java.util.ArrayList;

public class RelatedTagsList extends ArrayList
{

    private static final long serialVersionUID = 12L;
    private String source;

    public RelatedTagsList()
    {
    }

    public String getSource()
    {
        return source;
    }

    public void setSource(String s)
    {
        source = s;
    }
}
