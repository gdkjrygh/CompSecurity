// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package org.xbmc.kore.ui:
//            AlbumDetailsFragment

class val.iconCollapseResId
    implements android.view.t._cls7
{

    final AlbumDetailsFragment this$0;
    final int val$iconCollapseResId;
    final int val$iconExpandResId;
    final int val$maxLines;

    public void onClick(View view)
    {
        boolean flag;
        if (!AlbumDetailsFragment.access$300(AlbumDetailsFragment.this))
        {
            mediaDescription.setMaxLines(0x7fffffff);
            mediaShowAll.setImageResource(val$iconExpandResId);
        } else
        {
            mediaDescription.setMaxLines(val$maxLines);
            mediaShowAll.setImageResource(val$iconCollapseResId);
        }
        view = AlbumDetailsFragment.this;
        if (!AlbumDetailsFragment.access$300(AlbumDetailsFragment.this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        AlbumDetailsFragment.access$302(view, flag);
    }

    ()
    {
        this$0 = final_albumdetailsfragment;
        val$iconExpandResId = i;
        val$maxLines = j;
        val$iconCollapseResId = I.this;
        super();
    }
}
