// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.utils.ImageManagerCDN;
import java.util.ArrayList;
import java.util.List;

public class UpsellBarAdapter extends BaseAdapter
{

    private Context mContext;
    private List mProducts;

    public UpsellBarAdapter(Context context)
    {
        mProducts = new ArrayList();
        mContext = context;
    }

    private void setImage(ImageView imageview, String s)
    {
        ImageManagerCDN.INSTANCE.addProductDetailImage(imageview, s);
        imageview.setTag(s);
    }

    public int getCount()
    {
        return mProducts.size();
    }

    public Object getItem(int i)
    {
        return mProducts.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = ((LayoutInflater)mContext.getSystemService("layout_inflater")).inflate(0x7f0300ec, null);
        }
        view = (TextView)viewgroup.findViewById(0x7f0f04d8);
        setImage((ImageView)viewgroup.findViewById(0x7f0f04d7), ((LabsProduct)mProducts.get(i)).getImageCode());
        view.setText(((LabsProduct)mProducts.get(i)).getName());
        FontManager.applyDominosFont(view);
        return viewgroup;
    }

    public void updateList(List list)
    {
        mProducts = list;
        notifyDataSetChanged();
    }
}
