// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.google.android.apps.photos.stories.StoryLayout;
import java.util.List;

final class inp
    implements ca
{

    private inl a;

    inp(inl inl1)
    {
        a = inl1;
        super();
    }

    public final ei a(int i, Bundle bundle)
    {
        return new isz(a.O_(), (iul)inl.c(a).a(iul), inl.d(a).d(), inl.e(a), ((am) (a)).q.getString("auth_key"), ((am) (a)).q.getString("gpinv"), true, false, ite.a(inl.f(a)), inl.g(a), a);
    }

    public final void a(ei ei1, Object obj)
    {
        boolean flag1;
        Object obj1 = null;
        flag1 = true;
        obj = (iug)obj;
        if (((iug) (obj)).a == null)
        {
            break MISSING_BLOCK_LABEL_540;
        }
        ei1 = obj1;
        if (inl.h(a) != null)
        {
            ei1 = (irm)inl.h(a).onSaveInstanceState();
        }
        if (!inl.a(a, ((iug) (obj)).a.b.b) || inl.g(a) != null)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        ei1 = (iof)inl.i(a).b(iof);
        if (ei1 == null) goto _L2; else goto _L1
_L1:
        obj = inl.e(a).a;
        if (((iof) (ei1)).b.contains(obj)) goto _L2; else goto _L3
_L3:
        obj = inl.e(a).a;
        ((iof) (ei1)).b.add(obj);
        ((iof) (ei1)).c.add(obj);
        ((iof) (ei1)).a.b();
        if (!Log.isLoggable("HostedStoryFragment", 4));
_L5:
        return;
_L2:
        a.a(a.a(q.bc));
        if (!Log.isLoggable("HostedStoryFragment", 4)) goto _L5; else goto _L4
_L4:
        Log.w("HostedStoryFragment", "Displaying owned story, but missing MediaCollection!");
        return;
        boolean flag;
        inl.a(a, ((iug) (obj)).a);
        inl.j(a).a(((iug) (obj)));
        boolean flag2;
        if (ei1 != null)
        {
            if (((irm) (ei1)).b != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                inl.h(a).onRestoreInstanceState(ei1);
            }
        }
        if (((irm) (ei1)).a && !inl.j(a).b())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        a.a(true, flag2);
        ((am) (a)).R.findViewById(0x1020004).setVisibility(8);
        if (!inl.k(a) && !inl.l(a) && !inl.m(a))
        {
            a.a(true);
        }
        if (inl.n(a) && inl.o(a) != null)
        {
            inl.a(a, inl.o(a));
            inl.a(a, false);
        }
        if (inl.s(a).f == null || inl.s(a).f.c == null || !inl.s(a).f.c.booleanValue()) goto _L7; else goto _L6
_L6:
        flag = flag1;
_L11:
        if (flag)
        {
            inl.p(a);
        }
_L12:
        if (((iug) (obj)).b != null)
        {
            inl.a(a, ((iug) (obj)).b);
        }
        inl.r(a).a();
        return;
_L7:
        if (inl.t(a)) goto _L9; else goto _L8
_L8:
        flag = flag1;
        if (!((iug) (obj)).d) goto _L11; else goto _L10
_L10:
        flag = flag1;
        if (System.currentTimeMillis() - ((iug) (obj)).c > 0x36ee80L) goto _L11; else goto _L9
_L9:
        flag = false;
          goto _L11
        if (((iug) (obj)).e == 2)
        {
            inl.a(a, 1);
            if (ite.a(inl.f(a)).length > 0)
            {
                ei1.e();
            }
        } else
        {
            inl.a(a, 2);
            if (inl.n(a) && inl.o(a) != null)
            {
                inl.b(a, null);
                inl.a(a, false);
                inl.q(a);
            }
            a.a(a.a(q.bc));
        }
          goto _L12
    }
}
