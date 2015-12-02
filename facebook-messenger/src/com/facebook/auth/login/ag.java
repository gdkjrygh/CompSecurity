// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.facebook.auth.login:
//            GenericLoginApprovalViewGroup

class ag
    implements android.widget.TextView.OnEditorActionListener
{

    final GenericLoginApprovalViewGroup a;

    ag(GenericLoginApprovalViewGroup genericloginapprovalviewgroup)
    {
        a = genericloginapprovalviewgroup;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 2)
        {
            GenericLoginApprovalViewGroup.access$000(a);
            return true;
        } else
        {
            return false;
        }
    }
}
