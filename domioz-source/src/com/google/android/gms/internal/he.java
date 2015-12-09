// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.a.a;
import com.google.android.gms.a.d;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.s;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            gu, hd, hf, zzjb

public final class he
    implements d, gu
{

    public he()
    {
    }

    public static Intent a(String s, Uri uri)
    {
        if (!"android-app".equals(uri.getScheme()))
        {
            throw new IllegalArgumentException((new StringBuilder("AppIndex: The URI scheme must be 'android-app' and follow the format (android-app://<package_name>/<scheme>/[host_path]). Provided URI: ")).append(uri).toString());
        }
        String s1 = uri.getHost();
        if (s != null && !s.equals(s1))
        {
            throw new IllegalArgumentException((new StringBuilder("AppIndex: The URI host must match the package name and follow the format (android-app://<package_name>/<scheme>/[host_path]). Provided URI: ")).append(uri).toString());
        }
        s = uri.getPathSegments();
        if (s.isEmpty() || ((String)s.get(0)).isEmpty())
        {
            throw new IllegalArgumentException((new StringBuilder("AppIndex: The app URI scheme must exist and follow the format android-app://<package_name>/<scheme>/[host_path]). Provided URI: ")).append(uri).toString());
        }
        s = uri.getPathSegments();
        s1 = (String)s.get(0);
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme(s1);
        if (s.size() > 1)
        {
            builder.authority((String)s.get(1));
            for (int i = 2; i < s.size(); i++)
            {
                builder.appendPath((String)s.get(i));
            }

        }
        builder.encodedQuery(uri.getEncodedQuery());
        builder.encodedFragment(uri.getEncodedFragment());
        return new Intent("android.intent.action.VIEW", builder.build());
    }

    private s a(l l1, a a1, int i)
    {
        String s = l1.a().getPackageName();
        a1 = com.google.android.gms.internal.hd.a(a1, System.currentTimeMillis(), s, i);
        return l1.a(new hf(this, l1, l1.a().getPackageName(), new zzjb[] {
            a1
        }));
    }

    public final s a(l l1, a a1)
    {
        return a(l1, a1, 0);
    }

    public final s b(l l1, a a1)
    {
        return a(l1, a1, 3);
    }
}
