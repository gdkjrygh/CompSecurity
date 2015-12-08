// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

// Referenced classes of package android.support.v7.media:
//            k, b, d

private final class c
    implements android.os.der.DeathRecipient
{

    final k a;
    private final Messenger b;
    private final a c = new <init>(this);
    private final Messenger d;
    private int e;
    private int f;
    private int g;
    private int h;
    private final SparseArray i = new SparseArray();

    static void a( )
    {
        .c();
    }

    private boolean a(int j, int l, int i1, Object obj, Bundle bundle)
    {
        Message message;
        message = Message.obtain();
        message.what = j;
        message.arg1 = l;
        message.arg2 = i1;
        message.obj = obj;
        message.setData(bundle);
        message.replyTo = d;
        b.send(message);
        return true;
        obj;
        if (j != 2)
        {
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", ((Throwable) (obj)));
        }
_L2:
        return false;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void c()
    {
        for (int j = 0; j < i.size(); j++)
        {
            (()i.valueAt(j)).a(null, null);
        }

        i.clear();
    }

    public int a(String s)
    {
        int j = f;
        f = j + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", s);
        int l = e;
        e = l + 1;
        a(3, l, j, null, bundle);
        return j;
    }

    public void a(int j, int l)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", l);
        l = e;
        e = l + 1;
        a(7, l, j, null, bundle);
    }

    public void a(b b1)
    {
        int j = e;
        e = j + 1;
        if (b1 != null)
        {
            b1 = b1.d();
        } else
        {
            b1 = null;
        }
        a(10, j, 0, b1, null);
    }

    public boolean a()
    {
        int j = e;
        e = j + 1;
        h = j;
        if (!a(1, h, 1, null, null))
        {
            return false;
        }
        try
        {
            b.getBinder().linkToDeath(this, 0);
        }
        catch (RemoteException remoteexception)
        {
            binderDied();
            return false;
        }
        return true;
    }

    public boolean a(int j)
    {
        if (j == h)
        {
            h = 0;
            k.a(a, this, "Registation failed");
        }
        binderDied binderdied = (a)i.get(j);
        if (binderdied != null)
        {
            i.remove(j);
            binderdied.a(null, null);
        }
        return true;
    }

    public boolean a(int j, int l, Bundle bundle)
    {
        if (g == 0 && j == h && l >= 1)
        {
            h = 0;
            g = l;
            k.a(a, this, android.support.v7.media.d.a(bundle));
            k.a(a, this);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a(int j, Intent intent, a a1)
    {
        int l = e;
        e = l + 1;
        if (a(9, l, j, intent, null))
        {
            if (a1 != null)
            {
                i.put(l, a1);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a(int j, Bundle bundle)
    {
        i l = (i)i.get(j);
        if (l != null)
        {
            i.remove(j);
            l.a(bundle);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a(int j, String s, Bundle bundle)
    {
        a a1 = (a)i.get(j);
        if (a1 != null)
        {
            i.remove(j);
            a1.a(s, bundle);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a(Bundle bundle)
    {
        if (g != 0)
        {
            k.a(a, this, android.support.v7.media.d.a(bundle));
            return true;
        } else
        {
            return false;
        }
    }

    public void b()
    {
        a(2, 0, 0, null, null);
        c.a();
        b.getBinder().unlinkToDeath(this, 0);
        k.a(a).post(new Runnable() {

            final k.a a;

            public void run()
            {
                k.a.a(a);
            }

            
            {
                a = k.a.this;
                super();
            }
        });
    }

    public void b(int j, int l)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", l);
        l = e;
        e = l + 1;
        a(8, l, j, null, bundle);
    }

    public boolean b(int j)
    {
        return true;
    }

    public void binderDied()
    {
        k.a(a).post(new Runnable() {

            final k.a a;

            public void run()
            {
                k.b(a.a, a);
            }

            
            {
                a = k.a.this;
                super();
            }
        });
    }

    public void c(int j)
    {
        int l = e;
        e = l + 1;
        a(4, l, j, null, null);
    }

    public void d(int j)
    {
        int l = e;
        e = l + 1;
        a(5, l, j, null, null);
    }

    public void e(int j)
    {
        int l = e;
        e = l + 1;
        a(6, l, j, null, null);
    }

    public _cls2.a(k k1, Messenger messenger)
    {
        a = k1;
        super();
        e = 1;
        f = 1;
        b = messenger;
        d = new Messenger(c);
    }
}
