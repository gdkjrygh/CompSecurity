// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.library.adapter.LibraryTopicListAdapter;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.InterestsFeed;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.NumberUtils;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.IconView;
import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.library.view:
//            LibraryBoardCollabBar

public class LibraryBoardHeaderView extends RelativeLayout
{

    private Board _board;
    LibraryBoardCollabBar _boardCollabBar;
    TextView _boardDescription;
    TextView _boardPinCount;
    TextView _boardTitle;
    IconView _collabIv;
    RelativeLayout _headerContainer;
    IconView _placeIv;
    IconView _secretIv;
    private int _selectedTopicPos;
    private InterestsFeed _topicFeed;
    TwoWayView _topicList;
    private LibraryTopicListAdapter _topicListAdapter;
    private android.widget.AdapterView.OnItemClickListener _topicsSelectedListener;

    public LibraryBoardHeaderView(Context context)
    {
        this(context, null);
    }

    public LibraryBoardHeaderView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LibraryBoardHeaderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _selectedTopicPos = -1;
        _topicsSelectedListener = new _cls2();
        init();
    }

    private Interest getSelectedTopicName()
    {
        Interest interest = null;
        if (_selectedTopicPos != -1)
        {
            interest = (Interest)_topicFeed.get(_selectedTopicPos);
        }
        return interest;
    }

    private void initTopics()
    {
        _topicListAdapter = new LibraryTopicListAdapter();
        _topicList.setHorizontalScrollBarEnabled(false);
        _topicList.setSelector(0x106000d);
        _topicList.setOnItemClickListener(_topicsSelectedListener);
        _topicList.setAdapter(_topicListAdapter);
        updateTopicHeaderUI(false);
    }

    private void updateBoard()
    {
        if (_board != null)
        {
            int i = _board.getPinCountDisplay();
            String s = Resources.stringPlural(0x7f090017, Integer.valueOf(i), new Object[] {
                String.format("<b>%s</b>", new Object[] {
                    NumberUtils.getFormattedNumber(i)
                })
            });
            _boardPinCount.setText(Html.fromHtml(s));
            instantiateTextView(_boardTitle, _board.getName());
            instantiateTextView(_boardDescription, _board.getDescription());
            updateBoardIcons();
            _boardCollabBar.setBoard(_board);
            if (_headerContainer != null)
            {
                android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)_headerContainer.getLayoutParams();
                if (layoutparams != null)
                {
                    if (_board.isPlaceBoard())
                    {
                        layoutparams.bottomMargin = getResources().getDimensionPixelSize(0x7f0a0147);
                    } else
                    {
                        layoutparams.bottomMargin = 0;
                    }
                    _headerContainer.setLayoutParams(layoutparams);
                }
            }
        }
    }

    private void updateBoardIcons()
    {
        if (_board != null)
        {
            ViewHelper.setVisibility(_placeIv, _board.isPlaceBoard());
            ViewHelper.setVisibility(_secretIv, Constants.isTrue(_board.getSecret()));
            ViewHelper.setVisibility(_collabIv, Constants.isTrue(_board.getCollaborative()));
        }
    }

    private void updateBoardTopics()
    {
        if (_board != null && _board.getInterestList() != null && _topicFeed == null)
        {
            _topicFeed = new InterestsFeed();
            _topicFeed.setItems(_board.getInterestList());
            updateTopicHeaderUI(false);
        }
    }

    private void updateTopicHeaderUI(final boolean smoothScroll)
    {
        if (_topicFeed == null || _topicFeed.getCount() == 0)
        {
            _topicList.setVisibility(8);
            return;
        }
        _topicList.setVisibility(0);
        _topicListAdapter.setDataSource(_topicFeed);
        _topicListAdapter.setSelectedPosition(_selectedTopicPos);
        _topicList.post(new _cls1());
        Object obj;
        if (_selectedTopicPos == -1)
        {
            obj = "";
        } else
        {
            obj = (Interest)_topicFeed.get(_selectedTopicPos);
            if (obj == null)
            {
                obj = "";
            } else
            {
                obj = ((Interest) (obj)).getKey();
            }
        }
        Events.post(new TopicSelectedEvent(((String) (obj))));
    }

    public void init()
    {
        inflate(getContext(), 0x7f0301e4, this);
        ButterKnife.a(this);
        initTopics();
    }

    public void instantiateTextView(TextView textview, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            textview.setVisibility(8);
            return;
        } else
        {
            textview.setVisibility(0);
            textview.setText(s);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        _topicList.setAdapter(null);
        _topicListAdapter = null;
        _topicsSelectedListener = null;
        super.onDetachedFromWindow();
    }

    public void setBoard(Board board)
    {
        _board = board;
        updateBoard();
    }

    public void setTopicSelection(int i)
    {
        _selectedTopicPos = i;
        updateBoardTopics();
    }



/*
    static int access$002(LibraryBoardHeaderView libraryboardheaderview, int i)
    {
        libraryboardheaderview._selectedTopicPos = i;
        return i;
    }

*/





    private class _cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        final LibraryBoardHeaderView this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (_topicListAdapter == null || view == null || !(view instanceof TopicAnnotationCell) || _topicFeed == null)
            {
                return;
            }
            adapterview = LibraryBoardHeaderView.this;
            int j = i;
            if (_selectedTopicPos == i)
            {
                j = -1;
            }
            adapterview._selectedTopicPos = j;
            adapterview = getSelectedTopicName();
            if (adapterview == null)
            {
                adapterview = "";
            } else
            {
                adapterview = adapterview.getName();
            }
            view = new HashMap();
            view.put("library_topic_name", adapterview);
            Pinalytics.a(ElementType.LIBRARY_PROFILE_PIN_TOPIC, view);
            updateTopicHeaderUI(true);
        }

        _cls2()
        {
            this$0 = LibraryBoardHeaderView.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final LibraryBoardHeaderView this$0;
        final boolean val$smoothScroll;

        public void run()
        {
            int i;
            if (_selectedTopicPos == -1)
            {
                i = 0;
            } else
            {
                i = _selectedTopicPos;
            }
            if (smoothScroll)
            {
                _topicList.smoothScrollToPositionFromOffset(i, 0, 700);
                return;
            } else
            {
                _topicList.setSelection(i);
                return;
            }
        }

        _cls1()
        {
            this$0 = LibraryBoardHeaderView.this;
            smoothScroll = flag;
            super();
        }
    }


    private class TopicSelectedEvent
    {

        private String _query;

        public String getQuery()
        {
            return _query;
        }

        public void setTopicQuery(String s)
        {
            _query = s;
        }

        public TopicSelectedEvent(String s)
        {
            _query = s;
        }
    }

}
