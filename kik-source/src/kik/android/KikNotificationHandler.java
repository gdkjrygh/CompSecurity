// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.ThumbnailUtils;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.app.RemoteInput;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.kik.cache.ad;
import com.kik.cache.z;
import com.kik.g.f;
import com.kik.g.p;
import com.kik.sdkutils.ab;
import com.kik.sdkutils.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kik.a.d.a.g;
import kik.a.d.aa;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.d.s;
import kik.a.e.i;
import kik.a.e.l;
import kik.a.e.r;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.h.j;
import kik.android.chat.KikApplication;
import kik.android.g.a;
import kik.android.g.b;
import kik.android.g.c;
import kik.android.util.ae;
import kik.android.util.bx;
import kik.android.util.cq;
import kik.android.util.e;

// Referenced classes of package kik.android:
//            x, y, z, aa, 
//            ad, ae, ac

public class KikNotificationHandler extends BroadcastReceiver
{

    protected ad a;
    protected r b;
    protected l c;
    protected v d;
    protected com.kik.android.a e;
    private final NotificationManagerCompat f;
    private final Object g = new Object();
    private Context h;
    private w i;
    private i j;
    private long k;
    private int l;
    private int m;
    private f n;
    private p o;
    private final Paint p = new Paint();
    private b q;
    private com.kik.g.i r;
    private com.kik.g.i s;
    private Handler t;
    private com.kik.g.i u;
    private com.kik.g.i v;
    private com.kik.g.i w;

    public KikNotificationHandler(Context context)
    {
        k = 0L;
        l = 0;
        m = 0;
        n = new f();
        o = null;
        r = new x(this);
        s = new kik.android.y(this);
        t = new kik.android.z(this);
        u = new kik.android.aa(this);
        v = new kik.android.ad(this);
        w = new kik.android.ae(this);
        h = context;
        h.registerReceiver(this, new IntentFilter("kik.android.notificationHandler.ACTION_MESSAGE_READ"));
        h.registerReceiver(this, new IntentFilter("kik.android.notificationHandler.ACTION_MESSAGE_REPLY"));
        h.registerReceiver(this, new IntentFilter("kik.android.notificationHandler.ACTION_MESSAGE_DISMISS"));
        p.setColor(Color.parseColor("#87BF2B"));
        f = NotificationManagerCompat.from(h);
    }

    private static long a(kik.a.d.f f1)
    {
        if (f1 == null || f1.d() == null)
        {
            return System.currentTimeMillis();
        } else
        {
            return kik.a.h.j.b(f1.d().e());
        }
    }

    private PendingIntent a(kik.a.d.f f1, boolean flag)
    {
        n n1 = c.a(f1.b(), false);
        Object obj = n1;
        if (n1 == null)
        {
            obj = b.a(f1.b(), false);
        }
        f1 = new kik.android.chat.fragment.KikChatFragment.a();
        f1.a(((k) (obj)));
        int j1 = ((k) (obj)).hashCode();
        int i1 = j1;
        if (flag)
        {
            i1 = j1 * 17;
        }
        return PendingIntent.getActivity(h, i1, kik.android.chat.activity.k.a(f1, h).e(), 0x10000000);
    }

    private static Bitmap a(Bitmap bitmap)
    {
        Bitmap bitmap1 = bitmap;
        if (y.a(21))
        {
            bitmap1 = com.kik.m.k.a(bitmap);
        }
        return bitmap1;
    }

    private android.support.v4.app.NotificationCompat.Builder a(kik.a.d.f f1, k k1, boolean flag)
    {
        android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(h);
        if (f1 == null || k1 == null)
        {
            return builder;
        }
        builder.setContentTitle(a(k1, false, -1)).setColor(h.getResources().getColor(0x7f0c004b)).setSmallIcon(0x7f02019c).setGroup("group_key_kik_messages").setVibrate(new long[] {
            0L
        }).setDefaults(0).setDeleteIntent(d());
        if (flag)
        {
            android.support.v4.app.NotificationCompat.Builder builder1 = builder.setContentText(h.getString(0x7f09018b, new Object[] {
                a(k1, false, -1)
            }));
            if (k1 == null)
            {
                f1 = null;
            } else
            {
                f1 = kik.android.chat.activity.k.a(new kik.android.chat.fragment.KikConversationsFragment.a(), h).c().e();
                f1 = PendingIntent.getActivity(h, k1.hashCode() * 43, f1, 0x10000000);
            }
            builder1.setContentIntent(f1);
        } else
        {
            builder.setContentText(kik.android.g.c.a(f1.d(), h)).setContentIntent(a(f1, false));
        }
        return builder;
    }

    static p a(KikNotificationHandler kiknotificationhandler, p p1)
    {
        kiknotificationhandler.o = p1;
        return p1;
    }

    private String a(k k1, boolean flag, int i1)
    {
        return kik.android.g.c.a(h, b, k1, flag, i1);
    }

    static i a(KikNotificationHandler kiknotificationhandler)
    {
        return kiknotificationhandler.j;
    }

    private void a(int i1, Notification notification)
    {
        try
        {
            f.notify(i1, notification);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Notification notification)
        {
            bx.a(notification);
        }
    }

    private void a(android.support.v4.app.NotificationCompat.InboxStyle inboxstyle, List list)
    {
        if (list != null)
        {
            int i1 = 0;
            while (i1 < list.size() && i1 < 4) 
            {
                kik.a.d.f f1 = (kik.a.d.f)list.get(i1);
                Object obj1 = a(b.a(f1.b(), true), false, -1);
                Object obj = obj1;
                if (obj1 != null)
                {
                    obj = obj1;
                    if (((String) (obj1)).length() > 20)
                    {
                        obj = (new StringBuilder()).append(((String) (obj1)).substring(0, 20)).append("...").toString();
                    }
                }
                obj1 = new SpannableStringBuilder(((CharSequence) (obj)));
                obj = new int[1];
                obj[0] = 0x1010098;
                if (y.b(21))
                {
                    obj = h.obtainStyledAttributes(0x1030065, ((int []) (obj)));
                } else
                {
                    obj = h.obtainStyledAttributes(0x1030203, ((int []) (obj)));
                }
                ((SpannableStringBuilder) (obj1)).setSpan(new ForegroundColorSpan(((TypedArray) (obj)).getColor(0, 0xff888888)), 0, ((SpannableStringBuilder) (obj1)).length(), 33);
                ((SpannableStringBuilder) (obj1)).append("  ");
                ((SpannableStringBuilder) (obj1)).append(kik.android.g.c.a(f1.d(), h));
                inboxstyle.addLine(((CharSequence) (obj1)));
                i1++;
            }
        }
    }

    private void a(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Integer integer = (Integer)list.next();
            if (integer != null)
            {
                f.cancel(integer.intValue());
            }
        } while (true);
    }

    private void a(List list, List list1)
    {
        if (list != null)
        {
            list = new ArrayList(list);
            Collections.reverse(list);
            for (int i1 = 0; i1 < list.size(); i1++)
            {
                kik.a.d.f f1 = (kik.a.d.f)list.get(i1);
                k k2 = b.a(f1.b(), true);
                int l1 = q.a(f1);
                if (!q.a(l1) && y.a(16))
                {
                    a(l1, a(f1, k2, false).build());
                }
                q.a(k2, l1, false);
            }

            int j1 = 0;
            while (j1 < list1.size()) 
            {
                list = (kik.a.d.f)list1.get(j1);
                k k1 = b.a(list.b(), true);
                int i2 = q.a(list);
                q.a(k1, i2, false);
                j1++;
            }
        }
    }

    private void a(k k1)
    {
        if (k1 == null)
        {
            return;
        } else
        {
            kik.android.util.e.a(a, b(k1), true).a(new ac(this));
            return;
        }
    }

    private void a(boolean flag, boolean flag1, s s1, boolean flag2)
    {
        int i1 = i();
        if (i1 <= 0)
        {
            return;
        }
        android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(h);
        builder.setWhen(System.currentTimeMillis());
        Object obj = new ArrayList(j.K());
        ArrayList arraylist = new ArrayList(j.J());
        Object obj3 = new ArrayList(((java.util.Collection) (obj)));
        ((List) (obj3)).addAll(arraylist);
        obj3 = q.b(((List) (obj3)));
        if (y.a(16))
        {
            a(((List) (obj3)));
        }
        a(q.c(((List) (obj))), q.c(arraylist));
        b(s1, flag2);
        obj = q.c(((List) (obj)));
        obj3 = q.c(arraylist);
        int j1 = j();
        builder.setContentIntent(e());
        if (j1 > 1)
        {
            builder.setContentTitle((new StringBuilder()).append(j1).append(" ").append(KikApplication.f(0x7f090219)).toString());
            android.support.v4.app.NotificationCompat.InboxStyle inboxstyle = new android.support.v4.app.NotificationCompat.InboxStyle();
            if (((List) (obj)).size() > 0)
            {
                a(inboxstyle, ((List) (obj)));
                if (k())
                {
                    b(inboxstyle, ((List) (obj3)));
                }
                s1 = kik.android.g.c.a(h, b, ((List) (obj)));
                if (k() && ((List) (obj3)).size() > 0)
                {
                    s1 = KikApplication.a(0x7f09018d, new Object[] {
                        s1, Integer.valueOf(((List) (obj3)).size())
                    });
                }
                inboxstyle.setSummaryText(KikApplication.a(0x7f090185, new Object[] {
                    Integer.valueOf(i1)
                }));
                builder.setWhen(a((kik.a.d.f)((List) (obj)).get(0))).setContentText(s1).setStyle(inboxstyle);
            } else
            if (((List) (obj3)).size() > 0)
            {
                builder.setWhen(a((kik.a.d.f)((List) (obj3)).get(0))).setContentText(b(((List) (obj3))));
            }
        } else
        if (((List) (obj)).size() > 0)
        {
            builder.setContentIntent(a((kik.a.d.f)((List) (obj)).get(0), true));
            obj2 = (kik.a.d.f)((List) (obj)).get(0);
            obj3 = b.a(((kik.a.d.f) (obj2)).b(), true);
            obj = kik.android.util.e.a(a, b(((k) (obj3))));
            s1 = ((s) (obj));
            if (obj == null)
            {
                a(((k) (obj3)));
                s1 = f();
            }
            obj = b(s1);
            s1 = ((s) (obj));
            if (!((k) (obj3)).t())
            {
                s1 = a(((Bitmap) (obj)));
            }
            builder.setWhen(a(((kik.a.d.f) (obj2))));
            builder.setLargeIcon(s1).setContentTitle(a(((k) (obj3)), false, -1)).setContentText(kik.android.g.c.a(((kik.a.d.f) (obj2)).d(), h));
        } else
        if (((List) (obj3)).size() > 0)
        {
            builder.setContentIntent(e());
            obj2 = (kik.a.d.f)((List) (obj3)).get(0);
            obj3 = b.a(((kik.a.d.f) (obj2)).b(), true);
            Object obj1 = b(f());
            s1 = ((s) (obj1));
            if (!((k) (obj3)).t())
            {
                s1 = a(((Bitmap) (obj1)));
            }
            obj1 = a(((k) (obj3)), false, -1);
            builder.setWhen(a(((kik.a.d.f) (obj2))));
            builder.setLargeIcon(s1).setContentTitle(((CharSequence) (obj1))).setContentText(h.getString(0x7f09018b, new Object[] {
                obj1
            }));
        }
        obj = builder.setSmallIcon(0x7f02019c);
        flag2 = d.p("kik.vibrate").booleanValue();
        s1 = new long[1];
        s1[0] = 0L;
        if (flag2)
        {
            s1 = new long[4];
            s _tmp = s1;
            s1[0] = 5L;
            s1[1] = 30L;
            s1[2] = 65L;
            s1[3] = 290L;
            if (!flag1)
            {
                s1 = new long[6];
                s _tmp1 = s1;
                s1[0] = 5L;
                s1[1] = 50L;
                s1[2] = 45L;
                s1[3] = 290L;
                s1[4] = 300L;
                s1[5] = 150L;
            }
        }
        ((android.support.v4.app.NotificationCompat.Builder) (obj)).setVibrate(s1).setColor(h.getResources().getColor(0x7f0c004b)).setGroup("group_key_kik_messages").setGroupSummary(true).setDeleteIntent(d());
        if (q.c() <= 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        builder.setLocalOnly(flag1);
        if (q.c() == 1)
        {
            s1 = q.b();
            if (s1.size() > 0 && s1.get(0) != null)
            {
                Object obj2 = ((a)s1.get(0)).a();
                if (obj2 != null && ((k) (obj2)).b() != null)
                {
                    android.support.v4.app.NotificationCompat.WearableExtender wearableextender;
                    if (j.a(j.a(((k) (obj2)).b())) != 1)
                    {
                        s1 = f();
                    } else
                    if (((k) (obj2)).t() && cq.c(((k) (obj2)).r()))
                    {
                        s1 = g();
                    } else
                    {
                        Bitmap bitmap = kik.android.util.e.a(a, b(((k) (obj2))));
                        s1 = bitmap;
                        if (bitmap == null)
                        {
                            a(((k) (obj2)));
                            s1 = f();
                        }
                    }
                    wearableextender = new android.support.v4.app.NotificationCompat.WearableExtender();
                    wearableextender.setBackground(s1);
                    builder.extend(wearableextender);
                }
            }
        } else
        {
            try
            {
                s1 = new android.support.v4.app.NotificationCompat.WearableExtender();
                s1.setBackground(BitmapFactory.decodeResource(h.getResources(), 0x7f020006));
                builder.extend(s1);
            }
            // Misplaced declaration of an exception variable
            catch (s s1)
            {
                bx.a(s1);
            }
        }
        if (d.p("kik.sound").booleanValue())
        {
            builder.setDefaults(1);
        }
        if (flag)
        {
            builder.setVibrate(new long[] {
                0L
            });
            builder.setDefaults(0);
        }
        if (ab.a() - k < 2000L)
        {
            builder.setDefaults(0);
        } else
        {
            k = ab.a();
        }
        if (y.a(19))
        {
            builder.setLights(kik.android.g.c.a(d.n("kik.led.color")), 1000, 1000);
        }
        s1 = builder.build();
        s1.flags = ((Notification) (s1)).flags | 1;
        s1.ledARGB = kik.android.g.c.a(d.n("kik.led.color"));
        a(0, ((Notification) (s1)));
    }

    private Bitmap b(Bitmap bitmap)
    {
        Object obj;
        Object obj1;
        int i1;
        int j1;
        obj = h.getResources();
        i1 = (int)((Resources) (obj)).getDimension(0x1050006);
        j1 = (int)((Resources) (obj)).getDimension(0x1050005);
        obj = bitmap;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        obj = bitmap;
        obj1 = bitmap;
        i1 = Math.min(j1, i1);
        obj = bitmap;
        obj1 = bitmap;
        bitmap = ThumbnailUtils.extractThumbnail(bitmap, i1, i1);
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (bitmap.isMutable())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        obj = bitmap.copy(bitmap.getConfig(), true);
        Canvas canvas;
        if (obj != null)
        {
            bitmap = ((Bitmap) (obj));
        }
        obj = bitmap;
        obj1 = bitmap;
        canvas = new Canvas(bitmap);
        obj = bitmap;
        obj1 = bitmap;
        j1 = i1 / 2;
        obj = bitmap;
        obj1 = bitmap;
        canvas.drawRect(new RectF(j1, i1 - 2, j1 + 1, i1 - 1), p);
        obj = bitmap;
        return ((Bitmap) (obj));
        obj1;
        bitmap = ((Bitmap) (obj));
        obj = obj1;
_L4:
        bx.a(((Throwable) (obj)));
        return bitmap;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        bitmap = ((Bitmap) (obj1));
_L2:
        bx.a(illegalstateexception);
        return bitmap;
        illegalstateexception;
        if (true) goto _L2; else goto _L1
_L1:
        illegalstateexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static NotificationManagerCompat b(KikNotificationHandler kiknotificationhandler)
    {
        return kiknotificationhandler.f;
    }

    private z b(k k1)
    {
        if (k1 == null)
        {
            return null;
        }
        if (k1.t() && cq.c(k1.r()))
        {
            return com.kik.cache.v.a((n)k1, z.e, android.graphics.Bitmap.Config.ARGB_8888, z.d, b, false, a, e);
        } else
        {
            return com.kik.cache.k.a(k1, z.e, z.d, false, 1, false, false);
        }
    }

    private CharSequence b(List list)
    {
        if (list == null || list.size() <= 0)
        {
            return null;
        }
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        for (int i1 = 0; i1 < list.size() && i1 < 4; i1++)
        {
            kik.a.d.f f1 = (kik.a.d.f)list.get(i1);
            spannablestringbuilder.append(a(b.a(f1.b(), true), true, -1)).append(", ");
        }

        if (spannablestringbuilder.length() > 1)
        {
            spannablestringbuilder.replace(spannablestringbuilder.length() - 2, spannablestringbuilder.length(), "");
        }
        if (list.size() > 4)
        {
            spannablestringbuilder.append("...");
        }
        return h.getString(0x7f090192, new Object[] {
            spannablestringbuilder.toString()
        });
    }

    private void b(android.support.v4.app.NotificationCompat.InboxStyle inboxstyle, List list)
    {
        if (list == null)
        {
            return;
        } else
        {
            inboxstyle.addLine(b(list));
            return;
        }
    }

    private void b(s s1, boolean flag)
    {
        if (s1 != null) goto _L2; else goto _L1
_L1:
        Object obj1;
        return;
_L2:
        if ((obj1 = j.a(s1.i())) == null) goto _L1; else goto _L3
_L3:
        k k1;
        int l1;
        k1 = b.a(((kik.a.d.f) (obj1)).b(), true);
        l1 = q.a(((kik.a.d.f) (obj1)));
        if (!y.a(16)) goto _L5; else goto _L4
_L4:
        android.support.v4.app.NotificationCompat.Builder builder = a(((kik.a.d.f) (obj1)), k1, flag);
        if (flag) goto _L7; else goto _L6
_L6:
        if (obj1 != null) goto _L9; else goto _L8
_L8:
        s1 = null;
_L11:
        if (s1 != null)
        {
            builder.extend(s1);
        }
_L7:
        a(l1, builder.build());
_L5:
        q.a(k1, l1);
        return;
_L9:
        Object obj;
        android.support.v4.app.NotificationCompat.CarExtender.UnreadConversation.Builder builder1;
        obj = b.a(((kik.a.d.f) (obj1)).b(), true);
        builder1 = (new android.support.v4.app.NotificationCompat.CarExtender.UnreadConversation.Builder(a(((k) (obj)), false, 4))).setLatestTimestamp(System.currentTimeMillis());
        java.util.Vector vector = ((kik.a.d.f) (obj1)).b(true);
        int i1 = vector.size() - 1;
        while (i1 >= 0) 
        {
            Context context;
            kik.a.d.a.a a1;
            boolean flag1;
label0:
            {
                s1 = (s)vector.get(i1);
                context = h;
                a1 = (kik.a.d.a.a)kik.a.d.a.g.a(s1, kik/a/d/a/a);
                boolean flag2 = false;
                flag1 = flag2;
                if (a1 == null)
                {
                    break label0;
                }
                if (!"com.kik.ext.camera".equals(a1.u()))
                {
                    flag1 = flag2;
                    if (!"com.kik.ext.gallery".equals(a1.u()))
                    {
                        break label0;
                    }
                }
                flag1 = true;
            }
            s1 = s1.a();
            if (flag1)
            {
                s1 = context.getString(0x7f090188);
            } else
            if (a1 != null)
            {
                s1 = context.getString(0x7f090186, new Object[] {
                    ae.a(a1)
                });
            }
            builder1.addMessage(s1);
            i1--;
        }
        if (!((k) (obj)).t() || !cq.c(((k) (obj)).r()))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = h();
_L12:
        s1 = c(s1);
        obj = h;
        int j1 = ((kik.a.d.f) (obj1)).b().hashCode();
        Object obj2 = ((kik.a.d.f) (obj1)).b();
        obj = PendingIntent.getBroadcast(((Context) (obj)), j1, (new Intent()).addFlags(32).setAction("kik.android.notificationHandler.ACTION_MESSAGE_READ").putExtra("conversation_jid", ((String) (obj2))), 0x8000000);
        obj2 = (new android.support.v4.app.RemoteInput.Builder("extra_voice_reply")).setLabel("reply").build();
        Context context1 = h;
        j1 = ((kik.a.d.f) (obj1)).b().hashCode();
        obj1 = ((kik.a.d.f) (obj1)).b();
        obj1 = PendingIntent.getBroadcast(context1, j1, (new Intent()).addFlags(32).setAction("kik.android.notificationHandler.ACTION_MESSAGE_REPLY").putExtra("conversation_jid", ((String) (obj1))), 0x8000000);
        builder1.setLatestTimestamp(System.currentTimeMillis()).setReadPendingIntent(((PendingIntent) (obj))).setReplyAction(((PendingIntent) (obj1)), ((RemoteInput) (obj2)));
        s1 = (new android.support.v4.app.NotificationCompat.CarExtender()).setUnreadConversation(builder1.build()).setColor(h.getResources().getColor(0x7f0c004b)).setLargeIcon(s1);
        if (true) goto _L11; else goto _L10
_L10:
        s1 = b(((k) (obj)));
        obj = kik.android.util.e.a(a, s1);
        s1 = ((s) (obj));
        if (obj == null)
        {
            s1 = f();
        }
          goto _L12
        if (true) goto _L11; else goto _L13
_L13:
    }

    private static Bitmap c(Bitmap bitmap)
    {
        int i1 = KikApplication.a(56);
        Bitmap bitmap1 = bitmap;
        if (bitmap != null)
        {
            try
            {
                bitmap1 = ThumbnailUtils.extractThumbnail(bitmap, i1, i1);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                bx.a(outofmemoryerror);
                return bitmap;
            }
        }
        return bitmap1;
    }

    static Object c(KikNotificationHandler kiknotificationhandler)
    {
        return kiknotificationhandler.g;
    }

    private PendingIntent d()
    {
        Intent intent = (new Intent()).addFlags(32).setAction("kik.android.notificationHandler.ACTION_MESSAGE_DISMISS");
        return PendingIntent.getBroadcast(h, 14592, intent, 0x8000000);
    }

    static p d(KikNotificationHandler kiknotificationhandler)
    {
        return kiknotificationhandler.o;
    }

    private PendingIntent e()
    {
        Intent intent = kik.android.chat.activity.k.a(new kik.android.chat.fragment.KikConversationsFragment.a(), h).c().e();
        return PendingIntent.getActivity(h, 0, intent, 0x10000000);
    }

    private Bitmap f()
    {
        if (h == null)
        {
            return null;
        } else
        {
            return BitmapFactory.decodeResource(h.getResources(), 0x7f020305);
        }
    }

    private Bitmap g()
    {
        if (h == null)
        {
            return null;
        }
        Bitmap bitmap;
        try
        {
            bitmap = BitmapFactory.decodeResource(h.getResources(), 0x7f020135);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            bx.a(outofmemoryerror);
            return null;
        }
        return bitmap;
    }

    private Bitmap h()
    {
        if (h == null)
        {
            return null;
        }
        Bitmap bitmap;
        try
        {
            bitmap = BitmapFactory.decodeResource(h.getResources(), 0x7f020136);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            bx.a(outofmemoryerror);
            return null;
        }
        return bitmap;
    }

    private int i()
    {
        boolean flag = k();
        int j1 = j.H();
        int i1;
        if (flag)
        {
            i1 = j.I();
        } else
        {
            i1 = 0;
        }
        return i1 + j1;
    }

    private int j()
    {
        boolean flag = k();
        List list = j.K();
        if (flag)
        {
            list.addAll(j.J());
        }
        return q.c(list).size();
    }

    private boolean k()
    {
        boolean flag = false;
        aa aa1 = i.d();
        if (aa1.h != null)
        {
            flag = aa1.h.booleanValue();
        }
        return flag;
    }

    public final void a()
    {
        f.cancelAll();
    }

    public final void a(s s1, boolean flag)
    {
        if (s1 != null && !s1.k())
        {
            kik.a.d.f f1 = j.a(s1.i());
            boolean flag1;
            if (j.a(f1) == 2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag1 || !j.a(f1, s1))
            {
                a(false, flag, s1, flag1);
                m = j();
                l = i();
                return;
            }
        }
    }

    public final void a(w w1, i i1, v v1, com.kik.e.a a1)
    {
        a1.a(this);
        j = i1;
        i = w1;
        n.a(j.m(), u);
        n.a(j.l(), v);
        n.a(j.n(), w);
        n.a(j.b(), r);
        n.a(j.k(), s);
        q = new b(b, v1);
        w1 = new ArrayList(j.K());
        i1 = new ArrayList(j.J());
        v1 = new ArrayList();
        v1.addAll(w1);
        v1.addAll(i1);
        q.a(v1);
    }

    public final void a(boolean flag)
    {
        boolean flag1;
        int i1;
        int j1;
        flag1 = true;
        i1 = j();
        j1 = i();
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        long l1 = Math.max(0L, (k + 2000L) - ab.a());
        t.sendEmptyMessageDelayed(0, Math.min(2000L, l1));
_L4:
        m = i1;
        l = j1;
        return;
_L2:
        if (i1 != m || j1 != l)
        {
            a(flag, false, ((s) (null)), false);
        } else
        if (i1 == 1 && flag)
        {
            if (q.c() <= 0)
            {
                flag1 = false;
            }
            if (flag1)
            {
                a(flag, false, ((s) (null)), false);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b()
    {
        n.a();
        h.unregisterReceiver(this);
    }

    public final void c()
    {
        if (q != null)
        {
            q.a();
            a(false);
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!"kik.android.notificationHandler.ACTION_MESSAGE_READ".equals(intent.getAction()))
        {
            break; /* Loop/switch isn't completed */
        }
        if (intent != null)
        {
            context = intent.getStringExtra("conversation_jid");
            context = j.a(context);
            if (context != null)
            {
                j.b(context);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!"kik.android.notificationHandler.ACTION_MESSAGE_REPLY".equals(intent.getAction()))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (intent == null) goto _L1; else goto _L4
_L4:
        kik.a.d.f f1;
        context = intent.getStringExtra("conversation_jid");
        f1 = j.a(context);
        if (f1 == null) goto _L1; else goto _L5
_L5:
        context = RemoteInput.getResultsFromIntent(intent);
        if (context != null)
        {
            context = context.getCharSequence("extra_voice_reply");
        } else
        {
            context = null;
        }
        if (context == null) goto _L1; else goto _L6
_L6:
        j.b(f1);
        j.d(kik.a.d.s.a(context.toString(), f1.b(), kik.a.d.s.a.a));
        return;
        if (!"kik.android.notificationHandler.ACTION_MESSAGE_DISMISS".equals(intent.getAction()) || intent == null) goto _L1; else goto _L7
_L7:
        q.d();
        return;
    }
}
