// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.DialogInterface;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import java.io.File;
import org.xbmc.kore.utils.FileDownloadHelper;

// Referenced classes of package org.xbmc.kore.ui:
//            AlbumDetailsFragment

class Info
    implements android.widget.istener
{

    final is._cls0 this$1;
    final int val$songId;
    final org.xbmc.kore.utils.o val$songInfo;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131624179: 
            AlbumDetailsFragment.access$600(_fld0, val$songId);
            return true;

        case 2131624180: 
            AlbumDetailsFragment.access$800(_fld0, AlbumDetailsFragment.access$700(_fld0), val$songId);
            return true;

        case 2131624062: 
            break;
        }
        if ((new File(val$songInfo.getAbsoluteFilePath())).exists())
        {
            (new android.app.(getActivity())).le(0x7f070033).sage(0x7f070036).itiveButton(0x7f07006e, new android.content.DialogInterface.OnClickListener() {

                final AlbumDetailsFragment._cls10._cls1 this$2;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    FileDownloadHelper.downloadFiles(getActivity(), AlbumDetailsFragment.access$000(this$0), songInfo, 0, AlbumDetailsFragment.access$200(this$0));
                }

            
            {
                this$2 = AlbumDetailsFragment._cls10._cls1.this;
                super();
            }
            }).tralButton(0x7f070038, new android.content.DialogInterface.OnClickListener() {

                final AlbumDetailsFragment._cls10._cls1 this$2;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    FileDownloadHelper.downloadFiles(getActivity(), AlbumDetailsFragment.access$000(this$0), songInfo, 1, AlbumDetailsFragment.access$200(this$0));
                }

            
            {
                this$2 = AlbumDetailsFragment._cls10._cls1.this;
                super();
            }
            }).ativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

                final AlbumDetailsFragment._cls10._cls1 this$2;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                }

            
            {
                this$2 = AlbumDetailsFragment._cls10._cls1.this;
                super();
            }
            })._mth1();
            return true;
        } else
        {
            FileDownloadHelper.downloadFiles(getActivity(), AlbumDetailsFragment.access$000(_fld0), val$songInfo, 1, AlbumDetailsFragment.access$200(_fld0));
            return true;
        }
    }

    Info()
    {
        this$1 = final_info;
        val$songId = i;
        val$songInfo = org.xbmc.kore.utils.o.this;
        super();
    }

    // Unreferenced inner class org/xbmc/kore/ui/AlbumDetailsFragment$10

/* anonymous class */
    class AlbumDetailsFragment._cls10
        implements android.view.View.OnClickListener
    {

        final AlbumDetailsFragment this$0;

        public void onClick(View view)
        {
            org.xbmc.kore.utils.FileDownloadHelper.SongInfo songinfo = (org.xbmc.kore.utils.FileDownloadHelper.SongInfo)view.getTag();
            final int songId = songinfo.songId;
            view = new PopupMenu(getActivity(), view);
            view.getMenuInflater().inflate(0x7f0f0009, view.getMenu());
            view.setOnMenuItemClickListener(songinfo. new AlbumDetailsFragment._cls10._cls1());
            view.show();
        }

            
            {
                this$0 = AlbumDetailsFragment.this;
                super();
            }
    }

}
