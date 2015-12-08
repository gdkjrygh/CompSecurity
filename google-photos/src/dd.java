// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class dd
    implements ci
{

    private android.app.Notification.Builder a;

    public dd()
    {
    }

    public dd(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
            PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag)
    {
        context = (new android.app.Notification.Builder(context)).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean flag1;
        if ((notification.flags & 2) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        context = context.setOngoing(flag1);
        if ((notification.flags & 8) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        context = context.setOnlyAlertOnce(flag1);
        if ((notification.flags & 0x10) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        context = context.setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 0x80) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a = context.setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setProgress(j, k, flag);
    }

    public static int a(SQLiteDatabase sqlitedatabase, gka gka1)
    {
        sqlitedatabase = sqlitedatabase.rawQuery("SELECT COUNT(DISTINCT dedup_key) FROM on_device_search WHERE tag = ?", new String[] {
            gka1.a()
        });
        boolean flag = sqlitedatabase.moveToFirst();
        if (!flag)
        {
            sqlitedatabase.close();
            return -1;
        }
        int i = sqlitedatabase.getInt(0);
        sqlitedatabase.close();
        return i;
        gka1;
        sqlitedatabase.close();
        throw gka1;
    }

    public static String a(int i, int j)
    {
        StringBuilder stringbuilder = new StringBuilder("SELECT dedup_key FROM on_device_search WHERE tag = ? ORDER BY capture_day DESC, capture_offset DESC, dedup_key DESC");
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            stringbuilder.append(" LIMIT ");
            stringbuilder.append(j);
        }
        if (i > 0)
        {
            p.a(flag, "OFFSET must be used with LIMIT");
            stringbuilder.append(" OFFSET ");
            stringbuilder.append(i);
        }
        return stringbuilder.toString();
    }

    public static void a(Context context, int i, Collection collection, gaw gaw1, int j)
    {
        noz noz1;
        HashSet hashset;
        ArrayList arraylist;
        ArrayList arraylist1;
        eto eto1;
        HashSet hashset1;
        Object obj;
        Object obj1;
        long l;
        boolean flag;
        if (!collection.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "cannot move 0 medias to trash.");
        l = noy.a();
        eto1 = (eto)olm.a(context, eto);
        noz1 = noz.a(context, 3, "MoveToTrashActionOp", new String[] {
            "perf"
        });
        obj1 = new ArrayList();
        hashset1 = new HashSet();
        hashset = new HashSet();
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        obj = collection.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            hpk hpk1 = (hpk)((Iterator) (obj)).next();
            if (hpk1.e())
            {
                hashset1.add(hpk1.e);
                ((List) (obj1)).add(hpk1.a);
            }
            if (hpk1.a())
            {
                arraylist1.add(hpk1.c);
                if (!hpk1.f())
                {
                    arraylist.add(hpk1.c);
                } else
                {
                    hashset.add(hpk1.e);
                }
            }
        } while (true);
        obj = (fps)olm.a(context, fps);
        Object obj2 = (mmv)olm.a(context, mmv);
        if (gaw1.a(gav.a) && !((List) (obj1)).isEmpty())
        {
            for (obj2 = ((mmv) (obj2)).a(new String[] {
    "logged_in"
}).iterator(); ((Iterator) (obj2)).hasNext(); eto1.a(((Integer)((Iterator) (obj2)).next()).intValue(), ((Collection) (obj1)), false)) { }
            obj1 = new hcn(hashset1);
            if (j > 0)
            {
                ((fps) (obj)).a(i, ((fpr) (obj1)), j);
            } else
            {
                ((fps) (obj)).a(i, ((fpr) (obj1)));
            }
        }
        if (gaw1.a(gav.b))
        {
            if (!arraylist1.isEmpty())
            {
                gaw1 = new HashSet();
                gaw1.addAll(eto1.a(i, (String[])arraylist1.toArray(new String[arraylist1.size()])));
                eto1.a(i, "remote_media", "media_key = ?", arraylist1, eun.b, false, gaw1);
            }
            gaw1 = new HashSet(hashset1);
            gaw1.removeAll(hashset);
            if (!arraylist1.isEmpty() || !gaw1.isEmpty())
            {
                gaw1 = new hcx(arraylist, hashset, gaw1);
                if (j > 0)
                {
                    ((fps) (obj)).a(i, gaw1, j);
                } else
                {
                    ((fps) (obj)).a(i, gaw1);
                }
            }
        }
        ((erj)olm.a(context, erj)).a(i, "Finished move all medias to trash.", null);
        if (noz1.a())
        {
            noy.a(i);
            noy.a("media", Integer.valueOf(collection.size()));
            noy.a("duration", l);
        }
    }

    public static SparseArray b(SQLiteDatabase sqlitedatabase, gka gka1)
    {
        SparseArray sparsearray;
        sparsearray = new SparseArray();
        gka1 = gka1.a();
        sqlitedatabase = sqlitedatabase.query("on_device_search", new String[] {
            "capture_day", "Count(*)"
        }, "tag = ?", new String[] {
            gka1
        }, "capture_day", null, null);
        boolean flag;
        if (sqlitedatabase.moveToFirst())
        {
            do
            {
                sparsearray.put(sqlitedatabase.getInt(0), Integer.valueOf(sqlitedatabase.getInt(1)));
                flag = sqlitedatabase.moveToNext();
            } while (flag);
        }
        sqlitedatabase.close();
        return sparsearray;
        gka1;
        sqlitedatabase.close();
        throw gka1;
    }

    public final android.app.Notification.Builder a()
    {
        return a;
    }

    public final Notification b()
    {
        return a.getNotification();
    }
}
