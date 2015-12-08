// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.view.View;

// Referenced classes of package com.facebook:
//            FacebookButtonBase

class this._cls0
    implements android.view.this._cls0
{

    final FacebookButtonBase this$0;

    public void onClick(View view)
    {
        if (FacebookButtonBase.access$000(FacebookButtonBase.this) != null)
        {
            FacebookButtonBase.access$000(FacebookButtonBase.this).onClick(view);
        } else
        if (FacebookButtonBase.access$100(FacebookButtonBase.this) != null)
        {
            FacebookButtonBase.access$100(FacebookButtonBase.this).onClick(view);
            return;
        }
    }

    ()
    {
        this$0 = FacebookButtonBase.this;
        super();
    }
}
