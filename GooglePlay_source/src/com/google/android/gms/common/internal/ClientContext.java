// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            ClientContextCreator, Preconditions, Objects

public class ClientContext
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ClientContextCreator();
    public String mAuthPackageName;
    public String mCallingPackageName;
    public int mCallingUid;
    public Bundle mExtras;
    public List mGrantedScopes;
    public Account mRequestedAccount;
    public Account mResolvedAccount;
    final int mVersion;
    public List mVisibleActions;

    public ClientContext()
    {
        this(0, -1, null, null, null, null, null, null, null);
    }

    ClientContext(int i, int j, Account account, Account account1, String s, String s1, List list, 
            List list1, Bundle bundle)
    {
        mVersion = i;
        mCallingUid = j;
        mResolvedAccount = account;
        mRequestedAccount = account1;
        mCallingPackageName = s;
        mAuthPackageName = s1;
        account = list;
        if (list == null)
        {
            account = new ArrayList();
        }
        mGrantedScopes = account;
        account = list1;
        if (list1 == null)
        {
            account = new ArrayList();
        }
        mVisibleActions = account;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        mExtras = bundle;
    }

    public ClientContext(int i, Account account, Account account1, String s)
    {
        this(i, account, account1, s, s);
    }

    public ClientContext(int i, Account account, Account account1, String s, String s1)
    {
        this(i, account1, account, s, s1, null, null, new Bundle());
    }

    private ClientContext(int i, Account account, Account account1, String s, String s1, ArrayList arraylist, ArrayList arraylist1, 
            Bundle bundle)
    {
        this(0, i, account, account1, s, s1, ((List) (arraylist)), ((List) (arraylist1)), bundle);
    }

    public ClientContext(int i, String s, String s1, String s2)
    {
        this(i, s, s1, s2, s2);
    }

    private ClientContext(int i, String s, String s1, String s2, String s3)
    {
        this(i, s1, s, s2, s3, new Bundle());
    }

    private ClientContext(int i, String s, String s1, String s2, String s3, Bundle bundle)
    {
        if (TextUtils.isEmpty(s))
        {
            s = null;
        } else
        {
            s = new Account(s, "com.google");
        }
        if (TextUtils.isEmpty(s1))
        {
            s1 = null;
        } else
        {
            s1 = new Account(s1, "com.google");
        }
        this(i, ((Account) (s)), ((Account) (s1)), s2, s3, null, null, bundle);
    }

    public ClientContext(ClientContext clientcontext)
    {
        this(clientcontext.mCallingUid, clientcontext.mResolvedAccount, clientcontext.mRequestedAccount, clientcontext.mCallingPackageName, clientcontext.mAuthPackageName, new ArrayList(clientcontext.mGrantedScopes), new ArrayList(clientcontext.mVisibleActions), new Bundle(clientcontext.mExtras));
    }

    public static String getSharedPrefsFileName(Account account, String s)
    {
        return (new StringBuilder("common.clientcontext_")).append(String.valueOf(account.hashCode() ^ s.hashCode())).toString();
    }

    public static ClientContext loadFromSharedPrefs(Context context, int i, Account account, String s)
    {
        Preconditions.checkNotNull(account);
        Preconditions.checkNotNull(s);
        s = context.getSharedPreferences(getSharedPrefsFileName(account, s), 0);
        int j = s.getInt("calling_uid", -1);
        if (j == -1 || j != i)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        context = s.getString("granted_scopes", null);
        if (context != null && context.length() > 0)
        {
            context = context.split(",");
            for (i = 0; i < context.length; i++)
            {
                arraylist.add(context[i]);
            }

        }
        ArrayList arraylist1 = new ArrayList();
        context = s.getString("requested_visible_actions", null);
        if (context != null && context.length() > 0)
        {
            context = context.split(",");
            int k = context.length;
            for (i = 0; i < k; i++)
            {
                arraylist1.add(context[i]);
            }

        }
        Bundle bundle = new Bundle();
        context = s.getString("extras", null);
        if (context != null && context.length() > 0)
        {
            context = context.split(",");
            int l = context.length;
            for (i = 0; i < l - 1; i += 2)
            {
                bundle.putString(context[i], context[i + 1]);
            }

        }
        context = null;
        account = s.getString("resolved_account_name", null);
        if (!TextUtils.isEmpty(account))
        {
            context = new Account(account, s.getString("resolved_account_type", "com.google"));
        }
        account = null;
        String s1 = s.getString("requested_account_name", null);
        if (!TextUtils.isEmpty(s1))
        {
            account = new Account(s1, s.getString("requested_account_type", "com.google"));
        }
        return new ClientContext(j, context, account, s.getString("calling_package_name", null), s.getString("auth_package_name", null), arraylist, arraylist1, bundle);
    }

    public final ClientContext addGrantedScope(String s)
    {
        if (!hasScope(s))
        {
            mGrantedScopes.add(s);
        }
        return this;
    }

    public final void clearFromSharedPrefs(Context context)
    {
        context = context.getSharedPreferences(getSharedPrefsFileName(mResolvedAccount, mAuthPackageName), 0).edit();
        context.clear();
        context.commit();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ClientContext)
        {
            obj = (ClientContext)obj;
            flag = flag1;
            if (Objects.equal(((ClientContext) (obj)).mResolvedAccount, mResolvedAccount))
            {
                flag = flag1;
                if (Objects.equal(((ClientContext) (obj)).mRequestedAccount, mRequestedAccount))
                {
                    flag = flag1;
                    if (Objects.equal(((ClientContext) (obj)).mCallingPackageName, mCallingPackageName))
                    {
                        flag = flag1;
                        if (Objects.equal(((ClientContext) (obj)).mAuthPackageName, mAuthPackageName))
                        {
                            flag = flag1;
                            if (((ClientContext) (obj)).mCallingUid == mCallingUid)
                            {
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final String getExtra(String s)
    {
        return mExtras.getString(s);
    }

    public final String[] getGrantedScopes()
    {
        return (String[])mGrantedScopes.toArray(new String[mGrantedScopes.size()]);
    }

    public final String getResolvedAccountName()
    {
        if (mResolvedAccount == null)
        {
            return null;
        } else
        {
            return mResolvedAccount.name;
        }
    }

    public final String getScopesString()
    {
        if (hasAnyScopes())
        {
            return (new StringBuilder("oauth2:")).append(TextUtils.join(" ", mGrantedScopes)).toString();
        } else
        {
            throw new NullPointerException("no scopes granted");
        }
    }

    public final String[] getVisibleActions()
    {
        return (String[])mVisibleActions.toArray(new String[mVisibleActions.size()]);
    }

    public final boolean hasAnyScopes()
    {
        return mGrantedScopes != null && mGrantedScopes.size() > 0;
    }

    public final boolean hasScope(String s)
    {
        return mGrantedScopes.contains(s);
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mResolvedAccount, mRequestedAccount, mCallingPackageName, mAuthPackageName, Integer.valueOf(mCallingUid)
        });
    }

    public final boolean isCurrentContext()
    {
        return mCallingUid == Process.myUid();
    }

    public final boolean isProxyingAuthentication()
    {
        return !TextUtils.equals(mCallingPackageName, mAuthPackageName);
    }

    public final boolean isResolvedDefaultAccount()
    {
        String s;
        if (mRequestedAccount == null)
        {
            s = null;
        } else
        {
            s = mRequestedAccount.name;
        }
        return "<<default account>>".equals(s);
    }

    public final ClientContext setExtra(String s, int i)
    {
        boolean flag;
        if (!s.contains(","))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "key cannot contain ','");
        mExtras.putInt(s, i);
        return this;
    }

    public final ClientContext setGrantedScopes(String as[])
    {
        mGrantedScopes.clear();
        if (as != null)
        {
            int i = 0;
            for (int j = as.length; i < j; i++)
            {
                mGrantedScopes.add(as[i]);
            }

        }
        return this;
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("mRequestedAccount", mRequestedAccount).add("mResolvedAccount", mResolvedAccount).add("mCallingPackageName", mCallingPackageName).add("mCallingUid", Integer.valueOf(mCallingUid)).add("mAuthPackageName", mAuthPackageName).add("mGrantedScopes", mGrantedScopes).add("isProxyingAuthentication", Boolean.valueOf(isProxyingAuthentication())).add("mVisibleActions", mVisibleActions).add("mExtras", mExtras).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ClientContextCreator.writeToParcel(this, parcel, i);
    }

}
