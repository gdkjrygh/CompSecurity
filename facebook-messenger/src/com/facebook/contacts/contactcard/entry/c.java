// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard.entry;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.facebook.contacts.contactcard.entry:
//            b, e

class c
    implements android.widget.TextView.OnEditorActionListener
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            if (b.a(a) != null)
            {
                b.a(a).a();
            }
            return true;
        } else
        {
            return false;
        }
    }
}
