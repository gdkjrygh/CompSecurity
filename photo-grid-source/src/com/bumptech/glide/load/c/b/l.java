// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c.b;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.a.c;
import com.bumptech.glide.load.a.j;
import com.bumptech.glide.load.a.k;
import com.bumptech.glide.load.c.s;
import com.bumptech.glide.load.c.x;

// Referenced classes of package com.bumptech.glide.load.c.b:
//            g

public final class l extends x
    implements g
{

    public l(Context context, s s)
    {
        super(context, s);
    }

    protected final c a(Context context, Uri uri)
    {
        return new k(context, uri);
    }

    protected final c a(Context context, String s)
    {
        return new j(context.getApplicationContext().getAssets(), s);
    }
}
