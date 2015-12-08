// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.ui.contextmenu.ItemLoadException;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class fxk extends fui
{

    private final Context d;
    private final String e;
    private final fxu f;

    public fxk(Context context, String s, fxu fxu1)
    {
        d = context;
        e = s;
        f = fxu1;
    }

    private fxr b()
    {
        Object obj;
        HashMap hashmap;
        Object obj2;
        obj2 = new Semaphore(0);
        hashmap = new HashMap();
        obj = Cosmos.getResolver(d);
        (new fie(d, ((Resolver) (obj)), new epc(hashmap, ((Semaphore) (obj2))) {

            private Map a;
            private Semaphore b;

            public final void a(Throwable throwable)
            {
                b.release();
            }

            public final void a(Map map)
            {
                a.putAll(map);
                b.release();
            }

            
            {
                a = map;
                b = semaphore;
                super();
            }
        })).b(new String[] {
            e
        });
        if (!((Semaphore) (obj2)).tryAcquire(10L, TimeUnit.SECONDS))
        {
            obj2 = e;
        }
        ((Resolver) (obj)).destroy();
        obj = (fio)hashmap.get(e);
        Object obj1;
        if (obj == null)
        {
            throw new ItemLoadException();
        } else
        {
            return fxr.a(e, ((fio) (obj)).a(), obj);
        }
        obj1;
        throw new ItemLoadException();
        obj1;
        ((Resolver) (obj)).destroy();
        throw obj1;
    }

    protected final Object a()
    {
        return b();
    }

    protected final volatile void a(Object obj, SpotifyContextMenu spotifycontextmenu)
    {
        obj = (fxr)obj;
        f.a(obj);
    }
}
