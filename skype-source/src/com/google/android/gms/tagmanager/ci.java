// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.c;
import com.google.android.gms.analytics.e;
import com.google.android.gms.analytics.g;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ak

public final class ci
{
    static final class a
        implements e
    {

        public final void a()
        {
            ak.b();
        }

        public final void a(int i)
        {
            ak.b("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
        }

        public final void a(String s)
        {
            com.google.android.gms.tagmanager.ak.c(s);
        }

        public final int b()
        {
            switch (com.google.android.gms.tagmanager.ak.c())
            {
            case 6: // '\006'
            default:
                return 3;

            case 5: // '\005'
                return 2;

            case 3: // '\003'
            case 4: // '\004'
                return 1;

            case 2: // '\002'
                return 0;
            }
        }

        public final void b(String s)
        {
            ak.b(s);
        }

        public final void c(String s)
        {
            ak.a(s);
        }

        a()
        {
        }
    }


    private c a;
    private Context b;
    private g c;

    public ci(Context context)
    {
        b = context;
    }

    private void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = com.google.android.gms.analytics.c.a(b);
            a.a(new a());
            c = a.a(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final g a(String s)
    {
        b(s);
        return c;
    }
}
