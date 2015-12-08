// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.m4b.maps.ai.c;
import com.google.android.m4b.maps.ay.b;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.j.x;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bt, bg, am

public final class bj
{

    public final Context a;
    public final Resources b;
    final String c;
    public final bt d;
    public final bg e;
    public final b f;
    final Executor g;
    final am h;
    public final e i;
    final c j;

    public bj(Context context, Resources resources, String s, bt bt1, bg bg1, b b1, Executor executor, 
            am am1, e e1, c c1)
    {
        a = (Context)x.a(context, "processContext");
        x.a(context.equals(context.getApplicationContext()), "The provided context is not an application context");
        b = (Resources)x.a(resources, "gmsCoreResources");
        c = (String)x.a(s, "clientPackageName");
        d = (bt)x.a(bt1, "connectionManager");
        e = (bg)x.a(bg1, "versionManager");
        f = (b)x.a(b1, "threadChecker");
        g = (Executor)x.a(executor, "mainExecutor");
        h = (am)x.a(am1, "quotaEventReporter");
        i = (e)x.a(e1, "serverParametersManager");
        j = (c)x.a(c1, "authorizer");
    }
}
