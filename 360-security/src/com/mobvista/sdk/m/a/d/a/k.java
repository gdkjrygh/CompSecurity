// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.d.a;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.mobvista.sdk.m.a.b.a.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.mobvista.sdk.m.a.d.a:
//            c, a, m

public class k
{

    private static k b;
    private static com.mobvista.sdk.m.a.d.a.a c;
    private static Lock d;
    private Context a;

    private k(Context context)
    {
        a = context;
    }

    public static k a(Context context)
    {
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        d = new ReentrantLock();
        d.lock();
        if (b == null)
        {
            b = new k(context.getApplicationContext());
        }
        d.unlock();
        if (c == null)
        {
            context = new c();
            context.a(0.1F);
            c = com.mobvista.sdk.m.a.d.a.a.a(context);
        }
        return b;
        context;
        d.unlock();
        throw context;
    }

    public static void a()
    {
        if (c != null)
        {
            c.a();
        }
        d = null;
        b = null;
        c = null;
    }

    private static void a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        inputstream.close();
        return;
        inputstream;
        com.mobvista.sdk.m.a.b.a.a.a("LoadResource", "", inputstream);
        return;
    }

    private static InputStream b(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        if ("".equalsIgnoreCase(s))
        {
            return null;
        }
        s = com/mobvista/sdk/m/a/d/a/k.getResourceAsStream((new StringBuilder("/com/mobvista/sdk/m/res/")).append(s).toString());
        return s;
        s;
        com.mobvista.sdk.m.a.b.a.a.a("LoadResource", "IOException", s);
        return null;
    }

    public final Drawable a(String s)
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = c.a(s);
        if (obj != null)
        {
            return ((Drawable) (obj)).getConstantState().newDrawable();
        }
        InputStream inputstream = b(s);
        if (inputstream == null) goto _L4; else goto _L3
_L3:
        if (!s.contains(".9")) goto _L6; else goto _L5
_L5:
        Drawable drawable = com.mobvista.sdk.m.a.d.a.m.a(a, inputstream);
        obj = drawable;
_L4:
        a(inputstream);
_L7:
        c.a(s, ((Drawable) (obj)));
        return ((Drawable) (obj));
_L6:
        drawable = BitmapDrawable.createFromStream(inputstream, null);
        obj = drawable;
          goto _L4
        Exception exception;
        exception;
_L12:
        com.mobvista.sdk.m.a.b.a.a.a("LoadResource", "Exception", exception);
          goto _L7
_L2:
        obj = b(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        if (!s.contains(".9")) goto _L9; else goto _L8
_L8:
        s = com.mobvista.sdk.m.a.d.a.m.a(a, ((InputStream) (obj)));
_L10:
        a(((InputStream) (obj)));
        return s;
        obj;
_L11:
        com.mobvista.sdk.m.a.b.a.a.a("LoadResource", "Exception", ((Throwable) (obj)));
        return s;
_L9:
        s = BitmapDrawable.createFromStream(((InputStream) (obj)), null);
          goto _L10
        obj;
        s = null;
          goto _L11
        exception;
          goto _L12
        s = null;
          goto _L10
    }
}
