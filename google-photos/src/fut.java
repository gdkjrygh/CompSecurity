// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;

final class fut
    implements fkw
{

    private final Context a;
    private final fvg b;

    public fut(Context context)
    {
        a = context;
        b = (fvg)olm.a(context, fvg);
    }

    public final elb a(int i, ekq ekq, hpk hpk1)
    {
        p.a(ekq instanceof fux, "Wrong collection type for LocalFindMediaAction");
        p.a(hpk1.e(), "LocalFindMediaAction requires a resolvedMedia with a localContentUri");
        hpk1 = hpk1.a;
        if (!oql.b(Uri.parse(hpk1)))
        {
            ekq = String.valueOf(hpk1);
            if (ekq.length() != 0)
            {
                ekq = "Expected a MediaStore Uri, but found: ".concat(ekq);
            } else
            {
                ekq = new String("Expected a MediaStore Uri, but found: ");
            }
            return b.a(new eke(ekq));
        }
        long l = ContentUris.parseId(Uri.parse(hpk1));
        if (l == -1L)
        {
            ekq = String.valueOf(hpk1);
            if (ekq.length() != 0)
            {
                ekq = "Could not parse mediaId from localUri: ".concat(ekq);
            } else
            {
                ekq = new String("Could not parse mediaId from localUri: ");
            }
            return b.a(new eke(ekq));
        }
        ekq = (fux)ekq;
        fvp fvp1 = new fvp(a, ekq, ekk.a);
        ekq = (ekp)b.b.a(l, fvp1, ekq.b());
        if (ekq == null)
        {
            ekq = String.valueOf(hpk1);
            if (ekq.length() != 0)
            {
                ekq = "Local media not found with localUri: ".concat(ekq);
            } else
            {
                ekq = new String("Local media not found with localUri: ");
            }
            return b.a(new eke(ekq));
        } else
        {
            return b.b(ekq);
        }
    }
}
