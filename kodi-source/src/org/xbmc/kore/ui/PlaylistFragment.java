// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import java.util.List;
import org.xbmc.kore.host.HostConnectionObserver;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.ApiMethod;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;
import org.xbmc.kore.utils.Utils;

public class PlaylistFragment extends Fragment
    implements org.xbmc.kore.host.HostConnectionObserver.PlayerEventsObserver
{
    private class PlayListAdapter extends BaseAdapter
        implements ListAdapter
    {

        int artHeight;
        int artWidth;
        int cardBackgroundColor;
        private android.view.View.OnClickListener playlistItemMenuClickListener = new _cls1();
        List playlistItems;
        int selectedCardBackgroundColor;
        final PlaylistFragment this$0;

        public int getCount()
        {
            if (playlistItems == null)
            {
                return 0;
            } else
            {
                return playlistItems.size();
            }
        }

        public volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public org.xbmc.kore.jsonrpc.type.ListType.ItemsAll getItem(int i)
        {
            if (playlistItems == null)
            {
                return null;
            } else
            {
                return (org.xbmc.kore.jsonrpc.type.ListType.ItemsAll)playlistItems.get(i);
            }
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            Object obj;
            org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall;
            int j;
            ViewHolder viewholder;
            View view1;
            TextView textview;
            if (view == null)
            {
                view1 = LayoutInflater.from(getActivity()).inflate(0x7f03003f, viewgroup, false);
                viewholder = new ViewHolder();
                viewholder.art = (ImageView)view1.findViewById(0x7f0e0070);
                viewholder.title = (TextView)view1.findViewById(0x7f0e002d);
                viewholder.details = (TextView)view1.findViewById(0x7f0e00a5);
                viewholder.contextMenu = (ImageView)view1.findViewById(0x7f0e00bd);
                viewholder.duration = (TextView)view1.findViewById(0x7f0e00c1);
                viewholder.card = (CardView)view1.findViewById(0x7f0e00c2);
                view1.setTag(viewholder);
            } else
            {
                viewholder = (ViewHolder)view.getTag();
                view1 = view;
            }
            itemsall = getItem(i);
            view = itemsall.type;
            j = -1;
            view.hashCode();
            JVM INSTR lookupswitch 4: default 192
        //                       -1544438277: 503
        //                       -759089802: 534
        //                       3536149: 518
        //                       104087344: 488;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            j;
            JVM INSTR tableswitch 0 3: default 224
        //                       0 550
        //                       1 579
        //                       2 668
        //                       3 724;
               goto _L6 _L7 _L8 _L9 _L10
_L7:
            break; /* Loop/switch isn't completed */
_L6:
            if (TextUtils.isEmpty(itemsall.label))
            {
                viewgroup = itemsall.file;
            } else
            {
                viewgroup = itemsall.label;
            }
            obj = itemsall.type;
            view = itemsall.thumbnail;
            j = itemsall.runtime;
            viewholder.title.setText(viewgroup);
            viewholder.details.setText(((CharSequence) (obj)));
            textview = viewholder.duration;
            if (j > 0)
            {
                obj = UIUtils.formatTime(j);
            } else
            {
                obj = "";
            }
            textview.setText(((CharSequence) (obj)));
            viewholder.position = i;
            if (i == playlistGridView.getCheckedItemPosition())
            {
                j = selectedCardBackgroundColor;
            } else
            {
                j = cardBackgroundColor;
            }
            viewholder.card.setCardBackgroundColor(j);
            if (itemsall.type.equals("movie") || itemsall.type.equals("episode"))
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (j == 0)
            {
                obj = viewholder.art.getLayoutParams();
                obj.width = ((android.view.ViewGroup.LayoutParams) (obj)).height;
                viewholder.art.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                artWidth = artHeight;
            }
            UIUtils.loadImageWithCharacterAvatar(getActivity(), hostManager, view, viewgroup, viewholder.art, artWidth, artHeight);
            viewholder.contextMenu.setTag(Integer.valueOf(i));
            viewholder.contextMenu.setOnClickListener(playlistItemMenuClickListener);
            return view1;
_L5:
            if (view.equals("movie"))
            {
                j = 0;
            }
            continue; /* Loop/switch isn't completed */
_L2:
            if (view.equals("episode"))
            {
                j = 1;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (view.equals("song"))
            {
                j = 2;
            }
            continue; /* Loop/switch isn't completed */
_L3:
            if (view.equals("musicvideo"))
            {
                j = 3;
            }
            if (true) goto _L1; else goto _L11
_L11:
            viewgroup = itemsall.title;
            obj = itemsall.tagline;
            view = itemsall.thumbnail;
            j = itemsall.runtime;
            break MISSING_BLOCK_LABEL_261;
_L8:
            viewgroup = itemsall.title;
            view = String.format(getString(0x7f070082), new Object[] {
                Integer.valueOf(itemsall.season), Integer.valueOf(itemsall.episode)
            });
            obj = String.format("%s | %s", new Object[] {
                itemsall.showtitle, view
            });
            view = itemsall.art.poster;
            j = itemsall.runtime;
            break MISSING_BLOCK_LABEL_261;
_L9:
            viewgroup = itemsall.title;
            obj = (new StringBuilder()).append(itemsall.displayartist).append(" | ").append(itemsall.album).toString();
            view = itemsall.thumbnail;
            j = itemsall.duration;
            break MISSING_BLOCK_LABEL_261;
_L10:
            viewgroup = itemsall.title;
            obj = (new StringBuilder()).append(Utils.listStringConcat(itemsall.artist, ", ")).append(" | ").append(itemsall.album).toString();
            view = itemsall.thumbnail;
            j = itemsall.runtime;
            break MISSING_BLOCK_LABEL_261;
        }

        public int getViewTypeCount()
        {
            return 1;
        }

        public void setPlaylistItems(List list)
        {
            playlistItems = list;
            notifyDataSetChanged();
        }

        public PlayListAdapter()
        {
            this(null);
        }

        public PlayListAdapter(List list)
        {
            this$0 = PlaylistFragment.this;
            super();
            artWidth = getResources().getDimensionPixelSize(0x7f08002a);
            artHeight = getResources().getDimensionPixelSize(0x7f080029);
            playlistItems = list;
            playlistfragment = getActivity().getTheme().obtainStyledAttributes(new int[] {
                0x7f010000, 0x7f010001
            });
            cardBackgroundColor = getColor(0, 0x7f0d005f);
            selectedCardBackgroundColor = getColor(1, 0x7f0d0062);
            recycle();
        }
    }

    private class PlayListAdapter.ViewHolder
    {

        ImageView art;
        CardView card;
        ImageView contextMenu;
        TextView details;
        TextView duration;
        int position;
        final PlayListAdapter this$1;
        TextView title;

        private PlayListAdapter.ViewHolder()
        {
            this$1 = PlayListAdapter.this;
            super();
        }

    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/PlaylistFragment);
    private Handler callbackHandler;
    private int currentActivePlayerId;
    private int currentPlaylistId;
    private ApiCallback defaultStringActionCallback;
    private HostConnectionObserver hostConnectionObserver;
    private HostManager hostManager;
    TextView infoMessage;
    RelativeLayout infoPanel;
    TextView infoTitle;
    private int lastCallResult;
    private org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType lastGetActivePlayerResult;
    private org.xbmc.kore.jsonrpc.type.ListType.ItemsAll lastGetItemResult;
    private List lastGetPlaylistItemsResult;
    private org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue lastGetPropertiesResult;
    private PlayListAdapter playListAdapter;
    GridView playlistGridView;

    public PlaylistFragment()
    {
        callbackHandler = new Handler();
        currentActivePlayerId = -1;
        currentPlaylistId = -1;
        defaultStringActionCallback = ApiMethod.getDefaultActionCallback();
        lastCallResult = 0;
        lastGetItemResult = null;
        lastGetPlaylistItemsResult = null;
    }

    private void displayEmptyPlaylistMessage()
    {
        switchToPanel(0x7f0e00b3);
        infoTitle.setText(0x7f070073);
        infoMessage.setText(null);
    }

    private void displayErrorGettingPlaylistMessage(String s)
    {
        switchToPanel(0x7f0e00b3);
        infoTitle.setText(0x7f070040);
        infoMessage.setText(String.format(getString(0x7f070042), new Object[] {
            s
        }));
    }

    private void displayPlaylist(org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall, List list)
    {
        if (list.size() == 0)
        {
            displayEmptyPlaylistMessage();
        } else
        {
            switchToPanel(0x7f0e00a3);
            playListAdapter.setPlaylistItems(list);
            int i = 0;
            while (i < list.size()) 
            {
                if (((org.xbmc.kore.jsonrpc.type.ListType.ItemsAll)list.get(i)).id == itemsall.id && ((org.xbmc.kore.jsonrpc.type.ListType.ItemsAll)list.get(i)).type.equals(itemsall.type))
                {
                    playlistGridView.setItemChecked(i, true);
                    playlistGridView.setSelection(i);
                }
                i++;
            }
        }
    }

    private void setupPlaylistInfo(org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getactiveplayersreturntype, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, final org.xbmc.kore.jsonrpc.type.ListType.ItemsAll getItemResult)
    {
        currentPlaylistId = propertyvalue.playlistid;
        if (currentPlaylistId == -1)
        {
            displayEmptyPlaylistMessage();
            return;
        } else
        {
            (new org.xbmc.kore.jsonrpc.method.Playlist.GetItems(currentPlaylistId, new String[] {
                "art", "artist", "albumartist", "album", "displayartist", "episode", "fanart", "file", "season", "showtitle", 
                "studio", "tagline", "thumbnail", "title", "track", "duration", "runtime"
            })).execute(hostManager.getConnection(), new ApiCallback() {

                final PlaylistFragment this$0;
                final org.xbmc.kore.jsonrpc.type.ListType.ItemsAll val$getItemResult;

                public void onError(int i, String s)
                {
                    if (!isAdded())
                    {
                        return;
                    } else
                    {
                        displayErrorGettingPlaylistMessage(s);
                        return;
                    }
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((List)obj);
                }

                public void onSuccess(List list)
                {
                    if (!isAdded())
                    {
                        return;
                    } else
                    {
                        lastGetPlaylistItemsResult = list;
                        displayPlaylist(getItemResult, list);
                        return;
                    }
                }

            
            {
                this$0 = PlaylistFragment.this;
                getItemResult = itemsall;
                super();
            }
            }, callbackHandler);
            return;
        }
    }

    private void switchToPanel(int i)
    {
        switch (i)
        {
        default:
            return;

        case 2131624115: 
            infoPanel.setVisibility(0);
            playlistGridView.setVisibility(8);
            return;

        case 2131624099: 
            infoPanel.setVisibility(8);
            playlistGridView.setVisibility(0);
            return;
        }
    }

    public void forceRefreshPlaylist()
    {
        if (lastCallResult == 2 || lastCallResult == 3)
        {
            setupPlaylistInfo(lastGetActivePlayerResult, lastGetPropertiesResult, lastGetItemResult);
        }
    }

    public void inputOnInputRequested(String s, String s1, String s2)
    {
    }

    public void observerOnStopObserving()
    {
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        hostManager = HostManager.getInstance(getActivity());
        hostConnectionObserver = hostManager.getHostConnectionObserver();
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f0f0006, menu);
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f030031, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        playListAdapter = new PlayListAdapter();
        playlistGridView.setAdapter(playListAdapter);
        playlistGridView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final PlaylistFragment this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                (new org.xbmc.kore.jsonrpc.method.Player.Open(currentPlaylistId, i)).execute(hostManager.getConnection(), defaultStringActionCallback, callbackHandler);
            }

            
            {
                this$0 = PlaylistFragment.this;
                super();
            }
        });
        return layoutinflater;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 2131624166 2131624166: default 24
    //                   2131624166 30;
           goto _L1 _L2
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        (new org.xbmc.kore.jsonrpc.method.Playlist.Clear(currentPlaylistId)).execute(hostManager.getConnection(), defaultStringActionCallback, callbackHandler);
        forceRefreshPlaylist();
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onPause()
    {
        super.onPause();
        hostConnectionObserver.unregisterPlayerObserver(this);
    }

    public void onResume()
    {
        super.onResume();
        hostConnectionObserver.registerPlayerObserver(this, true);
    }

    public void playerNoResultsYet()
    {
        switchToPanel(0x7f0e00b3);
        if (hostManager.getHostInfo() != null)
        {
            infoTitle.setText(0x7f07002b);
        } else
        {
            infoTitle.setText(0x7f070067);
        }
        infoMessage.setText(null);
        lastCallResult = 0;
    }

    public void playerOnConnectionError(int i, String s)
    {
        s = hostManager.getHostInfo();
        switchToPanel(0x7f0e00b3);
        if (s != null)
        {
            infoTitle.setText(0x7f07002b);
            infoMessage.setText(String.format(getString(0x7f07002c), new Object[] {
                s.getName(), s.getAddress()
            }));
        } else
        {
            infoTitle.setText(0x7f070067);
            infoMessage.setText(null);
        }
        lastCallResult = 1;
    }

    public void playerOnPause(org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getactiveplayersreturntype, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall)
    {
        if (lastGetPlaylistItemsResult == null || lastCallResult != 2 || currentActivePlayerId != getactiveplayersreturntype.playerid || lastGetItemResult.id != itemsall.id)
        {
            setupPlaylistInfo(getactiveplayersreturntype, propertyvalue, itemsall);
            currentActivePlayerId = getactiveplayersreturntype.playerid;
        } else
        {
            displayPlaylist(itemsall, lastGetPlaylistItemsResult);
        }
        lastCallResult = 3;
        lastGetActivePlayerResult = getactiveplayersreturntype;
        lastGetPropertiesResult = propertyvalue;
        lastGetItemResult = itemsall;
    }

    public void playerOnPlay(org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getactiveplayersreturntype, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall)
    {
        if (lastGetPlaylistItemsResult == null || lastCallResult != 2 || currentActivePlayerId != getactiveplayersreturntype.playerid || lastGetItemResult.id != itemsall.id)
        {
            setupPlaylistInfo(getactiveplayersreturntype, propertyvalue, itemsall);
            currentActivePlayerId = getactiveplayersreturntype.playerid;
        } else
        {
            displayPlaylist(itemsall, lastGetPlaylistItemsResult);
        }
        lastCallResult = 2;
        lastGetActivePlayerResult = getactiveplayersreturntype;
        lastGetPropertiesResult = propertyvalue;
        lastGetItemResult = itemsall;
    }

    public void playerOnStop()
    {
        HostInfo hostinfo = hostManager.getHostInfo();
        switchToPanel(0x7f0e00b3);
        infoTitle.setText(0x7f07006a);
        infoMessage.setText(String.format(getString(0x7f070029), new Object[] {
            hostinfo.getName()
        }));
        lastCallResult = 4;
    }

    public void systemOnQuit()
    {
        playerNoResultsYet();
    }







/*
    static List access$402(PlaylistFragment playlistfragment, List list)
    {
        playlistfragment.lastGetPlaylistItemsResult = list;
        return list;
    }

*/



    // Unreferenced inner class org/xbmc/kore/ui/PlaylistFragment$PlayListAdapter$1

/* anonymous class */
    class PlayListAdapter._cls1
        implements android.view.View.OnClickListener
    {

        final PlayListAdapter this$1;

        public void onClick(View view)
        {
            int i = ((Integer)view.getTag()).intValue();
            view = new PopupMenu(getActivity(), view);
            view.getMenuInflater().inflate(0x7f0f0007, view.getMenu());
            view.setOnMenuItemClickListener(i. new android.widget.PopupMenu.OnMenuItemClickListener() {

                final PlayListAdapter._cls1 this$2;
                final int val$position;

                public boolean onMenuItemClick(MenuItem menuitem)
                {
    class PlayListAdapter._cls1
        implements android.view.View.OnClickListener
    {
                    switch (menuitem.getItemId())
                    {
                    default:
                        return false;

                    case 2131624167: 
                        (new org.xbmc.kore.jsonrpc.method.Playlist.Remove(currentPlaylistId, position)).execute(hostManager.getConnection(), defaultStringActionCallback, callbackHandler);
                        break;
                    }
                    forceRefreshPlaylist();
                    return true;
                }

            
            {
                this$2 = final__pcls1;
                position = I.this;
                super();
            }
            });
            view.show();
        }

            
            {
                this$1 = PlayListAdapter.this;
                super();
            }
    }

}
