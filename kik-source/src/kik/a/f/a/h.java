// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.a;

import com.kik.m.e;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kik.a.f.n;

// Referenced classes of package kik.a.f.a:
//            g, a, f

final class h extends g
{

    private static String f[] = {
        "cabeiri", "armoire", "enghien", "obeliskoid", "cherubically", "enormity", "laundrywoman", "seward", "backcloth", "nonentreating", 
        "macron", "asteroidean", "nondissolving", "appositely", "transonic", "kozuka", "untranscribed", "unquietable", "unconformed", "organicism"
    };
    private int a;
    private String b;

    public h(String s)
    {
        super(s);
    }

    public final void a()
    {
        if (d)
        {
            throw new a();
        }
        int i = a;
        if (i >= 0 && i < f.length)
        {
            String s = f[i];
            try
            {
                e = e.a(MessageDigest.getInstance("SHA-256").digest((new StringBuilder()).append(b).append(s).toString().getBytes("UTF-8")));
                return;
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception)
            {
                throw new RuntimeException(nosuchalgorithmexception);
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                throw new RuntimeException(unsupportedencodingexception);
            }
        } else
        {
            throw new f();
        }
    }

    protected final void a(n n1)
    {
        int i = Integer.parseInt(n1.getAttributeValue(null, "index"));
        n1 = n1.nextText();
        a = i;
        b = n1;
    }

}
