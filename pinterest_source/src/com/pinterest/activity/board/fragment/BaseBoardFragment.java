// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.activity.board.view.BoardHeaderInviteView;
import com.pinterest.activity.board.view.BoardHeaderView;
import com.pinterest.activity.board.view.FollowBoardButton;
import com.pinterest.activity.board.view.FollowSimilarBoardsLayout;
import com.pinterest.activity.library.view.LibraryBoardHeaderView;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.api.ApiFields;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.BoardInviteFeed;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.education.EducationHelper;
import com.pinterest.experiment.Experiments;
import com.pinterest.fragment.PinGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.experiences.Placement;
import com.pinterest.ui.actionbar.ActionBar;
import com.pinterest.ui.actionbar.MetadataBar;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.grid.PinterestGridView;
import com.pinterest.ui.megaphone.BoardMegaphoneEvent;
import com.pinterest.ui.text.IconView;

public class BaseBoardFragment extends PinGridFragment
{

    protected Board _board;
    protected String _boardId;
    private FollowSimilarBoardsLayout _boardRecommendationContainer;
    private Runnable _eduRunnable;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    MetadataBar _floatingMetadataBar;
    private FollowBoardButton _followBtn;
    private boolean _followButtonClicked;
    protected BoardHeaderView _header;
    protected BoardHeaderInviteView _inviteHeader;
    private FrameLayout _inviteWrapper;
    private boolean _isSimilarBoardContainerFloating;
    protected LibraryBoardHeaderView _libHeader;
    protected MetadataBar _metadataBar;
    private int _selectedTopicPos;
    private Feed _similarBoardsFeed;
    private boolean _similarBoardsShown;
    protected boolean _useLibraryStyle;
    protected User _user;
    private BaseApiResponseHandler batchHandler;
    protected FeedApiResponseHandler boardRelatedResponseHandler;
    private com.pinterest.api.remote.MyUserApi.BoardInviteFeedResponse onBoardInviteLoaded;
    private com.pinterest.api.remote.BoardApi.BoardApiResponse onBoardLoaded;
    private ApiResponseHandler onEducationLoaded;
    private com.pinterest.api.remote.PinApi.PinFeedApiResponse onTopicQueryLoaded;

    public BaseBoardFragment()
    {
        _selectedTopicPos = -1;
        _followButtonClicked = false;
        _similarBoardsShown = false;
        _isSimilarBoardContainerFloating = false;
        _eventsSubscriber = new _cls9();
        boardRelatedResponseHandler = new _cls10();
        batchHandler = new _cls11();
        onBoardLoaded = new _cls12();
        onTopicQueryLoaded = new _cls13(gridResponseHandler);
        onEducationLoaded = new _cls14();
        onBoardInviteLoaded = new _cls15();
    }

    private void addScrollListenerForSimilarBoards()
    {
        _gridVw.addListener(new _cls3());
    }

    private void displaySimilarBoards()
    {
label0:
        {
            if (!_similarBoardsShown)
            {
                _similarBoardsShown = true;
                if (_similarBoardsFeed != null && _similarBoardsFeed.getCount() >= 3 && getView() != null)
                {
                    _boardRecommendationContainer = new FollowSimilarBoardsLayout(getView().getContext());
                    _boardRecommendationContainer.setSimilarBoardsFeed(_similarBoardsFeed);
                    if (!_useLibraryStyle)
                    {
                        break label0;
                    }
                    displaySimilarBoardsForLibrary();
                }
            }
            return;
        }
        displaySimilarBoardsForNonLibrary();
    }

    private void displaySimilarBoardsForLibrary()
    {
        if (_gridVw.getScrolledY() > 0)
        {
            _actionBarWrapper.addView(_boardRecommendationContainer);
            _isSimilarBoardContainerFloating = true;
            return;
        } else
        {
            _gridVw.addHeaderView(_boardRecommendationContainer);
            return;
        }
    }

    private void displaySimilarBoardsForNonLibrary()
    {
        if (_floatingMetadataBar.getVisibility() == 0)
        {
            _floatingMetadataBar.setShadowDownVisibility(8);
            _floatingMetadataBar.setShadowUpVisibility(8);
            _floatingMetadataBar.addView(_boardRecommendationContainer);
            _isSimilarBoardContainerFloating = true;
        } else
        if (_metadataBar.getVisibility() == 0)
        {
            _gridVw.addHeaderView(_boardRecommendationContainer);
            return;
        }
    }

    private void handleBatch(PinterestJsonObject pinterestjsonobject)
    {
        if (isActive())
        {
            PinterestJsonObject pinterestjsonobject1;
            Object obj;
            Object obj1;
            ApiResponse apiresponse;
            ApiResponse apiresponse1;
            if (pinterestjsonobject != null)
            {
                obj1 = pinterestjsonobject.c("GET:/v3/experiences/");
                obj = pinterestjsonobject.c((new StringBuilder("GET:/v3/boards/")).append(_navigation.getId()).append("/").toString());
                pinterestjsonobject1 = pinterestjsonobject.c((new StringBuilder("GET:/v3/boards/")).append(_navigation.getId()).append("/pins/").toString());
                pinterestjsonobject = pinterestjsonobject.c((new StringBuilder("GET:/v3/boards/")).append(_navigation.getId()).append("/collaborators/invites/me/").toString());
            } else
            {
                pinterestjsonobject = null;
                pinterestjsonobject1 = null;
                obj = null;
                obj1 = null;
            }
            obj1 = new ApiResponse(((PinterestJsonObject) (obj1)));
            apiresponse1 = new ApiResponse(((PinterestJsonObject) (obj)));
            obj = new ApiResponse(pinterestjsonobject1);
            apiresponse = new ApiResponse(pinterestjsonobject);
            if (onEducationLoaded != null)
            {
                if (((ApiResponse) (obj1)).getCode() == 0)
                {
                    onEducationLoaded.onSuccess(((ApiResponse) (obj1)));
                } else
                {
                    onEducationLoaded.onFailure(null, ((ApiResponse) (obj1)));
                }
                onEducationLoaded.onFinish();
            }
            if (onBoardLoaded != null)
            {
                if (apiresponse1.getCode() == 0)
                {
                    onBoardLoaded.onSuccess(apiresponse1);
                } else
                {
                    onBoardLoaded.onFailure(null, apiresponse1);
                }
                onBoardLoaded.onFinish();
            }
            obj1 = new com.pinterest.api.remote.PinApi.PinFeedApiResponse(gridResponseHandler);
            ((com.pinterest.api.remote.PinApi.PinFeedApiResponse) (obj1)).setBaseUrl((new StringBuilder("boards/")).append(_navigation.getId()).append("/pins/?fields=").append(ApiFields.g()).append("&page_size=").append(Device.getPageSizeString()).toString());
            if (((ApiResponse) (obj)).getCode() == 0)
            {
                ((com.pinterest.api.remote.PinApi.PinFeedApiResponse) (obj1)).onSuccess(pinterestjsonobject1);
            } else
            {
                ((com.pinterest.api.remote.PinApi.PinFeedApiResponse) (obj1)).onFailure(null, pinterestjsonobject1);
            }
            ((com.pinterest.api.remote.PinApi.PinFeedApiResponse) (obj1)).onFinish();
            if (onBoardInviteLoaded != null)
            {
                if (apiresponse.getCode() == 0)
                {
                    onBoardInviteLoaded.onSuccess(pinterestjsonobject);
                } else
                {
                    onBoardInviteLoaded.onFailure(null, pinterestjsonobject);
                }
                onBoardInviteLoaded.onFinish();
                return;
            }
        }
    }

    private void setEmptyViewButton()
    {
        while (_gridVw == null || _board == null || _board.getPinCountDisplay() > 0) 
        {
            return;
        }
        if (_board.isPlaceBoard() && MyUser.isUserMe(_user))
        {
            _emptyActionLabel = Resources.string(0x7f070455);
            _emptyAction = new _cls8();
            return;
        } else
        {
            _gridVw.getEmptyView().removeAction(1);
            return;
        }
    }

    private void updateActionBar()
    {
label0:
        {
            if (_actionBar != null && _board != null)
            {
                if (!_useLibraryStyle)
                {
                    break label0;
                }
                updateActionBarActions();
            }
            return;
        }
        _actionBar.setTitle(_board.getName());
    }

    private void updateActionBarActions()
    {
        int k = (int)getResources().getDimension(0x7f0a0148);
        Object obj = getActivity().getBaseContext();
        int j;
        for (int i = 0; i < _actionBar.getChildCount(); i = j + 1)
        {
            View view = _actionBar.getChildAt(i);
            if (!(view instanceof IconView))
            {
                j = i;
                if (!(view instanceof FollowBoardButton))
                {
                    continue;
                }
            }
            _actionBar.removeView(view);
            j = i - 1;
        }

        if (_board.isMeOwnerOrCollaborator())
        {
            IconView iconview = new IconView(((Context) (obj)));
            iconview.setImageResource(0x7f020185);
            iconview.setPadding(k, k, k, k);
            iconview.setOnClickListener(new _cls4());
            _actionBar.addView(iconview);
        } else
        {
            _followBtn = (FollowBoardButton)LayoutInflater.from(((Context) (obj))).inflate(0x7f0301d3, _actionBar, false);
            _followBtn.setBoard(_board);
            _followBtn.setShowSimilarBoards(true);
            _actionBar.addView(_followBtn);
        }
        if (_board.getSecret() != Boolean.TRUE)
        {
            IconView iconview1 = new IconView(((Context) (obj)));
            iconview1.setImageResource(0x7f0201f4);
            iconview1.setPadding(k, k, k, k);
            iconview1.setOnClickListener(new _cls5());
            _actionBar.addView(iconview1);
        }
        if (!Experiments.K() && _board.getSecret() != Boolean.TRUE && _board.isMeOwnerOrCollaborator())
        {
            obj = new IconView(((Context) (obj)));
            ((IconView) (obj)).setImageResource(0x7f0201f6);
            ((IconView) (obj)).setPadding(k, k, k, k);
            ((IconView) (obj)).setOnClickListener(new _cls6());
            _actionBar.addView(((View) (obj)));
        }
    }

    private void updateInvite(final BoardInviteFeed feed)
    {
        (new _cls7()).execute();
    }

    private void updateMetadataBarModel(MetadataBar metadatabar, Board board, com.pinterest.ui.actionbar.MetadataBar.Mode mode)
    {
        if (metadatabar != null && board != null)
        {
            if (mode != null)
            {
                metadatabar.setModel(board, mode);
            } else
            {
                metadatabar.setModel(board);
            }
            metadatabar = (FollowBoardButton)metadatabar.findViewById(0x7f0f031b);
            if (metadatabar != null)
            {
                metadatabar.setShowSimilarBoards(true);
            }
        }
    }

    private void updateMetadataBarState()
    {
        if (getView() == null || _floatingMetadataBar == null || _gridVw == null || _metadataBar == null)
        {
            return;
        }
        int ai[] = new int[2];
        _metadataBar.getLocationOnScreen(ai);
        int ai1[] = new int[2];
        _floatingMetadataBar.getLocationOnScreen(ai1);
        if (ai[1] > ai1[1])
        {
            _floatingMetadataBar.setVisibility(4);
            _metadataBar.setVisibility(0);
            return;
        } else
        {
            _floatingMetadataBar.setVisibility(0);
            _metadataBar.setVisibility(4);
            _floatingMetadataBar.setTranslationY((float)_actionBar.getHeight() - Math.abs(_actionBarWrapper.getY()));
            return;
        }
    }

    private void updateMetadataBars(Board board, com.pinterest.ui.actionbar.MetadataBar.Mode mode)
    {
        updateMetadataBarModel(_metadataBar, board, mode);
        updateMetadataBarModel(_floatingMetadataBar, board, mode);
    }

    protected Feed getOfflineFeed(int i)
    {
        if (!MyUser.isUserMe(_user) || i != 0)
        {
            return null;
        } else
        {
            PinFeed pinfeed = new PinFeed();
            pinfeed.setItems(ModelHelper.getBoardPins(_navigation.getId()));
            return pinfeed;
        }
    }

    protected void loadData()
    {
        String s = getNavigation().getId();
        _boardId = s;
        String s1 = Integer.toString(Placement.ANDROID_BOARD_TAKEOVER.getValue());
        if (_selectedTopicPos == -1)
        {
            if (MyUser.hasAccessToken())
            {
                BoardApi.d(s1, s, batchHandler, getApiTag());
            } else
            {
                BoardApi.a(s, false, new com.pinterest.api.remote.PinApi.PinFeedApiResponse(gridResponseHandler), getApiTag());
            }
        }
        if (Experiments.e(false))
        {
            _similarBoardsFeed = null;
            BoardApi.a(_navigation.getId(), new com.pinterest.api.remote.BoardApi.BoardFeedApiResponse(boardRelatedResponseHandler), getApiTag());
        }
        super.loadData();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (_board != null && _board.isMeOwnerOrCollaborator())
        {
            _menuId = 0x7f100009;
        }
        if (Experiments.x())
        {
            _useLibraryStyle = true;
            _menuId = 0x7f100002;
        }
    }

    protected void onDeactivate()
    {
        EducationHelper.a(_eduRunnable);
        super.onDeactivate();
    }

    public void onDestroy()
    {
        onBoardLoaded = null;
        onBoardInviteLoaded = null;
        onTopicQueryLoaded = null;
        onEducationLoaded = null;
        batchHandler = null;
        super.onDestroy();
    }

    public void onDestroyView()
    {
        Events.unregister(_eventsSubscriber);
        if (_header != null)
        {
            _header.setOnClickListener(null);
            _header = null;
        }
        if (_libHeader != null)
        {
            _libHeader.setOnClickListener(null);
            _libHeader = null;
        }
        _inviteWrapper = null;
        _inviteHeader = null;
        _metadataBar = null;
        _floatingMetadataBar = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        setEmptyViewButton();
        if (!_useLibraryStyle)
        {
            if (_floatingMetadataBar != null)
            {
                _floatingMetadataBar.postDelayed(new _cls1(), 1L);
            }
            _gridVw.addListener(new _cls2());
            _header = new BoardHeaderView(view.getContext());
            _header.setId(0x7f0f0090);
            _header.setApiTag(getApiTag());
            _header.setVisibility(8);
            _header.setUser(_user);
            _header.setBoard(_board);
            _gridVw.addHeaderView(_header, -1, -2);
        } else
        {
            if (_actionBarWrapper != null)
            {
                _actionBarWrapper.setShadowVisibility(8);
            }
            _libHeader = new LibraryBoardHeaderView(view.getContext());
            _libHeader.setId(0x7f0f0090);
            _libHeader.setBoard(_board);
            _libHeader.setTopicSelection(_selectedTopicPos);
            _gridVw.addHeaderView(_libHeader);
        }
        if (Experiments.e(false))
        {
            addScrollListenerForSimilarBoards();
        }
        _inviteWrapper = new FrameLayout(view.getContext());
        _gridVw.addHeaderView(_inviteWrapper, -1, -2);
        if (!_useLibraryStyle)
        {
            _metadataBar = new MetadataBar(view.getContext());
            _gridVw.addHeaderView(_metadataBar, -1, -2);
        }
        updateMetadataBars(_board, com.pinterest.ui.actionbar.MetadataBar.Mode.PINS);
        ((PinGridAdapter)_adapter).setRenderUser(true);
        ((PinGridAdapter)_adapter).setRenderOnto(false);
        ((PinGridAdapter)_adapter).setRenderSource(false);
        ((PinGridAdapter)_adapter).setCropPinImage(false);
        Events.register(_eventsSubscriber, com/pinterest/api/model/Board$BoardDoesNotExistEvent, new Class[] {
            com/pinterest/api/model/Board$UpdateEvent, com/pinterest/api/model/User$UpdateEvent, com/pinterest/api/model/Board$RequestUpdateEvent, com/pinterest/ui/megaphone/BoardMegaphoneEvent, com/pinterest/activity/board/view/FollowBoardButton$FollowBoardButtonClickEvent, com/pinterest/activity/library/view/LibraryBoardHeaderView$TopicSelectedEvent
        });
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _board = navigation.getModelAsBoard();
        if (_board != null)
        {
            _user = _board.getUser();
        }
        navigation = (Integer)navigation.getExtra("com.pinterest.EXTRA_TOPIC_INDEX");
        if (navigation != null)
        {
            _selectedTopicPos = navigation.intValue();
        }
    }

    protected void updateEmptyContent()
    {
        _emptyLeftImage = 0x7f02020f;
        _emptyCenterImage = 0x7f020217;
        _emptyRightImage = 0x7f020212;
        if (_user != null)
        {
            if (MyUser.isUserMe(_user))
            {
                if (_board != null && _board.isPlaceBoard())
                {
                    _emptyMessage = Resources.string(0x7f070456);
                    return;
                } else
                {
                    _emptyMessage = Resources.string(0x7f07025a);
                    return;
                }
            } else
            {
                _emptyMessage = Resources.string(0x7f07023d, new Object[] {
                    _user.getFirstName()
                });
                return;
            }
        } else
        {
            _emptyMessage = Resources.string(0x7f07023e);
            return;
        }
    }







/*
    static Feed access$1202(BaseBoardFragment baseboardfragment, Feed feed)
    {
        baseboardfragment._similarBoardsFeed = feed;
        return feed;
    }

*/




/*
    static boolean access$1402(BaseBoardFragment baseboardfragment, boolean flag)
    {
        baseboardfragment._followButtonClicked = flag;
        return flag;
    }

*/


/*
    static boolean access$1502(BaseBoardFragment baseboardfragment, boolean flag)
    {
        baseboardfragment._refreshing = flag;
        return flag;
    }

*/







/*
    static Runnable access$2002(BaseBoardFragment baseboardfragment, Runnable runnable)
    {
        baseboardfragment._eduRunnable = runnable;
        return runnable;
    }

*/


/*
    static boolean access$202(BaseBoardFragment baseboardfragment, boolean flag)
    {
        baseboardfragment._isSimilarBoardContainerFloating = flag;
        return flag;
    }

*/









/*
    static int access$802(BaseBoardFragment baseboardfragment, int i)
    {
        baseboardfragment._selectedTopicPos = i;
        return i;
    }

*/


    private class _cls9
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final BaseBoardFragment this$0;

        public void onEventMainThread(com.pinterest.activity.board.view.FollowBoardButton.FollowBoardButtonClickEvent followboardbuttonclickevent)
        {
            if (_similarBoardsShown && _boardRecommendationContainer != null)
            {
                _boardRecommendationContainer.replaceBoardRecommendation(followboardbuttonclickevent.getFollowedBoard());
                return;
            }
            if (_similarBoardsFeed != null)
            {
                displaySimilarBoards();
                return;
            } else
            {
                _followButtonClicked = true;
                return;
            }
        }

        public void onEventMainThread(com.pinterest.activity.library.view.LibraryBoardHeaderView.TopicSelectedEvent topicselectedevent)
        {
            true.valueOf = topicselectedevent;
            
// JavaClassFileOutputException: get_constant: invalid tag

        public void onEventMainThread(com.pinterest.api.model.Board.RequestUpdateEvent requestupdateevent)
        {
            BoardApi.a(String.valueOf(_board.getUid()), onBoardLoaded, getApiTag());
        }

        public void onEventMainThread(com.pinterest.api.model.Board.UpdateEvent updateevent)
        {
            if (_board != null && updateevent.getBoard().getUid().equals(_board.getUid()))
            {
                _board = updateevent.getBoard();
                if (updateevent.wasDeleted())
                {
                    getActivity().onBackPressed();
                } else
                {
                    setEmptyViewButton();
                    updateActionBar();
                    if (_header != null)
                    {
                        _header.setBoard(_board);
                    }
                    if (_libHeader != null)
                    {
                        _libHeader.setBoard(_board);
                        _libHeader.setTopicSelection(_selectedTopicPos);
                    }
                    if (_followBtn != null)
                    {
                        _followBtn.setBoard(_board);
                    }
                    if (!_useLibraryStyle)
                    {
                        updateMetadataBars(_board, com.pinterest.ui.actionbar.MetadataBar.Mode.PINS);
                    }
                    if (updateevent.refreshFeed())
                    {
                        refresh();
                        return;
                    }
                }
            }
        }

        public void onEventMainThread(com.pinterest.api.model.User.UpdateEvent updateevent)
        {
            if (_user != null && updateevent.getUser().getUid().equals(_user.getUid()))
            {
                _user = updateevent.getUser();
                updateEmptyContent();
            }
        }

        _cls9()
        {
            this$0 = BaseBoardFragment.this;
            super();
        }
    }


    private class _cls10 extends FeedApiResponseHandler
    {

        final BaseBoardFragment this$0;

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            _similarBoardsFeed = feed;
            if (_followButtonClicked)
            {
                displaySimilarBoards();
            }
        }

        _cls10()
        {
            this$0 = BaseBoardFragment.this;
            super();
        }
    }


    private class _cls11 extends BaseApiResponseHandler
    {

        final BaseBoardFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            handleBatch((PinterestJsonObject)apiresponse.getData());
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            handleBatch((PinterestJsonObject)apiresponse.getData());
        }

        _cls11()
        {
            this$0 = BaseBoardFragment.this;
            super();
        }
    }


    private class _cls12 extends com.pinterest.api.remote.BoardApi.BoardApiResponse
    {

        final BaseBoardFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            if (apiresponse.getCode() == 40)
            {
                Events.post(new com.pinterest.api.model.Board.BoardDoesNotExistEvent(apiresponse));
            }
            if (_board == null)
            {
                throwable = getActivity();
                if (throwable != null)
                {
                    throwable.onBackPressed();
                }
            }
        }

        public void onSuccess(Board board)
        {
            super.onSuccess(board);
            _board = board;
            _user = _board.getUser();
            if (_header != null)
            {
                _header.setUser(_user);
                _header.setBoard(_board);
            }
            if (_libHeader != null)
            {
                _libHeader.setBoard(_board);
                _libHeader.setTopicSelection(_selectedTopicPos);
            }
            if (_followBtn != null)
            {
                _followBtn.setBoard(_board);
            }
            if (!_useLibraryStyle)
            {
                updateMetadataBars(board, null);
            }
            updateActionBar();
            setEmptyViewButton();
        }

        _cls12()
        {
            this$0 = BaseBoardFragment.this;
            super();
        }
    }


    private class _cls13 extends com.pinterest.api.remote.PinApi.PinFeedApiResponse
    {

        final BaseBoardFragment this$0;

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
        }

        _cls13(FeedApiResponseHandler feedapiresponsehandler)
        {
            this$0 = BaseBoardFragment.this;
            super(feedapiresponsehandler);
        }
    }


    private class _cls14 extends com.pinterest.api.remote.ExperiencesApi.ExperienceResponseHandler
    {

        final BaseBoardFragment this$0;

        public void onSuccess()
        {
            if (isActive())
            {
                _eduRunnable = EducationHelper.a(Placement.ANDROID_BOARD_TAKEOVER, BaseBoardFragment.this);
            }
        }

        _cls14()
        {
            this$0 = BaseBoardFragment.this;
            super();
        }
    }


    private class _cls15 extends com.pinterest.api.remote.MyUserApi.BoardInviteFeedResponse
    {

        final BaseBoardFragment this$0;

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            updateInvite((BoardInviteFeed)feed);
        }

        _cls15()
        {
            this$0 = BaseBoardFragment.this;
            super();
        }
    }



    private class _cls8
        implements android.view.View.OnClickListener
    {

        final BaseBoardFragment this$0;

        public void onClick(View view)
        {
            view = new Navigation(Location.PLACE_PICKER);
            view.putExtra("com.pinterest.EXTRA_MODE", com.pinterest.activity.place.fragment.PlacePickerFragment.Mode.CREATE);
            view.putExtra("com.pinterest.EXTRA_BOARD_ID", _board.getUid());
            Events.post(view);
        }

        _cls8()
        {
            this$0 = BaseBoardFragment.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final BaseBoardFragment this$0;

        public void onClick(View view)
        {
            Events.post(new Navigation(Location.BOARD_EDIT, _board));
        }

        _cls4()
        {
            this$0 = BaseBoardFragment.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final BaseBoardFragment this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.SEND_BUTTON, ComponentType.BOARD_PINS_GRID, _board.getUid());
            if (Experiments.K())
            {
                SendShareUtils.getInstance().postSendShareNavigation(_board);
            } else
            {
                view = getContext();
                if (view != null)
                {
                    Intent intent = new Intent(view, com/pinterest/activity/sendapin/SendPinActivity);
                    intent.putExtra("boardId", _board.getUid());
                    view.startActivity(intent);
                    return;
                }
            }
        }

        _cls5()
        {
            this$0 = BaseBoardFragment.this;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final BaseBoardFragment this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.BOARD_SHARE_BUTTON, ComponentType.FLOWED_BOARD, _board.getUid());
            Events.post(new DialogEvent(BoardShareDialog.newInstance(_board.getUid())));
        }

        _cls6()
        {
            this$0 = BaseBoardFragment.this;
            super();
        }
    }


    private class _cls7 extends BackgroundTask
    {

        BoardInvite invite;
        User inviter;
        final BaseBoardFragment this$0;
        final BoardInviteFeed val$feed;

        public void onFinish()
        {
            onFinish();
            View view = getView();
            if (view != null)
            {
                if (invite != null && invite.getStatus().equals("new"))
                {
                    if (_inviteHeader == null)
                    {
                        _inviteHeader = (BoardHeaderInviteView)LayoutInflater.from(view.getContext()).inflate(0x7f0301c0, _inviteWrapper, false);
                        _inviteHeader.setApiTag(getApiTag());
                        _inviteWrapper.addView(_inviteHeader);
                    }
                    _inviteHeader.setBoard(_board);
                    _inviteHeader.setInviter(inviter);
                    _inviteHeader.setVisibility(0);
                    return;
                }
                if (_inviteHeader != null)
                {
                    _inviteHeader.setVisibility(8);
                    return;
                }
            }
        }

        public void run()
        {
            if (_board != null)
            {
                if (feed != null && feed.getCount() > 0)
                {
                    invite = (BoardInvite)feed.get(0);
                } else
                {
                    invite = ModelHelper.getBoardInviteAcceptable(_board.getUid());
                }
                if (invite != null)
                {
                    inviter = ModelHelper.getUser(invite.getInviterUid());
                }
            }
        }

        _cls7()
        {
            this$0 = BaseBoardFragment.this;
            feed = boardinvitefeed;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final BaseBoardFragment this$0;

        public void run()
        {
            updateMetadataBarState();
        }

        _cls1()
        {
            this$0 = BaseBoardFragment.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener
    {

        final BaseBoardFragment this$0;

        public void onScroll(View view, int i, int j, int k, int l)
        {
            updateMetadataBarState();
        }

        _cls2()
        {
            this$0 = BaseBoardFragment.this;
            super();
        }
    }

}
