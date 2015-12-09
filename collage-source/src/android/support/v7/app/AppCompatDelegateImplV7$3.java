// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.graphics.Rect;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

class this._cls0
    implements android.support.v7.widget.ystemWindowsListener
{

    final AppCompatDelegateImplV7 this$0;

    public void onFitSystemWindows(Rect rect)
    {
        rect.top = AppCompatDelegateImplV7.access$300(AppCompatDelegateImplV7.this, rect.top);
    }

    itSystemWindowsListener()
    {
        this$0 = AppCompatDelegateImplV7.this;
        super();
    }
}
