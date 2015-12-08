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
import org.xbmc.kore.service.LibrarySyncService;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;

public class AudioGenresListFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener, android.support.v7.widget.SearchView.OnQueryTextListener
{
    private static interface AudioGenreListQuery
    {

        public static final String PROJECTION[] = {
            "_id", "genreid", "title", "thumbnail"
        };

    }

    private static class AudioGenresAdapter extends CursorAdapter
    {

        private int artHeight;
        private int artWidth;
        private HostManager hostManager;

        public void bindView(View view, Context context, Cursor cursor)
        {
            view = (ViewHolder)view.getTag();
            view.genreId = cursor.getInt(1);
            view.genreTitle = cursor.getString(2);
            ((ViewHolder) (view)).titleView.setText(((ViewHolder) (view)).genreTitle);
            cursor = cursor.getString(3);
            UIUtils.loadImageWithCharacterAvatar(context, hostManager, cursor, ((ViewHolder) (view)).genreTitle, ((ViewHolder) (view)).artView, artWidth, artHeight);
        }

        public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
        {
            context = LayoutInflater.from(context).inflate(0x7f030039, viewgroup, false);
            cursor = new ViewHolder();
            cursor.titleView = (TextView)context.findViewById(0x7f0e002d);
            cursor.artView = (ImageView)context.findViewById(0x7f0e0070);
            context.setTag(cursor);
            return context;
        }

        public AudioGenresAdapter(Context context)
        {
            super(context, null, false);
            hostManager = HostManager.getInstance(context);
            context = context.getResources();
            artWidth = (int)(context.getDimension(0x7f08001a) / 1.0F);
            artHeight = (int)(context.getDimension(0x7f080019) / 1.0F);
        }
    }

    public static interface OnAudioGenreSelectedListener
    {

        public abstract void onAudioGenreSelected(int i, String s);
    }

    private static class ViewHolder
    {

        ImageView artView;
        int genreId;
        String genreTitle;
        TextView titleView;

        private ViewHolder()
        {
        }

    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/AudioGenresListFragment);
    private CursorAdapter adapter;
    GridView audioGenresGridView;
    private EventBus bus;
    TextView emptyView;
    private HostInfo hostInfo;
    private OnAudioGenreSelectedListener listenerActivity;
    private String searchFilter;
    SwipeRefreshLayout swipeRefreshLayout;

    public AudioGenresListFragment()
    {
        searchFilter = null;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        audioGenresGridView.setEmptyView(emptyView);
        audioGenresGridView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final AudioGenresListFragment this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (ViewHolder)view.getTag();
                listenerActivity.onAudioGenreSelected(((ViewHolder) (adapterview)).genreId, ((ViewHolder) (adapterview)).genreTitle);
            }

            
            {
                this$0 = AudioGenresListFragment.this;
                super();
            }
        });
        adapter = new AudioGenresAdapter(getActivity());
        audioGenresGridView.setAdapter(adapter);
        getLoaderManager().initLoader(0, null, this);
        setHasOptionsMenu(true);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            listenerActivity = (OnAudioGenreSelectedListener)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement OnAudioGenreSelectedListener").toString());
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
        long l;
        if (hostInfo != null)
        {
            l = hostInfo.getId();
        } else
        {
            l = -1L;
        }
        uri = org.xbmc.kore.provider.MediaContract.AudioGenres.buildAudioGenresListUri(l);
        bundle = null;
        as = null;
        if (!TextUtils.isEmpty(searchFilter))
        {
            bundle = "title LIKE ?";
            as = new String[1];
            as[0] = (new StringBuilder()).append("%").append(searchFilter).append("%").toString();
        }
        return new CursorLoader(getActivity(), uri, AudioGenreListQuery.PROJECTION, bundle, as, "title ASC");
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f0f0004, menu);
        SearchView searchview = (SearchView)MenuItemCompat.getActionView(menu.findItem(0x7f0e00e1));
        searchview.setOnQueryTextListener(this);
        searchview.setQueryHint(getString(0x7f070013));
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
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
        emptyView.setText(getString(0x7f070062));
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
