// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.RemoteException;

// Referenced classes of package android.support.v4.app:
//            ad, q

private static final class a
    implements a
{

    final String a;
    final int b = 64;
    final String c = null;
    final boolean d = false;

    public final void a(q q1)
        throws RemoteException
    {
        if (d)
        {
            q1.a(a);
            return;
        } else
        {
            q1.a(a, b, c);
            return;
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("CancelTask[");
        stringbuilder.append("packageName:").append(a);
        stringbuilder.append(", id:").append(b);
        stringbuilder.append(", tag:").append(c);
        stringbuilder.append(", all:").append(d);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public (String s)
    {
        a = s;
    }
}
