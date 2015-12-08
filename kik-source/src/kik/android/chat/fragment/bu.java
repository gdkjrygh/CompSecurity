// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.widget.EditText;
import com.kik.android.a;
import com.kik.g.r;
import kik.a.d.n;
import kik.a.f.q;
import kik.android.util.cq;

// Referenced classes of package kik.android.chat.fragment:
//            KikChangeGroupNameFragment

final class bu extends r
{

    final KikChangeGroupNameFragment a;

    bu(KikChangeGroupNameFragment kikchangegroupnamefragment)
    {
        a = kikchangegroupnamefragment;
        super();
    }

    public final void a(Object obj)
    {
        int j = 0;
        obj = a._groupNameField.getText().toString().trim();
        String s = KikChangeGroupNameFragment.b(a).c();
        String as[] = ((String) (obj)).trim().split("\\s+");
        int l = as.length;
        for (int i = 0; i < l;)
        {
            int k = j;
            if (!cq.c(as[i]))
            {
                k = j + 1;
            }
            i++;
            j = k;
        }

        a.a.b("Group Name Changed").a("Is Empty", cq.c(((String) (obj)))).a("Was Empty", cq.c(s)).a("Length", ((String) (obj)).length()).a("Word Count", j).b();
        a.J();
    }

    public final void a(Throwable throwable)
    {
        if (throwable instanceof q)
        {
            throwable = (q)throwable;
            if (throwable.a() == 4000 && a._groupNameField != null)
            {
                a.Q = KikChangeGroupNameFragment.b(0x7f090122);
                a.a.b("Group Name Change Error").a("Reason", "Invalid Name").b();
            } else
            {
                if (throwable.a() == 4001 && a._groupNameField != null)
                {
                    a.Q = KikChangeGroupNameFragment.b(0x7f09017c);
                    return;
                }
                if (throwable.a() == 403 && a._groupNameField != null)
                {
                    a.P = KikChangeGroupNameFragment.b(0x7f0902c8);
                    a.Q = KikChangeGroupNameFragment.b(0x7f090121);
                    a.a.b("Group Name Change Error").a("Reason", "Invalid Name").b();
                    return;
                }
                if (throwable.a() == 405 && a._groupNameField != null)
                {
                    a.Q = a.getResources().getString(0x7f090181);
                    return;
                }
                if (a._groupNameField != null)
                {
                    a.Q = KikChangeGroupNameFragment.b(0x7f090383);
                    a.a.b("Group Name Change Error").a("Reason", "Network").b();
                    return;
                }
            }
        }
    }
}
