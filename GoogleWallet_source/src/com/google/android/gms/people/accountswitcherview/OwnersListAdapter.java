// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.people.model.Owner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            AccountOrderingHelper, OwnersAvatarManager

public final class OwnersListAdapter extends BaseAdapter
{
    final class DefaultViewHolderItemCreator
        implements ViewHolderItemCreator
    {

        final OwnersListAdapter this$0;

        public final ViewHolderItem createViewHolderItem(View view, boolean flag)
        {
            ViewHolderItem viewholderitem = new ViewHolderItem();
            viewholderitem.avatar = (ImageView)view.findViewById(R.id.avatar);
            viewholderitem.address = (TextView)view.findViewById(R.id.account_address);
            return viewholderitem;
        }

        private DefaultViewHolderItemCreator()
        {
            this$0 = OwnersListAdapter.this;
            super();
        }

    }

    public static interface ViewDecorator
    {
    }

    public static final class ViewHolderItem
    {

        public TextView address;
        public ImageView avatar;

        public ViewHolderItem()
        {
        }
    }

    public static interface ViewHolderItemCreator
    {

        public abstract ViewHolderItem createViewHolderItem(View view, boolean flag);
    }


    public static final int ACCOUNT = 0;
    public static final int ADD_ACCOUNT = 1;
    private static final int DEFAULT_ACCOUNT_LIST_LAYOUT;
    public static final int MANAGE_ACCOUNTS = 2;
    private int mAccountDetailsColor;
    private AccountOrderingHelper mAccountOrderingHelper;
    private OwnersAvatarManager mAvatarLoader;
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private int mLayoutRes;
    private ArrayList mOwners;
    private String mSelectedOwner;
    private boolean mShowAddAccount;
    private boolean mShowManageAccounts;
    private boolean mUseCustomOrdering;
    private ViewDecorator mViewDecorator;
    private ViewHolderItemCreator mViewHolderItemCreator;

    public OwnersListAdapter(Context context, int i, ViewHolderItemCreator viewholderitemcreator, ViewDecorator viewdecorator)
    {
        mOwners = new ArrayList();
        mShowManageAccounts = true;
        mShowAddAccount = true;
        mContext = context;
        if (i == -1)
        {
            i = DEFAULT_ACCOUNT_LIST_LAYOUT;
        }
        mLayoutRes = i;
        mLayoutInflater = LayoutInflater.from(context);
        if (viewholderitemcreator == null)
        {
            viewholderitemcreator = new DefaultViewHolderItemCreator();
        }
        mViewHolderItemCreator = viewholderitemcreator;
        mViewDecorator = viewdecorator;
        i = R.attr.accountDetailsTextColor;
        viewholderitemcreator = context.obtainStyledAttributes((new TypedValue()).data, new int[] {
            i
        });
        mAccountDetailsColor = viewholderitemcreator.getColor(0, context.getResources().getColor(R.color.default_account_details_color));
        viewholderitemcreator.recycle();
        mAccountOrderingHelper = new AccountOrderingHelper(context);
    }

    private View bindView(View view, Owner owner, OwnersAvatarManager ownersavatarmanager, ViewHolderItemCreator viewholderitemcreator, ViewDecorator viewdecorator, boolean flag, int i)
    {
        if (view.getTag() == null)
        {
            viewholderitemcreator = viewholderitemcreator.createViewHolderItem(view, flag);
            view.setTag(viewholderitemcreator);
        } else
        {
            viewholderitemcreator = (ViewHolderItem)view.getTag();
        }
        if (((ViewHolderItem) (viewholderitemcreator)).avatar != null && ownersavatarmanager != null)
        {
            ((ViewHolderItem) (viewholderitemcreator)).avatar.setImageDrawable(null);
            if (!TextUtils.isEmpty(owner.getAvatarUrl()))
            {
                ownersavatarmanager.removePendingRequest(((ViewHolderItem) (viewholderitemcreator)).avatar);
                ownersavatarmanager.loadOwnerAvatar(((ViewHolderItem) (viewholderitemcreator)).avatar, owner.getAccountName(), owner.getPlusPageId(), 1);
            } else
            {
                ownersavatarmanager.removePendingRequest(((ViewHolderItem) (viewholderitemcreator)).avatar);
                ((ViewHolderItem) (viewholderitemcreator)).avatar.setImageBitmap(OwnersAvatarManager.getPlaceholder(view.getContext(), owner.getAccountName(), owner.getPlusPageId(), 1));
            }
        }
        if (((ViewHolderItem) (viewholderitemcreator)).address != null)
        {
            ((ViewHolderItem) (viewholderitemcreator)).address.setTextColor(i);
            ((ViewHolderItem) (viewholderitemcreator)).address.setVisibility(0);
            ((ViewHolderItem) (viewholderitemcreator)).address.setText(owner.getAccountName());
            ((ViewHolderItem) (viewholderitemcreator)).address.setContentDescription(mContext.getResources().getString(R.string.account_item, new Object[] {
                owner.getAccountName()
            }));
        }
        return view;
    }

    private int getAddAccountsOffset()
    {
        return !mShowManageAccounts ? -1 : -2;
    }

    private boolean isAddAccountsPosition(int i)
    {
        int j = getAddAccountsOffset();
        return mShowAddAccount && i == getCount() + j;
    }

    private boolean isManageAccountsPosition(int i)
    {
        return mShowManageAccounts && i == getCount() - 1;
    }

    public static List removeSelectedAccount(List list, Owner owner, Owner owner1)
    {
        String s = null;
        int l = -1;
        int j = -1;
        if (owner1 != null)
        {
            owner1 = owner1.getAccountName();
        } else
        {
            owner1 = null;
        }
        if (owner != null)
        {
            s = owner.getAccountName();
        }
        for (int i = 0; i < list.size();)
        {
            Owner owner2 = (Owner)list.get(i);
            int k = l;
            if (l < 0)
            {
                k = l;
                if (owner2.getAccountName().equals(owner1))
                {
                    k = i;
                }
            }
            l = j;
            if (j < 0)
            {
                l = j;
                if (owner2.getAccountName().equals(s))
                {
                    l = i;
                }
            }
            i++;
            j = l;
            l = k;
        }

        if (l >= 0)
        {
            list.remove(l);
        }
        if (j < 0 && s != null && !s.equals(owner1))
        {
            list.add(owner);
        }
        return list;
    }

    private void setBuffer(List list)
    {
        if (mUseCustomOrdering)
        {
            mOwners.clear();
            if (list != null)
            {
                Owner owner;
                for (list = list.iterator(); list.hasNext(); mOwners.add(owner))
                {
                    owner = (Owner)list.next();
                }

            }
            notifyDataSetChanged();
        } else
        {
            mOwners = mAccountOrderingHelper.orderAccounts(list);
        }
        notifyDataSetChanged();
    }

    public final void disconnect()
    {
        if (mAccountOrderingHelper != null)
        {
            mAccountOrderingHelper.detach();
        }
    }

    public final int getCount()
    {
        int j = 1;
        int k = 0;
        int i;
        if (mShowManageAccounts)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!mShowAddAccount)
        {
            j = 0;
        }
        if (mOwners != null)
        {
            k = mOwners.size();
        }
        return i + j + k;
    }

    public final Owner getItem(int i)
    {
        while (isAddAccountsPosition(i) || isManageAccountsPosition(i) || mOwners == null) 
        {
            return null;
        }
        return (Owner)mOwners.get(i);
    }

    public final volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public final long getItemId(int i)
    {
        long l1 = -1L;
        getAddAccountsOffset();
        long l;
        if (isManageAccountsPosition(i))
        {
            l = -2L;
        } else
        {
            l = l1;
            if (!isAddAccountsPosition(i))
            {
                l = l1;
                if (mOwners != null)
                {
                    return (long)((Owner)mOwners.get(i)).getAccountName().hashCode();
                }
            }
        }
        return l;
    }

    public final int getItemViewType(int i)
    {
        if (isManageAccountsPosition(i))
        {
            return 2;
        }
        return !isAddAccountsPosition(i) ? 0 : 1;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag = true;
        if (getItemViewType(i) == 2)
        {
            viewgroup = view;
            if (view == null)
            {
                viewgroup = mLayoutInflater.inflate(R.layout.manage_accounts, null);
            }
        } else
        if (getItemViewType(i) == 1)
        {
            viewgroup = view;
            if (view == null)
            {
                return mLayoutInflater.inflate(R.layout.add_account, null);
            }
        } else
        {
            viewgroup = view;
            if (view == null)
            {
                viewgroup = mLayoutInflater.inflate(mLayoutRes, null);
            }
            view = getItem(i);
            OwnersAvatarManager ownersavatarmanager = mAvatarLoader;
            ViewHolderItemCreator viewholderitemcreator = mViewHolderItemCreator;
            ViewDecorator viewdecorator = mViewDecorator;
            if (mSelectedOwner == null || !mSelectedOwner.equals(view.getAccountName()))
            {
                flag = false;
            }
            return bindView(viewgroup, view, ownersavatarmanager, viewholderitemcreator, viewdecorator, flag, mAccountDetailsColor);
        }
        return viewgroup;
    }

    public final int getViewTypeCount()
    {
        return 3;
    }

    public final void setAvatarManager(OwnersAvatarManager ownersavatarmanager)
    {
        mAvatarLoader = ownersavatarmanager;
    }

    public final void setOwners(List list)
    {
        setBuffer(list);
    }

    public final void setUseCustomOrdering(boolean flag)
    {
        mUseCustomOrdering = flag;
    }

    public final void showAddAccount(boolean flag)
    {
        if (mShowAddAccount != flag)
        {
            mShowAddAccount = flag;
            notifyDataSetChanged();
        }
    }

    public final void showManageAccounts(boolean flag)
    {
        if (mShowManageAccounts != flag)
        {
            mShowManageAccounts = flag;
            notifyDataSetChanged();
        }
    }

    static 
    {
        DEFAULT_ACCOUNT_LIST_LAYOUT = R.layout.account_item_view;
    }
}
