// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.widget.Toast;
import com.kik.g.r;
import kik.a.d.aa;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.util.cy;

// Referenced classes of package kik.android.widget.preferences:
//            KikEmailPreference

final class q extends r
{

    final KikEmailPreference a;
    final String b;
    final KikEmailPreference c;

    q(KikEmailPreference kikemailpreference, KikEmailPreference kikemailpreference1, String s)
    {
        c = kikemailpreference;
        a = kikemailpreference1;
        b = s;
        super();
    }

    public final void a()
    {
        a.setEnabled(true);
        KikEmailPreference.a(c);
    }

    public final void a(Object obj)
    {
        obj = (aa)obj;
        a.setText(((aa) (obj)).a);
        Toast.makeText(c.getContext(), c.b().getString(0x7f0900d1), 0).show();
    }

    public final void a(Throwable throwable)
    {
        kik.a.f.q q1 = null;
        if (throwable instanceof kik.a.f.q)
        {
            q1 = (kik.a.f.q)throwable;
        }
        if (q1 != null && q1.a() == 201)
        {
            throwable = c.b().getString(0x7f0900d0, new Object[] {
                b
            });
        } else
        {
            throwable = c.b().getString(0x7f0900db, new Object[] {
                cy.a(throwable)
            });
        }
        Toast.makeText(c.getContext(), throwable, 0).show();
    }
}
