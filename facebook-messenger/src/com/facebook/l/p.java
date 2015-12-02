// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.l;

import com.facebook.user.UserKey;

// Referenced classes of package com.facebook.l:
//            k

class p
    implements Runnable
{

    final UserKey a;
    final int b;
    final k c;

    p(k k1, UserKey userkey, int i)
    {
        c = k1;
        a = userkey;
        b = i;
        super();
    }

    public void run()
    {
        k.a(c, a, b);
    }
}
