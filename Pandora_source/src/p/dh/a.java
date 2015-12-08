// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dh;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.AsyncTask;
import android.os.Handler;
import com.pandora.radio.data.StationRecommendations;
import com.pandora.radio.data.af;
import com.pandora.radio.provider.StationProvider;
import com.pandora.radio.provider.d;
import com.pandora.radio.provider.i;
import com.pandora.radio.provider.k;
import com.pandora.radio.util.j;
import java.security.InvalidParameterException;
import p.cw.c;
import p.dd.an;
import p.dd.aw;
import p.di.l;
import p.di.o;
import p.di.p;

public class a
    implements p.cw.a
{

    private final c a;
    private StationRecommendations b;
    private af c;
    private ContentObserver d;

    public a(c c1)
    {
        b = new StationRecommendations();
        d = new ContentObserver(null) {

            final a a;
            private long b;

            public boolean deliverSelfNotifications()
            {
                return true;
            }

            public void onChange(boolean flag)
            {
                long l1 = System.currentTimeMillis();
                if (l1 - 2000L > b)
                {
                    b = l1;
                    a.a();
                }
            }

            
            {
                a = a.this;
                super(handler);
                b = 0L;
            }
        };
        a = c1;
        a.b(this);
        (new o()).execute(new Object[] {
            c1
        });
    }

    static c a(a a1)
    {
        return a1.a;
    }

    private boolean a(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            if (c == null)
            {
                flag = false;
            } else
            {
                flag = c.p();
            }
        } else
        {
            flag = true;
        }
        if (a.a(p.dj.b.a.c))
        {
            byte0 = 3;
        } else
        {
            byte0 = 0;
        }
        return a.y().g() > byte0 && flag;
    }

    public void a()
    {
label0:
        {
            if (c != null)
            {
                if (!a(true))
                {
                    break label0;
                }
                c();
            }
            return;
        }
        (new AsyncTask() {

            final a a;

            protected transient Void a(Void avoid[])
            {
                a.a(a).w().f().c();
                return null;
            }

            protected Object doInBackground(Object aobj[])
            {
                return a((Void[])aobj);
            }

            
            {
                a = a.this;
                super();
            }
        }).execute(new Void[0]);
    }

    public void a(StationRecommendations stationrecommendations)
    {
        if (!stationrecommendations.e() && a(false))
        {
            a.w().f().a(stationrecommendations);
        }
    }

    public void a(String s, j j1, boolean flag, boolean flag1, p.cx.x.e e)
    {
        if (s.startsWith("@"))
        {
            a.a(new p.dd.o(s));
            return;
        } else
        {
            p.a(s, j1, flag, flag1, e).execute(new Object[] {
                this
            });
            return;
        }
    }

    public void a(String s, Integer integer, String s1, boolean flag, boolean flag1, p.cx.x.e e)
    {
        integer = new com.pandora.radio.util.c(integer);
        integer.a(s1);
        a(s, ((j) (integer)), flag, flag1, e);
    }

    public void b()
    {
        a.c(this);
        a.s().getContentResolver().unregisterContentObserver(d);
    }

    protected void c()
    {
        (new l()).a_(new Object[] {
            a
        });
    }

    public void onSignInState(an an1)
    {
        c = an1.a;
        static class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[p.cx.e.a.values().length];
                try
                {
                    a[p.cx.e.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cx.e.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cx.e.a.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cx.e.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3.a[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 1: // '\001'
            a();
            a.s().getContentResolver().registerContentObserver(StationProvider.f, true, d);
            return;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            a.s().getContentResolver().unregisterContentObserver(d);
            break;
        }
    }

    public void onStationRecommendations(aw aw1)
    {
        b = aw1.a;
    }

    public aw produceStationRecommendations()
    {
        return new aw(b);
    }
}
