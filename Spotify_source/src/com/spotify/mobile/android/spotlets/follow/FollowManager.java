// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.follow;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.HttpCallbackReceiver;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import ctz;
import dmx;
import dth;
import eso;
import esp;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class FollowManager
    implements dmx
{

    private DeferredResolver a;
    private final Context b;
    private Map c;
    private Map d;

    public FollowManager(Context context)
    {
        c = new CaseInsensitiveMap((byte)0);
        d = new CaseInsensitiveMap((byte)0);
        b = context;
    }

    static void a(FollowManager followmanager, String s, boolean flag)
    {
        followmanager.c(s, flag);
    }

    static void b(FollowManager followmanager, String s, boolean flag)
    {
        followmanager.b(s, flag);
    }

    private void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (d.containsKey(s))
        {
            eso eso1 = (eso)c.get(s);
            for (s = ((Set)d.get(s)).iterator(); s.hasNext(); ((esp)s.next()).a(eso1)) { }
        }
        break MISSING_BLOCK_LABEL_80;
        s;
        throw s;
        this;
        JVM INSTR monitorexit ;
    }

    private void b(String s, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        ContentValues contentvalues;
        boolean flag1;
        if ((new SpotifyLink(s)).c == com.spotify.mobile.android.util.SpotifyLink.LinkType.g)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ctz.a(flag1, "Uri is not an artist uri");
        contentvalues = new ContentValues();
        contentvalues.put("is_followed", Boolean.valueOf(flag));
        b.getContentResolver().update(dth.a(s), contentvalues, null, null);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private void c(String s, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        ((eso)c.get(s)).a(flag);
        b(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final eso a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = (eso)c.get(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public final void a(eso eso1)
    {
        this;
        JVM INSTR monitorenter ;
        c.put(eso1.a, eso1);
        b(eso1.a);
        this;
        JVM INSTR monitorexit ;
        return;
        eso1;
        throw eso1;
    }

    public final void a(String s, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        ctz.a(c.containsKey(s), (new StringBuilder("no model exists for ")).append(s).toString());
        c(s, flag);
        String s1;
        String s2;
        Request request;
        if (flag)
        {
            s1 = "POST";
        } else
        {
            s1 = "DELETE";
        }
        s2 = String.format("{\"target_uris\": [\"%s\"]}", new Object[] {
            Uri.decode(s)
        });
        request = new Request(s1, "hm://socialgraph/v2/following?format=json", null, s2.getBytes());
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = Cosmos.getResolver(b);
        }
        this;
        JVM INSTR monitorexit ;
        a.resolve(request, new HttpCallbackReceiver(new Handler(Looper.getMainLooper()), s1, s2, s, flag) {

            private String a;
            private String b;
            private String c;
            private boolean d;
            private FollowManager e;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                boolean flag2 = true;
                Logger.b(throwable, "Failed to %s. Rolling back follow state.", new Object[] {
                    a
                });
                throwable = e;
                errorcause = c;
                boolean flag1;
                if (!d)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                FollowManager.a(throwable, errorcause, flag1);
                if ((new SpotifyLink(c)).c == com.spotify.mobile.android.util.SpotifyLink.LinkType.g)
                {
                    throwable = e;
                    errorcause = c;
                    if (!d)
                    {
                        flag1 = flag2;
                    } else
                    {
                        flag1 = false;
                    }
                    FollowManager.b(throwable, errorcause, flag1);
                }
            }

            protected final void onResolved(Response response, Object obj)
            {
                Logger.a("%s %s succeeded", new Object[] {
                    a, b
                });
            }

            protected final Object parseResponse(Response response)
            {
                return null;
            }

            
            {
                e = FollowManager.this;
                a = s;
                b = s1;
                c = s2;
                d = flag;
                super(handler);
            }
        });
        if ((new SpotifyLink(s)).c == com.spotify.mobile.android.util.SpotifyLink.LinkType.g)
        {
            b(s, flag);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final boolean a(String s, esp esp1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!d.containsKey(s))
        {
            d.put(s, Collections.newSetFromMap(new WeakHashMap()));
        }
        flag = ((Set)d.get(s)).add(esp1);
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    public final boolean b(String s, esp esp1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!d.containsKey(s)) goto _L2; else goto _L1
_L1:
        boolean flag = ((Set)d.get(s)).remove(esp1);
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        s;
        throw s;
    }

    private class CaseInsensitiveMap extends HashMap
    {

        private static final long serialVersionUID = 0x642bbcdedc361b34L;

        public boolean containsKey(Object obj)
        {
            return (obj instanceof String) && super.containsKey(((String)obj).toUpperCase(Locale.US));
        }

        public Object get(Object obj)
        {
            if (obj instanceof String)
            {
                return super.get(((String)obj).toUpperCase(Locale.US));
            } else
            {
                return null;
            }
        }

        public Object put(Object obj, Object obj1)
        {
            return super.put(((String)obj).toUpperCase(Locale.US), obj1);
        }

        private CaseInsensitiveMap()
        {
        }

        CaseInsensitiveMap(byte byte0)
        {
            this();
        }
    }

}
