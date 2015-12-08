// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.onboarding;

import android.accounts.Account;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

// Referenced classes of package com.google.android.gms.games.ui.destination.onboarding:
//            GamesOnboardAccountsPage

private final class mInflater extends ArrayAdapter
{
    private final class ViewHolder
    {

        Account account;
        final GamesOnboardAccountsPage.AccountsAdapter this$1;
        TextView title;

        public ViewHolder(View view)
        {
            this$1 = GamesOnboardAccountsPage.AccountsAdapter.this;
            super();
            title = (TextView)view.findViewById(0x7f0d0075);
        }
    }


    private final LayoutInflater mInflater;
    final GamesOnboardAccountsPage this$0;

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = mInflater.inflate(0x7f0400a5, viewgroup, false);
            view.setTag(new ViewHolder(view));
        }
        viewgroup = (ViewHolder)view.getTag();
        Account account = (Account)getItem(i);
        viewgroup.account = account;
        ((ViewHolder) (viewgroup)).title.setText(account.name);
        return view;
    }

    public ViewHolder.title(Context context)
    {
        this$0 = GamesOnboardAccountsPage.this;
        super(context, 0x7f0400a5, -1);
        mInflater = LayoutInflater.from(context);
    }
}
