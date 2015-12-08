// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.ah;
import android.support.v4.app.an;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import com.tinder.a.d;
import com.tinder.a.f;
import com.tinder.activities.ActivityMain;
import com.tinder.e.h;
import com.tinder.f.ak;
import com.tinder.fragments.o;
import com.tinder.model.Match;
import com.tinder.model.SparksEvent;
import com.tinder.services.WearIntentService;
import com.tinder.utils.b;
import com.tinder.utils.e;
import com.tinder.utils.v;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.tinder.managers:
//            a, ManagerApp, i, ad, 
//            d, ae, z

public final class ManagerNotifications
    implements com.tinder.utils.b.c
{
    public static final class NotificationType extends Enum
    {

        public static final NotificationType a;
        public static final NotificationType b;
        public static final NotificationType c;
        public static final NotificationType d;
        public static final NotificationType e;
        public static final NotificationType f;
        public static final NotificationType g;
        private static final NotificationType i[];
        int h;

        public static NotificationType valueOf(String s)
        {
            return (NotificationType)Enum.valueOf(com/tinder/managers/ManagerNotifications$NotificationType, s);
        }

        public static NotificationType[] values()
        {
            return (NotificationType[])i.clone();
        }

        static 
        {
            a = new NotificationType("MATCH_NEW", 0, 0xff39ca77);
            b = new NotificationType("MESSAGE_NEW", 1, 0xff318ff6);
            c = new NotificationType("MESSAGE_FAILED", 2, 0xffee6146);
            d = new NotificationType("SUPER_LIKE", 3, 0xff2494a7);
            e = new NotificationType("ALERT", 4, 0xffeb6a4f);
            f = new NotificationType("ID_TAKEN", 5, 0xffee6146);
            g = new NotificationType("ID_ACCEPTED", 6, 0xff39ca77);
            i = (new NotificationType[] {
                a, b, c, d, e, f, g
            });
        }

        private NotificationType(String s, int i1, int j1)
        {
            super(s, i1);
            h = j1;
        }
    }

    static interface a
    {

        public abstract void a();

        public abstract void a(Match match);

        public abstract void a(Match match, Bitmap bitmap);
    }


    public final Context a;
    public final NotificationManager b;
    public Notification c;
    public PendingIntent d;
    public String e;
    Map f;
    ArrayList g;
    public ae h;
    private String i;
    private LinkedList j;
    private b k;
    private c l;
    private i m;
    private z n;
    private ad o;

    public ManagerNotifications(Context context, i i1, z z, ad ad1, ae ae, c c1)
    {
        f = new HashMap();
        j = new LinkedList();
        g = new ArrayList();
        m = i1;
        n = z;
        o = ad1;
        h = ae;
        a = context;
        l = c1;
        b = (NotificationManager)context.getSystemService("notification");
        i = "";
        e = "Tinder";
        k = new b(this);
    }

    private PendingIntent a(Match match)
    {
        String s = (new StringBuilder("/api/matches/send_message/")).append(match.getId()).toString();
        Intent intent = new Intent(a, com/tinder/services/WearIntentService);
        intent.putExtra("path", s);
        intent.putExtra("match_id", match.getId());
        return PendingIntent.getService(a, 2021, intent, 0x8000000);
    }

    private void a()
    {
        long l1 = System.currentTimeMillis();
        for (Long long1 = (Long)j.peekFirst(); long1 != null && Long.valueOf(l1).longValue() - long1.longValue() > 3500L; long1 = (Long)j.peekFirst())
        {
            j.pop();
        }

    }

    static void a(ManagerNotifications managernotifications, String s, NotificationType notificationtype, Match match, Bitmap bitmap)
    {
        Object obj;
        char c1;
label0:
        {
            (new StringBuilder("message=")).append(s).append(", notificationType=").append(notificationtype);
            if (match != null && !match.getId().equals(com.tinder.fragments.o.b()))
            {
                obj = an.a(managernotifications.a);
                if (notificationtype.equals(NotificationType.a))
                {
                    Object obj1 = new Intent(managernotifications.a, com/tinder/activities/ActivityMain);
                    ((Intent) (obj1)).setFlags(0x10008000);
                    ((Intent) (obj1)).putExtra("match", match);
                    ((Intent) (obj1)).putExtra("from_push", true);
                    ((Intent) (obj1)).putExtra("is_match", true);
                    ((an) (obj)).a(com/tinder/activities/ActivityMain);
                    ((an) (obj)).a(((Intent) (obj1)));
                    managernotifications.i = managernotifications.a.getString(0x7f060148);
                    obj1 = new SparksEvent("Push.Match");
                    ((SparksEvent) (obj1)).put("matchId", match.getId());
                    com.tinder.managers.a.a(((SparksEvent) (obj1)));
                    c1 = '\u22B9';
                } else
                {
                    Object obj2 = new Intent(managernotifications.a, com/tinder/activities/ActivityMain);
                    ((Intent) (obj2)).setFlags(0x10008000);
                    ((Intent) (obj2)).putExtra("match", match);
                    ((Intent) (obj2)).putExtra("from_push", true);
                    ((Intent) (obj2)).putExtra("is_message", true);
                    ((an) (obj)).a(com/tinder/activities/ActivityMain);
                    ((an) (obj)).a(((Intent) (obj2)));
                    managernotifications.i = String.format(managernotifications.a.getString(0x7f060149), new Object[] {
                        match.getName()
                    });
                    obj2 = new SparksEvent("Push.Message");
                    ((SparksEvent) (obj2)).put("matchId", match.getId());
                    com.tinder.managers.a.a(((SparksEvent) (obj2)));
                    c1 = '\u22B8';
                }
                if (!com.tinder.managers.ManagerApp.f())
                {
                    break label0;
                }
                bitmap = managernotifications.m;
                managernotifications = managernotifications. new Runnable(s, notificationtype, match) {

                    final String a;
                    final NotificationType b;
                    final Match c;
                    final ManagerNotifications d;

                    public final void run()
                    {
                        d.b(a, b, c.getName());
                    }

            
            {
                d = ManagerNotifications.this;
                a = s;
                b = notificationtype;
                c = match;
                super();
            }
                };
                if (((i) (bitmap)).d == null)
                {
                    bitmap.d = new HashSet(1);
                }
                ((i) (bitmap)).d.add(managernotifications);
            }
            return;
        }
        if (((an) (obj)).b.isEmpty())
        {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent aintent[] = (Intent[])((an) (obj)).b.toArray(new Intent[((an) (obj)).b.size()]);
        aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
        managernotifications.d = an.a.a(((an) (obj)).c, aintent);
        obj = new android.support.v4.app.aa.d(managernotifications.a);
        if (bitmap == null)
        {
            bitmap = BitmapFactory.decodeResource(managernotifications.a.getResources(), 0x7f020233);
        }
        ((android.support.v4.app.aa.d) (obj)).setDefaults(6).setContentIntent(managernotifications.d).setContentTitle(managernotifications.e).setContentText(managernotifications.i).setStyle((new android.support.v4.app.aa.c()).c(s)).setOnlyAlertOnce(true).setAutoCancel(true).setTicker(managernotifications.i).setSmallIcon(0x7f0200fe).setLargeIcon(bitmap);
        if (notificationtype == com.tinder.managers.NotificationType.b)
        {
            notificationtype = managernotifications.a.getResources().getString(0x7f06021a);
            s = managernotifications.a.getResources().getString(0x7f06021c);
            bitmap = new android.support.v4.app.ai.a("chat_msg");
            bitmap.a = notificationtype;
            bitmap = bitmap.a();
            notificationtype = new android.support.v4.app.aa.a.a(0x7f020240, notificationtype, managernotifications.a(match));
            notificationtype.a(bitmap);
            s = new android.support.v4.app.aa.a.a(0x7f020241, s, managernotifications.b(match));
            bitmap = new android.support.v4.app.aa.r();
            bitmap.a(notificationtype.a());
            bitmap.a(s.a());
            ((android.support.v4.app.aa.d) (obj)).extend(bitmap);
            s = ((android.support.v4.app.aa.d) (obj)).build();
        } else
        {
            s = managernotifications.a.getResources().getString(0x7f06021c);
            notificationtype = managernotifications.a.getResources().getString(0x7f06021b);
            bitmap = new android.support.v4.app.ai.a("chat_msg");
            bitmap.a = notificationtype;
            bitmap = bitmap.a();
            notificationtype = new android.support.v4.app.aa.a.a(0x7f020240, notificationtype, managernotifications.a(match));
            notificationtype.a(bitmap);
            s = new android.support.v4.app.aa.a.a(0x7f020241, s, managernotifications.b(match));
            bitmap = new android.support.v4.app.aa.r();
            bitmap.a(notificationtype.a());
            bitmap.a(s.a());
            ((android.support.v4.app.aa.d) (obj)).extend(bitmap);
            s = ((android.support.v4.app.aa.d) (obj)).build();
        }
        managernotifications.c = s;
        managernotifications.c = ((android.support.v4.app.aa.d) (obj)).build();
        ah.a(managernotifications.a).a(match.getId(), c1, managernotifications.c);
    }

    private PendingIntent b(Match match)
    {
        Intent intent = new Intent(a, com/tinder/services/WearIntentService);
        intent.putExtra("match", match);
        intent.putExtra("path", "/start/profile/match");
        return PendingIntent.getService(a, 2022, intent, 0x8000000);
    }

    public final void a(String s)
    {
        if (com.tinder.managers.ManagerApp.f())
        {
            b(s, com.tinder.managers.NotificationType.e, null);
            return;
        } else
        {
            Object obj = new Intent(a, com/tinder/activities/ActivityMain);
            ((Intent) (obj)).setFlags(0x10008000);
            d = PendingIntent.getActivity(a, 0, ((Intent) (obj)), 0x40000000);
            obj = new android.support.v4.app.aa.d(a);
            Bitmap bitmap = BitmapFactory.decodeResource(a.getResources(), 0x7f020233);
            ((android.support.v4.app.aa.d) (obj)).setDefaults(6).setContentIntent(d).setContentTitle(e).setStyle((new android.support.v4.app.aa.c()).c(s)).setContentText(s).setOnlyAlertOnce(true).setAutoCancel(true).setTicker(s).setSmallIcon(0x7f0200fe).setLargeIcon(bitmap);
            c = ((android.support.v4.app.aa.d) (obj)).build();
            b.notify(8887, c);
            bitmap.recycle();
            return;
        }
    }

    public final void a(String s, NotificationType notificationtype, String s1)
    {
        (new StringBuilder("message=")).append(s).append(", notificationType=").append(notificationtype);
        boolean flag1 = o.a;
        boolean flag;
        if (notificationtype.equals(NotificationType.a))
        {
            if (flag1 && o.c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = flag1;
            if (notificationtype.equals(com.tinder.managers.NotificationType.b))
            {
                if (flag1 && o.d)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
        }
        if (flag)
        {
            notificationtype = new a(s, notificationtype) {

                final String a;
                final NotificationType b;
                final ManagerNotifications c;

                public final void a()
                {
                    v.b("Failed loading match, not adding to cache but still firing notification.");
                    c.a(a);
                }

                public final void a(Match match)
                {
                    ManagerNotifications.a(c, a, b, match, null);
                }

                public final void a(Match match, Bitmap bitmap)
                {
                    ManagerNotifications.a(c, a, b, match, bitmap);
                }

            
            {
                c = ManagerNotifications.this;
                a = s;
                b = notificationtype;
                super();
            }
            };
            s = m;
            notificationtype = new h(notificationtype) {

                final a a;
                final ManagerNotifications b;

                public final void a()
                {
                    v.b("failed to get match for push notification");
                    a.a();
                }

                public final void a(Match match)
                {
                    String s2 = match.getThumbnailUrl();
                    int i1 = (int)b.a.getResources().getDimension(0x7f090152);
                    x x = new x(this, s2, match) {

                        final String a;
                        final Match b;
                        final _cls1 c;

                        public final void onBitmapFailed(Drawable drawable)
                        {
                            c.b.f.remove(a);
                            c.a.a(b);
                        }

                        public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
                        {
                            c.b.f.remove(a);
                            c.a.a(b, bitmap);
                        }

                        public final void onPrepareLoad(Drawable drawable)
                        {
                        }

            
            {
                c = _pcls1;
                a = s;
                b = match;
                super();
            }
                    };
                    if (TextUtils.isEmpty(s2))
                    {
                        match = com.tinder.utils.e.a(new com.tinder.utils.e.a(this) {

                            final _cls1 a;

                            public final Object a()
                            {
                                return BitmapFactory.decodeResource(a.b.a.getResources(), 0x7f020233);
                            }

            
            {
                a = _pcls1;
                super();
            }
                        });
                        match.a = new com.tinder.utils.e.c(this, x) {

                            final x a;
                            final _cls1 b;

                            public final void a(Object obj)
                            {
                                a.onBitmapLoaded((Bitmap)obj, com.squareup.picasso.Picasso.LoadedFrom.b);
                            }

            
            {
                b = _pcls1;
                a = x1;
                super();
            }
                        };
                        match.a(false);
                        return;
                    } else
                    {
                        b.f.put(s2, x);
                        Picasso.a(b.a).a(match.getThumbnailUrl()).b(i1, i1).a(x);
                        return;
                    }
                }

            
            {
                b = ManagerNotifications.this;
                a = a1;
                super();
            }
            };
            s.a(s1);
            s.b = true;
            s1 = (new StringBuilder()).append(((i) (s)).c.h).append(s1).toString();
            i._cls3 _lcls3 = new i._cls3(s, notificationtype);
            s = new i._cls4(s, notificationtype);
            com.tinder.managers.ManagerApp.h().g();
            s = new d(0, s1, null, _lcls3, s, com.tinder.managers.d.b());
            com.tinder.managers.ManagerApp.b().a(s);
            return;
        } else
        {
            v.b("Push notifications turned off. Not firing new match notification.");
            return;
        }
    }

    public final void b(String s)
    {
        b.cancel(s, 8889);
        b.cancel(s, 8888);
        b.cancel(s, 8887);
    }

    public final void b(String s, NotificationType notificationtype, String s1)
    {
        a();
        boolean flag;
        if (j.size() < 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && ManagerApp.g() && com.tinder.managers.ManagerApp.f())
        {
            a();
            if (j.size() == 0)
            {
                long l1 = System.currentTimeMillis();
                j.add(Long.valueOf(l1));
            } else
            {
                long l2 = ((Long)j.getLast()).longValue();
                j.add(Long.valueOf(l2 + 3500L));
            }
            (new Handler(Looper.getMainLooper())).post(new Runnable(s, notificationtype, s1) {

                final String a;
                final NotificationType b;
                final String c;
                final ManagerNotifications d;

                public final void run()
                {
                    View view;
                    TextView textview;
                    (new StringBuilder("message=")).append(a).append(", notificationType=").append(b);
                    view = ((LayoutInflater)d.a.getSystemService("layout_inflater")).inflate(0x7f0300b5, null);
                    LinearLayout linearlayout = (LinearLayout)view.findViewById(0x7f0e0367);
                    textview = (TextView)view.findViewById(0x7f0e01b5);
                    view.findViewById(0x7f0e0065);
                    linearlayout.setBackgroundColor(b.h);
                    static final class _cls5
                    {

                        static final int a[];

                        static 
                        {
                            a = new int[NotificationType.values().length];
                            try
                            {
                                a[NotificationType.a.ordinal()] = 1;
                            }
                            catch (NoSuchFieldError nosuchfielderror4) { }
                            try
                            {
                                a[com.tinder.managers.NotificationType.c.ordinal()] = 2;
                            }
                            catch (NoSuchFieldError nosuchfielderror3) { }
                            try
                            {
                                a[com.tinder.managers.NotificationType.b.ordinal()] = 3;
                            }
                            catch (NoSuchFieldError nosuchfielderror2) { }
                            try
                            {
                                a[com.tinder.managers.NotificationType.d.ordinal()] = 4;
                            }
                            catch (NoSuchFieldError nosuchfielderror1) { }
                            try
                            {
                                a[com.tinder.managers.NotificationType.e.ordinal()] = 5;
                            }
                            catch (NoSuchFieldError nosuchfielderror)
                            {
                                return;
                            }
                        }
                    }

                    _cls5.a[b.ordinal()];
                    JVM INSTR tableswitch 1 5: default 136
                //                               1 237
                //                               2 256
                //                               3 275
                //                               4 334
                //                               5 345;
                       goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
                    v.a("Notification type not found");
                    if (TextUtils.isEmpty(a)) goto _L8; else goto _L7
_L7:
                    textview.setText(a);
_L10:
                    Toast toast = new Toast(d.a);
                    toast.setGravity(55, 0, (int)d.a.getResources().getDimension(0x7f090076));
                    toast.setDuration(1);
                    toast.setView(view);
                    d.g.add(toast);
                    toast.show();
                    textview.setOnClickListener(new android.view.View.OnClickListener(this, toast) {

                        final Toast a;
                        final _cls4 b;

                        public final void onClick(View view)
                        {
                            a.cancel();
                        }

            
            {
                b = _pcls4;
                a = toast;
                super();
            }
                    });
_L8:
                    return;
_L2:
                    textview.setText(d.a.getString(0x7f060148));
                    continue; /* Loop/switch isn't completed */
_L3:
                    textview.setText(d.a.getString(0x7f060143));
                    continue; /* Loop/switch isn't completed */
_L4:
                    if (c == null)
                    {
                        textview.setText(d.a.getString(0x7f060144));
                    } else
                    {
                        textview.setText(String.format(d.a.getString(0x7f060149), new Object[] {
                            c
                        }));
                    }
                    continue; /* Loop/switch isn't completed */
_L5:
                    textview.setText(a);
                    continue; /* Loop/switch isn't completed */
_L6:
                    textview.setText(a);
                    if (true) goto _L10; else goto _L9
_L9:
                }

            
            {
                d = ManagerNotifications.this;
                a = s;
                b = notificationtype;
                c = s1;
                super();
            }
            });
        }
    }

    public final void l()
    {
        b.cancelAll();
    }

    public final void m()
    {
        if (!g.isEmpty())
        {
            for (Iterator iterator = g.iterator(); iterator.hasNext(); ((Toast)iterator.next()).cancel()) { }
        }
    }
}
