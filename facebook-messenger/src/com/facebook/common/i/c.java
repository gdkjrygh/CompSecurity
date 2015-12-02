// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.i;

import android.os.Message;

// Referenced classes of package com.facebook.common.i:
//            b

class c
    implements android.os.Handler.Callback
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public boolean handleMessage(Message message)
    {
        b.a(a);
        return true;
    }
}
