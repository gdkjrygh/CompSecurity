// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cs;

import android.util.Base64;
import java.io.IOException;
import p.df.a;
import p.dm.m;
import p.dx.b;

// Referenced classes of package p.cs:
//            b, a

class .String extends Thread
{

    final p.cs.b a;

    public void run()
    {
_L4:
        if (p.cs.b.a(a) == null) goto _L2; else goto _L1
_L1:
        boolean flag = p.cs.b.a(a).a();
        if (!flag) goto _L3; else goto _L2
_L2:
        p.df.a.a("SocketServer", "response thread COMPLETED");
        return;
_L3:
        byte abyte0[] = p.cs.b.a(a).b();
        if (b.c() != null)
        {
            p.df.a.a("SocketServer", (new StringBuilder()).append("responsePayload = ").append(m.d(abyte0)).toString());
            String s = Base64.encodeToString(abyte0, 0);
            p.df.a.a("SocketServer", (new StringBuilder()).append("responsePayloadBase64Encoded = ").append(s).toString());
            b.c().c(s);
        }
          goto _L4
        IOException ioexception;
        ioexception;
        p.df.a.b("SocketServer", "error in reading from pandora ", ioexception);
          goto _L2
    }

    .String(p.cs.b b1, String s)
    {
        a = b1;
        super(s);
    }
}
