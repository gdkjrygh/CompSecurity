// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//            TabLayout

class this._cls0
    implements android.view.Listener
{

    final TabLayout this$0;

    public void onClick(View view)
    {
        ((bView)view).getTab().select();
    }

    b()
    {
        this$0 = TabLayout.this;
        super();
    }
}
