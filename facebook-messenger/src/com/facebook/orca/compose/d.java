// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.view.View;
import com.facebook.orca.d.af;

// Referenced classes of package com.facebook.orca.compose:
//            AudioComposerView, g

class d
    implements android.view.View.OnClickListener
{

    final AudioComposerView a;

    d(AudioComposerView audiocomposerview)
    {
        a = audiocomposerview;
        super();
    }

    public void onClick(View view)
    {
        AudioComposerView.d(a).b();
        if (AudioComposerView.i(a) != null)
        {
            AudioComposerView.i(a).a();
        }
    }
}
