// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.content.Context;
import android.view.View;
import android.view.Window;

// Referenced classes of package com.tinder.c:
//            f

public final class r extends f
{
    public static interface a
    {

        public abstract void b();

        public abstract void x_();
    }


    public r(Context context, a a1)
    {
        super(context, 0x7f06016f, 0x7f060170);
        getWindow().getAttributes().windowAnimations = 0x7f0b01df;
        a(0x7f060074, new android.view.View.OnClickListener(a1) {

            final a a;
            final r b;

            public final void onClick(View view)
            {
                a.x_();
                b.dismiss();
            }

            
            {
                b = r.this;
                a = a1;
                super();
            }
        });
        b(0x7f060150, new android.view.View.OnClickListener(a1) {

            final a a;
            final r b;

            public final void onClick(View view)
            {
                a.b();
                b.dismiss();
            }

            
            {
                b = r.this;
                a = a1;
                super();
            }
        });
    }
}
