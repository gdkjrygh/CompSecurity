// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import java.util.ArrayList;
import java.util.List;
import me.lyft.android.providers.ContactPhone;
import me.lyft.android.providers.UserContact;

public class EnterpriseContactsAdapter extends BaseAdapter
{

    private SparseBooleanArray checkedItems;
    private final List data = new ArrayList();
    private final LayoutInflater inflater;

    public EnterpriseContactsAdapter(LayoutInflater layoutinflater)
    {
        checkedItems = null;
        inflater = layoutinflater;
    }

    public void clearCheckedItemPositions()
    {
        checkedItems = null;
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return data.size();
    }

    public List getData()
    {
        return data;
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public UserContact getItem(int i)
    {
        return (UserContact)data.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        float f;
        Object obj;
        CheckedTextView checkedtextview;
        boolean flag;
        if (view == null)
        {
            view = inflater.inflate(0x7f030073, viewgroup, false);
            viewgroup = new ViewHolder(view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        obj = (UserContact)data.get(i);
        ((ViewHolder) (viewgroup)).inviteName.setText(((UserContact) (obj)).getName());
        checkedtextview = ((ViewHolder) (viewgroup)).inviteLabel;
        if (((UserContact) (obj)).getPhoneNumber() != null)
        {
            obj = ((UserContact) (obj)).getPhoneNumber().getPhoneNumber();
        } else
        {
            obj = ((UserContact) (obj)).getEmail();
        }
        checkedtextview.setText(((CharSequence) (obj)));
        flag = isEnabled(i);
        ((ViewHolder) (viewgroup)).inviteLabel.setEnabled(flag);
        ((ViewHolder) (viewgroup)).inviteName.setEnabled(flag);
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.3F;
        }
        ((ViewHolder) (viewgroup)).inviteLabel.setAlpha(f);
        ((ViewHolder) (viewgroup)).inviteName.setAlpha(f);
        return view;
    }

    public boolean isEnabled(int i)
    {
        boolean flag = false;
        if (checkedItems == null || checkedItems.get(i, false))
        {
            flag = true;
        }
        return flag;
    }

    public void setCheckedItemPositions(SparseBooleanArray sparsebooleanarray)
    {
        checkedItems = sparsebooleanarray;
        notifyDataSetChanged();
    }

    public void swapData(List list)
    {
        data.clear();
        if (list != null)
        {
            data.addAll(list);
        }
        notifyDataSetChanged();
    }

    private class ViewHolder
    {

        CheckedTextView inviteLabel;
        CheckedTextView inviteName;

        ViewHolder(View view)
        {
            ButterKnife.a(this, view);
        }
    }

}
