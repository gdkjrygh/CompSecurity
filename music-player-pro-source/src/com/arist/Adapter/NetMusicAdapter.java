// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.arist.MusicPlayer.MainActivity;
import com.arist.util.AsyncImageLoader;
import com.arist.util.TimeFormat;
import com.yong.jamendo.api.JamendoMusic;
import java.util.ArrayList;

public class NetMusicAdapter extends BaseAdapter
{
    private class ViewHolder
    {

        private RelativeLayout frm_menu_layout;
        private ImageView ivAlbum;
        final NetMusicAdapter this$0;
        private TextView tvArtist;
        private TextView tvDuration;
        private TextView tvName;











        private ViewHolder()
        {
            this$0 = NetMusicAdapter.this;
            super();
        }

        ViewHolder(ViewHolder viewholder)
        {
            this();
        }
    }


    private com.arist.util.AsyncImageLoader.Callback callback;
    private Context f_context;
    private LayoutInflater inflater;
    private AsyncImageLoader loader;
    private ArrayList netMusics;

    public NetMusicAdapter(Context context, ArrayList arraylist, final ListView lvNetMusics)
    {
        f_context = context;
        setNetMusics(arraylist);
        inflater = LayoutInflater.from(context);
        callback = new com.arist.util.AsyncImageLoader.Callback() {

            final NetMusicAdapter this$0;
            private final ListView val$lvNetMusics;

            public void imageLoaded(String s, Bitmap bitmap)
            {
                s = (ImageView)lvNetMusics.findViewWithTag(s);
                if (s != null)
                {
                    s.setImageBitmap(bitmap);
                }
            }

            
            {
                this$0 = NetMusicAdapter.this;
                lvNetMusics = listview;
                super();
            }
        };
        loader = new AsyncImageLoader();
    }

    public void changeData(ArrayList arraylist)
    {
        setNetMusics(arraylist);
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return netMusics.size();
    }

    public Object getItem(int i)
    {
        return netMusics.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(final int position, View view, ViewGroup viewgroup)
    {
        Object obj;
        if (view == null)
        {
            view = inflater.inflate(0x7f03001d, null);
            viewgroup = new ViewHolder(null);
            viewgroup.ivAlbum = (ImageView)view.findViewById(0x7f0d0087);
            viewgroup.tvName = (TextView)view.findViewById(0x7f0d0089);
            viewgroup.tvArtist = (TextView)view.findViewById(0x7f0d008a);
            viewgroup.tvDuration = (TextView)view.findViewById(0x7f0d0088);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        obj = (JamendoMusic)netMusics.get(position);
        ((ViewHolder) (viewgroup)).tvName.setText(((JamendoMusic) (obj)).getMusic_name());
        ((ViewHolder) (viewgroup)).tvArtist.setText(((JamendoMusic) (obj)).getArtistName());
        ((ViewHolder) (viewgroup)).tvDuration.setText(TimeFormat.timeFormatInSecond(((JamendoMusic) (obj)).getDuration()));
        viewgroup.frm_menu_layout = (RelativeLayout)view.findViewById(0x7f0d0056);
        ((ViewHolder) (viewgroup)).frm_menu_layout.setOnClickListener(new android.view.View.OnClickListener() {

            final NetMusicAdapter this$0;
            private final int val$position;

            public void onClick(View view1)
            {
                ((MainActivity)f_context).currentNetMusic = (JamendoMusic)netMusics.get(position);
                view1 = (MainActivity)f_context;
                MainActivity mainactivity = (MainActivity)f_context;
                view1.showDialog(5);
            }

            
            {
                this$0 = NetMusicAdapter.this;
                position = i;
                super();
            }
        });
        ((ViewHolder) (viewgroup)).ivAlbum.setTag(((JamendoMusic) (obj)).getAlbum_image());
        obj = loader.loadImage(((JamendoMusic) (obj)), callback);
        if (obj == null)
        {
            ((ViewHolder) (viewgroup)).ivAlbum.setImageResource(0x7f020056);
            return view;
        } else
        {
            ((ViewHolder) (viewgroup)).ivAlbum.setImageBitmap(((Bitmap) (obj)));
            return view;
        }
    }

    public void quit()
    {
        loader.quit();
    }

    public void setNetMusics(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            netMusics = arraylist;
            return;
        } else
        {
            netMusics = new ArrayList();
            return;
        }
    }


}
