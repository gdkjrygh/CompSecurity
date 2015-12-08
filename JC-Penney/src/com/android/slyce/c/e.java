// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.c;

import android.graphics.Bitmap;
import com.android.slyce.k.i;

// Referenced classes of package com.android.slyce.c:
//            a, h

class e
    implements Runnable
{

    final Bitmap a;
    final h b;
    final a c;

    e(a a1, Bitmap bitmap, h h)
    {
        c = a1;
        a = bitmap;
        b = h;
        super();
    }

    public void run()
    {
        Bitmap bitmap = i.a(a);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("http://api.pounce.mobi/v2/").append("app/imageupload.php");
        com.android.slyce.c.a.a(c, stringbuilder.toString(), bitmap, b);
    }
}
