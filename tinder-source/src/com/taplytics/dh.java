// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.ViewGroup;
import android.widget.TextView;

// Referenced classes of package com.taplytics:
//            cv, gs

final class dh
    implements Runnable
{

    final int a;
    final cv b;

    dh(cv cv1, int i)
    {
        b = cv1;
        a = i;
        super();
    }

    public final void run()
    {
        try
        {
            TextView textview = (TextView)cv.d(b).findViewById(0x17ccbc33);
            TextView textview1 = (TextView)cv.d(b).findViewById(0x17ccbc34);
            textview.setText((new StringBuilder("Connection lost. Reconnect attempt: ")).append(String.valueOf(a)).toString());
            if (a > 6)
            {
                textview1.setText("Try reloading the app.");
            }
            return;
        }
        catch (Exception exception)
        {
            gs.b("Error updating text", exception);
        }
    }
}
