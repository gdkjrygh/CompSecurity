// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import com.kik.android.a;

// Referenced classes of package kik.android.chat.fragment:
//            KikDisplayOnlyChatInfoFragment

final class lc
    implements android.view.View.OnClickListener
{

    final KikDisplayOnlyChatInfoFragment a;

    lc(KikDisplayOnlyChatInfoFragment kikdisplayonlychatinfofragment)
    {
        a = kikdisplayonlychatinfofragment;
        super();
    }

    public final void onClick(View view)
    {
        kik.android.chat.fragment.KikDisplayOnlyChatInfoFragment.a(a);
        a.o.b("Joined Public Group").b();
    }
}
