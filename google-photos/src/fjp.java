// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.util.List;

final class fjp
    implements fkw
{

    private final Context a;
    private final ContentResolver b;
    private final muz c;

    public fjp(Context context)
    {
        this(context, context.getContentResolver());
    }

    private fjp(Context context, ContentResolver contentresolver)
    {
        a = context;
        b = contentresolver;
        c = (muz)olm.a(context, muz);
    }

    public final elb a(int i, ekq ekq, hpk hpk1)
    {
        p.a(ekq instanceof fjs, "Wrong collection type for ExternalFindMediaAction");
        p.a(hpk1.e(), "LocalFindMediaAction requires a resolvedMedia with a localContentUri");
        ekq = Uri.parse(hpk1.a);
        ekq = new fjs(i, new fjz(ekq, ejv.d(oql.b(b, ekq)), c.a()));
        ekq = b.a(a, ekq).a(ekq, ekw.a, ekk.a);
        try
        {
            ekq = (List)ekq.a();
            if (ekq.isEmpty())
            {
                throw new eke("Could not find specified media");
            }
        }
        // Misplaced declaration of an exception variable
        catch (ekq ekq)
        {
            return b.a(ekq);
        }
        ekq = b.b(ekq.get(0));
        return ekq;
    }
}
