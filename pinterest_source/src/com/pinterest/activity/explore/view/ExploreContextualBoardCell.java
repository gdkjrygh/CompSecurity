// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.dynamicgrid.BoardStoryCell;
import com.pinterest.activity.explore.util.ExploreStoryCell;
import com.pinterest.analytics.ImpressionView;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.base.Constants;
import com.pinterest.schemas.event.BoardImpression;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;
import java.util.HashMap;
import java.util.List;

public class ExploreContextualBoardCell extends BoardStoryCell
    implements ExploreStoryCell, ImpressionView
{

    private BoardImpression _impression;
    private long _impressionStart;
    private int _slotPosition;
    private String _storyId;
    private int _storyPosition;

    public ExploreContextualBoardCell(Context context)
    {
        super(context);
    }

    public ExploreContextualBoardCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ExploreContextualBoardCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static ExploreContextualBoardCell get(View view, ViewGroup viewgroup)
    {
        if (view instanceof ExploreContextualBoardCell)
        {
            return (ExploreContextualBoardCell)view;
        } else
        {
            return new ExploreContextualBoardCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    protected List getImageUrls()
    {
        return _board.getPinThumbnailUrls();
    }

    public BoardImpression getImpression()
    {
        return _impression;
    }

    protected void init()
    {
        _cornerRadius = Constants.EXPLORE_BOARD_CELL_CORNER_RADIUS;
        _allRoundedCorners = true;
        super.init();
    }

    public Object markImpressionEnd()
    {
        if (_impression == null || _board == null)
        {
            return null;
        } else
        {
            BoardImpression boardimpression = _impression;
            boardimpression.setBoardIdStr(_board.getUid());
            boardimpression.setEndTime(System.currentTimeMillis() * 0xf4240L);
            boardimpression.setSlotIndex((short)_slotPosition);
            boardimpression.setStoryIndex((short)_storyPosition);
            _impressionStart = 0L;
            return boardimpression;
        }
    }

    public void markImpressionStart()
    {
        _impressionStart = System.currentTimeMillis() * 0xf4240L;
        _impression = new BoardImpression();
        _impression.setTime(_impressionStart);
    }

    public void setBoard(Board board, boolean flag)
    {
        super.setBoard(board, flag);
        ViewHelper.setVisibility(_followBt, 8);
        ViewHelper.setViewPaddingTopBottom(_userLine, Constants.MARGIN_HALF);
    }

    public void setSlotPosition(int i)
    {
        _slotPosition = i;
    }

    public void setStoryId(String s)
    {
        _storyId = s;
    }

    public void setStoryPosition(int i)
    {
        _storyPosition = i;
    }

    protected void submitBoardClickContextLog()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("grid_index", String.valueOf(_slotPosition));
        hashmap.put("story_index", String.valueOf(_storyPosition));
        hashmap.put("story_id", _storyId);
        Pinalytics.a(ElementType.CONTEXTUAL_STORY_BOARD, ComponentType.CONTEXTUAL_STORY, _board.getUid(), hashmap);
    }
}
