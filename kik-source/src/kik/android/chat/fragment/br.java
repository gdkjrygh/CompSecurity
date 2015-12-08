// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package kik.android.chat.fragment:
//            KikChangeGroupNameFragment

final class br
    implements android.widget.TextView.OnEditorActionListener
{

    final KikChangeGroupNameFragment a;

    br(KikChangeGroupNameFragment kikchangegroupnamefragment)
    {
        a = kikchangegroupnamefragment;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 2 || keyevent.getKeyCode() == 66)
        {
            KikChangeGroupNameFragment.a(a);
        }
        return true;
    }
}
