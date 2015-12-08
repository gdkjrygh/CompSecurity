// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.nbcsports.liveextra.library.tve.Logo;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.ArrayList;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            SelectProviderFragment

private static class mContext extends BaseAdapter
{
    static class ViewHolder
    {

        private ImageView mImageViewLogo;



/*
        static ImageView access$102(ViewHolder viewholder, ImageView imageview)
        {
            viewholder.mImageViewLogo = imageview;
            return imageview;
        }

*/

        ViewHolder()
        {
        }
    }


    private final Context mContext;
    private final LayoutInflater mInflater;
    private final ArrayList mMvpds;

    public int getCount()
    {
        return mMvpds.size();
    }

    public Object getItem(int i)
    {
        return mMvpds.get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Logo logo;
        if (view == null || view.getTag() == null)
        {
            ViewHolder viewholder = new ViewHolder();
            view = mInflater.inflate(0x7f04005c, viewgroup, false);
            viewholder.mImageViewLogo = (ImageView)view.findViewById(0x7f0f012b);
            view.setTag(viewholder);
            viewgroup = viewholder;
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        logo = (Logo)getItem(i);
        viewgroup = ((ViewHolder) (viewgroup)).mImageViewLogo;
        if (logo.getPicker() != null && !TextUtils.isEmpty(logo.getPicker()))
        {
            Picasso.with(mContext).load(logo.getPicker()).placeholder(0x7f020132).into(viewgroup);
        }
        return view;
    }

    public ViewHolder(Context context, ArrayList arraylist)
    {
        mInflater = LayoutInflater.from(context);
        mMvpds = arraylist;
        mContext = context;
    }
}
