// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;

// Referenced classes of package android.support.v7.media:
//            MediaRouteProviderService, b, c

private final class b
    implements android.os.iderService.a
{

    public final Messenger a;
    public final int b;
    public b c;
    final MediaRouteProviderService d;
    private final SparseArray e = new SparseArray();

    public boolean a()
    {
        try
        {
            a.getBinder().linkToDeath(this, 0);
        }
        catch (RemoteException remoteexception)
        {
            binderDied();
            return false;
        }
        return true;
    }

    public boolean a(int i)
    {
        binderDied binderdied = (binderDied)e.get(i);
        if (binderdied != null)
        {
            e.remove(i);
            binderdied.e();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a(Messenger messenger)
    {
        return a.getBinder() == messenger.getBinder();
    }

    public boolean a(b b1)
    {
        if (c != b1 && (c == null || !c.equals(b1)))
        {
            c = b1;
            return MediaRouteProviderService.b(d);
        } else
        {
            return false;
        }
    }

    public boolean a(String s, int i)
    {
        if (e.indexOfKey(i) < 0)
        {
            s = MediaRouteProviderService.a(d).a(s);
            if (s != null)
            {
                e.put(i, s);
                return true;
            }
        }
        return false;
    }

    public e b(int i)
    {
        return (e)e.get(i);
    }

    public void b()
    {
        int j = e.size();
        for (int i = 0; i < j; i++)
        {
            ((e)e.valueAt(i)).e();
        }

        e.clear();
        a.getBinder().unlinkToDeath(this, 0);
        a(((b) (null)));
    }

    public void binderDied()
    {
        MediaRouteProviderService.c(d).obtainMessage(1, a).sendToTarget();
    }

    public String toString()
    {
        return MediaRouteProviderService.a(a);
    }

    public (MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int i)
    {
        d = mediarouteproviderservice;
        super();
        a = messenger;
        b = i;
    }
}
