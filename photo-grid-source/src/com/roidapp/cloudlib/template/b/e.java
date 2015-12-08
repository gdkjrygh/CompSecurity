// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.b;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.roidapp.baselib.d.a;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.c;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.cloudlib.template.g;
import com.roidapp.cloudlib.template.j;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.roidapp.cloudlib.template.b:
//            j, d, f, l

public final class e extends com.roidapp.cloudlib.template.b.j
{

    private HttpURLConnection b;
    private WeakReference c;
    private WeakReference d;

    public e(WeakReference weakreference, WeakReference weakreference1)
    {
        c = weakreference;
        d = weakreference1;
    }

    private transient Object a(com.roidapp.cloudlib.template.b.l al1[])
    {
        Context context;
        Handler handler;
        al1 = (d)al1[0];
        context = (Context)c.get();
        handler = (Handler)d.get();
        if (context == null || handler == null || al1 == null)
        {
            return null;
        }
        context;
        JVM INSTR monitorenter ;
        if (com.roidapp.cloudlib.common.c.a())
        {
            break MISSING_BLOCK_LABEL_71;
        }
        a(handler, 4354, null);
        context;
        JVM INSTR monitorexit ;
        return null;
        al1;
        context;
        JVM INSTR monitorexit ;
        throw al1;
        if (b())
        {
            break MISSING_BLOCK_LABEL_90;
        }
        a(handler, 4353, null);
        context;
        JVM INSTR monitorexit ;
        return null;
        context;
        JVM INSTR monitorexit ;
        if (!((d) (al1)).a) goto _L2; else goto _L1
_L1:
        a(context, handler);
_L4:
        return null;
_L2:
label0:
        {
label1:
            {
                if (!((d) (al1)).b)
                {
                    break label0;
                }
                boolean flag = ((d) (al1)).e;
                String s = (new StringBuilder()).append(a).append("/info").toString();
                boolean flag1 = PreferenceManager.getDefaultSharedPreferences(context).getBoolean("template_new", false);
                boolean flag2 = com.roidapp.baselib.d.a.a(s, false);
                boolean flag3 = l.b((Activity)context);
                if (flag1)
                {
                    PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("template_new", false).apply();
                }
                Object obj;
                long l1;
                long l2;
                if (!flag3)
                {
                    if (flag1)
                    {
                        a(handler, 8982, context.getResources().getString(at.b));
                    }
                    al1 = a(context, flag2, s);
                } else
                if (!flag2 || flag1 || flag)
                {
                    obj = a("http://dl.pg.ksmobile.com/templates/info", s);
                    al1 = ((com.roidapp.cloudlib.template.b.l []) (obj));
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        g.a(context, j.a(((String) (obj))));
                        al1 = ((com.roidapp.cloudlib.template.b.l []) (obj));
                    }
                } else
                {
                    al1 = null;
                }
                obj = al1;
                if (TextUtils.isEmpty(al1))
                {
                    obj = a(context, flag2, s);
                }
                obj = j.b(((String) (obj)));
                if (obj != null)
                {
                    al1 = ((com.roidapp.cloudlib.template.b.l []) (obj));
                    if (!((List) (obj)).isEmpty())
                    {
                        break label1;
                    }
                }
                al1 = j.b(a(context, false, ((String) (null))));
                (new File(s)).delete();
            }
            a(handler, 8979, al1);
            continue; /* Loop/switch isn't completed */
        }
        if (((d) (al1)).c)
        {
            flag = ((d) (al1)).d;
            s = (new StringBuilder()).append(a).append("/hotest").toString();
            flag1 = com.roidapp.baselib.d.a.a(s, false);
            flag2 = l.b((Activity)context);
            obj = PreferenceManager.getDefaultSharedPreferences(context);
            l1 = ((SharedPreferences) (obj)).getLong("cloudlib_template_update_time", 0L);
            al1 = Calendar.getInstance();
            al1.setTimeInMillis(l1 + 0x5265c00L);
            al1.set(al1.get(1), al1.get(2), al1.get(5), 0, 0, 0);
            l1 = al1.getTimeInMillis();
            l2 = System.currentTimeMillis();
            if (!flag2 && !flag1)
            {
                a(handler, 9001, context.getString(at.b));
            } else
            {
                if (!flag1 || flag || l2 >= l1)
                {
                    al1 = a(al.b, s);
                    ((SharedPreferences) (obj)).edit().putLong("cloudlib_template_update_time", l2).apply();
                } else
                {
                    al1 = null;
                }
                obj = al1;
                if (TextUtils.isEmpty(al1))
                {
                    obj = al1;
                    if (flag1)
                    {
                        obj = a(context, true, s);
                    }
                }
                al1 = j.b(((String) (obj)));
                if (al1 == null || al1.isEmpty())
                {
                    (new File(s)).delete();
                    a(handler, 9001, context.getString(at.b));
                } else
                {
                    a(handler, 8981, al1);
                }
            }
        } else
        if (((d) (al1)).f)
        {
            a(context, handler);
            a(context, handler, ((d) (al1)).h);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String a(Context context, boolean flag, String s)
    {
        Object obj = new StringBuilder();
        if (!flag) goto _L2; else goto _L1
_L1:
        context = new BufferedReader(new FileReader(new File(s)));
_L6:
        s = context;
        String s1 = context.readLine();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        s = context;
        try
        {
            ((StringBuilder) (obj)).append(s1);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            if (true) goto _L0; else goto _L0
        }
_L4:
        s = context;
        ((IOException) (obj)).printStackTrace();
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return null;
            }
        }
        return null;
_L2:
        try
        {
            context = new BufferedReader(new InputStreamReader(al.g().b(context)));
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            context = null;
        }
        finally
        {
            s = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
        s = context;
        obj = ((StringBuilder) (obj)).toString();
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return ((String) (obj));
        }
        return ((String) (obj));
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw context;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private String a(String s, String s1)
    {
        l.a();
        BufferedReader bufferedreader;
        b = (HttpURLConnection)(new URL(s)).openConnection();
        b.setConnectTimeout(30000);
        b.setReadTimeout(30000);
        b.setDoInput(true);
        b.connect();
        bufferedreader = new BufferedReader(new InputStreamReader(b.getInputStream()));
        s = new StringBuilder();
_L4:
        String s2 = bufferedreader.readLine();
        if (s2 == null) goto _L2; else goto _L1
_L1:
        if (isCancelled()) goto _L2; else goto _L3
_L3:
        s.append(s2);
          goto _L4
        s1;
        s = null;
_L7:
        s1.printStackTrace();
        if (b != null)
        {
            b.disconnect();
            b = null;
        }
        com.roidapp.baselib.d.a.a(bufferedreader);
        com.roidapp.baselib.d.a.a(s);
        return null;
_L2:
        s2 = s.toString();
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_295;
        }
        s = new File(s1);
        if (!s.getParentFile().exists())
        {
            s.getParentFile().mkdirs();
        }
        s = new FileWriter(s);
        s.write(s2);
_L8:
        if (b != null)
        {
            b.disconnect();
            b = null;
        }
        com.roidapp.baselib.d.a.a(bufferedreader);
        com.roidapp.baselib.d.a.a(s);
        return s2;
        s1;
        s = null;
        bufferedreader = null;
_L6:
        if (b != null)
        {
            b.disconnect();
            b = null;
        }
        com.roidapp.baselib.d.a.a(bufferedreader);
        com.roidapp.baselib.d.a.a(s);
        throw s1;
        s1;
        s = null;
        continue; /* Loop/switch isn't completed */
        s1;
        continue; /* Loop/switch isn't completed */
        s1;
        if (true) goto _L6; else goto _L5
_L5:
        s1;
        s = null;
        bufferedreader = null;
          goto _L7
        s1;
          goto _L7
        s = null;
          goto _L8
    }

    private static void a(Context context, Handler handler)
    {
        Object obj;
        HashMap hashmap;
        String s;
label0:
        {
            obj = (new StringBuilder()).append(a).append("/local").toString();
            s = (new StringBuilder()).append(a).append("/favourite").toString();
            hashmap = new HashMap();
            List list = j.b(a(context, com.roidapp.baselib.d.a.a(((String) (obj)), false), ((String) (obj))));
            if (list != null)
            {
                obj = list;
                if (!list.isEmpty())
                {
                    break label0;
                }
            }
            obj = j.b(a(context, false, ((String) (null))));
        }
        hashmap.put("local", obj);
        if (com.roidapp.baselib.d.a.a(s, false))
        {
            context = j.b(a(null, true, s));
            if (context != null && !context.isEmpty())
            {
                hashmap.put("favourite", context);
            }
        }
        a(handler, 0x23611, hashmap);
    }

    private void a(Context context, Handler handler, int i)
    {
        Object obj;
label0:
        {
            List list;
            if (!l.b((Activity)context))
            {
                a(handler, 8982, context.getResources().getString(at.b));
                obj = null;
            } else
            {
                obj = a(String.format(al.d, new Object[] {
                    Integer.valueOf(i)
                }), ((String) (null)));
            }
            list = j.a(((String) (obj)), true);
            if (list != null)
            {
                obj = list;
                if (!list.isEmpty())
                {
                    break label0;
                }
            }
            obj = j.b(a(context, false, ((String) (null))));
            if (obj != null)
            {
                Iterator iterator = ((List) (obj)).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    TemplateInfo templateinfo = (TemplateInfo)iterator.next();
                    if (templateinfo.j() != i && templateinfo.j() != -1)
                    {
                        iterator.remove();
                    }
                } while (true);
            }
        }
        if (obj == null || ((List) (obj)).isEmpty())
        {
            a(handler, 8982, context.getResources().getString(at.b));
            return;
        } else
        {
            a(handler, 9009, obj);
            return;
        }
    }

    final void a()
    {
        if (!isCancelled())
        {
            cancel(true);
        }
        if (b != null)
        {
            (new f(this, new WeakReference(b))).start();
        }
    }

    final void a(com.roidapp.cloudlib.template.b.l l1)
    {
        executeOnExecutor(com.roidapp.baselib.c.c.THREAD_POOL_EXECUTOR, new com.roidapp.cloudlib.template.b.l[] {
            l1
        });
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((com.roidapp.cloudlib.template.b.l[])aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        cancel(true);
    }
}
