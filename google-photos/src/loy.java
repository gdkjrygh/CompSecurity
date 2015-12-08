// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

final class loy
    implements Runnable
{

    private List a;
    private String b;
    private los c;
    private lox d;

    loy(lox lox1, List list, String s, los los1)
    {
        d = lox1;
        a = list;
        b = s;
        c = los1;
        super();
    }

    public final void run()
    {
        try
        {
            Object obj = lox.a(d);
            Collections.unmodifiableSet(new HashSet(a));
            obj = ((k) (obj)).n();
            obj = new CheckServerAuthResult(((im) (obj)).k(), ((im) (obj)).l());
            c.a(((CheckServerAuthResult) (obj)));
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
        }
    }
}
