// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.content.Context;
import android.view.View;

// Referenced classes of package com.tinder.c:
//            f

public final class c extends f
{

    public c(Context context)
    {
        super(context, 0x7f0600db, 0x7f0600da);
        a(0x7f060150, new android.view.View.OnClickListener() {

            final c a;

            public final void onClick(View view)
            {
                a.dismiss();
            }

            
            {
                a = c.this;
                super();
            }
        });
    }
}
