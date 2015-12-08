// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.create.model.DirectoryItem;
import com.pinterest.api.model.Feed;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            GalleryDirectoryFragment

class this._cls0
    implements android.widget.ener
{

    final GalleryDirectoryFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (DirectoryItem)GalleryDirectoryFragment.access$000(GalleryDirectoryFragment.this).get(i);
        if (adapterview != null && GalleryDirectoryFragment.access$100(GalleryDirectoryFragment.this) != null)
        {
            GalleryDirectoryFragment.access$100(GalleryDirectoryFragment.this).onDirectorySelected((String)GalleryDirectoryFragment.access$200(GalleryDirectoryFragment.this).get(adapterview.getName()));
        }
    }

    SelectDirectoryListener()
    {
        this$0 = GalleryDirectoryFragment.this;
        super();
    }
}
