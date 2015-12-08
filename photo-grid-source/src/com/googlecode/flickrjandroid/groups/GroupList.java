// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.groups;

import com.googlecode.flickrjandroid.SearchResultList;

// Referenced classes of package com.googlecode.flickrjandroid.groups:
//            Group

public class GroupList extends SearchResultList
{

    private static final long serialVersionUID = 0x2e6baf6e4c5ebcefL;

    public GroupList()
    {
    }

    public boolean add(Group group)
    {
        return super.add(group);
    }

    public volatile boolean add(Object obj)
    {
        return add((Group)obj);
    }

    public Group[] getGroupsArray()
    {
        return (Group[])toArray(new Group[size()]);
    }
}
