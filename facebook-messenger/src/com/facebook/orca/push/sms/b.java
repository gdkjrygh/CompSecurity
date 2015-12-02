// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push.sms;

import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;
import com.facebook.c.c;
import com.facebook.orca.nux.h;
import com.facebook.orca.phonenumber.identification.f;
import com.facebook.sms.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.push.sms:
//            SmsReceiver

public class b
    implements a
{

    private final javax.inject.a a;
    private final javax.inject.a b;
    private final h c;
    private final f d;

    public b(javax.inject.a a1, javax.inject.a a2, h h1, f f1)
    {
        a = a1;
        b = a2;
        c = h1;
        d = f1;
    }

    public void a(Context context, Intent intent, c c1, List list)
    {
        if (!d.b()) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(((SmsMessage)list.next()).getMessageBody())) { }
        if (!d.a(arraylist)) goto _L2; else goto _L3
_L3:
        c1.abortBroadcast();
_L5:
        return;
_L2:
        if (((Boolean)a.b()).booleanValue() && ((Boolean)b.b()).booleanValue() && c.h())
        {
            com.facebook.orca.push.sms.SmsReceiver.a(context, intent);
            c1.abortBroadcast();
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }
}
