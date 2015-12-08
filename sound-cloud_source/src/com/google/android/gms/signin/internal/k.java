// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.signin.internal:
//            f

final class k
    implements Runnable
{

    final String a;
    final String b;
    final f c;
    final i.a d;

    k(i.a a1, String s, String s1, f f1)
    {
        d = a1;
        a = s;
        b = s1;
        c = f1;
        super();
    }

    public final void run()
    {
        try
        {
            boolean flag = i.a.a(d).onUploadServerAuthCode(a, b);
            c.a(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            return;
        }
    }
}
