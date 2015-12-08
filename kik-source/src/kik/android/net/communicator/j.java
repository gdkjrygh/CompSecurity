// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.communicator;

import java.io.IOException;
import kik.a.f.g;
import kik.a.f.n;
import org.c.c;
import org.d.a.b;

public abstract class j
    implements Runnable
{
    public static interface a
    {

        public abstract void a();
    }


    private static final org.c.b a = org.c.c.a("InputThreadAbstract");
    private volatile boolean b;
    private n c;
    private a d;
    private volatile boolean e;

    public j()
    {
        e = false;
    }

    protected abstract void a();

    protected abstract void a(n n1);

    final void a(n n1, a a1)
    {
        c = n1;
        d = a1;
    }

    public final void b()
    {
        e = true;
    }

    public final void run()
    {
        if (c.a("k"))
        {
            c.next();
        }
_L5:
        if (e || c.getEventType() == 1 || c.b("stream") || c.b("stream:stream") || c.b("k")) goto _L2; else goto _L1
_L1:
        if (!c.a(null)) goto _L4; else goto _L3
_L3:
        a(c);
        d.a();
          goto _L5
        Object obj;
        obj;
        (new StringBuilder("Net Error--> XmlPullParserException in XmppInputThread: ")).append(((b) (obj)).getMessage());
        b = true;
        if (!e)
        {
            a();
        }
_L7:
        return;
_L4:
        c.next();
          goto _L5
        obj;
        (new StringBuilder("Net Error--> EncryptionException in XmppInputThread: ")).append(((g) (obj)).getMessage());
        b = true;
        if (e) goto _L7; else goto _L6
_L6:
        a();
        return;
_L2:
        b = true;
        if (!e)
        {
            a();
            return;
        }
          goto _L7
        obj;
        (new StringBuilder("Net Error--> IOException in XmppInputThread: ")).append(((IOException) (obj)).getMessage());
        b = true;
        if (e) goto _L7; else goto _L8
_L8:
        a();
        return;
        obj;
        b = true;
        if (!e)
        {
            a();
        }
        throw obj;
          goto _L5
    }

}
