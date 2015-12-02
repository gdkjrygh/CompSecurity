// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.os.RemoteException;

// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            f, a

class <init> extends <init>
{

    final f a;
    private final a b;

    public void a(int i, boolean flag, byte abyte0[])
        throws RemoteException
    {
        if (abyte0 == null)
        {
            a.e();
        }
        if (b != null)
        {
            b.a(i, flag, abyte0);
        }
    }

    (f f1, a a1)
    {
        a = f1;
        b = a1;
        super();
    }
}
