// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.as;
import kik.a.d.aa;
import kik.a.e.v;
import kik.a.f.f.ao;
import kik.a.h.i;

// Referenced classes of package kik.a.g:
//            az

final class bb
    implements as
{

    final String a;
    final byte b[];
    final az c;

    bb(az az1, String s, byte abyte0[])
    {
        c = az1;
        a = s;
        b = abyte0;
        super();
    }

    public final Object a(Object obj)
    {
        obj = ((ao)obj).d();
        obj.a = a;
        c.a(((aa) (obj)));
        obj = b;
        az.b(c).c("CredentialData.email_passkey", i.a(((byte []) (obj))));
        return c.d();
    }
}
