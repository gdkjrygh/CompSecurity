// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.RemoteException;

// Referenced classes of package android.support.v4.app:
//            y, i

private static class c
    implements c
{

    final String a;
    final int b;
    final String c;
    final boolean d = false;

    public void a(i j)
        throws RemoteException
    {
        if (d)
        {
            j.a(a);
            return;
        } else
        {
            j.a(a, b, c);
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("CancelTask[");
        stringbuilder.append("packageName:").append(a);
        stringbuilder.append(", id:").append(b);
        stringbuilder.append(", tag:").append(c);
        stringbuilder.append(", all:").append(d);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public (String s, int j, String s1)
    {
        a = s;
        b = j;
        c = s1;
    }
}
