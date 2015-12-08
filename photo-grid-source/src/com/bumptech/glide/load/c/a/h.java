// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c.a;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.a.c;
import com.bumptech.glide.load.a.d;
import com.bumptech.glide.load.a.e;
import com.bumptech.glide.load.c.s;
import com.bumptech.glide.load.c.x;

// Referenced classes of package com.bumptech.glide.load.c.a:
//            c

public final class h extends x
    implements com.bumptech.glide.load.c.a.c
{

    public h(Context context, s s)
    {
        super(context, s);
    }

    protected final c a(Context context, Uri uri)
    {
        return new e(context, uri);
    }

    protected final c a(Context context, String s)
    {
        return new d(context.getApplicationContext().getAssets(), s);
    }
}
