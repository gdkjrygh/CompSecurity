// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.Context;
import android.content.Intent;
import com.facebook.base.a.g;
import com.facebook.c.b;
import com.facebook.c.c;

// Referenced classes of package com.facebook.orca.sms:
//            MmsTransactionStateReceiver

public class bl
    implements b
{

    public bl()
    {
    }

    public final void a(Context context, Intent intent, c c)
    {
        g.a(context);
        MmsTransactionStateReceiver.a(context, intent);
    }
}
