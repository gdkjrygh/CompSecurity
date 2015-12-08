// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class jzn extends jzs
{

    final jzf a;
    private final Map b;

    public jzn(jzf jzf1, Map map)
    {
        a = jzf1;
        super(jzf1, (byte)0);
        b = map;
    }

    public final void a()
    {
        int i = jxz.a(a.c);
        if (i != 0)
        {
            ConnectionResult connectionresult = new ConnectionResult(i, null);
            a.a.a(new jzo(this, a, connectionresult));
        } else
        {
            if (a.e)
            {
                a.d.g();
            }
            Iterator iterator = b.keySet().iterator();
            while (iterator.hasNext()) 
            {
                jyl jyl1 = (jyl)iterator.next();
                jyl1.a((jyr)b.get(jyl1));
            }
        }
    }
}
