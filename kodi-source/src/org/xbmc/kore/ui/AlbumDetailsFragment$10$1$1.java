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

class this._cls2
    implements android.content.ner
{

    final er this$2;

    public void onClick(DialogInterface dialoginterface, int i)
    {
    }

    ._cls0()
    {
        this$2 = this._cls2.this;
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


    // Unreferenced inner class org/xbmc/kore/ui/AlbumDetailsFragment$10$1

/* anonymous class */
    class AlbumDetailsFragment._cls10._cls1
        implements android.widget.PopupMenu.OnMenuItemClickListener
    {

        final AlbumDetailsFragment._cls10 this$1;
        final int val$songId;
        final org.xbmc.kore.utils.FileDownloadHelper.SongInfo val$songInfo;

        public boolean onMenuItemClick(MenuItem menuitem)
        {
            switch (menuitem.getItemId())
            {
            default:
                return false;

            case 2131624179: 
                AlbumDetailsFragment.access$600(this$0, songId);
                return true;

            case 2131624180: 
                AlbumDetailsFragment.access$800(this$0, AlbumDetailsFragment.access$700(this$0), songId);
                return true;

            case 2131624062: 
                break;
            }
            if ((new File(songInfo.getAbsoluteFilePath())).exists())
            {
                (new android.app.AlertDialog.Builder(getActivity())).setTitle(0x7f070033).setMessage(0x7f070036).setPositiveButton(0x7f07006e, new AlbumDetailsFragment._cls10._cls1._cls3()).setNeutralButton(0x7f070038, new AlbumDetailsFragment._cls10._cls1._cls2()).setNegativeButton(0x1040000, new AlbumDetailsFragment._cls10._cls1._cls1()).show();
                return true;
            } else
            {
                FileDownloadHelper.downloadFiles(getActivity(), AlbumDetailsFragment.access$000(this$0), songInfo, 1, AlbumDetailsFragment.access$200(this$0));
                return true;
            }
        }

            
            {
                this$1 = final__pcls10;
                songId = i;
                songInfo = org.xbmc.kore.utils.FileDownloadHelper.SongInfo.this;
                super();
            }

        // Unreferenced inner class org/xbmc/kore/ui/AlbumDetailsFragment$10$1$2

/* anonymous class */
        class AlbumDetailsFragment._cls10._cls1._cls2
            implements android.content.DialogInterface.OnClickListener
        {

            final AlbumDetailsFragment._cls10._cls1 this$2;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                FileDownloadHelper.downloadFiles(getActivity(), AlbumDetailsFragment.access$000(this$0), songInfo, 1, AlbumDetailsFragment.access$200(this$0));
            }

                    
                    {
                        this$2 = AlbumDetailsFragment._cls10._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class org/xbmc/kore/ui/AlbumDetailsFragment$10$1$3

/* anonymous class */
        class AlbumDetailsFragment._cls10._cls1._cls3
            implements android.content.DialogInterface.OnClickListener
        {

            final AlbumDetailsFragment._cls10._cls1 this$2;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                FileDownloadHelper.downloadFiles(getActivity(), AlbumDetailsFragment.access$000(this$0), songInfo, 0, AlbumDetailsFragment.access$200(this$0));
            }

                    
                    {
                        this$2 = AlbumDetailsFragment._cls10._cls1.this;
                        super();
                    }
        }

    }

}
