// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.view.View;

// Referenced classes of package com.facebook.auth.login:
//            GenericPasswordCredentialsViewGroup

class ai
    implements android.view.View.OnClickListener
{

    final GenericPasswordCredentialsViewGroup a;

    ai(GenericPasswordCredentialsViewGroup genericpasswordcredentialsviewgroup)
    {
        a = genericpasswordcredentialsviewgroup;
        super();
    }

    public void onClick(View view)
    {
        GenericPasswordCredentialsViewGroup.access$100(a);
    }
}
