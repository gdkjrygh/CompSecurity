// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.asynctask;

import android.content.Context;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.AccountLookupService;
import com.kohls.mcommerce.opal.wallet.rest.containers.AccountLookupResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ErrorResponse;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.asynctask:
//            BaseAsyncTask

public class AccountLookupTask extends BaseAsyncTask
{

    public AccountLookupTask(Context context)
    {
        super(context);
    }

    protected transient AccountLookupResponse doInBackground(String as[])
    {
        AccountLookupResponse accountlookupresponse = null;
        if (mContext == null)
        {
            return null;
        }
        if (canAccessNetwork())
        {
            as = (new AccountLookupService(new WeakReference(mContext))).getAccountData(as[0], as[1], as[2]);
            if (as != null && as.getErrors() != null && as.getErrors().size() > 0 && ((ErrorResponse)as.getErrors().get(0)).getErrorCode() == 46)
            {
                return as;
            }
            accountlookupresponse = as;
            if (hasErrors(as).booleanValue())
            {
                return null;
            }
        }
        return accountlookupresponse;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(AccountLookupResponse accountlookupresponse)
    {
        super.onPostExecute(accountlookupresponse);
        ListenerManager.getInstance().broadcastListener("account_data", accountlookupresponse);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((AccountLookupResponse)obj);
    }
}
