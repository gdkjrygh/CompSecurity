// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import android.view.View;
import android.widget.Button;
import com.pinterest.ui.grid.board.BoardGridCellTitleUserView;
import com.pinterest.ui.imageview.ProportionalImageView;

// Referenced classes of package com.pinterest.activity.dynamicgrid:
//            BoardStoryCell

public class _cls2
{

    public static void inject(butterknife.toryCell torycell, final BoardStoryCell target, Object obj)
    {
        target._image0 = (ProportionalImageView)torycell.ageView(obj, 0x7f0f01ae, "field '_image0'");
        target._image1 = (ProportionalImageView)torycell.ageView(obj, 0x7f0f01af, "field '_image1'");
        target._image2 = (ProportionalImageView)torycell.ageView(obj, 0x7f0f01b0, "field '_image2'");
        target._image3 = (ProportionalImageView)torycell.ageView(obj, 0x7f0f01b1, "field '_image3'");
        target._userLine = (BoardGridCellTitleUserView)torycell.TitleUserView(obj, 0x7f0f01b2, "field '_userLine'");
        View view = torycell.TitleUserView(obj, 0x7f0f01b3, "field '_followBt' and method 'onFollowClick'");
        target._followBt = (Button)view;
        class _cls1 extends DebouncingOnClickListener
        {

            final BoardStoryCell val$target;

            public final void doClick(View view1)
            {
                target.onFollowClick(view1);
            }

            _cls1()
            {
                target = boardstorycell;
                super();
            }
        }

        view.setOnClickListener(new _cls1());
        class _cls2 extends DebouncingOnClickListener
        {

            final BoardStoryCell val$target;

            public final void doClick(View view1)
            {
                target.onBoardCoverClicked(view1);
            }

            _cls2()
            {
                target = boardstorycell;
                super();
            }
        }

        torycell.toryCell(obj, 0x7f0f01ad, "method 'onBoardCoverClicked'").setOnClickListener(new _cls2());
    }

    public static void reset(BoardStoryCell boardstorycell)
    {
        boardstorycell._image0 = null;
        boardstorycell._image1 = null;
        boardstorycell._image2 = null;
        boardstorycell._image3 = null;
        boardstorycell._userLine = null;
        boardstorycell._followBt = null;
    }

    public _cls2()
    {
    }
}
