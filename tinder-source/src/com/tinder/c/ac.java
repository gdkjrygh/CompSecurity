// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.content.Context;
import android.view.View;

// Referenced classes of package com.tinder.c:
//            f

public final class ac extends f
{
    public static interface a
    {

        public abstract void a();
    }


    a a;

    public ac(Context context, a a1)
    {
        super(context, 0x7f0600de, 0x7f0600dd);
        a = a1;
        a(0x7f060074, new android.view.View.OnClickListener() {

            final ac a;

            public final void onClick(View view)
            {
                a.dismiss();
            }

            
            {
                a = ac.this;
                super();
            }
        });
        b(0x7f060150, new android.view.View.OnClickListener() {

            final ac a;

            public final void onClick(View view)
            {
                a.a.a();
                a.dismiss();
            }

            
            {
                a = ac.this;
                super();
            }
        });
    }
}
