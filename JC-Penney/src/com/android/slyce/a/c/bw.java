// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import android.text.TextUtils;
import android.util.Base64;
import com.android.slyce.a.a.a;
import com.android.slyce.a.a.e;
import com.android.slyce.a.a.h;
import com.android.slyce.a.ag;
import com.android.slyce.a.ah;
import com.android.slyce.a.aj;
import com.android.slyce.a.bp;
import com.android.slyce.a.r;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.security.MessageDigest;
import java.util.LinkedList;
import java.util.UUID;

// Referenced classes of package com.android.slyce.a.c:
//            bs, w, av, u, 
//            bx, bc, bu, bt

public class bw
    implements bs
{

    ah a;
    bc b;
    a c;
    private LinkedList d;
    private ag e;
    private bu f;
    private e g;
    private bt h;

    public bw(ag ag1)
    {
        e = ag1;
        a = new ah(e);
    }

    public static bs a(av av1, w w1)
    {
        if (w1 != null && w1.m() == 101 && "websocket".equalsIgnoreCase(w1.b_().a("Upgrade")))
        {
            String s = w1.b_().a("Sec-WebSocket-Accept");
            if (s != null)
            {
                String s1 = av1.a("Sec-WebSocket-Key");
                if (s1 != null && s.equalsIgnoreCase(b((new StringBuilder()).append(s1).append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11").toString()).trim()))
                {
                    av1 = av1.a("Sec-WebSocket-Extensions");
                    boolean flag1 = false;
                    boolean flag = flag1;
                    if (av1 != null)
                    {
                        flag = flag1;
                        if (av1.equals("x-webkit-deflate-frame"))
                        {
                            flag = true;
                        }
                    }
                    av1 = new bw(w1.c());
                    av1.a(true, flag);
                    return av1;
                }
            }
        }
        return null;
    }

    static bu a(bw bw1)
    {
        return bw1.f;
    }

    static void a(bw bw1, aj aj1)
    {
        bw1.b(aj1);
    }

    public static void a(u u1, String s)
    {
        av av1 = u1.e();
        String s1 = Base64.encodeToString(a(UUID.randomUUID()), 2);
        av1.a("Sec-WebSocket-Version", "13");
        av1.a("Sec-WebSocket-Key", s1);
        av1.a("Sec-WebSocket-Extensions", "x-webkit-deflate-frame");
        av1.a("Connection", "Upgrade");
        av1.a("Upgrade", "websocket");
        if (s != null)
        {
            av1.a("Sec-WebSocket-Protocol", s);
        }
        av1.a("Pragma", "no-cache");
        av1.a("Cache-Control", "no-cache");
        if (TextUtils.isEmpty(u1.e().a("User-Agent")))
        {
            u1.e().a("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/27.0.1453.15 Safari/537.36");
        }
    }

    private void a(boolean flag, boolean flag1)
    {
        b = new bx(this, e);
        b.a(flag);
        b.b(flag1);
        if (e.k())
        {
            e.j();
        }
    }

    private static byte[] a(UUID uuid)
    {
        byte abyte0[] = new byte[16];
        ByteBuffer.wrap(abyte0).asLongBuffer().put(new long[] {
            uuid.getMostSignificantBits(), uuid.getLeastSignificantBits()
        });
        return abyte0;
    }

    static ag b(bw bw1)
    {
        return bw1.e;
    }

    private static String b(String s)
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
            messagedigest.update(s.getBytes("iso-8859-1"), 0, s.length());
            s = Base64.encodeToString(messagedigest.digest(), 2);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private void b(aj aj1)
    {
        if (d == null)
        {
            bp.a(this, aj1);
            if (aj1.d() > 0)
            {
                d = new LinkedList();
                d.add(aj1);
            }
        } else
        {
            do
            {
                if (k())
                {
                    break;
                }
                aj1 = (aj)d.remove();
                bp.a(this, aj1);
                if (aj1.d() > 0)
                {
                    d.add(0, aj1);
                }
            } while (true);
            if (d.size() == 0)
            {
                d = null;
                return;
            }
        }
    }

    static bt c(bw bw1)
    {
        return bw1.h;
    }

    public void a()
    {
        e.a();
    }

    public void a(a a1)
    {
        e.a(a1);
    }

    public void a(e e1)
    {
        g = e1;
    }

    public void a(h h1)
    {
        a.a(h1);
    }

    public void a(aj aj1)
    {
        a(aj1.a());
    }

    public void a(bu bu)
    {
        f = bu;
    }

    public void a(String s)
    {
        a.a(new aj(b.a(s)));
    }

    public void a(byte abyte0[])
    {
        a.a(new aj(b.a(abyte0)));
    }

    public void b(a a1)
    {
        c = a1;
    }

    public void d()
    {
        e.d();
    }

    public e f()
    {
        return g;
    }

    public h g()
    {
        return a.g();
    }

    public a h()
    {
        return c;
    }

    public boolean i()
    {
        return e.i();
    }

    public void j()
    {
        e.j();
    }

    public boolean k()
    {
        return e.k();
    }

    public r l()
    {
        return e.l();
    }
}
