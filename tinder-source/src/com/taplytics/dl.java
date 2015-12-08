// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.os.Handler;
import android.widget.TextView;

// Referenced classes of package com.taplytics:
//            dk, dj, cv

final class dl
    implements Runnable
{

    final dk a;

    dl(dk dk1)
    {
        a = dk1;
        super();
    }

    public final void run()
    {
        if (cv.n(a.f.a))
        {
            if (a.a.getText().length() > 5)
            {
                a.a.setText("");
            }
            a.a.append(".");
            a.b.postDelayed(this, 100L);
        }
    }
}
