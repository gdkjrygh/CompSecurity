// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public final class a
{

    final ArrayList a = new ArrayList();
    public int b;
    public boolean c;
    public byte d[];
    final CountDownLatch e = new CountDownLatch(1);
    long f;
    public long g;
    private WeakReference h;

    public a()
    {
        b = 0;
        g = -1L;
    }

    public final boolean a()
    {
        return b != 0 && b != 1;
    }

    public final boolean a(com.google.android.m4b.maps.ac.a a1)
    {
        int i = a1.d(3);
        String s = a1.g(7);
        if (i == 200 && s != null)
        {
            f = a1.e(4);
            s = s.toLowerCase();
            if (s.startsWith("image/"))
            {
                d = a1.c(6);
                b = 2;
            } else
            if (s.equals("application/binary"))
            {
                d = a1.c(6);
                b = 3;
            } else
            {
                if (ab.a("ResourceManager", 3))
                {
                    a1 = String.valueOf(s);
                    if (a1.length() != 0)
                    {
                        a1 = "Unhandled content-type: ".concat(a1);
                    } else
                    {
                        a1 = new String("Unhandled content-type: ");
                    }
                    Log.d("ResourceManager", a1);
                }
                b = 1;
            }
            return b != 1;
        }
        if (i != 304)
        {
            b = 1;
        }
        return false;
    }

    public final Bitmap b()
    {
        Object obj;
        Object obj1;
        if (h != null)
        {
            obj = (Bitmap)h.get();
        } else
        {
            obj = null;
        }
        if (obj != null || b != 2 || d == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (h == null) goto _L4; else goto _L3
_L3:
        obj = (Bitmap)h.get();
_L6:
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        obj1 = obj;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        obj = new android.graphics.BitmapFactory.Options();
        obj.inPurgeable = true;
        obj.inInputShareable = true;
        obj1 = BitmapFactory.decodeByteArray(d, 0, d.length, ((android.graphics.BitmapFactory.Options) (obj)));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        b = 1;
        d = null;
        h = new WeakReference(obj1);
        this;
        JVM INSTR monitorexit ;
        return ((Bitmap) (obj1));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        return ((Bitmap) (obj));
_L4:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
