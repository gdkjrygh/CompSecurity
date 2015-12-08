// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.a;

import com.kik.g.p;
import org.json.JSONObject;

// Referenced classes of package kik.android.gifs.a:
//            n, g

final class h
    implements com.android.volley.r.b
{

    final p a;
    final g b;

    h(g g, p p1)
    {
        b = g;
        a = p1;
        super();
    }

    public final void a(Object obj)
    {
        obj = n.a((JSONObject)obj);
        if (obj == null)
        {
            a.a(new Throwable("Null response"));
        }
        a.a(obj);
    }
}
