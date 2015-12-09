// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//            d, c, b, f, 
//            e

public abstract class MediaRouteProviderService extends Service
{
    private final class a
        implements android.os.IBinder.DeathRecipient
    {

        public final Messenger a;
        public final int b;
        public android.support.v7.media.b c;
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
            c.d d1 = (c.d)e.get(i);
            if (d1 != null)
            {
                e.remove(i);
                d1.a();
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

        public boolean a(android.support.v7.media.b b1)
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

        public c.d b(int i)
        {
            return (c.d)e.get(i);
        }

        public void b()
        {
            int j = e.size();
            for (int i = 0; i < j; i++)
            {
                ((c.d)e.valueAt(i)).a();
            }

            e.clear();
            a.getBinder().unlinkToDeath(this, 0);
            a(((android.support.v7.media.b) (null)));
        }

        public void binderDied()
        {
            MediaRouteProviderService.c(d).obtainMessage(1, a).sendToTarget();
        }

        public String toString()
        {
            return MediaRouteProviderService.a(a);
        }

        public a(Messenger messenger, int i)
        {
            d = MediaRouteProviderService.this;
            super();
            a = messenger;
            b = i;
        }
    }

    private final class b extends Handler
    {

        final MediaRouteProviderService a;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                MediaRouteProviderService.b(a, (Messenger)message.obj);
                break;
            }
        }

        private b()
        {
            a = MediaRouteProviderService.this;
            super();
        }

    }

    private final class c extends c.a
    {

        final MediaRouteProviderService a;

        public void a(android.support.v7.media.c c1, android.support.v7.media.d d1)
        {
            MediaRouteProviderService.a(a, d1);
        }

        private c()
        {
            a = MediaRouteProviderService.this;
            super();
        }

    }

    private static final class d extends Handler
    {

        private final WeakReference a;

        private boolean a(int i, Messenger messenger, int j, int k, Object obj, Bundle bundle)
        {
            MediaRouteProviderService mediarouteproviderservice = (MediaRouteProviderService)a.get();
            if (mediarouteproviderservice == null) goto _L2; else goto _L1
_L1:
            i;
            JVM INSTR tableswitch 1 10: default 72
        //                       1 74
        //                       2 84
        //                       3 92
        //                       4 118
        //                       5 128
        //                       6 138
        //                       7 148
        //                       8 172
        //                       9 196
        //                       10 219;
               goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L2:
            return false;
_L3:
            return MediaRouteProviderService.a(mediarouteproviderservice, messenger, j, k);
_L4:
            return MediaRouteProviderService.a(mediarouteproviderservice, messenger, j);
_L5:
            obj = bundle.getString("routeId");
            if (obj != null)
            {
                return MediaRouteProviderService.a(mediarouteproviderservice, messenger, j, k, ((String) (obj)));
            }
            if (true)
            {
                continue; /* Loop/switch isn't completed */
            }
_L6:
            return MediaRouteProviderService.b(mediarouteproviderservice, messenger, j, k);
_L7:
            return MediaRouteProviderService.c(mediarouteproviderservice, messenger, j, k);
_L8:
            return MediaRouteProviderService.d(mediarouteproviderservice, messenger, j, k);
_L9:
            i = bundle.getInt("volume", -1);
            if (i >= 0)
            {
                return MediaRouteProviderService.a(mediarouteproviderservice, messenger, j, k, i);
            }
            if (true) goto _L2; else goto _L10
_L10:
            i = bundle.getInt("volume", 0);
            if (i != 0)
            {
                return MediaRouteProviderService.b(mediarouteproviderservice, messenger, j, k, i);
            }
            continue; /* Loop/switch isn't completed */
_L11:
            if (obj instanceof Intent)
            {
                return MediaRouteProviderService.a(mediarouteproviderservice, messenger, j, k, (Intent)obj);
            }
            continue; /* Loop/switch isn't completed */
_L12:
            if (obj == null || (obj instanceof Bundle))
            {
                obj = android.support.v7.media.b.a((Bundle)obj);
                if (obj == null || !((android.support.v7.media.b) (obj)).c())
                {
                    obj = null;
                }
                return MediaRouteProviderService.a(mediarouteproviderservice, messenger, j, ((android.support.v7.media.b) (obj)));
            }
            if (true) goto _L2; else goto _L13
_L13:
        }

        public void handleMessage(Message message)
        {
            Messenger messenger = message.replyTo;
            if (android.support.v7.media.e.a(messenger))
            {
                int i = message.what;
                int j = message.arg1;
                int k = message.arg2;
                Object obj = message.obj;
                message = message.peekData();
                if (!a(i, messenger, j, k, obj, message))
                {
                    if (MediaRouteProviderService.a())
                    {
                        Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(MediaRouteProviderService.a(messenger)).append(": Message failed, what=").append(i).append(", requestId=").append(j).append(", arg=").append(k).append(", obj=").append(obj).append(", data=").append(message).toString());
                    }
                    MediaRouteProviderService.a(messenger, j);
                }
            } else
            if (MediaRouteProviderService.a())
            {
                Log.d("MediaRouteProviderSrv", "Ignoring message without valid reply messenger.");
                return;
            }
        }

        public d(MediaRouteProviderService mediarouteproviderservice)
        {
            a = new WeakReference(mediarouteproviderservice);
        }
    }


    private static final boolean a = Log.isLoggable("MediaRouteProviderSrv", 3);
    private final ArrayList b = new ArrayList();
    private final d c = new d(this);
    private final Messenger d;
    private final b e = new b();
    private final c f = new c();
    private android.support.v7.media.c g;
    private android.support.v7.media.b h;

    public MediaRouteProviderService()
    {
        d = new Messenger(c);
    }

    static int a(MediaRouteProviderService mediarouteproviderservice, Messenger messenger)
    {
        return mediarouteproviderservice.d(messenger);
    }

    static android.support.v7.media.c a(MediaRouteProviderService mediarouteproviderservice)
    {
        return mediarouteproviderservice.g;
    }

    static String a(Messenger messenger)
    {
        return e(messenger);
    }

    static void a(Messenger messenger, int i)
    {
        c(messenger, i);
    }

    static void a(Messenger messenger, int i, int j, int k, Object obj, Bundle bundle)
    {
        b(messenger, i, j, k, obj, bundle);
    }

    static void a(MediaRouteProviderService mediarouteproviderservice, android.support.v7.media.d d1)
    {
        mediarouteproviderservice.a(d1);
    }

    private void a(android.support.v7.media.d d1)
    {
        Bundle bundle;
        int j;
        if (d1 != null)
        {
            bundle = d1.c();
        } else
        {
            bundle = null;
        }
        j = b.size();
        for (int i = 0; i < j; i++)
        {
            a a1 = (a)b.get(i);
            b(a1.a, 5, 0, 0, bundle, null);
            if (a)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a1).append(": Sent descriptor change event, descriptor=").append(d1).toString());
            }
        }

    }

    static boolean a()
    {
        return a;
    }

    private boolean a(Messenger messenger, int i, int j)
    {
        if (j >= 1 && d(messenger) < 0)
        {
            a a1 = new a(messenger, j);
            if (a1.a())
            {
                b.add(a1);
                if (a)
                {
                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a1).append(": Registered, version=").append(j).toString());
                }
                if (i != 0)
                {
                    Object obj = g.e();
                    if (obj != null)
                    {
                        obj = ((android.support.v7.media.d) (obj)).c();
                    } else
                    {
                        obj = null;
                    }
                    b(messenger, 2, i, 1, obj, null);
                }
                return true;
            }
        }
        return false;
    }

    private boolean a(Messenger messenger, int i, int j, int k)
    {
        a a1 = c(messenger);
        if (a1 != null)
        {
            c.d d1 = a1.b(j);
            if (d1 != null)
            {
                d1.a(k);
                if (a)
                {
                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a1).append(": Route volume changed").append(", controllerId=").append(j).append(", volume=").append(k).toString());
                }
                d(messenger, i);
                return true;
            }
        }
        return false;
    }

    private boolean a(Messenger messenger, int i, int j, Intent intent)
    {
        a a1 = c(messenger);
        if (a1 != null)
        {
            c.d d1 = a1.b(j);
            if (d1 != null)
            {
                g.c c1 = null;
                if (i != 0)
                {
                    c1 = new g.c(a1, j, intent, messenger, i) {

                        final a a;
                        final int b;
                        final Intent c;
                        final Messenger d;
                        final int e;
                        final MediaRouteProviderService f;

                        public void a(Bundle bundle)
                        {
                            if (MediaRouteProviderService.a())
                            {
                                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a).append(": Route control request succeeded").append(", controllerId=").append(b).append(", intent=").append(c).append(", data=").append(bundle).toString());
                            }
                            if (MediaRouteProviderService.a(f, d) >= 0)
                            {
                                MediaRouteProviderService.a(d, 3, e, 0, bundle, null);
                            }
                        }

                        public void a(String s, Bundle bundle)
                        {
label0:
                            {
                                if (MediaRouteProviderService.a())
                                {
                                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a).append(": Route control request failed").append(", controllerId=").append(b).append(", intent=").append(c).append(", error=").append(s).append(", data=").append(bundle).toString());
                                }
                                if (MediaRouteProviderService.a(f, d) >= 0)
                                {
                                    if (s == null)
                                    {
                                        break label0;
                                    }
                                    Bundle bundle1 = new Bundle();
                                    bundle1.putString("error", s);
                                    MediaRouteProviderService.a(d, 4, e, 0, bundle, bundle1);
                                }
                                return;
                            }
                            MediaRouteProviderService.a(d, 4, e, 0, bundle, null);
                        }

            
            {
                f = MediaRouteProviderService.this;
                a = a1;
                b = i;
                c = intent;
                d = messenger;
                e = j;
                super();
            }
                    };
                }
                if (d1.a(intent, c1))
                {
                    if (a)
                    {
                        Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a1).append(": Route control request delivered").append(", controllerId=").append(j).append(", intent=").append(intent).toString());
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(Messenger messenger, int i, int j, String s)
    {
        a a1 = c(messenger);
        if (a1 != null && a1.a(s, j))
        {
            if (a)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a1).append(": Route controller created").append(", controllerId=").append(j).append(", routeId=").append(s).toString());
            }
            d(messenger, i);
            return true;
        } else
        {
            return false;
        }
    }

    private boolean a(Messenger messenger, int i, android.support.v7.media.b b1)
    {
        a a1 = c(messenger);
        if (a1 != null)
        {
            boolean flag = a1.a(b1);
            if (a)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a1).append(": Set discovery request, request=").append(b1).append(", actuallyChanged=").append(flag).append(", compositeDiscoveryRequest=").append(h).toString());
            }
            d(messenger, i);
            return true;
        } else
        {
            return false;
        }
    }

    static boolean a(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int i)
    {
        return mediarouteproviderservice.b(messenger, i);
    }

    static boolean a(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int i, int j)
    {
        return mediarouteproviderservice.a(messenger, i, j);
    }

    static boolean a(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int i, int j, int k)
    {
        return mediarouteproviderservice.a(messenger, i, j, k);
    }

    static boolean a(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int i, int j, Intent intent)
    {
        return mediarouteproviderservice.a(messenger, i, j, intent);
    }

    static boolean a(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int i, int j, String s)
    {
        return mediarouteproviderservice.a(messenger, i, j, s);
    }

    static boolean a(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int i, android.support.v7.media.b b1)
    {
        return mediarouteproviderservice.a(messenger, i, b1);
    }

    private void b(Messenger messenger)
    {
        int i = d(messenger);
        if (i >= 0)
        {
            messenger = (a)b.remove(i);
            if (a)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(messenger).append(": Binder died").toString());
            }
            messenger.b();
        }
    }

    private static void b(Messenger messenger, int i, int j, int k, Object obj, Bundle bundle)
    {
        Message message = Message.obtain();
        message.what = i;
        message.arg1 = j;
        message.arg2 = k;
        message.obj = obj;
        message.setData(bundle);
        try
        {
            messenger.send(message);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Messenger messenger)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MediaRouteProviderSrv", (new StringBuilder()).append("Could not send message to ").append(e(messenger)).toString(), ((Throwable) (obj)));
        }
    }

    static void b(MediaRouteProviderService mediarouteproviderservice, Messenger messenger)
    {
        mediarouteproviderservice.b(messenger);
    }

    private boolean b()
    {
        Object obj1 = null;
        int j = b.size();
        int i = 0;
        boolean flag = false;
        Object obj = null;
        while (i < j) 
        {
            Object obj2 = ((a)b.get(i)).c;
            if (obj2 != null && (!((android.support.v7.media.b) (obj2)).a().b() || ((android.support.v7.media.b) (obj2)).b()))
            {
                flag = ((android.support.v7.media.b) (obj2)).b() | flag;
                if (obj == null)
                {
                    obj = obj1;
                    obj1 = obj2;
                } else
                {
                    if (obj1 == null)
                    {
                        obj1 = new f.a(((android.support.v7.media.b) (obj)).a());
                    }
                    ((f.a) (obj1)).a(((android.support.v7.media.b) (obj2)).a());
                    obj2 = obj;
                    obj = obj1;
                    obj1 = obj2;
                }
            } else
            {
                Object obj3 = obj;
                obj = obj1;
                obj1 = obj3;
            }
            i++;
            obj2 = obj1;
            obj1 = obj;
            obj = obj2;
        }
        if (obj1 != null)
        {
            obj = new android.support.v7.media.b(((f.a) (obj1)).a(), flag);
        }
        if (h != obj && (h == null || !h.equals(obj)))
        {
            h = ((android.support.v7.media.b) (obj));
            g.a(((android.support.v7.media.b) (obj)));
            return true;
        } else
        {
            return false;
        }
    }

    private boolean b(Messenger messenger, int i)
    {
        int j = d(messenger);
        if (j >= 0)
        {
            a a1 = (a)b.remove(j);
            if (a)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a1).append(": Unregistered").toString());
            }
            a1.b();
            d(messenger, i);
            return true;
        } else
        {
            return false;
        }
    }

    private boolean b(Messenger messenger, int i, int j)
    {
        a a1 = c(messenger);
        if (a1 != null && a1.a(j))
        {
            if (a)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a1).append(": Route controller released").append(", controllerId=").append(j).toString());
            }
            d(messenger, i);
            return true;
        } else
        {
            return false;
        }
    }

    private boolean b(Messenger messenger, int i, int j, int k)
    {
        a a1 = c(messenger);
        if (a1 != null)
        {
            c.d d1 = a1.b(j);
            if (d1 != null)
            {
                d1.b(k);
                if (a)
                {
                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a1).append(": Route volume updated").append(", controllerId=").append(j).append(", delta=").append(k).toString());
                }
                d(messenger, i);
                return true;
            }
        }
        return false;
    }

    static boolean b(MediaRouteProviderService mediarouteproviderservice)
    {
        return mediarouteproviderservice.b();
    }

    static boolean b(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int i, int j)
    {
        return mediarouteproviderservice.b(messenger, i, j);
    }

    static boolean b(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int i, int j, int k)
    {
        return mediarouteproviderservice.b(messenger, i, j, k);
    }

    private a c(Messenger messenger)
    {
        int i = d(messenger);
        if (i >= 0)
        {
            return (a)b.get(i);
        } else
        {
            return null;
        }
    }

    static b c(MediaRouteProviderService mediarouteproviderservice)
    {
        return mediarouteproviderservice.e;
    }

    private static void c(Messenger messenger, int i)
    {
        if (i != 0)
        {
            b(messenger, 0, i, 0, null, null);
        }
    }

    private boolean c(Messenger messenger, int i, int j)
    {
        a a1 = c(messenger);
        if (a1 != null)
        {
            c.d d1 = a1.b(j);
            if (d1 != null)
            {
                d1.b();
                if (a)
                {
                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a1).append(": Route selected").append(", controllerId=").append(j).toString());
                }
                d(messenger, i);
                return true;
            }
        }
        return false;
    }

    static boolean c(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int i, int j)
    {
        return mediarouteproviderservice.c(messenger, i, j);
    }

    private int d(Messenger messenger)
    {
        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            if (((a)b.get(i)).a(messenger))
            {
                return i;
            }
        }

        return -1;
    }

    private static void d(Messenger messenger, int i)
    {
        if (i != 0)
        {
            b(messenger, 1, i, 0, null, null);
        }
    }

    private boolean d(Messenger messenger, int i, int j)
    {
        a a1 = c(messenger);
        if (a1 != null)
        {
            c.d d1 = a1.b(j);
            if (d1 != null)
            {
                d1.c();
                if (a)
                {
                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a1).append(": Route unselected").append(", controllerId=").append(j).toString());
                }
                d(messenger, i);
                return true;
            }
        }
        return false;
    }

    static boolean d(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int i, int j)
    {
        return mediarouteproviderservice.d(messenger, i, j);
    }

    private static String e(Messenger messenger)
    {
        return (new StringBuilder()).append("Client connection ").append(messenger.getBinder().toString()).toString();
    }

}
