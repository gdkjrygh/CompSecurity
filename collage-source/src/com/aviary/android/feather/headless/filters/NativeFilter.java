// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.filters;

import android.graphics.Bitmap;
import com.aviary.android.feather.headless.moa.MoaResult;
import com.aviary.android.feather.headless.moa.b;
import com.aviary.android.feather.headless.moa.c;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.headless.moa.k;
import org.json.JSONException;

// Referenced classes of package com.aviary.android.feather.headless.filters:
//            INativeFilter, NativeFilterProxy

public class NativeFilter
    implements INativeFilter
{

    public static final int a = (int)System.currentTimeMillis();
    protected d b;
    protected MoaResult c;

    NativeFilter(String s)
    {
        b = com.aviary.android.feather.headless.moa.c.a();
        b.a(com.aviary.android.feather.headless.moa.c.a(s));
    }

    public transient NativeFilter(String as[])
    {
        b = com.aviary.android.feather.headless.moa.c.a(as);
    }

    public MoaResult a(Bitmap bitmap, Bitmap bitmap1, int i, int j)
        throws JSONException
    {
        return NativeFilterProxy.a(b, bitmap, bitmap1, i, j);
    }

    public d a()
    {
        return b;
    }

    public void a(int i)
    {
        b.a(0).a("seed", i);
    }

    public void a(int i, int j)
    {
        b.a(0).a("previewsize", new k(i, j));
    }

    public Bitmap b(Bitmap bitmap, Bitmap bitmap1, int i, int j)
        throws JSONException
    {
        c = NativeFilterProxy.a(b, bitmap, bitmap1, i, j);
        c.execute();
        bitmap = c.outputBitmap;
        c = null;
        return bitmap;
    }

    public boolean c()
    {
        boolean flag = false;
        if (c != null)
        {
            c.active = 0;
            flag = true;
        }
        return flag;
    }

}
