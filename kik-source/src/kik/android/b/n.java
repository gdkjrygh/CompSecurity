// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import com.kik.cards.util.UserDataParcelable;
import com.kik.cards.web.av;
import com.kik.g.p;
import com.kik.g.r;
import kik.a.d.aa;

// Referenced classes of package kik.android.b:
//            m, o

final class n extends r
{

    final p a;
    final String b;
    final m c;

    n(m m1, p p1, String s)
    {
        c = m1;
        a = p1;
        b = s;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Boolean)obj;
        if (obj != null && ((Boolean) (obj)).booleanValue())
        {
            obj = new UserDataParcelable(m.a(c).c, (new StringBuilder()).append(m.a(c).d).append(" ").append(m.a(c).e).toString(), m.a(c).f);
            a.a(obj);
            return;
        } else
        {
            m.a(System.currentTimeMillis());
            m.d(c).a().a(new o(this));
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        a.a(throwable);
    }
}
