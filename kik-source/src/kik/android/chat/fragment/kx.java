// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

// Referenced classes of package kik.android.chat.fragment:
//            KikDefaultContactsListFragment

final class kx
    implements android.widget.TextView.OnEditorActionListener
{

    final KikDefaultContactsListFragment a;

    kx(KikDefaultContactsListFragment kikdefaultcontactslistfragment)
    {
        a = kikdefaultcontactslistfragment;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 2 || i == 6 || keyevent != null && keyevent.getKeyCode() == 66)
        {
            ((InputMethodManager)a.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(textview.getWindowToken(), 0);
            return true;
        } else
        {
            return false;
        }
    }
}
