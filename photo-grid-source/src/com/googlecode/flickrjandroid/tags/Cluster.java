// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.tags;

import java.util.ArrayList;

// Referenced classes of package com.googlecode.flickrjandroid.tags:
//            Tag

public class Cluster
{

    private static final long serialVersionUID = 12L;
    private ArrayList tags;

    public Cluster()
    {
        tags = new ArrayList();
    }

    public void addTag(Tag tag)
    {
        tags.add(tag);
    }

    public ArrayList getTags()
    {
        return tags;
    }

    public void setTags(ArrayList arraylist)
    {
        tags = arraylist;
    }
}
