// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ListFragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.actionbar.PullToRefreshController;
import com.soundcloud.android.activities.LegacyActivitiesAdapter;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.api.legacy.Request;
import com.soundcloud.android.api.legacy.model.ContentStats;
import com.soundcloud.android.api.legacy.model.LocalCollection;
import com.soundcloud.android.collections.tasks.CollectionParams;
import com.soundcloud.android.collections.tasks.CollectionTask;
import com.soundcloud.android.collections.tasks.ReturnData;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.sync.ApiSyncService;
import com.soundcloud.android.sync.SyncStateManager;
import com.soundcloud.android.utils.AndroidUtils;
import com.soundcloud.android.utils.DetachableResultReceiver;
import com.soundcloud.android.utils.NetworkConnectivityListener;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.android.view.EmptyViewBuilder;
import com.soundcloud.rx.eventbus.EventBus;
import java.lang.ref.WeakReference;
import rx.h.b;

public class ScListFragment extends ListFragment
    implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener, android.widget.AbsListView.OnScrollListener, com.soundcloud.android.api.legacy.model.LocalCollection.OnChangeListener, com.soundcloud.android.collections.tasks.CollectionTask.Callback, com.soundcloud.android.utils.DetachableResultReceiver.Receiver
{
    private class ChangeObserver extends ContentObserver
    {

        final ScListFragment this$0;

        public boolean deliverSelfNotifications()
        {
            return true;
        }

        public void onChange(boolean flag)
        {
            if (changeObserver != null)
            {
                onContentChanged();
            }
        }

        public ChangeObserver()
        {
            this$0 = ScListFragment.this;
            super(new Handler());
        }
    }

    private static final class ConnectivityHandler extends Handler
    {

        private final WeakReference fragmentRef;
        private final WeakReference listenerRef;

        public final void handleMessage(Message message)
        {
            ScListFragment sclistfragment = (ScListFragment)fragmentRef.get();
            NetworkConnectivityListener networkconnectivitylistener = (NetworkConnectivityListener)listenerRef.get();
            switch (message.what)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Unknown msg.what: ")).append(message.what).toString());

            case 0: // '\0'
                break;
            }
            if (sclistfragment != null && networkconnectivitylistener != null)
            {
                message = networkconnectivitylistener.getNetworkInfo();
                if (message != null)
                {
                    sclistfragment.onDataConnectionUpdated(message.isConnectedOrConnecting());
                }
            }
        }

        private ConnectivityHandler(ScListFragment sclistfragment, NetworkConnectivityListener networkconnectivitylistener)
        {
            fragmentRef = new WeakReference(sclistfragment);
            listenerRef = new WeakReference(networkconnectivitylistener);
        }

        ConnectivityHandler(ScListFragment sclistfragment, NetworkConnectivityListener networkconnectivitylistener, _cls1 _pcls1)
        {
            this(sclistfragment, networkconnectivitylistener);
        }
    }


    private static final int CONNECTIVITY_MSG = 0;
    private static final String EXTRA_QUERY_SOURCE_INFO = "querySourceInfo";
    private static final String EXTRA_SCREEN = "screen";
    private static final String KEY_IS_RETAINED = "is_retained";
    public static final String TAG = com/soundcloud/android/collections/ScListFragment.getSimpleName();
    AccountOperations accountOperations;
    private LegacyActivitiesAdapter adapter;
    private CollectionTask appendTask;
    private ChangeObserver changeObserver;
    private final Content content;
    private final Uri contentUri;
    private final DetachableResultReceiver detachableReceiver = new DetachableResultReceiver(new Handler());
    private EmptyView emptyView;
    private EmptyViewBuilder emptyViewBuilder;
    protected com.soundcloud.android.view.EmptyView.Status emptyViewStatus;
    EventBus eventBus;
    ImageOperations imageOperations;
    private boolean keepGoing;
    private ListView listView;
    private LocalCollection localCollection;
    protected String nextHref;
    private boolean pendingSync;
    protected PublicApi publicApi;
    PullToRefreshController pullToRefreshController;
    private CollectionTask refreshTask;
    private int retainedListPosition;
    private b subscription;
    private SyncStateManager syncStateManager;
    private final DefaultSubscriber userEventObserver = new _cls1();

    public ScListFragment()
    {
        content = Content.ME_ACTIVITIES;
        contentUri = Content.ME_ACTIVITIES.uri;
    }

    private void append(boolean flag)
    {
        if (getActivity() == null || adapter == null)
        {
            return;
        }
        if (flag || AndroidUtils.isTaskFinished(appendTask))
        {
            appendTask = buildTask();
            appendTask.executeOnThreadPool(new CollectionParams[] {
                getTaskParams(false)
            });
        }
        adapter.setIsLoadingData(true);
    }

    private Request buildRequest(boolean flag)
    {
        Request request = getRequest(flag);
        if (request != null)
        {
            request.add("linked_partitioning", "1");
            request.add("limit", Integer.valueOf(30));
        }
        return request;
    }

    private CollectionTask buildTask()
    {
        return new CollectionTask(publicApi, this);
    }

    private void checkAllowInitalAppend()
    {
        log((new StringBuilder("Should allow initial appending: [waitingOnInitialSync:")).append(waitingOnInitialSync()).append(",keepGoing:").append(keepGoing).append("]").toString());
        if (!keepGoing && !waitingOnInitialSync() && adapter != null && adapter.needsItems())
        {
            keepGoing = true;
            append(false);
        }
    }

    private void clearAppendTask()
    {
        if (appendTask != null && !AndroidUtils.isTaskFinished(appendTask))
        {
            appendTask.cancel(true);
        }
        appendTask = null;
    }

    private void clearRefreshTask()
    {
        if (refreshTask != null && !AndroidUtils.isTaskFinished(refreshTask))
        {
            refreshTask.cancel(true);
        }
        refreshTask = null;
    }

    private void configurePullToRefreshState()
    {
label0:
        {
            if (isInLayout() && listView != null && localCollection != null)
            {
                if (!localCollection.isIdle())
                {
                    break label0;
                }
                pullToRefreshController.stopRefreshing();
            }
            return;
        }
        pullToRefreshController.startRefreshing();
    }

    private com.soundcloud.android.view.EmptyView.Status emptyViewStatusFromHttpStatus(int i)
    {
        if (i >= 400)
        {
            return com.soundcloud.android.view.EmptyView.Status.SERVER_ERROR;
        }
        if (i >= 200)
        {
            return com.soundcloud.android.view.EmptyView.Status.OK;
        } else
        {
            return com.soundcloud.android.view.EmptyView.Status.CONNECTION_ERROR;
        }
    }

    private void executeRefreshTask()
    {
        if (getActivity() != null && adapter != null)
        {
            refreshTask = buildTask();
            refreshTask.execute(new CollectionParams[] {
                getTaskParams(true)
            });
        }
        if (listView != null && !pullToRefreshController.isRefreshing())
        {
            configureEmptyView();
        }
    }

    private DetachableResultReceiver getReceiver()
    {
        detachableReceiver.setReceiver(this);
        return detachableReceiver;
    }

    private CollectionParams getTaskParams(boolean flag)
    {
        CollectionParams collectionparams = adapter.getParams(flag);
        collectionparams.setRequest(buildRequest(flag));
        if (!isSyncable())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        collectionparams.refreshPageItems = flag;
        return collectionparams;
    }

    private boolean isRefreshTaskActive()
    {
        return refreshTask != null && !AndroidUtils.isTaskFinished(refreshTask);
    }

    private boolean isRefreshing()
    {
        if (localCollection != null)
        {
            return localCollection.sync_state == 2 || localCollection.sync_state == 1 || isRefreshTaskActive();
        } else
        {
            return isRefreshTaskActive();
        }
    }

    private boolean isSyncable()
    {
        return content != null && content.isSyncable();
    }

    private static void log(String s)
    {
        Log.isLoggable(TAG, 3);
    }

    public static ScListFragment newInstance()
    {
        ScListFragment sclistfragment = new ScListFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("screen", Screen.ACTIVITIES);
        sclistfragment.setArguments(bundle);
        return sclistfragment;
    }

    private void onDataConnectionUpdated(boolean flag)
    {
        if (flag && adapter != null && adapter.needsItems() && getScActivity() != null && accountOperations.isUserLoggedIn())
        {
            refresh(false);
        }
    }

    private void refreshSyncData()
    {
label0:
        {
            if (isSyncable() && localCollection != null)
            {
                if (!localCollection.shouldAutoRefresh())
                {
                    break label0;
                }
                log("Auto refreshing content");
                if (!isRefreshing())
                {
                    refresh(false);
                    if (pullToRefreshController.isAttached())
                    {
                        pullToRefreshController.startRefreshing();
                    }
                }
            }
            return;
        }
        log("Skipping auto refresh");
        checkAllowInitalAppend();
    }

    private void requestSync()
    {
        if (getActivity() != null && content != null)
        {
            log("Requesting Sync");
            Intent intent = (new Intent(getActivity(), com/soundcloud/android/sync/ApiSyncService)).putExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER", getReceiver()).putExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", true).setData(content.uri);
            getActivity().startService(intent);
            return;
        } else
        {
            log("Bypassing sync request, no context");
            pendingSync = true;
            return;
        }
    }

    private void setupListAdapter()
    {
label0:
        {
            if (getListAdapter() == null)
            {
                adapter = new LegacyActivitiesAdapter();
                setListAdapter(adapter);
                configureEmptyView();
                if (!canAppend())
                {
                    break label0;
                }
                append(false);
            }
            return;
        }
        keepGoing = false;
    }

    private void startObservingChanges()
    {
        if (changeObserver != null)
        {
            getActivity().getContentResolver().registerContentObserver(contentUri, true, changeObserver);
        }
    }

    private void stopListening()
    {
        subscription.unsubscribe();
        if (syncStateManager != null && localCollection != null)
        {
            syncStateManager.removeChangeListener(localCollection);
        }
    }

    private void stopObservingChanges()
    {
        if (changeObserver != null)
        {
            getActivity().getContentResolver().unregisterContentObserver(changeObserver);
            changeObserver = null;
        }
    }

    private boolean waitingOnInitialSync()
    {
        return localCollection != null && !localCollection.hasSyncedBefore();
    }

    protected boolean canAppend()
    {
        log((new StringBuilder("Can Append [keepGoing: ")).append(keepGoing).append("]").toString());
        return keepGoing;
    }

    protected void configureEmptyView()
    {
        configureEmptyView(200);
    }

    protected void configureEmptyView(int i)
    {
        com.soundcloud.android.view.EmptyView.Status status;
        boolean flag;
        if (canAppend() || isRefreshing() || waitingOnInitialSync())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        log((new StringBuilder("Configure empty view [waiting:")).append(flag).append("]").toString());
        if (flag)
        {
            status = com.soundcloud.android.view.EmptyView.Status.WAITING;
        } else
        {
            status = emptyViewStatusFromHttpStatus(i);
        }
        emptyViewStatus = status;
        if (emptyView != null)
        {
            emptyView.setStatus(emptyViewStatus);
        }
    }

    protected EmptyView createEmptyView()
    {
        return emptyViewBuilder.build(getActivity());
    }

    protected void doneRefreshing()
    {
        if (pullToRefreshController.isAttached())
        {
            pullToRefreshController.stopRefreshing();
        }
    }

    protected Request getRequest(boolean flag)
    {
        if (!flag && !TextUtils.isEmpty(nextHref))
        {
            return new Request(nextHref);
        }
        if (content != null && content.hasRequest())
        {
            return content.request(contentUri);
        } else
        {
            return null;
        }
    }

    public ScActivity getScActivity()
    {
        return (ScActivity)getActivity();
    }

    protected Screen getScreen()
    {
        return (Screen)getArguments().getSerializable("screen");
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (content.isSyncable())
        {
            syncStateManager = new SyncStateManager(activity);
            changeObserver = new ChangeObserver();
        }
        startObservingChanges();
        emptyViewBuilder = (new EmptyViewBuilder()).forContent(activity, contentUri, null);
    }

    protected void onContentChanged()
    {
        if (adapter != null && !adapter.isExpired(localCollection))
        {
            log("Activity content has changed, no newer items, skipping refresh");
            return;
        } else
        {
            log("Content changed, adding newer items.");
            executeRefreshTask();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setRetainInstance(getArguments().getBoolean("is_retained", true));
        SoundCloudApplication.getObjectGraph().a(this);
        publicApi = PublicApi.getInstance(getActivity());
        keepGoing = true;
        setupListAdapter();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (SwipeRefreshLayout)layoutinflater.inflate(0x7f0300a7, null);
        listView = (ListView)layoutinflater.findViewById(0x102000a);
        listView.setOnScrollListener(imageOperations.createScrollPauseListener(false, true, this));
        emptyView = createEmptyView();
        emptyView.setStatus(emptyViewStatus);
        listView.setEmptyView(emptyView);
        viewgroup = new android.view.ViewGroup.LayoutParams(-1, -1);
        ((ViewGroup)layoutinflater.findViewById(0x7f0f0224)).addView(emptyView, viewgroup);
        pullToRefreshController.setRefreshListener(this);
        pullToRefreshController.onViewCreated(this, layoutinflater, bundle);
        configurePullToRefreshState();
        if (isRefreshing() || waitingOnInitialSync())
        {
            if (adapter == null || adapter.isEmpty())
            {
                configureEmptyView();
            } else
            if (isRefreshing())
            {
                pullToRefreshController.startRefreshing();
                return layoutinflater;
            }
        }
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        pullToRefreshController.onDestroyView(this);
        listView = null;
        emptyView = null;
    }

    public void onDetach()
    {
        super.onDetach();
        stopObservingChanges();
    }

    public void onListItemClick(ListView listview, View view, int i, long l)
    {
        super.onListItemClick(listview, view, i, l);
        if (adapter != null)
        {
            adapter.handleListItemClick(getActivity(), i - getListView().getHeaderViewsCount(), l);
        }
    }

    public void onLocalCollectionChanged(LocalCollection localcollection)
    {
        localCollection = localcollection;
        configurePullToRefreshState();
        log((new StringBuilder("Local collection changed ")).append(localCollection).toString());
        if (adapter.needsItems())
        {
            refreshSyncData();
            return;
        } else
        {
            checkAllowInitalAppend();
            return;
        }
    }

    public void onPostTaskExecute(ReturnData returndata)
    {
        if (adapter != null)
        {
            if (returndata.success)
            {
                nextHref = returndata.nextHref;
            }
            if (!returndata.wasRefresh || returndata.success)
            {
                keepGoing = returndata.keepGoing;
            }
            if (returndata.wasRefresh)
            {
                refreshTask = null;
            }
            adapter.handleTaskReturnData(returndata);
            configureEmptyView(returndata.responseCode);
            boolean flag;
            if ((returndata.wasRefresh || !isRefreshing()) && !waitingOnInitialSync())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                doneRefreshing();
            }
            if (adapter.isEmpty() && keepGoing)
            {
                append(true);
                return;
            }
        }
    }

    public void onReceiveResult(int i, Bundle bundle)
    {
        boolean flag = true;
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown resultCode: ")).append(i).toString());

        case 2: // '\002'
        case 3: // '\003'
            break;
        }
        if (bundle != null && !bundle.getBoolean(contentUri.toString()))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        bundle = new StringBuilder("Returned from sync. Change: ");
        if (i != 0)
        {
            flag = false;
        }
        log(bundle.append(flag).toString());
        if (i != 0 && !isRefreshTaskActive())
        {
            doneRefreshing();
            checkAllowInitalAppend();
            if (adapter != null)
            {
                adapter.notifyDataSetChanged();
            }
        } else
        if (i == 0)
        {
            if (!isRefreshTaskActive())
            {
                log("Something changed, Refreshing....");
                executeRefreshTask();
                return;
            } else
            {
                log("Something changed, Already Refreshing, skipping refresh.");
                return;
            }
        }
    }

    public void onRefresh()
    {
        refresh(true);
    }

    public void onResume()
    {
        super.onResume();
        ContentStats.setLastSeen(getActivity(), content, System.currentTimeMillis());
        if (pendingSync)
        {
            pendingSync = false;
            requestSync();
        }
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (adapter != null && adapter.shouldRequestNextPage(i, j, k) && canAppend())
        {
            append(false);
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }

    public void onStart()
    {
        super.onStart();
        if (syncStateManager != null)
        {
            localCollection = syncStateManager.fromContentAsync(contentUri, this);
        }
        NetworkConnectivityListener networkconnectivitylistener = new NetworkConnectivityListener();
        networkconnectivitylistener.registerHandler(new ConnectivityHandler(this, networkconnectivitylistener, null), 0);
        subscription = new b();
        subscription.a(eventBus.subscribe(EventQueue.CURRENT_USER_CHANGED, userEventObserver));
        adapter.notifyDataSetChanged();
        if (retainedListPosition > 0)
        {
            listView.setSelection(retainedListPosition);
        }
    }

    public void onStop()
    {
        super.onStop();
        stopListening();
        retainedListPosition = listView.getFirstVisiblePosition();
    }

    protected void refresh(boolean flag)
    {
        log((new StringBuilder("Refresh [userRefresh: ")).append(flag).append("]").toString());
        if (isSyncable())
        {
            requestSync();
        }
        if (adapter != null && getActivity() != null && !isSyncable())
        {
            executeRefreshTask();
            adapter.notifyDataSetChanged();
        }
    }

    protected void reset()
    {
        nextHref = "";
        keepGoing = true;
        clearRefreshTask();
        clearAppendTask();
        configureEmptyView();
        if (adapter != null)
        {
            adapter.clearData();
            setListAdapter(adapter);
            adapter.notifyDataSetChanged();
        }
        if (canAppend())
        {
            append(false);
        }
    }






    private class _cls1 extends DefaultSubscriber
    {

        final ScListFragment this$0;

        public void onNext(CurrentUserChangedEvent currentuserchangedevent)
        {
            if (currentuserchangedevent.getKind() == 1)
            {
                stopObservingChanges();
                stopListening();
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((CurrentUserChangedEvent)obj);
        }

        _cls1()
        {
            this$0 = ScListFragment.this;
            super();
        }
    }

}
