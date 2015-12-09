// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.a.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package net.a.a:
//            c, a

class ject
    implements android.view..OnClickListener
{

    final int a;
    final ImageView b;
    final TextView c;
    final c d;

    public void onClick(View view)
    {
        int i = d.b(a);
        if (d.l != null)
        {
            d.l.a(d, i, a, b, c);
        }
        if (!d.a(i).d())
        {
            d.n = true;
            d.a(0L);
        }
    }

    et.TextView(c c1, int i, ImageView imageview, TextView textview)
    {
        d = c1;
        a = i;
        b = imageview;
        c = textview;
        super();
    }
}
