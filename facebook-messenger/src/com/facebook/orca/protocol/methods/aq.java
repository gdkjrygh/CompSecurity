// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import android.content.Context;
import android.content.Intent;
import com.facebook.c.b;
import com.facebook.c.c;
import com.facebook.common.w.n;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            ap

class aq
    implements b
{

    final ap a;

    aq(ap ap1)
    {
        a = ap1;
        super();
    }

    public void a(Context context, Intent intent, c c)
    {
        context = intent.getStringExtra("topic_name");
        intent = intent.getByteArrayExtra("payload");
        a.a(context, n.a(intent));
    }
}
