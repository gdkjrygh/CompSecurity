// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.io.File;

public final class eio
{

    final Context a;
    String b;
    File c;
    Uri d;
    int e;

    public eio(Context context)
    {
        b = "GET";
        c = null;
        e = -1;
        p.b(context, "context must be non-null");
        a = context;
    }

    public final eim a()
    {
        boolean flag;
        if (!b.c(d))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "must specify a non-empty Uri");
        return new eim(this);
    }
}
