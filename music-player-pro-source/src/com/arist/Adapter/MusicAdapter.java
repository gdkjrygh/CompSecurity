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
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.arist.MusicPlayer.MainActivity;
import com.arist.MusicPlayer.MyApplication;
import com.arist.entity.Music;
import com.arist.util.AlbumPicUtil;
import java.util.ArrayList;

public class MusicAdapter extends BaseAdapter
{
    private class ViewHolder
    {

        private ImageView albumPic;
        private RelativeLayout frm_menu_layout;
        final MusicAdapter this$0;
        private TextView tvMusicDes;
        private TextView tvMusicTitle;









        private ViewHolder()
        {
            this$0 = MusicAdapter.this;
            super();
        }

        ViewHolder(ViewHolder viewholder)
        {
            this();
        }
    }


    private Context f_context;
    private LayoutInflater inflater;
    private ArrayList musics;

    public MusicAdapter(Context context, ArrayList arraylist)
    {
        f_context = context;
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
        return musics.size();
    }

    public Object getItem(int i)
    {
        return musics.get(i);
    }

    public long getItemId(int i)
    {
        return (long)((Music)musics.get(i)).getId();
    }

    public View getView(final int position, View view, ViewGroup viewgroup)
    {
        view = inflater.inflate(0x7f030013, null);
        viewgroup = new ViewHolder(null);
        viewgroup.tvMusicTitle = (TextView)view.findViewById(0x7f0d004f);
        viewgroup.tvMusicDes = (TextView)view.findViewById(0x7f0d0050);
        viewgroup.albumPic = (ImageView)view.findViewById(0x7f0d0055);
        viewgroup.frm_menu_layout = (RelativeLayout)view.findViewById(0x7f0d0056);
        ((ViewHolder) (viewgroup)).frm_menu_layout.setOnClickListener(new android.view.View.OnClickListener() {

            final MusicAdapter this$0;
            private final int val$position;

            public void onClick(View view1)
            {
                ((MainActivity)f_context).selMusic = (Music)musics.get(position);
                view1 = (MainActivity)f_context;
                MainActivity mainactivity = (MainActivity)f_context;
                view1.showDialog(1);
            }

            
            {
                this$0 = MusicAdapter.this;
                position = i;
                super();
            }
        });
        Object obj = (Music)musics.get(position);
        if (((Music) (obj)).getTitle().equals(MyApplication.getCurrentMusic().getTitle()))
        {
            view.setBackgroundResource(0x7f020094);
        } else
        {
            view.setBackgroundColor(Color.argb(0, 0, 0, 0));
        }
        ((ViewHolder) (viewgroup)).tvMusicTitle.setText(((Music) (obj)).getTitle());
        ((ViewHolder) (viewgroup)).tvMusicDes.setText((new StringBuilder(String.valueOf(((Music) (obj)).getArtist()))).append(" - ").append(((Music) (obj)).getAlbum()).toString());
        obj = AlbumPicUtil.getAlbumBitmap(((Music) (obj)));
        if (obj == null)
        {
            ((ViewHolder) (viewgroup)).albumPic.setImageResource(0x7f020056);
            return view;
        } else
        {
            ((ViewHolder) (viewgroup)).albumPic.setImageBitmap(((android.graphics.Bitmap) (obj)));
            return view;
        }
    }

    public void setData(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            musics = arraylist;
            return;
        } else
        {
            musics = new ArrayList();
            return;
        }
    }


}
