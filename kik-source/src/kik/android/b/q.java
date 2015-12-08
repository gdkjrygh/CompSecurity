// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import android.os.Bundle;
import com.kik.cards.util.UserDataParcelable;
import com.kik.g.p;
import com.kik.g.r;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package kik.android.b:
//            m

final class q extends r
{

    final List a;
    final p b;
    final m c;

    q(m m, List list, p p1)
    {
        c = m;
        a = list;
        b = p1;
        super();
    }

    public final void a(Object obj)
    {
        Bundle bundle = (Bundle)obj;
        obj = new ArrayList();
        android.os.Parcelable aparcelable[] = bundle.getParcelableArray("KikPickUsersFragment.RESULT_SELECTED_USERS");
        if (aparcelable != null)
        {
            int j = aparcelable.length;
            for (int i = 0; i < j; i++)
            {
                UserDataParcelable userdataparcelable = (UserDataParcelable)aparcelable[i];
                if (a.contains(userdataparcelable.a))
                {
                    userdataparcelable.a();
                }
                ((List) (obj)).add(userdataparcelable);
            }

            b.a(obj);
            return;
        } else
        {
            b.e();
            return;
        }
    }

    public final void b()
    {
        b.e();
    }

    public final void b(Throwable throwable)
    {
        b.a(throwable);
    }
}
