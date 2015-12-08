// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.a.k;
import com.google.a.s;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.d.a;
import java.io.File;

// Referenced classes of package com.roidapp.cloudlib.sns.b:
//            c, t, r, p, 
//            s, x

public class q
{

    private static q a;
    private Context b;
    private p c;

    private q(Context context)
    {
        b = context.getApplicationContext();
        context = b.getFileStreamPath("sns_profile");
        if (context.exists())
        {
            context = com.roidapp.baselib.d.a.a(context, "UTF-8");
            s s1 = new s();
            s1.a(com/roidapp/cloudlib/sns/b/c, new t((byte)0));
            context = (p)s1.a().a(context, (new r(this)).b());
        } else
        {
            context = null;
        }
        c = context;
    }

    public static q a(Context context)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/roidapp/cloudlib/sns/b/q;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new q(context);
        }
        com/roidapp/cloudlib/sns/b/q;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/roidapp/cloudlib/sns/b/q;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        com.roidapp.baselib.d.a.a(b.getFileStreamPath("sns_profile"));
        PreferenceManager.getDefaultSharedPreferences(aj.a()).edit().remove("QPicFailed").apply();
        PreferenceManager.getDefaultSharedPreferences(aj.a()).edit().remove("QPicCode").apply();
        if (c != null)
        {
            com.roidapp.cloudlib.push.a.b(aj.a(), c.a);
        }
        c = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(p p1)
    {
        this;
        JVM INSTR monitorenter ;
        File file = b.getFileStreamPath("sns_profile");
        s s1 = new s();
        s1.a(com/roidapp/cloudlib/sns/b/c, new t((byte)0));
        com.roidapp.baselib.d.a.a(s1.a().a(p1, (new com.roidapp.cloudlib.sns.b.s(this)).b()), file, "UTF-8");
        if (c == null || !TextUtils.equals(c.a, p1.a))
        {
            com.roidapp.cloudlib.push.a.a(aj.a(), p1.a);
        }
        c = p1;
        this;
        JVM INSTR monitorexit ;
        return;
        p1;
        throw p1;
    }

    public final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        if (c == null || c.b == null) goto _L2; else goto _L1
_L1:
        long l;
        long l1;
        long l2;
        l = System.currentTimeMillis() / 1000L;
        l1 = c.c;
        l2 = c.b.o;
        if (l <= l1 + l2) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final p c()
    {
        this;
        JVM INSTR monitorenter ;
        p p1 = c;
        this;
        JVM INSTR monitorexit ;
        return p1;
        Exception exception;
        exception;
        throw exception;
    }
}
