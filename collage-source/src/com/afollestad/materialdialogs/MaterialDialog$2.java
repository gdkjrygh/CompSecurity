// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs;

import android.widget.TextView;
import java.text.NumberFormat;

// Referenced classes of package com.afollestad.materialdialogs:
//            f

class 
    implements Runnable
{

    final f a;

    public void run()
    {
        if (a.i != null)
        {
            a.i.setText(a.b.a.format((float)a.g() / (float)a.h()));
        }
        if (a.j != null)
        {
            a.j.setText(String.format(a.b.a, new Object[] {
                Integer.valueOf(a.g()), Integer.valueOf(a.h())
            }));
        }
    }
}
