// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.internal.zzr;
import java.io.InputStream;
import java.util.Map;

public final class cjx
{

    static cls a;
    private static final Object b = new Object();

    public cjx(Context context)
    {
        a = a(context);
    }

    private static cls a(Context context)
    {
        synchronized (b)
        {
            if (a == null)
            {
                a = byr.a(context.getApplicationContext());
            }
            context = a;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static 
    {
        new cjy() {

            public final Object a()
            {
                return null;
            }

            public final Object a(InputStream inputstream)
            {
                return null;
            }

        };
    }

    // Unreferenced inner class cjx$2

/* anonymous class */
    final class _cls2
        implements cnc
    {

        private String a;
        private cka b;

        public final void a(zzr zzr1)
        {
            bka.e((new StringBuilder("Failed to load URL: ")).append(a).append("\n").append(zzr1.toString()).toString());
            b.a(null);
        }

            
            {
                a = s;
                b = cka1;
                super();
            }
    }


    // Unreferenced inner class cjx$3

/* anonymous class */
    final class _cls3 extends byq
    {

        private Map j;

        public final Map a()
        {
            if (j == null)
            {
                return super.a();
            } else
            {
                return j;
            }
        }

            
            {
                j = map;
                super(s, cnd, cnc, (byte)0);
            }
    }

}
