// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.instagramphotopicker;

import android.content.Intent;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashSet;

// Referenced classes of package ly.kite.instagramphotopicker:
//            InstagramGalleryActivity, InstagramPhoto, PagingGridView

public class this._cls0
    implements android.widget.eModeListener
{

    final InstagramGalleryActivity this$0;

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        if (menuitem.getItemId() == this._fld0)
        {
            actionmode = new Intent();
            menuitem = new InstagramPhoto[InstagramGalleryActivity.access$500(InstagramGalleryActivity.this).size()];
            InstagramGalleryActivity.access$500(InstagramGalleryActivity.this).toArray(menuitem);
            actionmode.putExtra("ly.kite.instagramphotopicker.EXTRA_SELECTED_PHOTOS", menuitem);
            setResult(-1, actionmode);
            finish();
        }
        return true;
    }

    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        getMenuInflater().inflate(this._fld0, menu);
        int i = InstagramGalleryActivity.access$000(InstagramGalleryActivity.this).getCheckedItemCount();
        actionmode.setTitle((new StringBuilder()).append("").append(i).toString());
        return true;
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
    }

    public void onItemCheckedStateChanged(ActionMode actionmode, int i, long l, boolean flag)
    {
        int j = InstagramGalleryActivity.access$000(InstagramGalleryActivity.this).getCheckedItemCount();
        actionmode.setTitle((new StringBuilder()).append("").append(j).toString());
        actionmode = (this._cls0)InstagramGalleryActivity.access$000(InstagramGalleryActivity.this).getOriginalAdapter();
        actionmode.tifyDataSetChanged();
        actionmode = actionmode.tItem(i);
        if (flag)
        {
            InstagramGalleryActivity.access$500(InstagramGalleryActivity.this).add(actionmode);
            return;
        } else
        {
            InstagramGalleryActivity.access$500(InstagramGalleryActivity.this).remove(actionmode);
            return;
        }
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        return true;
    }

    public ()
    {
        this$0 = InstagramGalleryActivity.this;
        super();
    }
}
