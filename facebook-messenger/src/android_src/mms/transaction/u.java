// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.facebook.debug.log.b;

// Referenced classes of package android_src.mms.transaction:
//            TransactionService, w, v, t

class u extends BroadcastReceiver
{

    final TransactionService a;

    private u(TransactionService transactionservice)
    {
        a = transactionservice;
        super();
    }

    u(TransactionService transactionservice, t t)
    {
        this(transactionservice);
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (b.b(2))
        {
            b.d("fb-mms:TransactionService", (new StringBuilder()).append("ConnectivityBroadcastReceiver.onReceive() action: ").append(context).toString());
        }
        if (context.equals("android.net.conn.CONNECTIVITY_CHANGE")) goto _L2; else goto _L1
_L1:
        return;
_L2:
        intent.getBooleanExtra("noConnectivity", false);
        context = (NetworkInfo)intent.getParcelableExtra("networkInfo");
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", (new StringBuilder()).append("Handle ConnectivityBroadcastReceiver.onReceive(): ").append(context).toString());
        }
        if (context != null && context.getType() == 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", "   type is not TYPE_MOBILE_MMS, bail");
        }
        if (context != null && "2GVoiceCallEnded".equals(context.getReason()))
        {
            if (b.b(2))
            {
                b.a("fb-mms:TransactionService", "   reason is 2GVoiceCallEnded, retrying mms connectivity");
            }
            android_src.mms.transaction.TransactionService.b(a);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!context.isConnected())
        {
            if (b.b(2))
            {
                b.a("fb-mms:TransactionService", "   TYPE_MOBILE_MMS not connected, bail");
                return;
            }
        } else
        {
            context = new w(a, context.getExtraInfo());
            if (TextUtils.isEmpty(context.a()))
            {
                b.a("fb-mms:TransactionService", "   empty MMSC url, bail");
                return;
            } else
            {
                android_src.mms.transaction.TransactionService.b(a);
                TransactionService.d(a).a(null, context);
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
