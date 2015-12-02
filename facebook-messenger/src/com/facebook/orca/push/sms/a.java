// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push.sms;

import android.content.Context;
import android.content.Intent;
import com.facebook.c.c;
import com.facebook.orca.nux.h;
import java.util.List;

// Referenced classes of package com.facebook.orca.push.sms:
//            SmsReceiver

public class a
    implements com.facebook.sms.a.a
{

    private final javax.inject.a a;
    private final javax.inject.a b;
    private final javax.inject.a c;
    private final h d;

    public a(javax.inject.a a1, javax.inject.a a2, javax.inject.a a3, h h1)
    {
        a = a1;
        b = a2;
        c = a3;
        d = h1;
    }

    public void a(Context context, Intent intent, c c1, List list)
    {
        if (((Boolean)b.b()).booleanValue() && ((Boolean)c.b()).booleanValue() && !((Boolean)a.b()).booleanValue() && d.h())
        {
            SmsReceiver.a(context, intent);
        }
    }
}
