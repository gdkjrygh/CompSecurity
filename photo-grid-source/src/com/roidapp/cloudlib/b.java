// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.exception.DropboxException;
import com.roidapp.cloudlib.common.a;

// Referenced classes of package com.roidapp.cloudlib:
//            AccountMgrActivity, c

final class b
    implements Runnable
{

    final AccountMgrActivity a;

    b(AccountMgrActivity accountmgractivity)
    {
        a = accountmgractivity;
        super();
    }

    public final void run()
    {
        String s;
        try
        {
            s = com.roidapp.cloudlib.AccountMgrActivity.a(a).accountInfo().displayName;
        }
        catch (DropboxException dropboxexception)
        {
            dropboxexception.printStackTrace();
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        com.roidapp.cloudlib.common.a.d(a, s);
        a.runOnUiThread(new c(this));
        return;
    }
}
