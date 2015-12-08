// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.content.Context;
import android.view.View;

// Referenced classes of package com.tinder.c:
//            f

public final class e extends f
{

    public e(Context context)
    {
        super(context, 0x7f060099, 0x7f060098);
        c(0x7f0600d3, new android.view.View.OnClickListener() {

            final e a;

            public final void onClick(View view)
            {
                a.dismiss();
            }

            
            {
                a = e.this;
                super();
            }
        });
    }
}
