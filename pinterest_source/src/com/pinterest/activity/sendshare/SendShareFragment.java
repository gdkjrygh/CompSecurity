// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import butterknife.ButterKnife;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.activity.sendapin.events.SendEvent;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.remote.ApiServices;
import com.pinterest.api.remote.SendApi;
import com.pinterest.base.Events;
import com.pinterest.base.PermissionUtil;
import com.pinterest.base.SocialUtils;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.text.PButton;
import com.pinterest.ui.text.PTextView;
import java.util.ArrayList;
import java.util.List;
import org.solovyev.android.views.llm.LinearLayoutManager;

// Referenced classes of package com.pinterest.activity.sendshare:
//            IconTextGridAdapter, ContactsAdapter

public class SendShareFragment extends BaseFragment
{

    static final int CACHE_REFRESH_DELAY_MS = 2000;
    public static final int CONTACT_SUGGESTION_LIMIT = 15;
    public static final String EXTRA_KEY_SENDABLE_OBJECT = "sendableObject";
    RecyclerView _appContainer;
    RecyclerView _contactsContainer;
    View _emptyStateContainer;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    PButton _requestContactsBtn;
    private SendableObject _sendableObject;
    PTextView _titleTv;

    public SendShareFragment()
    {
        _eventsSubscriber = new _cls7();
    }

    private com.pinterest.adapter.IconTextListAdapter.IconText createMoreIconText()
    {
        return new com.pinterest.adapter.IconTextListAdapter.IconText(Resources.drawable(0x7f0201cf), Resources.string(0x7f07036d), null);
    }

    private boolean hasContactPermissions()
    {
        return PermissionUtil.checkPermission(getContext(), "android.permission.READ_CONTACTS");
    }

    private void initAppContainer()
    {
        Object obj = new LinearLayoutManager(getActivity(), 0, false);
        _appContainer.setLayoutManager(((android.support.v7.widget.RecyclerView.LayoutManager) (obj)));
        obj = createMoreIconText();
        IconTextGridAdapter icontextgridadapter = new IconTextGridAdapter(new _cls5());
        List list = SocialUtils.INSTANCE.getAppListForSendShare();
        list.add(obj);
        icontextgridadapter.setItems(list);
        _appContainer.setAdapter(icontextgridadapter);
        _appContainer.setHasFixedSize(true);
        _appContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), 0x7f040000));
    }

    private void initContactsContainer(PinterestJsonArray pinterestjsonarray)
    {
        Object obj;
        ArrayList arraylist;
        int i;
        _contactsContainer.setVisibility(0);
        _emptyStateContainer.setVisibility(8);
        obj = new DefaultItemAnimator();
        ((DefaultItemAnimator) (obj)).setAddDuration(Resources.integer(0x10e0002).intValue());
        _contactsContainer.setItemAnimator(((android.support.v7.widget.RecyclerView.ItemAnimator) (obj)));
        obj = new ContactsAdapter(new _cls4());
        TypeAheadItem typeaheaditem = new TypeAheadItem();
        typeaheaditem.setItemType(com.pinterest.activity.search.model.TypeAheadItem.ItemType.SEARCH_PLACEHOLDER);
        arraylist = new ArrayList(pinterestjsonarray.a() + 1);
        arraylist.add(typeaheaditem);
        i = 0;
_L9:
        if (i >= pinterestjsonarray.a()) goto _L2; else goto _L1
_L1:
        TypeAheadItem typeaheaditem1;
        Object obj1;
        PinterestJsonObject pinterestjsonobject;
        obj1 = pinterestjsonarray.c(i);
        typeaheaditem1 = new TypeAheadItem();
        pinterestjsonobject = ((PinterestJsonObject) (obj1)).c("user");
        if (pinterestjsonobject == null) goto _L4; else goto _L3
_L3:
        typeaheaditem1.setItem(pinterestjsonobject);
_L7:
        if (!TextUtils.isEmpty(typeaheaditem1.getTitle()))
        {
            arraylist.add(typeaheaditem1);
        }
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        obj1 = ((PinterestJsonObject) (obj1)).e("external_users");
        if (((PinterestJsonArray) (obj1)).a() == 0) goto _L6; else goto _L5
_L5:
        typeaheaditem1.setItem(((PinterestJsonArray) (obj1)).c(0));
        if (true) goto _L7; else goto _L2
_L2:
        ((ContactsAdapter) (obj)).setContacts(arraylist);
        _contactsContainer.setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (obj)));
        pinterestjsonarray = new LinearLayoutManager(getActivity(), 0, false);
        _contactsContainer.setLayoutManager(pinterestjsonarray);
        _contactsContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), 0x7f040000));
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void initEmptyStateContactsContainer()
    {
        _contactsContainer.setVisibility(8);
        _emptyStateContainer.setVisibility(0);
        _requestContactsBtn.setOnClickListener(new _cls2());
    }

    private void initTitle()
    {
        if (_sendableObject.getType() == 0)
        {
            _titleTv.setText(0x7f07050d);
        } else
        if (_sendableObject.getType() == 1)
        {
            _titleTv.setText(0x7f070509);
            return;
        }
    }

    private void navigateToPermissionSettingsGuide()
    {
        Events.post(new SendShareDismissEvent());
        Events.post(new Navigation(Location.APP_PERMISSION_SETTINGS_GUIDE));
    }

    private void navigateToSearch()
    {
        Navigation navigation = new Navigation(Location.SEND_SHARE_SEARCH);
        navigation.putExtra("sendableObject", _sendableObject);
        Events.post(navigation);
        Events.post(new SendShareDismissEvent());
        Pinalytics.a(ElementType.SUGGESTED_CONTACT_LIST_SEARCH_ITEM, ComponentType.SEND_SHARE);
    }

    private void requestContactPermissions()
    {
        PermissionUtil.checkPermissionAsync((BaseActivity)getContext(), "android.permission.READ_CONTACTS", 0x7f070179, new _cls3());
    }

    private void updateContactsSuggestionsCache()
    {
        (new _cls6()).schedule(2000L);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300ff;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.a(this);
        Events.unregister(_eventsSubscriber);
    }

    public void onPause()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/activity/sendshare/SendShareFragment$SendShareNavigateToSearchEvent, com/pinterest/activity/sendshare/SendShareFragment$SendShareNavigateToPermissionsSettingsGuideEvent
        });
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        Events.registerSticky(_eventsSubscriber, com/pinterest/activity/sendshare/SendShareFragment$SendShareNavigateToSearchEvent, new Class[] {
            com/pinterest/activity/sendshare/SendShareFragment$SendShareNavigateToPermissionsSettingsGuideEvent
        });
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        Events.register(_eventsSubscriber, com/pinterest/activity/sendshare/SendShareFragment$SendShareDismissEvent, new Class[] {
            com/pinterest/activity/sendapin/events/SendEvent
        });
        if (_sendableObject != null)
        {
            _emptyStateContainer.setVisibility(8);
            initTitle();
            _apiServices.b.b(new _cls1(), "SEND_API_CACHE");
            initAppContainer();
        }
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation != null && navigation.getExtra("sendableObject") != null)
        {
            _sendableObject = (SendableObject)navigation.getExtra("sendableObject");
            return;
        } else
        {
            PLog.error("No object to send and share", new Object[0]);
            return;
        }
    }











    private class _cls7
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final SendShareFragment this$0;

        public void onEventMainThread(SendEvent sendevent)
        {
            Events.post(new SendShareDismissEvent());
            SendShareUtils.getInstance().sendToTypeAheadItem(sendevent.getItem(), _sendableObject);
            updateContactsSuggestionsCache();
        }

        public void onEventMainThread(SendShareDismissEvent sendsharedismissevent)
        {
            pressBackButton();
        }

        public void onEventMainThread(SendShareNavigateToPermissionsSettingsGuideEvent sendsharenavigatetopermissionssettingsguideevent)
        {
            navigateToPermissionSettingsGuide();
            Events.removeStickyEvent(sendsharenavigatetopermissionssettingsguideevent);
        }

        public void onEventMainThread(SendShareNavigateToSearchEvent sendsharenavigatetosearchevent)
        {
            navigateToSearch();
            Events.removeStickyEvent(sendsharenavigatetosearchevent);
        }

        _cls7()
        {
            this$0 = SendShareFragment.this;
            super();
        }
    }


    private class _cls5
        implements IconTextGridAdapter.OnItemClickListener
    {

        final SendShareFragment this$0;
        final Context val$context;
        final com.pinterest.adapter.IconTextListAdapter.IconText val$moreIconText;

        public void onItemClick(com.pinterest.adapter.IconTextListAdapter.IconText icontext)
        {
            if (Experiments.L())
            {
                InviteUtil.setInviteSource("send_share_main_dialog");
                SocialUtils.shareWithInviteCode(context, _sendableObject, icontext.meta, getApiTag());
            } else
            {
                if (icontext == moreIconText)
                {
                    SocialUtils.startShare(context, _sendableObject, null, null, null);
                } else
                {
                    SocialUtils.startShare(context, _sendableObject, icontext.text, icontext.meta, null);
                }
                Events.post(new SendShareDismissEvent());
            }
            Pinalytics.a(ElementType.APP_LIST_ITEM, ComponentType.SEND_SHARE, icontext.text);
        }

        _cls5()
        {
            this$0 = SendShareFragment.this;
            context = context1;
            moreIconText = icontext;
            super();
        }
    }


    private class _cls4
        implements ContactsAdapter.OnItemClickListener
    {

        final SendShareFragment this$0;

        public void onItemClick(TypeAheadItem typeaheaditem, int i)
        {
            if (typeaheaditem.getItemType() == com.pinterest.activity.search.model.TypeAheadItem.ItemType.SEARCH_PLACEHOLDER)
            {
                navigateToSearch();
                return;
            } else
            {
                Events.post(new SendEvent(typeaheaditem));
                Pinalytics.a(ElementType.SUGGESTED_CONTACT_LIST_ITEM, ComponentType.SEND_SHARE, String.valueOf(i));
                return;
            }
        }

        _cls4()
        {
            this$0 = SendShareFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final SendShareFragment this$0;

        public void onClick(View view)
        {
            requestContactPermissions();
        }

        _cls2()
        {
            this$0 = SendShareFragment.this;
            super();
        }
    }


    private class SendShareDismissEvent
    {

        public SendShareDismissEvent()
        {
        }
    }


    private class _cls3
        implements android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    {

        final SendShareFragment this$0;

        public void onRequestPermissionsResult(int i, String as[], int ai[])
        {
            if (hasContactPermissions())
            {
                Events.postSticky(new SendShareNavigateToSearchEvent());
            } else
            if (PermissionUtil.isPermissionDeniedPermanently(getActivity(), "android.permission.READ_CONTACTS"))
            {
                Events.postSticky(new SendShareNavigateToPermissionsSettingsGuideEvent());
                return;
            }
        }

        _cls3()
        {
            this$0 = SendShareFragment.this;
            super();
        }

        private class SendShareNavigateToSearchEvent
        {

            public SendShareNavigateToSearchEvent()
            {
            }
        }


        private class SendShareNavigateToPermissionsSettingsGuideEvent
        {

            public SendShareNavigateToPermissionsSettingsGuideEvent()
            {
            }
        }

    }



    private class _cls1 extends ApiResponseHandler
    {

        final SendShareFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            if (_contactsContainer == null || _emptyStateContainer == null)
            {
                return;
            }
            if (hasContactPermissions())
            {
                initContactsContainer(new PinterestJsonArray());
                return;
            } else
            {
                initEmptyStateContactsContainer();
                return;
            }
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            if (_contactsContainer == null || _emptyStateContainer == null)
            {
                return;
            }
            apiresponse = (PinterestJsonArray)apiresponse.getData();
            if (apiresponse.a() > 0 || hasContactPermissions())
            {
                initContactsContainer(apiresponse);
                return;
            } else
            {
                onFailure(null, null);
                return;
            }
        }

        _cls1()
        {
            this$0 = SendShareFragment.this;
            super();
        }
    }

}
