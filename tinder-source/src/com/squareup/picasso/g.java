// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.squareup.picasso:
//            t, r

class g extends t
{

    final Context a;

    g(Context context)
    {
        a = context;
    }

    public boolean a(r r1)
    {
        return "content".equals(r1.d.getScheme());
    }

    public t.a b(r r1)
        throws IOException
    {
        return new t.a(c(r1), Picasso.LoadedFrom.b);
    }

    final InputStream c(r r1)
        throws FileNotFoundException
    {
        return a.getContentResolver().openInputStream(r1.d);
    }
}
