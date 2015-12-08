// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            ab, ae

final class ac
    implements android.widget.TextView.OnEditorActionListener
{

    final ab a;

    ac(ab ab1)
    {
        a = ab1;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 3)
        {
            if (ab.a(a) != null)
            {
                ab.a(a).a();
            }
            a.c();
            return true;
        } else
        {
            return false;
        }
    }
}
