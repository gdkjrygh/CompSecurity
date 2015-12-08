// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.content.Context;
import android.view.View;

// Referenced classes of package com.tinder.c:
//            f

public final class b extends f
{
    public static interface a
    {

        public abstract void b();
    }


    public b(Context context, a a1)
    {
        super(context, 0x7f06006a, 0x7f060103);
        b(0x7f060102, new android.view.View.OnClickListener(a1) {

            final a a;
            final b b;

            public final void onClick(View view)
            {
                a.b();
                b.dismiss();
            }

            
            {
                b = b.this;
                a = a1;
                super();
            }
        });
    }
}
