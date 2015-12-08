// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.arist.MusicPlayer.MyApplication;
import com.arist.entity.Skin;
import com.arist.util.BitmapService;
import java.util.ArrayList;

public class SkinAdapter extends BaseAdapter
{
    class ViewHolder
    {

        private ImageView iv;
        private ImageView ivSkinChecked;
        final SkinAdapter this$0;





        ViewHolder()
        {
            this$0 = SkinAdapter.this;
            super();
        }
    }


    private Context context;
    private LayoutInflater inflater;
    private ArrayList skins;

    public SkinAdapter(Context context1, ArrayList arraylist)
    {
        context = context1;
        inflater = LayoutInflater.from(context1);
        if (arraylist != null)
        {
            skins = arraylist;
            return;
        } else
        {
            skins = new ArrayList();
            return;
        }
    }

    public int getCount()
    {
        return skins.size();
    }

    public Object getItem(int i)
    {
        return skins.get(i);
    }

    public long getItemId(int i)
    {
        return (long)((Skin)skins.get(i)).getResId();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        android.graphics.Bitmap bitmap;
        if (view == null)
        {
            view = inflater.inflate(0x7f03000c, null);
            viewgroup = new ViewHolder();
            viewgroup.iv = (ImageView)view.findViewById(0x7f0d0044);
            viewgroup.ivSkinChecked = (ImageView)view.findViewById(0x7f0d0045);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        bitmap = BitmapService.getBitmap(context.getResources(), ((Skin)skins.get(i)).getResId(), 100, 160);
        ((ViewHolder) (viewgroup)).iv.setImageBitmap(bitmap);
        if (MyApplication.getWallpaperId() == ((Skin)skins.get(i)).getResId())
        {
            ((ViewHolder) (viewgroup)).ivSkinChecked.setVisibility(1);
            return view;
        } else
        {
            ((ViewHolder) (viewgroup)).ivSkinChecked.setVisibility(-1);
            return view;
        }
    }
}
