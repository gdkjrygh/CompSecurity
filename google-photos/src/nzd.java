// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Field;

public final class nzd
{

    private static final jz a = new jz();

    static long a(qlw qlw)
    {
        pai pai1 = (pai)b(qlw).get(qlw);
        if (pai1 == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        long l = pai1.b.a.longValue();
        return l;
        return 0L;
        Object obj;
        obj;
_L2:
        qlw = String.valueOf(qlw);
        Log.e("PlusiUtils", (new StringBuilder(String.valueOf(qlw).length() + 37)).append("No API header found in the response:\n").append(qlw).toString(), ((Throwable) (obj)));
        return 0L;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static nyp a(Context context, int i)
    {
        return new nyp(context, new nyg(context, i), "plusi", "oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
    }

    public static nyv a(Context context, nyg nyg1)
    {
        return new nyv(context, nyg1, "plusi", "oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
    }

    static void a(Context context, qlw qlw)
    {
        mva mva1 = (mva)olm.b(context, mva);
        if (mva1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        context = (pai)b(qlw).get(qlw);
        if (context == null)
        {
            break; /* Loop/switch isn't completed */
        }
        context = ((pai) (context)).a;
_L4:
        if (context != null)
        {
            mva1.a(context);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        context = null;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
        context;
_L7:
        qlw = String.valueOf(qlw);
        Log.e("PlusiUtils", (new StringBuilder(String.valueOf(qlw).length() + 37)).append("No API header found in the response:\n").append(qlw).toString(), context);
        return;
        context;
        continue; /* Loop/switch isn't completed */
        context;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static void a(Context context, qlw qlw, String s, boolean flag, int i)
    {
        a(context, qlw, s, false, i, null);
    }

    public static void a(Context context, qlw qlw, String s, boolean flag, int i, qqb qqb1)
    {
        Object obj = null;
        qyi qyi1 = new qyi();
        Object obj1 = new qym();
        obj1.a = Integer.valueOf(b.s(context));
        obj1.b = Integer.valueOf(b.t(context));
        obj1.c = Integer.valueOf(b.u(context));
        qyi1.b = Integer.valueOf(b.r(context));
        qyi1.e = ((qym) (obj1));
        qyi1.a = s;
        if (qqb1 != null)
        {
            qyi1.f = new qpx();
            qyi1.f.a(qqb.a, qqb1);
        }
        s = (nyf)olm.b(context, nyf);
        if (s != null)
        {
            s = s.f();
        } else
        {
            s = null;
        }
        if (!TextUtils.isEmpty(s))
        {
            qyi1.c = s;
        }
        s = new qpw();
        if (flag)
        {
            s.b = 100;
        } else
        {
            s.b = b.g(context);
        }
        if (b.y(context))
        {
            s.a = 3;
        } else
        {
            s.a = 2;
        }
        s.c = 2;
        s.d = i;
        qyi1.d = s;
        try
        {
            qqb1 = b(qlw);
            obj1 = new pah();
            obj1.a = qyi1;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("PlusiUtils", "Failed to find apiHeader field on an http request, this should not happen", context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("PlusiUtils", "apiHeader field on http request was not accessible, this should not happen", context);
            return;
        }
        s = obj;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        context = (mva)olm.b(context, mva);
        s = obj;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        s = context.a();
        obj1.b = s;
        qqb1.set(qlw, obj1);
        return;
    }

    private static Field b(qlw qlw)
    {
        Class class1 = qlw.getClass();
        jz jz1 = a;
        jz1;
        JVM INSTR monitorenter ;
        Field field = (Field)a.get(class1);
        qlw = field;
        if (field != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        qlw = class1.getField("apiHeader");
        a.put(class1, qlw);
        jz1;
        JVM INSTR monitorexit ;
        return qlw;
        qlw;
        jz1;
        JVM INSTR monitorexit ;
        throw qlw;
    }

}
