// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.a;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.ap;

// Referenced classes of package com.google.android.gms.a:
//            f, a, e

public final class b extends f
{

    public b(String s)
    {
        ap.a(s);
        super.a("type", s);
    }

    public final a a()
    {
        ap.a(a.get("object"), "setObject is required before calling build().");
        ap.a(a.get("type"), "setType is required before calling build().");
        Bundle bundle = (Bundle)a.getParcelable("object");
        ap.a(bundle.get("name"), "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
        ap.a(bundle.get("url"), "Must call setObject() with a valid app URI. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
        return new a(a, (byte)0);
    }

    public final b a(e e)
    {
        ap.a(e);
        return (b)super.a("object", e);
    }

    public final f a(Uri uri)
    {
        if (uri != null)
        {
            super.a("url", uri.toString());
        }
        return this;
    }

    public final volatile f a(String s)
    {
        return (b)super.a("name", s);
    }

    public final volatile f a(String s, e e)
    {
        return (b)super.a(s, e);
    }

    public final volatile f a(String s, String s1)
    {
        return (b)super.a(s, s1);
    }

    public final e b()
    {
        return a();
    }
}
