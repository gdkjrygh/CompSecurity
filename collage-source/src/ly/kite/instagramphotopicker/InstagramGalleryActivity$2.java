// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.instagramphotopicker;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package ly.kite.instagramphotopicker:
//            InstagramGalleryActivity, PagingGridView

class this._cls0
    implements android.widget.ener
{

    final InstagramGalleryActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        boolean flag = InstagramGalleryActivity.access$000(InstagramGalleryActivity.this).isItemChecked(i);
        adapterview = InstagramGalleryActivity.access$000(InstagramGalleryActivity.this);
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        adapterview.setItemChecked(i, flag);
    }

    ()
    {
        this$0 = InstagramGalleryActivity.this;
        super();
    }
}
