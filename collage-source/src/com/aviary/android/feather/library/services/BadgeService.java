// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import com.aviary.android.feather.common.threading.b;
import com.aviary.android.feather.common.utils.c;
import com.aviary.android.feather.common.utils.d;
import com.aviary.android.feather.common.utils.f;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.aviary.android.feather.library.services:
//            BaseContextService, IAviaryController, PreferenceService, ThreadPoolService

public class BadgeService extends BaseContextService
{
    public static interface a
    {

        public abstract void a(BadgeService badgeservice);

        public abstract void a(BadgeService badgeservice, com.aviary.android.feather.library.filters.a.a a1);
    }


    private final Set d = Collections.synchronizedSet(new HashSet());
    private final List e = new LinkedList();
    private boolean f;
    private final ContentObserver g = new ContentObserver(new Handler()) {

        final BadgeService a;

        public void onChange(boolean flag)
        {
            onChange(flag, null);
        }

        public void onChange(boolean flag, Uri uri)
        {
            BadgeService.a(a);
        }

            
            {
                a = BadgeService.this;
                super(handler);
            }
    };

    public BadgeService(IAviaryController iaviarycontroller)
    {
        super(iaviarycontroller);
        f = true;
        g();
    }

    static void a(BadgeService badgeservice)
    {
        badgeservice.h();
    }

    static boolean a(BadgeService badgeservice, IAviaryController iaviarycontroller, PreferenceService preferenceservice, com.aviary.android.feather.library.filters.a.a a1, String s)
    {
        return badgeservice.a(iaviarycontroller, preferenceservice, a1, s);
    }

    private boolean a(IAviaryController iaviarycontroller, PreferenceService preferenceservice, com.aviary.android.feather.library.filters.a.a a1, String s)
    {
        if (iaviarycontroller == null || iaviarycontroller.a() == null || !e())
        {
            return false;
        }
        iaviarycontroller = iaviarycontroller.a();
        iaviarycontroller = iaviarycontroller.getContentResolver().query(com.aviary.android.feather.common.utils.f.a(iaviarycontroller, (new StringBuilder()).append("pack/type/").append(s).append("/content/available/list").toString()), new String[] {
            "pack_creationDate"
        }, null, null, "pack_id DESC");
        if (iaviarycontroller == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        if (!iaviarycontroller.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_154;
        }
        preferenceservice = new Date(preferenceservice.b(a1));
        a1 = com.aviary.android.feather.common.utils.c.a(iaviarycontroller.getString(0), true);
        long l;
        long l1;
        l = a1.getTime();
        l1 = preferenceservice.getTime();
        if (l > l1)
        {
            com.aviary.android.feather.common.utils.d.a(iaviarycontroller);
            return true;
        }
        break MISSING_BLOCK_LABEL_154;
        preferenceservice;
        preferenceservice.printStackTrace();
        com.aviary.android.feather.common.utils.d.a(iaviarycontroller);
        return false;
        com.aviary.android.feather.common.utils.d.a(iaviarycontroller);
        return false;
        preferenceservice;
        com.aviary.android.feather.common.utils.d.a(iaviarycontroller);
        throw preferenceservice;
    }

    static Set b(BadgeService badgeservice)
    {
        return badgeservice.d;
    }

    private Context c()
    {
        if (d() != null)
        {
            return d().a();
        } else
        {
            return null;
        }
    }

    private void c(com.aviary.android.feather.library.filters.a.a a1)
    {
        List list = e;
        list;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        arraylist = new ArrayList(e.size());
        for (Iterator iterator1 = e.iterator(); iterator1.hasNext(); arraylist.add((a)iterator1.next())) { }
        break MISSING_BLOCK_LABEL_68;
        a1;
        list;
        JVM INSTR monitorexit ;
        throw a1;
        list;
        JVM INSTR monitorexit ;
        Iterator iterator = arraylist.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a2 = (a)iterator.next();
            if (a2 != null)
            {
                c.post(new Runnable(a2, a1) {

                    final a a;
                    final com.aviary.android.feather.library.filters.a.a b;
                    final BadgeService c;

                    public void run()
                    {
                        a.a(c, b);
                    }

            
            {
                c = BadgeService.this;
                a = a1;
                b = a2;
                super();
            }
                });
            }
        } while (true);
        return;
    }

    static void c(BadgeService badgeservice)
    {
        badgeservice.i();
    }

    private void g()
    {
        Context context = c();
        if (context != null)
        {
            context.getContentResolver().registerContentObserver(com.aviary.android.feather.common.utils.f.a(context, "service/finished"), false, g);
            h();
        }
    }

    private void h()
    {
        ThreadPoolService threadpoolservice;
        if (e() && a() && d() != null)
        {
            if ((threadpoolservice = (ThreadPoolService)d().a(com/aviary/android/feather/library/services/ThreadPoolService)) != null)
            {
                threadpoolservice.a(new com.aviary.android.feather.common.threading.ThreadPool.b() {

                    final BadgeService a;

                    public volatile Object a(com.aviary.android.feather.common.threading.ThreadPool.Worker worker, Object aobj[])
                        throws Exception
                    {
                        return a(worker, (Integer[])aobj);
                    }

                    public transient Set a(com.aviary.android.feather.common.threading.ThreadPool.Worker worker, Integer ainteger[])
                        throws Exception
                    {
                        worker = a.d();
                        if (worker == null)
                        {
                            return null;
                        }
                        ainteger = new HashSet();
                        PreferenceService preferenceservice = (PreferenceService)worker.a(com/aviary/android/feather/library/services/PreferenceService);
                        if (preferenceservice == null)
                        {
                            return null;
                        }
                        if (BadgeService.a(a, worker, preferenceservice, com.aviary.android.feather.library.filters.a.a.e, "effect"))
                        {
                            ainteger.add(com.aviary.android.feather.library.filters.a.a.e);
                        }
                        if (BadgeService.a(a, worker, preferenceservice, com.aviary.android.feather.library.filters.a.a.q, "frame"))
                        {
                            ainteger.add(com.aviary.android.feather.library.filters.a.a.q);
                        }
                        if (BadgeService.a(a, worker, preferenceservice, com.aviary.android.feather.library.filters.a.a.j, "sticker"))
                        {
                            ainteger.add(com.aviary.android.feather.library.filters.a.a.j);
                        }
                        return ainteger;
                    }

            
            {
                a = BadgeService.this;
                super();
            }
                }, new b() {

                    final BadgeService a;

                    public void a(com.aviary.android.feather.common.threading.a a1)
                    {
label0:
                        {
                            if (a1 != null)
                            {
                                try
                                {
                                    a1 = (Set)a1.get();
                                }
                                // Misplaced declaration of an exception variable
                                catch (com.aviary.android.feather.common.threading.a a1)
                                {
                                    a1.printStackTrace();
                                    a1 = null;
                                }
                                if (a1 != null)
                                {
                                    int j = com.aviary.android.feather.library.services.BadgeService.b(a).size();
                                    com.aviary.android.feather.library.services.BadgeService.b(a).addAll(a1);
                                    if (com.aviary.android.feather.library.services.BadgeService.b(a).size() != j && a.c != null)
                                    {
                                        break label0;
                                    }
                                }
                            }
                            return;
                        }
                        a.c.post(new Runnable(this) {

                            final _cls3 a;

                            public void run()
                            {
                                com.aviary.android.feather.library.services.BadgeService.c(a.a);
                            }

            
            {
                a = _pcls3;
                super();
            }
                        });
                    }

            
            {
                a = BadgeService.this;
                super();
            }
                }, new Integer[] {
                    Integer.valueOf(0)
                });
                return;
            }
        }
    }

    private void i()
    {
        if (e() && a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        List list = e;
        list;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new ArrayList(e.size());
        for (Iterator iterator1 = e.iterator(); iterator1.hasNext(); ((ArrayList) (obj)).add((a)iterator1.next())) { }
        break MISSING_BLOCK_LABEL_80;
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
        list;
        JVM INSTR monitorexit ;
        Iterator iterator = ((ArrayList) (obj)).iterator();
        while (iterator.hasNext()) 
        {
            a a1 = (a)iterator.next();
            if (a1 != null)
            {
                a1.a(this);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(com.aviary.android.feather.library.filters.a.a a1)
    {
        while (!e() || !a() || !d.remove(a1)) 
        {
            return;
        }
        PreferenceService preferenceservice = (PreferenceService)d().a(com/aviary/android/feather/library/services/PreferenceService);
        if (preferenceservice != null)
        {
            preferenceservice.a(a1);
        }
        c(a1);
    }

    public void a(a a1)
    {
        if (!e() || !a())
        {
            return;
        }
        synchronized (e)
        {
            if (!e.contains(a1))
            {
                e.add(a1);
            }
        }
        return;
        a1;
        list;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void a(String s)
    {
        PreferenceService preferenceservice;
        if (e() && a() && s != null)
        {
            if ((preferenceservice = (PreferenceService)d().a(com/aviary/android/feather/library/services/PreferenceService)) != null)
            {
                preferenceservice.a((new StringBuilder()).append("badge.item.").append(s).toString(), 1);
                return;
            }
        }
    }

    public boolean a()
    {
        return f;
    }

    public void b()
    {
        d.clear();
        e.clear();
        Context context = c();
        if (context != null)
        {
            context.getContentResolver().unregisterContentObserver(g);
        }
    }

    public void b(a a1)
    {
        if (e())
        {
            return;
        }
        synchronized (e)
        {
            if (e.contains(a1))
            {
                e.remove(a1);
            }
        }
        return;
        a1;
        list;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public boolean b(com.aviary.android.feather.library.filters.a.a a1)
    {
        return d.contains(a1);
    }
}
