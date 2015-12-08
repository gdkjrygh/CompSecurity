// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.Callable;

final class exq
    implements Callable
{

    private final Context a;
    private final ekq b;
    private final ekw c;
    private final Map d;

    public exq(Context context, ekq ekq1, ekw ekw, Map map)
    {
        a = context;
        b = ekq1;
        c = ekw;
        d = map;
    }

    static Map a(exq exq1)
    {
        return exq1.d;
    }

    public final Runnable a()
    {
        Object obj = (eyv)((eyw)olm.a(a, eyw)).a(b.a());
        if (obj == null)
        {
            obj = String.valueOf(b);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 37)).append("No DateHeaderProvider registered for ").append(((String) (obj))).toString());
        }
        obj = ((eyv) (obj)).b(b, c, d.keySet());
        try
        {
            obj = new exr(this, (Map)((elb) (obj)).a());
        }
        catch (eke eke1)
        {
            if (Log.isLoggable("DateHeader", 3))
            {
                String s = String.valueOf(b);
                (new StringBuilder(String.valueOf(s).length() + 39)).append("Failed to load headers for collection: ").append(s);
            }
            return gke.b;
        }
        return ((Runnable) (obj));
    }

    public final Object call()
    {
        return a();
    }
}
