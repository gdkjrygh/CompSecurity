// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import com.pinterest.activity.create.model.DirectoryItem;
import java.util.Comparator;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            GalleryDirectoryFragment

class this._cls0
    implements Comparator
{

    final GalleryDirectoryFragment this$0;

    public int compare(DirectoryItem directoryitem, DirectoryItem directoryitem1)
    {
        if (directoryitem.getName().equals("Pinterest"))
        {
            return -1;
        }
        if (directoryitem1.getName().equals("Pinterest"))
        {
            return 1;
        } else
        {
            return directoryitem.getName().compareToIgnoreCase(directoryitem1.getName());
        }
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((DirectoryItem)obj, (DirectoryItem)obj1);
    }

    ()
    {
        this$0 = GalleryDirectoryFragment.this;
        super();
    }
}
