// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.conversation.model.ConversationMessagesFeed;
import com.pinterest.activity.report.BlockConversationUserDialog;
import com.pinterest.activity.report.ReportConversationDialog;
import com.pinterest.activity.search.AddPinSearchFragment;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.Conversation;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.remote.ConversationApi;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.events.OverrideNavigationEvent;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.PButton;
import com.pinterest.ui.text.PEditText;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationAdapter, HideConversationTask

public class ConversationFragment extends BaseFragment
{

    private static final int DEFAULT_POLLING_DELAY = 1000;
    private static final int MAX_DB_MESSAGES = 50;
    private static final String TAG = "ConversationFragment";
    private ConversationAdapter _adapter;
    private View _addPin;
    private AddPinSearchFragment _addPinFragment;
    private String _bookmark;
    private Runnable _checkNewMessagesTask;
    private Conversation _conversation;
    private String _conversationId;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private Handler _handler;
    private AtomicBoolean _handlerTaskScheduled;
    private boolean _isLoadingMoreMessages;
    private boolean _isaddPinVisble;
    private ListView _listView;
    private TextView _nonPinnerListFooter;
    private PEditText _replyEt;
    private PButton _sendBtn;
    private BaseApiResponseHandler messageSendResponseHandler;
    private BaseApiResponseHandler newMessageResponseHandler;
    private android.view.View.OnClickListener onAddPin;
    private BaseApiResponseHandler onConversationMessageNewPageLoaded;
    private android.widget.AbsListView.OnScrollListener onScrollListener;
    private android.view.View.OnClickListener onSendMessage;

    public ConversationFragment()
    {
        _isaddPinVisble = false;
        _handlerTaskScheduled = new AtomicBoolean();
        _isLoadingMoreMessages = false;
        onScrollListener = new _cls1();
        _eventsSubscriber = new _cls4();
        onConversationMessageNewPageLoaded = new _cls5();
        onSendMessage = new _cls6();
        onAddPin = new _cls7();
        messageSendResponseHandler = new _cls8();
        newMessageResponseHandler = new _cls10();
        _checkNewMessagesTask = new _cls11();
        _menuId = 0x7f100001;
    }

    private void checkForNewMessages()
    {
        if (!_handlerTaskScheduled.get())
        {
            _handlerTaskScheduled.set(true);
            ConversationApi.d(_conversationId, _bookmark, newMessageResponseHandler, getApiTag());
        }
    }

    private void initConversation()
    {
        loadConversationMetadata();
        loadConversationMessages();
        Object obj = ModelHelper.getConversationMessages(_conversationId, 50);
        if (obj != null && !((List) (obj)).isEmpty())
        {
            obj = new ConversationMessagesFeed(((List) (obj)));
            _adapter.replaceFeed(((ConversationMessagesFeed) (obj)));
        }
    }

    private void loadConversationMessages()
    {
        ConversationApi.g(_conversationId, new _cls3(_conversationId), getApiTag());
    }

    private void loadConversationMetadata()
    {
        ConversationApi.f(_conversationId, new _cls2(), getApiTag());
    }

    private void popAddPinBackstack()
    {
        FragmentManager fragmentmanager = getActivity().getSupportFragmentManager();
        int j = fragmentmanager.getBackStackEntryCount();
        for (int i = 0; i < j; i++)
        {
            fragmentmanager.popBackStack();
        }

    }

    private void showAddPinFragment()
    {
        _replyEt.clearFocus();
        if (_addPinFragment != null && _addPinFragment.isAdded()) goto _L2; else goto _L1
_L1:
        _addPinFragment = new AddPinSearchFragment();
        Navigation navigation = new Navigation(Location.SEARCH, "");
        navigation.putExtra("com.pinterest.EXTRA_CONVERSATION_ID", _conversationId);
        _addPinFragment.setNavigation(navigation);
        FragmentHelper.replaceFragment(this, 0x7f0f0232, _addPinFragment, false, com.pinterest.activity.FragmentHelper.Animation.MODAL);
_L4:
        _isaddPinVisble = true;
        return;
_L2:
        View view = _addPinFragment.getView();
        if (view != null)
        {
            ObjectAnimator.ofFloat(view, "translationY", new float[] {
                Device.getScreenHeight(), 0.0F
            }).setDuration(200L).start();
            ViewHelper.setVisibility(_addPinFragment.getView(), 0);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void showNonPinnerMessage()
    {
        if (_conversation != null && StringUtils.isNotBlank(_conversation.getEmails()))
        {
            _handler.post(new _cls9());
        }
    }

    private void updateConversationMetadata()
    {
        if (_conversation != null && _actionBar != null && _replyEt != null)
        {
            _actionBar.setTitle(_conversation.getConversationTitle());
            _replyEt.setHint(0x7f07018e);
        }
    }

    public boolean addPinVisible()
    {
        return _isaddPinVisble;
    }

    public void hidePinFragment()
    {
        if (_addPinFragment != null)
        {
            Object obj = _addPinFragment.getView();
            if (obj != null)
            {
                obj = ObjectAnimator.ofFloat(obj, "translationY", new float[] {
                    0.0F, Device.getScreenHeight()
                });
                ((ObjectAnimator) (obj)).setDuration(200L);
                ((ObjectAnimator) (obj)).addListener(new _cls12());
                ((ObjectAnimator) (obj)).start();
            }
        }
        _isaddPinVisble = false;
    }

    protected boolean onActionIconClick(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onActionIconClick(menuitem);

        case 2131690755: 
            (new HideConversationTask(_conversation)).execute();
            return true;

        case 2131690756: 
            Events.post(new DialogEvent(new ReportConversationDialog(_conversation.getUid())));
            return true;

        case 2131690757: 
            menuitem = new BlockConversationUserDialog();
            break;
        }
        menuitem.setConversation(_conversation);
        Events.post(new DialogEvent(menuitem));
        return true;
    }

    protected void onActivate()
    {
        if (getActivity() != null)
        {
            getActivity().getWindow().setSoftInputMode(16);
        }
        super.onActivate();
    }

    public boolean onBackPressed()
    {
        View view;
        if (_addPinFragment != null)
        {
            view = _addPinFragment.getView();
        } else
        {
            view = null;
        }
        if (view != null && view.getVisibility() == 0)
        {
            hidePinFragment();
            return true;
        } else
        {
            return super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300b6;
        _handler = new Handler();
        Events.register(_eventsSubscriber, com/pinterest/api/model/Conversation$UpdateEvent, new Class[] {
            com/pinterest/api/model/Conversation$HideEvent, com/pinterest/api/model/ConversationMessage$AddEvent, com/pinterest/events/OverrideNavigationEvent
        });
    }

    protected void onDeactivate()
    {
        if (getActivity() != null)
        {
            FragmentManager fragmentmanager = getActivity().getSupportFragmentManager();
            fragmentmanager.popBackStack();
            fragmentmanager.popBackStack();
            getActivity().getWindow().setSoftInputMode(32);
            Device.hideSoftKeyboard(_replyEt);
            FragmentHelper.replaceFragment(this, 0x7f0f0232, null, false);
        }
        super.onDeactivate();
    }

    public void onDestroyView()
    {
        _handler.removeCallbacks(_checkNewMessagesTask);
        _addPinFragment = null;
        _nonPinnerListFooter = null;
        Events.unregister(_eventsSubscriber);
        Events.post(new com.pinterest.api.model.Conversation.UpdateEvent(_conversation));
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        getActivity().getWindow().setSoftInputMode(16);
        _replyEt = (PEditText)view.findViewById(0x7f0f0230);
        updateConversationMetadata();
        _listView = (ListView)view.findViewById(0x7f0f0128);
        bundle = new View(view.getContext());
        bundle.setMinimumHeight((int)Resources.dimension(0x7f0a0159));
        _listView.addFooterView(bundle);
        _adapter = new ConversationAdapter(view.getContext());
        _listView.setAdapter(_adapter);
        _listView.setOnScrollListener(onScrollListener);
        _sendBtn = (PButton)view.findViewById(0x7f0f022e);
        _sendBtn.setOnClickListener(onSendMessage);
        _addPin = view.findViewById(0x7f0f022f);
        _addPin.setOnClickListener(onAddPin);
        _replyEt.setText("");
        initConversation();
        if (_conversation != null && _conversation.getCachedUsers().size() == 1)
        {
            _actionBar.getMenu().findItem(0x7f0f0505).setVisible(false);
            _actionBar.getMenu().findItem(0x7f0f0504).setVisible(false);
        }
        if (_conversation == null)
        {
            _actionBar.getMenu().findItem(0x7f0f0505).setVisible(false);
            _actionBar.getMenu().findItem(0x7f0f0504).setVisible(false);
        }
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _conversationId = navigation.getId();
        _conversation = (Conversation)navigation.getCachedModel();
        _bookmark = null;
        if (_handler == null)
        {
            _handler = new Handler();
            _handler.postDelayed(_checkNewMessagesTask, 1000L);
        }
    }





/*
    static boolean access$102(ConversationFragment conversationfragment, boolean flag)
    {
        conversationfragment._isLoadingMoreMessages = flag;
        return flag;
    }

*/






/*
    static TextView access$1402(ConversationFragment conversationfragment, TextView textview)
    {
        conversationfragment._nonPinnerListFooter = textview;
        return textview;
    }

*/



/*
    static String access$1602(ConversationFragment conversationfragment, String s)
    {
        conversationfragment._bookmark = s;
        return s;
    }

*/







/*
    static Conversation access$302(ConversationFragment conversationfragment, Conversation conversation)
    {
        conversationfragment._conversation = conversation;
        return conversation;
    }

*/







    private class _cls1
        implements android.widget.AbsListView.OnScrollListener
    {

        final ConversationFragment this$0;

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
            if (i == 0 && k > 0 && _adapter.getNextUrl() != null && !_isLoadingMoreMessages)
            {
                _isLoadingMoreMessages = true;
                ConversationApi.h(_adapter.getNextUrl(), onConversationMessageNewPageLoaded, getApiTag());
                _adapter.setShowSpinner(true);
            }
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
            if (i != 0)
            {
                Device.hideSoftKeyboard(abslistview);
            }
        }

        _cls1()
        {
            this$0 = ConversationFragment.this;
            super();
        }
    }


    private class _cls4
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final ConversationFragment this$0;

        public void onEventMainThread(com.pinterest.api.model.Conversation.HideEvent hideevent)
        {
            if (hideevent.getConversation().getUid().equals(_conversationId))
            {
                popAddPinBackstack();
                pressBackButton();
            }
        }

        public void onEventMainThread(com.pinterest.api.model.Conversation.UpdateEvent updateevent)
        {
            class _cls1 extends BackgroundTask
            {

                private ConversationMessagesFeed _feed;
                final _cls4 this$1;

                public void onFinish()
                {
                    super.onFinish();
                    _adapter.replaceFeed(_feed);
                }

                public void run()
                {
                    int i = _adapter.getCount();
                    _feed = new ConversationMessagesFeed(ModelHelper.getConversationMessages(_conversationId, i));
                }

                _cls1()
                {
                    this$1 = _cls4.this;
                    super();
                }
            }

            if (updateevent.getConversation().getUid().equals(_conversationId))
            {
                (new _cls1()).execute();
            }
        }

        public void onEventMainThread(com.pinterest.api.model.ConversationMessage.AddEvent addevent)
        {
            if (addevent.getConversationId().equals(_conversationId))
            {
                _adapter.addMessage(addevent.getConversationMessage());
                showNonPinnerMessage();
            }
        }

        public void onEventMainThread(OverrideNavigationEvent overridenavigationevent)
        {
            overridenavigationevent = overridenavigationevent.b();
            ConversationApi.a(_conversationId, overridenavigationevent, null, messageSendResponseHandler, getApiTag());
            if (_addPinFragment != null)
            {
                hidePinFragment();
            }
        }

        _cls4()
        {
            this$0 = ConversationFragment.this;
            super();
        }
    }


    private class _cls5 extends ApiResponseHandler
    {

        final ConversationFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            Application.showToast(throwable.getMessage());
            class _cls2
                implements Runnable
            {

                final _cls5 this$1;

                public void run()
                {
                    _isLoadingMoreMessages = false;
                }

                _cls2()
                {
                    this$1 = _cls5.this;
                    super();
                }
            }

            _listView.post(new _cls2());
        }

        public void onSuccess(final PinterestJsonObject moreItems)
        {
            moreItems = new ConversationMessagesFeed(_conversationId, moreItems, getBaseUrl());
            class _cls1
                implements Runnable
            {

                final _cls5 this$1;
                final ConversationMessagesFeed val$moreItems;

                public void run()
                {
                    _adapter.setShowSpinner(false);
                    _adapter.appendFeed(moreItems);
                    _isLoadingMoreMessages = false;
                    int i = _listView.getFirstVisiblePosition();
                    int j = moreItems.getCount();
                    _listView.setSelection(i + j);
                }

                _cls1()
                {
                    this$1 = _cls5.this;
                    moreItems = conversationmessagesfeed;
                    super();
                }
            }

            _listView.post(new _cls1());
        }

        _cls5()
        {
            this$0 = ConversationFragment.this;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final ConversationFragment this$0;

        public void onClick(View view)
        {
            view = _replyEt.getText().toString();
            if (StringUtils.isNotEmpty(view))
            {
                _replyEt.setText(null);
                ConversationApi.e(_conversationId, view, messageSendResponseHandler, getApiTag());
            }
        }

        _cls6()
        {
            this$0 = ConversationFragment.this;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnClickListener
    {

        final ConversationFragment this$0;

        public void onClick(View view)
        {
            Device.hideSoftKeyboard(view);
            showAddPinFragment();
        }

        _cls7()
        {
            this$0 = ConversationFragment.this;
            super();
        }
    }


    private class _cls8 extends ApiResponseHandler
    {

        final ConversationFragment this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            apiresponse = ((ApiResponse) (apiresponse.getData()));
            if (apiresponse instanceof PinterestJsonObject)
            {
                apiresponse = ConversationMessage.make(_conversationId, (PinterestJsonObject)apiresponse, true);
                Pinalytics.a(EventType.CONVERSATION_MESSAGE_SEND, apiresponse.getMessage().getUid());
                _adapter.addMessage(apiresponse.getMessage());
                showNonPinnerMessage();
            }
        }

        _cls8()
        {
            this$0 = ConversationFragment.this;
            super();
        }
    }


    private class _cls10 extends BaseApiResponseHandler
    {

        final ConversationFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            _handlerTaskScheduled.set(false);
            _handler.postDelayed(_checkNewMessagesTask, 1000L);
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            PinterestJsonObject pinterestjsonobject = (PinterestJsonObject)apiresponse.getData();
            if (pinterestjsonobject == null) goto _L2; else goto _L1
_L1:
            pinterestjsonobject = (PinterestJsonObject)pinterestjsonobject.b().get(_conversationId);
            if (pinterestjsonobject == null) goto _L2; else goto _L3
_L3:
            int i;
            boolean flag = pinterestjsonobject.a("fetch", Boolean.valueOf(false)).booleanValue();
            int j = Math.max(pinterestjsonobject.a("wait", 1) * 1000, 1000);
            PLog.log("ConversationFragment", "shouldFetch: %b wait %d", new Object[] {
                Boolean.valueOf(flag), Integer.valueOf(j)
            });
            i = j;
            if (flag)
            {
                loadConversationMessages();
                i = j;
            }
_L5:
            _bookmark = apiresponse.getBookmark();
            _handler.postDelayed(_checkNewMessagesTask, i);
            _handlerTaskScheduled.set(false);
            return;
_L2:
            i = 1000;
            if (true) goto _L5; else goto _L4
_L4:
        }

        _cls10()
        {
            this$0 = ConversationFragment.this;
            super();
        }
    }


    private class _cls11
        implements Runnable
    {

        final ConversationFragment this$0;

        public void run()
        {
            if (isAdded() && isActive())
            {
                checkForNewMessages();
            }
        }

        _cls11()
        {
            this$0 = ConversationFragment.this;
            super();
        }
    }


    private class _cls3 extends com.pinterest.api.remote.ConversationApi.ConversationMessageResponseHandler
    {

        final ConversationFragment this$0;

        public void onSuccess(ConversationMessagesFeed conversationmessagesfeed)
        {
            super.onSuccess(conversationmessagesfeed);
            int i = _listView.getLastVisiblePosition();
            int j = _adapter.getCount();
            _adapter.mergeFeed(conversationmessagesfeed);
            if (i == j - 1)
            {
                _listView.setSelection(_adapter.getCount() - 1);
            }
        }

        _cls3(String s)
        {
            this$0 = ConversationFragment.this;
            super(s);
        }
    }


    private class _cls2 extends ApiResponseHandler
    {

        final ConversationFragment this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            apiresponse = (PinterestJsonObject)apiresponse.getData();
            if (apiresponse == null)
            {
                break MISSING_BLOCK_LABEL_53;
            }
            apiresponse.a("unread", Integer.valueOf(0));
            _conversation = Conversation.make(apiresponse);
            class _cls1
                implements Runnable
            {

                final _cls2 this$1;

                public void run()
                {
                    updateConversationMetadata();
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    super();
                }
            }

            _listView.post(new _cls1());
            return;
            apiresponse;
            CrashReporting.a(apiresponse);
            return;
        }

        _cls2()
        {
            this$0 = ConversationFragment.this;
            super();
        }
    }


    private class _cls9
        implements Runnable
    {

        final ConversationFragment this$0;

        public void run()
        {
            if (_nonPinnerListFooter == null)
            {
                _nonPinnerListFooter = new TextView(getActivity());
                int i = (int)Resources.dimension(0x7f0a00c5);
                int j = (int)Resources.dimension(0x7f0a00c4);
                _nonPinnerListFooter.setGravity(1);
                _nonPinnerListFooter.setPadding(j, i, j, i);
                _nonPinnerListFooter.setText(0x7f07027f);
                _nonPinnerListFooter.setTextColor(Resources.color(0x7f0e00aa));
                _listView.addFooterView(_nonPinnerListFooter);
            }
        }

        _cls9()
        {
            this$0 = ConversationFragment.this;
            super();
        }
    }


    private class _cls12 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final ConversationFragment this$0;

        public void onAnimationEnd(Animator animator)
        {
            super.onAnimationEnd(animator);
            ViewHelper.setVisibility(_addPinFragment.getView(), 8);
        }

        _cls12()
        {
            this$0 = ConversationFragment.this;
            super();
        }
    }

}
