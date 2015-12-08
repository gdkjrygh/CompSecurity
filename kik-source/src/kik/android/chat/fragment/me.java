// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package kik.android.chat.fragment:
//            KikLoginFragment

final class me
    implements android.widget.TextView.OnEditorActionListener
{

    final KikLoginFragment a;

    me(KikLoginFragment kikloginfragment)
    {
        a = kikloginfragment;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 2)
        {
            KikLoginFragment.c(a);
            return true;
        } else
        {
            return false;
        }
    }
}
