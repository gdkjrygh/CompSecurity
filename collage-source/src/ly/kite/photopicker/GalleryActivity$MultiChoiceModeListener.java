// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.photopicker;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;
import java.util.Collection;
import java.util.HashMap;

// Referenced classes of package ly.kite.photopicker:
//            GalleryActivity, Photo

public class this._cls0
    implements android.widget.ener
{

    final GalleryActivity this$0;

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        if (menuitem.getItemId() == this._fld0)
        {
            actionmode = new Intent();
            menuitem = new Photo[GalleryActivity.access$200(GalleryActivity.this).size()];
            GalleryActivity.access$200(GalleryActivity.this).values().toArray(menuitem);
            actionmode.putExtra("ly.kite.photopicker.EXTRA_SELECTED_PHOTOS", menuitem);
            setResult(-1, actionmode);
            finish();
        }
        return true;
    }

    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        getMenuInflater().inflate(this._fld0, menu);
        int i = GalleryActivity.access$000(GalleryActivity.this).getCheckedItemCount();
        actionmode.setTitle((new StringBuilder()).append("").append(i).toString());
        return true;
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
        GalleryActivity.access$200(GalleryActivity.this).clear();
        GalleryActivity.access$300(GalleryActivity.this).ifyDataSetChanged();
    }

    public void onItemCheckedStateChanged(ActionMode actionmode, int i, long l, boolean flag)
    {
        int j = GalleryActivity.access$000(GalleryActivity.this).getCheckedItemCount();
        actionmode.setTitle((new StringBuilder()).append("").append(j).toString());
        actionmode = (Cursor)GalleryActivity.access$300(GalleryActivity.this).Item(i);
        i = actionmode.getInt(actionmode.getColumnIndex("_id"));
        actionmode = Uri.withAppendedPath(android.provider._URI, Integer.toString(i));
        if (flag)
        {
            GalleryActivity.access$200(GalleryActivity.this).put(Integer.valueOf(i), new Photo(actionmode, i));
        } else
        {
            GalleryActivity.access$200(GalleryActivity.this).remove(Integer.valueOf(i));
        }
        GalleryActivity.access$300(GalleryActivity.this).ifyDataSetChanged();
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        return true;
    }

    public A()
    {
        this$0 = GalleryActivity.this;
        super();
    }
}
