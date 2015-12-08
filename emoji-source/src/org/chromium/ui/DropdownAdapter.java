// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
import java.util.Set;
import org.chromium.base.ApiCompatibilityUtils;

// Referenced classes of package org.chromium.ui:
//            DropdownItem, DropdownDividerDrawable

public class DropdownAdapter extends ArrayAdapter
{

    private boolean mAreAllItemsEnabled;
    private Context mContext;
    private Set mSeparators;

    public DropdownAdapter(Context context, List list, Set set)
    {
        super(context, R.layout.dropdown_item, list);
        mSeparators = set;
        mContext = context;
        mAreAllItemsEnabled = checkAreAllItemsEnabled();
    }

    public DropdownAdapter(Context context, DropdownItem adropdownitem[], Set set)
    {
        super(context, R.layout.dropdown_item, adropdownitem);
        mSeparators = set;
        mContext = context;
        mAreAllItemsEnabled = checkAreAllItemsEnabled();
    }

    private boolean checkAreAllItemsEnabled()
    {
        for (int i = 0; i < getCount(); i++)
        {
            DropdownItem dropdownitem = (DropdownItem)getItem(i);
            if (dropdownitem.isEnabled() && !dropdownitem.isGroupHeader())
            {
                return false;
            }
        }

        return true;
    }

    public boolean areAllItemsEnabled()
    {
        return mAreAllItemsEnabled;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = ((LayoutInflater)mContext.getSystemService("layout_inflater")).inflate(R.layout.dropdown_item, null);
            ApiCompatibilityUtils.setBackgroundForView(viewgroup, new DropdownDividerDrawable());
        }
        view = (DropdownItem)getItem(i);
        Object obj = (TextView)viewgroup.findViewById(R.id.dropdown_label);
        ((TextView) (obj)).setText(view.getLabel());
        ((TextView) (obj)).setEnabled(view.isEnabled());
        int j;
        if (view.isGroupHeader())
        {
            ((TextView) (obj)).setTypeface(null, 1);
        } else
        {
            ((TextView) (obj)).setTypeface(null, 0);
        }
        obj = (DropdownDividerDrawable)viewgroup.getBackground();
        j = mContext.getResources().getDimensionPixelSize(R.dimen.dropdown_item_height);
        if (i == 0)
        {
            ((DropdownDividerDrawable) (obj)).setColor(0);
            i = j;
        } else
        {
            int k = mContext.getResources().getDimensionPixelSize(R.dimen.dropdown_item_divider_height);
            j += k;
            ((DropdownDividerDrawable) (obj)).setHeight(k);
            if (mSeparators != null && mSeparators.contains(Integer.valueOf(i)))
            {
                ((DropdownDividerDrawable) (obj)).setColor(mContext.getResources().getColor(R.color.dropdown_dark_divider_color));
                i = j;
            } else
            {
                ((DropdownDividerDrawable) (obj)).setColor(mContext.getResources().getColor(R.color.dropdown_divider_color));
                i = j;
            }
        }
        viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, i));
        obj = (TextView)viewgroup.findViewById(R.id.dropdown_sublabel);
        view = view.getSublabel();
        if (TextUtils.isEmpty(view))
        {
            ((TextView) (obj)).setVisibility(8);
            return viewgroup;
        } else
        {
            ((TextView) (obj)).setText(view);
            ((TextView) (obj)).setVisibility(0);
            return viewgroup;
        }
    }

    public boolean isEnabled(int i)
    {
        DropdownItem dropdownitem;
        if (i >= 0 && i < getCount())
        {
            if ((dropdownitem = (DropdownItem)getItem(i)).isEnabled() && !dropdownitem.isGroupHeader())
            {
                return true;
            }
        }
        return false;
    }
}
