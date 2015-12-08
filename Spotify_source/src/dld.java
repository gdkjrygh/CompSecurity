// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.devtools.MethodTraceScope;
import com.spotify.mobile.android.service.ConnectDevice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class dld
    implements ConnectManager
{

    ConnectDevice a;
    dla b;
    private final Context c;
    private final Handler d;
    private final gfi e;
    private boolean f;
    private boolean g;
    private com.spotify.mobile.android.connect.ConnectManager.ConnectState h;
    private List i;
    private ConnectDevice j;
    private ConnectDevice k;
    private float l;
    private String m;
    private final Collection n = new HashSet();
    private final Collection o = new HashSet();
    private final Collection p = new HashSet();
    private dky q;
    private final dle r;
    private final dln s = new dln() {

        private dld a;

        public final boolean a()
        {
            return a.a != null && !a.a.f && a.a.h;
        }

            
            {
                a = dld.this;
                super();
            }
    };
    private final dlo t = new dlo() {

        private dld a;

        public final void a(float f1)
        {
            if (a.b == null || !a.b.d())
            {
                a.a(f1, Integer.valueOf(90));
            }
        }

            
            {
                a = dld.this;
                super();
            }
    };
    private final Runnable u = new Runnable() {

        private dld a;

        public final void run()
        {
            a.n();
        }

            
            {
                a = dld.this;
                super();
            }
    };

    public dld(Context context, Handler handler, dle dle1)
    {
        f = true;
        g = true;
        h = com.spotify.mobile.android.connect.ConnectManager.ConnectState.a;
        i = new ArrayList();
        c = (Context)ctz.a(context);
        d = (Handler)ctz.a(handler);
        e = new gfi(c, new gfk() {

            private dld a;

            public final void a(gfi gfi1, Cursor cursor)
            {
                if (cursor == null || !cursor.moveToFirst())
                {
                    return;
                } else
                {
                    cursor.getCount();
                    a.a(cursor);
                    return;
                }
            }

            
            {
                a = dld.this;
                super();
            }
        });
        r = (dle)ctz.a(dle1);
        r.b = s;
        context = r;
        context.e = t;
        ((dle) (context)).a.subscribe("sp://playback/v1/volume", new dle._cls1(context));
    }

    private void b(boolean flag)
    {
        Iterator iterator = n.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dkz dkz1 = (dkz)iterator.next();
            c(dkz1);
            if (flag)
            {
                dkz1.a();
            }
        } while (true);
    }

    private void o()
    {
        if (a != null)
        {
            for (Iterator iterator = o.iterator(); iterator.hasNext(); ((dkx)iterator.next()).a(a)) { }
        }
    }

    public final void a()
    {
        MethodTraceScope.a.a();
        gci.a();
        f = true;
        e.a(dtj.a, ConnectDevice.a);
    }

    public final void a(float f1)
    {
        if (b != null && b.d())
        {
            a(f1, Integer.valueOf(90));
        }
    }

    final void a(float f1, Integer integer)
    {
        l = f1;
        if (integer == null)
        {
            n();
            return;
        } else
        {
            d.removeCallbacks(u);
            d.postDelayed(u, integer.intValue());
            return;
        }
    }

    final void a(Cursor cursor)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        ArrayList arraylist1;
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        ConnectDevice connectdevice;
        ConnectDevice connectdevice1;
        ConnectDevice connectdevice2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (cursor.getCount() == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        f = flag2;
        cursor.moveToPosition(-1);
        connectdevice = null;
        connectdevice1 = null;
_L1:
        if (!cursor.moveToNext())
        {
            break MISSING_BLOCK_LABEL_141;
        }
        connectdevice2 = ConnectDevice.a(cursor, c, m, q);
        if (connectdevice2.e)
        {
            connectdevice1 = connectdevice2;
        }
        if (connectdevice2.k)
        {
            connectdevice = connectdevice2;
        }
label0:
        {
            if (!connectdevice2.q && !connectdevice2.f)
            {
                break label0;
            }
            arraylist.add(connectdevice2);
        }
          goto _L1
        arraylist1.add(connectdevice2);
          goto _L1
        if (arraylist.size() <= 1) goto _L3; else goto _L2
_L2:
        connectdevice2 = (ConnectDevice)arraylist.get(1);
_L13:
        arraylist.addAll(arraylist1);
        i = arraylist;
        if (connectdevice1 == null) goto _L5; else goto _L4
_L4:
        if (connectdevice1.equals(a)) goto _L5; else goto _L6
_L6:
        flag = true;
_L14:
        a = connectdevice1;
        j = connectdevice;
        if (i.size() <= 1) goto _L8; else goto _L7
_L7:
        if (j != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1) goto _L10; else goto _L9
_L9:
        cursor = com.spotify.mobile.android.connect.ConnectManager.ConnectState.e;
_L15:
        h = cursor;
        if (connectdevice2 == null)
        {
            break MISSING_BLOCK_LABEL_480;
        }
        if (connectdevice2 == k)
        {
            break MISSING_BLOCK_LABEL_480;
        }
        flag2 = true;
_L17:
        k = connectdevice2;
        boolean flag3 = i();
        if (flag3 != g)
        {
            g = flag3;
            cursor = new Intent("com.spotify.mobile.android.service.broadcast.connect.SELF_ACTIVE_CHANGED");
            cursor.putExtra("is_active", i());
            c.sendBroadcast(cursor, "com.spotify.music.permission.INTERNAL_BROADCAST");
        }
        b(flag2);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        o();
        if (a == null) goto _L12; else goto _L11
_L11:
        cursor = a.b;
_L16:
        (new StringBuilder("DeviceCount:")).append(i.size()).toString();
        (new StringBuilder("ActiveDevice:")).append(cursor).toString();
        gci.a();
        MethodTraceScope.a.b();
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        connectdevice2 = null;
          goto _L13
_L5:
        flag = false;
          goto _L14
_L10:
label1:
        {
            if (!i())
            {
                break label1;
            }
            cursor = com.spotify.mobile.android.connect.ConnectManager.ConnectState.c;
        }
          goto _L15
        cursor = com.spotify.mobile.android.connect.ConnectManager.ConnectState.d;
          goto _L15
_L8:
        cursor = com.spotify.mobile.android.connect.ConnectManager.ConnectState.b;
          goto _L15
_L12:
        cursor = "No active device";
          goto _L16
        cursor;
        throw cursor;
        flag2 = false;
          goto _L17
    }

    public final void a(dkx dkx1)
    {
        o.add(dkx1);
        if (a != null)
        {
            dkx1.a(a);
        }
    }

    public final void a(dky dky)
    {
        q = dky;
    }

    public final void a(dkz dkz1)
    {
        n.add(dkz1);
        dkz1.a(i, h);
    }

    public final void a(dla dla1)
    {
        b = dla1;
    }

    public final void a(dlb dlb1)
    {
        p.add(dlb1);
        dlb1.a(j());
    }

    public final void a(String s1)
    {
        String.valueOf(s1);
        gci.a();
        c.getContentResolver().update(dtj.d(s1), new ContentValues(), null, null);
    }

    public final void a(boolean flag)
    {
        gci.a();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("is_playback_capable", Boolean.valueOf(flag));
        c.getContentResolver().update(dtj.a, contentvalues, null, null);
    }

    public final void b()
    {
        gci.a();
        f = true;
        e.b();
        g = true;
    }

    public final void b(float f1)
    {
        f1 = gci.a(f1);
        a(f1, null);
        if (b != null && b.d())
        {
            b.a(f1);
            return;
        } else
        {
            r.a(f1);
            return;
        }
    }

    public final void b(dkx dkx1)
    {
        o.remove(dkx1);
    }

    public final void b(dkz dkz1)
    {
        n.remove(dkz1);
    }

    public final void b(dlb dlb1)
    {
        p.remove(dlb1);
    }

    public final void b(String s1)
    {
        String.valueOf(s1);
        gci.a();
        c.getContentResolver().update(dtj.e(s1), new ContentValues(), null, null);
    }

    public final com.spotify.mobile.android.connect.ConnectManager.ConnectState c()
    {
        return h;
    }

    public final void c(dkz dkz1)
    {
        dkz1.a(i, h);
    }

    public final void c(String s1)
    {
        m = s1;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("is_active", Boolean.valueOf(true));
        c.getContentResolver().update(dtj.a(s1), contentvalues, null, null);
    }

    public final ConnectDevice d()
    {
        return a;
    }

    public final void d(String s1)
    {
        c.getContentResolver().update(dtj.b(s1), new ContentValues(), null, null);
    }

    public final ConnectDevice e()
    {
        return j;
    }

    public final void e(String s1)
    {
        k = null;
        c.getContentResolver().update(dtj.c(s1), new ContentValues(), null, null);
    }

    public final ConnectDevice f()
    {
        return k;
    }

    public final void g()
    {
        gci.a();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("device_discovery", Integer.valueOf(1));
        c.getContentResolver().update(dtj.a, contentvalues, null, null);
    }

    public final void h()
    {
        c("local_device");
    }

    public final boolean i()
    {
        return f || a != null && a.f;
    }

    public final float j()
    {
        if (b != null && b.d())
        {
            return b.c();
        } else
        {
            return r.c();
        }
    }

    public final boolean k()
    {
        a(j(), null);
        if (b != null && b.d())
        {
            return b.a();
        } else
        {
            return r.a();
        }
    }

    public final boolean l()
    {
        a(j(), null);
        if (b != null && b.d())
        {
            return b.b();
        } else
        {
            return r.b();
        }
    }

    public final boolean m()
    {
        return b != null && b.d() || r.d();
    }

    final void n()
    {
        for (Iterator iterator = p.iterator(); iterator.hasNext(); ((dlb)iterator.next()).a(l)) { }
    }
}
