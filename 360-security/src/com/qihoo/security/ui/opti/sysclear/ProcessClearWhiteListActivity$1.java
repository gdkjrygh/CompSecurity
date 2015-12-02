// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.qihoo.security.opti.a.c;
import com.qihoo.security.quc.AccountLog;
import com.qihoo.security.support.b;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            ProcessClearWhiteListActivity

class a extends Handler
{

    final ProcessClearWhiteListActivity a;

    public void handleMessage(Message message)
    {
        if (!a.isFinishing()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (message.what)
        {
        default:
            break;

        case 0: // '\0'
            break;

        case 1: // '\001'
            break;
        }
        break; /* Loop/switch isn't completed */
        return;
        if (true) goto _L1; else goto _L3
_L3:
        if (ProcessClearWhiteListActivity.a(a) != null && ProcessClearWhiteListActivity.a(a).size() == 0 && !com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.b(a))
        {
            com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.c(a).setVisibility(8);
        } else
        {
            com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.c(a).setVisibility(8);
        }
        ProcessClearWhiteListActivity.e(a).a(ProcessClearWhiteListActivity.d(a).c());
        ProcessClearWhiteListActivity.f(a);
        if (!ProcessClearWhiteListActivity.g(a))
        {
            AccountLog.b(com.qihoo.security.quc.NORE_PAGE);
            ProcessClearWhiteListActivity.a(a, true);
        }
        if (ProcessClearWhiteListActivity.a(a) != null)
        {
            if (ProcessClearWhiteListActivity.h(a) == 0)
            {
                b.b(11024, ProcessClearWhiteListActivity.a(a).size());
                return;
            } else
            {
                b.b(11313, ProcessClearWhiteListActivity.a(a).size());
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    I(ProcessClearWhiteListActivity processclearwhitelistactivity)
    {
        a = processclearwhitelistactivity;
        super();
    }
}
