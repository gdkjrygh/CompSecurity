// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import com.kik.m.e;
import java.io.IOException;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            y

public final class j extends y
{

    private String a;
    private String b;

    private j(String s, String s1)
    {
        super(null, s1);
        a = s;
    }

    public static j a(String s)
    {
        return new j(s, "get");
    }

    protected final void a(n n1)
    {
        n1.a(null, "query");
        n1.b("xmlns", "kik:groups:admin");
        while (!n1.b("query")) 
        {
            if (n1.a("invite-code"))
            {
                try
                {
                    b = n1.nextText();
                }
                catch (Exception exception) { }
            }
            n1.next();
        }
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:groups:admin");
        o1.a("g");
        o1.a("action", "invite-code");
        if (a != null)
        {
            o1.a("jid", a);
        }
        o1.b("g");
        o1.b("query");
    }

    public final byte[] d()
    {
        byte abyte0[];
        try
        {
            abyte0 = e.a(b, 16);
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return abyte0;
    }
}
