// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
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

public class AlbumListFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener, android.support.v7.widget.SearchView.OnQueryTextListener
{
    private static interface AlbumListQuery
    {

        public static final String PROJECTION[] = {
            "_id", "albumid", "title", "displayartist", "genre", "thumbnail", "year"
        };
        public static final String SORT = (new StringBuilder()).append(MediaDatabase.sortCommonTokens("title")).append(" ASC").toString();

    }

    private static class AlbumsAdapter extends CursorAdapter
    {

        private int artHeight;
        private int artWidth;
        private HostManager hostManager;

        public void bindView(View view, Context context, Cursor cursor)
        {
            ViewHolder viewholder = (ViewHolder)view.getTag();
            viewholder.albumId = cursor.getInt(1);
            viewholder.albumTitle = cursor.getString(2);
            viewholder.titleView.setText(viewholder.albumTitle);
            viewholder.artistView.setText(cursor.getString(3));
            int i = cursor.getInt(6);
            view = cursor.getString(4);
            if (view != null)
            {
                if (i > 0)
                {
                    view = (new StringBuilder()).append(view).append("  |  ").append(i).toString();
                }
            } else
            {
                view = String.valueOf(i);
            }
            viewholder.genresView.setText(view);
            view = cursor.getString(5);
            UIUtils.loadImageWithCharacterAvatar(context, hostManager, view, viewholder.albumTitle, viewholder.artView, artWidth, artHeight);
        }

        public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
        {
            context = LayoutInflater.from(context).inflate(0x7f030037, viewgroup, false);
            cursor = new ViewHolder();
            cursor.titleView = (TextView)context.findViewById(0x7f0e002d);
            cursor.artistView = (TextView)context.findViewById(0x7f0e00b6);
            cursor.genresView = (TextView)context.findViewById(0x7f0e008f);
            cursor.artView = (ImageView)context.findViewById(0x7f0e0070);
            context.setTag(cursor);
            return context;
        }

        public AlbumsAdapter(Context context)
        {
            super(context, null, false);
            hostManager = HostManager.getInstance(context);
            context = context.getResources();
            artWidth = (int)(context.getDimension(0x7f080016) / 1.0F);
            artHeight = (int)(context.getDimension(0x7f080015) / 1.0F);
        }
    }

    public static interface OnAlbumSelectedListener
    {

        public abstract void onAlbumSelected(int i, String s);
    }

    private static class ViewHolder
    {

        int albumId;
        String albumTitle;
        ImageView artView;
        TextView artistView;
        TextView genresView;
        TextView titleView;

        private ViewHolder()
        {
        }

    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/AlbumListFragment);
    private CursorAdapter adapter;
    GridView albumsGridView;
    private int artistId;
    private EventBus bus;
    TextView emptyView;
    private int genreId;
    private HostInfo hostInfo;
    private OnAlbumSelectedListener listenerActivity;
    private String searchFilter;
    SwipeRefreshLayout swipeRefreshLayout;

    public AlbumListFragment()
    {
        searchFilter = null;
        genreId = -1;
        artistId = -1;
    }

    public static AlbumListFragment newInstanceForArtist(int i)
    {
        AlbumListFragment albumlistfragment = new AlbumListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("artistid", i);
        albumlistfragment.setArguments(bundle);
        return albumlistfragment;
    }

    public static AlbumListFragment newInstanceForGenre(int i)
    {
        AlbumListFragment albumlistfragment = new AlbumListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("genreid", i);
        albumlistfragment.setArguments(bundle);
        return albumlistfragment;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        albumsGridView.setEmptyView(emptyView);
        albumsGridView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final AlbumListFragment this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (ViewHolder)view.getTag();
                listenerActivity.onAlbumSelected(((ViewHolder) (adapterview)).albumId, ((ViewHolder) (adapterview)).albumTitle);
            }

            
            {
                this$0 = AlbumListFragment.this;
                super();
            }
        });
        adapter = new AlbumsAdapter(getActivity());
        albumsGridView.setAdapter(adapter);
        getLoaderManager().initLoader(0, null, this);
        setHasOptionsMenu(true);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            listenerActivity = (OnAlbumSelectedListener)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement OnAlbumSelectedListener").toString());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        String s;
        String as[];
        if (hostInfo != null)
        {
            i = hostInfo.getId();
        } else
        {
            i = -1;
        }
        if (artistId != -1)
        {
            bundle = org.xbmc.kore.provider.MediaContract.AlbumArtists.buildAlbumsForArtistListUri(i, artistId);
        } else
        if (genreId != -1)
        {
            bundle = org.xbmc.kore.provider.MediaContract.AlbumGenres.buildAlbumsForGenreListUri(i, genreId);
        } else
        {
            bundle = org.xbmc.kore.provider.MediaContract.Albums.buildAlbumsListUri(i);
        }
        s = null;
        as = null;
        if (!TextUtils.isEmpty(searchFilter))
        {
            s = "title LIKE ?";
            as = new String[1];
            as[0] = (new StringBuilder()).append("%").append(searchFilter).append("%").toString();
        }
        return new CursorLoader(getActivity(), bundle, AlbumListQuery.PROJECTION, s, as, AlbumListQuery.SORT);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f0f0004, menu);
        SearchView searchview = (SearchView)MenuItemCompat.getActionView(menu.findItem(0x7f0e00e1));
        searchview.setOnQueryTextListener(this);
        searchview.setQueryHint(getString(0x7f070011));
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (getArguments() != null)
        {
            genreId = getArguments().getInt("genreid", -1);
            artistId = getArguments().getInt("artistid", -1);
        }
        layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f030029, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        bus = EventBus.getDefault();
        hostInfo = HostManager.getInstance(getActivity()).getHostInfo();
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
label0:
        {
            if (mediasyncevent.syncType.equals("sync_all_music"))
            {
                swipeRefreshLayout.setRefreshing(false);
                if (mediasyncevent.status != 1)
                {
                    break label0;
                }
                getLoaderManager().restartLoader(0, null, this);
                Toast.makeText(getActivity(), 0x7f070094, 0).show();
            }
            return;
        }
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
    }

    public void onLoadFinished(Loader loader, Cursor cursor)
    {
        adapter.swapCursor(cursor);
        emptyView.setText(getString(0x7f07005d));
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
        return super.onOptionsItemSelected(menuitem);
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
            intent.putExtra("sync_all_music", true);
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
