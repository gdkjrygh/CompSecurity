// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import com.pinterest.activity.create.model.PhotoItem;
import com.pinterest.activity.create.model.PhotoItemFeed;

// Referenced classes of package com.pinterest.activity.create:
//            PhotoGalleryActivity, CameraActivity

class this._cls0
    implements android.widget.Listener
{

    final PhotoGalleryActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        _gridView.setEnabled(false);
        if (i == 0)
        {
            adapterview = new Intent(PhotoGalleryActivity.this, com/pinterest/activity/create/CameraActivity);
            startActivity(adapterview);
        } else
        {
            adapterview = (PhotoItem)PhotoGalleryActivity.access$200(PhotoGalleryActivity.this).get(i);
            if (adapterview != null)
            {
                onPhotoClicked(adapterview.getUri());
                return;
            }
        }
    }

    ()
    {
        this$0 = PhotoGalleryActivity.this;
        super();
    }
}
