// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.View;
import dn;
import ep;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateBase

class this._cls0
    implements dn
{

    final ActionBarActivityDelegateBase this$0;

    public ep onApplyWindowInsets(View view, ep ep1)
    {
        int i = ep1.b();
        int j = ActionBarActivityDelegateBase.access$300(ActionBarActivityDelegateBase.this, i);
        view = ep1;
        if (i != j)
        {
            view = ep1.a(ep1.a(), j, ep1.c(), ep1.d());
        }
        return view;
    }

    ()
    {
        this$0 = ActionBarActivityDelegateBase.this;
        super();
    }
}
