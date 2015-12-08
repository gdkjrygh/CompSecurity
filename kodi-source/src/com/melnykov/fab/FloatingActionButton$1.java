// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.melnykov.fab;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

// Referenced classes of package com.melnykov.fab:
//            FloatingActionButton

class this._cls0 extends ViewOutlineProvider
{

    final FloatingActionButton this$0;

    public void getOutline(View view, Outline outline)
    {
        view = FloatingActionButton.this;
        int i;
        if (FloatingActionButton.access$000(FloatingActionButton.this) == 0)
        {
            i = ;
        } else
        {
            i = ;
        }
        i = FloatingActionButton.access$100(view, i);
        outline.setOval(0, 0, i, i);
    }

    ()
    {
        this$0 = FloatingActionButton.this;
        super();
    }
}
