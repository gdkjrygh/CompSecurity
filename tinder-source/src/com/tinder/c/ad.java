// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.content.Context;
import android.view.View;
import com.tinder.e.j;

// Referenced classes of package com.tinder.c:
//            f

public final class ad extends f
{

    private j a;

    public ad(Context context, j j)
    {
        super(context, 0x7f0600e8, 0x7f0600e7);
        a = j;
        a(0x7f060141, new android.view.View.OnClickListener() {

            final ad a;

            public final void onClick(View view)
            {
                ad.a(a).b();
                a.dismiss();
            }

            
            {
                a = ad.this;
                super();
            }
        });
        b(0x7f060150, new android.view.View.OnClickListener(j) {

            final j a;
            final ad b;

            public final void onClick(View view)
            {
                a.a();
                b.dismiss();
            }

            
            {
                b = ad.this;
                a = j1;
                super();
            }
        });
    }

    static j a(ad ad1)
    {
        return ad1.a;
    }
}
