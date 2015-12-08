// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import com.b.a.r;

// Referenced classes of package b.a:
//            hr, hi, hm, hn, 
//            hs

public final class hl
    implements hr
{

    private static hl c;
    private hr a;
    private Context b;

    private hl(Context context)
    {
        b = context.getApplicationContext();
        a = new hi(b);
    }

    public static hl a(Context context)
    {
        b/a/hl;
        JVM INSTR monitorenter ;
        if (c != null || context == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        c = new hl(context);
        context = c;
        b/a/hl;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static hr a(hl hl1)
    {
        return hl1.a;
    }

    public final void a(hs hs)
    {
        r.b(new hm(this, hs));
    }

    public final void b()
    {
        r.b(new hn(this));
    }

    public final void b(hs hs)
    {
        a.b(hs);
    }
}
