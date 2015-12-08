// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.accounts.Account;
import android.accounts.AccountManager;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            AccountOrderingHelper, OwnersAvatarManager

public final class OwnersListAdapter extends BaseAdapter
{
    private final class DefaultViewHolderItemCreator
        implements ViewHolderItemCreator
    {

        final OwnersListAdapter this$0;

        public final ViewHolderItem createViewHolderItem$53f3e085(View view)
        {
            ViewHolderItem viewholderitem = new ViewHolderItem();
            viewholderitem.avatar = (ImageView)view.findViewById(0x7f0d0069);
            viewholderitem.address = (TextView)view.findViewById(0x7f0d00da);
            return viewholderitem;
        }

        private DefaultViewHolderItemCreator()
        {
            this$0 = OwnersListAdapter.this;
            super();
        }

        DefaultViewHolderItemCreator(byte byte0)
        {
            this();
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

        public abstract ViewHolderItem createViewHolderItem$53f3e085(View view);
    }


    private static final int DEFAULT_ACCOUNT_LIST_LAYOUT = 0x7f04001b;
    private int mAccountDetailsColor;
    public AccountOrderingHelper mAccountOrderingHelper;
    public OwnersAvatarManager mAvatarLoader;
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private int mLayoutRes;
    private ArrayList mOwners;
    public boolean mShowAddAccount;
    public boolean mShowManageAccounts;
    private ViewDecorator mViewDecorator;
    private ViewHolderItemCreator mViewHolderItemCreator;

    public OwnersListAdapter(Context context)
    {
        this(context, 0x7f04001b);
    }

    private OwnersListAdapter(Context context, int i)
    {
        mOwners = new ArrayList();
        mShowManageAccounts = true;
        mShowAddAccount = true;
        mContext = context;
        mLayoutRes = 0x7f04001b;
        mLayoutInflater = LayoutInflater.from(context);
        mViewHolderItemCreator = new DefaultViewHolderItemCreator((byte)0);
        mViewDecorator = null;
        TypedArray typedarray = context.obtainStyledAttributes((new TypedValue()).data, new int[] {
            0x7f010000
        });
        mAccountDetailsColor = typedarray.getColor(0, context.getResources().getColor(0x7f0b0038));
        typedarray.recycle();
        mAccountOrderingHelper = new AccountOrderingHelper(context);
    }

    private boolean isAddAccountsPosition(int i)
    {
        byte byte0;
        if (mShowManageAccounts)
        {
            byte0 = -2;
        } else
        {
            byte0 = -1;
        }
        return mShowAddAccount && i == getCount() + byte0;
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
        if (getItemViewType(i) != 2) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = view;
        if (view == null)
        {
            obj = mLayoutInflater.inflate(0x7f0400f5, null);
        }
_L4:
        return ((View) (obj));
_L2:
        if (getItemViewType(i) != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = view;
        if (view == null)
        {
            return mLayoutInflater.inflate(0x7f040020, null);
        }
        if (true) goto _L4; else goto _L3
_L3:
        viewgroup = view;
        if (view == null)
        {
            viewgroup = mLayoutInflater.inflate(mLayoutRes, null);
        }
        Owner owner = getItem(i);
        obj = mAvatarLoader;
        view = mViewHolderItemCreator;
        i = mAccountDetailsColor;
        if (viewgroup.getTag() == null)
        {
            view = view._mth53f3e085(viewgroup);
            viewgroup.setTag(view);
        } else
        {
            view = (ViewHolderItem)viewgroup.getTag();
        }
        if (((ViewHolderItem) (view)).avatar != null && obj != null)
        {
            ((ViewHolderItem) (view)).avatar.setImageDrawable(null);
            if (!TextUtils.isEmpty(owner.getAvatarUrl()))
            {
                ((OwnersAvatarManager) (obj)).removePendingRequest(((ViewHolderItem) (view)).avatar);
                ((OwnersAvatarManager) (obj)).loadOwnerAvatar(((ViewHolderItem) (view)).avatar, owner.getAccountName(), owner.getPlusPageId(), 1);
            } else
            {
                ((OwnersAvatarManager) (obj)).removePendingRequest(((ViewHolderItem) (view)).avatar);
                obj = ((ViewHolderItem) (view)).avatar;
                Context context = viewgroup.getContext();
                owner.getAccountName();
                owner.getPlusPageId();
                ((ImageView) (obj)).setImageBitmap(OwnersAvatarManager.getPlaceholder$31ca6c6(context));
            }
        }
        obj = viewgroup;
        if (((ViewHolderItem) (view)).address != null)
        {
            ((ViewHolderItem) (view)).address.setTextColor(i);
            ((ViewHolderItem) (view)).address.setVisibility(0);
            ((ViewHolderItem) (view)).address.setText(owner.getAccountName());
            ((ViewHolderItem) (view)).address.setContentDescription(mContext.getResources().getString(0x7f100011, new Object[] {
                owner.getAccountName()
            }));
            return viewgroup;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final int getViewTypeCount()
    {
        return 3;
    }

    public final void setOwners(List list)
    {
        AccountOrderingHelper accountorderinghelper = mAccountOrderingHelper;
        if (list != null && !list.isEmpty()) goto _L2; else goto _L1
_L1:
        accountorderinghelper.detach();
_L4:
        mOwners = accountorderinghelper.mOwners;
        notifyDataSetChanged();
        return;
_L2:
        if (accountorderinghelper.mAccountManager == null)
        {
            accountorderinghelper.mAccountManager = AccountManager.get(accountorderinghelper.mContext);
        }
        accountorderinghelper.mAccountOrder = accountorderinghelper.mAccountManager.getAccountsByType("com.google");
        accountorderinghelper.mOwnersMap.clear();
        if (list != null)
        {
            Owner owner;
            for (list = list.iterator(); list.hasNext(); accountorderinghelper.mOwnersMap.put(owner.getAccountName(), owner))
            {
                owner = (Owner)list.next();
            }

        }
        if (!accountorderinghelper.mOwnersMap.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        accountorderinghelper.detach();
        if (true) goto _L4; else goto _L3
_L3:
        accountorderinghelper.mOwners.clear();
        list = accountorderinghelper.mAccountOrder;
        int j = list.length;
        int i = 0;
        while (i < j) 
        {
            Owner owner1 = list[i];
            owner1 = (Owner)accountorderinghelper.mOwnersMap.get(((Account) (owner1)).name);
            if (owner1 != null)
            {
                accountorderinghelper.mOwners.add(owner1);
            }
            i++;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

}
