// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import java.util.Locale;
import java.util.regex.Pattern;

// Referenced classes of package com.tealium.library:
//            B, G

public abstract class RemoteCommand
{

    private final String a;
    private final String b;

    public RemoteCommand(String s, String s1)
    {
        if (s == null || !a(s))
        {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Remote Command with name \"%s\" is not valid.", new Object[] {
                s
            }));
        }
        a = s.toLowerCase(Locale.ROOT);
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        b = s;
    }

    static boolean a(String s)
    {
        if (s == null || s.length() == 0)
        {
            return false;
        } else
        {
            return Pattern.matches("^[\\w-]*$", s);
        }
    }

    final String a()
    {
        return a;
    }

    final void a(B b1)
    {
        if (b1 == null)
        {
            throw new IllegalArgumentException("request must not be null.");
        }
        try
        {
            onInvoke(b1.b());
            return;
        }
        catch (Throwable throwable)
        {
            b1.b().setStatus(555).setBody(G.a(throwable)).send();
        }
    }

    final String b()
    {
        return b;
    }

    protected abstract void onInvoke(Response response);

    private class Response
    {

        private final String a;
        private final String b;
        private final JSONObject c;
        private int d;
        private String e;
        private boolean f;

        public final String getBody()
        {
            return e;
        }

        public final String getCommandId()
        {
            return a;
        }

        public final String getId()
        {
            return b;
        }

        public final JSONObject getRequestPayload()
        {
            return c;
        }

        public final int getStatus()
        {
            return d;
        }

        public final boolean isSent()
        {
            return f;
        }

        public void send()
        {
            if (f)
            {
                throw com.tealium.library.c.a.a("send()");
            } else
            {
                f = true;
                return;
            }
        }

        public final Response setBody(String s)
        {
            if (f)
            {
                throw com.tealium.library.c.a.a("setBody(String)");
            } else
            {
                e = s;
                return this;
            }
        }

        public final Response setStatus(int i)
        {
            if (f)
            {
                throw com.tealium.library.c.a.a("setStatus(int)");
            } else
            {
                d = i;
                return this;
            }
        }

        public Response(String s, String s1, JSONObject jsonobject)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("commandId must not be null.");
            }
            a = s;
            b = s1;
            s = jsonobject;
            if (jsonobject == null)
            {
                s = new JSONObject();
            }
            c = s;
            d = 200;
            e = null;
            f = false;
        }
    }

}
