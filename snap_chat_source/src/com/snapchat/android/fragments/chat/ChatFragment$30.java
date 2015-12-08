// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class a
    implements android.widget.rActionListener
{

    private ChatFragment a;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 4 || keyevent != null && keyevent.getKeyCode() == 66)
        {
            ChatFragment.m(a);
            return true;
        } else
        {
            return false;
        }
    }

    _cls9(ChatFragment chatfragment)
    {
        a = chatfragment;
        super();
    }
}
