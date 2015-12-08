// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.j;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.slyce.k.i;

// Referenced classes of package com.android.slyce.j:
//            o, a

class c
    implements Runnable
{

    final String a;
    final Bitmap b;
    final o c;
    final a d;

    c(a a1, String s, Bitmap bitmap, o o1)
    {
        d = a1;
        a = s;
        b = bitmap;
        c = o1;
        super();
    }

    public void run()
    {
        if (!TextUtils.isEmpty(a))
        {
            int j = i.a(i.a(b), a);
            c.a(j);
        }
    }
}
