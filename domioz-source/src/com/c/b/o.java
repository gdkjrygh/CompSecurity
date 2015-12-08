// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

// Referenced classes of package com.c.b:
//            az, aw, ba, ap

class o extends az
{

    final Context a;

    o(Context context)
    {
        a = context;
    }

    public boolean a(aw aw1)
    {
        return "content".equals(aw1.d.getScheme());
    }

    public ba b(aw aw1)
    {
        return new ba(c(aw1), ap.b);
    }

    final InputStream c(aw aw1)
    {
        return a.getContentResolver().openInputStream(aw1.d);
    }
}
