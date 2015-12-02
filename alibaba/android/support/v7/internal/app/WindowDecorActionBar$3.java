// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;
import eo;

// Referenced classes of package android.support.v7.internal.app:
//            WindowDecorActionBar

class this._cls0
    implements eo
{

    final WindowDecorActionBar this$0;

    public void onAnimationUpdate(View view)
    {
        ((View)WindowDecorActionBar.access$200(WindowDecorActionBar.this).getParent()).invalidate();
    }

    ()
    {
        this$0 = WindowDecorActionBar.this;
        super();
    }
}
