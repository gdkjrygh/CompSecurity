// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.ConversationImpl;
import com.skype.SkyLib;
import com.skype.android.app.Navigation;
import com.skype.android.app.contacts.ContactDirectorySearchActivity;
import com.skype.android.app.contacts.ContactItem;
import com.skype.android.app.data.OnUserEventListener;
import com.skype.android.app.recents.Recent;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.shortcircuit.OnPromotedSCDContactsSearchCompleted;
import com.skype.android.app.shortcircuit.PromotedSCDContactsManager;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.inject.EventSubscriberBinder;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.widget.FacepileTileView;
import com.skype.android.widget.PendingKeyboardDismissal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.search:
//            ConversationSearchLoader, ContactSearchLoader, MessageSearchLoader, SearchMultipleSourceAdapter, 
//            ContactSearchResultAdapter, ConversationsSearchResultAdapter, MessagesSearchResultAdapter, SuggestedAgentsAdapter, 
//            AgentProvisioningServiceClient, AgentSyncWaiter, AgentProvisioningServiceResponse, AgentInfo, 
//            MessageItem

public class SearchWidget extends FrameLayout
    implements android.view.View.OnClickListener, com.skype.android.widget.FacepileTileView.VisibilityChangeListener
{

    public static final int EXTRA_HISTORY_TIME_IN_SECONDS = 60;
    private static final int NUMBER_OF_AGENTS_TO_SHOW = 2;
    private SearchMultipleSourceAdapter adapter;
    private AgentProvisioningServiceClient agentProvisioningServiceClient;
    private AgentSyncWaiter agentSyncWaiter;
    private ViewGroup agentsWrapper;
    private AsyncService async;
    private ContactUtil contactUtil;
    private ContactSearchResultAdapter contactsAdapter;
    private AsyncCallback contactsLoaderCallback;
    private PromotedSCDContactsManager contactsManager;
    private Context context;
    private ConversationsSearchResultAdapter conversationAdapter;
    private AsyncCallback conversationLoaderCallback;
    private EcsConfiguration ecsConfiguration;
    private View emptySearchWrapper;
    private TextView facepilePrompt;
    private FacepileTileView facepileView;
    private ViewGroup facepileWrapper;
    private ImageCache imageCache;
    private InputMethodManager imm;
    private SkyLib lib;
    private AsyncCallback messageLoaderCallback;
    private MessagesSearchResultAdapter messagesAdapter;
    private Navigation navigation;
    private String query;
    private RecyclerView searchResultView;
    private View searchResultsWrapper;
    private SearchView searchView;
    private RecyclerView suggestedAgents;
    private SuggestedAgentsAdapter suggestedAgentsAdapter;
    private int suggestedContactIds[];
    private UserPreferences userPrefs;

    public SearchWidget(Context context1)
    {
        super(context1);
        initialize(context1);
    }

    public SearchWidget(Context context1, AttributeSet attributeset)
    {
        super(context1, attributeset);
        initialize(context1);
    }

    private void initialize(Context context1)
    {
        context = context1;
        LayoutInflater.from(context1).inflate(0x7f0300fa, this);
    }

    private boolean isInDetailedResultsMode()
    {
        return searchResultView.getAdapter() != adapter;
    }

    private void search(CharSequence charsequence)
    {
        if (charsequence != null)
        {
            query = charsequence.toString();
        }
        charsequence = new ConversationSearchLoader(lib, query);
        async.a(charsequence, conversationLoaderCallback);
        charsequence = new ContactSearchLoader(lib, query, userPrefs);
        async.a(charsequence, contactsLoaderCallback);
        charsequence = new MessageSearchLoader(lib, query);
        async.a(charsequence, messageLoaderCallback);
    }

    private void setupContactsAdapter()
    {
        adapter.addAdapter(contactsAdapter);
        contactsAdapter.setOnUserEventListener(0, new OnUserEventListener() {

            final SearchWidget this$0;

            public final volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
            {
                onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, obj, flag);
            }

            public final void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, Object obj, boolean flag)
            {
            }

            public final volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
            {
                onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
            }

            public final void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
            {
                i = ((ContactItem)obj).getContactObjectId();
                (imm. new PendingKeyboardDismissal(searchView, i) {

                    final _cls3 this$1;
                    final int val$objectId;

                    protected final void proceed()
                    {
                        ContactImpl contactimpl = new ContactImpl();
                        lib.getContact(objectId, contactimpl);
                        ConversationImpl conversationimpl = new ConversationImpl();
                        contactimpl.openConversation(conversationimpl);
                        navigation.chat(conversationimpl);
                    }

            
            {
                this$1 = final__pcls3;
                objectId = i;
                super(InputMethodManager.this, view);
            }
                }).hideKeyboardAndProceed();
            }

            public final volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
            {
                return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
            }

            public final boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
            {
                return false;
            }

            
            {
                this$0 = SearchWidget.this;
                super();
            }
        });
        contactsAdapter.setOnUserEventListener(1, new OnUserEventListener() {

            final SearchWidget this$0;

            public final volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
            {
                onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, obj, flag);
            }

            public final void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, Object obj, boolean flag)
            {
            }

            public final volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
            {
                onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
            }

            public final void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
            {
                contactsAdapter.setMode(SearchResultAdapter.Mode.MODE_SINGLE);
                searchResultView.setAdapter(contactsAdapter);
            }

            public final volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
            {
                return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
            }

            public final boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
            {
                return false;
            }

            
            {
                this$0 = SearchWidget.this;
                super();
            }
        });
        contactsAdapter.setOnUserEventListener(4, new OnUserEventListener() {

            final SearchWidget this$0;

            public final volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
            {
                onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, obj, flag);
            }

            public final void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, Object obj, boolean flag)
            {
            }

            public final volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
            {
                onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
            }

            public final void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
            {
                itemviewholder = new Intent(context, com/skype/android/app/contacts/ContactDirectorySearchActivity);
                itemviewholder.putExtra("android.intent.extra.TEXT", query);
                context.startActivity(itemviewholder);
            }

            public final volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
            {
                return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
            }

            public final boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
            {
                return false;
            }

            
            {
                this$0 = SearchWidget.this;
                super();
            }
        });
        contactsLoaderCallback = new AsyncCallback() {

            final SearchWidget this$0;

            public final void done(AsyncResult asyncresult)
            {
                asyncresult = (SearchResultLoader.SearchResult)asyncresult.a();
                contactsAdapter.setData(((SearchResultLoader.SearchResult) (asyncresult)).recent, ((SearchResultLoader.SearchResult) (asyncresult)).searchTerm);
            }

            
            {
                this$0 = SearchWidget.this;
                super();
            }
        };
    }

    private void setupConversationAdapter()
    {
        adapter.addAdapter(conversationAdapter);
        conversationAdapter.setOnUserEventListener(0, new OnUserEventListener() {

            final SearchWidget this$0;

            public final volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
            {
                onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, obj, flag);
            }

            public final void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, Object obj, boolean flag)
            {
            }

            public final volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
            {
                onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
            }

            public final void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
            {
                i = ((Recent)obj).getConversationObjectId();
                (imm. new PendingKeyboardDismissal(searchView, i) {

                    final _cls13 this$1;
                    final int val$objectId;

                    protected final void proceed()
                    {
                        ConversationImpl conversationimpl = new ConversationImpl();
                        lib.getConversation(objectId, conversationimpl);
                        navigation.chat(conversationimpl);
                    }

            
            {
                this$1 = final__pcls13;
                objectId = i;
                super(InputMethodManager.this, view);
            }
                }).hideKeyboardAndProceed();
            }

            public final volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
            {
                return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
            }

            public final boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
            {
                return false;
            }

            
            {
                this$0 = SearchWidget.this;
                super();
            }
        });
        conversationAdapter.setOnUserEventListener(1, new OnUserEventListener() {

            final SearchWidget this$0;

            public final volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
            {
                onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, obj, flag);
            }

            public final void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, Object obj, boolean flag)
            {
            }

            public final volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
            {
                onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
            }

            public final void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
            {
                conversationAdapter.setMode(SearchResultAdapter.Mode.MODE_SINGLE);
                searchResultView.setAdapter(conversationAdapter);
            }

            public final volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
            {
                return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
            }

            public final boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
            {
                return false;
            }

            
            {
                this$0 = SearchWidget.this;
                super();
            }
        });
        conversationLoaderCallback = new AsyncCallback() {

            final SearchWidget this$0;

            public final void done(AsyncResult asyncresult)
            {
                asyncresult = (SearchResultLoader.SearchResult)asyncresult.a();
                conversationAdapter.setData(((SearchResultLoader.SearchResult) (asyncresult)).recent, ((SearchResultLoader.SearchResult) (asyncresult)).searchTerm);
            }

            
            {
                this$0 = SearchWidget.this;
                super();
            }
        };
    }

    private void setupMessageAdapter()
    {
        adapter.addAdapter(messagesAdapter);
        messageLoaderCallback = new AsyncCallback() {

            final SearchWidget this$0;

            public final void done(AsyncResult asyncresult)
            {
                asyncresult = (SearchResultLoader.SearchResult)asyncresult.a();
                messagesAdapter.setData(((SearchResultLoader.SearchResult) (asyncresult)).recent, ((SearchResultLoader.SearchResult) (asyncresult)).searchTerm);
            }

            
            {
                this$0 = SearchWidget.this;
                super();
            }
        };
        messagesAdapter.setOnUserEventListener(1, new OnUserEventListener() {

            final SearchWidget this$0;

            public final volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
            {
                onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, obj, flag);
            }

            public final void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, Object obj, boolean flag)
            {
            }

            public final volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
            {
                onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
            }

            public final void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
            {
                messagesAdapter.setMode(SearchResultAdapter.Mode.MODE_SINGLE);
                searchResultView.setAdapter(messagesAdapter);
            }

            public final volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
            {
                return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
            }

            public final boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
            {
                return false;
            }

            
            {
                this$0 = SearchWidget.this;
                super();
            }
        });
        messagesAdapter.setOnUserEventListener(0, new OnUserEventListener() {

            final SearchWidget this$0;

            public final volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
            {
                onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, obj, flag);
            }

            public final void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, Object obj, boolean flag)
            {
            }

            public final volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
            {
                onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
            }

            public final void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
            {
                itemviewholder = (MessageItem)obj;
                obj = itemviewholder.getConversationIdentity();
                (searchView. new PendingKeyboardDismissal(((String) (obj)), itemviewholder) {

                    final _cls12 this$1;
                    final String val$conversationIdentity;
                    final MessageItem val$message;

                    protected final void proceed()
                    {
                        ConversationImpl conversationimpl = new ConversationImpl();
                        lib.getConversationByIdentity(conversationIdentity, conversationimpl, false);
                        long l = message.getTimestamp();
                        navigation.chat(conversationimpl, message.getMessageObjectId(), l - 60L);
                    }

            
            {
                this$1 = final__pcls12;
                conversationIdentity = s;
                message = messageitem;
                super(final_inputmethodmanager, View.this);
            }
                }).hideKeyboardAndProceed();
            }

            public final volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
            {
                return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
            }

            public final boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
            {
                return false;
            }

            
            {
                this$0 = SearchWidget.this;
                super();
            }
        });
    }

    private void setupSuggestedAgentsAdapter()
    {
        suggestedAgents.setAdapter(suggestedAgentsAdapter);
        suggestedAgentsAdapter.setOnUserEventListener(0, new OnUserEventListener() {

            final SearchWidget this$0;

            public final volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
            {
                onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, (AgentInfo)obj, flag);
            }

            public final void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, AgentInfo agentinfo, boolean flag)
            {
            }

            public final volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
            {
                onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, (AgentInfo)obj);
            }

            public final void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, AgentInfo agentinfo)
            {
                agentSyncWaiter.addAgentAndWaitWithSpinner((FragmentActivity)context, agentinfo);
            }

            public final volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
            {
                return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, (AgentInfo)obj);
            }

            public final boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, AgentInfo agentinfo)
            {
                return false;
            }

            
            {
                this$0 = SearchWidget.this;
                super();
            }
        });
    }

    private void updateFacepileVisibility()
    {
        boolean flag1 = true;
        boolean flag = false;
        boolean flag2 = contactsManager.shouldDisplayPromotedSCDContacts();
        ViewGroup viewgroup;
        int i;
        if (suggestedContactIds != null && suggestedContactIds.length > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (flag2 && i != 0 && userPrefs.isAutoBuddyEnabledInLocalCache())
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        viewgroup = facepileWrapper;
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        viewgroup.setVisibility(i);
    }

    private void updateSuggestedAgents()
    {
        if (ecsConfiguration.isAgentSuggestionsEnabled())
        {
            agentProvisioningServiceClient.get(new AsyncCallback() {

                final SearchWidget this$0;

                public final void done(AsyncResult asyncresult)
                {
                    byte byte0 = 8;
                    if (asyncresult.e())
                    {
                        Object obj = (AgentProvisioningServiceResponse)asyncresult.a();
                        if (obj != null && !((AgentProvisioningServiceResponse) (obj)).getAgentInfo().isEmpty())
                        {
                            asyncresult = new ArrayList();
                            obj = ((AgentProvisioningServiceResponse) (obj)).getAgentInfo().iterator();
                            do
                            {
                                if (!((Iterator) (obj)).hasNext())
                                {
                                    break;
                                }
                                AgentInfo agentinfo = (AgentInfo)((Iterator) (obj)).next();
                                ContactImpl contactimpl = new ContactImpl();
                                lib.getContact(agentinfo.getIdentity(), contactimpl);
                                if (!contactimpl.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.BOT_BUDDIES))
                                {
                                    asyncresult.add(agentinfo);
                                }
                            } while (asyncresult.size() != 2);
                            obj = agentsWrapper;
                            if (!asyncresult.isEmpty())
                            {
                                byte0 = 0;
                            }
                            ((ViewGroup) (obj)).setVisibility(byte0);
                            suggestedAgentsAdapter.setData(asyncresult);
                        }
                        return;
                    } else
                    {
                        agentsWrapper.setVisibility(8);
                        return;
                    }
                }

            
            {
                this$0 = SearchWidget.this;
                super();
            }
            });
        }
    }

    public void init(ContactUtil contactutil, ImageCache imagecache, UserPreferences userpreferences, Navigation navigation1, PromotedSCDContactsManager promotedscdcontactsmanager, EventBus eventbus, SearchMultipleSourceAdapter searchmultiplesourceadapter, 
            ConversationsSearchResultAdapter conversationssearchresultadapter, ContactSearchResultAdapter contactsearchresultadapter, MessagesSearchResultAdapter messagessearchresultadapter, AsyncService asyncservice, SkyLib skylib, InputMethodManager inputmethodmanager, AgentProvisioningServiceClient agentprovisioningserviceclient, 
            SuggestedAgentsAdapter suggestedagentsadapter, EcsConfiguration ecsconfiguration, AgentSyncWaiter agentsyncwaiter)
    {
        contactUtil = contactutil;
        imageCache = imagecache;
        userPrefs = userpreferences;
        navigation = navigation1;
        contactsManager = promotedscdcontactsmanager;
        adapter = searchmultiplesourceadapter;
        conversationAdapter = conversationssearchresultadapter;
        contactsAdapter = contactsearchresultadapter;
        messagesAdapter = messagessearchresultadapter;
        async = asyncservice;
        lib = skylib;
        imm = inputmethodmanager;
        agentProvisioningServiceClient = agentprovisioningserviceclient;
        suggestedAgentsAdapter = suggestedagentsadapter;
        ecsConfiguration = ecsconfiguration;
        agentSyncWaiter = agentsyncwaiter;
        promotedscdcontactsmanager.findAllPromotedSCDContacts();
        (new EventSubscriberBinder(eventbus, this)).bind();
        setupSuggestedAgentsAdapter();
        searchmultiplesourceadapter.registerAdapterDataObserver(new android.support.v7.widget.RecyclerView.c() {

            final SearchWidget this$0;

            public final void onChanged()
            {
                updateSearchResultsVisibility();
            }

            
            {
                this$0 = SearchWidget.this;
                super();
            }
        });
    }

    public void onClick(View view)
    {
        if (view == facepileWrapper)
        {
            view = navigation.intentForSuggestedContactsPicker();
            context.startActivity(view);
        }
    }

    public void onEvent(OnPromotedSCDContactsSearchCompleted onpromotedscdcontactssearchcompleted)
    {
        suggestedContactIds = onpromotedscdcontactssearchcompleted.getPromotedSCDContactIds();
        if (suggestedContactIds != null && suggestedContactIds.length > 0 && contactsManager.shouldDisplayPromotedSCDContacts())
        {
            facepileView.setContacts(contactUtil.a(suggestedContactIds), imageCache);
        }
        updateFacepileVisibility();
    }

    protected void onFinishInflate()
    {
        searchResultsWrapper = findViewById(0x7f100502);
        searchResultView = (RecyclerView)findViewById(0x7f100503);
        emptySearchWrapper = findViewById(0x7f1002fa);
        agentsWrapper = (ViewGroup)findViewById(0x7f1004ff);
        suggestedAgents = (RecyclerView)findViewById(0x7f100501);
        facepileWrapper = (ViewGroup)findViewById(0x7f1002fd);
        facepilePrompt = (TextView)findViewById(0x7f1002fe);
        facepileView = (FacepileTileView)findViewById(0x7f1002ff);
        facepileView.setVisibilityChangeListener(this);
        facepileWrapper.setOnClickListener(this);
        super.onFinishInflate();
    }

    public boolean onInterceptBackButton()
    {
        if (isInDetailedResultsMode())
        {
            resetSearch();
            return true;
        } else
        {
            return false;
        }
    }

    public void onVisibilityChanged(FacepileTileView facepiletileview, boolean flag)
    {
        facepiletileview = context.getString(0x7f080461);
        if (!flag)
        {
            facepiletileview = contactUtil.a(getResources(), contactUtil.a(suggestedContactIds));
        }
        facepilePrompt.setText(facepiletileview);
    }

    public void resetSearch()
    {
        conversationAdapter.setMode(SearchResultAdapter.Mode.MODE_COMBINED);
        contactsAdapter.setMode(SearchResultAdapter.Mode.MODE_COMBINED);
        messagesAdapter.setMode(SearchResultAdapter.Mode.MODE_COMBINED);
        searchResultView.setAdapter(adapter);
    }

    public void setSearchView(SearchView searchview)
    {
        searchView = searchview;
        searchview.setQueryHint(getResources().getString(0x7f08017e));
        searchview.setOnQueryTextListener(new android.support.v7.widget.SearchView.c() {

            final SearchWidget this$0;

            public final boolean onQueryTextChange(String s)
            {
                search(s);
                return true;
            }

            public final boolean onQueryTextSubmit(String s)
            {
                return false;
            }

            
            {
                this$0 = SearchWidget.this;
                super();
            }
        });
        adapter.clear();
        setupContactsAdapter();
        setupConversationAdapter();
        setupMessageAdapter();
    }

    public void setVisibility(int i)
    {
        super.setVisibility(i);
        updateSearchResultsVisibility();
        if (i == 0)
        {
            updateSuggestedAgents();
        }
    }

    public void updateSearchResultsVisibility()
    {
        boolean flag = false;
        View view;
        int i;
        byte byte0;
        if (adapter.getItemCount() > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        view = emptySearchWrapper;
        if (i != 0)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
        view = searchResultsWrapper;
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }














}
