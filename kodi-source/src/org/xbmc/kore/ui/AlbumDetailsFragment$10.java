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

class this._cls0
    implements android.view.._cls10
{

    final AlbumDetailsFragment this$0;

    public void onClick(View view)
    {
        final org.xbmc.kore.utils.nfo songInfo = (org.xbmc.kore.utils.nfo)view.getTag();
        final int songId = songInfo.songId;
        view = new PopupMenu(getActivity(), view);
        view.getMenuInflater().inflate(0x7f0f0009, view.getMenu());
        view.setOnMenuItemClickListener(new android.widget.PopupMenu.OnMenuItemClickListener() {

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
                    (new android.app.AlertDialog.Builder(getActivity())).setTitle(0x7f070033).setMessage(0x7f070036).setPositiveButton(0x7f07006e, new android.content.DialogInterface.OnClickListener() {

                        final _cls1 this$2;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            FileDownloadHelper.downloadFiles(getActivity(), AlbumDetailsFragment.access$000(this$0), songInfo, 0, AlbumDetailsFragment.access$200(this$0));
                        }

            
            {
                this$2 = _cls1.this;
                super();
            }
                    }).setNeutralButton(0x7f070038, new android.content.DialogInterface.OnClickListener() {

                        final _cls1 this$2;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            FileDownloadHelper.downloadFiles(getActivity(), AlbumDetailsFragment.access$000(this$0), songInfo, 1, AlbumDetailsFragment.access$200(this$0));
                        }

            
            {
                this$2 = _cls1.this;
                super();
            }
                    }).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

                        final _cls1 this$2;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                        }

            
            {
                this$2 = _cls1.this;
                super();
            }
                    }).show();
                    return true;
                } else
                {
                    FileDownloadHelper.downloadFiles(getActivity(), AlbumDetailsFragment.access$000(this$0), songInfo, 1, AlbumDetailsFragment.access$200(this$0));
                    return true;
                }
            }

            
            {
                this$1 = AlbumDetailsFragment._cls10.this;
                songId = i;
                songInfo = songinfo;
                super();
            }
        });
        view.show();
    }

    _cls1.val.songInfo()
    {
        this$0 = AlbumDetailsFragment.this;
        super();
    }
}
