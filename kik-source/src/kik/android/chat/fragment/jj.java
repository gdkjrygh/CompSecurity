// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.EditText;

// Referenced classes of package kik.android.chat.fragment:
//            ji, KikContactsListFragment

final class jj
    implements Runnable
{

    final ji a;

    jj(ji ji1)
    {
        a = ji1;
        super();
    }

    public final void run()
    {
        if (a.a.getActivity() != null)
        {
            a.a.d("");
            a.a.s.setText(a.a.b);
            a.a.a(a.a.b, true);
        }
        a.a.a(null);
    }
}
