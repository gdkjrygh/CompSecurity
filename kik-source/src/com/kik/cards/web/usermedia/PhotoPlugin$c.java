// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.usermedia;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.kik.cards.web.usermedia:
//            PhotoPlugin

private final class <init>
    implements Callable
{

    final PhotoPlugin a;
    private android.graphics.sFormat b;
    private List c;
    private long d;
    private int e;
    private int f;
    private int g;
    private String h;

    public final Object call()
    {
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (c)iterator.next();
            if (obj != null)
            {
                obj = PhotoPlugin.a(((c) (obj)).a, h, b, g, e, f, ((f) (obj)).b);
                a.a(((org.json.JSONObject) (obj)));
            }
        } while (true);
        return null;
    }

    private (PhotoPlugin photoplugin, List list, android.graphics.sFormat sformat, String s, int i, int j, int k)
    {
        a = photoplugin;
        super();
        c = list;
        d = 0L;
        e = i;
        f = j;
        g = k;
        b = sformat;
        h = s;
    }

    h(PhotoPlugin photoplugin, List list, android.graphics.sFormat sformat, String s, int i, int j, int k, 
            byte byte0)
    {
        this(photoplugin, list, sformat, s, i, j, k);
    }
}
