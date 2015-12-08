// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.coocent.android.xmlparser;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package net.coocent.android.xmlparser:
//            AsyncGiftImageLoader, GiftEntity, PromotionSDK

public class GiftGridViewAdapter extends BaseAdapter
{
    private class ViewHolder
    {

        private ImageView ivIcon;
        private ImageView newIcon;
        final GiftGridViewAdapter this$0;
        private TextView tvTitle;







        private ViewHolder()
        {
            this$0 = GiftGridViewAdapter.this;
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

    public GiftGridViewAdapter(Context context, ArrayList arraylist, final GridView lvNetMusics)
    {
        setGiftsList(arraylist);
        inflater = LayoutInflater.from(context);
        callback = new AsyncGiftImageLoader.Callback() {

            final GiftGridViewAdapter this$0;
            private final GridView val$lvNetMusics;

            public void imageLoaded(String s, Bitmap bitmap)
            {
                s = (ImageView)lvNetMusics.findViewWithTag(s);
                if (s != null)
                {
                    s.setImageBitmap(bitmap);
                }
            }

            
            {
                this$0 = GiftGridViewAdapter.this;
                lvNetMusics = gridview;
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
        GiftEntity giftentity;
        Bitmap bitmap;
        if (view == null)
        {
            view = inflater.inflate(net.coocent.promotionsdk.R.layout.grid_view_gift_item, null);
            viewgroup = new ViewHolder(null);
            viewgroup.ivIcon = (ImageView)view.findViewById(net.coocent.promotionsdk.R.id.iv_gift_icon);
            viewgroup.newIcon = (ImageView)view.findViewById(net.coocent.promotionsdk.R.id.new_icon);
            viewgroup.tvTitle = (TextView)view.findViewById(net.coocent.promotionsdk.R.id.tv_gift_title);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        giftentity = (GiftEntity)giftsArrayList.get(i);
        ((ViewHolder) (viewgroup)).tvTitle.setText(giftentity.getTitle());
        ((ViewHolder) (viewgroup)).ivIcon.setTag(giftentity.getIcon_imagePath());
        bitmap = loader.loadImage(giftentity, callback);
        if (bitmap == null)
        {
            ((ViewHolder) (viewgroup)).ivIcon.setImageResource(net.coocent.promotionsdk.R.drawable.gift_default_icon);
        } else
        {
            ((ViewHolder) (viewgroup)).ivIcon.setImageBitmap(bitmap);
        }
        if (PromotionSDK.isNew(giftentity.getPackagename()))
        {
            ((ViewHolder) (viewgroup)).newIcon.setVisibility(0);
            return view;
        } else
        {
            ((ViewHolder) (viewgroup)).newIcon.setVisibility(8);
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
