// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.HashMap;

final class ggg
    implements nmt
{

    private ggd a;

    ggg(ggf ggf, ggd ggd1)
    {
        a = ggd1;
        super();
    }

    public final void a(Uri uri, long l, long l1)
    {
        ggd ggd1 = a;
        if (ggd1.a.containsKey(uri))
        {
            ((gge)ggd1.a.get(uri)).a();
        }
    }
}
