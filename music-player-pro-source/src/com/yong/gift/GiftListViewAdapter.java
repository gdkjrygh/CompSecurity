// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.gift;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package com.yong.gift:
//            AsyncGiftImageLoader, GiftEntity

public class GiftListViewAdapter extends BaseAdapter
{
    private class ViewHolder
    {

        private ImageView ivIcon;
        final GiftListViewAdapter this$0;
        private TextView tvDetail;
        private TextView tvTitle;







        private ViewHolder()
        {
            this$0 = GiftListViewAdapter.this;
            super();
        }

        ViewHolder(ViewHolder viewholder)
        {
            this();
        }
    }


    private AsyncGiftImageLoader.Callback callback;
    private ArrayList giftsArrayList;
    private LayoutInflater inflater;
    private AsyncGiftImageLoader loader;

    public GiftListViewAdapter(Context context, ArrayList arraylist, final ListView lvNetMusics)
    {
        setGiftsList(arraylist);
        inflater = LayoutInflater.from(context);
        callback = new AsyncGiftImageLoader.Callback() {

            final GiftListViewAdapter this$0;
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
                this$0 = GiftListViewAdapter.this;
                lvNetMusics = listview;
                super();
            }
        };
        loader = new AsyncGiftImageLoader();
    }

    public void changeData(ArrayList arraylist)
    {
        setGiftsList(arraylist);
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return giftsArrayList.size();
    }

    public Object getItem(int i)
    {
        return giftsArrayList.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        if (view == null)
        {
            view = inflater.inflate(0x7f030011, null);
            viewgroup = new ViewHolder(null);
            viewgroup.ivIcon = (ImageView)view.findViewById(0x7f0d004c);
            viewgroup.tvTitle = (TextView)view.findViewById(0x7f0d004e);
            viewgroup.tvDetail = (TextView)view.findViewById(0x7f0d0053);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        obj = (GiftEntity)giftsArrayList.get(i);
        ((ViewHolder) (viewgroup)).tvTitle.setText(((GiftEntity) (obj)).getTitle());
        ((ViewHolder) (viewgroup)).tvDetail.setText(((GiftEntity) (obj)).getDetailed());
        ((ViewHolder) (viewgroup)).ivIcon.setTag(((GiftEntity) (obj)).getIcon_imagePath());
        obj = loader.loadImage(((GiftEntity) (obj)), callback);
        if (obj == null)
        {
            ((ViewHolder) (viewgroup)).ivIcon.setImageResource(0x7f020056);
            return view;
        } else
        {
            ((ViewHolder) (viewgroup)).ivIcon.setImageBitmap(((Bitmap) (obj)));
            return view;
        }
    }

    public void quit()
    {
        loader.quit();
    }

    public void setGiftsList(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            giftsArrayList = arraylist;
            return;
        } else
        {
            giftsArrayList = new ArrayList();
            return;
        }
    }
}
