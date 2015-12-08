// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.content.Context;
import android.view.View;
import com.tinder.d.c;

// Referenced classes of package com.tinder.c:
//            f

public final class ab extends f
{

    c a;

    public ab(Context context, c c)
    {
        super(context, 0x7f0600e2, 0x7f0600e1);
        a = c;
        a(0x7f060074, new android.view.View.OnClickListener() {

            final ab a;

            public final void onClick(View view)
            {
                a.dismiss();
            }

            
            {
                a = ab.this;
                super();
            }
        });
        b(0x7f0601bd, new android.view.View.OnClickListener() {

            final ab a;

            public final void onClick(View view)
            {
                a.a.b(4);
                a.dismiss();
            }

            
            {
                a = ab.this;
                super();
            }
        });
    }
}
