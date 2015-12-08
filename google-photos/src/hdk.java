// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

public final class hdk
    implements nlj
{

    private static final String b[] = {
        "content_uri", "state", "dedup_key"
    };
    private long A;
    private long B;
    private long C;
    private long D;
    private long E;
    private long F;
    private long G;
    private boolean H;
    private fkz I;
    private erb J;
    private MediaMetadataRetriever K;
    final nli a = new nli();
    private final Context c;
    private boolean d;
    private final gbd e;
    private final gbh f;
    private final gba g;
    private final gbo h;
    private final gbm i;
    private final hdo j;
    private final erj k;
    private final ete l;
    private final ejr m;
    private final eto n;
    private final noz o;
    private final noz p;
    private final noz q;
    private final gur r;
    private final esu s;
    private final iur t;
    private int u;
    private int v;
    private boolean w;
    private SQLiteDatabase x;
    private SQLiteDatabase y;
    private long z;

    hdk(Context context, boolean flag)
    {
        c = context;
        d = flag;
        e = (gbd)olm.a(context, gbd);
        f = (gbh)olm.a(context, gbh);
        g = (gba)olm.a(context, gba);
        h = (gbo)olm.a(context, gbo);
        i = (gbm)olm.a(context, gbm);
        j = (hdo)olm.a(context, hdo);
        k = (erj)olm.a(context, erj);
        l = (ete)olm.a(context, ete);
        m = (ejr)olm.a(context, ejr);
        n = (eto)olm.a(context, eto);
        o = noz.a(context, "AllPhMediaStoreItemSync", new String[0]);
        p = noz.a(context, 3, "AllPhMediaStoreItemSync", new String[] {
            "perf", "sync"
        });
        q = noz.a(context, 2, "AllPhMediaStoreItemSync", new String[] {
            "perf", "sync"
        });
        r = (gur)olm.a(context, gur);
        s = (esu)olm.a(context, esu);
        t = (iur)olm.a(context, iur);
    }

    private int a(nlr nlr1)
    {
        y.beginTransactionWithListenerNonExclusive(J);
        int i1;
        hdm hdm1 = new hdm(this, nlr1.b.toString());
        nlr1.a(3000, hdm1);
        i1 = hdm1.a;
        y.setTransactionSuccessful();
        y.endTransaction();
        return i1;
        nlr1;
        y.endTransaction();
        throw nlr1;
    }

    static SQLiteDatabase a(hdk hdk1)
    {
        return hdk1.y;
    }

    private nko a(String s1, eui eui1)
    {
        Object obj;
        if (d)
        {
            long l1 = noy.a();
            nko nko1 = e.b(s1);
            long l3 = B;
            B = (noy.a() - l1) + l3;
            if (nko1 == null && p.a())
            {
                noy.a("uri", s1);
            }
            obj = nko1;
            if (nko1 != null)
            {
                eui1.a(nko1.b());
                try
                {
                    n.a(v, y, eui1);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    if (o.a())
                    {
                        noy.a("uri", s1);
                        noy.a("dedupKey", eui1.a());
                        noy.a("size bytes", Long.valueOf(eui1.c.getAsLong("size_bytes").longValue()));
                    }
                    throw obj;
                }
                obj = nko1;
            }
        } else
        {
            s1 = e.c(s1);
            obj = s1;
            if (s1 == null)
            {
                p.a(eui1.h());
                long l2 = (new File(eui1.h())).length();
                if (l2 > 0L)
                {
                    return new hdl(this, l2);
                } else
                {
                    return null;
                }
            }
        }
        return ((nko) (obj));
    }

    static iur b(hdk hdk1)
    {
        return hdk1.t;
    }

    private void b(String s1, eui eui1)
    {
        Object obj = n;
        int i1 = v;
        obj = eto.a(mvj.b(((eto) (obj)).a, i1), "local_media", "state", "content_uri = ? ", new String[] {
            s1
        });
        if (obj == eun.b)
        {
            if (p.a())
            {
                noy.a("uri", s1);
            }
            eui1.a(((eun) (obj)));
        }
    }

    static String[] b()
    {
        return b;
    }

    static int c(hdk hdk1)
    {
        return hdk1.v;
    }

    static esu d(hdk hdk1)
    {
        return hdk1.s;
    }

    static erb e(hdk hdk1)
    {
        return hdk1.J;
    }

    static eto f(hdk hdk1)
    {
        return hdk1.n;
    }

    static ejr g(hdk hdk1)
    {
        return hdk1.m;
    }

    static fkz h(hdk hdk1)
    {
        return hdk1.I;
    }

    public final void a(boolean flag)
    {
        boolean flag1 = y.inTransaction();
        if (flag1)
        {
            y.setTransactionSuccessful();
            y.endTransaction();
        }
        if (x.inTransaction())
        {
            x.setTransactionSuccessful();
            x.endTransaction();
            x.beginTransactionNonExclusive();
        }
        if (flag1)
        {
            y.beginTransactionWithListenerNonExclusive(J);
        }
        if (p.a())
        {
            noy.a("allow slow ops", Boolean.valueOf(d));
            noy.b("converting cursor", G);
            noy.b("inserting", A);
            noy.b("calculating hashes", B);
            noy.b("replacing fake dedupKeys", 0L);
            noy.b("detecting photospheres", D);
            noy.b("detecting animations", E);
            noy.b("reading video metadata", F);
            noy.a("duration", z);
        }
        if (flag)
        {
            try
            {
                k.a(v, "local media batch complete", null);
                Object obj = l;
                int i1 = v;
                for (obj = ((ete) (obj)).a.iterator(); ((Iterator) (obj)).hasNext(); ((Iterator) (obj)).next()) { }
            }
            catch (mmy mmy1) { }
        }
    }

    public final void a(boolean flag, nlr nlr1)
    {
        if (!H)
        {
            return;
        }
        H = false;
        if (p.a())
        {
            noy.a("duration", z);
            noy.a("total rows added", Integer.valueOf(u));
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        x.setTransactionSuccessful();
        if (nlr1 == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        a(nlr1);
        x.endTransaction();
        K.release();
        K = null;
        return;
        nlr1;
        x.endTransaction();
        throw nlr1;
    }

    public final boolean a(int i1, boolean flag)
    {
        if (H)
        {
            throw new IllegalStateException("Called prepare() while synchronizer was already prepared.");
        }
        while (i1 == -1 || flag && d) 
        {
            return false;
        }
        H = true;
        u = 0;
        z = noy.a();
        A = 0L;
        B = 0L;
        C = 0L;
        D = 0L;
        E = 0L;
        F = 0L;
        G = 0L;
        v = i1;
        w = flag;
        I = ((flb)olm.a(c, flb)).b(i1);
        y = mvj.a(c, i1);
        J = new erb(c, i1);
        x = ((gbg)olm.a(c, gbg)).getWritableDatabase();
        x.beginTransactionNonExclusive();
        K = new MediaMetadataRetriever();
        return true;
    }

    public final boolean a(Context context, Cursor cursor, Uri uri)
    {
        Object obj1;
        boolean flag2;
        if (!H)
        {
            throw new IllegalStateException("Called processMedia() while synchronizer was not prepared.");
        }
        long l2 = noy.a();
        eui eui1 = new eui();
        long l5 = cursor.getLong(0);
        obj1 = cursor.getString(1);
        context = cursor.getString(2);
        String s1 = cursor.getString(3);
        long l8 = cursor.getLong(4);
        double d1 = cursor.getDouble(5);
        double d2 = cursor.getDouble(6);
        String s3 = cursor.getString(7);
        long l9 = cursor.getLong(8);
        int i1 = cursor.getInt(9);
        int k1 = cursor.getInt(10);
        long l10 = cursor.getLong(11);
        int l1 = cursor.getInt(12);
        long l11 = cursor.getLong(13);
        Uri uri1 = ContentUris.withAppendedId(uri, l5);
        uri = uri1.toString();
        int j2 = b.a(context, l1, l10);
        boolean flag1;
        int i2;
        if (l1 == 90 || l1 == 270)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            i2 = k1;
        } else
        {
            i2 = i1;
        }
        if (!flag1)
        {
            i1 = k1;
        }
        if (b.g(uri1))
        {
            context = njx.b;
        } else
        {
            context = njx.a;
        }
        eui1.d(uri).d(l11).c(0L).b(context).b(j2).c(((String) (obj1))).b(s1).e(l8).b(Double.valueOf(d1)).a(Double.valueOf(d2)).e(s3).a(Long.valueOf(l9)).c(Integer.valueOf(i2)).d(Integer.valueOf(i1));
        obj1 = (eui)eui1;
        G = G + (noy.a() - l2);
        if (I.a(((eui) (obj1)).b.getAsString("bucket_id"))) goto _L2; else goto _L1
_L1:
        flag2 = false;
_L7:
        return flag2;
_L2:
        String s2;
        s2 = ((eui) (obj1)).c();
        uri = ((eui) (obj1)).h();
        if (TextUtils.isEmpty(uri))
        {
            return false;
        }
        hdo hdo1 = j;
        long l3 = ((eui) (obj1)).g().longValue();
        flag2 = w;
        context = null;
        if (l3 - hdo.a > System.currentTimeMillis())
        {
            context = hdo.a(uri);
        }
        uri = context;
        if (context == null)
        {
            if (flag2)
            {
                uri = new hdp(l3, TimeZone.getDefault().getOffset(l3));
            } else
            {
                uri = new hdp(l3, hdo1.b.a(s2, l3));
            }
        }
        ((eui) (obj1)).b(((hdp) (uri)).a);
        ((eui) (obj1)).a(((hdp) (uri)).b);
        context = a(s2, ((eui) (obj1)));
        if (context == null)
        {
            return false;
        }
        l3 = r.a(v, Uri.parse(s2));
        uri = r.a(v, l3);
        float f1;
        int j1;
        long l6;
        boolean flag3;
        if (uri != null && TextUtils.equals(context.b(), ((gum) (uri)).e))
        {
            ((eui) (obj1)).a(((gum) (uri)).c);
        } else
        {
            ((eui) (obj1)).a(context.b());
        }
        b(s2, ((eui) (obj1)));
        if (((eui) (obj1)).b() == euv.c.f) goto _L4; else goto _L3
_L3:
        if (!d) goto _L6; else goto _L5
_L5:
        l3 = noy.a();
        flag2 = g.a(s2);
        l6 = E;
        E = (noy.a() - l3) + l6;
        if (flag2)
        {
            ((eui) (obj1)).a(njx.d);
            ((eui) (obj1)).a(false);
        } else
        {
            long l4 = noy.a();
            ((eui) (obj1)).a(f.a(s2));
            long l7 = D;
            D = (noy.a() - l4) + l7;
        }
_L4:
        if (((eui) (obj1)).b() == euv.c.f)
        {
            Object obj;
            if (d)
            {
                l3 = noy.a();
                obj = h.a(s2);
                gbm gbm1 = i;
                boolean flag;
                if (!b.g(Uri.parse(s2)))
                {
                    context = null;
                } else
                {
                    uri = gbm1.a(s2);
                    context = uri;
                    if (uri == null)
                    {
                        uri = gbm1.b;
                        Object obj2 = Uri.parse(s2);
                        context = null;
                        obj2 = uri.a(((Uri) (obj2)));
                        if (obj2 != null)
                        {
                            context = uri.a(((MediaMetadataRetriever) (obj2)));
                            ((MediaMetadataRetriever) (obj2)).release();
                        }
                        if (context == null)
                        {
                            context = null;
                        } else
                        {
                            uri = new ContentValues();
                            uri.put("width", Integer.valueOf(((jfi) (context)).a));
                            uri.put("height", Integer.valueOf(((jfi) (context)).b));
                            gbm1.a.a("media_store_extra_video_dimension", s2, uri);
                        }
                    }
                }
                l6 = F;
                F = (noy.a() - l3) + l6;
                uri = context;
            } else
            {
                context = h;
                if (!b.g(Uri.parse(s2)))
                {
                    context = null;
                } else
                {
                    context = context.b(s2);
                }
                uri = i;
                if (!b.g(Uri.parse(s2)))
                {
                    uri = null;
                } else
                {
                    uri = uri.a(s2);
                }
                obj = context;
            }
            if (obj != null)
            {
                f1 = ((jfk) (obj)).a;
                ((eui) (obj1)).b.put("capture_frame_rate", Float.valueOf(f1));
                f1 = ((jfk) (obj)).b;
                ((eui) (obj1)).b.put("encoded_frame_rate", Float.valueOf(f1));
            }
            if (uri != null)
            {
                ((eui) (obj1)).a(Integer.valueOf(((jfi) (uri)).a));
                ((eui) (obj1)).b(Integer.valueOf(((jfi) (uri)).b));
            }
        }
        context = b.j(((eui) (obj1)).c.getAsString("filename"));
        if (context != null)
        {
            ((eui) (obj1)).a(context.intValue());
        }
        l3 = noy.a();
        context = n;
        j1 = v;
        uri = y;
        if (!w)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        flag3 = context.a(j1, uri, ((eui) (obj1)), s2, flag2, J);
        if (q.a())
        {
            noy.a("uri", s2);
            noy.a("modTime", Long.valueOf(cursor.getLong(11)));
            noy.a("success", Boolean.valueOf(flag3));
        }
        A = A + (noy.a() - l3);
        flag2 = flag3;
        if (flag3)
        {
            u = u + 1;
            return flag3;
        }
        if (true) goto _L7; else goto _L6
_L6:
        context = g;
        if (b.g(Uri.parse(s2)))
        {
            break MISSING_BLOCK_LABEL_1163;
        }
        context = context.b(s2);
        if (context == null || !context.booleanValue())
        {
            break MISSING_BLOCK_LABEL_1163;
        }
        flag = true;
_L8:
        if (flag)
        {
            ((eui) (obj1)).a(njx.d);
            ((eui) (obj1)).a(false);
        } else
        {
            context = f.b(s2);
            if (context != null && context.booleanValue())
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ((eui) (obj1)).a(flag2);
        }
          goto _L4
        flag = false;
          goto _L8
    }

    public final SQLiteTransactionListener f_()
    {
        if (!H)
        {
            throw new IllegalStateException("Called getListener while synchronizer was not prepared");
        } else
        {
            return J;
        }
    }

}
