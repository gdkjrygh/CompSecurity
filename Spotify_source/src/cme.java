// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class cme extends cmi
{

    final clz a;
    private final Map b;

    public cme(clz clz1, Map map)
    {
        a = clz1;
        super(clz1, (byte)0);
        b = map;
    }

    public final void a()
    {
        int i = bqi.a(a.c);
        if (i != 0)
        {
            ConnectionResult connectionresult = new ConnectionResult(i, null);
            a.a.a(new cmm(a, connectionresult) {

                private ConnectionResult a;
                private cme b;

                public final void a()
                {
                    b.a.b(a);
                }

            
            {
                b = cme.this;
                a = connectionresult;
                super(cmq);
            }
            });
        } else
        {
            if (a.e)
            {
                a.d.f();
            }
            Iterator iterator = b.keySet().iterator();
            while (iterator.hasNext()) 
            {
                bqr bqr1 = (bqr)iterator.next();
                bqr1.a((bqz)b.get(bqr1));
            }
        }
    }
}
