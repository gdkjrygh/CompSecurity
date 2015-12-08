// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.text.Editable;
import java.util.TimerTask;

// Referenced classes of package kik.android.chat.fragment:
//            pa, KikRegistrationFragment

final class pb extends TimerTask
{

    final Editable a;
    final pa b;

    pb(pa pa1, Editable editable)
    {
        b = pa1;
        a = editable;
        super();
    }

    public final void run()
    {
        KikRegistrationFragment.a(b.a, a.toString());
    }
}
