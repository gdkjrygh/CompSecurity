// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

final class gbt
{

    final Context a;
    final noz b;
    int c;
    final List d;
    final gca e;
    int f;
    int g;
    private final gbu h;

    public gbt(Context context, int i, hqo hqo)
    {
        this(context, i, olm.c(context, gbq), new gca(context, i, hqo), new gbu());
    }

    private gbt(Context context, int i, List list, gca gca1, gbu gbu1)
    {
        f = 0;
        g = 0;
        a = context;
        c = i;
        d = list;
        e = gca1;
        h = gbu1;
        b = noz.a(context, 3, "MediaSyncCoord", new String[] {
            "sync"
        });
    }
}
