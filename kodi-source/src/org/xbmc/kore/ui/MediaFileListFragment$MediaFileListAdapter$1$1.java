// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import java.util.List;
import java.util.Queue;

// Referenced classes of package org.xbmc.kore.ui:
//            MediaFileListFragment

class val.position
    implements android.widget._cls1
{

    final val.loc this$2;
    final val.loc val$loc;
    final int val$position;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131624154: 
            MediaFileListFragment.access$200(_fld0, val$loc.loc);
            return true;

        case 2131624155: 
            MediaFileListFragment.access$500(_fld0, val$loc.loc);
            return true;

        case 2131624156: 
            mediaQueueFileLocation.clear();
            break;
        }
        for (int i = val$position + 1; i < LocationItems.size(); i++)
        {
            menuitem = (LocationItems)LocationItems.get(i);
            if (!((LocationItems) (menuitem)).LocationItems)
            {
                mediaQueueFileLocation.add(menuitem);
            }
        }

        mediaQueueFileLocation.add(val$loc);
        MediaFileListFragment.access$500(_fld0, val$loc.loc);
        return true;
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$loc = _pcls1_1;
        val$position = I.this;
        super();
    }

    // Unreferenced inner class org/xbmc/kore/ui/MediaFileListFragment$MediaFileListAdapter$1

/* anonymous class */
    class MediaFileListFragment.MediaFileListAdapter._cls1
        implements android.view.View.OnClickListener
    {

        final MediaFileListFragment.MediaFileListAdapter this$1;

        public void onClick(View view)
        {
            int i = ((Integer)view.getTag()).intValue();
            if (fileLocationItems != null)
            {
                final MediaFileListFragment.FileLocation loc = (MediaFileListFragment.FileLocation)fileLocationItems.get(i);
                if (!loc.isDirectory)
                {
                    view = new PopupMenu(getActivity(), view);
                    view.getMenuInflater().inflate(0x7f0f0000, view.getMenu());
                    view.setOnMenuItemClickListener(i. new MediaFileListFragment.MediaFileListAdapter._cls1._cls1());
                    view.show();
                }
            }
        }

            
            {
                this$1 = MediaFileListFragment.MediaFileListAdapter.this;
                super();
            }
    }

}
