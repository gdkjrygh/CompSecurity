// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.view.View;
import android.widget.Toast;

// Referenced classes of package com.skype.android.media:
//            LoopbackActivity, CamcorderView

final class a
    implements android.view.r
{

    final LoopbackActivity a;

    public final void onClick(View view)
    {
        if (LoopbackActivity.b(a))
        {
            LoopbackActivity.a(a).c();
            LoopbackActivity.a(a, false);
            Toast.makeText(view.getContext(), "Stopped recording", 0).show();
            return;
        } else
        {
            LoopbackActivity.a(a).b();
            Toast.makeText(view.getContext(), "Recording", 0).show();
            LoopbackActivity.a(a, true);
            return;
        }
    }

    (LoopbackActivity loopbackactivity)
    {
        a = loopbackactivity;
        super();
    }
}
