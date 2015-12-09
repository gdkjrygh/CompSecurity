// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.onboarding;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.util.AccountUtils;
import com.google.android.libraries.bind.widget.BindingFrameLayout;
import com.google.android.play.onboard.OnboardHostControl;
import com.google.android.play.onboard.OnboardNavFooterButtonInfo;
import com.google.android.play.onboard.OnboardPage;
import com.google.android.play.onboard.OnboardPageInfo;

public class GamesOnboardAccountsPage extends BindingFrameLayout
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, OnboardPage, OnboardPageInfo
{
    private final class AccountsAdapter extends ArrayAdapter
    {

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

        public AccountsAdapter(Context context)
        {
            this$0 = GamesOnboardAccountsPage.this;
            super(context, 0x7f0400a5, -1);
            mInflater = LayoutInflater.from(context);
        }
    }

    private final class AccountsAdapter.ViewHolder
    {

        Account account;
        final AccountsAdapter this$1;
        TextView title;

        public AccountsAdapter.ViewHolder(View view)
        {
            this$1 = AccountsAdapter.this;
            super();
            title = (TextView)view.findViewById(0x7f0d0075);
        }
    }

    public static interface OnboardAccountsEventListener
    {

        public abstract void onAccountClicked(String s);
    }


    Activity mActivity;
    AccountsAdapter mAdapter;
    Context mContext;
    private OnboardHostControl mHostControl;
    OnboardAccountsEventListener mListener;

    public GamesOnboardAccountsPage(Context context)
    {
        this(context, null);
    }

    public GamesOnboardAccountsPage(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public GamesOnboardAccountsPage(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mContext = context;
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f0400a8, this, true);
        ((TextView)findViewById(0x7f0d01fc)).setOnClickListener(this);
        mAdapter = new AccountsAdapter(context);
        mAdapter.addAll(AccountUtils.getAvailableAccounts(context));
        context = (ListView)findViewById(0x7f0d00db);
        context.setAdapter(mAdapter);
        context.setOnItemClickListener(this);
    }

    public final boolean allowSwipeToNext$5669347f()
    {
        return false;
    }

    public final boolean allowSwipeToPrevious$5669347f()
    {
        return false;
    }

    public final OnboardNavFooterButtonInfo getEndButtonInfo(OnboardHostControl onboardhostcontrol)
    {
        return (new OnboardNavFooterButtonInfo()).setVisible$1466a8b4();
    }

    public final int getGroupPageCount$5669346e()
    {
        return 0;
    }

    public final int getGroupPageIndex$5669346e()
    {
        return 3;
    }

    public final OnboardPageInfo getPageInfo()
    {
        return this;
    }

    public final OnboardNavFooterButtonInfo getStartButtonInfo(OnboardHostControl onboardhostcontrol)
    {
        return (new OnboardNavFooterButtonInfo()).setVisible$1466a8b4();
    }

    public final boolean isNavFooterVisible$5669347f()
    {
        return false;
    }

    public void onClick(View view)
    {
        if (mListener == null)
        {
            GamesLog.w("OnboardAccountsPage", "onClick with null listener, ignoring.");
            return;
        }
        if (view.getId() == 0x7f0d01fc)
        {
            view = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
            view.putExtra("account_types", new String[] {
                "com.google"
            });
            mActivity.startActivity(view);
            return;
        } else
        {
            GamesLog.w("OnboardAccountsPage", (new StringBuilder("Unhandled onClick view ")).append(view).toString());
            return;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (mListener == null)
        {
            GamesLog.w("OnboardAccountsPage", "onItemClick with null listener, ignoring.");
        } else
        {
            adapterview = ((AccountsAdapter.ViewHolder)view.getTag()).account;
            if (adapterview != null)
            {
                mListener.onAccountClicked(((Account) (adapterview)).name);
                mHostControl.goToNextPage();
                return;
            }
        }
    }

    public final void setOnboardHostControl(OnboardHostControl onboardhostcontrol)
    {
        mHostControl = onboardhostcontrol;
    }

    public final boolean shouldAdjustPagePaddingToFitNavFooter$5669347f()
    {
        return false;
    }
}
