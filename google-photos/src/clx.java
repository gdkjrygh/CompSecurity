// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.util.LruCache;

public class clx
    implements bjp
{

    private final bjp a;
    private LruCache b;

    public clx(bjp bjp1)
    {
        b = new cly(this, 0x1800000);
        a = bjp1;
    }

    public final cwb a(Uri uri)
    {
        cwb cwb2 = (cwb)b.get(uri);
        cwb cwb1 = cwb2;
        if (cwb2 == null)
        {
            cwb cwb3 = a.a(uri);
            cwb1 = cwb3;
            if (cwb3 != null)
            {
                b.put(uri, cwb3);
                cwb1 = cwb3;
            }
        }
        return cwb1;
    }

    public final void a(Uri uri, cwb cwb1)
    {
        a.a(uri, cwb1);
        b.put(uri, cwb1);
    }
}
