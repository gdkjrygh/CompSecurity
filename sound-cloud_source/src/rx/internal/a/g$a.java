// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.io.Serializable;

// Referenced classes of package rx.internal.a:
//            g

private static class a
    implements Serializable
{

    private final Throwable a;

    static Throwable a(le le)
    {
        return le.a;
    }

    public String toString()
    {
        return (new StringBuilder("Notification=>Error:")).append(a).toString();
    }

    public e(Throwable throwable)
    {
        a = throwable;
    }
}
