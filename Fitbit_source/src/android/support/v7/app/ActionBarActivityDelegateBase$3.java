// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.graphics.Rect;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateBase

class this._cls0
    implements android.support.v7.internal.widget.indowsListener
{

    final ActionBarActivityDelegateBase this$0;

    public void onFitSystemWindows(Rect rect)
    {
        rect.top = ActionBarActivityDelegateBase.access$300(ActionBarActivityDelegateBase.this, rect.top);
    }

    OnFitSystemWindowsListener()
    {
        this$0 = ActionBarActivityDelegateBase.this;
        super();
    }
}
