// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.vungle.log.Logger;
import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.bg;
import com.vungle.publisher.bi;
import com.vungle.publisher.bj;
import com.vungle.publisher.bk;
import com.vungle.publisher.cb;
import com.vungle.publisher.cc;
import com.vungle.publisher.da;
import com.vungle.publisher.db.DatabaseHelper;
import com.vungle.publisher.de;
import com.vungle.publisher.protocol.message.RequestAdResponse;
import com.vungle.publisher.protocol.message.RequestLocalAdResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.db.model:
//            Ad, LocalVideo, LocalArchive

public class LocalAd extends Ad
{
    public static class Factory extends Ad.Factory
    {

        Provider d;
        LocalArchive.Factory e;
        Viewable.Factory f;
        Provider g;
        LocalVideo.Factory h;
        ScheduledPriorityExecutor i;

        private LocalAd a(LocalAd localad, Cursor cursor, boolean flag)
        {
            super.a(localad, cursor, flag);
            localad.v = bg.c(cursor, "delete_local_content_attempts");
            localad.w = bg.e(cursor, "expiration_timestamp_seconds");
            localad.a(bg.f(cursor, "parent_path"));
            localad.z = bg.c(cursor, "prepare_retry_count");
            localad.B = System.currentTimeMillis();
            if (flag)
            {
                a(localad, flag);
                b(localad, flag);
            }
            return localad;
        }

        private static List b(List list)
        {
            ArrayList arraylist = new ArrayList();
            for (list = list.iterator(); list.hasNext();)
            {
                LocalAd localad = (LocalAd)list.next();
                int k = localad.v;
                localad.v = k + 1;
                if (localad.D() || k >= 3)
                {
                    arraylist.add(localad);
                } else
                {
                    Logger.w("VungleDatabase", (new StringBuilder("unable to delete files for ")).append(localad.y()).append(" attempt ").append(k).toString());
                    localad.m();
                }
            }

            return arraylist;
        }

        private LocalAd j()
        {
            return (LocalAd)g.get();
        }

        public final volatile int a(Ad ad, RequestAdResponse requestadresponse)
        {
            return a((LocalAd)ad, (RequestLocalAdResponse)requestadresponse);
        }

        public final int a(LocalAd localad, RequestLocalAdResponse requestlocaladresponse)
        {
            localad.w = requestlocaladresponse.s;
            return super.a(localad, requestlocaladresponse);
        }

        public final int a(List list)
        {
            boolean flag = false;
            int k = ((flag) ? 1 : 0);
            if (list != null)
            {
                k = ((flag) ? 1 : 0);
                if (list.size() > 0)
                {
                    if (Logger.isLoggable(3))
                    {
                        StringBuilder stringbuilder = new StringBuilder("deleting ");
                        Iterator iterator = list.iterator();
                        k = 1;
                        while (iterator.hasNext()) 
                        {
                            LocalAd localad = (LocalAd)iterator.next();
                            if (k != 0)
                            {
                                k = 0;
                            } else
                            {
                                stringbuilder.append(", ");
                            }
                            stringbuilder.append(localad.y());
                        }
                        Logger.d("VungleDatabase", stringbuilder.toString());
                    }
                    a(b(list), Ad.a.g);
                    k = c();
                }
            }
            return k;
        }

        protected final volatile bi a(bi bi1, Cursor cursor)
        {
            return a((LocalAd)bi1, cursor, false);
        }

        protected final volatile Ad a(Ad ad, Cursor cursor, boolean flag)
        {
            return a((LocalAd)ad, cursor, flag);
        }

        public final volatile Ad a(RequestAdResponse requestadresponse)
        {
            return a((RequestLocalAdResponse)requestadresponse);
        }

        public final LocalAd a(RequestLocalAdResponse requestlocaladresponse)
            throws cb
        {
            LocalAd localad = (LocalAd)super.a(requestlocaladresponse);
            localad.w = requestlocaladresponse.s;
            localad.a((String)d.get());
            localad.A = e.a(localad, requestlocaladresponse, com.vungle.publisher.bj.b.c);
            localad.y = e.a(localad, requestlocaladresponse, com.vungle.publisher.bj.b.b);
            localad.a(Ad.a.a);
            return localad;
        }

        public final LocalAd a(String s)
        {
            return (LocalAd)super.a(Ad.b.a, s);
        }

        public final transient LocalAd a(Ad.a aa[])
        {
            String as[];
            Exception exception;
            int k = 0;
            exception = null;
            as = new String[aa.length];
            for (; k < aa.length; k++)
            {
                as[k] = String.valueOf(aa[k]);
            }

            Object obj;
            aa = (new StringBuilder("status IN (")).append(bg.a(as.length)).append(") AND type = ? AND expiration_timestamp_seconds > ? ORDER BY received_timestamp_millis ASC LIMIT ?").toString();
            String s = Ad.b.a.toString();
            String as1[] = (String[])da.a(new String[][] {
                as, new String[] {
                    s, Long.toString(System.currentTimeMillis() / 1000L), "1"
                }
            });
            obj = (new StringBuilder()).append(s).append(" ad records by query: ").append(aa).append("; parameters: ").append(de.a(as1)).toString();
            Logger.d("VungleDatabase", (new StringBuilder("fetching ")).append(((String) (obj))).toString());
            aa = c.getReadableDatabase().query("ad", null, aa, as1, null, null, null, null);
            int i1 = aa.getCount();
            i1;
            JVM INSTR tableswitch 0 1: default 368
        //                       0 283
        //                       1 319;
               goto _L1 _L2 _L3
_L1:
            throw new SQLException((new StringBuilder("fetched ")).append(i1).append(((String) (obj))).toString());
            exception;
            obj = aa;
            aa = exception;
_L7:
            if (obj != null)
            {
                ((Cursor) (obj)).close();
            }
            throw aa;
_L2:
            Logger.d("VungleDatabase", (new StringBuilder("no ")).append(((String) (obj))).toString());
            obj = exception;
_L5:
            if (aa != null)
            {
                aa.close();
            }
            return ((LocalAd) (obj));
_L3:
            obj = exception;
            LocalAd localad;
            boolean flag;
            if (!aa.moveToFirst())
            {
                continue; /* Loop/switch isn't completed */
            }
            localad = a(j(), ((Cursor) (aa)), true);
            flag = localad.v();
            obj = exception;
            if (flag)
            {
                obj = localad;
            }
            if (true) goto _L5; else goto _L4
_L4:
            aa;
            obj = null;
            if (true) goto _L7; else goto _L6
_L6:
        }

        final LocalArchive a(LocalAd localad, boolean flag)
        {
            if (localad.C)
            {
                return localad.y;
            } else
            {
                LocalArchive localarchive = (LocalArchive)e.a((String)localad.t, com.vungle.publisher.bj.b.b, flag);
                localad.y = localarchive;
                localad.C = true;
                return localarchive;
            }
        }

        protected final volatile Video.Factory a()
        {
            return h;
        }

        public final volatile boolean a(Ad ad)
        {
            return super.a(ad);
        }

        protected final Ad.b b()
        {
            return Ad.b.a;
        }

        final LocalArchive b(LocalAd localad, boolean flag)
        {
            if (localad.D)
            {
                return localad.A;
            } else
            {
                LocalArchive localarchive = (LocalArchive)e.a((String)localad.t, com.vungle.publisher.bj.b.c, flag);
                localad.A = localarchive;
                localad.D = true;
                return localarchive;
            }
        }

        protected final volatile Object[] b(int k)
        {
            return new String[k];
        }

        protected final volatile bi[] c(int k)
        {
            return new LocalAd[k];
        }

        protected final bi c_()
        {
            return j();
        }

        public final volatile List d()
        {
            return super.d();
        }

        public final volatile List d(int k)
        {
            return super.d(k);
        }

        protected final String e_()
        {
            return "ad";
        }

        public final LocalAd f()
        {
            return a(new Ad.a[] {
                Ad.a.e
            });
        }

        public final Long g()
        {
            Object obj;
            Object obj1;
            Object obj2;
            obj2 = null;
            obj1 = Arrays.asList(new String[] {
                Ad.a.f.toString(), Ad.a.g.toString()
            });
            obj = new ArrayList();
            ((List) (obj)).add(Ad.b.a.toString());
            ((List) (obj)).addAll(((java.util.Collection) (obj1)));
            ((List) (obj)).add("1");
            obj1 = (new StringBuilder("type = ? AND status NOT IN (")).append(bg.a(((List) (obj1)).size())).append(") ORDER BY expiration_timestamp_seconds ASC LIMIT ?").toString();
            SQLiteDatabase sqlitedatabase = c.getReadableDatabase();
            String as[] = (String[])((List) (obj)).toArray(new String[((List) (obj)).size()]);
            as = sqlitedatabase.query("ad", new String[] {
                "expiration_timestamp_seconds"
            }, ((String) (obj1)), as, null, null, null, null);
            obj1 = obj2;
            if (!as.moveToFirst())
            {
                break MISSING_BLOCK_LABEL_183;
            }
            obj1 = bg.e(as, "expiration_timestamp_seconds");
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_195;
            }
            Logger.w("VungleDatabase", "next ad expiration time seconds is null");
            obj1 = obj2;
_L2:
            if (as != null)
            {
                as.close();
            }
            return ((Long) (obj1));
            obj1 = Long.valueOf(((Long) (obj1)).longValue() * 1000L);
            Logger.d("VungleDatabase", (new StringBuilder("next ad expiration time millis ")).append(obj1).toString());
            if (true) goto _L2; else goto _L1
_L1:
            Exception exception1;
            exception1;
            Exception exception;
            obj1 = as;
            exception = exception1;
_L4:
            if (obj1 != null)
            {
                ((Cursor) (obj1)).close();
            }
            throw exception;
            exception;
            obj1 = null;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final int h()
        {
            Logger.d("VungleDatabase", (new StringBuilder("deleting expired ")).append(Ad.b.a).append(" ad records without pending reports").toString());
            return a(a("type = ? AND expiration_timestamp_seconds <= ?", new String[] {
                Ad.b.a.toString(), String.valueOf(System.currentTimeMillis() / 1000L)
            }, null));
        }

        public final int i()
        {
            List list = a((new StringBuilder("type = ? AND ")).append(Ad.b).append(" ORDER BY insert_timestamp_millis DESC LIMIT ? OFFSET ?").toString(), new String[] {
                Ad.b.a.toString(), Integer.toString(0x7fffffff), Integer.toString(4)
            }, null);
            int k = list.size();
            Logger.d("VungleDatabase", (new StringBuilder("deleting ")).append(k).append(" extra ").append(Ad.b.a).append(" ad records to reach target size 4").toString());
            return a(list);
        }

        Factory()
        {
        }
    }


    LocalArchive A;
    long B;
    boolean C;
    boolean D;
    Factory E;
    int v;
    Long w;
    String x;
    LocalArchive y;
    public int z;

    protected LocalAd()
    {
    }

    public final LocalArchive A()
    {
        return E.b(this, false);
    }

    public final bk[] B()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = A();
        if (obj != null)
        {
            arraylist.add(obj);
        }
        obj = (LocalVideo)k();
        if (obj != null)
        {
            arraylist.add(obj);
        }
        obj = u();
        if (obj != null)
        {
            arraylist.add(obj);
        }
        return (bk[])arraylist.toArray(new bk[arraylist.size()]);
    }

    public final boolean D()
    {
        return cc.a(t());
    }

    protected final ContentValues a(boolean flag)
    {
        ContentValues contentvalues = super.a(flag);
        contentvalues.put("delete_local_content_attempts", Integer.valueOf(v));
        contentvalues.put("expiration_timestamp_seconds", w);
        contentvalues.put("parent_path", x);
        contentvalues.put("prepare_retry_count", Integer.valueOf(z));
        contentvalues.put("received_timestamp_millis", Long.valueOf(B));
        return contentvalues;
    }

    public final bj a(com.vungle.publisher.bj.b b1)
    {
        return b(b1);
    }

    public final void a(Ad.a a1)
    {
        Ad.a a2 = j;
        super.a(a1);
        if (a1 != a2 && a1 != Ad.a.b)
        {
            int i = z;
            Logger.v("VunglePrepare", (new StringBuilder("resetting prepare_retry_count from ")).append(i).append(" to 0 for ").append(y()).toString());
            z = 0;
        }
    }

    public final void a(String s)
    {
        x = s;
        o = null;
    }

    protected final volatile com.vungle.publisher.bi.a a_()
    {
        return E;
    }

    public final bk b(com.vungle.publisher.bj.b b1)
    {
    /* anonymous class not found */
    class _anm1 {}

        switch (_cls1.a[b1.ordinal()])
        {
        default:
            return (bk)super.a(b1);

        case 1: // '\001'
            return A();

        case 2: // '\002'
            return (bk)k();

        case 3: // '\003'
            return u();
        }
    }

    protected final volatile Ad.Factory c()
    {
        return E;
    }

    public final String l()
        throws SQLException
    {
        String s = super.l();
        if (y != null)
        {
            y.r();
        }
        if (A != null)
        {
            A.r();
        }
        return s;
    }

    public final int m()
    {
        int i = super.m();
        if (i == 1)
        {
            if (A != null)
            {
                A.m();
            }
            if (y != null)
            {
                y.m();
            }
        }
        return i;
    }

    public final int n()
    {
        int i = v;
        v = i + 1;
        if (cc.a(t()))
        {
            return super.n();
        } else
        {
            Logger.w("VungleDatabase", (new StringBuilder("unable to delete files for ")).append(y()).append(" attempt ").append(i).toString());
            m();
            return 0;
        }
    }

    protected final StringBuilder p()
    {
        StringBuilder stringbuilder = super.p();
        bi.a(stringbuilder, "delete_local_content_attempts", Integer.valueOf(v), false);
        bi.a(stringbuilder, "expiration_timestamp_seconds", w, false);
        bi.a(stringbuilder, "parent_path", x, false);
        bi.a(stringbuilder, "prepare_retry_count", Integer.valueOf(z), false);
        bi.a(stringbuilder, "received_timestamp_millis", Long.valueOf(B), false);
        return stringbuilder;
    }

    public final Object r()
    {
        return l();
    }

    public final String t()
    {
        if (o == null)
        {
            o = cc.a(new Object[] {
                x, cc.c((String)t)
            });
        }
        return o;
    }

    public final LocalArchive u()
    {
        return E.a(this, false);
    }

    final boolean v()
    {
        boolean flag1;
label0:
        {
            boolean flag = false;
            boolean flag2 = true;
            bk abk[] = B();
            int j = abk.length;
            int i = 0;
label1:
            do
            {
label2:
                {
                    flag1 = flag2;
                    if (i < j)
                    {
                        if (abk[i].t())
                        {
                            break label2;
                        }
                        flag1 = false;
                    }
                    if (flag1)
                    {
                        break label0;
                    }
                    a(Ad.a.a);
                    abk = B();
                    j = abk.length;
                    for (i = ((flag) ? 1 : 0); i < j; i++)
                    {
                        abk[i].a(com.vungle.publisher.bj.a.a);
                    }

                    break label1;
                }
                i++;
            } while (true);
            m();
        }
        return flag1;
    }
}
