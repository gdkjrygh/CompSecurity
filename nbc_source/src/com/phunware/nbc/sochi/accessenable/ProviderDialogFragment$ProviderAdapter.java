// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.List;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            ProviderDialogFragment

private class mItems extends BaseAdapter
{

    private final List mItems;
    final ProviderDialogFragment this$0;

    public int getCount()
    {
        return mItems.size();
    }

    public Object getItem(int i)
    {
        return mItems.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Mvpd mvpd;
        if (view == null)
        {
            view = ProviderDialogFragment.access$000(ProviderDialogFragment.this).inflate(0x7f04001f, viewgroup, false);
            viewgroup = new >(view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (>)view.getTag();
        }
        mvpd = (Mvpd)getItem(i);
        if (isPremiumMvpd(mvpd))
        {
            ((getItem) (viewgroup)).ayName.setVisibility(8);
            ((ayName) (viewgroup)).ayName.setVisibility(0);
            picasso.load(mvpd.getLogoUrl()).resizeDimen(0x7f09007d, 0x7f09007c).centerInside().placeholder(0x7f020132).into(((ayName) (viewgroup)).ayName);
        } else
        {
            ((ayName) (viewgroup)).ayName.setVisibility(0);
            ((ayName) (viewgroup)).ayName.setVisibility(8);
        }
        ((ayName) (viewgroup)).ayName.setText(mvpd.getDisplayName());
        return view;
    }

    public (List list)
    {
        this$0 = ProviderDialogFragment.this;
        super();
        mItems = list;
    }
}
