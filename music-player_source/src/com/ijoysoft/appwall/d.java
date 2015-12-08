// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.Log;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.ijoysoft.appwall:
//            e, f, o, GiftActivity, 
//            h, g

public final class d
{

    private HashMap a;
    private Handler b;
    private ArrayList c;
    private Thread d;
    private boolean e;

    public d()
    {
        a = new HashMap();
        b = new e(this);
        c = new ArrayList();
        e = true;
        d = new f(this);
        d.start();
    }

    static boolean a(d d1)
    {
        return d1.e;
    }

    static ArrayList b(d d1)
    {
        return d1.c;
    }

    static Handler c(d d1)
    {
        return d1.b;
    }

    static HashMap d(d d1)
    {
        return d1.a;
    }

    public final Bitmap a(o o1, g g)
    {
        a = new HashMap();
        if (a.containsKey(o1.e()))
        {
            Bitmap bitmap = (Bitmap)((SoftReference)a.get(o1.e())).get();
            Log.i("changle-icon", o1.e());
            if (bitmap != null)
            {
                Log.i("changle~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~", "\u7F13\u5B58\u4E2D\u53D6");
                return bitmap;
            }
            Log.i("changle~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~", "\u7F13\u5B58\u4E2D\u6CA1BM");
            a.remove(o1.e());
        }
        String s = (new StringBuilder(String.valueOf(GiftActivity.c))).append(o1.a()).append(".png").toString();
        Bitmap bitmap1 = BitmapFactory.decodeFile(s);
        if (bitmap1 != null)
        {
            Log.i("changle~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~", "\u83B7\u53D6");
            return bitmap1;
        }
        h h1 = new h(this);
        h.a(h1, o1.e());
        h.b(h1, o1.a());
        h.c(h1, s);
        h.a(h1, g);
        if (!c.contains(h1))
        {
            c.add(h1);
            synchronized (d)
            {
                d.notify();
            }
        }
        Log.i("changle~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~", "\u56DE\u8C03");
        return bitmap1;
    }
}
