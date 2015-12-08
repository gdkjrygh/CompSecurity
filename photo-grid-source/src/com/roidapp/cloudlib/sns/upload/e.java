// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.upload;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.p;
import com.roidapp.baselib.b.a;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.t;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.roidapp.cloudlib.sns.upload:
//            f, g, UploadPGService, j, 
//            i, h

public class e
{

    private static e a;
    private CopyOnWriteArrayList b;
    private CopyOnWriteArrayList c;
    private i d;
    private LinkedList e;
    private Handler f;
    private ConcurrentLinkedQueue g;
    private String h;
    private Comparator i;

    private e()
    {
        b = new CopyOnWriteArrayList();
        c = new CopyOnWriteArrayList();
        e = new LinkedList();
        f = new f(this, aj.a().getMainLooper());
        g = new ConcurrentLinkedQueue();
        Object obj = new File(aj.a().getCacheDir(), "upload");
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).mkdir();
        }
        h = ((File) (obj)).getAbsolutePath();
        i = new g(this);
        obj = new Intent(aj.a(), com/roidapp/cloudlib/sns/upload/UploadPGService);
        ((Intent) (obj)).putExtra("loadCache", true);
        aj.a().startService(((Intent) (obj)));
    }

    public static long a(Context context, String s, String s1, String s2)
    {
        long l = System.currentTimeMillis();
        context = new Intent(context, com/roidapp/cloudlib/sns/upload/UploadPGService);
        context.putExtra("upload_path", s);
        context.putExtra("upload_tag", s1);
        context.putExtra("upload_comment", s2);
        context.putExtra("upload_id", l);
        a().f.obtainMessage(3, context).sendToTarget();
        return l;
    }

    public static e a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/roidapp/cloudlib/sns/upload/e;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new e();
        }
        com/roidapp/cloudlib/sns/upload/e;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/roidapp/cloudlib/sns/upload/e;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(long l, int k)
    {
        if (e != null)
        {
            if (f.getLooper() == Looper.myLooper())
            {
                Iterator iterator = e.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    j j1 = (j)iterator.next();
                    if (j1 != null)
                    {
                        j1.a(l, k);
                    }
                } while (true);
            } else
            {
                f.sendMessage(Message.obtain(f, 2, k, 0, Long.valueOf(l)));
            }
        }
    }

    public static void a(Context context, i k)
    {
        Intent intent = new Intent(context, com/roidapp/cloudlib/sns/upload/UploadPGService);
        intent.putExtra("upload_path", k.a);
        intent.putExtra("upload_tag", k.b);
        intent.putExtra("upload_comment", k.c);
        intent.putExtra("upload_id", k.e);
        context.startService(intent);
    }

    public static void a(ImageView imageview, String s)
    {
        if (imageview != null)
        {
            com.bumptech.glide.h.b(imageview.getContext()).a(s).a(com.bumptech.glide.load.b.e.b).g().b(com.roidapp.baselib.b.a.b()).b(150, 150).a(imageview);
        }
    }

    static void a(e e1)
    {
        e1.h();
    }

    static void a(e e1, long l, int k)
    {
        e1.a(l, k);
    }

    static boolean a(Intent intent)
    {
        return intent.getBooleanExtra("loadCache", false);
    }

    static void b(e e1)
    {
        e1.i();
    }

    private void c(long l)
    {
        if (d())
        {
            g.add(Long.valueOf(l));
            j();
            return;
        } else
        {
            (new File(h, String.valueOf(l))).delete();
            return;
        }
    }

    static void c(e e1)
    {
        e1.j();
    }

    private void h()
    {
        if (e != null)
        {
            if (f.getLooper() == Looper.myLooper())
            {
                Iterator iterator = e.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    j j1 = (j)iterator.next();
                    if (j1 != null)
                    {
                        j1.a();
                    }
                } while (true);
            } else
            {
                f.sendEmptyMessage(0);
            }
        }
    }

    private void i()
    {
        if (e != null)
        {
            if (f.getLooper() == Looper.myLooper())
            {
                Iterator iterator = e.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    j j1 = (j)iterator.next();
                    if (j1 != null)
                    {
                        d();
                        j1.b();
                    }
                } while (true);
            } else
            {
                f.sendEmptyMessage(1);
            }
        }
    }

    private void j()
    {
        if (f.getLooper() != Looper.myLooper())
        {
            do
            {
                Object obj = g.poll();
                if (obj == null)
                {
                    break;
                }
                if (obj instanceof i)
                {
                    obj = (i)obj;
                    String s = String.valueOf(((i) (obj)).e);
                    JSONArray jsonarray = new JSONArray();
                    jsonarray.put(s);
                    jsonarray.put(((i) (obj)).a);
                    jsonarray.put(((i) (obj)).c);
                    jsonarray.put(((i) (obj)).b);
                    com.roidapp.baselib.d.a.a(jsonarray.toString(), new File(h, s), "UTF-8");
                } else
                if (obj instanceof Long)
                {
                    obj = (Long)obj;
                    (new File(h, String.valueOf(obj))).delete();
                }
            } while (true);
        } else
        {
            t.b().execute(new com.roidapp.cloudlib.sns.upload.h(this, (byte)0));
        }
    }

    public final i a(long l)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            i k = (i)iterator.next();
            if (k.e == l)
            {
                return k;
            }
        }

        if (d != null)
        {
            d.f = 1;
            if (d.e == l)
            {
                return d;
            }
        }
        for (Iterator iterator1 = c.iterator(); iterator1.hasNext();)
        {
            i i1 = (i)iterator1.next();
            if (i1.e == l)
            {
                return i1;
            }
        }

        return null;
    }

    final void a(int k)
    {
        if (d != null)
        {
            d.d = k;
            a(d.e, k);
        }
    }

    final void a(i k)
    {
        if (b.add(k))
        {
            h();
        }
    }

    public final void a(j j1)
    {
        if (j1 != null && !e.contains(j1))
        {
            e.add(j1);
        }
    }

    public final void a(String s)
    {
        if (s != null && c != null)
        {
            Iterator iterator = c.iterator();
            boolean flag = false;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                i k = (i)iterator.next();
                if (k.a.equals(s))
                {
                    c.remove(k);
                    c(k.e);
                    flag = true;
                }
            } while (true);
            if (flag)
            {
                i();
            }
        }
    }

    public final int b()
    {
        return b.size();
    }

    public final void b(long l)
    {
        if (c != null)
        {
            Iterator iterator = c.iterator();
            boolean flag = false;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                i k = (i)iterator.next();
                if (k.e == l)
                {
                    c.remove(k);
                    c(l);
                    flag = true;
                }
            } while (true);
            if (flag)
            {
                i();
            }
        }
    }

    final void b(i k)
    {
        if (b.remove(k))
        {
            h();
        }
    }

    public final void b(j j1)
    {
        e.remove(j1);
    }

    public final Collection c()
    {
        TreeSet treeset = new TreeSet(i);
        i k;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); treeset.add(k))
        {
            k = (i)iterator.next();
            k.f = 0;
        }

        if (d != null)
        {
            d.f = 1;
            treeset.add(d);
        }
        i l;
        for (Iterator iterator1 = c.iterator(); iterator1.hasNext(); treeset.add(l))
        {
            l = (i)iterator1.next();
            l.f = 2;
        }

        return treeset;
    }

    final void c(i k)
    {
        d = k;
        a(0);
    }

    final void d(i k)
    {
        g.add(k);
        j();
    }

    public final boolean d()
    {
        return d != null || !b.isEmpty();
    }

    final void e()
    {
        if (d != null)
        {
            if (c.add(d))
            {
                d = null;
                i();
            }
            d = null;
        }
    }

    final void f()
    {
        if (d != null)
        {
            c(d.e);
            if (d.d != 100)
            {
                a(100);
            }
        }
        d = null;
    }

    final void g()
    {
        if (f.getLooper() == Looper.myLooper()) goto _L2; else goto _L1
_L1:
        Object obj = new File(h);
        if (!((File) (obj)).isDirectory()) goto _L2; else goto _L3
_L3:
        File afile[] = ((File) (obj)).listFiles();
        if (afile == null) goto _L2; else goto _L4
_L4:
        Object obj1;
        obj1 = Arrays.asList(afile);
        afile = new TreeSet(i);
        obj1 = ((List) (obj1)).iterator();
_L6:
        if (((Iterator) (obj1)).hasNext())
        {
            Object obj2 = (File)((Iterator) (obj1)).next();
            Object obj3 = com.roidapp.baselib.d.a.a(((File) (obj2)), "UTF-8");
            obj2 = ((File) (obj2)).getName();
            if (obj3 != null)
            {
                try
                {
                    obj3 = new JSONArray(((String) (obj3)));
                    if (((JSONArray) (obj3)).length() == 4)
                    {
                        i k = new i(this, (byte)0);
                        k.e = Long.parseLong(((JSONArray) (obj3)).getString(0));
                        if (k.e == Long.parseLong(((String) (obj2))))
                        {
                            k.a = ((JSONArray) (obj3)).getString(1);
                            k.c = ((JSONArray) (obj3)).getString(2);
                            k.b = ((JSONArray) (obj3)).getString(3);
                            afile.add(k);
                        }
                    }
                }
                catch (JSONException jsonexception) { }
                catch (NumberFormatException numberformatexception) { }
            }
            continue; /* Loop/switch isn't completed */
        }
        c.addAll(afile);
        afile.clear();
        i();
_L2:
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
