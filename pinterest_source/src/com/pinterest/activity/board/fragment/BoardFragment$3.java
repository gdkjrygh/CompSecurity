// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.graphics.Point;
import android.view.View;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.pinterest.activity.board.view.BoardHeaderView;
import com.pinterest.activity.board.view.PlaceBoardLayout;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BoardFragment, BoardMapFragment

class this._cls0
    implements com.pinterest.fragment.ener
{

    final BoardFragment this$0;

    public void onReady()
    {
        if (BoardFragment.access$100(BoardFragment.this) != null && BoardFragment.access$100(BoardFragment.this).getMap() != null && BoardFragment.access$1100(BoardFragment.this) != null && (_header != null || _libHeader != null))
        {
            if (!_useLibraryStyle)
            {
                Object obj = new Point(BoardFragment.access$1100(BoardFragment.this).getWidth() / 2, BoardFragment.access$1100(BoardFragment.this).getHeight() / 2);
                obj = BoardFragment.access$100(BoardFragment.this).getMap().getProjection().fromScreenLocation(((Point) (obj)));
                _header.setLatLng(((com.google.android.gms.maps.model.LatLng) (obj)));
            }
            if (BoardFragment.access$1200(BoardFragment.this) == com.pinterest.kit.view.State.a)
            {
                BoardFragment.access$1300(BoardFragment.this).switchMapState(true);
            }
            if (BoardFragment.access$1400(BoardFragment.this) != null)
            {
                BoardFragment.access$100(BoardFragment.this).setInitCenter(BoardFragment.access$1400(BoardFragment.this));
                return;
            }
        }
    }

    ()
    {
        this$0 = BoardFragment.this;
        super();
    }
}
