// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class df
    implements ch, ci
{

    private android.app.Notification.Builder a;
    private final Bundle b;
    private List c;

    public df()
    {
    }

    public df(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
            PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
            int l, CharSequence charsequence3, boolean flag2, Bundle bundle, String s, boolean flag3, String s1)
    {
        c = new ArrayList();
        context = (new android.app.Notification.Builder(context)).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean flag4;
        if ((notification.flags & 2) != 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        context = context.setOngoing(flag4);
        if ((notification.flags & 8) != 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        context = context.setOnlyAlertOnce(flag4);
        if ((notification.flags & 0x10) != 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        context = context.setAutoCancel(flag4).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 0x80) != 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        a = context.setFullScreenIntent(pendingintent1, flag4).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag1).setPriority(l).setProgress(j, k, flag);
        b = new Bundle();
        if (bundle != null)
        {
            b.putAll(bundle);
        }
        if (flag2)
        {
            b.putBoolean("android.support.localOnly", true);
        }
        if (s != null)
        {
            b.putString("android.support.groupKey", s);
            if (flag3)
            {
                b.putBoolean("android.support.isGroupSummary", true);
            } else
            {
                b.putBoolean("android.support.useSideChannel", true);
            }
        }
        if (s1 != null)
        {
            b.putString("android.support.sortKey", s1);
        }
    }

    public static void a(Context context, int i, Collection collection)
    {
        eto eto1;
        fps fps1;
        ArrayList arraylist;
        ArrayList arraylist1;
        HashSet hashset;
        Object obj;
        ArrayList arraylist2;
        Iterator iterator;
        long l;
        boolean flag;
        if (!collection.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "cannot restore 0 medias from trash.");
        l = noy.a();
        eto1 = (eto)olm.a(context, eto);
        obj = (mmv)olm.a(context, mmv);
        fps1 = (fps)olm.a(context, fps);
        context = noz.a(context, 3, "RestoreActionOp", new String[] {
            "perf"
        });
        arraylist2 = new ArrayList();
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        hashset = new HashSet();
        iterator = collection.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            hpk hpk1 = (hpk)iterator.next();
            if (hpk1.d() && !hpk1.a())
            {
                context = String.valueOf(hpk1);
                throw new IllegalStateException((new StringBuilder(String.valueOf(context).length() + 46)).append("ResolvedMedia has photo id but not media key: ").append(context).toString());
            }
            if (hpk1.e())
            {
                arraylist2.add(hpk1.a);
            }
            if (hpk1.a())
            {
                arraylist.add(hpk1.c);
                if (!hpk1.f())
                {
                    arraylist1.add(hpk1.c);
                } else
                {
                    hashset.add(hpk1.e);
                }
            }
        } while (true);
        if (!arraylist2.isEmpty())
        {
            for (obj = ((mmv) (obj)).a(new String[] {
    "logged_in"
}).iterator(); ((Iterator) (obj)).hasNext(); eto1.a(((Integer)((Iterator) (obj)).next()).intValue(), arraylist2)) { }
            fps1.a(i, new hcq(arraylist2));
        }
        if (!arraylist.isEmpty())
        {
            HashSet hashset1 = new HashSet();
            hashset1.addAll(eto1.a(i, (String[])arraylist.toArray(new String[arraylist.size()])));
            eto1.a(i, "remote_media", "media_key = ?", arraylist, eun.a, true, hashset1);
            fps1.a(i, new hcv(arraylist1, hashset));
        }
        if (context.a())
        {
            noy.a(i);
            noy.a("resolvedMedias", Integer.valueOf(collection.size()));
            noy.a("duration", l);
        }
    }

    public final android.app.Notification.Builder a()
    {
        return a;
    }

    public final void a(db db)
    {
        c.add(de.a(a, db));
    }

    public final Notification b()
    {
        Notification notification = a.build();
        Object obj = de.a(notification);
        Bundle bundle = new Bundle(b);
        Iterator iterator = b.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (((Bundle) (obj)).containsKey(s))
            {
                bundle.remove(s);
            }
        } while (true);
        ((Bundle) (obj)).putAll(bundle);
        obj = de.a(c);
        if (obj != null)
        {
            de.a(notification).putSparseParcelableArray("android.support.actionExtras", ((android.util.SparseArray) (obj)));
        }
        return notification;
    }
}
