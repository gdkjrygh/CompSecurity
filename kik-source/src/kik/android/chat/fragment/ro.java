// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import java.util.List;
import kik.a.d.z;

// Referenced classes of package kik.android.chat.fragment:
//            rl

final class ro
    implements android.view.View.OnClickListener
{

    final int a;
    final rl b;

    ro(rl rl1, int i)
    {
        b = rl1;
        a = i;
        super();
    }

    public final void onClick(View view)
    {
        rl.a(b).a(((z)rl.b(b).get(a)).a());
    }
}
