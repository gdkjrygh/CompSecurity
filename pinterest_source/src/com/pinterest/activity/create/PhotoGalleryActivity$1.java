// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.widget.Toast;
import com.pinterest.activity.create.adapter.GalleryGridAdapter;
import com.pinterest.activity.create.event.UnavailableCameraEvent;
import com.pinterest.activity.create.model.PhotoItem;
import com.pinterest.activity.create.model.PhotoItemFeed;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.create:
//            PhotoGalleryActivity

class this._cls0
    implements com.pinterest.base.
{

    final PhotoGalleryActivity this$0;

    public void onEventMainThread(UnavailableCameraEvent unavailablecameraevent)
    {
        Toast.makeText(PhotoGalleryActivity.this, Resources.string(0x7f0700ac), 1).show();
    }

    public void onEventMainThread(PhotoItem photoitem)
    {
        if (PhotoGalleryActivity.access$100(PhotoGalleryActivity.this).equals(PhotoGalleryActivity.access$000(PhotoGalleryActivity.this)))
        {
            PhotoGalleryActivity.access$200(PhotoGalleryActivity.this).addItem(1, photoitem);
            PhotoGalleryActivity.access$300(PhotoGalleryActivity.this).notifyDataSetChanged();
        }
    }

    Event()
    {
        this$0 = PhotoGalleryActivity.this;
        super();
    }
}
