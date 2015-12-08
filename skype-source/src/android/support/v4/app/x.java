// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            v, ab, w, ae, 
//            y, z

public final class x
{
    public static final class a extends NotificationCompatBase.Action
    {

        public static final NotificationCompatBase.Action.Factory d = new NotificationCompatBase.Action.Factory() {

            public final NotificationCompatBase.Action build(int i1, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInputCompatBase.RemoteInput aremoteinput[])
            {
                return new a(i1, charsequence, pendingintent, bundle, (ae[])aremoteinput, (byte)0);
            }

            public final volatile NotificationCompatBase.Action[] newArray(int i1)
            {
                return new a[i1];
            }

        };
        public int a;
        public CharSequence b;
        public PendingIntent c;
        private final Bundle e;
        private final ae f[];

        public final int a()
        {
            return a;
        }

        public final CharSequence b()
        {
            return b;
        }

        public final PendingIntent c()
        {
            return c;
        }

        public final Bundle d()
        {
            return e;
        }

        public final volatile RemoteInputCompatBase.RemoteInput[] e()
        {
            return f;
        }


        public a(int i1, CharSequence charsequence, PendingIntent pendingintent)
        {
            this(i1, charsequence, pendingintent, new Bundle(), null);
        }

        private a(int i1, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, ae aae[])
        {
            a = i1;
            b = d.d(charsequence);
            c = pendingintent;
            if (bundle == null)
            {
                bundle = new Bundle();
            }
            e = bundle;
            f = aae;
        }

        a(int i1, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, ae aae[], byte byte0)
        {
            this(i1, charsequence, pendingintent, bundle, aae);
        }
    }

    public static final class a.a
    {

        private final int a;
        private final CharSequence b;
        private final PendingIntent c;
        private final Bundle d;
        private ArrayList e;

        public final a.a a(ae ae1)
        {
            if (e == null)
            {
                e = new ArrayList();
            }
            e.add(ae1);
            return this;
        }

        public final a a()
        {
            ae aae[];
            if (e != null)
            {
                aae = (ae[])e.toArray(new ae[e.size()]);
            } else
            {
                aae = null;
            }
            return new a(a, b, c, d, aae, (byte)0);
        }

        public a.a(int i1, CharSequence charsequence, PendingIntent pendingintent)
        {
            this(i1, charsequence, pendingintent, new Bundle());
        }

        private a.a(int i1, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
        {
            a = i1;
            b = d.d(charsequence);
            c = pendingintent;
            d = bundle;
        }
    }

    public static final class b extends r
    {

        Bitmap a;
        Bitmap b;
        boolean c;

        public b()
        {
        }
    }

    public static final class c extends r
    {

        CharSequence a;

        public final c a(CharSequence charsequence)
        {
            f = d.d(charsequence);
            g = true;
            return this;
        }

        public final c b(CharSequence charsequence)
        {
            a = d.d(charsequence);
            return this;
        }

        public c()
        {
        }
    }

    public static final class d
    {

        Notification A;
        public Notification B;
        public ArrayList C;
        public Context a;
        public CharSequence b;
        public CharSequence c;
        PendingIntent d;
        PendingIntent e;
        RemoteViews f;
        public Bitmap g;
        public CharSequence h;
        public int i;
        int j;
        boolean k;
        public boolean l;
        public r m;
        public CharSequence n;
        int o;
        int p;
        boolean q;
        String r;
        boolean s;
        String t;
        public ArrayList u;
        boolean v;
        String w;
        Bundle x;
        int y;
        int z;

        private void a(int i1, boolean flag)
        {
            if (flag)
            {
                Notification notification = B;
                notification.flags = notification.flags | i1;
                return;
            } else
            {
                Notification notification1 = B;
                notification1.flags = notification1.flags & ~i1;
                return;
            }
        }

        protected static CharSequence d(CharSequence charsequence)
        {
            while (charsequence == null || charsequence.length() <= 5120) 
            {
                return charsequence;
            }
            return charsequence.subSequence(0, 5120);
        }

        public final d a()
        {
            k = false;
            return this;
        }

        public final d a(int i1)
        {
            B.icon = i1;
            return this;
        }

        public final d a(int i1, int j1)
        {
            o = i1;
            p = j1;
            q = false;
            return this;
        }

        public final d a(int i1, CharSequence charsequence, PendingIntent pendingintent)
        {
            u.add(new a(i1, charsequence, pendingintent));
            return this;
        }

        public final d a(long l1)
        {
            B.when = l1;
            return this;
        }

        public final d a(PendingIntent pendingintent)
        {
            d = pendingintent;
            return this;
        }

        public final d a(Uri uri)
        {
            B.sound = uri;
            B.audioStreamType = -1;
            return this;
        }

        public final d a(g g1)
        {
            g1.a(this);
            return this;
        }

        public final d a(r r1)
        {
            if (m != r1)
            {
                m = r1;
                if (m != null)
                {
                    r1 = m;
                    if (r1.d != this)
                    {
                        r1.d = this;
                        if (r1.d != null)
                        {
                            r1.d.a(r1);
                        }
                    }
                }
            }
            return this;
        }

        public final d a(CharSequence charsequence)
        {
            b = d(charsequence);
            return this;
        }

        public final d a(String s1)
        {
            r = s1;
            return this;
        }

        public final d a(boolean flag)
        {
            a(2, flag);
            return this;
        }

        public final d b()
        {
            v = true;
            return this;
        }

        public final d b(int i1)
        {
            y = i1;
            return this;
        }

        public final d b(int i1, int j1)
        {
            boolean flag = true;
            B.ledARGB = 0xff0000ff;
            B.ledOnMS = i1;
            B.ledOffMS = j1;
            Notification notification;
            if (B.ledOnMS != 0 && B.ledOffMS != 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            notification = B;
            j1 = B.flags;
            if (i1 != 0)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            notification.flags = i1 | j1 & -2;
            return this;
        }

        public final d b(PendingIntent pendingintent)
        {
            B.deleteIntent = pendingintent;
            return this;
        }

        public final d b(CharSequence charsequence)
        {
            c = d(charsequence);
            return this;
        }

        public final d b(boolean flag)
        {
            a(8, flag);
            return this;
        }

        public final d c()
        {
            j = 2;
            return this;
        }

        public final d c(CharSequence charsequence)
        {
            B.tickerText = d(charsequence);
            return this;
        }

        public final d c(boolean flag)
        {
            a(16, flag);
            return this;
        }

        public final Bundle d()
        {
            if (x == null)
            {
                x = new Bundle();
            }
            return x;
        }

        public final d d(boolean flag)
        {
            s = flag;
            return this;
        }

        public final Notification e()
        {
            i i1 = x.a();
            new e();
            return i1.a(this);
        }

        public d(Context context)
        {
            k = true;
            u = new ArrayList();
            v = false;
            y = 0;
            z = 0;
            B = new Notification();
            a = context;
            B.when = System.currentTimeMillis();
            B.audioStreamType = -1;
            j = 0;
            C = new ArrayList();
        }
    }

    protected static final class e
    {

        protected e()
        {
        }
    }

    public static final class f
        implements g
    {

        private Bitmap a;
        private a b;
        private int c;

        public final d a(d d1)
        {
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                return d1;
            }
            Bundle bundle = new Bundle();
            if (a != null)
            {
                bundle.putParcelable("large_icon", a);
            }
            if (c != 0)
            {
                bundle.putInt("app_color", c);
            }
            if (b != null)
            {
                bundle.putBundle("car_conversation", x.a().a(b));
            }
            d1.d().putBundle("android.car.EXTENSIONS", bundle);
            return d1;
        }

        public final f a(a a1)
        {
            b = a1;
            return this;
        }

        public f()
        {
            c = 0;
        }
    }

    public static final class f.a extends NotificationCompatBase.UnreadConversation
    {

        static final NotificationCompatBase.UnreadConversation.Factory a = new NotificationCompatBase.UnreadConversation.Factory() {

            public final NotificationCompatBase.UnreadConversation build(String as[], RemoteInputCompatBase.RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l1)
            {
                return new f.a(as, (ae)remoteinput, pendingintent, pendingintent1, as1, l1);
            }

        };
        private final String b[];
        private final ae c;
        private final PendingIntent d;
        private final PendingIntent e;
        private final String f[];
        private final long g;

        public final String[] a()
        {
            return b;
        }

        public final PendingIntent b()
        {
            return d;
        }

        public final PendingIntent c()
        {
            return e;
        }

        public final String[] d()
        {
            return f;
        }

        public final long e()
        {
            return g;
        }

        public final volatile RemoteInputCompatBase.RemoteInput f()
        {
            return c;
        }


        f.a(String as[], ae ae, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l1)
        {
            b = as;
            c = ae;
            e = pendingintent1;
            d = pendingintent;
            f = as1;
            g = l1;
        }
    }

    public static final class f.a.a
    {

        private final List a = new ArrayList();
        private final String b;
        private ae c;
        private PendingIntent d;
        private PendingIntent e;
        private long f;

        public final f.a.a a(long l1)
        {
            f = l1;
            return this;
        }

        public final f.a.a a(PendingIntent pendingintent)
        {
            d = pendingintent;
            return this;
        }

        public final f.a.a a(PendingIntent pendingintent, ae ae)
        {
            c = ae;
            e = pendingintent;
            return this;
        }

        public final f.a.a a(String s1)
        {
            a.add(s1);
            return this;
        }

        public final f.a a()
        {
            String as[] = (String[])a.toArray(new String[a.size()]);
            String s1 = b;
            ae ae = c;
            PendingIntent pendingintent = e;
            PendingIntent pendingintent1 = d;
            long l1 = f;
            return new f.a(as, ae, pendingintent, pendingintent1, new String[] {
                s1
            }, l1);
        }

        public f.a.a(String s1)
        {
            b = s1;
        }
    }

    public static interface g
    {

        public abstract d a(d d1);
    }

    public static final class h extends r
    {

        ArrayList a;

        public final h a(CharSequence charsequence)
        {
            f = d.d(charsequence);
            g = true;
            return this;
        }

        public final h b(CharSequence charsequence)
        {
            a.add(d.d(charsequence));
            return this;
        }

        public h()
        {
            a = new ArrayList();
        }
    }

    static interface i
    {

        public abstract Notification a(d d1);

        public abstract Bundle a(Notification notification);

        public abstract Bundle a(NotificationCompatBase.UnreadConversation unreadconversation);

        public abstract ArrayList a(a aa[]);
    }

    static class j extends q
    {

        public Notification a(d d1)
        {
            y.a a1 = new y.a(d1.a, d1.B, d1.b, d1.c, d1.h, d1.f, d1.i, d1.d, d1.e, d1.g, d1.o, d1.p, d1.q, d1.k, d1.l, d1.j, d1.n, d1.v, d1.C, d1.x, d1.r, d1.s, d1.t);
            x.a(a1, d1.u);
            x.a(a1, d1.m);
            return a1.b();
        }

        public final ArrayList a(a aa[])
        {
            return y.a(aa);
        }

        j()
        {
        }
    }

    static final class k extends j
    {

        public final Notification a(d d1)
        {
            z.a a1 = new z.a(d1.a, d1.B, d1.b, d1.c, d1.h, d1.f, d1.i, d1.d, d1.e, d1.g, d1.o, d1.p, d1.q, d1.k, d1.l, d1.j, d1.n, d1.v, d1.w, d1.C, d1.x, d1.y, d1.z, d1.A, d1.r, d1.s, d1.t);
            x.a(a1, d1.u);
            x.a(a1, d1.m);
            return a1.b();
        }

        public final Bundle a(NotificationCompatBase.UnreadConversation unreadconversation)
        {
            return z.a(unreadconversation);
        }

        k()
        {
        }
    }

    static class l
        implements i
    {

        public Notification a(d d1)
        {
            Notification notification = d1.B;
            notification.setLatestEventInfo(d1.a, d1.b, d1.c, d1.d);
            if (d1.j > 0)
            {
                notification.flags = notification.flags | 0x80;
            }
            return notification;
        }

        public Bundle a(Notification notification)
        {
            return null;
        }

        public Bundle a(NotificationCompatBase.UnreadConversation unreadconversation)
        {
            return null;
        }

        public ArrayList a(a aa[])
        {
            return null;
        }

        l()
        {
        }
    }

    static final class m extends l
    {

        public final Notification a(d d1)
        {
            Notification notification = d1.B;
            notification.setLatestEventInfo(d1.a, d1.b, d1.c, d1.d);
            Context context = d1.a;
            CharSequence charsequence = d1.b;
            CharSequence charsequence1 = d1.c;
            PendingIntent pendingintent = d1.d;
            PendingIntent pendingintent1 = d1.e;
            notification.setLatestEventInfo(context, charsequence, charsequence1, pendingintent);
            notification.fullScreenIntent = pendingintent1;
            if (d1.j > 0)
            {
                notification.flags = notification.flags | 0x80;
            }
            return notification;
        }

        m()
        {
        }
    }

    static final class n extends l
    {

        public final Notification a(d d1)
        {
            Object obj1 = d1.a;
            Notification notification = d1.B;
            Object obj = d1.b;
            CharSequence charsequence = d1.c;
            CharSequence charsequence1 = d1.h;
            RemoteViews remoteviews = d1.f;
            int i1 = d1.i;
            PendingIntent pendingintent1 = d1.d;
            PendingIntent pendingintent = d1.e;
            d1 = d1.g;
            obj1 = (new android.app.Notification.Builder(((Context) (obj1)))).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
            boolean flag;
            if ((notification.flags & 2) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1 = ((android.app.Notification.Builder) (obj1)).setOngoing(flag);
            if ((notification.flags & 8) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1 = ((android.app.Notification.Builder) (obj1)).setOnlyAlertOnce(flag);
            if ((notification.flags & 0x10) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = ((android.app.Notification.Builder) (obj1)).setAutoCancel(flag).setDefaults(notification.defaults).setContentTitle(((CharSequence) (obj))).setContentText(charsequence).setContentInfo(charsequence1).setContentIntent(pendingintent1).setDeleteIntent(notification.deleteIntent);
            if ((notification.flags & 0x80) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return ((android.app.Notification.Builder) (obj)).setFullScreenIntent(pendingintent, flag).setLargeIcon(d1).setNumber(i1).getNotification();
        }

        n()
        {
        }
    }

    static final class o extends l
    {

        public final Notification a(d d1)
        {
            return (new aa.a(d1.a, d1.B, d1.b, d1.c, d1.h, d1.f, d1.i, d1.d, d1.e, d1.g, d1.o, d1.p, d1.q)).b();
        }

        o()
        {
        }
    }

    static class p extends l
    {

        public Notification a(d d1)
        {
            ab.a a1 = new ab.a(d1.a, d1.B, d1.b, d1.c, d1.h, d1.f, d1.i, d1.d, d1.e, d1.g, d1.o, d1.p, d1.q, d1.l, d1.j, d1.n, d1.v, d1.x, d1.r, d1.s, d1.t);
            x.a(a1, d1.u);
            x.a(a1, d1.m);
            return a1.b();
        }

        public Bundle a(Notification notification)
        {
            return ab.a(notification);
        }

        public ArrayList a(a aa[])
        {
            return ab.a(aa);
        }

        p()
        {
        }
    }

    static class q extends p
    {

        public Notification a(d d1)
        {
            ac.a a1 = new ac.a(d1.a, d1.B, d1.b, d1.c, d1.h, d1.f, d1.i, d1.d, d1.e, d1.g, d1.o, d1.p, d1.q, d1.k, d1.l, d1.j, d1.n, d1.v, d1.C, d1.x, d1.r, d1.s, d1.t);
            x.a(a1, d1.u);
            x.a(a1, d1.m);
            return a1.b();
        }

        public final Bundle a(Notification notification)
        {
            return notification.extras;
        }

        q()
        {
        }
    }

    public static abstract class r
    {

        d d;
        CharSequence e;
        CharSequence f;
        boolean g;

        public r()
        {
            g = false;
        }
    }

    public static final class s
        implements g
    {

        private ArrayList a;
        private int b;
        private PendingIntent c;
        private ArrayList d;
        private Bitmap e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;

        public final d a(d d1)
        {
            Bundle bundle = new Bundle();
            if (!a.isEmpty())
            {
                bundle.putParcelableArrayList("actions", x.a().a((a[])a.toArray(new a[a.size()])));
            }
            if (b != 1)
            {
                bundle.putInt("flags", b);
            }
            if (c != null)
            {
                bundle.putParcelable("displayIntent", c);
            }
            if (!d.isEmpty())
            {
                bundle.putParcelableArray("pages", (android.os.Parcelable[])d.toArray(new Notification[d.size()]));
            }
            if (e != null)
            {
                bundle.putParcelable("background", e);
            }
            if (f != 0)
            {
                bundle.putInt("contentIcon", f);
            }
            if (g != 0x800005)
            {
                bundle.putInt("contentIconGravity", g);
            }
            if (h != -1)
            {
                bundle.putInt("contentActionIndex", h);
            }
            if (i != 0)
            {
                bundle.putInt("customSizePreset", i);
            }
            if (j != 0)
            {
                bundle.putInt("customContentHeight", j);
            }
            if (k != 80)
            {
                bundle.putInt("gravity", k);
            }
            if (l != 0)
            {
                bundle.putInt("hintScreenTimeout", l);
            }
            d1.d().putBundle("android.wearable.EXTENSIONS", bundle);
            return d1;
        }

        public final s a()
        {
            b = b | 8;
            return this;
        }

        public final s a(Notification notification)
        {
            d.add(notification);
            return this;
        }

        public final s a(a a1)
        {
            a.add(a1);
            return this;
        }

        public final Object clone()
            throws CloneNotSupportedException
        {
            s s1 = new s();
            s1.a = new ArrayList(a);
            s1.b = b;
            s1.c = c;
            s1.d = new ArrayList(d);
            s1.e = e;
            s1.f = f;
            s1.g = g;
            s1.h = h;
            s1.i = i;
            s1.j = j;
            s1.k = k;
            s1.l = l;
            return s1;
        }

        public s()
        {
            a = new ArrayList();
            b = 1;
            d = new ArrayList();
            g = 0x800005;
            h = -1;
            i = 0;
            k = 80;
        }
    }


    private static final i a;

    public static Bundle a(Notification notification)
    {
        return a.a(notification);
    }

    static i a()
    {
        return a;
    }

    static void a(v v1, ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); v1.a((a)arraylist.next())) { }
    }

    static void a(w w, r r1)
    {
        if (r1 != null)
        {
            if (r1 instanceof c)
            {
                r1 = (c)r1;
                ab.a(w, ((c) (r1)).e, ((c) (r1)).g, ((c) (r1)).f, ((c) (r1)).a);
            } else
            {
                if (r1 instanceof h)
                {
                    r1 = (h)r1;
                    ab.a(w, ((h) (r1)).e, ((h) (r1)).g, ((h) (r1)).f, ((h) (r1)).a);
                    return;
                }
                if (r1 instanceof b)
                {
                    r1 = (b)r1;
                    ab.a(w, ((b) (r1)).e, ((b) (r1)).g, ((b) (r1)).f, ((b) (r1)).a, ((b) (r1)).b, ((b) (r1)).c);
                    return;
                }
            }
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new k();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            a = new j();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new q();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new p();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new o();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new n();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            a = new m();
        } else
        {
            a = new l();
        }
    }
}
