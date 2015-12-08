// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.fitbit.util.service.b;

// Referenced classes of package com.fitbit.data.bl:
//            SyncService, s, an

public class av extends b
{

    static final String a = "com.fitbit.data.bl.SendMessage.ACTION";
    private static final String b = "com.fitbit.data.bl.SendMessage.EXTRA_FRIEND";
    private static final String c = "com.fitbit.data.bl.SendMessage.EXTRA_TYPE";
    private static final String d = "com.fitbit.data.bl.SendMessage.EXTRA_BODY";
    private static final String e = "com.fitbit.data.bl.SendMessage.EXTRA_PAGEGROUP";

    public av()
    {
    }

    public static Intent a(Context context, String s1, com.fitbit.data.domain.Message.MessageType messagetype, String s2, String s3)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SendMessage.ACTION");
        context.putExtra("com.fitbit.data.bl.SendMessage.EXTRA_FRIEND", s1);
        context.putExtra("com.fitbit.data.bl.SendMessage.EXTRA_TYPE", messagetype.ordinal());
        context.putExtra("com.fitbit.data.bl.SendMessage.EXTRA_BODY", s2);
        context.putExtra("com.fitbit.data.bl.SendMessage.EXTRA_PAGEGROUP", s3);
        return context;
    }

    protected void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception
    {
        resultreceiver = intent.getStringExtra("com.fitbit.data.bl.SendMessage.EXTRA_FRIEND");
        com.fitbit.data.domain.Message.MessageType messagetype = com.fitbit.data.domain.Message.MessageType.values()[intent.getIntExtra("com.fitbit.data.bl.SendMessage.EXTRA_TYPE", 0)];
        String s1 = intent.getStringExtra("com.fitbit.data.bl.SendMessage.EXTRA_BODY");
        intent = intent.getStringExtra("com.fitbit.data.bl.SendMessage.EXTRA_PAGEGROUP");
        s.a(syncservice).a(resultreceiver, messagetype, s1, intent);
    }

    public boolean b()
    {
        return an.a().j();
    }
}
