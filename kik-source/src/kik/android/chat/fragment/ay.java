// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.EditText;

// Referenced classes of package kik.android.chat.fragment:
//            KikAddContactFragment

final class ay
    implements Runnable
{

    final String a;
    final String b;
    final KikAddContactFragment c;

    ay(KikAddContactFragment kikaddcontactfragment, String s, String s1)
    {
        c = kikaddcontactfragment;
        a = s;
        b = s1;
        super();
    }

    public final void run()
    {
        KikAddContactFragment.a(c).setText(a);
        KikAddContactFragment.a(c).setSelection(a.length());
        KikAddContactFragment.a(c, b);
    }
}
