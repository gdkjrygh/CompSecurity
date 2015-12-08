// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import android.util.Log;

final class loz
    implements Runnable
{

    private String a;
    private String b;
    private los c;
    private lox d;

    loz(lox lox1, String s, String s1, los los1)
    {
        d = lox1;
        a = s;
        b = s1;
        c = los1;
        super();
    }

    public final void run()
    {
        try
        {
            boolean flag = lox.a(d).o();
            c.a(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
        }
    }
}
