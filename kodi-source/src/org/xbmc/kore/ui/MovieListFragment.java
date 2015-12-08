// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import de.greenrobot.event.EventBus;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.event.MediaSyncEvent;
import org.xbmc.kore.provider.MediaDatabase;
import org.xbmc.kore.service.LibrarySyncService;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;

public class MovieListFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener, android.support.v7.widget.SearchView.OnQueryTextListener
{
    private static interface MovieListQuery
    {

        public static final String PROJECTION[] = {
            "_id", "movieid", "title", "thumbnail", "year", "genres", "runtime", "rating", "tagline"
        };
        public static final String SORT_BY_NAME_IGNORE_ARTICLES = (new StringBuilder()).append(MediaDatabase.sortCommonTokens("title")).append(" ASC").toString();

    }

    private static class MoviesAdapter extends CursorAdapter
    {

        private int artHeight;
        private int artWidth;
        private HostManager hostManager;

        public void bindView(View view, Context context, Cursor cursor)
        {
            ViewHolder viewholder = (ViewHolder)view.getTag();
            viewholder.movieId = cursor.getInt(1);
            viewholder.movieTitle = cursor.getString(2);
            viewholder.titleView.setText(viewholder.movieTitle);
            int i;
            if (TextUtils.isEmpty(cursor.getString(8)))
            {
                view = cursor.getString(5);
            } else
            {
                view = cursor.getString(8);
            }
            viewholder.detailsView.setText(view);
            i = cursor.getInt(6) / 60;
            if (i > 0)
            {
                view = (new StringBuilder()).append(String.format(context.getString(0x7f070055), new Object[] {
                    String.valueOf(i)
                })).append("  |  ").append(String.valueOf(cursor.getInt(4))).toString();
            } else
            {
                view = String.valueOf(cursor.getInt(4));
            }
            viewholder.durationView.setText(view);
            UIUtils.loadImageWithCharacterAvatar(context, hostManager, cursor.getString(3), viewholder.movieTitle, viewholder.artView, artWidth, artHeight);
        }

        public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
        {
            context = LayoutInflater.from(context).inflate(0x7f03003d, viewgroup, false);
            cursor = new ViewHolder();
            cursor.titleView = (TextView)context.findViewById(0x7f0e002d);
            cursor.detailsView = (TextView)context.findViewById(0x7f0e00a5);
            cursor.durationView = (TextView)context.findViewById(0x7f0e00c1);
            cursor.artView = (ImageView)context.findViewById(0x7f0e0070);
            context.setTag(cursor);
            return context;
        }

        public MoviesAdapter(Context context)
        {
            super(context, null, false);
            hostManager = HostManager.getInstance(context);
            context = context.getResources();
            artWidth = (int)(context.getDimension(0x7f080020) / 1.0F);
            artHeight = (int)(context.getDimension(0x7f08001f) / 1.0F);
        }
    }

    public static interface OnMovieSelectedListener
    {

        public abstract void onMovieSelected(int i, String s);
    }

    private static class ViewHolder
    {

        ImageView artView;
        TextView detailsView;
        TextView durationView;
        int movieId;
        String movieTitle;
        TextView titleView;

        private ViewHolder()
        {
        }

    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/MovieListFragment);
    private CursorAdapter adapter;
    private EventBus bus;
    TextView emptyView;
    private HostInfo hostInfo;
    private HostManager hostManager;
    private OnMovieSelectedListener listenerActivity;
    GridView moviesGridView;
    private String searchFilter;
    SwipeRefreshLayout swipeRefreshLayout;

    public MovieListFragment()
    {
        searchFilter = null;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        moviesGridView.setEmptyView(emptyView);
        moviesGridView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final MovieListFragment this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (ViewHolder)view.getTag();
                listenerActivity.onMovieSelected(((ViewHolder) (adapterview)).movieId, ((ViewHolder) (adapterview)).movieTitle);
            }

            
            {
                this$0 = MovieListFragment.this;
                super();
            }
        });
        adapter = new MoviesAdapter(getActivity());
        moviesGridView.setAdapter(adapter);
        getLoaderManager().initLoader(0, null, this);
        setHasOptionsMenu(true);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            listenerActivity = (OnMovieSelectedListener)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement OnMovieSelectedListener").toString());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        String as[];
        android.net.Uri uri;
        StringBuilder stringbuilder;
        long l;
        if (hostInfo != null)
        {
            l = hostInfo.getId();
        } else
        {
            l = -1L;
        }
        uri = org.xbmc.kore.provider.MediaContract.Movies.buildMoviesListUri(l);
        stringbuilder = new StringBuilder();
        as = null;
        if (!TextUtils.isEmpty(searchFilter))
        {
            stringbuilder.append("title LIKE ?");
            as = new String[1];
            as[0] = (new StringBuilder()).append("%").append(searchFilter).append("%").toString();
        }
        bundle = PreferenceManager.getDefaultSharedPreferences(getActivity());
        if (bundle.getBoolean("movies_filter_hide_watched", false))
        {
            if (stringbuilder.length() != 0)
            {
                stringbuilder.append(" AND ");
            }
            stringbuilder.append("playcount").append("=0");
        }
        if (bundle.getInt("movies_sort_order", 0) == 1)
        {
            bundle = "dateadded DESC";
        } else
        if (bundle.getBoolean("movies_ignore_prefixes", false))
        {
            bundle = MovieListQuery.SORT_BY_NAME_IGNORE_ARTICLES;
        } else
        {
            bundle = "title ASC";
        }
        return new CursorLoader(getActivity(), uri, MovieListQuery.PROJECTION, stringbuilder.toString(), as, bundle);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        MenuItem menuitem1;
        MenuItem menuitem2;
        SharedPreferences sharedpreferences;
        menuinflater.inflate(0x7f0f0005, menu);
        Object obj = (SearchView)MenuItemCompat.getActionView(menu.findItem(0x7f0e00e1));
        ((SearchView) (obj)).setOnQueryTextListener(this);
        ((SearchView) (obj)).setQueryHint(getString(0x7f070014));
        obj = menu.findItem(0x7f0e00e5);
        MenuItem menuitem = menu.findItem(0x7f0e00e4);
        menuitem1 = menu.findItem(0x7f0e00e2);
        menuitem2 = menu.findItem(0x7f0e00e3);
        sharedpreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        ((MenuItem) (obj)).setChecked(sharedpreferences.getBoolean("movies_filter_hide_watched", false));
        menuitem.setChecked(sharedpreferences.getBoolean("movies_ignore_prefixes", false));
        sharedpreferences.getInt("movies_sort_order", 0);
        JVM INSTR tableswitch 1 1: default 152
    //                   1 168;
           goto _L1 _L2
_L1:
        menuitem1.setChecked(true);
_L4:
        super.onCreateOptionsMenu(menu, menuinflater);
        return;
_L2:
        menuitem2.setChecked(true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f030029, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        bus = EventBus.getDefault();
        hostManager = HostManager.getInstance(getActivity());
        hostInfo = hostManager.getHostInfo();
        swipeRefreshLayout.setOnRefreshListener(this);
        return layoutinflater;
    }

    public void onDetach()
    {
        super.onDetach();
        listenerActivity = null;
    }

    public void onEventMainThread(MediaSyncEvent mediasyncevent)
    {
        boolean flag = false;
        if (mediasyncevent.syncExtras != null)
        {
            flag = mediasyncevent.syncExtras.getBoolean("silent_sync", false);
        }
        if (mediasyncevent.syncType.equals("sync_single_movie") || mediasyncevent.syncType.equals("sync_all_movies"))
        {
            swipeRefreshLayout.setRefreshing(false);
            if (mediasyncevent.status == 1)
            {
                getLoaderManager().restartLoader(0, null, this);
                if (!flag)
                {
                    Toast.makeText(getActivity(), 0x7f070094, 0).show();
                }
            } else
            if (!flag)
            {
                if (mediasyncevent.errorCode == ApiException.API_ERROR)
                {
                    mediasyncevent = String.format(getString(0x7f070043), new Object[] {
                        mediasyncevent.errorMessage
                    });
                } else
                {
                    mediasyncevent = getString(0x7f0700a2);
                }
                Toast.makeText(getActivity(), mediasyncevent, 0).show();
                return;
            }
        }
    }

    public void onLoadFinished(Loader loader, Cursor cursor)
    {
        adapter.swapCursor(cursor);
        emptyView.setText(getString(0x7f070063));
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (Cursor)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        adapter.swapCursor(null);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        SharedPreferences sharedpreferences;
        boolean flag;
        boolean flag2;
        flag2 = true;
        flag = true;
        sharedpreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        menuitem.getItemId();
        JVM INSTR tableswitch 2131624162 2131624165: default 48
    //                   2131624162 177
    //                   2131624163 218
    //                   2131624164 114
    //                   2131624165 54;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return super.onOptionsItemSelected(menuitem);
_L5:
        if (menuitem.isChecked())
        {
            flag = false;
        }
        menuitem.setChecked(flag);
        sharedpreferences.edit().putBoolean("movies_filter_hide_watched", menuitem.isChecked()).apply();
        getLoaderManager().restartLoader(0, null, this);
        continue; /* Loop/switch isn't completed */
_L4:
        boolean flag1;
        if (!menuitem.isChecked())
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        menuitem.setChecked(flag1);
        sharedpreferences.edit().putBoolean("movies_ignore_prefixes", menuitem.isChecked()).apply();
        getLoaderManager().restartLoader(0, null, this);
        continue; /* Loop/switch isn't completed */
_L2:
        menuitem.setChecked(true);
        sharedpreferences.edit().putInt("movies_sort_order", 0).apply();
        getLoaderManager().restartLoader(0, null, this);
        continue; /* Loop/switch isn't completed */
_L3:
        menuitem.setChecked(true);
        sharedpreferences.edit().putInt("movies_sort_order", 1).apply();
        getLoaderManager().restartLoader(0, null, this);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void onPause()
    {
        bus.unregister(this);
        super.onPause();
    }

    public boolean onQueryTextChange(String s)
    {
        searchFilter = s;
        getLoaderManager().restartLoader(0, null, this);
        return true;
    }

    public boolean onQueryTextSubmit(String s)
    {
        return true;
    }

    public void onRefresh()
    {
        if (hostInfo != null)
        {
            swipeRefreshLayout.setRefreshing(true);
            Intent intent = new Intent(getActivity(), org/xbmc/kore/service/LibrarySyncService);
            intent.putExtra("sync_all_movies", true);
            getActivity().startService(intent);
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


}
