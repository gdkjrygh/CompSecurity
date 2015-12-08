// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.application;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

// Referenced classes of package com.pinterest.kit.application:
//            CommonApplication

final class val.length
    implements Runnable
{

    final int val$length;
    final String val$string;

    public final void run()
    {
        View view = LayoutInflater.from(CommonApplication.context()).inflate(0x7f030205, null);
        ((TextView)view.findViewById(0x7f0f0077)).setText(val$string);
        ((TextView)view.findViewById(0x7f0f0077)).setTypeface(Typeface.MONOSPACE);
        Toast toast = new Toast(CommonApplication.context());
        toast.setView(view);
        toast.setGravity(81, 0, 0);
        toast.setDuration(val$length);
        toast.show();
    }

    on()
    {
        val$string = s;
        val$length = i;
        super();
    }
}
