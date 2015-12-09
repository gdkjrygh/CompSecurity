// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appboy.ui.d.c;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.appboy.ui.a:
//            d

public final class b
    implements d
{

    private final Intent a;

    public b(Intent intent)
    {
        a = intent;
    }

    public b(String s, Uri uri)
    {
        this(new Intent());
        a.setClassName(s, uri.getHost());
        for (s = c.a(uri).entrySet().iterator(); s.hasNext(); a.putExtra((String)uri.getKey(), (String)uri.getValue()))
        {
            uri = (java.util.Map.Entry)s.next();
        }

    }

    public final void a(Context context)
    {
        if (a.resolveActivity(context.getPackageManager()) != null)
        {
            context.startActivity(a);
        }
    }
}
