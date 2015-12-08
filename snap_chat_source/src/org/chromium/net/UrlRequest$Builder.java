// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

// Referenced classes of package org.chromium.net:
//            UrlRequest, CronetEngine, UploadDataProvider, UrlRequestListener

public static final class e
{

    public String a;
    public final ArrayList b = new ArrayList();
    public UploadDataProvider c;
    public Executor d;
    private CronetEngine e;
    private String f;
    private UrlRequestListener g;
    private Executor h;
    private int i;

    public final UrlRequest a()
    {
        UrlRequest urlrequest = e.a(f, g, h, i);
        if (a != null)
        {
            urlrequest.a(a);
        }
        Pair pair;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); urlrequest.a((String)pair.first, (String)pair.second))
        {
            pair = (Pair)iterator.next();
        }

        if (c != null)
        {
            urlrequest.a(c, d);
        }
        return urlrequest;
    }

    public (String s, UrlRequestListener urlrequestlistener, Executor executor, CronetEngine cronetengine)
    {
        i = 3;
        if (s == null)
        {
            throw new NullPointerException("URL is required.");
        }
        if (executor == null)
        {
            throw new NullPointerException("Executor is required.");
        }
        if (cronetengine == null)
        {
            throw new NullPointerException("CronetEngine is required.");
        } else
        {
            f = s;
            g = urlrequestlistener;
            h = executor;
            e = cronetengine;
            return;
        }
    }
}
