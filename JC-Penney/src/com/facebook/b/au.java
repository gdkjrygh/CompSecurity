// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.view.View;

// Referenced classes of package com.facebook.b:
//            as

class au
    implements android.view.View.OnClickListener
{

    final as a;

    au(as as1)
    {
        a = as1;
        super();
    }

    public void onClick(View view)
    {
        a.cancel();
    }
}
