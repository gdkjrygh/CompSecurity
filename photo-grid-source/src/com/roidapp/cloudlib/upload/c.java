// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import android.content.Context;
import android.content.Intent;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            e, f, UploadPhotoService, d

final class c
{

    private static c a;
    private static int b = 1;
    private static Object d = new Object();
    private Context c;
    private List e;
    private d f;

    private c(Context context)
    {
        c = context;
        e = new LinkedList();
    }

    public static c a(Context context)
    {
        synchronized (d)
        {
            if (a == null)
            {
                a = new c(context.getApplicationContext());
                (new StringBuilder("create UploadManager ")).append(a);
            }
        }
        return a;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final int a(String s, int i, String s1, String s2, String s3, String s4, String s5)
    {
        synchronized (d)
        {
            e e1 = new e();
            e1.a = b;
            e1.f = f.a;
            e1.e = s2;
            e1.b = s;
            e1.c = i;
            e1.d = s1;
            e1.g = s3;
            e1.h = s4;
            e1.i = s5;
            e.add(e1);
            i = b;
            b = i + 1;
        }
        return i;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final List a()
    {
        LinkedList linkedlist;
        synchronized (d)
        {
            (new StringBuilder("upload size=")).append(e.size());
            linkedlist = new LinkedList();
            linkedlist.addAll(e);
        }
        return linkedlist;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        int j = 0;
_L2:
        if (j < e.size())
        {
            e e1 = (e)e.get(j);
            if (e1.a != i)
            {
                break MISSING_BLOCK_LABEL_190;
            }
            e1.f = f.a;
            Intent intent = new Intent(c, com/roidapp/cloudlib/upload/UploadPhotoService);
            intent.putExtra("service_name", e1.d);
            intent.putExtra("image_path", e1.b);
            intent.putExtra("message", e1.g);
            intent.putExtra("image_format", e1.e);
            intent.putExtra("current_index", e1.a);
            intent.putExtra("ga_mode", e1.i);
            c.startService(intent);
        }
        c.sendBroadcast(new Intent("com.roidapp.photogrid.UploadStatusChanged"));
        if (f != null)
        {
            f.a();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(int i, f f1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        int j = 0;
_L2:
        if (j < e.size())
        {
            e e1 = (e)e.get(j);
            if (e1.a == i)
            {
                e1.f = f1;
            }
            break MISSING_BLOCK_LABEL_81;
        }
        c.sendBroadcast(new Intent("com.roidapp.photogrid.UploadStatusChanged"));
        obj;
        JVM INSTR monitorexit ;
        return;
        f1;
        obj;
        JVM INSTR monitorexit ;
        throw f1;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(d d1)
    {
        f = d1;
    }

    public final void b()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        int i = 0;
_L3:
        if (i >= e.size())
        {
            break MISSING_BLOCK_LABEL_234;
        }
        if (((e)e.get(i)).f != f.d)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        e.remove(i);
        i--;
        break MISSING_BLOCK_LABEL_225;
_L1:
        e e1;
        Exception exception;
        Intent intent;
        for (; i >= e.size(); i = 0)
        {
            break MISSING_BLOCK_LABEL_201;
        }

        e1 = (e)e.get(i);
        e1.f = f.a;
        intent = new Intent(c, com/roidapp/cloudlib/upload/UploadPhotoService);
        intent.putExtra("current_index", e1.a);
        intent.putExtra("service_name", e1.d);
        intent.putExtra("image_path", e1.b);
        intent.putExtra("message", e1.g);
        intent.putExtra("image_format", e1.e);
        intent.putExtra("ga_mode", e1.i);
        c.startService(intent);
        i++;
          goto _L1
        c.sendBroadcast(new Intent("com.roidapp.photogrid.UploadStatusChanged"));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public final boolean b(int i)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        int j = 0;
_L2:
        if (j >= e.size())
        {
            break MISSING_BLOCK_LABEL_48;
        }
        if (((e)e.get(j)).a != i)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int c()
    {
        int i;
        synchronized (d)
        {
            i = e.size();
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c(int i)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        int j = 0;
_L2:
        if (j < e.size())
        {
            e e1 = (e)e.get(j);
            if (e1.a != i || e1.f == f.b)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            e.remove(j);
        }
        c.sendBroadcast(new Intent("com.roidapp.photogrid.UploadStatusChanged"));
        if (f != null)
        {
            f.a();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int d()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        int i;
        int j;
        j = 0;
        i = 0;
_L2:
        if (j < e.size())
        {
            if (((e)e.get(j)).f == f.d)
            {
                i++;
            }
            break MISSING_BLOCK_LABEL_64;
        }
        obj;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int e()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        int i;
        int j;
        j = 0;
        i = 0;
_L2:
        e e1;
        if (j >= e.size())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        e1 = (e)e.get(j);
        Exception exception;
        if (e1.f == f.d || e1.f == f.c)
        {
            i++;
        }
        break MISSING_BLOCK_LABEL_79;
        obj;
        JVM INSTR monitorexit ;
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean f()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        if (i >= e.size())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        e e1 = (e)e.get(i);
        if (e1.f != f.a && e1.f != f.b)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void g()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        if (i >= e.size())
        {
            break MISSING_BLOCK_LABEL_61;
        }
        if (((e)e.get(i)).f != f.d)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        e.remove(i);
        i--;
        break MISSING_BLOCK_LABEL_101;
        c.sendBroadcast(new Intent("com.roidapp.photogrid.UploadStatusChanged"));
        if (f != null)
        {
            f.a();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
