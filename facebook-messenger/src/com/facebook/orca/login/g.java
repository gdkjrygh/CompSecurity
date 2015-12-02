// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.facebook.orca.login:
//            WildfireRegNameViewGroup

class g
    implements android.widget.TextView.OnEditorActionListener
{

    final WildfireRegNameViewGroup a;

    g(WildfireRegNameViewGroup wildfireregnameviewgroup)
    {
        a = wildfireregnameviewgroup;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 2)
        {
            WildfireRegNameViewGroup.access$000(a);
            return true;
        } else
        {
            return false;
        }
    }
}
