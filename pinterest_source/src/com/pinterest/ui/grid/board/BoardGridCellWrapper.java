// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.board;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

// Referenced classes of package com.pinterest.ui.grid.board:
//            BoardGridCell

public class BoardGridCellWrapper extends LinearLayout
{

    public BoardGridCell cell1;
    public BoardGridCell cell2;
    public View dismissBt;
    public ViewFlipper flipper;
    protected android.view.View.OnClickListener onBoardClicked;

    public BoardGridCellWrapper(Context context)
    {
        this(context, null);
    }

    public BoardGridCellWrapper(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onBoardClicked = new _cls1();
        init();
    }

    protected void init()
    {
        inflate(getContext(), 0x7f030142, this);
        setOrientation(1);
        flipper = (ViewFlipper)findViewById(0x7f0f0332);
        cell1 = (BoardGridCell)findViewById(0x7f0f0333);
        cell1.setOnClickListener(onBoardClicked);
        cell2 = (BoardGridCell)findViewById(0x7f0f0334);
        cell2.setOnClickListener(onBoardClicked);
        dismissBt = findViewById(0x7f0f0335);
        flipper.setInAnimation(getContext(), 0x7f04001d);
        flipper.setOutAnimation(getContext(), 0x7f040022);
        flipper.setAnimateFirstView(true);
        cell1._followTv.setTag(flipper);
        cell2._followTv.setTag(flipper);
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final BoardGridCellWrapper this$0;

        public void onClick(View view)
        {
            Object obj = (BoardGridCell)view;
            if (((BoardGridCell) (obj)).getBoard() == null)
            {
                return;
            } else
            {
                String s = ((BoardGridCell) (obj)).getBoard().getUid();
                Pinalytics.a(ElementType.BOARD_COVER, ComponentType.FLOWED_BOARD, s);
                obj = new Navigation(Location.BOARD, ((BoardGridCell) (obj)).getBoard());
                obj = ActivityHelper.getTaskIntent(view.getContext(), ((Navigation) (obj)));
                view.getContext().startActivity(((android.content.Intent) (obj)));
                return;
            }
        }

        _cls1()
        {
            this$0 = BoardGridCellWrapper.this;
            super();
        }
    }

}
