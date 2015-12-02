// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import android.app.ProgressDialog;
import android.content.Context;
import com.google.common.d.a.i;
import com.google.common.d.a.u;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.common.executors:
//            e

public class d
{

    private final Context a;
    private final u b;
    private final Executor c;

    public d(Context context, u u1, Executor executor)
    {
        a = context;
        b = u1;
        c = executor;
    }

    public void a(int j, int k, Runnable runnable)
    {
        a(a.getString(j), a.getString(k), runnable);
    }

    public void a(String s, String s1, Runnable runnable)
    {
        s = ProgressDialog.show(a, s, s1, true);
        i.a(b.b(runnable), new e(this, s), c);
    }
}
