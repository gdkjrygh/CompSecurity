// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupMenu;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            MediaFileListFragment

private class artHeight extends BaseAdapter
    implements ListAdapter
{

    int artHeight;
    int artWidth;
    Context ctx;
    List fileLocationItems;
    private android.view.ter.notifyDataSetChanged itemMenuClickListener;
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

    public getItem getItem(int i)
    {
        if (fileLocationItems == null)
        {
            return null;
        } else
        {
            return (fileLocationItems)fileLocationItems.get(i);
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
            view = new resource(null);
            view.resource = (ImageView)view1.findViewById(0x7f0e0070);
            view.resource = (TextView)view1.findViewById(0x7f0e002d);
            view.resource = (TextView)view1.findViewById(0x7f0e00a5);
            view.u = (ImageView)view1.findViewById(0x7f0e00bd);
            view.on = (TextView)view1.findViewById(0x7f0e00bc);
            view1.setTag(view);
        }
        view = (on)view1.getTag();
        viewgroup = getItem(i);
        ((getItem) (view)).getItem.setText(((getItem) (viewgroup)).getItem);
        ((getItem) (view)).getItem.setText(((getItem) (viewgroup)).getItem);
        ((getItem) (view)).on.setText(((on) (viewgroup)).tion);
        UIUtils.loadImageWithCharacterAvatar(getActivity(), MediaFileListFragment.access$700(MediaFileListFragment.this), ((this._cls0) (viewgroup))._fld0, ((this._cls0) (viewgroup))._fld0, ((this._cls0) (view))._fld0, artWidth, artHeight);
        if (((artHeight) (viewgroup)).ory)
        {
            ((ory) (view)).u.setVisibility(8);
            return view1;
        } else
        {
            ((u) (view)).u.setVisibility(0);
            ((u) (view)).u.setTag(Integer.valueOf(i));
            ((u) (view)).u.setOnClickListener(itemMenuClickListener);
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

    public _cls1.this._cls1(Context context, int i)
    {
        this$0 = MediaFileListFragment.this;
        super();
        fileLocationItems = null;
        itemMenuClickListener = new android.view.View.OnClickListener() {

            final MediaFileListFragment.MediaFileListAdapter this$1;

            public void onClick(View view)
            {
                int j = ((Integer)view.getTag()).intValue();
                if (fileLocationItems != null)
                {
                    final MediaFileListFragment.FileLocation loc = (MediaFileListFragment.FileLocation)fileLocationItems.get(j);
                    if (!loc.isDirectory)
                    {
                        view = new PopupMenu(getActivity(), view);
                        view.getMenuInflater().inflate(0x7f0f0000, view.getMenu());
                        view.setOnMenuItemClickListener(j. new android.widget.PopupMenu.OnMenuItemClickListener() {

                            final _cls1 this$2;
                            final MediaFileListFragment.FileLocation val$loc;
                            final int val$position;

                            public boolean onMenuItemClick(MenuItem menuitem)
                            {
                                switch (menuitem.getItemId())
                                {
                                default:
                                    return false;

                                case 2131624154: 
                                    MediaFileListFragment.access$200(this$0, loc.file);
                                    return true;

                                case 2131624155: 
                                    MediaFileListFragment.access$500(this$0, loc.file);
                                    return true;

                                case 2131624156: 
                                    mediaQueueFileLocation.clear();
                                    break;
                                }
                                for (int i = position + 1; i < fileLocationItems.size(); i++)
                                {
                                    menuitem = (MediaFileListFragment.FileLocation)fileLocationItems.get(i);
                                    if (!((MediaFileListFragment.FileLocation) (menuitem)).isDirectory)
                                    {
                                        mediaQueueFileLocation.add(menuitem);
                                    }
                                }

                                mediaQueueFileLocation.add(loc);
                                MediaFileListFragment.access$500(this$0, loc.file);
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
                this$1 = MediaFileListFragment.MediaFileListAdapter.this;
                super();
            }
        };
        ctx = context;
        resource = i;
        fileLocationItems = null;
        mediafilelistfragment = context.getResources();
        artWidth = (int)(getDimension(0x7f080080) / 1.0F);
        artHeight = (int)(getDimension(0x7f08007f) / 1.0F);
    }
}
