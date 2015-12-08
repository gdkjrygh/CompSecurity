// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.RemoteException;

// Referenced classes of package android.support.v4.app:
//            ah, s

private static final class d
    implements d
{

    final String a;
    final int b;
    final String c;
    final Notification d;

    public final void a(s s1)
        throws RemoteException
    {
        s1.a(a, b, c, d);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("NotifyTask[");
        stringbuilder.append("packageName:").append(a);
        stringbuilder.append(", id:").append(b);
        stringbuilder.append(", tag:").append(c);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public (String s1, int i, String s2, Notification notification)
    {
        a = s1;
        b = i;
        c = s2;
        d = notification;
    }
}
