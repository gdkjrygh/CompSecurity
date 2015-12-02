// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.facebook.orca.login:
//            WildfireRegSmsCodeViewGroup

class t
    implements android.widget.TextView.OnEditorActionListener
{

    final WildfireRegSmsCodeViewGroup a;

    t(WildfireRegSmsCodeViewGroup wildfireregsmscodeviewgroup)
    {
        a = wildfireregsmscodeviewgroup;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 2)
        {
            WildfireRegSmsCodeViewGroup.access$100(a);
            return true;
        } else
        {
            return false;
        }
    }
}
