// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.photopicker;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

// Referenced classes of package ly.kite.photopicker:
//            GalleryActivity

class this._cls0
    implements android.widget.ClickListener
{

    final GalleryActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        boolean flag = GalleryActivity.access$000(GalleryActivity.this).isItemChecked(i);
        adapterview = GalleryActivity.access$000(GalleryActivity.this);
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        adapterview.setItemChecked(i, flag);
    }

    Listener()
    {
        this$0 = GalleryActivity.this;
        super();
    }
}
