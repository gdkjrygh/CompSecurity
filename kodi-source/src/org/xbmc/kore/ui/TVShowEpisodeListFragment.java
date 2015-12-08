// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorTreeAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import de.greenrobot.event.EventBus;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.event.MediaSyncEvent;
import org.xbmc.kore.service.LibrarySyncService;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;

public class TVShowEpisodeListFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
{
    private static class EpisodeViewHolder
    {

        ImageView checkmarkView;
        RelativeLayout container;
        TextView detailsView;
        int episodeId;
        TextView episodenumberView;
        TextView titleView;

        private EpisodeViewHolder()
        {
        }

    }

    private static interface EpisodesListQuery
    {

        public static final String PROJECTION[] = {
            "_id", "episodeid", "episode", "thumbnail", "playcount", "title", "runtime", "firstaired"
        };

    }

    public static interface OnEpisodeSelectedListener
    {

        public abstract void onEpisodeSelected(int i, int j);
    }

    private class SeasonsEpisodesAdapter extends CursorTreeAdapter
    {

        private int artHeight;
        private int artWidth;
        private HostManager hostManager;
        private int iconCollapseResId;
        private int iconExpandResId;
        private int separatorPadding;
        private int themeAccentColor;
        final TVShowEpisodeListFragment this$0;

        public void bindChildView(View view, Context context, Cursor cursor, boolean flag)
        {
            EpisodeViewHolder episodeviewholder = (EpisodeViewHolder)view.getTag();
            episodeviewholder.episodeId = cursor.getInt(1);
            episodeviewholder.episodenumberView.setText(String.format(context.getString(0x7f07003c), new Object[] {
                Integer.valueOf(cursor.getInt(2))
            }));
            int i = cursor.getInt(6) / 60;
            if (i > 0)
            {
                view = (new StringBuilder()).append(String.format(context.getString(0x7f070055), new Object[] {
                    String.valueOf(i)
                })).append("  |  ").append(cursor.getString(7)).toString();
            } else
            {
                view = cursor.getString(7);
            }
            episodeviewholder.titleView.setText(cursor.getString(5));
            episodeviewholder.detailsView.setText(view);
            if (cursor.getInt(4) > 0)
            {
                episodeviewholder.checkmarkView.setVisibility(0);
                episodeviewholder.checkmarkView.setColorFilter(themeAccentColor);
                return;
            } else
            {
                episodeviewholder.checkmarkView.setVisibility(8);
                return;
            }
        }

        public void bindGroupView(View view, Context context, Cursor cursor, boolean flag)
        {
            TextView textview = (TextView)view.findViewById(0x7f0e0089);
            TextView textview1 = (TextView)view.findViewById(0x7f0e00c7);
            ImageView imageview = (ImageView)view.findViewById(0x7f0e0070);
            textview.setText(String.format(context.getString(0x7f070083), new Object[] {
                Integer.valueOf(cursor.getInt(1))
            }));
            int i = cursor.getInt(3);
            int j = cursor.getInt(4);
            textview1.setText(String.format(context.getString(0x7f07006c), new Object[] {
                Integer.valueOf(i), Integer.valueOf(i - j)
            }));
            UIUtils.loadImageWithCharacterAvatar(context, hostManager, cursor.getString(2), String.valueOf(cursor.getInt(1)), imageview, artWidth, artHeight);
            view = (ImageView)view.findViewById(0x7f0e00be);
            if (flag)
            {
                view.setImageResource(iconCollapseResId);
                return;
            } else
            {
                view.setImageResource(iconExpandResId);
                return;
            }
        }

        public Cursor getChildrenCursor(Cursor cursor)
        {
            if (!isAdded())
            {
                return null;
            }
            int i = cursor.getInt(1);
            Bundle bundle = new Bundle();
            bundle.putInt("season", i);
            i = cursor.getPosition();
            cursor = getLoaderManager();
            if (cursor.getLoader(i) == null || cursor.getLoader(i).isReset())
            {
                cursor.initLoader(i, bundle, TVShowEpisodeListFragment.this);
                return null;
            } else
            {
                cursor.restartLoader(i, bundle, TVShowEpisodeListFragment.this);
                return null;
            }
        }

        public View newChildView(Context context, Cursor cursor, boolean flag, ViewGroup viewgroup)
        {
            context = LayoutInflater.from(context).inflate(0x7f030041, viewgroup, false);
            cursor = new EpisodeViewHolder();
            cursor.container = (RelativeLayout)context.findViewById(0x7f0e0055);
            cursor.titleView = (TextView)context.findViewById(0x7f0e002d);
            cursor.detailsView = (TextView)context.findViewById(0x7f0e00a5);
            cursor.episodenumberView = (TextView)context.findViewById(0x7f0e00c4);
            cursor.checkmarkView = (ImageView)context.findViewById(0x7f0e00c3);
            context.setTag(cursor);
            return context;
        }

        public View newGroupView(Context context, Cursor cursor, boolean flag, ViewGroup viewgroup)
        {
            return LayoutInflater.from(context).inflate(0x7f030045, viewgroup, false);
        }

        public SeasonsEpisodesAdapter(Context context)
        {
            this$0 = TVShowEpisodeListFragment.this;
            super(null, context);
            tvshowepisodelistfragment = context.getTheme().obtainStyledAttributes(new int[] {
                0x7f010106, 0x7f010012, 0x7f010016
            });
            themeAccentColor = getColor(0, 0x7f0d0004);
            iconCollapseResId = getResourceId(1, 0x7f020050);
            iconExpandResId = getResourceId(2, 0x7f020052);
            recycle();
            hostManager = HostManager.getInstance(context);
            tvshowepisodelistfragment = context.getResources();
            artWidth = (int)(getDimension(0x7f080030) / 1.0F);
            artHeight = (int)(getDimension(0x7f08002f) / 1.0F);
            separatorPadding = getDimensionPixelSize(0x7f080096);
        }
    }

    private static interface SeasonsListQuery
    {

        public static final String PROJECTION[] = {
            "_id", "season", "thumbnail", "episode", "watchedepisodes"
        };

    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/TVShowEpisodeListFragment);
    private CursorTreeAdapter adapter;
    private EventBus bus;
    TextView emptyView;
    private HostInfo hostInfo;
    private HostManager hostManager;
    private OnEpisodeSelectedListener listenerActivity;
    ExpandableListView seasonsEpisodesListView;
    SwipeRefreshLayout swipeRefreshLayout;
    private int tvshowId;

    public TVShowEpisodeListFragment()
    {
        tvshowId = -1;
    }

    private void startSync(boolean flag)
    {
        Intent intent = new Intent(getActivity(), org/xbmc/kore/service/LibrarySyncService);
        intent.putExtra("sync_single_tvshow", true);
        intent.putExtra("sync_tvshowid", tvshowId);
        Bundle bundle = new Bundle();
        bundle.putBoolean("silent_sync", flag);
        intent.putExtra("sync_extras", bundle);
        getActivity().startService(intent);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        seasonsEpisodesListView.setEmptyView(emptyView);
        seasonsEpisodesListView.setOnGroupClickListener(new android.widget.ExpandableListView.OnGroupClickListener() {

            final TVShowEpisodeListFragment this$0;

            public boolean onGroupClick(ExpandableListView expandablelistview, View view, int i, long l)
            {
                if (expandablelistview.isGroupExpanded(i))
                {
                    expandablelistview.collapseGroup(i);
                } else
                {
                    expandablelistview.expandGroup(i);
                }
                return true;
            }

            
            {
                this$0 = TVShowEpisodeListFragment.this;
                super();
            }
        });
        seasonsEpisodesListView.setOnChildClickListener(new android.widget.ExpandableListView.OnChildClickListener() {

            final TVShowEpisodeListFragment this$0;

            public boolean onChildClick(ExpandableListView expandablelistview, View view, int i, int j, long l)
            {
                expandablelistview = (EpisodeViewHolder)view.getTag();
                listenerActivity.onEpisodeSelected(tvshowId, ((EpisodeViewHolder) (expandablelistview)).episodeId);
                return true;
            }

            
            {
                this$0 = TVShowEpisodeListFragment.this;
                super();
            }
        });
        adapter = new SeasonsEpisodesAdapter(getActivity());
        getLoaderManager().initLoader(-1, null, this);
        seasonsEpisodesListView.setAdapter(adapter);
        setHasOptionsMenu(true);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            listenerActivity = (OnEpisodeSelectedListener)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement OnEpisodeSelectedListener").toString());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        if (!isAdded())
        {
            LogUtils.LOGD(TAG, (new StringBuilder()).append("Trying to create a loader, but the fragment isn't added. Loader Id: ").append(i).toString());
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag = PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean("tvshow_episodes_filter_hide_watched", false);
        switch (i)
        {
        default:
            i = bundle.getInt("season");
            bundle = org.xbmc.kore.provider.MediaContract.Episodes.buildTVShowSeasonEpisodesListUri(hostInfo.getId(), tvshowId, i);
            if (flag)
            {
                stringbuilder.append("playcount").append("=0");
            }
            return new CursorLoader(getActivity(), bundle, EpisodesListQuery.PROJECTION, stringbuilder.toString(), null, "episode ASC");

        case -1: 
            bundle = org.xbmc.kore.provider.MediaContract.Seasons.buildTVShowSeasonsListUri(hostInfo.getId(), tvshowId);
            break;
        }
        if (flag)
        {
            stringbuilder.append("watchedepisodes").append("!=").append("episode");
        }
        return new CursorLoader(getActivity(), bundle, SeasonsListQuery.PROJECTION, stringbuilder.toString(), null, "season ASC");
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f0f000a, menu);
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        menu.findItem(0x7f0e00e5).setChecked(sharedpreferences.getBoolean("tvshow_episodes_filter_hide_watched", false));
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        tvshowId = getArguments().getInt("tvshow_id", -1);
        if (viewgroup == null || tvshowId == -1)
        {
            return null;
        } else
        {
            bus = EventBus.getDefault();
            hostManager = HostManager.getInstance(getActivity());
            hostInfo = hostManager.getHostInfo();
            layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f030034, viewgroup, false);
            ButterKnife.inject(this, layoutinflater);
            swipeRefreshLayout.setOnRefreshListener(this);
            return layoutinflater;
        }
    }

    public void onDetach()
    {
        super.onDetach();
        listenerActivity = null;
    }

    public void onEventMainThread(MediaSyncEvent mediasyncevent)
    {
        if (mediasyncevent.syncType.equals("sync_single_tvshow") || mediasyncevent.syncType.equals("sync_all_tvshows"))
        {
            swipeRefreshLayout.setRefreshing(false);
            if (mediasyncevent.status == 1)
            {
                getLoaderManager().restartLoader(-1, null, this);
            }
        }
    }

    public void onLoadFinished(Loader loader, Cursor cursor)
    {
        LogUtils.LOGD(TAG, (new StringBuilder()).append("onLoadFinished, Loader id: ").append(loader.getId()).append(". Rows: ").append(cursor.getCount()).toString());
        switch (loader.getId())
        {
        default:
            if (adapter.getCursor() != null)
            {
                adapter.setChildrenCursor(loader.getId(), cursor);
            }
            return;

        case -1: 
            adapter.setGroupCursor(cursor);
            break;
        }
        if (cursor.getCount() != 1) goto _L2; else goto _L1
_L1:
        seasonsEpisodesListView.collapseGroup(0);
        seasonsEpisodesListView.expandGroup(0);
_L5:
        emptyView.setText(getString(0x7f070060));
        return;
_L2:
        if (cursor.getCount() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        cursor.moveToFirst();
_L6:
        if (cursor.getInt(3) - cursor.getInt(4) <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        LogUtils.LOGD(TAG, (new StringBuilder()).append("Expanding group: ").append(cursor.getPosition()).toString());
        seasonsEpisodesListView.collapseGroup(cursor.getPosition());
        seasonsEpisodesListView.expandGroup(cursor.getPosition());
        if (true) goto _L4; else goto _L3
_L3:
        continue; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
        if (cursor.moveToNext()) goto _L6; else goto _L5
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (Cursor)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        loader.getId();
        JVM INSTR tableswitch -1 -1: default 24
    //                   -1 47;
           goto _L1 _L2
_L1:
        if (adapter.getCursor() == null) goto _L4; else goto _L3
_L3:
        adapter.setChildrenCursor(loader.getId(), null);
_L4:
        return;
_L2:
        adapter.setGroupCursor(null);
        return;
        loader;
        LogUtils.LOGW(TAG, "Adapter expired.");
        return;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 2131624165 2131624165: default 24
    //                   2131624165 30;
           goto _L1 _L2
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        boolean flag;
        if (!menuitem.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setChecked(flag);
        PreferenceManager.getDefaultSharedPreferences(getActivity()).edit().putBoolean("tvshow_episodes_filter_hide_watched", menuitem.isChecked()).apply();
        getLoaderManager().restartLoader(-1, null, this);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onPause()
    {
        bus.unregister(this);
        super.onPause();
    }

    public void onRefresh()
    {
        if (hostInfo != null)
        {
            startSync(false);
            return;
        } else
        {
            swipeRefreshLayout.setRefreshing(false);
            Toast.makeText(getActivity(), 0x7f070067, 0).show();
            return;
        }
    }

    public void onResume()
    {
        bus.register(this);
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }



}
