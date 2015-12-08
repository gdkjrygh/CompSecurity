// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.appindexing:
//            Thing

public static class 
{

    final Bundle DJ = new Bundle();

    public Thing build()
    {
        return new Thing(DJ);
    }

    public DJ put(String s, Thing thing)
    {
        jx.i(s);
        if (thing != null)
        {
            DJ.putParcelable(s, thing.DI);
        }
        return this;
    }

    public DJ put(String s, String s1)
    {
        jx.i(s);
        if (s1 != null)
        {
            DJ.putString(s, s1);
        }
        return this;
    }

    public DJ setDescription(String s)
    {
        put("description", s);
        return this;
    }

    public put setId(String s)
    {
        if (s != null)
        {
            put("id", s);
        }
        return this;
    }

    public put setName(String s)
    {
        jx.i(s);
        put("name", s);
        return this;
    }

    public put setType(String s)
    {
        put("type", s);
        return this;
    }

    public put setUrl(Uri uri)
    {
        jx.i(uri);
        put("url", uri.toString());
        return this;
    }

    public ()
    {
    }
}
