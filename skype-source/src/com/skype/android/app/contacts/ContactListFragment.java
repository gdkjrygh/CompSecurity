// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.skype.Account;
import com.skype.Contact;
import com.skype.ContactGroup;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.SkypeListFragment;
import com.skype.android.ads.AdPlacement;
import com.skype.android.ads.AdPlacer;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.ExperimentEvent;
import com.skype.android.analytics.ExperimentTag;
import com.skype.android.analytics.ExperimentTelemetryEvent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.ObjectInterfaceMenuDialog;
import com.skype.android.app.data.OnUserEventListener;
import com.skype.android.app.favorites.FavoritesPickContactsFragment;
import com.skype.android.app.mnv.MnvAnalytics;
import com.skype.android.app.mnv.MnvCases;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.sync.ContactsIngestManager;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.IntegerQueueSet;
import com.skype.android.util.UpdateScheduler;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.async.UiCallback;
import com.skype.android.widget.ProgressCircleView;
import com.skype.android.widget.ScaleGestureDetectorHolder;
import com.skype.android.widget.SemanticZoomAdapter;
import com.skype.android.widget.SemanticZoomGestureDetector;
import com.skype.android.widget.SeparatedColumnsAdapter;
import com.skype.android.widget.ZoomRelativeLayout;
import com.skype.android.widget.fastscroll.LayoutCostMeter;
import com.skype.android.widget.recycler.OneWayRecyclerView;
import com.skype.android.widget.recycler.RecyclerListDecorator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactFilter, a, b, ContactAdapter, 
//            ContactGroupLoader, ContactDirectorySearchActivity, ContactMenuBuilder, ContactItem, 
//            ContactPickerActivity

public class ContactListFragment extends SkypeListFragment
    implements android.os.Handler.Callback, android.view.View.OnClickListener, android.view.View.OnTouchListener, android.widget.AdapterView.OnItemSelectedListener, com.skype.android.app.ObjectInterfaceMenuDialog.MenuCallback, OnUserEventListener, AsyncCallback
{

    private static final int SECONDS = 1000;
    private static final int SPINNER_TIMEOUT = 15000;
    private static final int WHAT_UPDATE_ALL = 1;
    private static final int WHAT_UPDATE_QUEUED = 2;
    AccessibilityUtil accessibilityUtil;
    Account account;
    AdPlacer adPlacer;
    ContactAdapter adapter;
    Button addContactsButton;
    TextView addContactsText;
    TextView addFavorites;
    private ArrayList allFilterButtons;
    Analytics analytics;
    AsyncService async;
    private SeparatedColumnsAdapter columnsAdapter;
    private ContactMenuBuilder contactMenuBuilder;
    ContactUtil contactUtil;
    ContactsIngestManager contactsIngestManager;
    ConversationUtil conversationUtil;
    EcsConfiguration ecsConfiguration;
    View emptyView;
    private a filterAdapter;
    private boolean filterExpanded;
    private Spinner filterSelector;
    private View footerAddFavoritesView;
    private View headerAddFriendsView;
    LayoutExperience layoutExperience;
    private LayoutCostMeter lcm;
    SkyLib lib;
    ObjectIdMap map;
    MnvAnalytics mnvAnalytics;
    MnvCases mnvCases;
    Navigation nav;
    private ScaleGestureDetector pinchDetector;
    private boolean restoreSemanticZoom;
    RecyclerView semanticZoom;
    private SemanticZoomAdapter semanticZoomAdapter;
    ZoomRelativeLayout semanticZoomLayout;
    private IntegerQueueSet updateQueue;
    private UpdateScheduler updateScheduler;
    UserPreferences userPrefs;
    private SemanticZoomGestureDetector zoomGestureDetector;

    public ContactListFragment()
    {
    }

    private void addAdBanner(RecyclerListDecorator recyclerlistdecorator)
    {
        if (ecsConfiguration.isAdEnabled())
        {
            final View banner = adPlacer.a(AdPlacement.c, getActivity());
            if (banner != null)
            {
                adPlacer.b(AdPlacement.c, true);
                recyclerlistdecorator.a(banner);
                getListView().addOnScrollListener(new android.support.v7.widget.RecyclerView.m() {

                    final ContactListFragment this$0;
                    final View val$banner;

                    public final void onScrollStateChanged(RecyclerView recyclerview, int i)
                    {
                        boolean flag1 = true;
                        i = ((LinearLayoutManager)recyclerview.getLayoutManager()).findFirstVisibleItemPosition();
                        boolean flag = flag1;
                        if (i != 0)
                        {
                            if (i == 1 && banner.getHeight() == 0)
                            {
                                flag = flag1;
                            } else
                            {
                                flag = false;
                            }
                        }
                        adPlacer.b(AdPlacement.c, flag);
                    }

            
            {
                this$0 = ContactListFragment.this;
                banner = view;
                super();
            }
                });
            }
        }
    }

    private void addAddFriendsHeader(RecyclerListDecorator recyclerlistdecorator)
    {
        if (ecsConfiguration.getExpAddFriendsFromContactList().equals(ExperimentTag.e))
        {
            headerAddFriendsView = getActivity().getLayoutInflater().inflate(0x7f030062, getListView(), false);
            headerAddFriendsView.setVisibility(8);
            headerAddFriendsView.setOnClickListener(new android.view.View.OnClickListener() {

                final ContactListFragment this$0;

                public final void onClick(View view)
                {
                    nav.launchMobileVerification(com.skype.android.app.mnv.MnvCases.REFERRER.CONTACT_LIST);
                    analytics.a(new ExperimentTelemetryEvent(ExperimentEvent.a, ExperimentTag.d));
                    mnvAnalytics.report(AnalyticsEvent.cT);
                }

            
            {
                this$0 = ContactListFragment.this;
                super();
            }
            });
            recyclerlistdecorator.a(headerAddFriendsView);
        }
    }

    private void addContactFilter(View view, int i, ContactFilter.FilterType filtertype)
    {
        view = (Button)view.findViewById(i);
        if (view != null)
        {
            view.setOnClickListener(this);
            view.setVisibility(0);
            view.setTag(new ContactFilter(getActivity(), contactUtil, filtertype));
            allFilterButtons.add(view);
        }
    }

    private void addFilterHeader(RecyclerListDecorator recyclerlistdecorator)
    {
        View view = getActivity().getLayoutInflater().inflate(0x7f030061, null);
        filterSelector = (Spinner)view.findViewById(0x7f100317);
        filterAdapter = new a(getActivity(), contactUtil, ecsConfiguration);
        filterAdapter.setGroups(contactUtil.a());
        filterSelector.setAdapter(filterAdapter);
        filterSelector.setOnItemSelectedListener(this);
        filterSelector.setOnTouchListener(this);
        ViewUtil.a(filterSelector);
        recyclerlistdecorator.a(view);
    }

    private void addGestureDetector()
    {
        android.content.Context context = getActivity().getApplicationContext();
        zoomGestureDetector = new SemanticZoomGestureDetector(semanticZoom, getListView());
        pinchDetector = new ScaleGestureDetector(context, zoomGestureDetector);
    }

    private void createContactFilters(View view)
    {
        allFilterButtons = new ArrayList();
        addContactFilter(view, 0x7f100312, ContactFilter.FilterType.ALL);
        addContactFilter(view, 0x7f100313, ContactFilter.FilterType.SKYPE);
        addContactFilter(view, 0x7f100314, ContactFilter.FilterType.AVAILABLE);
        if (ecsConfiguration.isAgentSuggestionsEnabled())
        {
            addContactFilter(view, 0x7f100315, ContactFilter.FilterType.AGENTS);
        }
        Object obj = contactUtil.a();
        Collections.sort(((List) (obj)), new b());
        view = (LinearLayout)view.findViewById(0x7f100316);
        Button button;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); view.addView(button))
        {
            ContactGroup contactgroup = (ContactGroup)((Iterator) (obj)).next();
            button = (Button)LayoutInflater.from(getActivity()).inflate(0x7f03005f, null);
            button.setText(contactgroup.getGivenDisplaynameProp());
            button.setOnClickListener(this);
            button.setTag(new ContactFilter(getActivity(), contactUtil, contactgroup));
            allFilterButtons.add(button);
        }

    }

    private void displayPreferredFilter()
    {
        ContactFilter contactfilter = getPreferredFilter();
        if (!layoutExperience.isMultipane()) goto _L2; else goto _L1
_L1:
label0:
        {
            Iterator iterator = allFilterButtons.iterator();
            Button button;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                button = (Button)iterator.next();
            } while (!(button.getTag() instanceof ContactFilter) || !((ContactFilter)button.getTag()).equals(contactfilter));
            button.setSelected(true);
        }
_L4:
        return;
_L2:
        int i = 0;
        while (i < filterAdapter.getCount()) 
        {
            if (((ContactFilter)filterAdapter.getItem(i)).equals(contactfilter))
            {
                filterSelector.setSelection(i, true);
                return;
            }
            i++;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private ContactFilter getPreferredFilter()
    {
        return new ContactFilter(getActivity(), contactUtil, userPrefs);
    }

    private void loadContacts()
    {
        updateScheduler.a(1);
    }

    private void setEmptyViewVisibility()
    {
        updateEmptyListDisplay();
        emptyView.findViewById(0x7f10030b).setVisibility(0);
        showSpinner(4);
    }

    private boolean shouldAutoBuddy()
    {
        return ecsConfiguration.isShortCircuitEnabled() && mnvCases.isDeviceReady(com.skype.android.app.mnv.MnvCases.REFERRER.CONTACT_LIST, layoutExperience.isMultipane()) && !userPrefs.isAutoBuddyEnabledInLocalCache();
    }

    private void showContactProgress()
    {
        emptyView.setVisibility(0);
        emptyView.findViewById(0x7f10030b).setVisibility(4);
        emptyView.findViewById(0x7f10030e).setVisibility(4);
        showSpinner(0);
        emptyView.postDelayed(new Runnable() {

            final ContactListFragment this$0;

            public final void run()
            {
                if (isVisible())
                {
                    setEmptyViewVisibility();
                }
            }

            
            {
                this$0 = ContactListFragment.this;
                super();
            }
        }, 15000L);
    }

    private void showSpinner(int i)
    {
        Object obj = emptyView.findViewById(0x7f10030a);
        if (obj != null)
        {
            ((View) (obj)).setVisibility(i);
            ((ProgressCircleView)((View) (obj)).findViewById(0x7f1004d0)).setVisibility(i);
            if (i == 0)
            {
                obj = (TextView)ViewUtil.a(((View) (obj)), 0x7f1004d1);
                CharSequence charsequence = getText(0x7f0803a1);
                ((TextView) (obj)).setText(charsequence);
                ((TextView) (obj)).setContentDescription(charsequence);
                ((TextView) (obj)).setTextColor(getResources().getColor(0x7f0f0122));
                ((TextView) (obj)).setVisibility(i);
            }
        }
    }

    private void updateAdapterFilter(ContactFilter contactfilter)
    {
        if (adapter != null)
        {
            adapter.applyFilter(contactfilter);
            if (contactfilter != null)
            {
                if (filterExpanded || layoutExperience.isMultipane())
                {
                    contactfilter.save(userPrefs);
                }
                loadContacts();
                updateFavoritesFooterVisibility(contactfilter);
            }
        }
    }

    private void updateContact(int i)
    {
        updateQueue.a(Integer.valueOf(i));
        updateScheduler.a(2);
    }

    private void updateEmptyGroupDisplay(ContactFilter.FilterType filtertype)
    {
        Button button = (Button)emptyView.findViewById(0x7f10030e);
        TextView textview = (TextView)emptyView.findViewById(0x7f10030d);
        static final class _cls7
        {

            static final int $SwitchMap$com$skype$PROPKEY[];
            static final int $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[];

            static 
            {
                $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType = new int[ContactFilter.FilterType.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[ContactFilter.FilterType.ALL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[ContactFilter.FilterType.SKYPE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[ContactFilter.FilterType.AVAILABLE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[ContactFilter.FilterType.AGENTS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[ContactFilter.FilterType.GROUP.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_AVATAR_IMAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_AVAILABILITY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_MOOD_TEXT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_DISPLAYNAME.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_GIVEN_DISPLAYNAME.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_FULLNAME.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_PINNED_ORDER.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.USER_ISBLOCKED.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.USER_BUDDYSTATUS.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.ACCOUNT_CBLSYNCSTATUS.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.ACCOUNT_STATUS.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_NROF_AUTHED_BUDDIES.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls7..SwitchMap.com.skype.android.app.contacts.ContactFilter.FilterType[filtertype.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            button.setVisibility(0);
            if (shouldAutoBuddy())
            {
                button.setText(getString(0x7f080479));
                textview.setText(getString(0x7f08047a));
                return;
            } else
            {
                button.setText(getString(0x7f08047c));
                textview.setText(getString(0x7f0802a7));
                return;
            }

        case 3: // '\003'
            button.setVisibility(8);
            textview.setText(getString(0x7f0802e7));
            return;

        case 4: // '\004'
            button.setVisibility(8);
            textview.setText(getString(0x7f0802e6));
            return;

        case 5: // '\005'
            button.setVisibility(8);
            textview.setText(getString(0x7f0802b9));
            return;
        }
    }

    private void updateEmptyListDisplay()
    {
        boolean flag = false;
        boolean flag1 = adapter.isEmpty();
        ContactFilter.FilterType filtertype = adapter.getContactFilter().getFilterType();
        View view;
        int i;
        if (flag1)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        emptyView.setVisibility(i);
        view = emptyView.findViewById(0x7f10030b);
        if (filtertype != ContactFilter.FilterType.FAVORITES)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        view = emptyView.findViewById(0x7f10030f);
        if (view != null)
        {
            if (filtertype == ContactFilter.FilterType.FAVORITES)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }
        if (flag1)
        {
            updateEmptyGroupDisplay(filtertype);
        }
        adPlacer.a(AdPlacement.c, flag1);
        updateHeaderAddFriendsVisibility(flag1);
        getListView().getAdapter().notifyDataSetChanged();
    }

    private void updateFavoritesFooterVisibility(ContactFilter contactfilter)
    {
label0:
        {
            byte byte0 = 8;
            if (footerAddFavoritesView != null)
            {
                if (contactfilter.getFilterType() != ContactFilter.FilterType.FAVORITES)
                {
                    break label0;
                }
                contactfilter = footerAddFavoritesView;
                if (!adapter.isEmpty())
                {
                    byte0 = 0;
                }
                contactfilter.setVisibility(byte0);
            }
            return;
        }
        footerAddFavoritesView.setVisibility(8);
    }

    private void updateGestureDetector()
    {
        if (adapter.hasGroupHeaders())
        {
            addGestureDetector();
            return;
        } else
        {
            pinchDetector = null;
            return;
        }
    }

    public void done(AsyncResult asyncresult)
    {
        if (!asyncresult.e()) goto _L2; else goto _L1
_L1:
        Integer integer;
        setListShown(true);
        integer = (Integer)asyncresult.b();
        asyncresult = (List)asyncresult.a();
        integer.intValue();
        JVM INSTR tableswitch 1 2: default 60
    //                   1 149
    //                   2 138;
           goto _L3 _L4 _L5
_L3:
        updateGestureDetector();
        if (semanticZoom != null)
        {
            semanticZoomAdapter.notifyDataSetChanged();
        }
        updateEmptyListDisplay();
        updateFavoritesFooterVisibility(adapter.getContactFilter());
        if (!adapter.isEmpty() && layoutExperience.isMultipane())
        {
            asyncresult = getPreferredFilter();
            if (!asyncresult.equals(adapter.getContactFilter()))
            {
                updateAdapterFilter(asyncresult);
            }
        }
_L2:
        return;
_L5:
        adapter.updateExisting(asyncresult);
        continue; /* Loop/switch isn't completed */
_L4:
        adapter.update(asyncresult);
        if (true) goto _L3; else goto _L6
_L6:
    }

    public void ensureListShown()
    {
        if (zoomGestureDetector != null)
        {
            zoomGestureDetector.b();
        }
    }

    public void ensureSemanticZoomShown()
    {
        if (zoomGestureDetector != null)
        {
            zoomGestureDetector.c();
        }
    }

    public ScaleGestureDetector getGestureDetector()
    {
        return pinchDetector;
    }

    protected int getLayoutId()
    {
        return 0x7f03005c;
    }

    public boolean handleMessage(Message message)
    {
        boolean flag;
        boolean flag1;
        if (filterExpanded)
        {
            updateScheduler.a(message.what);
            return true;
        }
        flag1 = false;
        flag = false;
        if (!isResumed()) goto _L2; else goto _L1
_L1:
        Object obj;
        ContactFilter contactfilter;
        contactfilter = adapter.getContactFilter();
        obj = null;
        message.what;
        JVM INSTR tableswitch 1 2: default 68
    //                   1 172
    //                   2 118;
           goto _L3 _L4 _L5
_L3:
        flag1 = flag;
        if (obj != null)
        {
            ((ContactGroupLoader) (obj)).setCustomContactGroupName(contactfilter.toString());
            async.a(((java.util.concurrent.Callable) (obj)), Integer.valueOf(message.what), new UiCallback(this, this));
            flag1 = flag;
        }
_L2:
        return flag1;
_L5:
        updateGestureDetector();
        obj = new ContactGroupLoader(lib, map, account, updateQueue.a(), false, contactfilter.getExcludeNotAuthorized(), true, getActivity().getApplication(), ecsConfiguration);
        flag = true;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new ContactGroupLoader(lib, map, account, contactfilter.getTypes(userPrefs), false, contactfilter.getExcludeNotAuthorized(), true, getActivity().getApplication(), ecsConfiguration);
        flag = true;
        if (true) goto _L3; else goto _L6
_L6:
    }

    public boolean isSemanticScaling()
    {
        return zoomGestureDetector != null && zoomGestureDetector.d();
    }

    public boolean isShowingSemanticView()
    {
        return zoomGestureDetector != null && zoomGestureDetector.a();
    }

    boolean onAcceptEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.ACCOUNT_CBLSYNCSTATUS || onpropertychange.getPropKey() == PROPKEY.CONTACT_NROF_AUTHED_BUDDIES || onpropertychange.getPropKey() == PROPKEY.ACCOUNT_STATUS;
    }

    public void onClick(View view)
    {
        if (view.getId() != 0x7f10030e) goto _L2; else goto _L1
_L1:
        if (!shouldAutoBuddy()) goto _L4; else goto _L3
_L3:
        nav.launchMobileVerification(com.skype.android.app.mnv.MnvCases.REFERRER.CONTACT_LIST);
        mnvAnalytics.report(AnalyticsEvent.cT);
_L6:
        return;
_L4:
        startActivity(new Intent(getActivity(), com/skype/android/app/contacts/ContactDirectorySearchActivity));
        return;
_L2:
        if (view.getTag() instanceof ContactFilter)
        {
            ensureListShown();
            Iterator iterator = allFilterButtons.iterator();
            while (iterator.hasNext()) 
            {
                Button button = (Button)iterator.next();
                if (button == view)
                {
                    updateAdapterFilter((ContactFilter)view.getTag());
                    view.setSelected(true);
                } else
                {
                    button.setSelected(false);
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onContextItemSelected(MenuItem menuitem, ObjectInterface objectinterface, Bundle bundle)
    {
        return contactMenuBuilder.onContextItemSelected(menuitem, objectinterface, bundle);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        setRetainInstance(true);
        setHasOptionsMenu(false);
        updateScheduler = new UpdateScheduler(new Handler(this));
        updateQueue = new IntegerQueueSet();
    }

    public void onCreateContextMenu(Menu menu, ObjectInterface objectinterface, Bundle bundle)
    {
        contactMenuBuilder.onCreateContextMenu(menu, objectinterface, bundle);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public void onDetach()
    {
        super.onDetach();
        if (semanticZoom != null)
        {
            boolean flag;
            if (semanticZoom.getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            restoreSemanticZoom = flag;
        }
    }

    void onEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        Account account1 = (Account)onpropertychange.getSender();
        _cls7..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()];
        JVM INSTR tableswitch 10 12: default 44
    //                   10 45
    //                   11 62
    //                   12 57;
           goto _L1 _L2 _L3 _L4
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        return;
_L2:
        if (account1.getCblSyncStatusProp() != com.skype.Account.CBLSYNCSTATUS.CBL_IN_SYNC)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        loadContacts();
        return;
_L3:
        if (account1.getStatusProp() != com.skype.Account.STATUS.LOGGED_IN)
        {
            continue; /* Loop/switch isn't completed */
        }
        displayPreferredFilter();
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L1; else goto _L7
_L7:
    }

    void onEvent(com.skype.android.gen.ContactGroupListener.OnChange onchange)
    {
        if (adapter.getContactFilter().getTypes(userPrefs).contains(onchange.getSender().getTypeProp()))
        {
            loadContacts();
        }
    }

    void onEvent(com.skype.android.gen.SkyLibListener.OnContactGoneOffline oncontactgoneoffline)
    {
        updateContact(oncontactgoneoffline.getContactObjectID());
    }

    void onEvent(com.skype.android.gen.SkyLibListener.OnContactOnlineAppearance oncontactonlineappearance)
    {
        updateContact(oncontactonlineappearance.getContactObjectID());
    }

    void onEvent(com.skype.android.gen.SkyLibListener.OnObjectPropertyChangeWithValue onobjectpropertychangewithvalue)
    {
        switch (_cls7..SwitchMap.com.skype.PROPKEY[onobjectpropertychangewithvalue.getPropKey().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            updateContact(onobjectpropertychangewithvalue.getObjectID());
            return;

        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            loadContacts();
            break;
        }
    }

    void onEvent(com.skype.android.util.cache.SpannedStringCache.OnCleared oncleared)
    {
        adapter.notifyDataSetChanged();
    }

    public volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
    {
        onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, obj, flag);
    }

    public void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, Object obj, boolean flag)
    {
    }

    public volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
    }

    public void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
    {
        if (!isSemanticScaling())
        {
            if (obj instanceof ContactItem)
            {
                nav.chat((ContactItem)obj);
            } else
            if (obj instanceof com.skype.android.widget.SeparatedColumnsAdapter.ListItemsGroupsProvider.GroupInfo)
            {
                ensureSemanticZoomShown();
                return;
            }
        }
    }

    public volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
    {
        return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
    }

    public boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
    {
        if (!isSemanticScaling() && (obj instanceof ContactItem))
        {
            itemviewholder = (ContactItem)obj;
            if (!itemviewholder.isLocalContact())
            {
                obj = (Contact)map.a(itemviewholder.getContactObjectId(), com/skype/Contact);
                ObjectInterfaceMenuDialog.create(this, itemviewholder.getDisplayName(), ((ObjectInterface) (obj))).show(getFragmentManager());
                return true;
            }
        }
        return false;
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        updateAdapterFilter((ContactFilter)filterSelector.getSelectedItem());
        filterExpanded = false;
    }

    public void onNothingSelected(AdapterView adapterview)
    {
        filterExpanded = false;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (super.onOptionsItemSelected(menuitem))
        {
            return true;
        }
        menuitem = com.skype.android.widget.fastscroll.LayoutCostMeter.Strategy.valueOf(menuitem.getTitle().toString());
        menuitem = new com.skype.android.widget.fastscroll.LayoutCostMeter.Session((OneWayRecyclerView)getListView(), menuitem, new com.skype.android.widget.fastscroll.LayoutCostMeter.Response[] {
            com.skype.android.widget.fastscroll.LayoutCostMeter.Response.c, com.skype.android.widget.fastscroll.LayoutCostMeter.Response.d
        });
        lcm.a(menuitem);
        return true;
        menuitem;
_L2:
        return false;
        menuitem;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onResume()
    {
        super.onResume();
        if (semanticZoomLayout != null)
        {
            semanticZoomLayout.setScaleGestureDetectorHolder(new ScaleGestureDetectorHolder() {

                final ContactListFragment this$0;

                public final ScaleGestureDetector getScaleGestureDetector()
                {
                    return getGestureDetector();
                }

            
            {
                this$0 = ContactListFragment.this;
                super();
            }
            });
        }
        com.skype.Account.STATUS status = account.getStatusProp();
        if (status == com.skype.Account.STATUS.LOGGED_IN_PARTIALLY || status == com.skype.Account.STATUS.LOGGED_IN)
        {
            if (layoutExperience.isMultipane())
            {
                updateGestureDetector();
                if (restoreSemanticZoom)
                {
                    ensureSemanticZoomShown();
                    restoreSemanticZoom = false;
                }
            }
            displayPreferredFilter();
            loadContacts();
        }
        updateEmptyListDisplay();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            filterExpanded = true;
        }
        return false;
    }

    public void onViewCreated(View view, final Bundle listView)
    {
        super.onViewCreated(view, listView);
        contactMenuBuilder = new ContactMenuBuilder(this, contactUtil, conversationUtil);
        columnsAdapter = new SeparatedColumnsAdapter(getActivity(), adapter);
        columnsAdapter.a(layoutExperience.isMultipane());
        listView = getListView();
        ViewUtil.a(this, new View[] {
            addContactsButton
        });
        if (accessibilityUtil.a())
        {
            accessibilityUtil.a((ViewGroup)addContactsButton.getParent(), addContactsButton, 14);
            accessibilityUtil.a((ViewGroup)addContactsText.getParent(), addContactsText, 13);
            View view1 = emptyView.findViewById(0x7f10030e);
            accessibilityUtil.a((ViewGroup)view1.getParent(), view1, 14);
        }
        if (layoutExperience.isMultipane())
        {
            createContactFilters(view);
            if (semanticZoom != null)
            {
                semanticZoomAdapter = new SemanticZoomAdapter(getActivity(), adapter);
                semanticZoomAdapter.a(new android.view.View.OnClickListener() {

                    final ContactListFragment this$0;
                    final RecyclerView val$listView;

                    public final void onClick(View view2)
                    {
                        view2 = (com.skype.android.widget.SeparatedColumnsAdapter.ListItemsGroupsProvider.GroupInfo)view2.getTag();
                        int i = columnsAdapter.a(((com.skype.android.widget.SeparatedColumnsAdapter.ListItemsGroupsProvider.GroupInfo) (view2)).c);
                        listView.scrollToPosition(i);
                        ensureListShown();
                    }

            
            {
                this$0 = ContactListFragment.this;
                listView = recyclerview;
                super();
            }
                });
                semanticZoom.setAdapter(semanticZoomAdapter);
            }
            listView.setAdapter(columnsAdapter);
            updateEmptyListDisplay();
        } else
        {
            view = new RecyclerListDecorator(getActivity(), adapter);
            addAdBanner(view);
            addAddFriendsHeader(view);
            addFilterHeader(view);
            footerAddFavoritesView = getActivity().getLayoutInflater().inflate(0x7f030090, listView, false);
            view.b(footerAddFavoritesView);
            ViewUtil.a(new android.view.View.OnClickListener() {

                final ContactListFragment this$0;

                public final void onClick(View view2)
                {
                    view2 = new Intent(getActivity(), com/skype/android/app/contacts/ContactPickerActivity);
                    view2.putExtra("fragmentClass", com/skype/android/app/favorites/FavoritesPickContactsFragment);
                    view2.putExtra("CUSTOM_ACTION", com.skype.android.widget.SymbolElement.SymbolCode.bR);
                    view2.putExtra("CHECKBOX_MODE", true);
                    startActivity(view2);
                }

            
            {
                this$0 = ContactListFragment.this;
                super();
            }
            }, new View[] {
                addFavorites, footerAddFavoritesView
            });
            listView.setAdapter(view);
            updateFavoritesFooterVisibility(adapter.getContactFilter());
        }
        if (adapter.isEmpty())
        {
            if (userPrefs.isNewUser() && userPrefs.isMnvCompleted() && contactsIngestManager.isRunning())
            {
                showContactProgress();
            } else
            {
                setEmptyViewVisibility();
            }
        }
        adapter.setOnUserEventListener(0, this);
    }

    protected void updateHeaderAddFriendsVisibility(boolean flag)
    {
        boolean flag1 = false;
        if (headerAddFriendsView != null)
        {
            int j = headerAddFriendsView.getVisibility();
            int i;
            if (shouldAutoBuddy() && !flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = 8;
            }
            if (j != i)
            {
                headerAddFriendsView.setVisibility(i);
                if (i == 0)
                {
                    analytics.a(new ExperimentTelemetryEvent(ExperimentEvent.a, ExperimentTag.e));
                }
            }
        }
    }


}
