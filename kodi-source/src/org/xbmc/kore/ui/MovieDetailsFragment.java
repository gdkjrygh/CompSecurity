// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.melnykov.fab.FloatingActionButton;
import com.melnykov.fab.ObservableScrollView;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.event.MediaSyncEvent;
import org.xbmc.kore.service.LibrarySyncService;
import org.xbmc.kore.utils.FileDownloadHelper;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;
import org.xbmc.kore.utils.Utils;

// Referenced classes of package org.xbmc.kore.ui:
//            AllCastActivity

public class MovieDetailsFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
{
    public static interface MovieCastListQuery
    {

        public static final String PROJECTION[] = {
            "_id", "name", "cast_order", "role", "thumbnail"
        };

    }

    private static interface MovieDetailsQuery
    {

        public static final String PROJECTION[] = {
            "_id", "title", "tagline", "thumbnail", "fanart", "year", "genres", "runtime", "rating", "votes", 
            "plot", "playcount", "director", "imdbnumber", "file", "updated"
        };

    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/MovieDetailsFragment);
    private static boolean hasIssuedOutdatedRefresh = false;
    ImageButton addToPlaylistButton;
    private EventBus bus;
    private Handler callbackHandler;
    private ArrayList castArrayList;
    ImageButton downloadButton;
    View exitTransitionView;
    ImageButton fabButton;
    private HostInfo hostInfo;
    private HostManager hostManager;
    ImageButton imdbButton;
    ImageView mediaArt;
    TextView mediaDescription;
    TextView mediaDirectors;
    TextView mediaGenres;
    TextView mediaMaxRating;
    ScrollView mediaPanel;
    ImageView mediaPoster;
    TextView mediaRating;
    TextView mediaRatingVotes;
    TextView mediaTitle;
    TextView mediaUndertitle;
    TextView mediaYear;
    private org.xbmc.kore.utils.FileDownloadHelper.MovieInfo movieDownloadInfo;
    private int movieId;
    private String movieTitle;
    ImageButton seenButton;
    SwipeRefreshLayout swipeRefreshLayout;
    GridLayout videoCastList;

    public MovieDetailsFragment()
    {
        callbackHandler = new Handler();
        movieId = -1;
        movieDownloadInfo = null;
    }

    private void checkOutdatedMovieDetails(Cursor cursor)
    {
        if (!hasIssuedOutdatedRefresh)
        {
            cursor.moveToFirst();
            long l = cursor.getLong(15);
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
            UIUtils.setupCastInfo(getActivity(), castArrayList, videoCastList, AllCastActivity.buildLaunchIntent(getActivity(), movieTitle, castArrayList));
        }
    }

    private void displayMovieDetails(Cursor cursor)
    {
        LogUtils.LOGD(TAG, "Refreshing movie details");
        cursor.moveToFirst();
        movieTitle = cursor.getString(1);
        mediaTitle.setText(movieTitle);
        mediaUndertitle.setText(cursor.getString(2));
        int i = cursor.getInt(7) / 60;
        double d;
        Object obj;
        if (i > 0)
        {
            obj = (new StringBuilder()).append(String.format(getString(0x7f070055), new Object[] {
                String.valueOf(i)
            })).append("  |  ").append(String.valueOf(cursor.getInt(5))).toString();
        } else
        {
            obj = String.valueOf(cursor.getInt(5));
        }
        mediaYear.setText(((CharSequence) (obj)));
        mediaGenres.setText(cursor.getString(6));
        d = cursor.getDouble(8);
        if (d > 0.0D)
        {
            mediaRating.setVisibility(0);
            mediaMaxRating.setVisibility(0);
            mediaRatingVotes.setVisibility(0);
            mediaRating.setText(String.format("%01.01f", new Object[] {
                Double.valueOf(d)
            }));
            mediaMaxRating.setText(getString(0x7f070054));
            obj = cursor.getString(9);
            Object obj1 = mediaRatingVotes;
            int j;
            int k;
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = "";
            } else
            {
                obj = String.format(getString(0x7f0700ab), new Object[] {
                    obj
                });
            }
            ((TextView) (obj1)).setText(((CharSequence) (obj)));
        } else
        {
            mediaRating.setVisibility(4);
            mediaMaxRating.setVisibility(4);
            mediaRatingVotes.setVisibility(4);
        }
        mediaDescription.setText(cursor.getString(10));
        mediaDirectors.setText(cursor.getString(12));
        imdbButton.setTag(cursor.getString(13));
        setupSeenButton(cursor.getInt(11));
        obj = getActivity().getResources();
        obj1 = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj1)));
        j = ((Resources) (obj)).getDimensionPixelOffset(0x7f080028);
        k = ((Resources) (obj)).getDimensionPixelOffset(0x7f080026);
        UIUtils.loadImageWithCharacterAvatar(getActivity(), hostManager, cursor.getString(3), movieTitle, mediaPoster, j, k);
        j = ((Resources) (obj)).getDimensionPixelOffset(0x7f080025);
        UIUtils.loadImageIntoImageview(hostManager, cursor.getString(4), mediaArt, ((DisplayMetrics) (obj1)).widthPixels, j);
        movieDownloadInfo = new org.xbmc.kore.utils.FileDownloadHelper.MovieInfo(movieTitle, cursor.getString(14));
        downloadButton.setVisibility(0);
        if (movieDownloadInfo.downloadFileExists())
        {
            cursor = getActivity().getTheme().obtainStyledAttributes(new int[] {
                0x7f010106
            });
            downloadButton.setColorFilter(cursor.getColor(0, 0x7f0d0004));
            cursor.recycle();
            return;
        } else
        {
            downloadButton.clearColorFilter();
            return;
        }
    }

    public static MovieDetailsFragment newInstance(int i)
    {
        MovieDetailsFragment moviedetailsfragment = new MovieDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("movie_id", i);
        moviedetailsfragment.setArguments(bundle);
        return moviedetailsfragment;
    }

    private void setupSeenButton(int i)
    {
        if (i > 0)
        {
            TypedArray typedarray = getActivity().getTheme().obtainStyledAttributes(new int[] {
                0x7f010106
            });
            seenButton.setColorFilter(typedarray.getColor(0, 0x7f0d0004));
            typedarray.recycle();
        } else
        {
            seenButton.clearColorFilter();
        }
        seenButton.setTag(Integer.valueOf(i));
    }

    private void startSync(boolean flag)
    {
        Intent intent = new Intent(getActivity(), org/xbmc/kore/service/LibrarySyncService);
        intent.putExtra("sync_single_movie", true);
        intent.putExtra("sync_movieid", movieId);
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

    public void onAddToPlaylistClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.Playlist.GetPlaylists()).execute(hostManager.getConnection(), new ApiCallback() {

            final MovieDetailsFragment this$0;

            public void onError(int i, String s)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    Toast.makeText(getActivity(), 0x7f0700a2, 0).show();
                    return;
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((ArrayList)obj);
            }

            public void onSuccess(ArrayList arraylist)
            {
                if (!isAdded())
                {
                    return;
                }
                byte byte0 = -1;
                arraylist = arraylist.iterator();
                int i;
                do
                {
                    i = byte0;
                    if (!arraylist.hasNext())
                    {
                        break;
                    }
                    org.xbmc.kore.jsonrpc.type.PlaylistType.GetPlaylistsReturnType getplaylistsreturntype = (org.xbmc.kore.jsonrpc.type.PlaylistType.GetPlaylistsReturnType)arraylist.next();
                    if (!getplaylistsreturntype.type.equals("video"))
                    {
                        continue;
                    }
                    i = getplaylistsreturntype.playlistid;
                    break;
                } while (true);
                if (i != -1)
                {
                    arraylist = new org.xbmc.kore.jsonrpc.type.PlaylistType.Item();
                    arraylist.movieid = movieId;
                    (new org.xbmc.kore.jsonrpc.method.Playlist.Add(i, arraylist)).execute(hostManager.getConnection(), new ApiCallback() {

                        final _cls3 this$1;

                        public void onError(int i, String s)
                        {
                            if (!isAdded())
                            {
                                return;
                            } else
                            {
                                Toast.makeText(getActivity(), 0x7f0700a2, 0).show();
                                return;
                            }
                        }

                        public volatile void onSuccess(Object obj)
                        {
                            onSuccess((String)obj);
                        }

                        public void onSuccess(String s)
                        {
                            if (!isAdded())
                            {
                                return;
                            } else
                            {
                                Toast.makeText(getActivity(), 0x7f07004f, 0).show();
                                return;
                            }
                        }

            
            {
                this$1 = _cls3.this;
                super();
            }
                    }, callbackHandler);
                    return;
                } else
                {
                    Toast.makeText(getActivity(), 0x7f070065, 0).show();
                    return;
                }
            }

            
            {
                this$0 = MovieDetailsFragment.this;
                super();
            }
        }, callbackHandler);
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
            bundle = org.xbmc.kore.provider.MediaContract.Movies.buildMovieUri(hostInfo.getId(), movieId);
            return new CursorLoader(getActivity(), bundle, MovieDetailsQuery.PROJECTION, null, null, null);

        case 1: // '\001'
            bundle = org.xbmc.kore.provider.MediaContract.MovieCast.buildMovieCastListUri(hostInfo.getId(), movieId);
            break;
        }
        return new CursorLoader(getActivity(), bundle, MovieCastListQuery.PROJECTION, null, null, "cast_order ASC");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        movieId = getArguments().getInt("movie_id", -1);
        if (viewgroup == null || movieId == -1)
        {
            return null;
        } else
        {
            layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f03002c, viewgroup, false);
            ButterKnife.inject(this, layoutinflater);
            bus = EventBus.getDefault();
            hostManager = HostManager.getInstance(getActivity());
            hostInfo = hostManager.getHostInfo();
            swipeRefreshLayout.setOnRefreshListener(this);
            int i = getActivity().getResources().getDimensionPixelSize(0x7f080074);
            mediaPanel.getViewTreeObserver().addOnScrollChangedListener(new android.view.ViewTreeObserver.OnScrollChangedListener() {

                final MovieDetailsFragment this$0;
                final int val$pixelsToTransparent;

                public void onScrollChanged()
                {
                    float f = Math.min(1.0F, Math.max(0.0F, 1.0F - (float)mediaPanel.getScrollY() / (float)pixelsToTransparent));
                    mediaArt.setAlpha(f);
                }

            
            {
                this$0 = MovieDetailsFragment.this;
                pixelsToTransparent = i;
                super();
            }
            });
            ((FloatingActionButton)fabButton).attachToScrollView((ObservableScrollView)mediaPanel);
            return layoutinflater;
        }
    }

    public void onDownloadClicked(View view)
    {
        if (movieDownloadInfo == null)
        {
            Toast.makeText(getActivity(), 0x7f070061, 0).show();
            return;
        }
        view = new android.content.DialogInterface.OnClickListener() {

            final MovieDetailsFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = MovieDetailsFragment.this;
                super();
            }
        };
        if ((new File(movieDownloadInfo.getAbsoluteFilePath())).exists())
        {
            (new android.app.AlertDialog.Builder(getActivity())).setTitle(0x7f070033).setMessage(0x7f070036).setPositiveButton(0x7f07006e, new android.content.DialogInterface.OnClickListener() {

                final MovieDetailsFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    FileDownloadHelper.downloadFiles(getActivity(), hostInfo, movieDownloadInfo, 0, callbackHandler);
                }

            
            {
                this$0 = MovieDetailsFragment.this;
                super();
            }
            }).setNeutralButton(0x7f070038, new android.content.DialogInterface.OnClickListener() {

                final MovieDetailsFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    FileDownloadHelper.downloadFiles(getActivity(), hostInfo, movieDownloadInfo, 1, callbackHandler);
                }

            
            {
                this$0 = MovieDetailsFragment.this;
                super();
            }
            }).setNegativeButton(0x1040000, view).show();
            return;
        } else
        {
            (new android.app.AlertDialog.Builder(getActivity())).setTitle(0x7f070033).setMessage(0x7f0700d2).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                final MovieDetailsFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    FileDownloadHelper.downloadFiles(getActivity(), hostInfo, movieDownloadInfo, 0, callbackHandler);
                }

            
            {
                this$0 = MovieDetailsFragment.this;
                super();
            }
            }).setNegativeButton(0x1040000, view).show();
            return;
        }
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

    public void onFabClicked(View view)
    {
        view = new org.xbmc.kore.jsonrpc.type.PlaylistType.Item();
        view.movieid = movieId;
        (new org.xbmc.kore.jsonrpc.method.Player.Open(view)).execute(hostManager.getConnection(), new ApiCallback() {

            final MovieDetailsFragment this$0;

            public void onError(int i, String s)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    Toast.makeText(getActivity(), 0x7f0700a2, 0).show();
                    return;
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                while (!isAdded() || !PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean("pref_switch_to_remote_after_media_start", true)) 
                {
                    return;
                }
                int i = (fabButton.getLeft() + fabButton.getRight()) / 2;
                int j = (fabButton.getTop() + fabButton.getBottom()) / 2;
                UIUtils.switchToRemoteWithAnimation(getActivity(), i, j, exitTransitionView);
            }

            
            {
                this$0 = MovieDetailsFragment.this;
                super();
            }
        }, callbackHandler);
    }

    public void onImdbClicked(View view)
    {
        view = (String)view.getTag();
        if (view != null)
        {
            Utils.openImdbForMovie(getActivity(), view);
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
        displayMovieDetails(cursor);
        checkOutdatedMovieDetails(cursor);
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
        exitTransitionView.setVisibility(4);
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

    public void onSeenClicked(View view)
    {
        int i;
        if (((Integer)view.getTag()).intValue() > 0)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        (new org.xbmc.kore.jsonrpc.method.VideoLibrary.SetMovieDetails(movieId, Integer.valueOf(i), null)).execute(hostManager.getConnection(), new ApiCallback() {

            final MovieDetailsFragment this$0;

            public void onError(int j, String s)
            {
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    startSync(true);
                    return;
                }
            }

            
            {
                this$0 = MovieDetailsFragment.this;
                super();
            }
        }, callbackHandler);
        setupSeenButton(i);
    }







}
