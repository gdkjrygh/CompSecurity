// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class dj
    implements android.widget.TextView.OnEditorActionListener
{

    final KikChatFragment a;

    dj(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 4 || keyevent != null && keyevent.getKeyCode() == 66)
        {
            KikChatFragment.X(a);
            KikChatFragment.Y(a);
            return true;
        } else
        {
            return false;
        }
    }
}
