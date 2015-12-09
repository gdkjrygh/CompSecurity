// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.gms.people.accountswitcherview.OwnersAvatarManager;
import com.google.android.gms.people.model.Owner;
import com.google.common.collect.ImmutableList;
import java.util.List;

public final class AccountAdapter extends BaseAdapter
{

    private final Activity activity;
    private final OwnersAvatarManager avatarManager;
    private final LayoutInflater layoutInflater;
    private List owners;

    public AccountAdapter(Activity activity1, OwnersAvatarManager ownersavatarmanager)
    {
        activity = activity1;
        avatarManager = ownersavatarmanager;
        owners = ImmutableList.of();
        layoutInflater = LayoutInflater.from(activity1);
    }

    private Owner getItem(int i)
    {
        if (isAddAccountIndex(i))
        {
            return null;
        } else
        {
            return (Owner)owners.get(i);
        }
    }

    public final int getCount()
    {
        if (owners.size() > 0)
        {
            return owners.size() + 1;
        } else
        {
            return 0;
        }
    }

    public final volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public final long getItemId(int i)
    {
        if (isAddAccountIndex(i))
        {
            return 1L;
        } else
        {
            return (long)((Owner)owners.get(i)).getAccountName().hashCode();
        }
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        TextView textview;
        TextView textview1;
        if (view == null)
        {
            view = layoutInflater.inflate(com.google.android.apps.walletnfcrel.R.layout.account_spinner_row, viewgroup, false);
        }
        viewgroup = (ImageView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.OwnerImage);
        textview = (TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.DisplayName);
        textview1 = (TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.AccountName);
        avatarManager.removePendingRequest(viewgroup);
        if (isAddAccountIndex(i))
        {
            viewgroup.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.quantum_ic_add_grey600_24);
            textview.setText(com.google.android.apps.walletnfcrel.R.string.setup_select_account_add_new);
            textview1.setVisibility(8);
            return view;
        }
        Owner owner = (Owner)owners.get(i);
        viewgroup.setImageDrawable(null);
        textview.setText(owner.getDisplayName());
        textview1.setText(owner.getAccountName());
        textview1.setVisibility(0);
        if (!TextUtils.isEmpty(owner.getAvatarUrl()))
        {
            avatarManager.loadOwnerAvatar(viewgroup, owner.getAccountName(), owner.getPlusPageId(), 1);
            return view;
        } else
        {
            OwnersAvatarManager ownersavatarmanager = avatarManager;
            viewgroup.setImageBitmap(OwnersAvatarManager.getPlaceholder(activity, owner.getAccountName(), owner.getPlusPageId(), 1));
            return view;
        }
    }

    public final boolean isAddAccountIndex(int i)
    {
        return i == owners.size();
    }

    public final void setOwners(Iterable iterable)
    {
        owners = ImmutableList.copyOf(iterable);
        notifyDataSetChanged();
    }
}
