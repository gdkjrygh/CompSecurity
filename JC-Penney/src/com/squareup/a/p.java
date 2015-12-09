// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

// Referenced classes of package com.squareup.a:
//            bb, bc, aq, ax

class p extends bb
{

    final Context a;

    p(Context context)
    {
        a = context;
    }

    public bc a(ax ax1, int i)
    {
        return new bc(b(ax1), aq.b);
    }

    public boolean a(ax ax1)
    {
        return "content".equals(ax1.d.getScheme());
    }

    InputStream b(ax ax1)
    {
        return a.getContentResolver().openInputStream(ax1.d);
    }
}
