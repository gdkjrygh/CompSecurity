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

public class MusicVideoDetailsFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
{
    private static interface MusicVideoDetailsQuery
    {

        public static final String PROJECTION[] = {
            "_id", "title", "album", "artist", "thumbnail", "fanart", "year", "genre", "runtime", "plot", 
            "file"
        };

    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/MusicVideoDetailsFragment);
    ImageButton addToPlaylistButton;
    private EventBus bus;
    private Handler callbackHandler;
    ImageButton downloadButton;
    View exitTransitionView;
    ImageButton fabButton;
    private HostInfo hostInfo;
    private HostManager hostManager;
    ImageView mediaArt;
    TextView mediaDescription;
    TextView mediaGenres;
    ScrollView mediaPanel;
    ImageView mediaPoster;
    TextView mediaTitle;
    TextView mediaUndertitle;
    TextView mediaYear;
    private org.xbmc.kore.utils.FileDownloadHelper.MusicVideoInfo musicVideoDownloadInfo;
    private int musicVideoId;
    private boolean showRefreshStatusMessage;
    SwipeRefreshLayout swipeRefreshLayout;

    public MusicVideoDetailsFragment()
    {
        callbackHandler = new Handler();
        musicVideoId = -1;
        musicVideoDownloadInfo = null;
        showRefreshStatusMessage = true;
    }

    private void displayMusicVideoDetails(Cursor cursor)
    {
        cursor.moveToFirst();
        String s = cursor.getString(1);
        mediaTitle.setText(s);
        Object obj = (new StringBuilder()).append(cursor.getString(3)).append("  |  ").append(cursor.getString(2)).toString();
        mediaUndertitle.setText(((CharSequence) (obj)));
        int i = cursor.getInt(8);
        DisplayMetrics displaymetrics;
        String s1;
        String s2;
        int j;
        if (i > 0)
        {
            obj = (new StringBuilder()).append(UIUtils.formatTime(i)).append("  |  ").append(String.valueOf(cursor.getInt(6))).toString();
        } else
        {
            obj = String.valueOf(cursor.getInt(6));
        }
        mediaYear.setText(((CharSequence) (obj)));
        mediaGenres.setText(cursor.getString(7));
        mediaDescription.setText(cursor.getString(9));
        obj = getActivity().getResources();
        displaymetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        s1 = cursor.getString(5);
        s2 = cursor.getString(4);
        i = ((Resources) (obj)).getDimensionPixelOffset(0x7f080025);
        j = displaymetrics.widthPixels;
        if (!TextUtils.isEmpty(s1))
        {
            int k = ((Resources) (obj)).getDimensionPixelOffset(0x7f080022);
            int i1 = ((Resources) (obj)).getDimensionPixelOffset(0x7f080021);
            mediaPoster.setVisibility(0);
            UIUtils.loadImageWithCharacterAvatar(getActivity(), hostManager, s2, s, mediaPoster, k, i1);
            UIUtils.loadImageIntoImageview(hostManager, s1, mediaArt, j, i);
        } else
        {
            mediaPoster.setVisibility(8);
            UIUtils.loadImageIntoImageview(hostManager, s2, mediaArt, j, i);
            i = mediaTitle.getPaddingRight();
            j = mediaTitle.getPaddingRight();
            int l = mediaTitle.getPaddingTop();
            int j1 = mediaTitle.getPaddingBottom();
            mediaTitle.setPadding(i, l, j, j1);
            mediaUndertitle.setPadding(i, l, j, j1);
        }
        musicVideoDownloadInfo = new org.xbmc.kore.utils.FileDownloadHelper.MusicVideoInfo(s, cursor.getString(10));
        downloadButton.setVisibility(0);
        if (musicVideoDownloadInfo.downloadFileExists())
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

    public static MusicVideoDetailsFragment newInstance(int i)
    {
        MusicVideoDetailsFragment musicvideodetailsfragment = new MusicVideoDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("music_video_id", i);
        musicvideodetailsfragment.setArguments(bundle);
        return musicvideodetailsfragment;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        getLoaderManager().initLoader(0, null, this);
        setHasOptionsMenu(false);
    }

    public void onAddToPlaylistClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.Playlist.GetPlaylists()).execute(hostManager.getConnection(), new ApiCallback() {

            final MusicVideoDetailsFragment this$0;

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
                    arraylist.musicvideoid = musicVideoId;
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
                this$0 = MusicVideoDetailsFragment.this;
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
            bundle = org.xbmc.kore.provider.MediaContract.MusicVideos.buildMusicVideoUri(hostInfo.getId(), musicVideoId);
            break;
        }
        return new CursorLoader(getActivity(), bundle, MusicVideoDetailsQuery.PROJECTION, null, null, null);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        musicVideoId = getArguments().getInt("music_video_id", -1);
        if (viewgroup == null || musicVideoId == -1)
        {
            return null;
        } else
        {
            layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f03002e, viewgroup, false);
            ButterKnife.inject(this, layoutinflater);
            bus = EventBus.getDefault();
            hostManager = HostManager.getInstance(getActivity());
            hostInfo = hostManager.getHostInfo();
            swipeRefreshLayout.setOnRefreshListener(this);
            int i = getActivity().getResources().getDimensionPixelSize(0x7f080074);
            mediaPanel.getViewTreeObserver().addOnScrollChangedListener(new android.view.ViewTreeObserver.OnScrollChangedListener() {

                final MusicVideoDetailsFragment this$0;
                final int val$pixelsToTransparent;

                public void onScrollChanged()
                {
                    float f = Math.min(1.0F, Math.max(0.0F, 1.0F - (float)mediaPanel.getScrollY() / (float)pixelsToTransparent));
                    mediaArt.setAlpha(f);
                }

            
            {
                this$0 = MusicVideoDetailsFragment.this;
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
        if (musicVideoDownloadInfo == null)
        {
            Toast.makeText(getActivity(), 0x7f070061, 0).show();
            return;
        }
        if ((new File(musicVideoDownloadInfo.getAbsoluteFilePath())).exists())
        {
            (new android.app.AlertDialog.Builder(getActivity())).setTitle(0x7f070033).setMessage(0x7f070036).setPositiveButton(0x7f07006e, new android.content.DialogInterface.OnClickListener() {

                final MusicVideoDetailsFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    FileDownloadHelper.downloadFiles(getActivity(), hostInfo, musicVideoDownloadInfo, 0, callbackHandler);
                }

            
            {
                this$0 = MusicVideoDetailsFragment.this;
                super();
            }
            }).setNeutralButton(0x7f070038, new android.content.DialogInterface.OnClickListener() {

                final MusicVideoDetailsFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    FileDownloadHelper.downloadFiles(getActivity(), hostInfo, musicVideoDownloadInfo, 1, callbackHandler);
                }

            
            {
                this$0 = MusicVideoDetailsFragment.this;
                super();
            }
            }).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

                final MusicVideoDetailsFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                }

            
            {
                this$0 = MusicVideoDetailsFragment.this;
                super();
            }
            }).show();
            return;
        } else
        {
            FileDownloadHelper.downloadFiles(getActivity(), hostInfo, musicVideoDownloadInfo, 1, callbackHandler);
            return;
        }
    }

    public void onEventMainThread(MediaSyncEvent mediasyncevent)
    {
        if (!mediasyncevent.syncType.equals("sync_all_music_videos")) goto _L2; else goto _L1
_L1:
        swipeRefreshLayout.setRefreshing(false);
        if (mediasyncevent.status != 1) goto _L4; else goto _L3
_L3:
        getLoaderManager().restartLoader(0, null, this);
        if (showRefreshStatusMessage)
        {
            Toast.makeText(getActivity(), 0x7f070094, 0).show();
        }
_L6:
        showRefreshStatusMessage = true;
_L2:
        return;
_L4:
        if (showRefreshStatusMessage)
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
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onFabClicked(View view)
    {
        view = new org.xbmc.kore.jsonrpc.type.PlaylistType.Item();
        view.musicvideoid = musicVideoId;
        (new org.xbmc.kore.jsonrpc.method.Player.Open(view)).execute(hostManager.getConnection(), new ApiCallback() {

            final MusicVideoDetailsFragment this$0;

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
                this$0 = MusicVideoDetailsFragment.this;
                super();
            }
        }, callbackHandler);
    }

    public void onLoadFinished(Loader loader, Cursor cursor)
    {
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        loader.getId();
        JVM INSTR tableswitch 0 0: default 36
    //                   0 37;
           goto _L2 _L3
_L2:
        return;
_L3:
        displayMusicVideoDetails(cursor);
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
            Intent intent = new Intent(getActivity(), org/xbmc/kore/service/LibrarySyncService);
            intent.putExtra("sync_all_music_videos", true);
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
        exitTransitionView.setVisibility(4);
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }






}
