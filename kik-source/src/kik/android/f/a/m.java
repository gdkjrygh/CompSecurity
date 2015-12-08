// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.support.v4.app.Fragment;
import com.kik.cards.util.UserDataParcelable;
import com.kik.g.p;
import com.kik.g.r;
import kik.a.d.a.a;
import kik.a.d.k;
import kik.android.chat.activity.FragmentWrapperActivity;
import kik.android.chat.fragment.KikFragmentBase;

// Referenced classes of package kik.android.f.a:
//            l, f, n

final class m extends r
{

    final a a;
    final l b;

    m(l l1, a a1)
    {
        b = l1;
        a = a1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (String)obj;
        Object obj1 = b.b.a(((String) (obj)), true);
        obj1 = new UserDataParcelable(((k) (obj1)).e(), ((k) (obj1)).c(), ((k) (obj1)).r());
        b.g.a(a, false, null);
        android.support.v4.app.FragmentActivity fragmentactivity = b.c.getActivity();
        if (fragmentactivity != null && (fragmentactivity instanceof FragmentWrapperActivity) && (b.c instanceof KikFragmentBase) && ((FragmentWrapperActivity)fragmentactivity).e())
        {
            ((KikFragmentBase)b.c).a(new n(this, ((String) (obj)), fragmentactivity));
        } else
        {
            kik.android.f.a.f.a(((String) (obj)), fragmentactivity, b.d, b.e, b.b);
        }
        b.f.a(obj1);
    }
}
