// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import Mf;
import Mp;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.database.table.CashFeedItemTable;
import com.snapchat.android.model.CashTransaction;
import com.squareup.otto.Bus;
import java.util.Arrays;

// Referenced classes of package com.snapchat.android.model.chat:
//            CashFeedItem

final class val.originalVersion
    implements t
{

    final CashFeedItem this$0;
    final int val$modifiedVersion;
    final int val$originalVersion;
    final boolean val$saved;

    public final void a()
    {
        String s1 = CashFeedItem.t();
        String s;
        if (val$saved)
        {
            s = "SAVING";
        } else
        {
            s = "UNSAVING";
        }
        Timber.b(s1, "CASH-LOG: SUCCEEDED %s cash id[%s] sender[%s] recipient[%s]", new Object[] {
            s, d(), j(), ad()
        });
        CashFeedItemTable.a(SnapchatApplication.get(), Arrays.asList(new CashFeedItem[] {
            CashFeedItem.this
        }));
    }

    public final void a(int i)
    {
        String s = CashFeedItem.t();
        Object obj;
        if (val$saved)
        {
            obj = "SAVING";
        } else
        {
            obj = "UNSAVING";
        }
        Timber.b(s, "CASH-LOG: FAILED %s cash id[%s] sender[%s] recipient[%s] statusCode[%d]", new Object[] {
            obj, d(), j(), ad(), Integer.valueOf(i)
        });
        if (CashFeedItem.a(CashFeedItem.this).mSenderSaveVersion == val$modifiedVersion)
        {
            obj = CashFeedItem.a(CashFeedItem.this);
            boolean flag;
            if (!val$saved)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj.mIsSavedBySender = flag;
            CashFeedItem.a(CashFeedItem.this).mSenderSaveVersion = val$originalVersion;
            CashFeedItemTable.a(SnapchatApplication.get(), Arrays.asList(new CashFeedItem[] {
                CashFeedItem.this
            }));
            Mf.a().a(new Mp(ac(), d()));
        }
    }

    mTable()
    {
        this$0 = final_cashfeeditem;
        val$saved = flag;
        val$modifiedVersion = i;
        val$originalVersion = I.this;
        super();
    }
}
