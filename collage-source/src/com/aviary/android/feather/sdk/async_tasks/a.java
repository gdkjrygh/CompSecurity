// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.async_tasks;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.Log;
import com.aviary.android.feather.common.utils.l;
import com.aviary.android.feather.library.c.c;
import com.aviary.android.feather.library.c.e;

public class com.aviary.android.feather.sdk.async_tasks.a extends com.aviary.android.feather.common.utils.os.a
{
    public static interface a
    {

        public abstract void a(Bitmap bitmap, e e1);

        public abstract void a(String s);

        public abstract void z();
    }


    private a a;
    private Uri b;
    private String c;
    private e d;
    private int e;

    public static int a(Context context)
    {
        context = context.getResources().getDisplayMetrics();
        int i = Math.max(((DisplayMetrics) (context)).widthPixels, ((DisplayMetrics) (context)).heightPixels);
        double d1 = l.f();
        if (d1 >= 48D)
        {
            return Math.min(i, 1280);
        }
        if (d1 >= 32D)
        {
            return Math.min(i, 900);
        } else
        {
            return Math.min(i, 700);
        }
    }

    protected transient Bitmap a(Context acontext[])
    {
        Log.i("DownloadImageAsyncTask", (new StringBuilder()).append("doInBackground: current thread #").append(Thread.currentThread().getId()).toString());
        acontext = acontext[0];
        int i = -1;
        if (e > 0)
        {
            i = e;
        }
        int j = i;
        if (i <= 0)
        {
            j = a(((Context) (acontext)));
        }
        try
        {
            acontext = com.aviary.android.feather.library.c.c.a(acontext, b, j, j, d);
        }
        // Misplaced declaration of an exception variable
        catch (Context acontext[])
        {
            Log.e("DownloadImageAsyncTask", "decode error", acontext);
            c = acontext.getMessage();
            return null;
        }
        return acontext;
    }

    protected void a()
    {
        Log.i("DownloadImageAsyncTask", (new StringBuilder()).append("PreExecute: current thread #").append(Thread.currentThread().getId()).toString());
        if (a != null)
        {
            a.z();
        }
    }

    protected void a(Bitmap bitmap)
    {
        Log.i("DownloadImageAsyncTask", (new StringBuilder()).append("PostExecute: current thread #").append(Thread.currentThread().getId()).toString());
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

    protected volatile void a(Object obj)
    {
        a((Bitmap)obj);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Context[])aobj);
    }
}
