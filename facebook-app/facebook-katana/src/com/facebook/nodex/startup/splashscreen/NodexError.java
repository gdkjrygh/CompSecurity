// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            NodexErrorActivity

public class NodexError
{

    private final String a;
    private final String b;
    private final Throwable c;
    private final NodexErrorActivity.Action d;

    private NodexError(String s, String s1, Throwable throwable, NodexErrorActivity.Action action)
    {
        a = s;
        b = s1;
        c = throwable;
        d = action;
    }

    NodexError(String s, String s1, Throwable throwable, NodexErrorActivity.Action action, byte byte0)
    {
        this(s, s1, throwable, action);
    }

    public static Builder b(Context context)
    {
        return new Builder(context);
    }

    public final Intent a(Context context)
    {
        context = new Intent(context, com/facebook/nodex/startup/splashscreen/NodexErrorActivity);
        if (a != null)
        {
            context.putExtra("title", a);
        }
        if (b != null)
        {
            context.putExtra("message", b);
        }
        if (c != null)
        {
            context.putExtra("exception", c);
        }
        if (d != null)
        {
            context.putExtra("action", d.name());
        }
        return context;
    }

    private class Builder
    {

        private Context a;
        private NodexResources b;
        private String c;
        private String d;
        private Throwable e;
        private NodexErrorActivity.Action f;

        private Builder d(String s)
        {
            c = s;
            return this;
        }

        public final Builder a(NodexErrorActivity.Action action)
        {
            f = action;
            return this;
        }

        public final Builder a(String s)
        {
            d(a.getString(b.c(s)));
            return this;
        }

        public final Builder a(Throwable throwable)
        {
            e = throwable;
            return this;
        }

        public final NodexError a()
        {
            return new NodexError(c, d, e, f, (byte)0);
        }

        public final Builder b(String s)
        {
            d = s;
            return this;
        }

        public final Builder c(String s)
        {
            b(a.getString(b.c(s)));
            return this;
        }

        public Builder(Context context)
        {
            a = context;
            b = new NodexResources(context);
        }
    }

}
