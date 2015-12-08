// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.paypal.android.sdk:
//            W, aa, ao

final class ab extends Handler
{

    private aa a;

    ab(aa aa1)
    {
        a = aa1;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR lookupswitch 9: default 420
    //                   0: 420
    //                   1: 402
    //                   2: 118
    //                   10: 420
    //                   11: 393
    //                   12: 88
    //                   20: 420
    //                   21: 411
    //                   22: 420;
           goto _L1 _L1 _L2 _L3 _L1 _L4 _L5 _L1 _L6 _L1
_L5:
        message = (W)message.obj;
        if (message != null)
        {
            try
            {
                aa.a(a, message);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                ao.a("RiskComponent", null, message);
            }
            return;
        }
          goto _L1
_L3:
        message = (String)message.obj;
        (new StringBuilder("LogRiskMetadataRequest Server returned: ")).append(message);
        message = Uri.parse((new StringBuilder("?")).append(message).toString());
        Iterator iterator;
        java.util.Map.Entry entry;
        Iterator iterator1;
        java.util.Map.Entry entry1;
        boolean flag;
        try
        {
            message = message.getQueryParameter("responseEnvelope.ack");
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            message = null;
        }
        if (!"Success".equals(message)) goto _L1; else goto _L7
_L7:
        message = new HashMap(aa.a(a));
        iterator = aa.a(a).entrySet().iterator();
_L18:
        if (!iterator.hasNext()) goto _L9; else goto _L8
_L8:
        entry = (java.util.Map.Entry)iterator.next();
        flag = false;
        iterator1 = aa.b(a).entrySet().iterator();
_L13:
        if (!iterator1.hasNext()) goto _L11; else goto _L10
_L10:
        entry1 = (java.util.Map.Entry)iterator1.next();
        if (!((String)entry1.getKey()).equals(entry.getKey())) goto _L13; else goto _L12
_L12:
        if (entry1.getValue() != null) goto _L15; else goto _L14
_L14:
        if (entry.getValue() != null) goto _L13; else goto _L16
_L15:
        if (entry1.getValue().equals(entry.getValue())) goto _L16; else goto _L13
_L11:
        if (!flag) goto _L18; else goto _L17
_L17:
        message.remove(entry.getKey());
          goto _L18
_L9:
        aa.a(a, message);
        aa.a(a, aa.c(a));
        aa.b(a, null);
        return;
_L4:
        Log.e("RiskComponent", "LoadConfigurationRequest failed.");
        return;
_L2:
        Log.e("RiskComponent", "LogRiskMetadataRequest failed.");
        return;
_L6:
        Log.e("RiskComponent", "BeaconRequest failed.");
        return;
_L1:
        return;
_L16:
        flag = true;
          goto _L13
    }
}
