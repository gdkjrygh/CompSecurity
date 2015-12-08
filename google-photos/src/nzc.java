// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.nio.ByteBuffer;

public class nzc extends nyu
{

    private static final onh a = new onh("plusiproto.crash");
    private final qqb b;

    public nzc(Context context, nyg nyg1, String s1, qlw qlw, qlw qlw1)
    {
        Object obj = (nwy)olm.b(context, nwy);
        if (obj != null)
        {
            obj = ((nwy) (obj)).a();
        } else
        {
            obj = null;
        }
        this(context, nyg1, s1, qlw, qlw1, ((qqb) (obj)));
    }

    private nzc(Context context, nyg nyg1, String s1, qlw qlw, qlw qlw1, qqb qqb)
    {
        super(context, nyg1, s1, qlw, qlw1, "plusi", "oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
        b = qqb;
    }

    public void a(ByteBuffer bytebuffer, String s1)
    {
        Exception exception = super.n;
        if (exception != null && !(exception instanceof nxu))
        {
            b(bytebuffer, null);
            if (exception instanceof IOException)
            {
                throw (IOException)exception;
            }
            o();
        }
        if (s1 != null && !"application/x-protobuf".equals(s1)) goto _L2; else goto _L1
_L1:
        Object obj = new nyz(b.j(bytebuffer));
        if (TextUtils.isEmpty(((nyz) (obj)).a())) goto _L2; else goto _L3
_L3:
        nzb nzb1 = new nzb(((nyz) (obj)), h.a);
        try
        {
            if (nzb.a(nzb1, "APP_UPGRADE_REQUIRED"))
            {
                olm.b(g, nxr);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1 = nzb1;
            continue; /* Loop/switch isn't completed */
        }
        s1 = nzb1;
        if (!c(nzb1))
        {
            break MISSING_BLOCK_LABEL_265;
        }
        s1 = new StringBuilder();
        s1.append("Apiary error response: ").append(f()).append('\n');
        s1.append("   domain: ").append(((nyz) (obj)).b()).append('\n');
        s1.append("   reason: ").append(((nyz) (obj)).a()).append('\n');
        s1.append("   message: ").append(((nyz) (obj)).c()).append('\n');
        obj = ((nyz) (obj)).d();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        obj = ((String) (obj)).replace("\\n", "\n").replace("\\t", "\t");
        s1.append("   debugInfo: \n");
        s1.append(((String) (obj)));
        b.a(6, "HttpOperation", s1.toString());
        s1 = nzb1;
_L5:
        if (s1 != null)
        {
            b(bytebuffer, s1.toString());
            throw s1;
        } else
        {
            b(bytebuffer, null);
            return;
        }
        s1;
        s1 = null;
        continue; /* Loop/switch isn't completed */
_L2:
        s1 = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final boolean a(Exception exception)
    {
        if (nzb.a(exception, "INVALID_CREDENTIALS"))
        {
            return true;
        } else
        {
            return super.a(exception);
        }
    }

    protected final qlw b(ByteBuffer bytebuffer)
    {
        bytebuffer = super.b(bytebuffer);
        nzd.a(g, bytebuffer);
        long l = nzd.a(bytebuffer);
        a(s(), l);
        return bytebuffer;
    }

    protected final void c(qlw qlw)
    {
        Context context;
        String s1;
        byte byte0;
        boolean flag;
        if (h.d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = g;
        s1 = h.b;
        if (h.e)
        {
            byte0 = 50;
        } else
        {
            byte0 = 100;
        }
        nzd.a(context, qlw, s1, flag, byte0, b);
    }

    public final boolean c(Exception exception)
    {
        return !nzb.a(exception, "OUT_OF_BOX_REQUIRED");
    }

    public final String s()
    {
        String s2 = super.s();
        String s1 = s2;
        if (h.e)
        {
            s1 = nza.a(s2);
        }
        return s1;
    }

}
