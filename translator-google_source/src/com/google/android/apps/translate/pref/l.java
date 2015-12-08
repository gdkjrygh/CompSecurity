// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.view.View;
import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.e.n;
import com.google.android.libraries.translate.e.p;

// Referenced classes of package com.google.android.apps.translate.pref:
//            i

final class l
    implements android.view.View.OnClickListener
{

    final i a;

    l(i j)
    {
        a = j;
        super();
    }

    public final void onClick(View view)
    {
        view = n.a(i.a(a), r.msg_waiting_for_core_pkg_summary_1, new int[] {
            r.msg_waiting_for_core_pkg_summary_2
        });
        p.a(i.a(a), view).setPositiveButton(r.label_ok, null).show();
    }
}
