// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.event.MediaSyncEvent;
import org.xbmc.kore.service.LibrarySyncService;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            AllCastActivity

public class TVShowOverviewFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
{
    public static interface TVShowCastListQuery
    {

        public static final String PROJECTION[] = {
            "_id", "name", "cast_order", "role", "thumbnail"
        };

    }

    private static interface TVShowDetailsQuery
    {

        public static final String PROJECTION[] = {
            "_id", "title", "thumbnail", "fanart", "premiered", "studio", "episode", "watchedepisodes", "rating", "plot", 
            "playcount", "imdbnumber", "genres", "updated"
        };

    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/TVShowOverviewFragment);
    private static boolean hasIssuedOutdatedRefresh = false;
    private EventBus bus;
    private ArrayList castArrayList;
    private HostInfo hostInfo;
    private HostManager hostManager;
    ImageView mediaArt;
    TextView mediaDescription;
    TextView mediaGenres;
    TextView mediaMaxRating;
    ScrollView mediaPanel;
    ImageView mediaPoster;
    TextView mediaPremiered;
    TextView mediaRating;
    TextView mediaTitle;
    TextView mediaUndertitle;
    SwipeRefreshLayout swipeRefreshLayout;
    private int tvshowId;
    private String tvshowTitle;
    GridLayout videoCastList;

    public TVShowOverviewFragment()
    {
        tvshowId = -1;
    }

    private void checkOutdatedTVShowDetails(Cursor cursor)
    {
        if (!hasIssuedOutdatedRefresh)
        {
            cursor.moveToFirst();
            long l = cursor.getLong(13);
            if (System.currentTimeMillis() > 0x493e0L + l)
            {
                hasIssuedOutdatedRefresh = true;
                startSync(true);
                return;
            }
        }
    }

    private void displayCastList(Cursor cursor)
    {
        if (cursor.moveToFirst())
        {
            castArrayList = new ArrayList(cursor.getCount());
            do
            {
                castArrayList.add(new org.xbmc.kore.jsonrpc.type.VideoType.Cast(cursor.getString(1), cursor.getInt(2), cursor.getString(3), cursor.getString(4)));
            } while (cursor.moveToNext());
            UIUtils.setupCastInfo(getActivity(), castArrayList, videoCastList, AllCastActivity.buildLaunchIntent(getActivity(), tvshowTitle, castArrayList));
        }
    }

    private void displayTVShowDetails(Cursor cursor)
    {
        cursor.moveToFirst();
        tvshowTitle = cursor.getString(1);
        mediaTitle.setText(tvshowTitle);
        int i = cursor.getInt(6);
        int j = cursor.getInt(7);
        Object obj = String.format(getString(0x7f07006c), new Object[] {
            Integer.valueOf(i), Integer.valueOf(i - j)
        });
        mediaUndertitle.setText(((CharSequence) (obj)));
        obj = (new StringBuilder()).append(String.format(getString(0x7f070076), new Object[] {
            cursor.getString(4)
        })).append("  |  ").append(cursor.getString(5)).toString();
        mediaPremiered.setText(((CharSequence) (obj)));
        mediaGenres.setText(cursor.getString(12));
        double d = cursor.getDouble(8);
        DisplayMetrics displaymetrics;
        if (d > 0.0D)
        {
            mediaRating.setVisibility(0);
            mediaMaxRating.setVisibility(0);
            mediaRating.setText(String.format("%01.01f", new Object[] {
                Double.valueOf(d)
            }));
            mediaMaxRating.setText(getString(0x7f070054));
        } else
        {
            mediaRating.setVisibility(4);
            mediaMaxRating.setVisibility(4);
        }
        mediaDescription.setText(cursor.getString(9));
        obj = getActivity().getResources();
        displaymetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        i = ((Resources) (obj)).getDimensionPixelOffset(0x7f080028);
        j = ((Resources) (obj)).getDimensionPixelOffset(0x7f080026);
        UIUtils.loadImageWithCharacterAvatar(getActivity(), hostManager, cursor.getString(2), tvshowTitle, mediaPoster, i, j);
        i = ((Resources) (obj)).getDimensionPixelOffset(0x7f080025);
        UIUtils.loadImageIntoImageview(hostManager, cursor.getString(3), mediaArt, displaymetrics.widthPixels, i);
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
        hasIssuedOutdatedRefresh = false;
        getLoaderManager().initLoader(0, null, this);
        getLoaderManager().initLoader(1, null, this);
        setHasOptionsMenu(false);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            bundle = org.xbmc.kore.provider.MediaContract.TVShows.buildTVShowUri(hostInfo.getId(), tvshowId);
            return new CursorLoader(getActivity(), bundle, TVShowDetailsQuery.PROJECTION, null, null, null);

        case 1: // '\001'
            bundle = org.xbmc.kore.provider.MediaContract.TVShowCast.buildTVShowCastListUri(hostInfo.getId(), tvshowId);
            break;
        }
        return new CursorLoader(getActivity(), bundle, TVShowCastListQuery.PROJECTION, null, null, "cast_order ASC");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        tvshowId = getArguments().getInt("tvshow_id", -1);
        if (viewgroup == null || tvshowId == -1)
        {
            return null;
        } else
        {
            layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f030035, viewgroup, false);
            ButterKnife.inject(this, layoutinflater);
            bus = EventBus.getDefault();
            hostManager = HostManager.getInstance(getActivity());
            hostInfo = hostManager.getHostInfo();
            swipeRefreshLayout.setOnRefreshListener(this);
            int i = getActivity().getResources().getDimensionPixelSize(0x7f080074);
            mediaPanel.getViewTreeObserver().addOnScrollChangedListener(new android.view.ViewTreeObserver.OnScrollChangedListener() {

                final TVShowOverviewFragment this$0;
                final int val$pixelsToTransparent;

                public void onScrollChanged()
                {
                    float f = Math.min(1.0F, Math.max(0.0F, 1.0F - (float)mediaPanel.getScrollY() / (float)pixelsToTransparent));
                    mediaArt.setAlpha(f);
                }

            
            {
                this$0 = TVShowOverviewFragment.this;
                pixelsToTransparent = i;
                super();
            }
            });
            return layoutinflater;
        }
    }

    public void onEventMainThread(MediaSyncEvent mediasyncevent)
    {
        boolean flag = false;
        if (mediasyncevent.syncExtras != null)
        {
            flag = mediasyncevent.syncExtras.getBoolean("silent_sync", false);
        }
        if (mediasyncevent.syncType.equals("sync_single_tvshow") || mediasyncevent.syncType.equals("sync_all_tvshows"))
        {
            swipeRefreshLayout.setRefreshing(false);
            if (mediasyncevent.status == 1)
            {
                getLoaderManager().restartLoader(0, null, this);
                getLoaderManager().restartLoader(1, null, this);
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
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        loader.getId();
        JVM INSTR tableswitch 0 1: default 40
    //                   0 41
    //                   1 52;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        displayTVShowDetails(cursor);
        checkOutdatedTVShowDetails(cursor);
        return;
_L4:
        displayCastList(cursor);
        return;
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (Cursor)obj);
    }

    public void onLoaderReset(Loader loader)
    {
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
