// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.as;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import kik.a.d.k;
import kik.a.h.h;
import org.spongycastle.jce.interfaces.ECPublicKey;

// Referenced classes of package kik.a.g:
//            v

final class av
    implements as
{

    final v a;

    av(v v)
    {
        a = v;
        super();
    }

    private static ECPublicKey a(k k1)
    {
        k1 = k1.j();
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        k1 = h.a(k1);
        return k1;
        k1;
_L2:
        return null;
        k1;
        continue; /* Loop/switch isn't completed */
        k1;
        continue; /* Loop/switch isn't completed */
        k1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final volatile Object a(Object obj)
    {
        return a((k)obj);
    }
}
