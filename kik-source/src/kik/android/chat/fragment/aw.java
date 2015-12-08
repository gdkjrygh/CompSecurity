// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import kik.a.d.k;
import kik.android.util.ao;

// Referenced classes of package kik.android.chat.fragment:
//            at

final class aw
    implements android.view.View.OnClickListener
{

    final k a;
    final at b;

    aw(at at1, k k)
    {
        b = at1;
        a = k;
        super();
    }

    public final void onClick(View view)
    {
        at.a(b).a(a);
    }
}
