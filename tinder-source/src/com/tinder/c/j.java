// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.content.Context;
import android.view.View;

// Referenced classes of package com.tinder.c:
//            f

public final class j extends f
{

    public j(Context context)
    {
        super(context, 0x7f06011f, 0x7f0600bb);
        c(0x7f06006b, new android.view.View.OnClickListener() {

            final j a;

            public final void onClick(View view)
            {
                a.dismiss();
            }

            
            {
                a = j.this;
                super();
            }
        });
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }
}
