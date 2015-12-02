// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.facebook.auth.login:
//            GenericPasswordCredentialsViewGroup

class ak
    implements android.widget.TextView.OnEditorActionListener
{

    final GenericPasswordCredentialsViewGroup a;

    ak(GenericPasswordCredentialsViewGroup genericpasswordcredentialsviewgroup)
    {
        a = genericpasswordcredentialsviewgroup;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 2)
        {
            GenericPasswordCredentialsViewGroup.access$100(a);
            return true;
        } else
        {
            return false;
        }
    }
}
