// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package kik.android.chat.fragment:
//            KikMultiselectContactsListFragment

final class nb
    implements android.widget.TextView.OnEditorActionListener
{

    final KikMultiselectContactsListFragment a;

    nb(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment)
    {
        a = kikmultiselectcontactslistfragment;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 2 || i == 6 || keyevent != null && keyevent.getKeyCode() == 66 && !a.M)
        {
            a.b(textview);
            return true;
        } else
        {
            a.M = false;
            return false;
        }
    }
}
