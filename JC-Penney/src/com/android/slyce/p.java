// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce;

import android.graphics.Bitmap;
import android.os.Handler;
import com.android.slyce.e.a;
import com.android.slyce.i.d;
import com.android.slyce.k.b;
import com.android.slyce.k.h;
import com.moodstocks.android.Result;
import java.lang.ref.WeakReference;

// Referenced classes of package com.android.slyce:
//            k, q

class p
    implements d
{

    private final String a = com/android/slyce/p.getSimpleName();
    private WeakReference b;

    public p(k k1)
    {
        b = new WeakReference(k1);
    }

    public void a(Bitmap bitmap)
    {
        h.a(a, "2D onSnap");
        k k1 = (k)b.get();
        if (k1 != null)
        {
            com.android.slyce.k.a(k1, bitmap);
        }
    }

    public void a(Result result)
    {
        h.a(a, "onResult");
        String s = result.getValue();
        int i = result.getType();
        result = (k)b.get();
        if (result == null)
        {
            return;
        }
        if (!b(result) && k.c(result))
        {
            (new Handler()).postDelayed(new q(this, result), 2000L);
        }
        if (i == 0x80000000)
        {
            com.android.slyce.k.a(result, s);
            return;
        } else
        {
            com.android.slyce.k.a(result, String.valueOf(i), s, b.a);
            return;
        }
    }

    public void a(Exception exception)
    {
        h.a(a, "onCameraOpenFailed");
    }

    public void a(String s)
    {
        h.a(a, (new StringBuilder()).append("2D onWarning: ").append(s).toString());
    }

    public void a(boolean flag)
    {
        k k1 = (k)b.get();
        if (k1 != null)
        {
            k.e(k1).a(flag);
        }
    }
}
