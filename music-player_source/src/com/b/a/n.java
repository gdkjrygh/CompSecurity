// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import b.a.e;
import b.a.fg;
import b.a.g;
import b.a.hl;
import b.a.hp;
import b.a.hq;
import b.a.hw;
import b.a.ia;
import com.b.a.a.b;
import java.util.Map;

// Referenced classes of package com.b.a:
//            a, o, r, p, 
//            m

public final class n
    implements hw
{

    private final b a = new b();
    private Context b;
    private m c;
    private hp d;
    private e e;
    private ia f;
    private hq g;
    private hl h;
    private boolean i;

    n()
    {
        b = null;
        d = new hp();
        e = new e();
        f = new ia();
        i = false;
        d.a(this);
    }

    static void a(n n1, Context context)
    {
        ia ia1 = n1.f;
        ia.a(context);
        if (n1.c != null)
        {
            n1 = n1.c;
        }
    }

    static void b(n n1, Context context)
    {
        n1.d(context);
    }

    private void c(Context context)
    {
        if (!i)
        {
            b = context.getApplicationContext();
            g = new hq(b);
            h = hl.a(b);
            i = true;
        }
    }

    private void d(Context context)
    {
        ia ia1 = f;
        ia.b(context);
        e.a(context);
        if (c != null)
        {
            context = c;
        }
        h.b();
    }

    final void a(Context context)
    {
        if (context == null)
        {
            fg.b("MobclickAgent", "unexpected null context in onResume");
            return;
        }
        if (a.h)
        {
            e.a(context.getClass().getName());
        }
        try
        {
            if (!i)
            {
                c(context);
            }
            r.a(new o(this, context));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            fg.b("MobclickAgent", "Exception occurred in Mobclick.onResume(). ", context);
        }
    }

    final void a(Context context, String s, Map map)
    {
        try
        {
            if (!i)
            {
                c(context);
            }
            g.a(s, map);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            fg.b("MobclickAgent", "", context);
        }
    }

    public final void a(Throwable throwable)
    {
        try
        {
            e.a();
            if (b == null)
            {
                break MISSING_BLOCK_LABEL_69;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            fg.a("MobclickAgent", "Exception in onAppCrash", throwable);
            return;
        }
        if (throwable == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (h != null)
        {
            h.b(new g(throwable));
        }
        d(b);
        b.getSharedPreferences("umeng_general_config", 0).edit().commit();
        r.a();
        return;
    }

    final void b(Context context)
    {
        if (context == null)
        {
            fg.b("MobclickAgent", "unexpected null context in onPause");
            return;
        }
        if (a.h)
        {
            e.b(context.getClass().getName());
        }
        try
        {
            if (!i)
            {
                c(context);
            }
            r.a(new p(this, context));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            fg.b("MobclickAgent", "Exception occurred in Mobclick.onRause(). ", context);
        }
    }
}
