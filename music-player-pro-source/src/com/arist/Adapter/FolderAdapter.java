// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.arist.MusicPlayer.MyApplication;
import com.arist.entity.MusicFolder;
import java.util.ArrayList;

public class FolderAdapter extends BaseAdapter
{
    private class ViewHolder
    {

        final FolderAdapter this$0;
        private TextView tvMusicFolderDes;
        private TextView tvMusicFolderTitle;





        private ViewHolder()
        {
            this$0 = FolderAdapter.this;
            super();
        }

        ViewHolder(ViewHolder viewholder)
        {
            this();
        }
    }


    private ArrayList folders;
    private LayoutInflater inflater;

    public FolderAdapter(Context context, ArrayList arraylist)
    {
        inflater = LayoutInflater.from(context);
        setData(arraylist);
    }

    public void changeData(ArrayList arraylist)
    {
        setData(arraylist);
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return folders.size();
    }

    public Object getItem(int i)
    {
        return folders.get(i);
    }

    public long getItemId(int i)
    {
        return (long)((MusicFolder)folders.get(i)).getId();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        MusicFolder musicfolder;
        if (view == null)
        {
            view = inflater.inflate(0x7f030010, null);
            viewgroup = new ViewHolder(null);
            viewgroup.tvMusicFolderTitle = (TextView)view.findViewById(0x7f0d004f);
            viewgroup.tvMusicFolderDes = (TextView)view.findViewById(0x7f0d0050);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        musicfolder = (MusicFolder)folders.get(i);
        if (musicfolder.getPath().equals(MyApplication.getMusicFolderPath()))
        {
            view.setBackgroundResource(0x7f020095);
        } else
        {
            view.setBackgroundColor(Color.argb(0, 0, 0, 0));
        }
        ((ViewHolder) (viewgroup)).tvMusicFolderTitle.setText(musicfolder.getName());
        if ("artist".equals(musicfolder.getPath()) || "album".equals(musicfolder.getPath()))
        {
            ((ViewHolder) (viewgroup)).tvMusicFolderDes.setText((new StringBuilder(String.valueOf(musicfolder.getNum()))).append(" ").append(MyApplication.context.getString(0x7f08005d)).toString());
            return view;
        } else
        {
            ((ViewHolder) (viewgroup)).tvMusicFolderDes.setText((new StringBuilder(String.valueOf(musicfolder.getNum()))).append(" ").append(MyApplication.context.getString(0x7f08005e)).append(" ").append(musicfolder.getPath()).toString());
            return view;
        }
    }

    public void setData(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            folders = arraylist;
            return;
        } else
        {
            folders = new ArrayList();
            return;
        }
    }
}
