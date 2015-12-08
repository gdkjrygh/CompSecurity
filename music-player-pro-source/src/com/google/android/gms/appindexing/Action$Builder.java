// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.appindexing:
//            Action, Thing

public static final class ut extends ut
{

    public Action build()
    {
        jx.b(DJ.get("object"), "setObject is required before calling build().");
        jx.b(DJ.get("type"), "setType is required before calling build().");
        Bundle bundle = (Bundle)DJ.getParcelable("object");
        jx.b(bundle.get("name"), "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
        jx.b(bundle.get("url"), "Must call setObject() with a valid app url. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
        return new Action(DJ, null);
    }

    public volatile Thing build()
    {
        return build();
    }

    public build put(String s, Thing thing)
    {
        return (build)super.ut(s, thing);
    }

    public ut put(String s, String s1)
    {
        return (ut)super.ut(s, s1);
    }

    public volatile ut put(String s, Thing thing)
    {
        return put(s, thing);
    }

    public volatile put put(String s, String s1)
    {
        return put(s, s1);
    }

    public put setName(String s)
    {
        return (put)super.ut("name", s);
    }

    public volatile ut setName(String s)
    {
        return setName(s);
    }

    public setName setObject(Thing thing)
    {
        jx.i(thing);
        return (setName)super.ut("object", thing);
    }

    public ut setUrl(Uri uri)
    {
        if (uri != null)
        {
            super.ut("url", uri.toString());
        }
        return this;
    }

    public volatile ut setUrl(Uri uri)
    {
        return setUrl(uri);
    }

    public (String s)
    {
        jx.i(s);
        super.ut("type", s);
    }
}
