// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;


// Referenced classes of package com.skype.android.app:
//            ActionBarCustomizer

final class this._cls0
    implements android.view.balLayoutListener
{

    final ActionBarCustomizer this$0;

    public final void onGlobalLayout()
    {
        adjustCustomViewPadding();
    }

    Listener()
    {
        this$0 = ActionBarCustomizer.this;
        super();
    }
}
