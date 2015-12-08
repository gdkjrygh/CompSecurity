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

class this._cls1
    implements android.view.r._cls1
{

    final _cls1.val.loc this$1;

    public void onClick(View view)
    {
        final int position = ((Integer)view.getTag()).intValue();
        if (leLocationItems != null)
        {
            final this._cls1 loc = (leLocationItems)leLocationItems.get(position);
            if (!loc.y)
            {
                view = new PopupMenu(getActivity(), view);
                view.getMenuInflater().inflate(0x7f0f0000, view.getMenu());
                view.setOnMenuItemClickListener(new android.widget.PopupMenu.OnMenuItemClickListener() {

                    final MediaFileListFragment.MediaFileListAdapter._cls1 this$2;
                    final MediaFileListFragment.FileLocation val$loc;
                    final int val$position;

                    public boolean onMenuItemClick(MenuItem menuitem)
                    {
                        switch (menuitem.getItemId())
                        {
                        default:
                            return false;

                        case 2131624154: 
                            MediaFileListFragment.access$200(this$0, loc.file);
                            return true;

                        case 2131624155: 
                            MediaFileListFragment.access$500(this$0, loc.file);
                            return true;

                        case 2131624156: 
                            mediaQueueFileLocation.clear();
                            break;
                        }
                        for (int i = position + 1; i < fileLocationItems.size(); i++)
                        {
                            menuitem = (MediaFileListFragment.FileLocation)fileLocationItems.get(i);
                            if (!((MediaFileListFragment.FileLocation) (menuitem)).isDirectory)
                            {
                                mediaQueueFileLocation.add(menuitem);
                            }
                        }

                        mediaQueueFileLocation.add(loc);
                        MediaFileListFragment.access$500(this$0, loc.file);
                        return true;
                    }

            
            {
                this$2 = MediaFileListFragment.MediaFileListAdapter._cls1.this;
                loc = filelocation;
                position = i;
                super();
            }
                });
                view.show();
            }
        }
    }

    _cls1.val.position()
    {
        this$1 = this._cls1.this;
        super();
    }
}
