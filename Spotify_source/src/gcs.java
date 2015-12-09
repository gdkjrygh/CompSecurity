// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class gcs
{

    public Runnable a;
    private String b;
    private gro c;

    public gcs()
    {
        b = "https://crashdump.spotify.com:443";
        c = new gro();
    }

    public final void a(Map map)
    {
        grf grf1 = new grf();
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (entry.getKey() != null && entry.getValue() != null)
            {
                grf1.a((String)entry.getKey(), (String)entry.getValue());
            }
        } while (true);
        map = (new grr()).a(b).a(grf1.a()).b();
        c.a(map).a(new gqv() {

            private gcs a;

            public final void a(grq grq, IOException ioexception)
            {
                Logger.b("Couldn't send SoftCrash to crashdump.", new Object[0]);
                if (a.a != null)
                {
                    a.a.run();
                }
            }

            public final void a(grt grt)
            {
                if (a.a != null)
                {
                    a.a.run();
                }
            }

            
            {
                a = gcs.this;
                super();
            }
        });
    }
}
