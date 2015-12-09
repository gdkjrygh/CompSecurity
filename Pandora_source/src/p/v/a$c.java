// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.v;

import android.util.Log;

// Referenced classes of package p.v:
//            a

public static class g.String extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static g.String valueOf(String s)
    {
        return (g.String)Enum.valueOf(p/v/a$c, s);
    }

    public static g.String[] values()
    {
        return ([])d.clone();
    }

    protected void a(Throwable throwable)
    {
    }

    static 
    {
        a = new <init>("IGNORE", 0);
        b = new a.c("LOG", 1) {

            protected void a(Throwable throwable)
            {
                if (Log.isLoggable("PriorityExecutor", 6))
                {
                    Log.e("PriorityExecutor", "Request threw uncaught throwable", throwable);
                }
            }

        };
        c = new a.c("THROW", 2) {

            protected void a(Throwable throwable)
            {
                a(throwable);
                throw new RuntimeException(throwable);
            }

        };
        d = (new d[] {
            a, b, c
        });
    }

    private g.String(String s, int i)
    {
        super(s, i);
    }

    g.String(String s, int i,  )
    {
        this(s, i);
    }
}
