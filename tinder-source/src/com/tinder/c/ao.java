// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.content.Context;
import android.view.View;

// Referenced classes of package com.tinder.c:
//            f

public final class ao extends f
{
    public static interface a
    {

        public abstract void a();
    }


    public ao(Context context, a a1)
    {
        super(context, 0x7f060246, 0x7f060238);
        b(0x7f060095, new android.view.View.OnClickListener(a1) {

            final a a;
            final ao b;

            public final void onClick(View view)
            {
                a.a();
                b.dismiss();
            }

            
            {
                b = ao.this;
                a = a1;
                super();
            }
        });
    }
}
