// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.app.Activity;
import android.app.ProgressDialog;
import com.kik.g.p;
import com.kik.g.r;
import com.kik.g.s;

// Referenced classes of package kik.android.f.a:
//            x, y, f

final class w extends r
{

    final p a;
    final Activity b;
    final p c;
    final f d;

    w(f f1, p p1, Activity activity, p p2)
    {
        d = f1;
        a = p1;
        b = activity;
        c = p2;
        super();
    }

    public final void a(Object obj)
    {
        if (!a.g())
        {
            obj = new ProgressDialog(b);
            ((ProgressDialog) (obj)).setTitle(b.getString(0x7f090148));
            b.runOnUiThread(new x(this, ((ProgressDialog) (obj))));
            a.a(new y(this, ((ProgressDialog) (obj))));
            s.a(a, 15000L);
        }
    }

    public final void b()
    {
        if (!c.g())
        {
            c.e();
        }
    }

    public final void b(Throwable throwable)
    {
        if (!c.g())
        {
            c.a(new Exception((new StringBuilder("Pick user failed: ")).append(throwable.getMessage()).toString()));
            f.a(b);
        }
    }
}
