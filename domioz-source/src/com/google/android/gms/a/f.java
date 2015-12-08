// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.a;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.ap;

// Referenced classes of package com.google.android.gms.a:
//            e

public class f
{

    final Bundle a = new Bundle();

    public f()
    {
    }

    public f a(Uri uri)
    {
        ap.a(uri);
        a("url", uri.toString());
        return this;
    }

    public f a(String s)
    {
        ap.a(s);
        a("name", s);
        return this;
    }

    public f a(String s, e e1)
    {
        ap.a(s);
        if (e1 != null)
        {
            a.putParcelable(s, e1.a);
        }
        return this;
    }

    public f a(String s, String s1)
    {
        ap.a(s);
        if (s1 != null)
        {
            a.putString(s, s1);
        }
        return this;
    }

    public e b()
    {
        return new e(a);
    }
}
