// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class jgf
{

    private static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Float[] {
        Float.valueOf(120F), Float.valueOf(240F)
    })));
    public jge a;
    public int b;
    public jgg c;
    private final noz e;
    private float f;

    public jgf(Context context)
    {
        f = 1.0F;
        c = new jgg();
        e = noz.a(context, 2, "SlomoManager", new String[0]);
    }

    public final void a(int i)
    {
        b = i;
        jgg jgg1 = c;
        i = b;
        jge jge1 = a;
        if (i == 0 || jge1 == null)
        {
            return;
        } else
        {
            jgg1.c = (int)((float)i * jge1.a);
            jgg1.d = (int)((float)i * jge1.b);
            return;
        }
    }

    public final void a(jge jge1)
    {
        a = jge1;
        jgg jgg1 = c;
        int i = b;
        if (i == 0 || jge1 == null)
        {
            return;
        } else
        {
            jgg1.c = (int)((float)i * jge1.a);
            jgg1.d = (int)((float)i * jge1.b);
            return;
        }
    }

    public final void a(jgi jgi1)
    {
        if (e.a())
        {
            Object obj;
            if (jgi1 == null)
            {
                obj = "null";
            } else
            {
                obj = Float.valueOf(jgi1.r());
            }
            noy.a("capture", obj);
            if (jgi1 == null)
            {
                obj = "null";
            } else
            {
                obj = Float.valueOf(jgi1.s());
            }
            noy.a("encoded", obj);
        }
        if (jgi1 == null || !d.contains(Float.valueOf(jgi1.r())) || jgi1.s() <= 0.0F)
        {
            f = 1.0F;
        } else
        {
            f = Math.max(jgi1.r() / jgi1.s(), 1.0F);
        }
        c.b = Math.max(f, 1.0F);
    }

    public final boolean a()
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 23 && f != 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (e.a())
        {
            (new StringBuilder(18)).append("isEnabled(): ").append(flag);
        }
        return flag;
    }

}
