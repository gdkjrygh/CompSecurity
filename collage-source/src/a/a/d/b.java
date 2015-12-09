// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.d;

import a.a.b.d;
import a.a.c.a;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package a.a.d:
//            c, d

public class b extends c
{

    public b()
    {
    }

    public String a()
    {
        return "HMAC-SHA1";
    }

    public String a(a.a.c.b b1, a a1)
        throws d
    {
        try
        {
            SecretKeySpec secretkeyspec = new SecretKeySpec((new StringBuilder()).append(a.a.b.a(b())).append('&').append(a.a.b.a(c())).toString().getBytes("UTF-8"), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretkeyspec);
            b1 = (new a.a.d.d(b1, a1)).a();
            a.a.b.a("SBS", b1);
            b1 = a(mac.doFinal(b1.getBytes("UTF-8"))).trim();
        }
        // Misplaced declaration of an exception variable
        catch (a.a.c.b b1)
        {
            throw new d(b1);
        }
        // Misplaced declaration of an exception variable
        catch (a.a.c.b b1)
        {
            throw new d(b1);
        }
        return b1;
    }
}
