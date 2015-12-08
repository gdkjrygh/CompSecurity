// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.v;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.m4b.maps.dd.d;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.m4b.maps.v:
//            i, h, d

static final class b extends b
{

    private final d a;
    private final ExecutorService b;

    static com.google.android.m4b.maps.h.b a(b b1)
    {
        return b1.a.e;
    }

    public final void a(String s, String s1, h h)
    {
        b.submit(new Runnable(s, s1, h) {

            private String a;
            private String b;
            private h c;
            private i.a d;

            public final void run()
            {
                try
                {
                    boolean flag = i.a.a(d).a();
                    c.a(flag);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
                }
            }

            
            {
                d = i.a.this;
                a = s;
                b = s1;
                c = h1;
                super();
            }
        });
    }

    public final void a(String s, List list, h h)
    {
        b.submit(new Runnable(list, s, h) {

            private List a;
            private String b;
            private h c;
            private i.a d;

            public final void run()
            {
                try
                {
                    i.a.a(d);
                    Collections.unmodifiableSet(new HashSet(a));
                    com.google.android.m4b.maps.v.d d1 = new com.google.android.m4b.maps.v.d();
                    c.a(d1);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
                }
            }

            
            {
                d = i.a.this;
                a = list;
                b = s;
                c = h1;
                super();
            }
        });
    }

    public ce(d d1, ExecutorService executorservice)
    {
        a = d1;
        b = executorservice;
    }
}
