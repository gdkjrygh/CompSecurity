// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collection;
import java.util.List;

final class izj
    implements iyl
{

    private final Context a;
    private final hpb b;

    public izj(Context context)
    {
        a = context;
        b = (hpb)olm.a(context, hpb);
    }

    public final elb a(int i, Collection collection)
    {
        List list;
        boolean flag;
        if (!collection.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "cannot restore 0 medias");
        list = b.a(collection);
        if (list.isEmpty())
        {
            return b.a(new eke("Failed to restore medias."));
        } else
        {
            df.a(a, i, list);
            return b.b(collection);
        }
    }
}
