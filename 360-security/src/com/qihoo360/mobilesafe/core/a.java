// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.qihoo.security.ui.b.e;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.assist.SysclearAsyncTask19;
import com.qihoo360.mobilesafe.core.d.d;
import com.qihoo360.mobilesafe.service.KillBean;
import com.qihoo360.mobilesafe.service.ProcessInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.qihoo360.mobilesafe.core:
//            ProcessState

public class com.qihoo360.mobilesafe.core.a extends ProcessState
{
    class a extends SysclearAsyncTask19
        implements Comparator
    {

        final com.qihoo360.mobilesafe.core.a c;
        private int d;
        private int e;
        private int f;
        private List g;
        private com.qihoo360.mobilesafe.core.a.a h;
        private boolean i;

        static void a(a a1, int j)
        {
            a1.d = j;
        }

        private void a(KillBean killbean)
        {
            int ai[];
            killbean.oom_adj = 0x7fffffff;
            ai = killbean.pids;
            if (ai == null) goto _L2; else goto _L1
_L1:
            int j;
            int k;
            k = ai.length;
            j = 0;
_L5:
            if (j < k) goto _L3; else goto _L2
_L2:
            return;
_L3:
            int l = com.qihoo360.mobilesafe.core.d.d.a(ai[j]);
            while (false) 
            {
                if (l != -1 && l < killbean.oom_adj)
                {
                    killbean.oom_adj = l;
                }
                j++;
            }
            if (true) goto _L5; else goto _L4
_L4:
        }

        public int a(KillBean killbean, KillBean killbean1)
        {
            if (killbean.oom_adj != killbean1.oom_adj)
            {
                return killbean1.oom_adj - killbean.oom_adj;
            } else
            {
                return killbean1.memory - killbean.memory;
            }
        }

        protected volatile transient Object a(Object aobj[])
        {
            return a((Void[])aobj);
        }

        protected transient Void a(Void avoid[])
        {
            int i1;
            i1 = 0;
            c.b();
            if (g == null || g.size() <= 0) goto _L2; else goto _L1
_L1:
            int j1;
            e = g.size();
            avoid = g.iterator();
            j1 = 5;
_L6:
            if (avoid.hasNext()) goto _L4; else goto _L3
_L3:
            int j;
            int k1;
            boolean flag;
            KillBean killbean;
            int k;
            try
            {
                Collections.sort(g, this);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                Log.e(com.qihoo360.mobilesafe.core.a.a(), "Collections.sort ", avoid);
            }
            if (i)
            {
                c(new Integer[] {
                    Integer.valueOf(-1000)
                });
            }
            k1 = f;
            flag = com.qihoo360.mobilesafe.support.a.c(com.qihoo360.mobilesafe.core.a.a(c));
            j = 0;
_L7:
            if (j < e) goto _L5; else goto _L2
_L2:
            return null;
_L4:
            killbean = (KillBean)avoid.next();
            a(killbean);
            j = j1;
            if (killbean.importance == 300)
            {
                j = j1;
                if (killbean.oom_adj < j1)
                {
                    j = killbean.oom_adj;
                }
            }
            k = f;
            f = killbean.memory + k;
            j1 = j;
              goto _L6
_L5:
            if (!com.qihoo360.mobilesafe.core.a.b(c).b(-1))
            {
                continue; /* Loop/switch isn't completed */
            }
            Thread.sleep(1000L);
              goto _L7
            avoid;
            if ((float)k1 / (float)com.qihoo360.mobilesafe.core.a.c(c) <= 0.03F || d < com.qihoo360.mobilesafe.core.a.d(c).get() || i1 >= 30) goto _L2; else goto _L8
_L8:
            int l;
label0:
            {
                avoid = g;
                l = j + 1;
                avoid = (KillBean)avoid.get(j);
                if (((KillBean) (avoid)).skip)
                {
                    break MISSING_BLOCK_LABEL_418;
                }
                if (((KillBean) (avoid)).oom_adj > j1 || flag)
                {
                    break label0;
                }
                j = l;
            }
              goto _L7
            String s = ((KillBean) (avoid)).packageName;
            if (TextUtils.isEmpty(s))
            {
                break MISSING_BLOCK_LABEL_418;
            }
            System.currentTimeMillis();
            k1 -= ((KillBean) (avoid)).memory;
            if (((KillBean) (avoid)).importance <= 300)
            {
                j = i1 + 1;
            } else
            {
                j = i1;
            }
            c.a(s);
            if (e <= 1)
            {
                break MISSING_BLOCK_LABEL_403;
            }
            Thread.sleep(200L);
            i1 = j;
            j = l;
              goto _L7
            avoid;
            i1 = j;
            j = l;
              goto _L7
            i1 = j;
            j = l;
              goto _L7
            j = l;
              goto _L7
        }

        protected void a()
        {
            super.a();
            c.d();
            if (h != null)
            {
                h.b(g);
            }
        }

        protected volatile void a(Object obj)
        {
            a((Void)obj);
        }

        protected void a(Void void1)
        {
            super.a(void1);
            c.c();
            if (!i && h != null)
            {
                h.a(e, f);
            }
        }

        protected transient void a(Integer ainteger[])
        {
            super.b(ainteger);
            if (ainteger != null && ainteger.length > 0)
            {
                if (ainteger[0].intValue() == -1000)
                {
                    if (h != null)
                    {
                        h.a(e, f);
                    }
                } else
                if (h != null)
                {
                    h.c();
                    return;
                }
            }
        }

        protected transient void b(Object aobj[])
        {
            a((Integer[])aobj);
        }

        public int compare(Object obj, Object obj1)
        {
            return a((KillBean)obj, (KillBean)obj1);
        }

        public a(boolean flag, List list, com.qihoo360.mobilesafe.core.a.a a2)
        {
            c = com.qihoo360.mobilesafe.core.a.this;
            super();
            g = list;
            h = a2;
            i = flag;
        }
    }


    public static final ExecutorService a = Executors.newSingleThreadExecutor();
    private static final String c = com/qihoo360/mobilesafe/core/a.getSimpleName();
    private Context d;
    private ActivityManager e;
    private String f;
    private int g;
    private AtomicInteger h;
    private e i;

    public com.qihoo360.mobilesafe.core.a(Context context)
    {
        f = null;
        d = context;
        b = ProcessState.State.STATE_NULL;
        e = (ActivityManager)Utils.getSystemService(d, "activity");
        i = com.qihoo.security.ui.b.e.a(d);
        g = com.qihoo360.mobilesafe.core.d.d.a();
        h = new AtomicInteger(0);
    }

    static Context a(com.qihoo360.mobilesafe.core.a a1)
    {
        return a1.d;
    }

    static String a()
    {
        return c;
    }

    private void a(boolean flag, List list, com.qihoo360.mobilesafe.core.a.a a1)
    {
        if (list != null && !list.isEmpty())
        {
            list = new a(flag, list, a1);
            a.a(list, h.incrementAndGet());
            list.a(a, new Void[0]);
        }
    }

    static e b(com.qihoo360.mobilesafe.core.a a1)
    {
        return a1.i;
    }

    private boolean b(String s)
    {
        String s1 = com.qihoo360.mobilesafe.support.a.a("app_process");
        if (s1 != null)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(s1);
            arraylist.add("com.qihoo360.RT");
            arraylist.add("-fs");
            arraylist.add(s);
            s = new ArrayList();
            s.add((new StringBuilder("CLASSPATH=")).append(a(d)).toString());
            com.qihoo360.mobilesafe.support.a.a(com.qihoo360.mobilesafe.support.a.d(d), Utils.pathAppend(s1, "app_process"), arraylist, s, null);
            return true;
        } else
        {
            return false;
        }
    }

    static int c(com.qihoo360.mobilesafe.core.a a1)
    {
        return a1.g;
    }

    private void c(String s)
    {
        try
        {
            b(s);
            return;
        }
        catch (Exception exception)
        {
            d(s);
        }
    }

    static AtomicInteger d(com.qihoo360.mobilesafe.core.a a1)
    {
        return a1.h;
    }

    private void d(String s)
    {
        try
        {
            e.killBackgroundProcesses(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public String a(Context context)
    {
        if (f == null)
        {
            File file = context.getFileStreamPath("rt1.jar");
            if (file != null)
            {
                if (!file.exists() || !file.isFile())
                {
                    Utils.resetFile(context, "rt1.jar", false);
                }
                f = file.getAbsolutePath();
            }
        }
        return f;
    }

    void a(String s)
    {
        if (com.qihoo360.mobilesafe.support.a.c(d))
        {
            c(s);
            return;
        } else
        {
            d(s);
            return;
        }
    }

    public void a(List list, com.qihoo360.mobilesafe.core.a.a a1)
    {
        a(false, list, a1);
    }

    public void a(List list, List list1, com.qihoo360.mobilesafe.core.a.a a1)
    {
        if (list == null || list.isEmpty()) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
_L7:
        if (list.hasNext()) goto _L4; else goto _L3
_L3:
        if (list1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (!list1.isEmpty())
        {
            arraylist.addAll(list1);
        }
        a(true, ((List) (arraylist)), a1);
        return;
_L4:
        ProcessInfo processinfo;
        int ai[];
        KillBean killbean;
        int k;
        processinfo = (ProcessInfo)list.next();
        if (TextUtils.isEmpty(processinfo.packageName))
        {
            continue; /* Loop/switch isn't completed */
        }
        ai = processinfo.pids;
        killbean = new KillBean();
        killbean.packageName = processinfo.packageName;
        killbean.memory = processinfo.useMemory;
        k = ai.length;
        killbean.pids = new int[k];
        int j = 0;
_L5:
        if (j >= k)
        {
            try
            {
                killbean.importance = processinfo.importance;
                arraylist.add(killbean);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        killbean.pids[j] = ai[j];
        j++;
        if (true) goto _L5; else goto _L2
_L2:
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

}
