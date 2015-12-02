// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.view.View;

// Referenced classes of package com.facebook.auth.login:
//            GenericLoginApprovalViewGroup

class af
    implements android.view.View.OnClickListener
{

    final GenericLoginApprovalViewGroup a;

    af(GenericLoginApprovalViewGroup genericloginapprovalviewgroup)
    {
        a = genericloginapprovalviewgroup;
        super();
    }

    public void onClick(View view)
    {
        GenericLoginApprovalViewGroup.access$000(a);
    }
}
