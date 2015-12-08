// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.formats.a;
import com.google.android.gms.ads.internal.formats.c;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.b.d;

// Referenced classes of package com.google.android.gms.internal:
//            fh

final class d
    implements d
{

    final String a;
    final Integer b;
    final Integer c;
    final int d;
    final fh e;

    private a a(c c1)
    {
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        String s;
        Drawable drawable;
        Integer integer;
        Integer integer1;
        try
        {
            if (TextUtils.isEmpty(a))
            {
                break MISSING_BLOCK_LABEL_91;
            }
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Could not get attribution icon", c1);
            return null;
        }
        s = a;
        drawable = (Drawable)com.google.android.gms.b.d.a(c1.a());
        integer = b;
        integer1 = c;
        if (d <= 0)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        c1 = Integer.valueOf(d);
_L1:
        c1 = new a(s, drawable, integer, integer1, c1);
        return c1;
        c1 = null;
          goto _L1
        return null;
    }

    public final Object a(Object obj)
    {
        return a((c)obj);
    }

    ormats.a(fh fh1, String s, Integer integer, Integer integer1, int i)
    {
        e = fh1;
        a = s;
        b = integer;
        c = integer1;
        d = i;
        super();
    }
}
