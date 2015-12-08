// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.am;
import android.support.v4.view.s;
import android.support.v4.view.x;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

class this._cls0
    implements s
{

    final AppCompatDelegateImplV7 this$0;

    public am onApplyWindowInsets(View view, am am1)
    {
        int i = am1.b();
        int j = AppCompatDelegateImplV7.access$300(AppCompatDelegateImplV7.this, i);
        am am2 = am1;
        if (i != j)
        {
            am2 = am1.a(am1.a(), j, am1.c(), am1.d());
        }
        return x.a(view, am2);
    }

    ()
    {
        this$0 = AppCompatDelegateImplV7.this;
        super();
    }
}
