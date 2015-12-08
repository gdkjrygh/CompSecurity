// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.collect.Maps;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.Subscription;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.show.model.Show;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class eus extends eup
{

    final Map c = Maps.b();
    private final Context d;
    private final Verified e;
    private final Resolver f;
    private final Set g = new HashSet();
    private final epc h = new epc() {

        private eus a;

        public final void a(Throwable throwable)
        {
            Logger.c("Failed to observe the show : %s", new Object[] {
                throwable
            });
        }

        public final void a(Map map)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                if (((Show)entry.getValue()).g())
                {
                    a.b.add(entry.getKey());
                } else
                {
                    a.b.remove(entry.getKey());
                }
                a.c.put(Integer.valueOf(((String)entry.getKey()).hashCode()), Boolean.valueOf(true));
                a.c((String)entry.getKey());
            }
        }

            
            {
                a = eus.this;
                super();
            }
    };

    public eus(Context context, Resolver resolver, Verified verified)
    {
        d = (Context)ctz.a(context);
        e = (Verified)ctz.a(verified);
        f = (Resolver)ctz.a(resolver);
    }

    public final void a()
    {
        super.a();
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((Subscription)iterator.next()).unsubscribe()) { }
    }

    public final void a(String s, euo euo)
    {
        super.a(s, euo);
        int i = s.hashCode();
        if (!c.containsKey(Integer.valueOf(i)))
        {
            c.put(Integer.valueOf(i), Boolean.valueOf(false));
            euo = new fif(d, f, h);
            g.add(euo.a(new String[] {
                s
            }));
        }
    }

    public final void a(String s, boolean flag)
    {
        if (flag)
        {
            CollectionService.a(d, s, e.toString(), null, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.a);
            return;
        } else
        {
            CollectionService.b(d, s, e.toString(), null, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.a);
            return;
        }
    }

    public final boolean a(String s)
    {
        int i = s.hashCode();
        return c.containsKey(Integer.valueOf(i)) && ((Boolean)c.get(Integer.valueOf(i))).booleanValue();
    }

    public final boolean b(String s)
    {
        return true;
    }
}
