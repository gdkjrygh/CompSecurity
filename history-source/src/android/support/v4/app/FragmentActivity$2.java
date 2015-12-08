// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v4.app:
//            FragmentContainer, FragmentActivity

class this._cls0
    implements FragmentContainer
{

    final FragmentActivity this$0;

    public View findViewById(int i)
    {
        return FragmentActivity.this.findViewById(i);
    }

    public boolean hasView()
    {
        Window window = getWindow();
        return window != null && window.peekDecorView() != null;
    }

    ()
    {
        this$0 = FragmentActivity.this;
        super();
    }
}
