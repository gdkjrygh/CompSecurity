// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import java.lang.ref.WeakReference;

final class cmb extends bte
{

    private final WeakReference a;

    cmb(clz clz1)
    {
        a = new WeakReference(clz1);
    }

    public final void a(ResolveAccountResponse resolveaccountresponse)
    {
        clz clz1 = (clz)a.get();
        if (clz1 == null)
        {
            return;
        } else
        {
            clz1.a.a(new cmm(clz1, clz1, resolveaccountresponse) {

                private clz a;
                private ResolveAccountResponse b;

                public final void a()
                {
                    clz clz2;
                    ConnectionResult connectionresult;
label0:
                    {
                        clz2 = a;
                        ResolveAccountResponse resolveaccountresponse1 = b;
                        if (clz2.b(0))
                        {
                            connectionresult = resolveaccountresponse1.c;
                            if (!connectionresult.b())
                            {
                                break label0;
                            }
                            clz2.g = bsv.a(resolveaccountresponse1.b);
                            clz2.f = true;
                            clz2.h = resolveaccountresponse1.d;
                            clz2.i = resolveaccountresponse1.e;
                            clz2.f();
                        }
                        return;
                    }
                    if (clz2.a(connectionresult))
                    {
                        clz2.i();
                        clz2.f();
                        return;
                    } else
                    {
                        clz2.b(connectionresult);
                        return;
                    }
                }

            
            {
                a = clz1;
                b = resolveaccountresponse;
                super(cmq);
            }
            });
            return;
        }
    }
}
