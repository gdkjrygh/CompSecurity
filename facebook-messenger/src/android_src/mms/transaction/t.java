// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.facebook.o;

// Referenced classes of package android_src.mms.transaction:
//            TransactionService

class t extends Handler
{

    final TransactionService a;

    t(TransactionService transactionservice)
    {
        a = transactionservice;
        super();
    }

    public void handleMessage(Message message)
    {
        String s = null;
        if (message.what != 1) goto _L2; else goto _L1
_L1:
        s = a.getString(o.message_queued);
_L4:
        if (s != null)
        {
            Toast.makeText(a, s, 1).show();
        }
        return;
_L2:
        if (message.what == 2)
        {
            s = a.getString(o.download_later);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
