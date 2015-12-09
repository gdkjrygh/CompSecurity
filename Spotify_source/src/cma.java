// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.lang.ref.WeakReference;

final class cma extends cpw
{

    private final WeakReference a;

    cma(clz clz1)
    {
        a = new WeakReference(clz1);
    }

    public final void a(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
    {
        authaccountresult = (clz)a.get();
        if (authaccountresult == null)
        {
            return;
        } else
        {
            ((clz) (authaccountresult)).a.a(new cmm(authaccountresult, authaccountresult, connectionresult) {

                private clz a;
                private ConnectionResult b;

                public final void a()
                {
                    clz clz1;
                    ConnectionResult connectionresult1;
label0:
                    {
                        clz1 = a;
                        connectionresult1 = b;
                        if (clz1.b(2))
                        {
                            if (!connectionresult1.b())
                            {
                                break label0;
                            }
                            clz1.h();
                        }
                        return;
                    }
                    if (clz1.a(connectionresult1))
                    {
                        clz1.i();
                        clz1.h();
                        return;
                    } else
                    {
                        clz1.b(connectionresult1);
                        return;
                    }
                }

            
            {
                a = clz1;
                b = connectionresult;
                super(cmq);
            }
            });
            return;
        }
    }
}
