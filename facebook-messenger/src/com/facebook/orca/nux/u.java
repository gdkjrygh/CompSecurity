// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.content.Context;
import android.content.Intent;
import com.facebook.messages.threads.model.ThreadViewSpec;

// Referenced classes of package com.facebook.orca.nux:
//            h, ThreadTitleNuxView, SmsNuxDetailActivity, v, 
//            w

public class u
{

    private final Context a;
    private final h b;
    private ThreadTitleNuxView c;

    public u(Context context, h h1)
    {
        a = context;
        b = h1;
    }

    static void a(u u1)
    {
        u1.c();
    }

    static void b(u u1)
    {
        u1.d();
    }

    private void c()
    {
        b.p();
        c.i();
        Intent intent = new Intent(a, com/facebook/orca/nux/SmsNuxDetailActivity);
        a.startActivity(intent);
    }

    private void d()
    {
        b.p();
        c.i();
    }

    public void a()
    {
        c.f();
        c.setOnMoreClickListener(new v(this));
        c.setOnOkayClickListener(new w(this));
    }

    public void a(ThreadViewSpec threadviewspec, ThreadTitleNuxView threadtitlenuxview)
    {
        c = threadtitlenuxview;
        if (threadviewspec.a() && b.a(threadviewspec.d()))
        {
            a();
        }
    }

    public void b()
    {
        if (c != null && c.isShown())
        {
            c.g();
        }
    }
}
