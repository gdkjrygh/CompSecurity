// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.board.view.PersonListCell;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.PinPicksSections;
import com.pinterest.api.model.User;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.PinGridCell;
import com.pinterest.ui.grid.board.BoardGridCell;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PinPicksTitleSectionText;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.pinterest.adapter:
//            PinterestBaseAdapter

public class PinPicksAdapter extends PinterestBaseAdapter
{

    private static final int TYPE_BOARD = 4;
    private static final int TYPE_CARD = 3;
    private static final int TYPE_FEATURED_PINNER = 1;
    private static final int TYPE_HERO = 0;
    private static final int TYPE_PINNERS = 2;
    private static final int TYPE_PINS = 8;
    private static final int TYPE_PIN_FEED = 5;
    private static final int TYPE_TITLE = 7;
    private static final int TYPE_USER = 6;
    private static AbstractMap _runnableMap = new ConcurrentHashMap();
    private Handler _followHandler;
    private Map indicesBackground;
    private android.view.View.OnClickListener onBoardClicked;
    private android.view.View.OnClickListener onFollowClicked;
    private android.view.View.OnClickListener onUserClick;
    private List sectionIndices;

    public PinPicksAdapter()
    {
        onUserClick = new _cls1();
        onFollowClicked = new _cls2();
        onBoardClicked = new _cls3();
        _followHandler = new Handler();
    }

    private boolean isBoardGridCell(int i)
    {
        PinPicksSections pinpickssections = (PinPicksSections)getItem(i);
        return pinpickssections != null && pinpickssections.isGridSection() && (getItemViewType(i) == 4 || getItemViewType(i) == 3);
    }

    private boolean isNextGridSectionPinFeed(int i)
    {
        return getItemViewType(i) == 4 && getItemViewType(i + 1) == 5;
    }

    private boolean isPinnerCell(int i)
    {
        return getItemViewType(i) == 1 || getItemViewType(i) == 2 || getItemViewType(i) == 0 || getItemViewType(i) == 5;
    }

    private boolean shouldNeedSpaceForCells(int i)
    {
        boolean flag1 = false;
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < sectionIndices.size())
                {
                    if (i > ((Integer)sectionIndices.get(j)).intValue())
                    {
                        break label0;
                    }
                    flag = flag1;
                    if ((((Integer)sectionIndices.get(j)).intValue() - ((Integer)sectionIndices.get(j - 1)).intValue()) % 2 != 0)
                    {
                        flag = true;
                    }
                }
                return flag;
            }
            j++;
        } while (true);
    }

    private View updateBoardGridCell(BoardGridCell boardgridcell, Board board)
    {
        boolean flag;
        if (!MyUser.isUserMe(board.getUser()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        boardgridcell.displayFollowButton(flag);
        boardgridcell.setBoard(board, false);
        boardgridcell.setOverrideClicks(true);
        boardgridcell.showTitleUser(false);
        boardgridcell.setOnClickListener(onBoardClicked);
        return boardgridcell;
    }

    private void updateFollowBtn(PersonListCell personlistcell, User user)
    {
        if (MyUser.getUid().equals(user.getUid()))
        {
            personlistcell.createActionButton(null, null);
            return;
        }
        if (!user.getFollowing().booleanValue())
        {
            personlistcell.createActionButton(Resources.string(0x7f0702ab), onFollowClicked);
            personlistcell.setActionButtonStyle(com.pinterest.ui.text.PButton.ButtonStyle.RED);
        } else
        {
            personlistcell.createActionButton(Resources.string(0x7f0705b2), onFollowClicked);
            personlistcell.setActionButtonStyle(com.pinterest.ui.text.PButton.ButtonStyle.PLAIN);
        }
        personlistcell.setActionButtonTag(user);
    }

    private View updatePinGridCell(PinGridCell pingridcell, Pin pin)
    {
        pingridcell.setPin(pin, false);
        pingridcell.setRenderUser(true);
        pingridcell.setRenderOnto(false);
        pingridcell.setOverrideClicks(false);
        pingridcell.setEnabled(true);
        return pingridcell;
    }

    private void updateSections()
    {
        sectionIndices.add(0, Integer.valueOf(0));
        int i = 0;
        int j = 0;
        while (i < getCount()) 
        {
            PinPicksSections pinpickssections = (PinPicksSections)getItem(i);
            int k = j;
            if (pinpickssections != null)
            {
                k = j;
                if (pinpickssections.isGridSection())
                {
                    k = j + 1;
                    sectionIndices.add(k, Integer.valueOf(i));
                    if (pinpickssections.getType().equals("card"))
                    {
                        indicesBackground.put(Integer.valueOf(k), pinpickssections.getMobileImageUrl());
                    } else
                    {
                        indicesBackground.put(Integer.valueOf(k), null);
                    }
                }
            }
            i++;
            j = k;
        }
    }

    public int getCount()
    {
        if (_dataSource == null)
        {
            return 0;
        } else
        {
            return _dataSource.getCount();
        }
    }

    public int getItemHeight(int i, int j)
    {
        if (isBoardGridCell(i))
        {
            if (shouldNeedSpaceForCells(i))
            {
                Integer integer = (Integer)_cachedItemHeights.get(Integer.valueOf(i - 1));
                if (integer != null)
                {
                    return integer.intValue();
                } else
                {
                    return 0;
                }
            } else
            {
                return 0;
            }
        }
        if (isPinnerCell(i) || isNextGridSectionPinFeed(i))
        {
            return 0;
        } else
        {
            return super.getItemHeight(i, j);
        }
    }

    public int getItemSpan(int i)
    {
        i = getItemViewType(i);
        return i != 3 && i != 4 && i != 8 ? 2 : 1;
    }

    public int getItemViewType(int i)
    {
        Object obj;
        obj = (PinPicksSections)_dataSource.get(i);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        obj = ((PinPicksSections) (obj)).getType();
        i = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 9: default 108
    //                   -567776947: 192
    //                   -435052024: 236
    //                   3046160: 207
    //                   3198970: 162
    //                   3441022: 283
    //                   3599307: 251
    //                   93908710: 221
    //                   110371416: 267
    //                   348830999: 177;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_283;
_L11:
        switch (i)
        {
        default:
            return 0;

        case 0: // '\0'
            return 0;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;

        case 4: // '\004'
            return 4;

        case 5: // '\005'
            return 5;

        case 6: // '\006'
            return 6;

        case 7: // '\007'
            return 7;

        case 8: // '\b'
            return 8;
        }
_L5:
        if (((String) (obj)).equals("hero"))
        {
            i = 0;
        }
          goto _L11
_L10:
        if (((String) (obj)).equals("featured_pinner"))
        {
            i = 1;
        }
          goto _L11
_L2:
        if (((String) (obj)).equals("pinners"))
        {
            i = 2;
        }
          goto _L11
_L4:
        if (((String) (obj)).equals("card"))
        {
            i = 3;
        }
          goto _L11
_L8:
        if (((String) (obj)).equals("board"))
        {
            i = 4;
        }
          goto _L11
_L3:
        if (((String) (obj)).equals("pin_feed"))
        {
            i = 5;
        }
          goto _L11
_L7:
        if (((String) (obj)).equals("user"))
        {
            i = 6;
        }
          goto _L11
_L9:
        if (((String) (obj)).equals("title"))
        {
            i = 7;
        }
          goto _L11
        if (((String) (obj)).equals("pins"))
        {
            i = 8;
        }
          goto _L11
        return 0;
    }

    public View getSectionBackground(int i, ViewGroup viewgroup)
    {
        String s = (String)indicesBackground.get(Integer.valueOf(i));
        if (s == null)
        {
            return super.getSectionBackground(i, viewgroup);
        } else
        {
            viewgroup = new WebImageView(viewgroup.getContext());
            viewgroup.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            viewgroup.loadUrl(s);
            return viewgroup;
        }
    }

    public List getSectionIndicies()
    {
        return sectionIndices;
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        PinPicksSections pinpickssections = (PinPicksSections)getItem(i);
        if (pinpickssections == null) goto _L2; else goto _L1
_L1:
        getItemViewType(i);
        JVM INSTR tableswitch 0 8: default 72
    //                   0 72
    //                   1 72
    //                   2 72
    //                   3 74
    //                   4 87
    //                   5 158
    //                   6 227
    //                   7 308
    //                   8 171;
           goto _L2 _L2 _L2 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L2:
        return view;
_L3:
        return new View(ViewHelper.getContext(view, viewgroup));
_L4:
        if (!pinpickssections.isGridSection() || isNextGridSectionPinFeed(i))
        {
            if (view == null || !(view instanceof BoardGridCell))
            {
                view = new BoardGridCell(ViewHelper.getContext(view, viewgroup));
            } else
            {
                view = (BoardGridCell)view;
            }
            return updateBoardGridCell(view, pinpickssections.getBoard());
        } else
        {
            return new View(viewgroup.getContext());
        }
_L5:
        return new View(ViewHelper.getContext(view, viewgroup));
_L8:
        if (view == null || !(view instanceof PinGridCell))
        {
            view = new PinGridCell(ViewHelper.getContext(view, viewgroup));
        } else
        {
            view = (PinGridCell)view;
        }
        if (!flag)
        {
            loadMore(i);
        }
        return updatePinGridCell(view, ModelHelper.getPin(pinpickssections.getPinId()));
_L6:
        if (view != null && (view instanceof PersonListCell))
        {
            view = (PersonListCell)view;
            view.reset();
        } else
        {
            view = (PersonListCell)getInflater(view, viewgroup).inflate(0x7f030163, null);
            view.setBackgroundColor(-1);
        }
        viewgroup = pinpickssections.getUser();
        if (viewgroup != null)
        {
            view.setUser(viewgroup);
            updateFollowBtn(view, viewgroup);
            view.setEnabled(true);
        }
        view.setOnClickListener(onUserClick);
        return view;
_L7:
        if (view == null || !(view instanceof PinPicksTitleSectionText))
        {
            view = (PinPicksTitleSectionText)getInflater(view, viewgroup).inflate(0x7f03018b, null);
        } else
        {
            view = (PinPicksTitleSectionText)view;
        }
        if (pinpickssections.isCardType())
        {
            view.setWhiteTextColor();
        } else
        {
            view.setDarkTextColor();
        }
        view.setTitle(pinpickssections.getTitle());
        view.setSubTitle(pinpickssections.getDetail());
        return view;
    }

    public int getViewTypeCount()
    {
        return PinPicksSections.LOCAL_CATEGORIES.size();
    }

    public void setDataSource(Feed feed)
    {
        super.setDataSource(feed);
        if (_dataSource != null)
        {
            _dataSource.setDataListener(_dataListener);
            indicesBackground = new HashMap();
            sectionIndices = new ArrayList();
            updateSections();
        }
    }




    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinPicksAdapter this$0;

        public void onClick(View view)
        {
            view = (PersonListCell)view;
            if (view.getUser() == null)
            {
                return;
            } else
            {
                view = view.getUserId();
                Pinalytics.a(ElementType.USER_LIST_USER, ComponentType.USER_FEED, view);
                Events.post(new Navigation(Location.USER, view));
                return;
            }
        }

        _cls1()
        {
            this$0 = PinPicksAdapter.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final PinPicksAdapter this$0;

        public void onClick(View view)
        {
            final User user = (User)view.getTag();
            boolean flag;
            if (!user.getFollowing().booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            user.setFollowing(flag);
            notifyDataSetChanged();
            Pinalytics.a(ElementType.USER_FEED_FOLLOW, ComponentType.USER_FEED, user.getUid());
            if (PinPicksAdapter._runnableMap.containsKey(user))
            {
                view = (com.pinterest.base.FollowUtils.DelayedFollowRunnable)PinPicksAdapter._runnableMap.get(user);
                _followHandler.removeCallbacks(view);
                PinPicksAdapter._runnableMap.remove(user);
            } else
            {
                class _cls1
                    implements com.pinterest.base.FollowUtils.DelayedFollowRunnable.DelayedFollowListener
                {

                    final _cls2 this$1;
                    final User val$user;

                    public void onComplete()
                    {
                        notifyDataSetChanged();
                        PinPicksAdapter._runnableMap.remove(user);
                    }

                _cls1()
                {
                    this$1 = _cls2.this;
                    user = user1;
                    super();
                }
                }

                view = new com.pinterest.base.FollowUtils.DelayedFollowRunnable(user, new _cls1(), PinPicksAdapter.this);
                PinPicksAdapter._runnableMap.put(user, view);
            }
            _followHandler.postDelayed(view, 1000L);
        }

        _cls2()
        {
            this$0 = PinPicksAdapter.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final PinPicksAdapter this$0;

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

        _cls3()
        {
            this$0 = PinPicksAdapter.this;
            super();
        }
    }

}
