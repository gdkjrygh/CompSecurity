// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.board.view.FollowBoardButton;
import com.pinterest.activity.library.adapter.LibraryTopicListAdapter;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.InterestsFeed;
import com.pinterest.api.model.LibrarySection;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.kit.time.FuzzyDateFormatter;
import com.pinterest.kit.time.TimeDifference;
import com.pinterest.kit.utils.NumberUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.IconView;
import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.library.view:
//            LibrarySectionGridView

public class LibrarySectionView extends LinearLayout
{

    public static final int SUBTITLE_TYPE_DATE = 0;
    public static final int SUBTITLE_TYPE_PIN_COUNT = 1;
    IconView _collabIv;
    FollowBoardButton _followBoardButton;
    LinearLayout _imageCellLayout;
    private android.view.View.OnLongClickListener _libraryBoardContextListener;
    private LibrarySection _librarySection;
    private android.view.View.OnClickListener _librarySectionClickListener;
    TextView _librarySectionSubtitle;
    TextView _librarySectionTv;
    private android.widget.AdapterView.OnItemClickListener _libraryTopicClickListener;
    IconView _placeIv;
    LibrarySectionGridView _sectionGridView;
    ImageView _sectionTitleIv;
    private int _subtitleType;
    RelativeLayout _titleSectionLayout;
    TwoWayView _topicFilterView;
    private LibraryTopicListAdapter _topicListAdapter;
    private InterestsFeed _topicsFeed;
    private User _user;

    public LibrarySectionView(Context context)
    {
        this(context, null);
    }

    public LibrarySectionView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _topicListAdapter = new LibraryTopicListAdapter();
        _librarySectionClickListener = new _cls1();
        _libraryBoardContextListener = new _cls2();
        _libraryTopicClickListener = new _cls3();
        init();
    }

    public static LibrarySectionView get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof LibrarySectionView))
        {
            return new LibrarySectionView(ViewHelper.getContext(view, viewgroup));
        } else
        {
            return (LibrarySectionView)view;
        }
    }

    private void initTopicList()
    {
        _topicFilterView.setOrientation(org.lucasr.twowayview.TwoWayView.Orientation.HORIZONTAL);
        _topicFilterView.setHorizontalScrollBarEnabled(false);
        _topicFilterView.setSelector(0x106000d);
    }

    private void setInvisibleBoardReps()
    {
        ViewHelper.setVisibility(_placeIv, false);
        ViewHelper.setVisibility(_collabIv, false);
    }

    private boolean shouldShowTopics()
    {
        while (_librarySection == null || _librarySection.getInterestsFeed() == null || _librarySection.getInterestsFeed().getCount() == 0 || _librarySection.getType().equals("board") && (_librarySection.getBoard() == null || _librarySection.getBoard().getSecret().booleanValue()) || _librarySection.getInterestsFeed() == null || _librarySection.getInterestsFeed().getCount() <= 0) 
        {
            return false;
        }
        return true;
    }

    private void updateBoardIcons(Board board)
    {
        if (board != null)
        {
            ViewHelper.setVisibility(_placeIv, board.isPlaceBoard());
            ViewHelper.setVisibility(_collabIv, Constants.isTrue(board.getCollaborative()));
        }
    }

    private void updateFollowButton()
    {
        FollowBoardButton followboardbutton = _followBoardButton;
        boolean flag;
        if (!MyUser.isUserMe(_user))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ViewHelper.setVisibility(followboardbutton, flag);
        _followBoardButton.setBoard(_librarySection.getBoard());
    }

    private void updateSectionTitleIcon()
    {
        Object obj;
        byte byte0;
        byte0 = 0;
        ViewHelper.setVisibility(_sectionTitleIv, false);
        obj = _librarySection.getType();
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 2: default 48
    //                   93908710: 73
    //                   102974396: 85;
           goto _L1 _L2 _L3
_L1:
        byte0 = -1;
_L7:
        byte0;
        JVM INSTR tableswitch 0 1: default 72
    //                   0 99
    //                   1 155;
           goto _L4 _L5 _L6
_L4:
        return;
_L2:
        if (!((String) (obj)).equals("board")) goto _L1; else goto _L7
_L3:
        if (!((String) (obj)).equals("likes")) goto _L1; else goto _L8
_L8:
        byte0 = 1;
          goto _L7
_L5:
        if ((obj = _librarySection.getBoard()) != null && ((Board) (obj)).getSecret().booleanValue())
        {
            _sectionTitleIv.setImageResource(0x7f0201bd);
            _sectionTitleIv.setColorFilter(getResources().getColor(0x7f0e007b));
            ViewHelper.setVisibility(_sectionTitleIv, true);
            return;
        }
          goto _L4
_L6:
        _sectionTitleIv.setImageResource(0x7f0201be);
        _sectionTitleIv.setColorFilter(getResources().getColor(0x7f0e007b));
        ViewHelper.setVisibility(_sectionTitleIv, true);
        return;
          goto _L7
    }

    private void updateTitle()
    {
        if (_librarySection != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        String s;
        byte byte0;
        obj = null;
        s = _librarySection.getType();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 60
    //                   3441022: 125
    //                   93908710: 97
    //                   102974396: 111;
           goto _L3 _L4 _L5 _L6
_L3:
        byte0;
        JVM INSTR tableswitch 0 2: default 88
    //                   0 139
    //                   1 245
    //                   2 370;
           goto _L7 _L8 _L9 _L10
_L7:
        _librarySectionTv.setText(((CharSequence) (obj)));
        return;
_L5:
        if (s.equals("board"))
        {
            byte0 = 0;
        }
          goto _L3
_L6:
        if (s.equals("likes"))
        {
            byte0 = 1;
        }
          goto _L3
_L4:
        if (s.equals("pins"))
        {
            byte0 = 2;
        }
          goto _L3
_L8:
        obj = _librarySection.getBoard().getName();
        if (_subtitleType == 0)
        {
            String s1 = FuzzyDateFormatter.a(TimeDifference.a(_librarySection.getBoard().getLastModifiedAt()));
            _librarySectionSubtitle.setText(s1);
        } else
        {
            int i = _librarySection.getBoard().getPinCountDisplay();
            String s2 = com.pinterest.kit.application.Resources.stringPlural(0x7f090017, Integer.valueOf(i), new Object[] {
                String.format("<b>%s</b>", new Object[] {
                    NumberUtils.getFormattedNumber(i)
                })
            });
            _librarySectionSubtitle.setText(Html.fromHtml(s2));
        }
          goto _L7
_L9:
        String s3 = getResources().getString(0x7f070336);
        obj = s3;
        if (_user != null)
        {
            obj = s3;
            if (_user.getLastPinLiked() != null)
            {
                if (_subtitleType == 0)
                {
                    obj = FuzzyDateFormatter.a(TimeDifference.a(_user.getLastPinLiked()));
                    _librarySectionSubtitle.setText(((CharSequence) (obj)));
                    obj = s3;
                } else
                {
                    int j = _user.getLikeCountDisplay();
                    obj = com.pinterest.kit.application.Resources.stringPlural(0x7f090017, Integer.valueOf(j), new Object[] {
                        String.format("<b>%s</b>", new Object[] {
                            NumberUtils.getFormattedNumber(j)
                        })
                    });
                    _librarySectionSubtitle.setText(Html.fromHtml(((String) (obj))));
                    obj = s3;
                }
            }
        }
          goto _L7
_L10:
        obj = getResources().getString(0x7f070426);
        if (_user == null) goto _L1; else goto _L11
_L11:
        int k = _user.getPinCountDisplay();
        String s4 = com.pinterest.kit.application.Resources.stringPlural(0x7f090017, Integer.valueOf(k), new Object[] {
            String.format("<b>%s</b>", new Object[] {
                NumberUtils.getFormattedNumber(k)
            })
        });
        _librarySectionSubtitle.setText(Html.fromHtml(s4));
          goto _L7
    }

    public void configure(LibrarySection librarysection, User user, int i)
    {
        if (librarysection == null)
        {
            return;
        }
        _librarySection = librarysection;
        _user = user;
        _subtitleType = i;
        updateSectionTitleIcon();
        updateTitle();
        if (_librarySection.getType().equals("board"))
        {
            updateBoardIcons(_librarySection.getBoard());
            updateFollowButton();
        } else
        {
            setInvisibleBoardReps();
            ViewHelper.setVisibility(_followBoardButton, false);
        }
        if (_topicsFeed != null && _librarySection.getInterestsFeed() == null)
        {
            _librarySection.setInterestsFeed(_topicsFeed);
        }
        _sectionGridView.configureUI(_librarySection);
    }

    public void configureTopics()
    {
        if (!shouldShowTopics())
        {
            _topicFilterView.setVisibility(8);
            return;
        } else
        {
            _topicFilterView.setVisibility(0);
            _topicFilterView.setOnItemClickListener(_libraryTopicClickListener);
            _topicListAdapter.setDataSource(_librarySection.getInterestsFeed());
            _topicFilterView.setAdapter(_topicListAdapter);
            return;
        }
    }

    protected void init()
    {
        inflate(getContext(), 0x7f030137, this);
        ButterKnife.a(this);
        _titleSectionLayout.setOnClickListener(_librarySectionClickListener);
        _imageCellLayout.setOnClickListener(_librarySectionClickListener);
        _imageCellLayout.setOnLongClickListener(_libraryBoardContextListener);
        initTopicList();
    }

    protected void onDetachedFromWindow()
    {
        _topicFilterView.setAdapter(null);
        super.onDetachedFromWindow();
    }

    public void setTopicsFeed(InterestsFeed interestsfeed)
    {
        _topicsFeed = interestsfeed;
        if (_librarySection != null)
        {
            _librarySection.setInterestsFeed(_topicsFeed);
        }
    }

    public void setUser(User user)
    {
        _user = user;
        updateTitle();
    }

    public void showAllPinsPage()
    {
        if (_librarySection == null)
        {
            return;
        } else
        {
            Pinalytics.a(ElementType.USER_PINS_BUTTON, ComponentType.NAVIGATION);
            Navigation navigation = new Navigation(Location.USER_LIBRARY_PINS, _user);
            navigation.putExtra("com.pinterest.EXTRA_FEED", _librarySection.getInterestsFeed());
            Events.post(navigation);
            return;
        }
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LibrarySectionView this$0;

        public void onClick(View view)
        {
            if (_librarySection == null)
            {
                return;
            }
            if (_librarySection.getType().equals("board") && _librarySection.getBoard() != null)
            {
                view = _librarySection.getBoard();
                Pinalytics.a(ElementType.BOARD_COVER, ComponentType.FLOWED_BOARD, view.getUid());
                Events.post(new Navigation(Location.BOARD, view));
                return;
            }
            if (_librarySection.getType().equals("likes") && _librarySection.getPinList() != null)
            {
                Pinalytics.a(ElementType.USER_LIKES_BUTTON, ComponentType.NAVIGATION);
                view = new Navigation(Location.USER_LIBRARY_LIKE, _user);
                view.putExtra("com.pinterest.EXTRA_TITLE", com.pinterest.kit.application.Resources.string(0x7f070336));
                Events.post(view);
                return;
            } else
            {
                showAllPinsPage();
                return;
            }
        }

        _cls1()
        {
            this$0 = LibrarySectionView.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnLongClickListener
    {

        final LibrarySectionView this$0;

        public boolean onLongClick(View view)
        {
            if (_librarySection != null && _librarySection.getType().equals("board"))
            {
                view = _librarySection.getBoard();
                if (view != null)
                {
                    if (Constants.isTrue(view.getSecret()))
                    {
                        Events.post(new Navigation(Location.BOARD_EDIT, view));
                        return true;
                    } else
                    {
                        Pinalytics.a(EventType.LONG_PRESS, ElementType.BOARD_COVER, ComponentType.FLOWED_BOARD, view.getUid());
                        Events.post(new ShowBoardContextMenuEvent(view));
                        return true;
                    }
                }
            }
            return false;
        }

        _cls2()
        {
            this$0 = LibrarySectionView.this;
            super();
        }
    }


    private class _cls3
        implements android.widget.AdapterView.OnItemClickListener
    {

        final LibrarySectionView this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (_librarySection == null)
            {
                return;
            }
            view = "";
            InterestsFeed interestsfeed = _librarySection.getInterestsFeed();
            adapterview = view;
            if (interestsfeed != null)
            {
                adapterview = view;
                if (interestsfeed.get(i) != null)
                {
                    adapterview = ((Interest)interestsfeed.get(i)).getName();
                }
            }
            view = new HashMap();
            view.put("library_topic_name", adapterview);
            adapterview = null;
            if (!_librarySection.getType().equals("pins")) goto _L2; else goto _L1
_L1:
            adapterview = new Navigation(Location.USER_LIBRARY_PINS, _user);
            adapterview.putExtra("com.pinterest.EXTRA_FEED", _librarySection.getInterestsFeed());
            adapterview.putExtra("com.pinterest.EXTRA_TOPIC_INDEX", Integer.valueOf(i));
            Pinalytics.a(ElementType.LIBRARY_PROFILE_PIN_TOPIC, ComponentType.LIBRARY_PROFILE_ALL_PINS, view);
_L4:
            Events.post(adapterview);
            return;
_L2:
            if (_librarySection.getType().equals("board"))
            {
                _librarySection.getBoard().setInterestList(_librarySection.getInterestsFeed().getItems());
                adapterview = new Navigation(Location.BOARD, _librarySection.getBoard());
                adapterview.putExtra("com.pinterest.EXTRA_FEED", _librarySection.getInterestsFeed());
                adapterview.putExtra("com.pinterest.EXTRA_TOPIC_INDEX", Integer.valueOf(i));
                Pinalytics.a(ElementType.LIBRARY_PROFILE_PIN_TOPIC, ComponentType.LIBRARY_PROFILE_BOARD, view);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        _cls3()
        {
            this$0 = LibrarySectionView.this;
            super();
        }
    }

}
