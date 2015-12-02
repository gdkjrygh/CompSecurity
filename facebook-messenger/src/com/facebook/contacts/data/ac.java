// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import android.net.Uri;
import com.google.common.a.fi;
import com.google.common.a.fk;
import com.google.common.base.Joiner;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.contacts.data:
//            y, x, ad, ab

public final class ac
    implements y
{

    public final Uri a;
    final x b;

    public ac(x x1)
    {
        b = x1;
        super();
        a = Uri.withAppendedPath(b.b, "search");
    }

    public final Uri a(String s)
    {
        return a(s, x.f);
    }

    public final Uri a(String s, Set set)
    {
        set = Joiner.on(",").join(set);
        return Uri.withAppendedPath(Uri.withAppendedPath(a, Uri.encode(set)), Uri.encode(s));
    }

    public final ab a(Uri uri)
    {
        uri = uri.getPathSegments();
        if (uri.size() != 2 && uri.size() != 3)
        {
            throw new IllegalArgumentException("Invalid uri");
        }
        String as[] = ((String)uri.get(1)).split(",");
        fk fk1 = fi.e();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            fk1.b(ad.valueOf(as[i]));
        }

        if (uri.size() < 3)
        {
            uri = "";
        } else
        {
            uri = (String)uri.get(2);
        }
        return new ab(b, uri, fk1.b());
    }
}
