// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.log.Logger;
import com.vungle.publisher.bi;
import com.vungle.publisher.cc;
import com.vungle.publisher.cf;
import com.vungle.publisher.cw;
import com.vungle.publisher.protocol.message.RequestLocalAdResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.db.model:
//            Viewable, LocalViewableDelegate, ArchiveEntry, LocalAd

public class LocalArchive extends Viewable
    implements LocalViewableDelegate.a
{
    static class Factory extends Viewable.BaseFactory
    {

        Provider a;
        LocalViewableDelegate.Factory b;

        private LocalArchive a(LocalArchive localarchive, Cursor cursor, boolean flag)
        {
            super.a(localarchive, cursor, flag);
            localarchive.i.a(cursor);
            if (flag)
            {
                localarchive.i();
            }
            return localarchive;
        }

        protected final volatile bi a(bi bi, Cursor cursor)
        {
            return a((LocalArchive)bi, cursor, false);
        }

        final LocalArchive a(LocalAd localad, RequestLocalAdResponse requestlocaladresponse, com.vungle.publisher.bj.b b1)
        {
            LocalArchive localarchive;
            Object obj;
            obj = null;
            localarchive = obj;
            if (requestlocaladresponse == null) goto _L2; else goto _L1
_L1:
        /* anonymous class not found */
        class _anm2 {}

            _cls2.a[b1.ordinal()];
            JVM INSTR tableswitch 1 2: default 40
        //                       1 64
        //                       2 106;
               goto _L3 _L4 _L5
_L3:
            throw new IllegalArgumentException((new StringBuilder("cannot create archive of type: ")).append(b1).toString());
_L4:
            String s = requestlocaladresponse.t;
            localarchive = obj;
            if (s != null)
            {
                localarchive = (LocalArchive)super.b(localad, requestlocaladresponse);
                localarchive.q = b1;
                localarchive.a(s);
            }
_L2:
            return localarchive;
_L5:
            String s1 = requestlocaladresponse.u;
            localarchive = obj;
            if (s1 != null)
            {
                localad = (LocalArchive)super.b(localad, requestlocaladresponse);
                localad.q = b1;
                localad.a(s1);
                return localad;
            }
            if (true) goto _L2; else goto _L6
_L6:
        }

        protected final volatile Viewable a(Viewable viewable, Cursor cursor, boolean flag)
        {
            return a((LocalArchive)viewable, cursor, flag);
        }

        protected final volatile Object[] b(int i1)
        {
            return new Integer[i1];
        }

        protected final volatile bi[] c(int i1)
        {
            return new LocalArchive[i1];
        }

        protected final bi c_()
        {
            LocalArchive localarchive = (LocalArchive)a.get();
            localarchive.i = b.a(localarchive);
            return localarchive;
        }

        protected Factory()
        {
        }
    }


    ArchiveEntry a[];
    boolean b;
    boolean c;
    boolean d;
    Factory e;
    LoggedException.Factory f;
    ArchiveEntry.Factory g;
    LocalAd.Factory h;
    public LocalViewableDelegate i;

    protected LocalArchive()
    {
    }

    private boolean C()
    {
        File file = i.b();
        try
        {
            ArrayList arraylist = new ArrayList();
            cf.a(file, new File(j()), new com.vungle.publisher.cf.a[] {
                new _cls1(arraylist)
            });
            a((ArchiveEntry[])arraylist.toArray(new ArchiveEntry[arraylist.size()]), true);
        }
        catch (IOException ioexception)
        {
            f.b("VunglePrepare", (new StringBuilder("error extracting ")).append(file).toString(), ioexception);
            return false;
        }
        return true;
    }

    private boolean E()
    {
        String s = j();
        Logger.d("VungleDatabase", (new StringBuilder("deleting ")).append(q).append(" directory ").append(s).toString());
        boolean flag = cc.a(j());
        if (flag)
        {
            Logger.v("VungleDatabase", (new StringBuilder("deleting ")).append(q).append(" directory ").append(s).toString());
            a = null;
            d = true;
            return flag;
        } else
        {
            Logger.w("VungleDatabase", (new StringBuilder("failed to delete ")).append(q).append(" directory ").append(s).toString());
            return flag;
        }
    }

    private void a(ArchiveEntry aarchiveentry[], boolean flag)
    {
        a = aarchiveentry;
        c = flag;
        b = true;
    }

    public final boolean A()
    {
        return i.h() & E();
    }

    public final int B()
    {
        return super.n();
    }

    protected final ContentValues a(boolean flag)
    {
        ContentValues contentvalues = super.a(flag);
        i.a(contentvalues);
        return contentvalues;
    }

    public final void a(cw cw)
    {
        i.a(cw);
    }

    public final void a(Integer integer)
    {
        i.c = integer;
    }

    public final void a(String s)
    {
        i.b = s;
    }

    protected final volatile com.vungle.publisher.bi.a a_()
    {
        return e;
    }

    public final String g()
    {
        return i.b;
    }

    public final String h()
    {
        return "zip";
    }

    public final ArchiveEntry[] i()
    {
        if (!b)
        {
            a(g.a(this), false);
        }
        return a;
    }

    public final String j()
    {
        return cc.a(new Object[] {
            i.a(), q
        });
    }

    public final String k()
    {
        return i.c();
    }

    public final boolean l()
    {
        return i.e();
    }

    public final int m()
    {
        int i1 = super.m();
        if (i1 == 1)
        {
            if (d)
            {
                g.a((Integer)t);
                E();
                Logger.v("VungleDatabase", "resetting areArchiveEntriesDeleted = false");
                d = false;
            } else
            if (c)
            {
                ArchiveEntry.Factory.a(a);
                Logger.v("VungleDatabase", "resetting areArchiveEntriesNew = false");
                c = false;
                return i1;
            }
        }
        return i1;
    }

    public final int n()
    {
        E();
        return i.d();
    }

    protected final StringBuilder p()
    {
        StringBuilder stringbuilder = super.p();
        i.a(stringbuilder);
        return stringbuilder;
    }

    public final boolean q()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (i.g())
        {
            flag = flag1;
            if (C())
            {
                flag = u();
            }
        }
        return flag;
    }

    public final boolean t()
    {
        return i.f();
    }

    public final boolean u()
    {
        ArchiveEntry aarchiveentry[] = i();
        int j1 = aarchiveentry.length;
        int i1 = 0;
        boolean flag = false;
        do
        {
label0:
            {
                if (i1 < j1)
                {
                    ArchiveEntry archiveentry = aarchiveentry[i1];
                    Object obj = cc.a(new Object[] {
                        archiveentry.a.j(), archiveentry.b
                    });
                    if (obj == null)
                    {
                        obj = null;
                    } else
                    {
                        obj = new File(((String) (obj)));
                    }
                    if (archiveentry.c == null)
                    {
                        Logger.w("VunglePrepare", (new StringBuilder()).append(obj).append(" size is null").toString());
                        flag = false;
                    } else
                    {
                        int k1 = (int)((File) (obj)).length();
                        int l1 = archiveentry.c.intValue();
                        if (k1 == l1)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (flag)
                        {
                            Logger.v("VunglePrepare", (new StringBuilder()).append(obj).append(" size verified ").append(k1).toString());
                        } else
                        {
                            Logger.d("VunglePrepare", (new StringBuilder()).append(obj).append(" size ").append(k1).append(" doesn't match expected ").append(l1).toString());
                            flag = ((File) (obj)).exists();
                        }
                    }
                    if (flag)
                    {
                        break label0;
                    }
                    flag = false;
                }
                return flag;
            }
            i1++;
            flag = true;
        } while (true);
    }

    protected final volatile Ad.Factory v()
    {
        return h;
    }

    /* member class not found */
    class _cls1 {}

}
