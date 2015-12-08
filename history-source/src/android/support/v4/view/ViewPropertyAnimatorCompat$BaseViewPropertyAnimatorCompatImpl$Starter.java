// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat

class <init>
    implements Runnable
{

    WeakReference mViewRef;
    ViewPropertyAnimatorCompat mVpa;
    final mViewRef this$0;

    public void run()
    {
        _mth00(this._cls0.this, mVpa, (View)mViewRef.get());
    }

    private (ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        this$0 = this._cls0.this;
        super();
        mViewRef = new WeakReference(view);
        mVpa = viewpropertyanimatorcompat;
    }

    mVpa(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, mVpa mvpa1)
    {
        this(viewpropertyanimatorcompat, view);
    }
}
