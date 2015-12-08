// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.EnumSet;

public final class gcj
{

    private static final oni b = new oni("debug.photos.wipe_on_sync");
    private static final EnumSet c;
    final gdn a;
    private final Context d;
    private final noz e;
    private final noz f;
    private final SparseArray g = new SparseArray();

    gcj(Context context, gdn gdn1)
    {
        d = context;
        a = gdn1;
        e = noz.a(context, 3, "MetadataSyncManager", new String[] {
            "sync"
        });
        f = noz.a(context, 2, "MetadataSyncManager", new String[] {
            "sync"
        });
    }

    private gcv a(gcq gcq1, ds ds, geu geu1, gct gct1, gcs gcs1, boolean flag)
    {
        return a(gcq1, ds, geu1, gct1, ((String) (null)), gcs1, flag);
    }

    private gcv a(gcq gcq1, ds ds, geu geu1, gct gct1, String s, gcs gcs1, boolean flag)
    {
        gcw gcw1;
        int i;
label0:
        {
            if (e.a())
            {
                noy.a("fetcher", gcs1);
                noy.a("resume token", s);
                noy.a("sync state", gct1);
                noy.a("is initial sync", Boolean.valueOf(flag));
                noy.a(geu1.d());
            }
            gcw1 = new gcw(d, geu1, gct1, s, gcs1);
            gct1 = null;
            gcs1 = null;
            i = 0;
label1:
            do
            {
label2:
                {
                    Object obj = gcw1.i.a();
                    int j;
                    boolean flag1;
                    if (gcw1.h == 0 || ((hfi) (obj)).b || ((hfi) (obj)).d)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    gcw1.j = flag1;
                    if (gcw1.e.a())
                    {
                        noy.a("validResumeToken", Boolean.valueOf(gcw1.c()));
                        noy.a("shouldStopSyncing", Boolean.valueOf(gcw1.d.b()));
                        noy.a("isCancelled", Boolean.valueOf(gcw1.b()));
                        noy.a("isEnvironmentOk", Boolean.valueOf(gcw1.j));
                    }
                    if (gcw1.j && !gcw1.b() && gcw1.c() && !gcw1.d.b())
                    {
                        j = 1;
                    } else
                    {
                        j = 0;
                    }
                    if (j != 0)
                    {
                        if (e.a())
                        {
                            noy.a("pages so far", Integer.valueOf(gcw1.h));
                        }
                        obj = gcw1.c.a(gcw1.f);
                        if (gcw1.b != null)
                        {
                            gct gct2 = gcw1.b;
                            gct2.a = ((gcx) (obj)).f() + gct2.a;
                            gct2 = gcw1.b;
                            gct2.b = gct2.b + 1;
                        }
                        gcw1.g = gcw1.f;
                        gcw1.f = ((gcx) (obj)).a();
                        gcw1.h = gcw1.h + 1;
                        gcw1.d.e();
                        i |= ((gcx) (obj)).c();
                        a(((Thread) (gcs1)));
                        if (gcw1.a && gcw1.h == 1)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        j = gcw1.h;
                        if (!((gcx) (obj)).d())
                        {
                            break label2;
                        }
                        gcq1.e(ds);
                    }
                    a(((Thread) (gcs1)));
                    if (gcw1.h <= 0)
                    {
                        break label0;
                    }
                    if (!TextUtils.isEmpty(gcw1.f))
                    {
                        j = 1;
                    } else
                    {
                        j = 0;
                    }
                    if (j != 0)
                    {
                        break label0;
                    }
                    gcs1 = gcq1.a(ds, gcr.b);
                    if (f.a())
                    {
                        noy.a(geu1.d());
                        noy.a("next sync token", gcs1);
                    }
                    if (TextUtils.isEmpty(gcs1))
                    {
                        gcq1.b(ds);
                        gcq1 = String.valueOf("We've completed a sync without getting a non null sync token, pages read: ");
                        i = gcw1.h;
                        ds = String.valueOf(gcw1);
                        throw new IllegalStateException((new StringBuilder(String.valueOf(gcq1).length() + 64 + String.valueOf(ds).length() + String.valueOf(s).length())).append(gcq1).append(i).append(", photoPager: ").append(ds).append(", resumeToken: ").append(s).append(", is initial sync: ").append(flag).toString());
                    }
                    break label1;
                }
                gct1 = ((gcx) (obj)).e();
                gcs1 = new Thread(new gck(this, gcq1, ds, geu1, flag, ((gcx) (obj)), flag1, j), "current-page-insert-thread");
                gcs1.start();
                gcq1.a(ds, gct1);
            } while (true);
            gcq1.d(ds);
        }
        if (e.a())
        {
            noy.a("stop reason", gcw1.a());
            noy.a("pages retrieved", Integer.valueOf(gcw1.h));
            noy.a("key", ds);
            noy.a("sync token", gcq1.a(ds, gcr.a));
            noy.a(geu1.d());
        }
        gcq1 = new gcv(gcw1.a(), gct1);
        if (i != 0)
        {
            gcq1.c = true;
        }
        return gcq1;
    }

    private gcv a(gcq gcq1, ds ds, geu geu1, String s, gcs gcs1, boolean flag)
    {
        return a(gcq1, ds, geu1, ((gct) (null)), s, gcs1, flag);
    }

    static void a(gcj gcj1, gcq gcq1, ds ds, boolean flag, int i, boolean flag1, gcx gcx1)
    {
        if (flag)
        {
            String s = gcx1.b();
            if (gcj1.f.a())
            {
                noy.a("key", ds);
                noy.a("nextSyncToken", s);
            }
            if (TextUtils.isEmpty(s))
            {
                gcq1.b(ds);
                gcj1 = String.valueOf("We got a null sync token from the server, pages read: ");
                throw new IllegalStateException((new StringBuilder(String.valueOf(gcj1).length() + 33)).append(gcj1).append(i).append(", isInitialSync: ").append(flag1).toString());
            }
            if (gcj1.f.a())
            {
                noy.a("key", ds);
                noy.a("resume token", gcx1.a());
                noy.a("nextSyncToken", s);
                noy.a("isInitialSync", Boolean.valueOf(flag1));
            }
            gcq1.a(ds, flag1, s, gcx1.a());
            return;
        }
        if (gcj1.f.a())
        {
            noy.a("key", ds);
            noy.a("resume token", gcx1.a());
            noy.a("isInitialSync", Boolean.valueOf(flag1));
        }
        gcq1.a(ds, flag1, null, gcx1.a());
    }

    private static void a(Thread thread)
    {
        if (thread == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        thread.join();
        return;
        thread;
        throw new IllegalStateException("Insert page thread interrupted!", thread);
    }

    public final gcy a(int i, gct gct1, get get)
    {
        Object obj = a(i);
        obj;
        JVM INSTR monitorenter ;
        gdn gdn1;
        gei gei;
        geu geu1;
        Object obj1;
        gdn1 = a;
        gei = gdn.a(i);
        geu1 = gdn1.a(gei, get);
        gdn1.c(gei);
        if (gdn1.a(gei))
        {
            break MISSING_BLOCK_LABEL_677;
        }
        get = gdn1.a(gei, gcr.c);
        obj1 = gdn1.a(geu1);
        if (!TextUtils.isEmpty(get)) goto _L2; else goto _L1
_L1:
        get = a(((gcq) (gdn1)), ((ds) (gei)), geu1, gct1, ((gcs) (obj1)), true);
_L13:
        if (((gcv) (get)).a != gcu.a) goto _L4; else goto _L3
_L3:
        get = new gcy(gda.b, ((gcv) (get)).b, ((gcv) (get)).c);
_L14:
        Object obj2 = gdn1.a(gei, gcr.a);
        if (!geu1.b() && !TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L6; else goto _L5
_L5:
        obj1 = gdn1.a(gei, gcr.d);
        obj2 = gdn1.a(geu1, ((String) (obj2)));
        if (!TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L8; else goto _L7
_L7:
        gct1 = a(((gcq) (gdn1)), ((ds) (gei)), geu1, gct1, ((gcs) (obj2)), false);
_L15:
        if (((gcv) (gct1)).a != gcu.a) goto _L10; else goto _L9
_L9:
        gct1 = new gcy(gda.c, ((gcv) (gct1)).b, ((gcv) (gct1)).c);
_L16:
        geu1.f();
        gdn1.a(gei, get, gct1);
        if (get == null) goto _L12; else goto _L11
_L11:
        obj;
        JVM INSTR monitorexit ;
        return get;
_L2:
        obj2 = gdn1.a(gei, gcr.a);
        String s = gdn1.a(gei, gcr.b);
        if (TextUtils.isEmpty(((CharSequence) (obj2))) && TextUtils.isEmpty(s))
        {
            gdn1.b(gei);
            gct1 = String.valueOf("Trying to resume initial sync with empty current and next sync tokens, syncSource: ");
            get = String.valueOf(geu1.c());
            throw new IllegalStateException((new StringBuilder(String.valueOf(gct1).length() + 0 + String.valueOf(get).length())).append(gct1).append(get).toString());
        }
        break MISSING_BLOCK_LABEL_398;
        gct1;
        obj;
        JVM INSTR monitorexit ;
        throw gct1;
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            gdn1.a(gei, ((String) (obj2)));
        }
        get = a(((gcq) (gdn1)), ((ds) (gei)), geu1, ((String) (get)), ((gcs) (obj1)), true);
          goto _L13
_L4:
label0:
        {
            if (((gcv) (get)).a != gcu.b)
            {
                break label0;
            }
            get = new gcy(gda.a, ((gcv) (get)).b, ((gcv) (get)).c);
        }
          goto _L14
label1:
        {
            if (((gcv) (get)).a != gcu.c)
            {
                break label1;
            }
            get = new gcy(gda.d, ((gcv) (get)).b, ((gcv) (get)).c);
        }
          goto _L14
        gct1 = String.valueOf(((gcv) (get)).a);
        throw new IllegalStateException((new StringBuilder(String.valueOf(gct1).length() + 39)).append("Initial sync ended for unknown reason: ").append(gct1).toString());
_L8:
        gct1 = a(((gcq) (gdn1)), ((ds) (gei)), geu1, ((String) (obj1)), ((gcs) (obj2)), false);
          goto _L15
_L10:
label2:
        {
            if (!c.contains(((gcv) (gct1)).a))
            {
                break label2;
            }
            gct1 = new gcy(gda.d, ((gcv) (gct1)).b, ((gcv) (gct1)).c);
        }
          goto _L16
        gct1 = String.valueOf(((gcv) (gct1)).a);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(gct1).length() + 37)).append("Delta sync ended for unknown reason: ").append(gct1).toString());
_L12:
        get = gct1;
        if (gct1 != null) goto _L11; else goto _L17
_L17:
        get = new gcy(gda.e, null, false);
          goto _L11
_L6:
        gct1 = null;
          goto _L16
        get = null;
          goto _L14
    }

    Object a(int i)
    {
        SparseArray sparsearray = g;
        sparsearray;
        JVM INSTR monitorenter ;
        Object obj1 = g.get(i);
        Object obj;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        obj = new Object();
        g.put(i, obj);
        sparsearray;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        c = EnumSet.of(gcu.c, gcu.b);
    }
}
