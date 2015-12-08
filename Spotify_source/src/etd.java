// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.spotlets.connect.Tech;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class etd
    implements dwk
{

    final List a = Collections.synchronizedList(new ArrayList());
    dwh b;
    boolean c;
    ete d;
    dkz e;

    public etd(dwh dwh1)
    {
        e = new dkz() {

            final etd a;

            public final void a()
            {
                a.d.a();
            }

            public final void a(List list, com.spotify.mobile.android.connect.ConnectManager.ConnectState connectstate)
            {
                a.a.add(new etf(this, connectstate, list) {

                    private com.spotify.mobile.android.connect.ConnectManager.ConnectState a;
                    private List b;
                    private _cls1 c;

                    public final void a()
                    {
                        c.a.d.a(a, ((ConnectManager)c.a.b.f()).d(), ((ConnectManager)c.a.b.f()).e(), Tech.a(b));
                    }

            
            {
                c = _pcls1;
                a = connectstate;
                b = list;
                super();
            }
                });
                if (a.b.c())
                {
                    a.c();
                }
            }

            
            {
                a = etd.this;
                super();
            }
        };
        b = (dwh)ctz.a(dwh1);
    }

    public final void a()
    {
        if (b.c())
        {
            ((ConnectManager)b.f()).c(e);
        }
    }

    public final void a(Object obj)
    {
        ((ConnectManager)b.f()).a(e);
        if (!c)
        {
            c = true;
            ((ConnectManager)b.f()).g();
        }
        c();
    }

    public final void b()
    {
    }

    final void c()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((etf)iterator.next()).a()) { }
        a.clear();
    }
}
