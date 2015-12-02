// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import android.content.Context;
import com.facebook.nodex.resources.NodexResources;

// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            NodexError

public class b
{

    private Context a;
    private NodexResources b;
    private String c;
    private String d;
    private Throwable e;
    private Action f;

    private b d(String s)
    {
        c = s;
        return this;
    }

    public final Action a(Action action)
    {
        f = action;
        return this;
    }

    public final f a(String s)
    {
        d(a.getString(b.c(s)));
        return this;
    }

    public final b a(Throwable throwable)
    {
        e = throwable;
        return this;
    }

    public final NodexError a()
    {
        return new NodexError(c, d, e, f, (byte)0);
    }

    public final Action b(String s)
    {
        d = s;
        return this;
    }

    public final d c(String s)
    {
        b(a.getString(b.c(s)));
        return this;
    }

    public Action(Context context)
    {
        a = context;
        b = new NodexResources(context);
    }
}
