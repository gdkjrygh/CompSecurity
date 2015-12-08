// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.io.Serializable;

// Referenced classes of package rx.internal.operators:
//            NotificationLite

private static class e
    implements Serializable
{

    private static final long serialVersionUID = 3L;
    private final Throwable e;

    public String toString()
    {
        return (new StringBuilder()).append("Notification=>Error:").append(e).toString();
    }


    public (Throwable throwable)
    {
        e = throwable;
    }
}
