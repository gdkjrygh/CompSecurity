// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;

// Referenced classes of package rx.internal.a:
//            aH

public final class aG
    implements rx.b.g
{
    private static final class a
    {

        public static final aG a = new aG((byte)0);

    }


    private aG()
    {
    }

    aG(byte byte0)
    {
        this();
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        return new aH(this, ((X) (obj)), ((X) (obj)));
    }

    // Unreferenced inner class rx/internal/a/aG$1

/* anonymous class */
    static final class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[rx.a.a.values().length];
            try
            {
                a[rx.a.a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[rx.a.a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[rx.a.a.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
