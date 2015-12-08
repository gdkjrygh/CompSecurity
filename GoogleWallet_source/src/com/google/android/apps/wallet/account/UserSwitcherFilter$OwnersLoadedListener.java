// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.accounts.Account;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.model.Owner;
import com.google.android.gms.people.model.OwnerBuffer;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import java.util.Iterator;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.account:
//            UserSwitcherFilter, AccountChanger

final class this._cls0
    implements ResultCallback
{

    final UserSwitcherFilter this$0;

    private void onResult(com.google.android.gms.people.Listener listener)
    {
        if (!listener.Listener().isSuccess())
        {
            String s = UserSwitcherFilter.access$200();
            listener = String.valueOf(listener.Listener().getStatusMessage());
            if (listener.length() != 0)
            {
                listener = "Loading owners failed: ".concat(listener);
            } else
            {
                listener = new String("Loading owners failed: ");
            }
            WLog.e(s, listener);
        } else
        {
            listener = listener.Listener();
            HashFunction hashfunction = Hashing.sha1();
            if (!hashfunction.hashUnencodedChars(((Account)UserSwitcherFilter.access$300(UserSwitcherFilter.this).get()).name).toString().equals(UserSwitcherFilter.access$400(UserSwitcherFilter.this)))
            {
                Object obj = null;
                Iterator iterator = listener.iterator();
                do
                {
                    listener = obj;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    listener = (Owner)iterator.next();
                } while (!hashfunction.hashUnencodedChars(listener.getAccountName()).toString().equals(UserSwitcherFilter.access$400(UserSwitcherFilter.this)));
                if (listener != null)
                {
                    ((AccountChanger)UserSwitcherFilter.access$600(UserSwitcherFilter.this).get()).changeAccount(listener.getAccountName(), UserSwitcherFilter.access$500(UserSwitcherFilter.this));
                    return;
                }
            }
        }
    }

    public final volatile void onResult(Result result)
    {
        onResult((com.google.android.gms.people.Listener.onResult)result);
    }

    ()
    {
        this$0 = UserSwitcherFilter.this;
        super();
    }
}
