// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.photopicker;

import android.content.Intent;
import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package ly.kite.photopicker:
//            DeviceFolderActivity, GalleryActivity

class this._cls0
    implements android.widget.Listener
{

    final DeviceFolderActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        view = (Cursor)DeviceFolderActivity.access$000(DeviceFolderActivity.this).getItem(i);
        adapterview = view.getString(view.getColumnIndexOrThrow("bucket_id"));
        view = view.getString(view.getColumnIndexOrThrow("bucket_display_name"));
        Intent intent = new Intent(DeviceFolderActivity.this, ly/kite/photopicker/GalleryActivity);
        intent.putExtra("ly.kite.photopicker.EXTRA_MEDIA_BUCKET_ID", adapterview);
        intent.putExtra("ly.kite.photopicker.EXTRA_MEDIA_BUCKET_NAME", view);
        startActivityForResult(intent, 99);
    }

    lderCursorAdapter()
    {
        this$0 = DeviceFolderActivity.this;
        super();
    }
}
