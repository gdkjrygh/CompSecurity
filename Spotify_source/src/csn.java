// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.SendMessageResponse;

final class csn extends csl
{

    public csn(clv clv1)
    {
        super(clv1);
    }

    public final void a(SendMessageResponse sendmessageresponse)
    {
        int i = sendmessageresponse.b;
        i;
        JVM INSTR tableswitch 4000 4005: default 44
    //                   4000 92
    //                   4001 98
    //                   4002 104
    //                   4003 110
    //                   4004 116
    //                   4005 122;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        Object obj = bqt.a(i);
_L9:
        sendmessageresponse = new cry(new Status(i, ((String) (obj))), sendmessageresponse.c);
        obj = super.a;
        if (obj != null)
        {
            ((clv) (obj)).a(sendmessageresponse);
            super.a = null;
        }
        return;
_L2:
        obj = "TARGET_NODE_NOT_CONNECTED";
        continue; /* Loop/switch isn't completed */
_L3:
        obj = "DUPLICATE_LISTENER";
        continue; /* Loop/switch isn't completed */
_L4:
        obj = "UNKNOWN_LISTENER";
        continue; /* Loop/switch isn't completed */
_L5:
        obj = "DATA_ITEM_TOO_LARGE";
        continue; /* Loop/switch isn't completed */
_L6:
        obj = "INVALID_TARGET_NODE";
        continue; /* Loop/switch isn't completed */
_L7:
        obj = "ASSET_UNAVAILABLE";
        if (true) goto _L9; else goto _L8
_L8:
    }
}
