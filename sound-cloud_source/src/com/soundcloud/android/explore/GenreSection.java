// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import java.util.List;

class GenreSection
{

    private final List items;
    private final int sectionId;
    private final int titleId;

    public GenreSection(int i, int j, List list)
    {
        sectionId = i;
        titleId = j;
        items = list;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (GenreSection)obj;
            if (sectionId != ((GenreSection) (obj)).sectionId)
            {
                return false;
            }
            if (!items.equals(((GenreSection) (obj)).items))
            {
                return false;
            }
        }
        return true;
    }

    public List getItems()
    {
        return items;
    }

    public int getSectionId()
    {
        return sectionId;
    }

    public int getSize()
    {
        return items.size();
    }

    public int getTitleId()
    {
        return titleId;
    }

    public int hashCode()
    {
        return sectionId * 31 + items.hashCode();
    }
}
