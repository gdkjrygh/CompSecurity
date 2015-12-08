// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.activity.home.view.HomefeedBuilderGridCell;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.DynamicDisplayOption;
import com.pinterest.api.model.DynamicStory;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.Model;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;
import java.util.List;
import org.apache.commons.lang3.BooleanUtils;

// Referenced classes of package com.pinterest.activity.dynamicgrid:
//            EndStoryCell, PinMiniCell, UserStoryCell, BoardStoryCell

public class CarouselAdapter extends BaseAdapter
{

    public static final int STORY_HEIGHT = (int)Resources.dimension(0x7f0a00ff);
    public static final int STORY_HEIGHT_LARGE = (int)Resources.dimension(0x7f0a0100);
    public static final int STORY_WIDTH = (int)Resources.dimension(0x7f0a0102);
    public static final int TYPE_BOARD = 3;
    public static final int TYPE_COUNT = 5;
    public static final int TYPE_END = 4;
    public static final int TYPE_INTEREST = 0;
    public static final int TYPE_PIN = 1;
    public static final int TYPE_USER = 2;
    protected List _items;
    protected boolean _loading;
    protected com.pinterest.activity.home.HomefeedBuilderFragment.MODE _mode;
    private DynamicStory _story;
    private int _visibleCount;

    public CarouselAdapter()
    {
        _mode = com.pinterest.activity.home.HomefeedBuilderFragment.MODE.DYNAMIC_GRID;
        _visibleCount = 0;
    }

    private boolean showUserLineInBoard()
    {
        return !"recommended_user_boards".equals(_story.getStoryType());
    }

    public int getCount()
    {
        int j = 0;
        boolean flag = true;
        int i = ((flag) ? 1 : 0);
        if (_story != null)
        {
            i = ((flag) ? 1 : 0);
            if (_story.getDisplayOption() != null)
            {
                i = ((flag) ? 1 : 0);
                if (_story.getDisplayOption().getActionLocation() != 0)
                {
                    i = 0;
                }
            }
        }
        if (_items != null)
        {
            j = _items.size() + i;
        }
        return j;
    }

    public Model getItem(int i)
    {
        if (_items != null && i < _items.size())
        {
            return (Model)_items.get(i);
        } else
        {
            return null;
        }
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        Model model = getItem(i);
        if (model instanceof Interest)
        {
            return 0;
        }
        if (model instanceof Pin)
        {
            return 1;
        }
        if (model instanceof User)
        {
            return 2;
        }
        return !(model instanceof Board) ? 4 : 3;
    }

    public int getStoryItemHeight()
    {
        if ("recommended_topics".equals(_story.getStoryType()))
        {
            return STORY_HEIGHT;
        } else
        {
            return STORY_HEIGHT_LARGE;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Model model = getItem(i);
        getItemViewType(i);
        JVM INSTR tableswitch 0 3: default 44
    //                   0 119
    //                   1 200
    //                   2 227
    //                   3 253;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_253;
_L1:
        view = EndStoryCell.from(view, viewgroup);
        view.setStory(_story);
        view.setSize(STORY_WIDTH);
_L6:
        if (i == 0)
        {
            i = Constants.MARGIN_HALF;
        } else
        {
            i = 0;
        }
        view.setLayoutParams(new org.lucasr.twowayview.TwoWayView.LayoutParams(STORY_WIDTH + Constants.MARGIN_HALF + i, getStoryItemHeight()));
        view.setPadding(i, 0, Constants.MARGIN_HALF, 0);
        _visibleCount = _visibleCount + 1;
        return view;
_L2:
        view = HomefeedBuilderGridCell.from(view, viewgroup);
        if (_story.getDisplayOption() != null)
        {
            view.setShowFollowButton(BooleanUtils.isTrue(_story.getDisplayOption().getShowFollowButton()));
            view.setTapOnly(BooleanUtils.isTrue(_story.getDisplayOption().getTapOnly()));
        }
        view.setInterest((Interest)model, false);
        view.setImageDimensions(STORY_WIDTH, STORY_WIDTH);
        view.setMode(_mode);
          goto _L6
_L3:
        view = PinMiniCell.from(view, viewgroup);
        view.setPin((Pin)model, false);
        view.setStory(_story);
          goto _L6
_L4:
        view = UserStoryCell.from(view, viewgroup);
        view.setExpectedWidth(STORY_WIDTH);
        view.setUser((User)model, false);
          goto _L6
        view = BoardStoryCell.from(view, viewgroup);
        view.setShowUser(showUserLineInBoard());
        view.setBoard((Board)model, false);
        view.setStory(_story);
          goto _L6
    }

    public int getViewTypeCount()
    {
        return 5;
    }

    public int getVisibleCount()
    {
        return _visibleCount;
    }

    public void setDataSource(DynamicStory dynamicstory)
    {
        if (dynamicstory == null)
        {
            return;
        } else
        {
            _story = dynamicstory;
            _items = dynamicstory.getObjects();
            return;
        }
    }

}
