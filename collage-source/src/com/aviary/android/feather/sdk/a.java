// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.aviary.android.feather.cds.h;
import com.aviary.android.feather.library.c.c;
import com.aviary.android.feather.library.c.e;
import java.util.List;

// Referenced classes of package com.aviary.android.feather.sdk:
//            FeatherActivity

class com.aviary.android.feather.sdk.a extends com.aviary.android.feather.common.utils.os.a
{
    public static interface a
        extends com.aviary.android.feather.sdk.async_tasks.a
    {

        public abstract void a(List list, List list1, boolean flag);
    }

    static class b
    {

        public List a;
        public List b;
        public boolean c;

        b()
        {
        }
    }


    private a a;
    private Uri b;
    private String c;
    private e d;
    private int e;
    private final List f;
    private final boolean g;

    public com.aviary.android.feather.sdk.a(Uri uri, int i, boolean flag, List list)
    {
        b = uri;
        e = i;
        g = flag;
        f = list;
    }

    protected transient Bitmap a(FeatherActivity afeatheractivity[])
    {
        Log.i("FeatherDownloadImageAsyncTask", (new StringBuilder()).append("doInBackground: current thread #").append(Thread.currentThread().getId()).toString());
        afeatheractivity = afeatheractivity[0];
        if (g)
        {
            Pair pair = afeatheractivity.a(f);
            List list = h.d(afeatheractivity);
            b b1 = new b();
            b1.a = (List)pair.first;
            b1.b = (List)pair.second;
            int i;
            int j;
            boolean flag;
            if (list != null && list.contains(com.aviary.android.feather.cds.c.b.name()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b1.c = flag;
            publishProgress(new b[] {
                b1
            });
        } else
        {
            Log.d("FeatherDownloadImageAsyncTask", "skip tool load");
        }
        i = -1;
        if (e > 0)
        {
            i = e;
        }
        j = i;
        if (i <= 0)
        {
            j = com.aviary.android.feather.sdk.async_tasks.a.a(afeatheractivity);
        }
        try
        {
            afeatheractivity = com.aviary.android.feather.library.c.c.a(afeatheractivity, b, j, j, d);
        }
        // Misplaced declaration of an exception variable
        catch (FeatherActivity afeatheractivity[])
        {
            Log.e("FeatherDownloadImageAsyncTask", "decode error", afeatheractivity);
            c = afeatheractivity.getMessage();
            return null;
        }
        return afeatheractivity;
    }

    protected void a()
    {
        Log.i("FeatherDownloadImageAsyncTask", (new StringBuilder()).append("PreExecute: current thread #").append(Thread.currentThread().getId()).toString());
        if (a != null)
        {
            a.z();
        }
        d = new e();
    }

    protected void a(Bitmap bitmap)
    {
        Log.i("FeatherDownloadImageAsyncTask", (new StringBuilder()).append("PostExecute: current thread #").append(Thread.currentThread().getId()).toString());
        if (a != null)
        {
            if (bitmap != null)
            {
                a.a(bitmap, d);
            } else
            {
                a.a(c);
            }
        }
        a = null;
        b = null;
        c = null;
    }

    public void a(a a1)
    {
        a = a1;
    }

    protected volatile void a(Object obj)
    {
        a((Bitmap)obj);
    }

    protected transient void a(b ab[])
    {
        if (ab != null && ab.length > 0 && a != null)
        {
            a.a(ab[0].a, ab[0].b, ab[0].c);
        }
    }

    protected volatile void a(Object aobj[])
    {
        a((b[])aobj);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((FeatherActivity[])aobj);
    }
}
