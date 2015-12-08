// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.os.AsyncTask;
import android.text.style.ClickableSpan;
import android.view.View;
import com.kohls.mcommerce.opal.wallet.asynctask.GetActivityLinksData;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            TransactionDetailActivity

class this._cls0 extends ClickableSpan
{

    final TransactionDetailActivity this$0;

    public void onClick(View view)
    {
        (new GetActivityLinksData(TransactionDetailActivity.access$000(TransactionDetailActivity.this))).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    ()
    {
        this$0 = TransactionDetailActivity.this;
        super();
    }
}
