// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class djt
    implements ekr
{

    private final Context a;
    private final erj b;
    private final elp c;
    private final eme d;
    private final eli e;
    private final noz f;

    public djt(Context context, erj erj1)
    {
        a = context;
        b = erj1;
        c = new elp(context, dnf);
        d = (new eme()).a(new djq(new elp(context, dkg))).a(new dmj(context)).a(new dnz()).a(new dmu()).a(new dng(context, c));
        e = (new eli()).a(epc, new dkn(context));
        f = noz.a(context, 3, "AllPhotosCollection", new String[] {
            "perf"
        });
    }

    private elb a(int i, Set set, ekk ekk)
    {
        Object obj;
        long l = noy.a();
        obj = mvj.b(a, i);
        String as[] = c.a(dju.a, ekk);
        long l1;
        long l2;
        if (set.isEmpty())
        {
            String s = dju.b;
            String s1 = String.valueOf("is_hidden != 1");
            obj = ((SQLiteDatabase) (obj)).query("collection_covers", as, (new StringBuilder(String.valueOf(s).length() + 5 + String.valueOf(s1).length())).append(s).append(" AND ").append(s1).toString(), null, null, null, "start DESC");
        } else
        {
            String as1[] = new String[set.size()];
            Object obj1 = set.iterator();
            for (int j = 0; ((Iterator) (obj1)).hasNext(); j++)
            {
                as1[j] = String.valueOf(((esm)((Iterator) (obj1)).next()).f);
            }

            obj1 = b.b("type", set.size());
            String s2 = String.valueOf("is_hidden != 1");
            obj = ((SQLiteDatabase) (obj)).query("collection_covers", as, (new StringBuilder(String.valueOf(obj1).length() + 5 + String.valueOf(s2).length())).append(((String) (obj1))).append(" AND ").append(s2).toString(), as1, null, null, "start DESC");
        }
        l1 = noy.a();
        as = a(((Cursor) (obj)), i, false, ekk);
        ((Cursor) (obj)).close();
        l2 = noy.a();
        if (set.contains(esm.d))
        {
            try
            {
                as.addAll(a(i, ekk));
            }
            // Misplaced declaration of an exception variable
            catch (Set set)
            {
                return b.a(set);
            }
        }
        if (f.a())
        {
            noy.a(i);
            b.a(ekk);
            noy.a("duration", l);
            noy.b("collections view query", l1 - l);
            if (set.contains(esm.d))
            {
                noy.a(i);
                b.a(ekk);
                noy.a("duration", l);
                noy.a("fake movie query", l2);
            }
        }
        Collections.sort(as, new dlb());
        return b.b(as);
        set;
        set = b.a(set);
        ((Cursor) (obj)).close();
        return set;
        set;
        ((Cursor) (obj)).close();
        throw set;
    }

    private List a(int i, ekk ekk)
    {
        Cursor cursor = mvj.b(a, i).rawQuery(euk.a(), null);
        ekk = a(cursor, i, true, ekk);
        cursor.close();
        return ekk;
        ekk;
        cursor.close();
        throw ekk;
    }

    private List a(Cursor cursor, int i, boolean flag, ekk ekk)
    {
        ArrayList arraylist = new ArrayList(cursor.getCount());
        if (!cursor.moveToNext())
        {
            return arraylist;
        }
        int j = cursor.getColumnIndexOrThrow("collection_media_key");
        do
        {
            arraylist.add(new dnd(i, cursor.getString(j), flag, c.a(i, cursor, ekk)));
        } while (cursor.moveToNext());
        return arraylist;
    }

    private void a(int i, ContentObserver contentobserver)
    {
        a.getContentResolver().registerContentObserver(erj.a(i), false, contentobserver);
    }

    public final ejy a(Class class1)
    {
        return e.a(class1);
    }

    public final elb a(ekg ekg, ekk ekk)
    {
        ekg = (ekq)ekg;
        long l = noy.a();
        elb elb = d.a(ekg, ekk);
        if (f.a())
        {
            b.a(ekg);
            b.a(ekk);
            noy.a("duration", l);
        }
        return elb;
    }

    public final elb a(ekq ekq1, ekk ekk)
    {
        if (ekq1 instanceof dkp)
        {
            ekq1 = (dkp)ekq1;
            return a(((dkp) (ekq1)).a, ((dkp) (ekq1)).b, ekk);
        } else
        {
            ekq1 = String.valueOf(ekq1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq1).length() + 52)).append("Cannot get collections for unrecognized collection: ").append(ekq1).toString());
        }
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.allphotos.data.AllPhotosCore";
    }

    public final void a(ekq ekq1, ContentObserver contentobserver)
    {
        if (ekq1 instanceof dke)
        {
            a(((dke)ekq1).a, contentobserver);
            return;
        }
        if (ekq1 instanceof dmh)
        {
            a(((dmh)ekq1).a, contentobserver);
            return;
        }
        if (ekq1 instanceof dmb)
        {
            a(((dmb)ekq1).a, contentobserver);
            return;
        }
        if (ekq1 instanceof dnd)
        {
            ContentResolver contentresolver = a.getContentResolver();
            ekq1 = (dnd)ekq1;
            if (((dnd) (ekq1)).c)
            {
                a(((dnd) (ekq1)).a, contentobserver);
                return;
            } else
            {
                contentresolver.registerContentObserver(erj.a(((dnd) (ekq1)).a, ((dnd) (ekq1)).b), false, contentobserver);
                contentresolver.registerContentObserver(ery.a(((dnd) (ekq1)).a, ((dnd) (ekq1)).b), false, contentobserver);
                return;
            }
        }
        if (ekq1 instanceof dkp)
        {
            ekq1 = (dkp)ekq1;
            ContentResolver contentresolver1 = a.getContentResolver();
            contentresolver1.registerContentObserver(erj.a(((dkp) (ekq1)).a), false, contentobserver);
            contentresolver1.registerContentObserver(ery.a(((dkp) (ekq1)).a, null), false, contentobserver);
            return;
        }
        if (ekq1.b(dnq) != null)
        {
            a(((dnq)ekq1.a(dnq)).a, contentobserver);
            return;
        } else
        {
            contentobserver = String.valueOf("Cannot register an observer for anything other than an AllPhotosCollection, AllTrashMediaCollection, MediaCollection with SearchFeature, RemoteMediaCollection, AllRemoteMediaCollection, or a MediaKeyCollection, but given: ");
            ekq1 = String.valueOf(ekq1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(contentobserver).length() + 0 + String.valueOf(ekq1).length())).append(contentobserver).append(ekq1).toString());
        }
    }

    public final void b(ekq ekq1, ContentObserver contentobserver)
    {
        ContentResolver contentresolver = a.getContentResolver();
        if (ekq1 instanceof dke)
        {
            contentresolver.unregisterContentObserver(contentobserver);
            return;
        }
        if (ekq1 instanceof dmh)
        {
            contentresolver.unregisterContentObserver(contentobserver);
            return;
        }
        if (ekq1 instanceof dmb)
        {
            contentresolver.unregisterContentObserver(contentobserver);
            return;
        }
        if (ekq1 instanceof dnd)
        {
            contentresolver.unregisterContentObserver(contentobserver);
            return;
        }
        if (ekq1 instanceof dkp)
        {
            contentresolver.unregisterContentObserver(contentobserver);
            return;
        }
        if (ekq1.b(dnq) != null)
        {
            contentresolver.unregisterContentObserver(contentobserver);
            return;
        } else
        {
            contentobserver = String.valueOf("Cannot register an observer for anything other than an AllPhotosCollection, AllTrashMediaCollection, MediaCollection with SearchFeature, RemoteMediaCollection, AllRemoteMediaCollection, or a MediaKeyCollection, but given: ");
            ekq1 = String.valueOf(ekq1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(contentobserver).length() + 0 + String.valueOf(ekq1).length())).append(contentobserver).append(ekq1).toString());
        }
    }
}
