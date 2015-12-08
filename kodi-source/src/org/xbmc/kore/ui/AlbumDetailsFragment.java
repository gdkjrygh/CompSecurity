// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.DialogInterface;
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
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
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
import java.util.List;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.ApiMethod;
import org.xbmc.kore.utils.FileDownloadHelper;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;

public class AlbumDetailsFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    private static interface AlbumDetailsQuery
    {

        public static final String PROJECTION[] = {
            "_id", "title", "displayartist", "thumbnail", "fanart", "year", "genre", "albumlabel", "description", "rating"
        };

    }

    private static interface AlbumSongsListQuery
    {

        public static final String PROJECTION[] = {
            "_id", "title", "track", "duration", "file", "songid"
        };

    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/AlbumDetailsFragment);
    private int TYPE_ALBUM;
    private int TYPE_SONG;
    ImageButton addToPlaylistButton;
    private String albumDisplayArtist;
    private int albumId;
    private String albumTitle;
    private EventBus bus;
    private Handler callbackHandler;
    private ApiCallback defaultStringActionCallback;
    ImageButton downloadButton;
    View exitTransitionView;
    ImageButton fabButton;
    private HostInfo hostInfo;
    private HostManager hostManager;
    private boolean isDescriptionExpanded;
    ImageView mediaArt;
    TextView mediaDescription;
    LinearLayout mediaDescriptionContainer;
    TextView mediaMaxRating;
    ScrollView mediaPanel;
    ImageView mediaPoster;
    TextView mediaRating;
    ImageView mediaShowAll;
    TextView mediaTitle;
    TextView mediaUndertitle;
    TextView mediaYear;
    android.view.View.OnClickListener songClickListener;
    private List songInfoList;
    private android.view.View.OnClickListener songItemMenuClickListener;
    LinearLayout songListView;

    public AlbumDetailsFragment()
    {
        callbackHandler = new Handler();
        albumId = -1;
        songInfoList = null;
        defaultStringActionCallback = ApiMethod.getDefaultActionCallback();
        isDescriptionExpanded = false;
        TYPE_ALBUM = 0;
        TYPE_SONG = 1;
        songClickListener = new android.view.View.OnClickListener() {

            final AlbumDetailsFragment this$0;

            public void onClick(View view)
            {
                playSong(((org.xbmc.kore.utils.FileDownloadHelper.SongInfo)view.getTag()).songId);
            }

            
            {
                this$0 = AlbumDetailsFragment.this;
                super();
            }
        };
        songItemMenuClickListener = new android.view.View.OnClickListener() {

            final AlbumDetailsFragment this$0;

            public void onClick(View view)
            {
                org.xbmc.kore.utils.FileDownloadHelper.SongInfo songinfo = (org.xbmc.kore.utils.FileDownloadHelper.SongInfo)view.getTag();
                final int songId = songinfo.songId;
                view = new PopupMenu(getActivity(), view);
                view.getMenuInflater().inflate(0x7f0f0009, view.getMenu());
                view.setOnMenuItemClickListener(songinfo. new android.widget.PopupMenu.OnMenuItemClickListener() {

                    final _cls10 this$1;
                    final int val$songId;
                    final org.xbmc.kore.utils.FileDownloadHelper.SongInfo val$songInfo;

                    public boolean onMenuItemClick(MenuItem menuitem)
                    {
                        switch (menuitem.getItemId())
                        {
                        default:
                            return false;

                        case 2131624179: 
                            playSong(songId);
                            return true;

                        case 2131624180: 
                            addToPlaylist(TYPE_SONG, songId);
                            return true;

                        case 2131624062: 
                            break;
                        }
                        if ((new File(songInfo.getAbsoluteFilePath())).exists())
                        {
                            (new android.app.AlertDialog.Builder(getActivity())).setTitle(0x7f070033).setMessage(0x7f070036).setPositiveButton(0x7f07006e, new android.content.DialogInterface.OnClickListener() {

                                final _cls1 this$2;

                                public void onClick(DialogInterface dialoginterface, int i)
                                {
                                    FileDownloadHelper.downloadFiles(getActivity(), hostInfo, songInfo, 0, callbackHandler);
                                }

            
            {
                this$2 = _cls1.this;
                super();
            }
                            }).setNeutralButton(0x7f070038, new android.content.DialogInterface.OnClickListener() {

                                final _cls1 this$2;

                                public void onClick(DialogInterface dialoginterface, int i)
                                {
                                    FileDownloadHelper.downloadFiles(getActivity(), hostInfo, songInfo, 1, callbackHandler);
                                }

            
            {
                this$2 = _cls1.this;
                super();
            }
                            }).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

                                final _cls1 this$2;

                                public void onClick(DialogInterface dialoginterface, int i)
                                {
                                }

            
            {
                this$2 = _cls1.this;
                super();
            }
                            }).show();
                            return true;
                        } else
                        {
                            FileDownloadHelper.downloadFiles(getActivity(), hostInfo, songInfo, 1, callbackHandler);
                            return true;
                        }
                    }

            
            {
                this$1 = final__pcls10;
                songId = i;
                songInfo = org.xbmc.kore.utils.FileDownloadHelper.SongInfo.this;
                super();
            }
                });
                view.show();
            }

            
            {
                this$0 = AlbumDetailsFragment.this;
                super();
            }
        };
    }

    private void addToPlaylist(final int type, final int id)
    {
        (new org.xbmc.kore.jsonrpc.method.Playlist.GetPlaylists()).execute(hostManager.getConnection(), new ApiCallback() {

            final AlbumDetailsFragment this$0;
            final int val$id;
            final int val$type;

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
                    if (!getplaylistsreturntype.type.equals("audio"))
                    {
                        continue;
                    }
                    i = getplaylistsreturntype.playlistid;
                    break;
                } while (true);
                if (i != -1)
                {
                    arraylist = new org.xbmc.kore.jsonrpc.type.PlaylistType.Item();
                    if (type == TYPE_ALBUM)
                    {
                        arraylist.albumid = id;
                    } else
                    {
                        arraylist.songid = id;
                    }
                    (new org.xbmc.kore.jsonrpc.method.Playlist.Add(i, arraylist)).execute(hostManager.getConnection(), new ApiCallback() {

                        final _cls8 this$1;

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
                this$1 = _cls8.this;
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
                this$0 = AlbumDetailsFragment.this;
                type = i;
                id = j;
                super();
            }
        }, callbackHandler);
    }

    private void displayAlbumDetails(Cursor cursor)
    {
        Resources resources = getActivity().getResources();
        cursor.moveToFirst();
        albumTitle = cursor.getString(1);
        albumDisplayArtist = cursor.getString(2);
        mediaTitle.setText(albumTitle);
        mediaUndertitle.setText(albumDisplayArtist);
        final int maxLines = cursor.getInt(5);
        Object obj = cursor.getString(6);
        double d;
        String s;
        int i;
        if (maxLines > 0)
        {
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = (new StringBuilder()).append(((String) (obj))).append("  |  ").append(String.valueOf(maxLines)).toString();
            } else
            {
                obj = String.valueOf(maxLines);
            }
        }
        mediaYear.setText(((CharSequence) (obj)));
        d = cursor.getDouble(9);
        if (d > 0.0D)
        {
            mediaRating.setVisibility(0);
            mediaMaxRating.setVisibility(0);
            mediaRating.setText(String.format("%01.01f", new Object[] {
                Double.valueOf(d)
            }));
            mediaMaxRating.setText(getString(0x7f070053));
        } else
        {
            mediaRating.setVisibility(8);
            mediaMaxRating.setVisibility(8);
        }
        obj = cursor.getString(8);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            mediaDescription.setVisibility(0);
            mediaDescription.setText(((CharSequence) (obj)));
            maxLines = resources.getInteger(0x7f0b000a);
            obj = getActivity().getTheme().obtainStyledAttributes(new int[] {
                0x7f010016, 0x7f010012
            });
            final int iconCollapseResId = ((TypedArray) (obj)).getResourceId(0, 0x7f020050);
            final int iconExpandResId = ((TypedArray) (obj)).getResourceId(1, 0x7f020052);
            ((TypedArray) (obj)).recycle();
            mediaDescriptionContainer.setOnClickListener(new android.view.View.OnClickListener() {

                final AlbumDetailsFragment this$0;
                final int val$iconCollapseResId;
                final int val$iconExpandResId;
                final int val$maxLines;

                public void onClick(View view)
                {
                    boolean flag;
                    if (!isDescriptionExpanded)
                    {
                        mediaDescription.setMaxLines(0x7fffffff);
                        mediaShowAll.setImageResource(iconExpandResId);
                    } else
                    {
                        mediaDescription.setMaxLines(maxLines);
                        mediaShowAll.setImageResource(iconCollapseResId);
                    }
                    view = AlbumDetailsFragment.this;
                    if (!isDescriptionExpanded)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    view.isDescriptionExpanded = flag;
                }

            
            {
                this$0 = AlbumDetailsFragment.this;
                iconExpandResId = i;
                maxLines = j;
                iconCollapseResId = k;
                super();
            }
            });
        } else
        {
            mediaDescriptionContainer.setVisibility(8);
        }
        obj = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
        s = cursor.getString(4);
        cursor = cursor.getString(3);
        maxLines = resources.getDimensionPixelOffset(0x7f080025);
        i = ((DisplayMetrics) (obj)).widthPixels;
        if (!TextUtils.isEmpty(s))
        {
            int j = resources.getDimensionPixelOffset(0x7f080014);
            int l = resources.getDimensionPixelOffset(0x7f080013);
            mediaPoster.setVisibility(0);
            UIUtils.loadImageWithCharacterAvatar(getActivity(), hostManager, cursor, albumTitle, mediaPoster, j, l);
            UIUtils.loadImageIntoImageview(hostManager, s, mediaArt, i, maxLines);
            return;
        } else
        {
            mediaPoster.setVisibility(8);
            UIUtils.loadImageIntoImageview(hostManager, cursor, mediaArt, i, maxLines);
            maxLines = mediaTitle.getPaddingRight();
            i = mediaTitle.getPaddingRight();
            int k = mediaTitle.getPaddingTop();
            int i1 = mediaTitle.getPaddingBottom();
            mediaTitle.setPadding(maxLines, k, i, i1);
            mediaUndertitle.setPadding(maxLines, k, i, i1);
            return;
        }
    }

    private void displaySongsList(Cursor cursor)
    {
label0:
        {
            if (cursor.moveToFirst())
            {
                songInfoList = new ArrayList(cursor.getCount());
                do
                {
                    View view = LayoutInflater.from(getActivity()).inflate(0x7f030046, songListView, false);
                    TextView textview = (TextView)view.findViewById(0x7f0e00c9);
                    TextView textview1 = (TextView)view.findViewById(0x7f0e00c8);
                    TextView textview2 = (TextView)view.findViewById(0x7f0e00c1);
                    ImageView imageview = (ImageView)view.findViewById(0x7f0e00bd);
                    org.xbmc.kore.utils.FileDownloadHelper.SongInfo songinfo = new org.xbmc.kore.utils.FileDownloadHelper.SongInfo(albumDisplayArtist, albumTitle, cursor.getInt(5), cursor.getInt(2), cursor.getString(1), cursor.getString(4));
                    songInfoList.add(songinfo);
                    textview.setText(songinfo.title);
                    textview1.setText(String.valueOf(songinfo.track));
                    textview2.setText(UIUtils.formatTime(cursor.getInt(3)));
                    imageview.setTag(songinfo);
                    imageview.setOnClickListener(songItemMenuClickListener);
                    view.setTag(songinfo);
                    view.setOnClickListener(songClickListener);
                    songListView.addView(view);
                } while (cursor.moveToNext());
                if (songInfoList.size() > 0)
                {
                    downloadButton.setVisibility(0);
                    if (!(new org.xbmc.kore.utils.FileDownloadHelper.SongInfo(albumDisplayArtist, albumTitle, 0, 0, null, null)).downloadDirectoryExists())
                    {
                        break label0;
                    }
                    cursor = getActivity().getTheme().obtainStyledAttributes(new int[] {
                        0x7f010106
                    });
                    downloadButton.setColorFilter(cursor.getColor(0, 0x7f0d0004));
                    cursor.recycle();
                }
            }
            return;
        }
        downloadButton.clearColorFilter();
    }

    public static AlbumDetailsFragment newInstance(int i)
    {
        AlbumDetailsFragment albumdetailsfragment = new AlbumDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("album_id", i);
        albumdetailsfragment.setArguments(bundle);
        return albumdetailsfragment;
    }

    private void playSong(int i)
    {
        org.xbmc.kore.jsonrpc.type.PlaylistType.Item item = new org.xbmc.kore.jsonrpc.type.PlaylistType.Item();
        item.songid = i;
        (new org.xbmc.kore.jsonrpc.method.Player.Open(item)).execute(hostManager.getConnection(), defaultStringActionCallback, callbackHandler);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        getLoaderManager().initLoader(0, null, this);
        setHasOptionsMenu(false);
    }

    public void onAddToPlaylistClicked(View view)
    {
        addToPlaylist(TYPE_ALBUM, albumId);
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
            bundle = org.xbmc.kore.provider.MediaContract.Albums.buildAlbumUri(hostInfo.getId(), albumId);
            return new CursorLoader(getActivity(), bundle, AlbumDetailsQuery.PROJECTION, null, null, null);

        case 1: // '\001'
            bundle = org.xbmc.kore.provider.MediaContract.Songs.buildSongsListUri(hostInfo.getId(), albumId);
            break;
        }
        return new CursorLoader(getActivity(), bundle, AlbumSongsListQuery.PROJECTION, null, null, "track ASC");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        albumId = getArguments().getInt("album_id", -1);
        if (viewgroup == null || albumId == -1)
        {
            return null;
        } else
        {
            layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f030027, viewgroup, false);
            ButterKnife.inject(this, layoutinflater);
            bus = EventBus.getDefault();
            hostManager = HostManager.getInstance(getActivity());
            hostInfo = hostManager.getHostInfo();
            int i = getActivity().getResources().getDimensionPixelSize(0x7f080074);
            mediaPanel.getViewTreeObserver().addOnScrollChangedListener(new android.view.ViewTreeObserver.OnScrollChangedListener() {

                final AlbumDetailsFragment this$0;
                final int val$pixelsToTransparent;

                public void onScrollChanged()
                {
                    float f = Math.min(1.0F, Math.max(0.0F, 1.0F - (float)mediaPanel.getScrollY() / (float)pixelsToTransparent));
                    mediaArt.setAlpha(f);
                }

            
            {
                this$0 = AlbumDetailsFragment.this;
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
        if (albumTitle == null || albumDisplayArtist == null || songInfoList == null || songInfoList.size() == 0)
        {
            Toast.makeText(getActivity(), 0x7f070061, 0).show();
            return;
        }
        view = new android.content.DialogInterface.OnClickListener() {

            final AlbumDetailsFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = AlbumDetailsFragment.this;
                super();
            }
        };
        if ((new File(((org.xbmc.kore.utils.FileDownloadHelper.SongInfo)songInfoList.get(0)).getAbsoluteDirectoryPath())).exists())
        {
            (new android.app.AlertDialog.Builder(getActivity())).setTitle(0x7f070033).setMessage(0x7f070034).setPositiveButton(0x7f07006e, new android.content.DialogInterface.OnClickListener() {

                final AlbumDetailsFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    FileDownloadHelper.downloadFiles(getActivity(), hostInfo, songInfoList, 0, callbackHandler);
                }

            
            {
                this$0 = AlbumDetailsFragment.this;
                super();
            }
            }).setNeutralButton(0x7f070038, new android.content.DialogInterface.OnClickListener() {

                final AlbumDetailsFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    FileDownloadHelper.downloadFiles(getActivity(), hostInfo, songInfoList, 1, callbackHandler);
                }

            
            {
                this$0 = AlbumDetailsFragment.this;
                super();
            }
            }).setNegativeButton(0x1040000, view).show();
            return;
        } else
        {
            (new android.app.AlertDialog.Builder(getActivity())).setTitle(0x7f070033).setMessage(0x7f0700d0).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                final AlbumDetailsFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    FileDownloadHelper.downloadFiles(getActivity(), hostInfo, songInfoList, 0, callbackHandler);
                }

            
            {
                this$0 = AlbumDetailsFragment.this;
                super();
            }
            }).setNegativeButton(0x1040000, view).show();
            return;
        }
    }

    public void onFabClicked(View view)
    {
        view = new org.xbmc.kore.jsonrpc.type.PlaylistType.Item();
        view.albumid = albumId;
        (new org.xbmc.kore.jsonrpc.method.Player.Open(view)).execute(hostManager.getConnection(), new ApiCallback() {

            final AlbumDetailsFragment this$0;

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
                this$0 = AlbumDetailsFragment.this;
                super();
            }
        }, callbackHandler);
    }

    public void onLoadFinished(Loader loader, Cursor cursor)
    {
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        loader.getId();
        JVM INSTR tableswitch 0 1: default 40
    //                   0 41
    //                   1 58;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        displayAlbumDetails(cursor);
        getLoaderManager().initLoader(1, null, this);
        return;
_L4:
        displaySongsList(cursor);
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
        super.onPause();
    }

    public void onResume()
    {
        exitTransitionView.setVisibility(4);
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }







/*
    static boolean access$302(AlbumDetailsFragment albumdetailsfragment, boolean flag)
    {
        albumdetailsfragment.isDescriptionExpanded = flag;
        return flag;
    }

*/





}
