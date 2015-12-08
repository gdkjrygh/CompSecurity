// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import android.content.Context;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.skype.android.video.ControlUnit;

// Referenced classes of package com.skype.android.calling:
//            CallView

final class  extends OrientationEventListener
{

    final CallView a;

    public final void onOrientationChanged(int i)
    {
        i = CallView.a(a).getDefaultDisplay().getRotation();
        if (i != CallView.b(a))
        {
            CallView.a(a, i);
            CallView.c(a);
            ControlUnit.sendControlCommand(2, 0, CallView.b(a) * 90, 0);
        }
    }

    (CallView callview, Context context)
    {
        a = callview;
        super(context, 2);
    }
}
