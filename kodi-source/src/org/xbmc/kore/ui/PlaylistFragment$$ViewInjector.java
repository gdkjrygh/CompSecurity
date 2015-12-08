// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package org.xbmc.kore.ui:
//            PlaylistFragment

public class 
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (PlaylistFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, PlaylistFragment playlistfragment, Object obj)
    {
        playlistfragment.infoPanel = (RelativeLayout)ctor.((View)ctor.View(obj, 0x7f0e00b3, "field 'infoPanel'"), 0x7f0e00b3, "field 'infoPanel'");
        playlistfragment.playlistGridView = (GridView)ctor.ridView((View)ctor.View(obj, 0x7f0e00a3, "field 'playlistGridView'"), 0x7f0e00a3, "field 'playlistGridView'");
        playlistfragment.infoTitle = (TextView)ctor.((View)ctor.View(obj, 0x7f0e00b4, "field 'infoTitle'"), 0x7f0e00b4, "field 'infoTitle'");
        playlistfragment.infoMessage = (TextView)ctor.ge((View)ctor.View(obj, 0x7f0e00b5, "field 'infoMessage'"), 0x7f0e00b5, "field 'infoMessage'");
    }

    public volatile void reset(Object obj)
    {
        reset((PlaylistFragment)obj);
    }

    public void reset(PlaylistFragment playlistfragment)
    {
        playlistfragment.infoPanel = null;
        playlistfragment.playlistGridView = null;
        playlistfragment.infoTitle = null;
        playlistfragment.infoMessage = null;
    }

    public ()
    {
    }
}
