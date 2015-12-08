// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.graphics.BitmapFactory;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.microsoft.advertising.android:
//            o

public final class z
{

    private String a;
    private List b;

    public z()
    {
        a = null;
        b = new ArrayList();
    }

    public final void a(String s)
    {
        a = s;
    }

    final void a(String s, byte abyte0[])
    {
        if (abyte0 == null)
        {
            b.add(new o(s, null, null, o.a.b));
            return;
        } else
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
            b.add(new o(s, options.outMimeType, abyte0, o.a.b));
            return;
        }
    }

    final void b(String s)
    {
        b.add(new o(s, null, null, o.a.a));
    }
}
