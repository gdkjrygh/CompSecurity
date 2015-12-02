// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.debug.log.b;
import java.io.FileDescriptor;
import java.util.WeakHashMap;

// Referenced classes of package com.facebook.orca.camera:
//            d, c

public class a
{

    private static final Class a = com/facebook/orca/camera/a;
    private static a c = null;
    private final WeakHashMap b = new WeakHashMap();

    private a()
    {
    }

    public static a a()
    {
        com/facebook/orca/camera/a;
        JVM INSTR monitorenter ;
        a a1;
        if (c == null)
        {
            c = new a();
        }
        a1 = c;
        com/facebook/orca/camera/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(Thread thread, android.graphics.BitmapFactory.Options options)
    {
        this;
        JVM INSTR monitorenter ;
        c(thread).b = options;
        this;
        JVM INSTR monitorexit ;
        return;
        thread;
        throw thread;
    }

    private d c(Thread thread)
    {
        this;
        JVM INSTR monitorenter ;
        d d2 = (d)b.get(thread);
        d d1;
        d1 = d2;
        if (d2 != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        d1 = new d(null);
        b.put(thread, d1);
        this;
        JVM INSTR monitorexit ;
        return d1;
        thread;
        throw thread;
    }

    public Bitmap a(FileDescriptor filedescriptor, android.graphics.BitmapFactory.Options options)
    {
        if (options.mCancel)
        {
            return null;
        }
        Thread thread = Thread.currentThread();
        if (!b(thread))
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Thread ").append(thread).append(" is not allowed to decode.").toString());
            return null;
        } else
        {
            a(thread, options);
            filedescriptor = BitmapFactory.decodeFileDescriptor(filedescriptor, null, options);
            a(thread);
            return filedescriptor;
        }
    }

    void a(Thread thread)
    {
        this;
        JVM INSTR monitorenter ;
        ((d)b.get(thread)).b = null;
        this;
        JVM INSTR monitorexit ;
        return;
        thread;
        throw thread;
    }

    public boolean b(Thread thread)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        thread = (d)b.get(thread);
        if (thread != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        c c1;
        thread = ((d) (thread)).a;
        c1 = c.CANCEL;
        if (thread != c1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        thread;
        throw thread;
    }

}
