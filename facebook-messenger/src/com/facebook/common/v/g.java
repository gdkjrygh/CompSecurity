// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.v;

import android.os.Message;

// Referenced classes of package com.facebook.common.v:
//            f

class g
    implements android.os.Handler.Callback
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public boolean handleMessage(Message message)
    {
        f.a(a);
        return true;
    }
}
