// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.at;
import com.android.slyce.a.r;

// Referenced classes of package com.android.slyce.a.c:
//            bb

class ba extends at
{

    private ba()
    {
    }

    public static ba a(r r1, Exception exception)
    {
        ba ba1 = new ba();
        r1.a(new bb(ba1, exception));
        return ba1;
    }

    static void a(ba ba1, Exception exception)
    {
        ba1.a(exception);
    }
}
