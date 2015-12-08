// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
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
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;
import org.xbmc.kore.utils.Utils;

public class MediaFileListFragment extends Fragment
{
    public static class FileLocation
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public FileLocation createFromParcel(Parcel parcel)
            {
                return new FileLocation(parcel);
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

            public FileLocation[] newArray(int i)
            {
                return new FileLocation[i];
            }

        };
        public final String artUrl;
        public final String details;
        public final String file;
        public final boolean isDirectory;
        private boolean isRoot;
        public final String sizeDuration;
        public final String title;

        public static FileLocation newInstanceFromItemFile(Context context, org.xbmc.kore.jsonrpc.type.ListType.ItemFile itemfile)
        {
            String s;
            byte byte0;
            s = itemfile.type;
            byte0 = -1;
            s.hashCode();
            JVM INSTR lookupswitch 6: default 72
        //                       -1544438277: 170
        //                       -759089802: 185
        //                       -577741570: 230
        //                       3536149: 215
        //                       92896879: 200
        //                       104087344: 155;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            byte0;
            JVM INSTR tableswitch 0 4: default 108
        //                       0 245
        //                       1 272
        //                       2 334
        //                       3 391
        //                       4 391;
               goto _L8 _L9 _L10 _L11 _L12 _L12
_L8:
            String s1;
            String s2;
            context = itemfile.label;
            s = null;
            s2 = itemfile.thumbnail;
            s1 = UIUtils.formatFileSize(itemfile.size);
_L13:
            return new FileLocation(context, itemfile.file, itemfile.filetype.equalsIgnoreCase("directory"), s, s1, s2);
_L7:
            if (s.equals("movie"))
            {
                byte0 = 0;
            }
              goto _L1
_L2:
            if (s.equals("episode"))
            {
                byte0 = 1;
            }
              goto _L1
_L3:
            if (s.equals("musicvideo"))
            {
                byte0 = 2;
            }
              goto _L1
_L6:
            if (s.equals("album"))
            {
                byte0 = 3;
            }
              goto _L1
_L5:
            if (s.equals("song"))
            {
                byte0 = 4;
            }
              goto _L1
_L4:
            if (s.equals("picture"))
            {
                byte0 = 5;
            }
              goto _L1
_L9:
            context = itemfile.title;
            s = itemfile.tagline;
            s1 = UIUtils.formatTime(itemfile.runtime);
            s2 = itemfile.thumbnail;
              goto _L13
_L10:
            s = itemfile.title;
            String s3 = String.format(context.getString(0x7f070081), new Object[] {
                Integer.valueOf(itemfile.season), Integer.valueOf(itemfile.episode)
            });
            s1 = UIUtils.formatTime(itemfile.runtime);
            s2 = itemfile.thumbnail;
            context = s;
            s = s3;
              goto _L13
_L11:
            context = itemfile.title;
            s = (new StringBuilder()).append(Utils.listStringConcat(itemfile.artist, ", ")).append(" | ").append(itemfile.album).toString();
            s1 = UIUtils.formatTime(itemfile.runtime);
            s2 = itemfile.thumbnail;
              goto _L13
_L12:
            context = itemfile.title;
            s = (new StringBuilder()).append(itemfile.displayartist).append(" | ").append(itemfile.album).toString();
            s2 = itemfile.thumbnail;
            s1 = UIUtils.formatTime(itemfile.duration);
              goto _L13
        }

        public int describeContents()
        {
            return 0;
        }

        public boolean isRootDir()
        {
            return isRoot;
        }

        public void setRootDir(boolean flag)
        {
            isRoot = flag;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            boolean flag = true;
            parcel.writeString(title);
            parcel.writeString(file);
            if (isDirectory)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (isRoot)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            parcel.writeString(details);
            parcel.writeString(sizeDuration);
            parcel.writeString(artUrl);
        }


        private FileLocation(Parcel parcel)
        {
            boolean flag1 = true;
            super();
            title = parcel.readString();
            file = parcel.readString();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            isDirectory = flag;
            if (parcel.readInt() != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            isRoot = flag;
            details = parcel.readString();
            sizeDuration = parcel.readString();
            artUrl = parcel.readString();
        }


        public FileLocation(String s, String s1, boolean flag)
        {
            this(s, s1, flag, null, null, null);
        }

        public FileLocation(String s, String s1, boolean flag, String s2, String s3, String s4)
        {
            title = s;
            file = s1;
            isDirectory = flag;
            isRoot = false;
            details = s2;
            sizeDuration = s3;
            artUrl = s4;
        }
    }

    private class MediaFileListAdapter extends BaseAdapter
        implements ListAdapter
    {

        int artHeight;
        int artWidth;
        Context ctx;
        List fileLocationItems;
        private android.view.View.OnClickListener itemMenuClickListener;
        int resource;
        final MediaFileListFragment this$0;

        public int getCount()
        {
            if (fileLocationItems == null)
            {
                return 0;
            } else
            {
                return fileLocationItems.size();
            }
        }

        public List getFileItemList()
        {
            if (fileLocationItems == null)
            {
                return new ArrayList();
            } else
            {
                return new ArrayList(fileLocationItems);
            }
        }

        public volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public FileLocation getItem(int i)
        {
            if (fileLocationItems == null)
            {
                return null;
            } else
            {
                return (FileLocation)fileLocationItems.get(i);
            }
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = LayoutInflater.from(ctx).inflate(resource, viewgroup, false);
                view = new ViewHolder();
                view.art = (ImageView)view1.findViewById(0x7f0e0070);
                view.title = (TextView)view1.findViewById(0x7f0e002d);
                view.details = (TextView)view1.findViewById(0x7f0e00a5);
                view.contextMenu = (ImageView)view1.findViewById(0x7f0e00bd);
                view.sizeDuration = (TextView)view1.findViewById(0x7f0e00bc);
                view1.setTag(view);
            }
            view = (ViewHolder)view1.getTag();
            viewgroup = getItem(i);
            ((ViewHolder) (view)).title.setText(((FileLocation) (viewgroup)).title);
            ((ViewHolder) (view)).details.setText(((FileLocation) (viewgroup)).details);
            ((ViewHolder) (view)).sizeDuration.setText(((FileLocation) (viewgroup)).sizeDuration);
            UIUtils.loadImageWithCharacterAvatar(getActivity(), hostManager, ((FileLocation) (viewgroup)).artUrl, ((FileLocation) (viewgroup)).title, ((ViewHolder) (view)).art, artWidth, artHeight);
            if (((FileLocation) (viewgroup)).isDirectory)
            {
                ((ViewHolder) (view)).contextMenu.setVisibility(8);
                return view1;
            } else
            {
                ((ViewHolder) (view)).contextMenu.setVisibility(0);
                ((ViewHolder) (view)).contextMenu.setTag(Integer.valueOf(i));
                ((ViewHolder) (view)).contextMenu.setOnClickListener(itemMenuClickListener);
                return view1;
            }
        }

        public int getViewTypeCount()
        {
            return 1;
        }

        public void setFilelistItems(List list)
        {
            fileLocationItems = list;
            notifyDataSetChanged();
        }

        public MediaFileListAdapter(Context context, int i)
        {
            this$0 = MediaFileListFragment.this;
            super();
            fileLocationItems = null;
            itemMenuClickListener = new _cls1();
            ctx = context;
            resource = i;
            fileLocationItems = null;
            mediafilelistfragment = context.getResources();
            artWidth = (int)(getDimension(0x7f080080) / 1.0F);
            artHeight = (int)(getDimension(0x7f08007f) / 1.0F);
        }
    }

    private static class ViewHolder
    {

        ImageView art;
        ImageView contextMenu;
        TextView details;
        TextView sizeDuration;
        TextView title;

        private ViewHolder()
        {
        }

    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/MediaFileListFragment);
    private MediaFileListAdapter adapter;
    boolean browseRootAlready;
    private Handler callbackHandler;
    TextView emptyView;
    GridView folderGridView;
    private HostManager hostManager;
    Queue mediaQueueFileLocation;
    String mediaType;
    String parentDirectory;
    int playlistId;
    ArrayList rootFileLocation;
    SwipeRefreshLayout swipeRefreshLayout;

    public MediaFileListFragment()
    {
        callbackHandler = new Handler();
        mediaType = "music";
        parentDirectory = null;
        playlistId = 0;
        adapter = null;
        browseRootAlready = false;
        rootFileLocation = new ArrayList();
        mediaQueueFileLocation = new LinkedList();
    }

    private void browseDirectory(final FileLocation dir)
    {
        if (!dir.isRootDir()) goto _L2; else goto _L1
_L1:
        parentDirectory = dir.file;
_L4:
        (new org.xbmc.kore.jsonrpc.method.Files.GetDirectory(dir.file, mediaType, new org.xbmc.kore.jsonrpc.type.ListType.Sort("label", true, true), new String[] {
            "title", "artist", "album", "track", "duration", "tagline", "runtime", "season", "episode", "showtitle", 
            "thumbnail", "file", "displayartist", "size", "lastmodified", "mimetype"
        })).execute(hostManager.getConnection(), new ApiCallback() {

            final MediaFileListFragment this$0;
            final FileLocation val$dir;

            public void onError(int i, String s1)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    Toast.makeText(getActivity(), String.format(getString(0x7f0700d4), new Object[] {
                        s1
                    }), 0).show();
                    return;
                }
            }

            public volatile void onSuccess(Object obj2)
            {
                onSuccess((List)obj2);
            }

            public void onSuccess(List list)
            {
                if (!isAdded())
                {
                    return;
                }
                ArrayList arraylist = new ArrayList();
                FileLocation filelocation = new FileLocation("..", parentDirectory, true);
                filelocation.setRootDir(dir.isRootDir());
                arraylist.add(0, filelocation);
                org.xbmc.kore.jsonrpc.type.ListType.ItemFile itemfile;
                for (list = list.iterator(); list.hasNext(); arraylist.add(FileLocation.newInstanceFromItemFile(getActivity(), itemfile)))
                {
                    itemfile = (org.xbmc.kore.jsonrpc.type.ListType.ItemFile)list.next();
                }

                adapter.setFilelistItems(arraylist);
                browseRootAlready = false;
            }

            
            {
                this$0 = MediaFileListFragment.this;
                dir = filelocation;
                super();
            }
        }, callbackHandler);
        return;
_L2:
        Object obj1 = null;
        Iterator iterator = rootFileLocation.iterator();
        Object obj;
        do
        {
            obj = obj1;
            if (!iterator.hasNext())
            {
                break;
            }
            obj = (FileLocation)iterator.next();
            String s = ((FileLocation) (obj)).file;
            if (!dir.file.contentEquals(s))
            {
                continue;
            }
            obj = ((FileLocation) (obj)).file;
            break;
        } while (true);
        if (obj != null)
        {
            parentDirectory = ((String) (obj));
            dir.setRootDir(true);
        } else
        {
            parentDirectory = getParentDirectory(dir.file);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void browseSources()
    {
        (new org.xbmc.kore.jsonrpc.method.Files.GetSources(mediaType)).execute(hostManager.getConnection(), new ApiCallback() {

            final MediaFileListFragment this$0;

            public void onError(int i, String s)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    Toast.makeText(getActivity(), String.format(getString(0x7f0700d4), new Object[] {
                        s
                    }), 0).show();
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
                }
                rootFileLocation.clear();
                list = list.iterator();
                do
                {
                    if (!list.hasNext())
                    {
                        break;
                    }
                    Object obj = (org.xbmc.kore.jsonrpc.type.ItemType.Source)list.next();
                    if (!((org.xbmc.kore.jsonrpc.type.ItemType.Source) (obj)).file.contains("addons:"))
                    {
                        obj = new FileLocation(((org.xbmc.kore.jsonrpc.type.ItemType.Source) (obj)).label, ((org.xbmc.kore.jsonrpc.type.ItemType.Source) (obj)).file, true);
                        ((FileLocation) (obj)).setRootDir(true);
                        rootFileLocation.add(obj);
                    }
                } while (true);
                browseRootAlready = true;
                emptyView.setText(getString(0x7f0700de));
                adapter.setFilelistItems(rootFileLocation);
            }

            
            {
                this$0 = MediaFileListFragment.this;
                super();
            }
        }, callbackHandler);
    }

    public static String getParentDirectory(String s)
    {
        String s1 = s;
        String s2 = "/";
        if (s.contains("\\"))
        {
            s2 = "\\";
        }
        if (s.endsWith(s2))
        {
            s1 = s.substring(0, s.length() - 1);
        }
        s = s1;
        if (s1.lastIndexOf(s2) != -1)
        {
            s = s1.substring(0, s1.lastIndexOf(s2));
        }
        return (new StringBuilder()).append(s).append(s2).toString();
    }

    private void playMediaFile(String s)
    {
        org.xbmc.kore.jsonrpc.type.PlaylistType.Item item = new org.xbmc.kore.jsonrpc.type.PlaylistType.Item();
        item.file = s;
        (new org.xbmc.kore.jsonrpc.method.Player.Open(item)).execute(hostManager.getConnection(), new ApiCallback() {

            final MediaFileListFragment this$0;

            public void onError(int i, String s1)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    Toast.makeText(getActivity(), String.format(getString(0x7f0700d5), new Object[] {
                        s1
                    }), 0).show();
                    return;
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s1)
            {
                for (; mediaQueueFileLocation.size() > 0; queueMediaFile(((FileLocation)mediaQueueFileLocation.poll()).file)) { }
            }

            
            {
                this$0 = MediaFileListFragment.this;
                super();
            }
        }, callbackHandler);
    }

    private void queueMediaFile(String s)
    {
        final HostConnection connection = hostManager.getConnection();
        org.xbmc.kore.jsonrpc.type.PlaylistType.Item item = new org.xbmc.kore.jsonrpc.type.PlaylistType.Item();
        item.file = s;
        (new org.xbmc.kore.jsonrpc.method.Playlist.Add(playlistId, item)).execute(connection, new ApiCallback() {

            final MediaFileListFragment this$0;
            final HostConnection val$connection;

            public void onError(int i, String s1)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    Toast.makeText(getActivity(), String.format(getString(0x7f0700d6), new Object[] {
                        s1
                    }), 0).show();
                    return;
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s1)
            {
                startPlaylistIfNoActivePlayers(connection, playlistId, callbackHandler);
            }

            
            {
                this$0 = MediaFileListFragment.this;
                connection = hostconnection;
                super();
            }
        }, callbackHandler);
    }

    private void startPlaylistIfNoActivePlayers(final HostConnection connection, final int playlistId, final Handler callbackHandler)
    {
        (new org.xbmc.kore.jsonrpc.method.Player.GetActivePlayers()).execute(connection, new ApiCallback() {

            final MediaFileListFragment this$0;
            final Handler val$callbackHandler;
            final HostConnection val$connection;
            final int val$playlistId;

            public void onError(int i, String s)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    Toast.makeText(getActivity(), String.format(getString(0x7f0700d3), new Object[] {
                        s
                    }), 0).show();
                    return;
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((ArrayList)obj);
            }

            public void onSuccess(ArrayList arraylist)
            {
                if (arraylist.isEmpty())
                {
                    (new org.xbmc.kore.jsonrpc.method.Player.Open(playlistId)).execute(connection, new ApiCallback() {

                        final _cls7 this$1;

                        public void onError(int i, String s)
                        {
                            if (!isAdded())
                            {
                                return;
                            } else
                            {
                                Toast.makeText(getActivity(), String.format(getString(0x7f0700d5), new Object[] {
                                    s
                                }), 0).show();
                                return;
                            }
                        }

                        public volatile void onSuccess(Object obj)
                        {
                            onSuccess((String)obj);
                        }

                        public void onSuccess(String s)
                        {
                        }

            
            {
                this$1 = _cls7.this;
                super();
            }
                    }, callbackHandler);
                }
            }

            
            {
                this$0 = MediaFileListFragment.this;
                playlistId = i;
                connection = hostconnection;
                callbackHandler = handler;
                super();
            }
        }, callbackHandler);
    }

    public boolean atRootDirectory()
    {
        FileLocation filelocation;
        if (adapter.getCount() != 0)
        {
            if ((filelocation = adapter.getItem(0)) != null && (!filelocation.isRootDir() || filelocation.title.contentEquals("..")))
            {
                return false;
            }
        }
        return true;
    }

    void handleFileSelect(FileLocation filelocation)
    {
        if (filelocation.isDirectory)
        {
            if (filelocation.isRootDir())
            {
                if (browseRootAlready)
                {
                    browseDirectory(filelocation);
                    return;
                } else
                {
                    browseSources();
                    return;
                }
            } else
            {
                browseDirectory(filelocation);
                return;
            }
        } else
        {
            playMediaFile(filelocation.file);
            return;
        }
    }

    public void onBackPressed()
    {
        handleFileSelect(adapter.getItem(0));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Bundle bundle1 = getArguments();
        if (bundle1 == null) goto _L2; else goto _L1
_L1:
        mediaType = bundle1.getString("mediaType", "music");
        if (!mediaType.equalsIgnoreCase("video")) goto _L4; else goto _L3
_L3:
        playlistId = 1;
_L2:
        layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f030029, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        hostManager = HostManager.getInstance(getActivity());
        swipeRefreshLayout.setEnabled(false);
        emptyView.setOnClickListener(new android.view.View.OnClickListener() {

            final MediaFileListFragment this$0;

            public void onClick(View view)
            {
                browseSources();
            }

            
            {
                this$0 = MediaFileListFragment.this;
                super();
            }
        });
        folderGridView.setEmptyView(emptyView);
        folderGridView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final MediaFileListFragment this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                handleFileSelect(adapter.getItem(i));
            }

            
            {
                this$0 = MediaFileListFragment.this;
                super();
            }
        });
        if (adapter == null)
        {
            adapter = new MediaFileListAdapter(getActivity(), 0x7f03003b);
        }
        folderGridView.setAdapter(adapter);
        if (bundle == null) goto _L6; else goto _L5
_L5:
        mediaType = bundle.getString("mediaType");
        if (!mediaType.equalsIgnoreCase("video")) goto _L8; else goto _L7
_L7:
        playlistId = 1;
_L9:
        viewgroup = bundle.getParcelableArrayList("pathContents");
        rootFileLocation = bundle.getParcelableArrayList("rootPathContents");
        browseRootAlready = bundle.getBoolean("rootVisited");
        adapter.setFilelistItems(viewgroup);
        return layoutinflater;
_L4:
        if (mediaType.equalsIgnoreCase("pictures"))
        {
            playlistId = 2;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (mediaType.equalsIgnoreCase("pictures"))
        {
            playlistId = 2;
        }
        if (true) goto _L9; else goto _L6
_L6:
        browseSources();
        return layoutinflater;
        if (true) goto _L2; else goto _L10
_L10:
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("mediaType", mediaType);
        try
        {
            bundle.putParcelableArrayList("pathContents", (ArrayList)adapter.getFileItemList());
        }
        catch (NullPointerException nullpointerexception) { }
        bundle.putParcelableArrayList("rootPathContents", rootFileLocation);
        bundle.putBoolean("rootVisited", browseRootAlready);
    }









    // Unreferenced inner class org/xbmc/kore/ui/MediaFileListFragment$MediaFileListAdapter$1

/* anonymous class */
    class MediaFileListAdapter._cls1
        implements android.view.View.OnClickListener
    {

        final MediaFileListAdapter this$1;

        public void onClick(View view)
        {
            int i = ((Integer)view.getTag()).intValue();
            if (fileLocationItems != null)
            {
                final FileLocation loc = (FileLocation)fileLocationItems.get(i);
                if (!loc.isDirectory)
                {
                    view = new PopupMenu(getActivity(), view);
                    view.getMenuInflater().inflate(0x7f0f0000, view.getMenu());
                    view.setOnMenuItemClickListener(i. new android.widget.PopupMenu.OnMenuItemClickListener() {

                        final MediaFileListAdapter._cls1 this$2;
                        final FileLocation val$loc;
                        final int val$position;

                        public boolean onMenuItemClick(MenuItem menuitem)
                        {
    class MediaFileListAdapter._cls1
        implements android.view.View.OnClickListener
    {
                            switch (menuitem.getItemId())
                            {
                            default:
                                return false;

                            case 2131624154: 
                                queueMediaFile(loc.file);
                                return true;

                            case 2131624155: 
                                playMediaFile(loc.file);
                                return true;

                            case 2131624156: 
                                mediaQueueFileLocation.clear();
                                break;
                            }
                            for (int i = position + 1; i < fileLocationItems.size(); i++)
                            {
                                menuitem = (FileLocation)fileLocationItems.get(i);
                                if (!((FileLocation) (menuitem)).isDirectory)
                                {
                                    mediaQueueFileLocation.add(menuitem);
                                }
                            }

                            mediaQueueFileLocation.add(loc);
                            playMediaFile(loc.file);
                            return true;
                        }

            
            {
                this$2 = final__pcls1;
                loc = filelocation;
                position = I.this;
                super();
            }
                    });
                    view.show();
                }
            }
        }

            
            {
                this$1 = MediaFileListAdapter.this;
                super();
            }
    }

}
