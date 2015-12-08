// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.activity.notifications.util.RecentConversations;
import com.pinterest.activity.sendapin.adapter.SendPinAdapter;
import com.pinterest.activity.sendapin.events.SendEvent;
import com.pinterest.activity.sendapin.events.SendPinMessageChangeEvent;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.base.Events;
import com.pinterest.base.PermissionUtil;
import com.pinterest.kit.activity.BaseActivity;

// Referenced classes of package com.pinterest.activity.sendapin.ui:
//            SendPinListView

public class PeoplePickerListWrapper extends FrameLayout
{

    private static final int SCROLL_TO_SEARCH_DELAY = 100;
    private static final int SMOOTH_SCROLL_DURATION = 200;
    public static final int TOAST_SHOW_DELAY_MS = 250;
    private SendPinAdapter _adapter;
    private String _apiTag;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private Rect _headerDisplayRect;
    private SparseBooleanArray _headerViewStatus;
    private LinearLayout _headersContainer;
    private SendPinListView _listView;
    private SendableObject _objectToSend;
    private android.widget.AbsListView.OnScrollListener _onListViewScroll;
    private TextWatcher _onSearchQueryChanged;
    private android.widget.AdapterView.OnItemClickListener _peopleListOnItemClickListener;
    private boolean _searchBarTapped;
    private ViewGroup _searchHeader;
    private EditText _searchHeaderEt;
    private Rect childDisplayRect;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private android.view.View.OnClickListener onSearchBarClickListener;

    public PeoplePickerListWrapper(Context context)
    {
        this(context, null, 0);
    }

    public PeoplePickerListWrapper(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PeoplePickerListWrapper(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _headerViewStatus = new SparseBooleanArray();
        _headerDisplayRect = new Rect();
        childDisplayRect = new Rect();
        onGlobalLayoutListener = new _cls2();
        _searchBarTapped = false;
        _onListViewScroll = new _cls3();
        onSearchBarClickListener = new _cls4();
        _onSearchQueryChanged = new _cls5();
        _eventsSubscriber = new _cls6();
        _peopleListOnItemClickListener = new _cls7();
    }

    private void addHeader(int i, int j)
    {
        View view = _adapter.getHeaderView(i);
        _headersContainer.addView(view, j);
        _headerViewStatus.put(i, true);
        view.requestFocus();
    }

    private void addStickyHeaders()
    {
        int ai[] = _adapter.getHeaderPositions();
        for (int i = 0; i < ai.length; i++)
        {
            int j = ai[i];
            if (!_headerViewStatus.get(j))
            {
                addHeader(j, i);
            }
        }

    }

    private BaseActivity getActivity()
    {
        if (getContext() instanceof BaseActivity)
        {
            return (BaseActivity)getContext();
        } else
        {
            return null;
        }
    }

    private void removeHeader(int i)
    {
        View view = _adapter.getHeaderView(i);
        _headersContainer.removeView(view);
        _headerViewStatus.put(i, false);
        if (i == 2)
        {
            _adapter.syncText();
        }
    }

    private void requestPermissionForContactsSearch()
    {
        PermissionUtil.checkPermissionAsync(getActivity(), "android.permission.READ_CONTACTS", 0x7f07017a, new _cls8());
    }

    private void scrollToSearchFromTop()
    {
        _listView.smoothScrollToPositionFromTop(1, 0, 200);
        _searchBarTapped = true;
        addStickyHeaders();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Events.register(_eventsSubscriber, com/pinterest/base/Social$UpdateEvent, new Class[0]);
    }

    protected void onDetachedFromWindow()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/base/Social$UpdateEvent
        });
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        _headersContainer = new LinearLayout(getContext());
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.gravity = 48;
        _headersContainer.setLayoutParams(layoutparams);
        _headersContainer.setOrientation(1);
        addView(_headersContainer);
        _listView = (SendPinListView)findViewById(0x7f0f01e4);
        _adapter = new SendPinAdapter(getContext());
        _adapter.setApiTag(_apiTag);
        _adapter.setSearchBarOnClickAndLongPressListener(onSearchBarClickListener);
        _listView.setAdapter(_adapter);
        _listView.setOnScrollListener(_onListViewScroll);
        _listView.setOnItemClickListener(_peopleListOnItemClickListener);
        _searchHeader = (ViewGroup)_adapter.getHeaderView(2);
        _searchHeaderEt = (EditText)_searchHeader.findViewById(0x7f0f0236);
        _searchHeaderEt.addTextChangedListener(_onSearchQueryChanged);
        if (!RecentConversations.hasRecent())
        {
            postDelayed(new _cls1(), 100L);
        }
    }

    public void registerForSendEvents()
    {
        Events.register(_eventsSubscriber, com/pinterest/activity/sendapin/events/SendEvent, new Class[] {
            com/pinterest/activity/sendapin/events/SendPinMessageChangeEvent, com/pinterest/activity/sendapin/ui/SendSocialView$SendSocialEvent
        });
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setObjectToSend(SendableObject sendableobject)
    {
        _objectToSend = sendableobject;
        if (sendableobject.isPin())
        {
            _adapter.setTitle(0x7f07050f);
            _adapter.setEmptySearchCellText(0x7f070271);
        } else
        if (sendableobject.isBoard())
        {
            _adapter.setTitle(0x7f07050b);
            _adapter.setEmptySearchCellText(0x7f070270);
            return;
        }
    }

    public void unregisterForSendEvents()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/activity/sendapin/events/SendEvent, com/pinterest/activity/sendapin/events/SendPinMessageChangeEvent, com/pinterest/activity/sendapin/ui/SendSocialView$SendSocialEvent
        });
    }










/*
    static boolean access$302(PeoplePickerListWrapper peoplepickerlistwrapper, boolean flag)
    {
        peoplepickerlistwrapper._searchBarTapped = flag;
        return flag;
    }

*/







    private class _cls2
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final PeoplePickerListWrapper this$0;

        public void onGlobalLayout()
        {
            if (_adapter.onScreenHeightChanged(getMeasuredHeight()))
            {
                _listView.restoreTranslation();
            }
        }

        _cls2()
        {
            this$0 = PeoplePickerListWrapper.this;
            super();
        }
    }


    private class _cls3
        implements android.widget.AbsListView.OnScrollListener
    {

        final PeoplePickerListWrapper this$0;

        private void getHeaderContainerHitRect(Rect rect)
        {
label0:
            {
                if (rect != null)
                {
                    if (_headersContainer.getChildCount() != 0)
                    {
                        break label0;
                    }
                    rect.setEmpty();
                }
                return;
            }
            _headersContainer.getHitRect(rect);
        }

        private boolean shouldDrawHeader(Rect rect, Rect rect1)
        {
            return rect1.top <= rect.bottom;
        }

        private boolean shouldRemoveHeader(Rect rect, Rect rect1)
        {
            return rect1.bottom > rect.bottom;
        }

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
            int ai[];
            if (k <= 0)
            {
                break MISSING_BLOCK_LABEL_277;
            }
            ai = _adapter.getHeaderPositions();
            getHeaderContainerHitRect(_headerDisplayRect);
            k = 0;
_L2:
            int l;
            if (k >= ai.length)
            {
                break MISSING_BLOCK_LABEL_277;
            }
            l = ai[k];
            if (l >= i)
            {
                break; /* Loop/switch isn't completed */
            }
            if (!_headerViewStatus.get(l))
            {
                addHeader(l, k);
            }
_L4:
            k++;
            if (true) goto _L2; else goto _L1
_L1:
            if (l > i + j) goto _L4; else goto _L3
_L3:
            int i1 = l - i;
            View view = abslistview.getChildAt(i1);
            if (view == null)
            {
                break MISSING_BLOCK_LABEL_277;
            }
            view.getHitRect(childDisplayRect);
            boolean flag = _headerViewStatus.get(l);
            PLog.logv("%d ChildRect %s: %d HeaderRect %s isHeaderAdded %b", new Object[] {
                Integer.valueOf(i1), childDisplayRect.flattenToString(), Integer.valueOf(k), _headerDisplayRect.flattenToString(), Boolean.valueOf(flag)
            });
            if (!flag && shouldDrawHeader(_headerDisplayRect, childDisplayRect))
            {
                addHeader(l, k);
            } else
            if (flag && shouldRemoveHeader(_headerDisplayRect, childDisplayRect))
            {
                removeHeader(l);
            }
              goto _L4
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
            if (i == 0)
            {
                _listView.saveTranslation();
                if (_searchBarTapped)
                {
                    _searchHeaderEt.requestFocusFromTouch();
                    Device.showSoftKeyboard(_searchHeaderEt);
                    _searchBarTapped = false;
                }
            } else
            if (i == 1)
            {
                Device.hideSoftKeyboard(_searchHeaderEt);
                Device.hideSoftKeyboard(_listView);
                return;
            }
        }

        _cls3()
        {
            this$0 = PeoplePickerListWrapper.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final PeoplePickerListWrapper this$0;

        public void onClick(View view)
        {
            scrollToSearchFromTop();
        }

        _cls4()
        {
            this$0 = PeoplePickerListWrapper.this;
            super();
        }
    }


    private class _cls5
        implements TextWatcher
    {

        final PeoplePickerListWrapper this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            charsequence = StringUtils.trimToEmpty(charsequence.toString());
            _adapter.onSearchQueryChanged(charsequence);
        }

        _cls5()
        {
            this$0 = PeoplePickerListWrapper.this;
            super();
        }
    }


    private class _cls6
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PeoplePickerListWrapper this$0;

        public void onEventMainThread(final SendEvent event)
        {
            event.setObjectToSend(_objectToSend);
            event.setMessage(_adapter.getMessage());
            getActivity().finish();
            class _cls1
                implements Runnable
            {

                final _cls6 this$1;
                final SendEvent val$event;

                public void run()
                {
                    Events.post(new ToastEvent(new SendToast(event)));
                }

                _cls1()
                {
                    this$1 = _cls6.this;
                    event = sendevent;
                    super();
                }
            }

            postDelayed(new _cls1(), 250L);
        }

        public void onEventMainThread(SendPinMessageChangeEvent sendpinmessagechangeevent)
        {
            _adapter.setMessage(sendpinmessagechangeevent.getMessage());
        }

        public void onEventMainThread(SendSocialView.SendSocialEvent sendsocialevent)
        {
            SocialUtils.startShare(getContext(), _objectToSend, sendsocialevent.text, sendsocialevent.packageName, _adapter.getMessage());
        }

        public void onEventMainThread(com.pinterest.base.Social.UpdateEvent updateevent)
        {
            switch (_cls9..SwitchMap.com.pinterest.base.Social.Network[updateevent.getNetwork().ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                _adapter.onFacebookConnected();
                break;
            }
        }

        _cls6()
        {
            this$0 = PeoplePickerListWrapper.this;
            super();
        }

        private class _cls9
        {

            static final int $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[];
            static final int $SwitchMap$com$pinterest$base$Social$Network[];

            static 
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType = new int[com.pinterest.activity.search.model.TypeAheadItem.ItemType.values().length];
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.FACEBOOK_CONTACT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMAIL_PLACEHOLDER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.CONNECT_FB_PLACEHOLDER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.MUTUAL_FOLLOW.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMAIL_CONTACT.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.CONVERSATION.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.PINNER.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.CONTACT_NOT_FOUND_MISSING_PERMISSION.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                $SwitchMap$com$pinterest$base$Social$Network = new int[com.pinterest.base.Social.Network.values().length];
                try
                {
                    $SwitchMap$com$pinterest$base$Social$Network[com.pinterest.base.Social.Network.FACEBOOK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class _cls7
        implements android.widget.AdapterView.OnItemClickListener
    {

        final PeoplePickerListWrapper this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (i == 0)
            {
                getActivity().finish();
            } else
            {
                view = ((View) (_adapter.getItem(i)));
                adapterview = view;
                if (view instanceof Conversation)
                {
                    view = (Conversation)view;
                    adapterview = new TypeAheadItem();
                    adapterview.setIdentifier(view.getUid());
                    adapterview.setUid(view.getUid());
                    adapterview.setTitle(view.getConversationTitle());
                    adapterview.setItemType(com.pinterest.activity.search.model.TypeAheadItem.ItemType.CONVERSATION);
                    view = view.getConversationImageUrls();
                    if (view != null && !view.isEmpty())
                    {
                        adapterview.setImageUri((String)view.get(0));
                    }
                }
                if (adapterview instanceof TypeAheadItem)
                {
                    adapterview = (TypeAheadItem)adapterview;
                    switch (_cls9..SwitchMap.com.pinterest.activity.search.model.TypeAheadItem.ItemType[adapterview.getItemType().ordinal()])
                    {
                    default:
                        return;

                    case 1: // '\001'
                    case 2: // '\002'
                        view = _searchHeaderEt.getText().toString();
                        if (SignupFormUtils.isEmailValid(view))
                        {
                            adapterview.setTitle(view);
                            adapterview.setItemType(com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMAIL_CONTACT);
                            adapterview.setIdentifier(view);
                            Events.post(new SendEvent(adapterview));
                            return;
                        } else
                        {
                            Application.showToast(0x7f0702fa);
                            return;
                        }

                    case 3: // '\003'
                        Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.FACEBOOK));
                        return;

                    case 4: // '\004'
                    case 5: // '\005'
                    case 6: // '\006'
                    case 7: // '\007'
                        Device.hideSoftKeyboard(_searchHeaderEt);
                        Pinalytics.a(ElementType.USER_LIST_USER, ComponentType.USER_FEED);
                        Events.post(new SendEvent(adapterview));
                        return;

                    case 8: // '\b'
                        requestPermissionForContactsSearch();
                        return;
                    }
                }
            }
        }

        _cls7()
        {
            this$0 = PeoplePickerListWrapper.this;
            super();
        }
    }


    private class _cls8
        implements android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    {

        final PeoplePickerListWrapper this$0;

        public void onRequestPermissionsResult(int i, String as[], int ai[])
        {
            if (PermissionUtil.checkPermission(getContext(), "android.permission.READ_CONTACTS"))
            {
                _adapter.refresh();
            }
        }

        _cls8()
        {
            this$0 = PeoplePickerListWrapper.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final PeoplePickerListWrapper this$0;

        public void run()
        {
            scrollToSearchFromTop();
        }

        _cls1()
        {
            this$0 = PeoplePickerListWrapper.this;
            super();
        }
    }

}
