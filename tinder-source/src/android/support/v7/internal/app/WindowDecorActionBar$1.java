// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v4.view.ak;
import android.support.v4.view.x;
import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.internal.app:
//            WindowDecorActionBar

class this._cls0 extends ak
{

    final WindowDecorActionBar this$0;

    public void onAnimationEnd(View view)
    {
        if (WindowDecorActionBar.access$000(WindowDecorActionBar.this) && WindowDecorActionBar.access$100(WindowDecorActionBar.this) != null)
        {
            x.b(WindowDecorActionBar.access$100(WindowDecorActionBar.this), 0.0F);
            x.b(WindowDecorActionBar.access$200(WindowDecorActionBar.this), 0.0F);
        }
        WindowDecorActionBar.access$200(WindowDecorActionBar.this).setVisibility(8);
        WindowDecorActionBar.access$200(WindowDecorActionBar.this).setTransitioning(false);
        WindowDecorActionBar.access$302(WindowDecorActionBar.this, null);
        completeDeferredDestroyActionMode();
        if (WindowDecorActionBar.access$400(WindowDecorActionBar.this) != null)
        {
            x.w(WindowDecorActionBar.access$400(WindowDecorActionBar.this));
        }
    }

    ()
    {
        this$0 = WindowDecorActionBar.this;
        super();
    }
}
