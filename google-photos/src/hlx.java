// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.List;

public final class hlx extends mtf
{

    private final int a;
    private final ekq b;
    private final List c;

    public hlx(int i, ekq ekq1, List list)
    {
        super("ReorderColPhotosTask");
        a = i;
        b = ekq1;
        c = list;
    }

    private String f()
    {
        return ((hpe)b.a(hpe)).a.a;
    }

    private String[] g(Context context)
    {
        String as[] = new String[c.size()];
        int i = 0;
        while (i < as.length) 
        {
            Object obj = (hlr)c.get(i);
            if (((hlr) (obj)).a != null)
            {
                obj = ((hlr) (obj)).a.a();
            } else
            {
                try
                {
                    obj = b.a(((hlr) (obj)).b, b, context);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return null;
                }
            }
            p.b(obj, "Media key from mediaOrEnrichment must not be null.");
            as[i] = ((String) (obj));
            i++;
        }
        return as;
    }

    protected final mue a(Context context)
    {
        String as[] = g(context);
        if (as == null)
        {
            return new mue(false);
        }
        hkr hkr1 = new hkr(context.getApplicationContext(), a, f(), as);
        hkr1.d();
        if (!hkr1.a)
        {
            if (Log.isLoggable("ReorderColPhotosTask", 6))
            {
                context = String.valueOf("onBackgroundTaskFinished {tag: ReorderColPhotosTask, Error: ");
                String s = String.valueOf(((nxx) (hkr1)).m);
                if (s.length() != 0)
                {
                    context = context.concat(s);
                } else
                {
                    context = new String(context);
                }
                Log.e("ReorderColPhotosTask", context, ((nxx) (hkr1)).n);
            }
            return new mue(((nxx) (hkr1)).l, ((nxx) (hkr1)).n, null);
        } else
        {
            hgg hgg1 = new hgg();
            hgg1.b = context;
            hgg1.a = a;
            hgg1.c = f();
            mtj.b(context, hgg1.a());
            return new mue(true);
        }
    }
}
